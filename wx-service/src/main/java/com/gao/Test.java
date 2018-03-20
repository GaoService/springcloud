package com.gao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.client.RestTemplate;

public class Test {

	static String access_token = "7_wsqyttKwRtDNxfrlNUbCVK9VaZsMMS_25mLdvWikuqx-Sl15klEmt23R5qVzzOvO_BKWs3KPEqr9FQ7U2DpyJbdBOhJErr37s7u6Q3KnR7I5FmrnmYcCPwD3Js4J7MGhJ9gTEzsf_yL92-YLPAHdAGATEL";

	public static void main(String[] args) throws IOException {
		
		RestTemplate restTemplate = new RestTemplate();
//		String url="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx858ffa79a39706d5&secret=dba7667d624d1dae29226958475ebc0a";
//		Map<String, String> tokens = restTemplate.getForObject(url, Map.class);
//		System.out.println(tokens.get("access_token"));
	
		FileSystemResource resource = new FileSystemResource(new File("target/classes/diaImage/2.jpg"));
//		//String url2 = "https://api.weixin.qq.com/card/create?access_token="+ access_token;
//		
		String url3= "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=" + access_token;
		String imageUrl = restTemplate.postForObject(url3, resource, String.class);
		System.out.println(imageUrl);
	}

}
