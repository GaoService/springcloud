package com.gao.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeiXinService {

	@Autowired
	RestTemplate restTemplate;
	
	String access_token = "7_i27lL8tcfzaHAAJUpZm34kPjfN9hl5dYx1jmYbT4MA2JtN4dMGqxR2FkoTodP0684Ud-xbE0DRNZH3ndS1WjpGPfZ8XUdlS9YSEwpl040UstnPUTfGBJG5DKqP1l7-h6ScuYlSdnu7PSEZubVUPcAGAEDY";
	
	public String getAccessToken(){
		String url="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
		HashMap<String, String> tokens = restTemplate.getForObject(url, HashMap.class);
		return tokens.get("access_token");
	}
}
