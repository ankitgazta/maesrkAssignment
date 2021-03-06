package apiTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.text.ParseException;


public class WeatherAPI {
	
	@Test
	public void getWeatherByUSACityname()
	{
		String city="Dallas";
		String apiKey="a78ff34690e195d214eef3c96214b916";
		RestAssured.baseURI="https://api.openweathermap.org";
		
		String response =given().log().all()
				.headers("Content-Type","application/json")
				.param("q",city)
				.and()
				.param("appid", apiKey)
				.when().get("/data/2.5/weather")
				.then().log().all().assertThat().statusCode(200)
				.extract().asString();
		
		JsonPath js = new JsonPath(response);
		String cityName=js.getString("id");
		
		Assert.assertEquals(city, cityName, "Weather for city is visible in response");
	}
	
	
	
	

}
