/*------------------- Programatically Configure Rejected Records Log Path -------------------*/
if (System.getProperty("rejectionLogPath")==null) {
	String rejection_file_path = "logs/rejected_rows.log";
	System.setProperty("rejectionLogPath", rejection_file_path);
}

/*------------------- Programatically Configure Rejection Errors Log Path -------------------*/
if (System.getProperty("rejectionErrorsLogPath")==null) {
	String rejection_error_file_path = "logs/rejection_errors.log";
	System.setProperty("rejectionErrorsLogPath", rejection_error_file_path);
}
