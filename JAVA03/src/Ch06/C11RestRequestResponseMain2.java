package Ch06;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;



public class C11RestRequestResponseMain2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		// https://www.data.go.kr/data/15059414/openapi.do
		
		// ObjectMapper - JSON
		
		String url = "https://thegoodnight.daegu.go.kr/ajax/api/thegoodnight.html?mode=json&item_count=10";
		String mode = "json";
		int item_count = 100;
		url += "?"+"mode="+mode+"&item_count="+item_count;
		
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
		
		System.out.println(response.body());
		
		//01) ObjectMapper(JSON Type 유지)
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(response.body());
		System.out.println("status : " + jsonNode.get("status"));
		System.out.println("total : " + jsonNode.get("total"));
		JsonNode data = jsonNode.get("data");
		for(int i=0;i<data.size();i++) {
			JsonNode item = data.get(i);
			System.out.println(item.get("shop"));
		}
		
		
		// ObjectMapper - JAVA Class
		Root responseObject = mapper.readValue(response.body(), Root.class);
		System.out.println("status : " + responseObject.status);
		System.out.println("total : " + responseObject.total);
		responseObject.data.forEach(System.out::println);
		
		ArrayList<Datum> list = responseObject.data;

	}

	// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
	// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
	/* ObjectMapper om = new ObjectMapper();
	Root root = om.readValue(myJsonString, Root.class); */
	private static class Datum{
	    public String num;
	    public String shop;
	    public String tel;
	    public String address;
	    public String offer;
	    public String facilities;
	    public String tag;
	    
		@Override
		public String toString() {
			return "Datum [num=" + num + ", shop=" + shop + ", tel=" + tel + ", address=" + address + ", offer=" + offer
					+ ", facilities=" + facilities + ", tag=" + tag + "]";
		}
	    
	    
	}

	private static class Root{
	    public String status;
	    public String total;
	    public ArrayList<Datum> data;
	}


}
