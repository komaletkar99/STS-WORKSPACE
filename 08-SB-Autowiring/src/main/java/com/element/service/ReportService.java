package com.element.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.element.dao.ReportDao;

@Service
public class ReportService {
	@Autowired
	@Qualifier("mysql")
	private ReportDao dao;
	
	public void generateReport() {
		String reportData = dao.getReportData();
		System.out.println(reportData);
	}

}
