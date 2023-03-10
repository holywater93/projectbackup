package com.ezenb2.recipe.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class APIExamTranslateNMT {
	/**
	 * ? ??Ό ?¬λ£? ? λ³? ?μ²? URL (?λ£? 10000?Έ??½κΉμ? κ°??₯)
	 * http://211.237.50.150:7080/openapi/sample/xml/Grid_20210909000000000613_1/1/5
	 * ?΄κ±΄ν ?Έμ¦ν€
	 * 967133ef3e229ec2ccf982d0a3d2eb32573a2b71fa0471172b8a0ed521d6361c
	 */
	
	public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://211.237.50.150:7080/openapi/sample/xml/Grid_20210909000000000613_1/1/5"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=967133ef3e229ec2ccf982d0a3d2eb32573a2b71fa0471172b8a0ed521d6361c"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*? ??΄μ§? κ²°κ³Ό ?*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*??΄μ§? λ²νΈ*/
        urlBuilder.append("&" + URLEncoder.encode("stationName","UTF-8") + "=" + URLEncoder.encode("??΄?", "UTF-8")); /*μΈ‘μ ? ?΄λ¦?*/
        urlBuilder.append("&" + URLEncoder.encode("dataTerm","UTF-8") + "=" + URLEncoder.encode("DAILY", "UTF-8")); /*?μ²? ?°?΄?°κΈ°κ° (?λ£? : DAILY, ??¬ : MONTH, 3?¬ : 3MONTH)*/
        urlBuilder.append("&" + URLEncoder.encode("ver","UTF-8") + "=" + URLEncoder.encode("1.3", "UTF-8")); /*λ²μ λ³? ??Έ κ²°κ³Ό μ°Έκ³ λ¬Έμ μ°Έμ‘°*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}
