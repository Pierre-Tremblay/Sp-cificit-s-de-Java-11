package ExerciceAPIAdrien;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom de votre ville");
        String city = scanner.nextLine();
        try {
            byte[] bytes = ApiCall.resultCall(city).body().getBytes();
            File file = new File("weather.json");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            System.out.println("Good");

            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("weather.json"));
            JsonObject informations = new JsonParser().parse(bufferedReader).getAsJsonObject();
            Set<Map.Entry<String, JsonElement>> entries = informations.entrySet();
            for (Map.Entry<String, JsonElement> entry : entries
            ) {
                System.out.println(entry);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
