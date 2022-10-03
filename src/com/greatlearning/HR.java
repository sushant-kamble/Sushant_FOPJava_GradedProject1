package com.greatlearning;

public class HR extends Super {
	protected String departmentName() {
		return "HR Department";
	}

	protected String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	protected String getWorkDeadline() {
		return "Complete by EOD";
	}

	protected String doActivity() {
		return "team Lunch";
	}
}
