package httpConnection;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Weather {

	public static void main(String[] args) throws Exception {
		String urlWeather = "https://api.openweathermap.org/data/2.5/forecast?lat=35&lon=139&appid=71ea7b609608683deb62123259408c10";
		OkHttpClient client = new OkHttpClient();
		
		Request request = new Request.Builder().addHeader("accept", "application/json").url(urlWeather).build();
		
		String jsonResponse = client.newCall(request).execute().body().string();
		System.out.println(jsonResponse);
	}

}
