package com.example.springbootstudy.picture;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class DeMosaic {

    public static void main(String[] args) {

        // 加载OpenCV库
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // 读取照片
        Mat src = Imgcodecs.imread("input.jpg");

        // 使用DeMosaic算法去除马赛克
        Mat dst = new Mat();
//        Photo.demosaicing(src, dst, Photo.COLOR_BayerRG2RGB);

        // 保存结果
        Imgcodecs.imwrite("output.jpg", dst);
    }
}

