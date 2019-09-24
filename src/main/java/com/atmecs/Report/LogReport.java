package com.atmecs.Report;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.lf5.LogRecordFilter;

import com.atmecs.Constants.Constants;

public class LogReport {
		Logger logger = null;

		public void logReport(String message) {
			PropertyConfigurator.configure(Constants.log_path);
			logger = Logger.getLogger(LogRecordFilter.class.getName());
			logger.info(message);
		}
	}

