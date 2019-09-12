package api_builders;


import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.platform.commons.util.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "position",
        "positionText",
        "points",
        "wins",
        "Constructor"
})
public class F1ConstructorStandingBuilder {

    @JsonProperty("position")
    private String position;
    @JsonProperty("positionText")
    private String positionText;
    @JsonProperty("points")
    private String points;
    @JsonProperty("wins")
    private String wins;
    @JsonProperty("Constructor")
    private F1ConstructorsBuilder constructor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("positionText")
    public String getPositionText() {
        return positionText;
    }

    @JsonProperty("positionText")
    public void setPositionText(String positionText) {
        this.positionText = positionText;
    }

    @JsonProperty("points")
    public String getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(String points) {
        this.points = points;
    }

    @JsonProperty("wins")
    public String getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(String wins) {
        this.wins = wins;
    }

    @JsonProperty("Constructor")
    public F1ConstructorsBuilder getConstructor() {
        return constructor;
    }

    @JsonProperty("Constructor")
    public void setConstructor(F1ConstructorsBuilder constructor) {
        this.constructor = constructor;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(ToStringStyle.JSON_STYLE)
                .append("position", position)
                .append("positionText", positionText)
                .append("points", points)
                .append("wins", wins)
                .append("constructor", constructor)
                .append("additionalProperties", additionalProperties).toString();
    }
}