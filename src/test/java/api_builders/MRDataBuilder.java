package api_builders;


import java.util.HashMap;
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
        "xmlns",
        "series",
        "url",
        "limit",
        "offset",
        "total",
        "F1StandingsTableBuilder"
})
public class MRDataBuilder {

    @JsonProperty("xmlns")
    private String xmlns;
    @JsonProperty("series")
    private String series;
    @JsonProperty("url")
    private String url;
    @JsonProperty("limit")
    private String limit;
    @JsonProperty("offset")
    private String offset;
    @JsonProperty("total")
    private String total;
    @JsonProperty("F1StandingsTableBuilder")
    private F1StandingsTableBuilder f1StandingsTableBuilder;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("xmlns")
    public String getXmlns() {
        return xmlns;
    }

    @JsonProperty("xmlns")
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    @JsonProperty("series")
    public String getSeries() {
        return series;
    }

    @JsonProperty("series")
    public void setSeries(String series) {
        this.series = series;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("limit")
    public String getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(String limit) {
        this.limit = limit;
    }

    @JsonProperty("offset")
    public String getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(String offset) {
        this.offset = offset;
    }

    @JsonProperty("total")
    public String getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(String total) {
        this.total = total;
    }

    @JsonProperty("F1StandingsTableBuilder")
    public F1StandingsTableBuilder getF1StandingsTableBuilder() {
        return f1StandingsTableBuilder;
    }

    public MRDataBuilder withStandings(F1StandingsTableBuilder f1StandingsTableBuilder) {
        this.f1StandingsTableBuilder = f1StandingsTableBuilder;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public MRDataBuilder withAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(ToStringStyle.JSON_STYLE)
                .append("xmlns", xmlns)
                .append("series", series)
                .append("url", url)
                .append("limit", limit)
                .append("offset", offset)
                .append("total", total)
                .append("f1StandingsTableBuilder", f1StandingsTableBuilder)
                .append("additionalProperties", additionalProperties).toString();
    }
}