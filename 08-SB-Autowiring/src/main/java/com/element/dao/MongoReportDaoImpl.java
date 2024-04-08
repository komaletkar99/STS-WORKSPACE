package com.element.dao;
import org.springframework.stereotype.Repository;

@Repository("mongo")
public class MongoReportDaoImpl implements ReportDao{

	@Override
	public String getReportData() {
	String msg = "report from mongodb";
	return msg;
	}

}
