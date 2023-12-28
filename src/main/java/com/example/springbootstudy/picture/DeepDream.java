package com.example.springbootstudy.picture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeepDream {

    public static void main(String[] args) {

        String imageFile = "/Users/smlg/IdeaProjects/SpringBootStudy/src/main/resources/CleanShot 2023-02-24 at 17.53.41@2x.png";
        String outputImage = "/Users/smlg/IdeaProjects/SpringBootStudy/src/main/resources/output.jpg";
        String pythonScript = "/path/to/deepdream.py";

        try {
            // Execute the Python script with the specified image file and output file
            String[] cmd = {"python", pythonScript, "--input_image", imageFile, "--output_image", outputImage};
            Process p = Runtime.getRuntime().exec(cmd);

            // Read the output from the Python script
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

