package com.shmily.excelreader;

import com.shmily.excelreader.beans.ExcelBaseVO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcelReaderApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExcelReaderApplication.class, args);
        ExcelBaseVO e = new ExcelBaseVO();
        e.getAttribute("111");
    }

}
