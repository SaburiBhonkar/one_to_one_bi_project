package com.jsp.company.gst.service;

import com.jsp.company.gst.dao.CompanyDao;
import com.jsp.company.gst.dto.Company;
import com.jsp.company.gst.dto.GST;

public class CompanyService {
	CompanyDao companyDao = new CompanyDao();

	public Company insertCompany(Company company, GST gst) {
		return companyDao.insertCompany(company, gst);
	}

	public Company deleteCompany(Company company, GST gst) {
		return companyDao.deleteCompany(company, gst);
	}

	public Company updateCompany(Company company, GST gst) {
		return companyDao.updateCompany(company, gst);
	}

	public void getAllDetials() {
		companyDao.getAllDetails();
	}
}
