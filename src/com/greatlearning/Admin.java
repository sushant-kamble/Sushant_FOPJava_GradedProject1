package com.greatlearning;

public class Admin extends Super {
	protected String departmentName() {
		return "Admin Department";
	}

	protected String getTodaysWork() {
		return "Complete your documents Submission";
	}

	protected String getWorkDeadline() {
		return "Complete by EOD";
	}
}
