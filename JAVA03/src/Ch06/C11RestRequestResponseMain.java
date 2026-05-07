package Ch06;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C11RestRequestResponseMain {

	public static void main(String[] args) throws IOException, InterruptedException {
		//01파라미터 지정
		String url = "https://www.daegufood.go.kr/kor/api/tasty.html";
		String mode = "json";
		String addr = "중구";
		url += "?"+"mode="+mode+"&addr="+addr;
		
		//02 HTTP Request 구성
		HttpRequest request = HttpRequest	
								.newBuilder()
								.uri(URI.create(url))
								.GET()
								.build();
		
		//03 HTTP Request 요청 -> HTTP Response 받기
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> response = 
		httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		
//		System.out.println(response.body());
		
		//04 Response -> JAVA화 1) ObjectMapper(JSON Type 유지), 2) JAVA Class 변환  )
		
		//01) ObjectMapper(JSON Type 유지)
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(response.body());
		System.out.println("status : " + jsonNode.get("status"));
		System.out.println("total : " + jsonNode.get("total"));
		JsonNode data = jsonNode.get("data");
		for(int i=0;i<data.size();i++) {
			JsonNode item = data.get(i);
			System.out.println(item.get("BZ_NM"));
		}
		
	}

}
