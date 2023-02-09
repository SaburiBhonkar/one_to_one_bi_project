package com.jsp.company.gst.controller;

import com.jsp.company.gst.dto.Company;
import com.jsp.company.gst.dto.GST;
import com.jsp.company.gst.service.CompanyService;

public class TestDriver {

	public static void main(String[] args) {
//		GST gst = new GST();
//		Company company = new Company();
//
//		gst.setGst_no("ABC123EFG");
//		gst.setCompany(company);
//		company.setName("JIO");
//		company.setLoc("RABALE");
//		company.setGst(gst);
//
//		CompanyService companyService = new CompanyService();
//		companyService.insertCompany(company, gst);

//		GST gst = new GST();
//		gst.setId(1);
//		Company company = new Company();
//		company.setId(1);
//
//		CompanyService companyService = new CompanyService();
//		companyService.deleteCompany(company, gst);

//		GST gst = new GST();
//		gst.setId(3);
//		Company company = new Company();
//		company.setId(3);
//		company.setName("RELIANCE");
//		company.setLoc("THANE");
//
//		CompanyService companyService = new CompanyService();
//		companyService.updateCompany(company, gst);

		CompanyService companyService = new CompanyService();
		companyService.getAllDetials();

	}
}
