package ExerciceAPI;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, IOException, InterruptedException {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=Nantes&appid=8118ed6ee68db2debfaaa5a44c832918&units=metric&lang=fr";
        ObjectMapper mapper = new ObjectMapper();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        CompletableFuture<HttpResponse<String>> response = HttpClient
                .newHttpClient()
                .sendAsync(request, HttpResponse.BodyHandlers.ofString());

        Root root = mapper
                .readValue(response.get().body(), Root.class);

        System.out.println("A " + root.getName() +" le temps sera  " + root.weather.get(0).getMain().toLowerCase()+ " la température sera d'environ " + root.main.getTemp());
    }
}
