package com.jsp.company.gst.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.company.gst.dto.Company;
import com.jsp.company.gst.dto.GST;

public class CompanyDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saburi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Company insertCompany(Company company, GST gst) {

		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
		System.out.println("Record Added");
		return company;

	}

	public Company deleteCompany(Company company, GST gst) {
		Company company2 = entityManager.find(Company.class, company.getId());
		GST gst2 = entityManager.find(GST.class, gst.getId());

		entityTransaction.begin();
		entityManager.remove(company2);
		entityManager.remove(gst2);
		entityTransaction.commit();
		System.out.println("Record Deleted");
		return company2;
	}

	public Company updateCompany(Company company, GST gst) {
		Company company2 = entityManager.find(Company.class, company.getId());
		GST gst2 = entityManager.find(GST.class, gst.getId());

		if (company2 != null) {
			company2.setName(company.getName());
			company2.setLoc(company.getLoc());
			System.out.println("Record Updated");
		} else
			System.out.println("Record Not Found");

		entityTransaction.begin();
		entityManager.merge(company2);
		entityTransaction.commit();
		return company2;
	}

	public void getAllDetails() {
		String sql = "select company from Company company";
		String sql2 = "select gst from GST gst";
		Query query = entityManager.createQuery(sql);
		Query query2 = entityManager.createQuery(sql2);
		List<Company> companies = query.getResultList();
		List<GST> gsts = query2.getResultList();
		for (Company c1 : companies) {
			System.out.println("=====================================");
			System.out.println(c1.getId());
			System.out.println(c1.getName());
			System.out.println(c1.getLoc());
		}
		for (GST g : gsts) {
			System.out.println("======================================");
			System.out.println(g.getId());
			System.out.println(g.getGst_no());
		}

	}

}
