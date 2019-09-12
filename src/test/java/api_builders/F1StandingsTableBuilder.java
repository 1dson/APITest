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
        "StandingsLists"
})
public class F1StandingsTableBuilder {

    @JsonProperty("season")
    private String season;
    @JsonProperty("StandingsLists")
    private List<F1StandingsListBuilder> f1StandingsListBuilders = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("season")
    public String getSeason() {
        return season;
    }

    @JsonProperty("season")
    public F1StandingsTableBuilder withSeason(String season) {
        this.season = season;
        return this;
    }

    @JsonProperty("StandingsLists")
    public List<F1StandingsListBuilder> getF1StandingsListBuilders() {
        return f1StandingsListBuilders;
    }

    @JsonProperty("StandingsLists")
    public F1StandingsTableBuilder withF1StandingsListBuilders(List<F1StandingsListBuilder> f1StandingsListBuilders) {
        this.f1StandingsListBuilders = f1StandingsListBuilders;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public F1StandingsTableBuilder withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(ToStringStyle.JSON_STYLE)
                .append("season", season)
                .append("f1StandingsListBuilders", f1StandingsListBuilders)
                .append("additionalProperties", additionalProperties).toString();
    }
}

