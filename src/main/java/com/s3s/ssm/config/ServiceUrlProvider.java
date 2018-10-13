package com.s3s.ssm.config;

public class ServiceUrlProvider {
	private static final String CATALOG_SERVICE_URL = "catalog_service_url";

	public static String getCatalogServiceUrl() {
		return System.getProperty(CATALOG_SERVICE_URL);
	}
}
