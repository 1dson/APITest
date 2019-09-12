package api_builders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "season",
        "round",
        "ConstructorStandings"
})
public class F1StandingsListBuilder {

    @JsonProperty("season")
    private String season;
    @JsonProperty("round")
    private String round;
    @JsonProperty("ConstructorStandings")
    private List<F1ConstructorStandingBuilder> constructorStandings = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("season")
    public String getSeason() {
        return season;
    }

    @JsonProperty("season")
    public F1StandingsListBuilder withSeason(String season) {
        this.season = season;
        return this;
    }

    @JsonProperty("round")
    public String getRound() {
        return round;
    }

    @JsonProperty("round")
    public F1StandingsListBuilder withRound(String round) {
        this.round = round;
        return this;
    }

    @JsonProperty("ConstructorStandings")
    public List<F1ConstructorStandingBuilder> getConstructorStandings() {
        return constructorStandings;
    }

    @JsonProperty("ConstructorStandings")
    public F1StandingsListBuilder withConstructorStandings(List<F1ConstructorStandingBuilder> constructorStandings) {
        this.constructorStandings = constructorStandings;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public F1StandingsListBuilder withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(ToStringStyle.JSON_STYLE)
                .append("season", season)
                .append("round", round)
                .append("constructorStandings", constructorStandings)
                .append("additionalProperties", additionalProperties).toString();
    }
}
