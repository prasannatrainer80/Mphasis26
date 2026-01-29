package com.java.spr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{10 + 20}")
    private int result;
    
    @Value("#{'Mphasis'}")
    private String company;
    
    @Value("#{systemProperties['user.region'] ?: 'defaultRegion'}")
    private String region;

    
    public String getRegion() {
		return region;
	}


	public String getCompany() {
		return company;
	}


	public int getResult() {
        return result;
    }
}
