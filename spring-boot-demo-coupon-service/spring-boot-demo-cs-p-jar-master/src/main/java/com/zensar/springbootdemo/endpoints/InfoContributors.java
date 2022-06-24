package com.zensar.springbootdemo.endpoints;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
@Component
public class InfoContributors implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		
		Map<String, Object> couponDetails = new HashMap<String,Object>();
		couponDetails.put("CreatedBy", "Vinodkumar");
		couponDetails.put("Modified","July22nd2022");
		builder.withDetail("Coupon", couponDetails);

		
	}

}
