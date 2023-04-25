import models.Championship;
import models.Swimmer;
import models.Triathlete;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChampionshipTest {

    Championship championship;
    Swimmer swimmer;
    Triathlete triathlete;

    @BeforeEach
    public void setUp(){
        championship = new Championship("World Athletics");
        swimmer = new Swimmer("Jane");
        triathlete = new Triathlete("Kevin");
    }

    @Test
    public void canAddSwimmingAthletesToChampionship(){
        championship.addSwimmer(swimmer);
        championship.addSwimmer(triathlete);
        // both work because they both implement Swimmable interface - loose coupling value
        System.out.println(championship.getSwimmers());
        assertThat(championship.getSwimmers().size()).isEqualTo(2);
    }


}
