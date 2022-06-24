package com.zensar.springboot.endpints;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;

public class InfoContributors implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		
		Map<String, Object> productDetails = new HashMap<String,Object>();
		productDetails.put("CreatedBy", "Vinodkumar");
		productDetails.put("Modified","July22nd2022");
		builder.withDetail("Product", productDetails);

		
	}

}
