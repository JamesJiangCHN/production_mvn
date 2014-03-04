package cn.com.windit.production.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import cn.com.windit.production.pojo.Dgu2000;
import cn.com.windit.production.pojo.Project;

public class ExExcel {
	public void exExcel(String FileName) {
		Project project = new Project();
		HSSFWorkbook wb = null;
		try {
			wb = new HSSFWorkbook(new FileInputStream(FileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Integer stNum = wb.getNumberOfSheets();
		// 获取第一个工作栏
		HSSFSheet sheet = wb.getSheetAt(0);
		if (sheet.getLastRowNum() + 1 > 32) {
			HSSFRow row = null;
			HSSFCell cell = null;

			// 項目名稱3-19
			row = sheet.getRow(3);
			cell = row.getCell(19);
			project.setProjectName(cell.getStringCellValue());

			// 項目負責人
			row = sheet.getRow(5);
			cell = row.getCell(4);
			project.setPersonInCharge(cell.getStringCellValue());

			// 時間
			row = sheet.getRow(5);
			cell = row.getCell(12);
			if (HSSFDateUtil.isCellDateFormatted(cell)) { // 判断是日期类型
				SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
				Date dt = HSSFDateUtil.getJavaDate(cell.getNumericCellValue());// 获取成DATE类型
				String dateString = dateformat.format(dt);
				project.setDateString(dateString);
				project.setDateTime(dt.getTime());
			}
			// 采集器
			for (int i = 0; i < 18; i++) {
				Dgu2000 dgu2000 = new Dgu2000();
				for (int j = 0; i < 4; j++) {
					// 采集器序列号
					row = sheet.getRow(i + 11);
					cell = row.getCell(6 * j + 2);
					String ser = cell.getStringCellValue();

					// 采集器Id
					cell = row.getCell(6 * j + 5);
					dgu2000.setId(cell.getStringCellValue());
				}
			}

			for (int i = 0; i < sheet.getLastRowNum() + 1; i++) {

				// 行
				row = sheet.getRow(i);
				if (row != null) {
					Integer cellNum = row.getLastCellNum() + 1;
					for (int k = 0; k < cellNum; k++) {

						// 列
						cell = row.getCell(k);
						if (cell != null) {
							int cellType = cell.getCellType();
							switch (cellType) {
							case HSSFCell.CELL_TYPE_STRING:
								String cellValue = cell.getStringCellValue();
								System.out.println(i + "-" + k + ":"
										+ cellValue);
								break;
							case HSSFCell.CELL_TYPE_NUMERIC:
								if (HSSFDateUtil.isCellDateFormatted(cell)) { // 判断是日期类型
									SimpleDateFormat dateformat = new SimpleDateFormat(
											"yyyy-MM-dd");
									Date dt = HSSFDateUtil.getJavaDate(cell
											.getNumericCellValue());// 获取成DATE类型
									String dateString = dateformat.format(dt);
									System.out.println(i + "-" + k + ":"
											+ dateString);
								} else {
									Double number = cell.getNumericCellValue();
									System.out.println(i + "-" + k + ":"
											+ number);
								}
								break;
							default:
								String cellValue1 = cell.getStringCellValue();
								System.out.println(i + "-" + k + ":"
										+ cellValue1);
							}
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		ExExcel exExcel = new ExExcel();
		exExcel.exExcel("E://大唐黑龙江集贤坪碾子山风场二期.xls");
	}
}
