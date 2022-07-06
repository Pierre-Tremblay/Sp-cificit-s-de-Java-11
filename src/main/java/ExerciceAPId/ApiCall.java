package ExerciceAPId;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ApiCall {
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    private static HttpRequest apiCall(String city){
        String API_KEY = "8118ed6ee68db2debfaaa5a44c832918";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid="+ API_KEY;
        return HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .setHeader("Content-Type", "application/json; charset=UTF-8")
                .build();
    }

    public static HttpResponse<String> resultCall(String city) throws IOException, InterruptedException {
        return httpClient.send(apiCall(city), HttpResponse.BodyHandlers.ofString());
    }
}