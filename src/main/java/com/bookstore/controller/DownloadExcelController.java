package com.bookstore.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DownloadExcelController {
	
	@RequestMapping("/excel")
	public String home()
	{
		return "excel";
	}
	
	@RequestMapping("/downloadExcel")
	public void DownloadExcel(HttpServletRequest request, HttpServletResponse response) {
		// create a Excel file on the fly
		// Create a Workbook
		Workbook workbook = new XSSFWorkbook();
		// Create a Sheet
		Sheet sheet = workbook.createSheet("Sheet1");
		// Create a Header Row
		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("RequestID");
		headerRow.createCell(1).setCellValue("Time Spent");

		// Create Data Rows
		for (int i = 1; i < 6; i++) {
			// Creating cells
			Row currentRow = sheet.createRow(i);
			currentRow.createCell(0).setCellValue(String.valueOf((10000 + i)));
			currentRow.createCell(1).setCellValue("0" + i + ":00");
		}

		// write to response
		try {
			response.setContentType("application/excel");
			response.setHeader("Content-disposition", "attachment; filename=" + "poi-generated-file.xlsx");
			workbook.write(response.getOutputStream());
			workbook.close();
			response.getOutputStream().flush();
		} catch (IOException e) {
			System.out.println("write to response failed");
			e.printStackTrace();
		}
	}
}
