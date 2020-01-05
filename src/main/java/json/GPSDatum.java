package json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The Items Schema
 * <p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "version",
        "timestamp",
        "longitude",
        "latitude",
        "altitude",
        "accuracy_v",
        "accuracy_h",
        "speed",
        "duration",
        "distance",
        "elevation_gain",
        "elevation_loss"
})
public class GPSDatum {

    /**
     * The Version Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("version")
    private Long version = 0L;
    /**
     * The Timestamp Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("timestamp")
    private String timestamp = "";
    /**
     * The Longitude Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("longitude")
    private Double longitude = 0.0D;
    /**
     * The Latitude Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("latitude")
    private Double latitude = 0.0D;
    /**
     * The Altitude Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("altitude")
    private Double altitude = 0.0D;
    /**
     * The Accuracy_v Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("accuracy_v")
    private Long accuracyV = 0L;
    /**
     * The Accuracy_h Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("accuracy_h")
    private Long accuracyH = 0L;
    /**
     * The Speed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("speed")
    private Long speed = 0L;
    /**
     * The Duration Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("duration")
    private Long duration = 0L;
    /**
     * The Distance Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("distance")
    private Long distance = 0L;
    /**
     * The Elevation_gain Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("elevation_gain")
    private Long elevationGain = 0L;
    /**
     * The Elevation_loss Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("elevation_loss")
    private Long elevationLoss = 0L;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Version Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("version")
    public Long getVersion() {
        return version;
    }

    /**
     * The Version Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("version")
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * The Timestamp Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * The Timestamp Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * The Longitude Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * The Longitude Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * The Latitude Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * The Latitude Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * The Altitude Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("altitude")
    public Double getAltitude() {
        return altitude;
    }

    /**
     * The Altitude Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("altitude")
    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    /**
     * The Accuracy_v Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("accuracy_v")
    public Long getAccuracyV() {
        return accuracyV;
    }

    /**
     * The Accuracy_v Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("accuracy_v")
    public void setAccuracyV(Long accuracyV) {
        this.accuracyV = accuracyV;
    }

    /**
     * The Accuracy_h Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("accuracy_h")
    public Long getAccuracyH() {
        return accuracyH;
    }

    /**
     * The Accuracy_h Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("accuracy_h")
    public void setAccuracyH(Long accuracyH) {
        this.accuracyH = accuracyH;
    }

    /**
     * The Speed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("speed")
    public Long getSpeed() {
        return speed;
    }

    /**
     * The Speed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("speed")
    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    /**
     * The Duration Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    /**
     * The Duration Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * The Distance Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("distance")
    public Long getDistance() {
        return distance;
    }

    /**
     * The Distance Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("distance")
    public void setDistance(Long distance) {
        this.distance = distance;
    }

    /**
     * The Elevation_gain Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("elevation_gain")
    public Long getElevationGain() {
        return elevationGain;
    }

    /**
     * The Elevation_gain Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("elevation_gain")
    public void setElevationGain(Long elevationGain) {
        this.elevationGain = elevationGain;
    }

    /**
     * The Elevation_loss Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("elevation_loss")
    public Long getElevationLoss() {
        return elevationLoss;
    }

    /**
     * The Elevation_loss Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("elevation_loss")
    public void setElevationLoss(Long elevationLoss) {
        this.elevationLoss = elevationLoss;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
