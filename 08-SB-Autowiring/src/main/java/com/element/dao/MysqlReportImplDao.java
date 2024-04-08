package com.element.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MysqlReportImplDao implements ReportDao{

	@Override
	public String getReportData() {
		String msg = "Report from mysql";
		return msg;
	}

}
