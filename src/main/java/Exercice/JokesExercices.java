package Exercice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JokesExercices {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/main/resources", "jokes.txt");
        System.out.println(filePath);

        Scanner scanner = new Scanner(System.in);
        try {
            List<String> content = Files.readAllLines(filePath);
            List<String> jokes = new ArrayList<>();
            List<String> answers = new ArrayList<>();

            for (String line : content) {
                if (content.indexOf(line) % 2 == 0) {
                    jokes.add(line);
                } else {
                    answers.add(line);
                }
            }

            System.out.println("Ecrire un nombre  entre 1 et 90");
            int nombre = scanner.nextInt();
            System.out.println(jokes.get(nombre-1));
            System.out.println(answers.get(nombre-1));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
