package fr.diginamic.zooProject;

import fr.diginamic.zooProject.builder.ZooBuilder;
import fr.diginamic.zooProject.zoo.Director;
import fr.diginamic.zooProject.zoo.Zoo;

public class Main {
    public static void main(String[] args) {

        // Création d'un directeur
        Director director = new Director();

        // Création d'un builder de zoo
        String nomDuZoo = "Beauval";
        ZooBuilder zooBeauvalBuilder= new ZooBuilder(nomDuZoo);

        // Construction du zoo
        director.constructZooBeauval(zooBeauvalBuilder);

        // Récupération du zoo après sa construction
        Zoo zooBeauval = zooBeauvalBuilder.get();

        System.out.println(zooBeauval);

    }
}
