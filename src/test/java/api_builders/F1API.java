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
        "MRDataBuilder"
})
public class F1API {

    @JsonProperty("MRDataBuilder")
    private MRDataBuilder mRDataBuilder;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MRDataBuilder")
    public MRDataBuilder getMRData() {
        return mRDataBuilder;
    }

    @JsonProperty("MRDataBuilder")
    public void setMRData(MRDataBuilder mRDataBuilder) {
        this.mRDataBuilder = mRDataBuilder;
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
        return new ToStringBuilder(ToStringStyle.JSON_STYLE).append("mRDataBuilder", mRDataBuilder).append("additionalProperties", additionalProperties).toString();
    }
}