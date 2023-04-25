import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ZooTest {

    Zoo zoo;

    @BeforeEach
    void setUp(){
        zoo = new Zoo();
    }

    @Test
    void canCountAnimals(){
        assertThat(zoo.countAnimals()).isEqualTo(0);
    }

    @Test
    void canAddAnimal(){
        Lion lion = new Lion("Simba", false);
        zoo.addAnimal(lion);
        assertThat(zoo.countAnimals()).isEqualTo(1);
    }

    @Test
    void canAddDifferentTypesOfAnimal(){
        Lion lion = new Lion("Simba", false);
        Parrot parrot = new Parrot("Iago");
        Animal differentLion = new Lion ("Mufasa", true);
        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);
        zoo.addAnimal(differentLion);
        assertThat(zoo.countAnimals()).isEqualTo(3);
    }
    // this works because although you cant add new Animal, you can add classes that can extend Animal

    // added on tuesday
    @Test
    void canCountBirdEggs(){
        Parrot parrot = new Parrot("Iago");
        Seagull seagull = new Seagull("Steve");
        zoo.addAnimal(parrot);
        zoo.addAnimal(seagull);
        assertThat(zoo.countBirdEggs()).isEqualTo(2);
    }
}
