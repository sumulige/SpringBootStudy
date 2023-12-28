package com.example.springbootstudy.picture;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MosaicRemoval {
    public static void main(String[] args) {
        try {
            // 读取需要处理的图片
            File input = new File("/Users/smlg/IdeaProjects/SpringBootStudy/src/main/resources/CleanShot 2023-02-24 at 17.53.41@2x.png");
            BufferedImage image = ImageIO.read(input);
            int width = image.getWidth();
            int height = image.getHeight();

            // 定义马赛克区域的大小
            int tileSize = 10;

            // 对每个像素进行处理
            for (int y = 0; y < height; y += tileSize) {
                for (int x = 0; x < width; x += tileSize) {
                    int tileX = Math.min(x + tileSize, width) - x;
                    int tileY = Math.min(y + tileSize, height) - y;

                    // 计算当前马赛克块的平均颜色
                    int totalRed = 0, totalGreen = 0, totalBlue = 0, totalAlpha = 0;
                    for (int tilePixelY = 0; tilePixelY < tileY; tilePixelY++) {
                        for (int tilePixelX = 0; tilePixelX < tileX; tilePixelX++) {
                            int pixel = image.getRGB(x + tilePixelX, y + tilePixelY);
                            totalRed += (pixel >> 16) & 0xff;
                            totalGreen += (pixel >> 8) & 0xff;
                            totalBlue += pixel & 0xff;
                            totalAlpha += pixel >>> 24;
                        }
                    }
                    int tileArea = tileX * tileY;
                    int averageRed = totalRed / tileArea;
                    int averageGreen = totalGreen / tileArea;
                    int averageBlue = totalBlue / tileArea;
                    int averageAlpha = totalAlpha / tileArea;

                    // 替换当前马赛克块内的像素
                    for (int tilePixelY = 0; tilePixelY < tileY; tilePixelY++) {
                        for (int tilePixelX = 0; tilePixelX < tileX; tilePixelX++) {
                            int pixel = (averageAlpha << 24) | (averageRed << 16) | (averageGreen << 8) | averageBlue;
                            image.setRGB(x + tilePixelX, y + tilePixelY, pixel);
                        }
                    }
                }
            }

            // 保存处理后的图片
            File output = new File("/Users/smlg/IdeaProjects/SpringBootStudy/src/main/resources/output.png");
            ImageIO.write(image, "png", output);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

