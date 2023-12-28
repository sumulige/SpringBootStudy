package com.example.springbootstudy.picture;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageGenerator {

    public static void main(String[] args) {
        try {
            // 读取原始图像文件
            BufferedImage originalImage = ImageIO.read(new File("/Users/smlg/IdeaProjects/SpringBootStudy/src/main/resources/Whats-New-in-Spring-6-and-Spring-Boot-3-ByteInject.png"));

            // 创建缩放后的图像对象
            BufferedImage resizedImage = new BufferedImage(1146, 717, BufferedImage.TYPE_INT_RGB);

            // 创建绘图上下文对象并进行绘制
            Graphics2D g = resizedImage.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.drawImage(originalImage, 0, 0, 1146, 717, null);
            g.dispose();

            // 保存生成的图像文件
            ImageIO.write(resizedImage, "jpg", new File("/Users/smlg/IdeaProjects/SpringBootStudy/src/main/resources/image.jpg"));

            System.out.println("Image generated successfully.");
        } catch (IOException e) {
            System.out.println("Error generating image: " + e.getMessage());
        }
    }

}

