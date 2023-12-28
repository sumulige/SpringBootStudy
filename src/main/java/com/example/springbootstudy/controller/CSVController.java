package com.example.springbootstudy.controller;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

@RestController
public class CSVController {

    @PostMapping("/batchReplaceHeader")
    public String batchReplaceHeaderInCSV(@RequestParam("directoryPath") String directoryPath) {
        try {
            // 获取目录下的所有.csv文件
            File directory = new File(directoryPath);
            File[] csvFiles = directory.listFiles((dir, name) -> name.endsWith(".csv"));

            // 遍历处理每个.csv文件
            for (File csvFile : csvFiles) {
                FileReader fileReader = new FileReader(csvFile);
                CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build(); // 跳过表头行
                List<String[]> csvData = csvReader.readAll();
                csvReader.close();

                // 替换表头
                for (String[] row : csvData) {
                    // 假设表头在第一行，将表头的相关字段替换为新的表头内容
                    for (int i = 0; i < row.length; i++) {
                        if (row[i].equals("旧表头字段1")) {
                            row[i] = "新表头字段1";
                        } else if (row[i].equals("旧表头字段2")) {
                            row[i] = "新表头字段2";
                        }
                        // 继续添加其他需要替换的字段
                    }
                }

                // 将替换后的内容写回原文件
                FileWriter fileWriter = new FileWriter(csvFile);
                CSVWriter csvWriter = new CSVWriter(fileWriter);

                // 写入表头
                String[] header = {"新表头字段1", "新表头字段2",};
                csvWriter.writeNext(header);

                // 写入替换后的数据行
                csvWriter.writeAll(csvData);

                csvWriter.close();
                fileWriter.close();
            }

            return "批量表头替换成功！";
        } catch (Exception e) {
            e.printStackTrace();
            return "批量表头替换失败：" + e.getMessage();
        }
    }
}

