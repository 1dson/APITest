
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;
import utils.Headers;
import utils.RestVerbs;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItems;

public class QueryConstructor {


    private ValidatableResponse constructorsInfo() {
        String season = "2019";
        return RestVerbs.get(String.format("http://ergast.com/api/f1/%s/constructorStandings.json", season), Headers.getHeaders());
    }

    @Test
     void getConstructors() {
        String[] constructors = {"mercedes, ferrari, red_bull, mclaren, renault, toro_rosso, racing_point, alfa, haas, williams"};
        assertThat(constructorsInfo().extract().body().jsonPath().get("MRData.StandingsTable.StandingsLists.ConstructorStandings.Constructor.constructorId").equals((constructors)))
                .isNotNull();
    }

    @Test
    void getPositionsAndWinsForAConstructor() {
        String wins = "10";
        String position = "1";
        assertThat(constructorsInfo().body(String.format("MRData.StandingsTable.StandingsLists.ConstructorStandings.flatten().findAll()" +
                        "{ it.wins == %s.toString()}.Constructor.name", wins, hasItems("Mercedes"), "MRData.StandingsTable.StandingsLists.ConstructorStandings.flatten().findAll()",
                "{ it.position == %s.toString()}.Constructor.name", position), hasItems("Mercedes")));
    }
}