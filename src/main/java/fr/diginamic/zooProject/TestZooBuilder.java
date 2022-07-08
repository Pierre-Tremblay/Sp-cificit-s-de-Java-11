package fr.diginamic.zooProject;

import fr.diginamic.zooProject.builder.ZooBuilder;
import fr.diginamic.zooProject.zoo.Animal;
import fr.diginamic.zooProject.zoo.Zone;
import fr.diginamic.zooProject.zoo.Zoo;

import java.util.ArrayList;
import java.util.List;


public class TestZooBuilder {
    public static void main(String[] args) {


        String nomZoo = "Amneville";

        // Préparation de la liste d'animaux
        String nomAnimal = "panda";
        Animal panda = new Animal("panda");
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(panda);

        // Prépatration de la liste de zones
        String nomZone = "Zone 51";
        Integer nbCapacite = 51;
        Zone zone51 = new Zone(nomZone, nbCapacite);

        // Instance du builder de zoo
        ZooBuilder zooAmnevilleBuilder = new ZooBuilder(nomZoo);

        // Ajout d'une zone et d'un animal
        zooAmnevilleBuilder.appendZone(nomZone, nbCapacite);
        zooAmnevilleBuilder.appendAnimal(nomZone, panda);

        // Récupération du zoo
        Zoo zooAmneville = zooAmnevilleBuilder.get();

        // Test
        System.out.println(zooAmneville.getNom());
        System.out.println(zooAmneville.getZones().get(0).getNom());
        System.out.println(zooAmneville.getZones().get(0).getCapacite());
        System.out.println(zooAmneville.getZones().get(0).getAnimals());


    }
}
