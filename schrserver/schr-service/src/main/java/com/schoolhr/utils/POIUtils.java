package com.schoolhr.utils;

import com.schoolhr.model.Department;
import com.schoolhr.model.Employee;
import com.schoolhr.model.Position;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

import org.springframework.context.support.BeanDefinitionDslKt;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class POIUtils {

    public static ResponseEntity<byte[]> employee2Excel(List<Employee> list) {
        //1. 创建一个 Excel 文档
        HSSFWorkbook workbook = new HSSFWorkbook();
        //2. 创建文档摘要
        workbook.createInformationProperties();
        //3. 获取并配置文档信息
        DocumentSummaryInformation docInfo = workbook.getDocumentSummaryInformation();
        //文档类别
        docInfo.setCategory("员工信息");
        //文档管理员
        docInfo.setManager("admin");
        //设置公司信息
        docInfo.setCompany("com.schoolhr");
        //4. 获取文档摘要信息
        SummaryInformation summInfo = workbook.getSummaryInformation();
        //文档标题
        summInfo.setTitle("员工信息表");
        //文档作者
        summInfo.setAuthor("admin");
        // 文档备注
        summInfo.setComments("本文档仅供学习");
        //5. 创建样式
        //创建标题行的样式
        HSSFCellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.YELLOW.index);
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        HSSFCellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));
        HSSFSheet sheet = workbook.createSheet("员工信息表");
        //设置列的宽度
        sheet.setColumnWidth(0, 5 * 256);
        sheet.setColumnWidth(1, 12 * 256);
        sheet.setColumnWidth(2, 10 * 256);
        sheet.setColumnWidth(3, 5 * 256);
        sheet.setColumnWidth(4, 12 * 256);
        sheet.setColumnWidth(5, 20 * 256);
        sheet.setColumnWidth(6, 10 * 256);
        sheet.setColumnWidth(7, 10 * 256);
        sheet.setColumnWidth(8, 16 * 256);
        sheet.setColumnWidth(9, 12 * 256);
        sheet.setColumnWidth(10, 15 * 256);
        sheet.setColumnWidth(11, 20 * 256);
        sheet.setColumnWidth(12, 16 * 256);
        sheet.setColumnWidth(13, 14 * 256);
        sheet.setColumnWidth(14, 14 * 256);
        sheet.setColumnWidth(15, 12 * 256);
        sheet.setColumnWidth(16, 8 * 256);
        sheet.setColumnWidth(17, 20 * 256);
        sheet.setColumnWidth(18, 20 * 256);
        sheet.setColumnWidth(19, 15 * 256);
        sheet.setColumnWidth(20, 8 * 256);
        sheet.setColumnWidth(21, 25 * 256);
        sheet.setColumnWidth(22, 14 * 256);
        sheet.setColumnWidth(23, 15 * 256);
        sheet.setColumnWidth(24, 15 * 256);
        //6. 创建标题行
        HSSFRow r0 = sheet.createRow(0);
        HSSFCell c0 = r0.createCell(0);
        c0.setCellValue("编号");
        c0.setCellStyle(headerStyle);
        HSSFCell c1 = r0.createCell(1);
        c1.setCellStyle(headerStyle);
        c1.setCellValue("工号");
        HSSFCell c2 = r0.createCell(2);
        c2.setCellStyle(headerStyle);
        c2.setCellValue("姓名");
        HSSFCell c3 = r0.createCell(3);
        c3.setCellStyle(headerStyle);
        c3.setCellValue("性别");
        HSSFCell c4 = r0.createCell(4);
        c4.setCellStyle(headerStyle);
        c4.setCellValue("卡号");
        HSSFCell c5 = r0.createCell(5);
        c5.setCellStyle(headerStyle);
        c5.setCellValue("政治面貌");
        HSSFCell c6 = r0.createCell(6);
        c6.setCellStyle(headerStyle);
        c6.setCellValue("电话号码");
        HSSFCell c7 = r0.createCell(7);
        c7.setCellStyle(headerStyle);
        c7.setCellValue("地址");
        HSSFCell c8 = r0.createCell(8);
        c8.setCellStyle(headerStyle);
        c8.setCellValue("基本薪资");
        HSSFCell c9 = r0.createCell(9);
        c9.setCellStyle(headerStyle);
        c9.setCellValue("工作状态");
        HSSFCell c10 = r0.createCell(10);
        c10.setCellStyle(headerStyle);
        c10.setCellValue("邮箱");
        HSSFCell c11 = r0.createCell(11);
        c11.setCellStyle(headerStyle);
        c11.setCellValue("部门号");
        HSSFCell c12 = r0.createCell(12);
        c12.setCellStyle(headerStyle);
        c12.setCellValue("职称");
        HSSFCell c13 = r0.createCell(13);
        c13.setCellStyle(headerStyle);
        c13.setCellValue("合同年限");
        HSSFCell c14 = r0.createCell(14);
        c14.setCellStyle(headerStyle);
        c14.setCellValue("合同起始日期");
        HSSFCell c15 = r0.createCell(15);
        c15.setCellStyle(headerStyle);
        c15.setCellValue("合同终止日期");
        HSSFCell c16 = r0.createCell(16);
        c16.setCellStyle(headerStyle);
        c16.setCellValue("生日");
        HSSFCell c17 = r0.createCell(17);
        c16.setCellStyle(headerStyle);
        c16.setCellValue("职位号");

        for (int i = 0; i < list.size(); i++) {
            Employee emp = list.get(i);
            HSSFRow row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(emp.getId());
            row.createCell(1).setCellValue(emp.getUserID());
            row.createCell(2).setCellValue(emp.getUsername());
            row.createCell(3).setCellValue(emp.getUserSex());
            row.createCell(4).setCellValue(emp.getIdCard());
            row.createCell(5).setCellValue(emp.getPolitic());
            row.createCell(6).setCellValue(emp.getPhone());
            row.createCell(7).setCellValue(emp.getAddress());
            row.createCell(8).setCellValue(emp.getBasisSalary());
            row.createCell(9).setCellValue(emp.getWorkstatus());
            row.createCell(10).setCellValue(emp.getE_mail());
            row.createCell(11).setCellValue(emp.getDepartmentid());
            row.createCell(12).setCellValue(emp.getJoblevel());
            HSSFCell cell13 = row.createCell(13);
            cell13.setCellStyle(dateCellStyle);
            cell13.setCellValue(emp.getContractTime());
            HSSFCell cell14 = row.createCell(14);
            cell14.setCellStyle(dateCellStyle);
            cell14.setCellValue(emp.getBeginworkDate());
            HSSFCell cell15 = row.createCell(15);
            cell15.setCellStyle(dateCellStyle);
            cell15.setCellValue(emp.getEndworkDate());
            HSSFCell cell16 = row.createCell(16);
            cell16.setCellStyle(dateCellStyle);
            cell16.setCellValue(emp.getBirthday());
            row.createCell(17).setCellValue(emp.getPositionid());

        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.setContentDispositionFormData("attachment", new String("员工表.xls".getBytes("UTF-8"), "ISO-8859-1"));
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            workbook.write(baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<byte[]>(baos.toByteArray(), headers, HttpStatus.CREATED);
    }

    /**
     * Excel 解析成 员工数据集合
     *
     * @param file
     * @param allDepartments
     * @param allPositions
     * @return
     */
    public static List<Employee> excel2Employee(MultipartFile file, List<Department> allDepartments, List<Position> allPositions) {
        List<Employee> list = new ArrayList<>();
        Employee employee = null;
        try {
            //1. 创建一个 workbook 对象
            HSSFWorkbook workbook = new HSSFWorkbook(file.getInputStream());
            //2. 获取 workbook 中表单的数量
            int numberOfSheets = workbook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                //3. 获取表单
                HSSFSheet sheet = workbook.getSheetAt(i);
                //4. 获取表单中的行数
                int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
                for (int j = 0; j < physicalNumberOfRows; j++) {
                    //5. 跳过标题行
                    if (j == 0) {
                        continue;//跳过标题行
                    }
                    //6. 获取行
                    HSSFRow row = sheet.getRow(j);
                    if (row == null) {
                        continue;//防止数据中间有空行
                    }
                    //7. 获取列数
                    int physicalNumberOfCells = row.getPhysicalNumberOfCells();
                    employee = new Employee();
                    for (int k = 0; k < physicalNumberOfCells; k++) {
                        HSSFCell cell = row.getCell(k);
                        switch (cell.getCellType()) {
                            case STRING:
                                String cellValue = cell.getStringCellValue();
                                switch (k) {
                                    case 1:
                                        employee.setUserID(cellValue);
                                        break;
                                    case 2:
                                        employee.setUsername(cellValue);
                                        break;
                                    case 3:
                                        employee.setUserSex(cellValue);
                                        break;
                                    case 4:
                                        employee.setIdCard(cellValue);
                                        break;
                                    case 5:
                                        employee.setPolitic(cellValue);
                                        break;
                                    case 6:
                                        employee.setPhone(cellValue);
                                        break;
                                    case 7:
                                        employee.setAddress(cellValue);
                                        break;
                                    case 8:
                                        employee.setBasisSalary(Integer.valueOf(cellValue));
                                        break;
                                    case 9:
                                        employee.setWorkstatus(cellValue);
                                        break;
                                    case 10:
                                        employee.setE_mail(cellValue);
                                        break;
                                    case 11:
                                        employee.setDepartmentid(cellValue);
                                        break;
                                    case 12:
                                        employee.setJoblevel(cellValue);
                                        break;
                                    case 17:
                                        employee.setPositionid(Integer.valueOf(cellValue));
                                        break;

                                }
                                break;
                            default: {
                                switch (k) {
                                    case 13:
                                        employee.setContractTime(cell.getNumericCellValue());
                                        break;
                                    case 14:
                                        employee.setBeginworkDate(cell.getDateCellValue());
                                        break;
                                    case 15:
                                        employee.setEndworkDate(cell.getDateCellValue());
                                        break;
                                    case 16:
                                        employee.setBirthday(cell.getDateCellValue());
                                        break;
                                }
                            }
                            break;
                        }
                    }
                    list.add(employee);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
