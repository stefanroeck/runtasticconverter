
package json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The Root Schema
 * <p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "start_time",
        "end_time",
        "created_at",
        "updated_at",
        "start_time_timezone_offset",
        "end_time_timezone_offset",
        "distance",
        "duration",
        "elevation_gain",
        "elevation_loss",
        "average_speed",
        "calories",
        "longitude",
        "latitude",
        "max_speed",
        "pause_duration",
        "duration_per_km",
        "temperature",
        "notes",
        "max_step_frequency",
        "avg_step_frequency",
        "total_steps",
        "manual",
        "edited",
        "completed",
        "live_tracking_active",
        "live_tracking_enabled",
        "cheering_enabled",
        "indoor",
        "id",
        "weather_condition_id",
        "surface_id",
        "subjective_feeling_id",
        "sport_type_id",
        "user_equipment_ids"
})
public class SportSession {

    /**
     * The Start_time Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("start_time")
    private Long startTime = 0L;
    /**
     * The End_time Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("end_time")
    private Long endTime = 0L;
    /**
     * The Created_at Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("created_at")
    private Long createdAt = 0L;
    /**
     * The Updated_at Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("updated_at")
    private Long updatedAt = 0L;
    /**
     * The Start_time_timezone_offset Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("start_time_timezone_offset")
    private Long startTimeTimezoneOffset = 0L;
    /**
     * The End_time_timezone_offset Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("end_time_timezone_offset")
    private Long endTimeTimezoneOffset = 0L;
    /**
     * The Distance Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("distance")
    private Long distance = 0L;
    /**
     * The Duration Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("duration")
    private Long duration = 0L;
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
    /**
     * The Average_speed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("average_speed")
    private Double averageSpeed = 0.0D;
    /**
     * The Calories Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("calories")
    private Long calories = 0L;
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
     * The Max_speed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("max_speed")
    private Double maxSpeed = 0.0D;
    /**
     * The Pause_duration Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("pause_duration")
    private Long pauseDuration = 0L;
    /**
     * The Duration_per_km Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("duration_per_km")
    private Long durationPerKm = 0L;
    /**
     * The Temperature Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("temperature")
    private Long temperature = 0L;
    /**
     * The Notes Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("notes")
    private String notes = "";
    /**
     * The Max_step_frequency Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("max_step_frequency")
    private Long maxStepFrequency = 0L;
    /**
     * The Avg_step_frequency Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("avg_step_frequency")
    private Long avgStepFrequency = 0L;
    /**
     * The Total_steps Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("total_steps")
    private Long totalSteps = 0L;
    /**
     * The Manual Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("manual")
    private Boolean manual = false;
    /**
     * The Edited Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("edited")
    private Boolean edited = false;
    /**
     * The Completed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("completed")
    private Boolean completed = false;
    /**
     * The Live_tracking_active Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("live_tracking_active")
    private Boolean liveTrackingActive = false;
    /**
     * The Live_tracking_enabled Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("live_tracking_enabled")
    private Boolean liveTrackingEnabled = false;
    /**
     * The Cheering_enabled Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("cheering_enabled")
    private Boolean cheeringEnabled = false;
    /**
     * The Indoor Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("indoor")
    private Boolean indoor = false;
    /**
     * The Id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("id")
    private String id = "";
    /**
     * The Weather_condition_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("weather_condition_id")
    private String weatherConditionId = "";
    /**
     * The Surface_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("surface_id")
    private String surfaceId = "";
    /**
     * The Subjective_feeling_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("subjective_feeling_id")
    private String subjectiveFeelingId = "";
    /**
     * The Sport_type_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("sport_type_id")
    private String sportTypeId = "";
    /**
     * The User_equipment_ids Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("user_equipment_ids")
    private List<String> userEquipmentIds = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Start_time Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("start_time")
    public Long getStartTime() {
        return startTime;
    }

    /**
     * The Start_time Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("start_time")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * The End_time Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("end_time")
    public Long getEndTime() {
        return endTime;
    }

    /**
     * The End_time Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("end_time")
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * The Created_at Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("created_at")
    public Long getCreatedAt() {
        return createdAt;
    }

    /**
     * The Created_at Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("created_at")
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The Updated_at Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("updated_at")
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * The Updated_at Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * The Start_time_timezone_offset Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("start_time_timezone_offset")
    public Long getStartTimeTimezoneOffset() {
        return startTimeTimezoneOffset;
    }

    /**
     * The Start_time_timezone_offset Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("start_time_timezone_offset")
    public void setStartTimeTimezoneOffset(Long startTimeTimezoneOffset) {
        this.startTimeTimezoneOffset = startTimeTimezoneOffset;
    }

    /**
     * The End_time_timezone_offset Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("end_time_timezone_offset")
    public Long getEndTimeTimezoneOffset() {
        return endTimeTimezoneOffset;
    }

    /**
     * The End_time_timezone_offset Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("end_time_timezone_offset")
    public void setEndTimeTimezoneOffset(Long endTimeTimezoneOffset) {
        this.endTimeTimezoneOffset = endTimeTimezoneOffset;
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

    /**
     * The Average_speed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("average_speed")
    public Double getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * The Average_speed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("average_speed")
    public void setAverageSpeed(Double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    /**
     * The Calories Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("calories")
    public Long getCalories() {
        return calories;
    }

    /**
     * The Calories Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("calories")
    public void setCalories(Long calories) {
        this.calories = calories;
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
     * The Max_speed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("max_speed")
    public Double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * The Max_speed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("max_speed")
    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * The Pause_duration Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("pause_duration")
    public Long getPauseDuration() {
        return pauseDuration;
    }

    /**
     * The Pause_duration Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("pause_duration")
    public void setPauseDuration(Long pauseDuration) {
        this.pauseDuration = pauseDuration;
    }

    /**
     * The Duration_per_km Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("duration_per_km")
    public Long getDurationPerKm() {
        return durationPerKm;
    }

    /**
     * The Duration_per_km Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("duration_per_km")
    public void setDurationPerKm(Long durationPerKm) {
        this.durationPerKm = durationPerKm;
    }

    /**
     * The Temperature Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("temperature")
    public Long getTemperature() {
        return temperature;
    }

    /**
     * The Temperature Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("temperature")
    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }

    /**
     * The Notes Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    /**
     * The Notes Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * The Max_step_frequency Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("max_step_frequency")
    public Long getMaxStepFrequency() {
        return maxStepFrequency;
    }

    /**
     * The Max_step_frequency Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("max_step_frequency")
    public void setMaxStepFrequency(Long maxStepFrequency) {
        this.maxStepFrequency = maxStepFrequency;
    }

    /**
     * The Avg_step_frequency Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("avg_step_frequency")
    public Long getAvgStepFrequency() {
        return avgStepFrequency;
    }

    /**
     * The Avg_step_frequency Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("avg_step_frequency")
    public void setAvgStepFrequency(Long avgStepFrequency) {
        this.avgStepFrequency = avgStepFrequency;
    }

    /**
     * The Total_steps Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("total_steps")
    public Long getTotalSteps() {
        return totalSteps;
    }

    /**
     * The Total_steps Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("total_steps")
    public void setTotalSteps(Long totalSteps) {
        this.totalSteps = totalSteps;
    }

    /**
     * The Manual Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("manual")
    public Boolean getManual() {
        return manual;
    }

    /**
     * The Manual Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("manual")
    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    /**
     * The Edited Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("edited")
    public Boolean getEdited() {
        return edited;
    }

    /**
     * The Edited Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("edited")
    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    /**
     * The Completed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("completed")
    public Boolean getCompleted() {
        return completed;
    }

    /**
     * The Completed Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("completed")
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    /**
     * The Live_tracking_active Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("live_tracking_active")
    public Boolean getLiveTrackingActive() {
        return liveTrackingActive;
    }

    /**
     * The Live_tracking_active Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("live_tracking_active")
    public void setLiveTrackingActive(Boolean liveTrackingActive) {
        this.liveTrackingActive = liveTrackingActive;
    }

    /**
     * The Live_tracking_enabled Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("live_tracking_enabled")
    public Boolean getLiveTrackingEnabled() {
        return liveTrackingEnabled;
    }

    /**
     * The Live_tracking_enabled Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("live_tracking_enabled")
    public void setLiveTrackingEnabled(Boolean liveTrackingEnabled) {
        this.liveTrackingEnabled = liveTrackingEnabled;
    }

    /**
     * The Cheering_enabled Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("cheering_enabled")
    public Boolean getCheeringEnabled() {
        return cheeringEnabled;
    }

    /**
     * The Cheering_enabled Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("cheering_enabled")
    public void setCheeringEnabled(Boolean cheeringEnabled) {
        this.cheeringEnabled = cheeringEnabled;
    }

    /**
     * The Indoor Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("indoor")
    public Boolean getIndoor() {
        return indoor;
    }

    /**
     * The Indoor Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("indoor")
    public void setIndoor(Boolean indoor) {
        this.indoor = indoor;
    }

    /**
     * The Id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * The Id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Weather_condition_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("weather_condition_id")
    public String getWeatherConditionId() {
        return weatherConditionId;
    }

    /**
     * The Weather_condition_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("weather_condition_id")
    public void setWeatherConditionId(String weatherConditionId) {
        this.weatherConditionId = weatherConditionId;
    }

    /**
     * The Surface_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("surface_id")
    public String getSurfaceId() {
        return surfaceId;
    }

    /**
     * The Surface_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("surface_id")
    public void setSurfaceId(String surfaceId) {
        this.surfaceId = surfaceId;
    }

    /**
     * The Subjective_feeling_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("subjective_feeling_id")
    public String getSubjectiveFeelingId() {
        return subjectiveFeelingId;
    }

    /**
     * The Subjective_feeling_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("subjective_feeling_id")
    public void setSubjectiveFeelingId(String subjectiveFeelingId) {
        this.subjectiveFeelingId = subjectiveFeelingId;
    }

    /**
     * The Sport_type_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("sport_type_id")
    public String getSportTypeId() {
        return sportTypeId;
    }

    /**
     * The Sport_type_id Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("sport_type_id")
    public void setSportTypeId(String sportTypeId) {
        this.sportTypeId = sportTypeId;
    }

    /**
     * The User_equipment_ids Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("user_equipment_ids")
    public List<String> getUserEquipmentIds() {
        return userEquipmentIds;
    }

    /**
     * The User_equipment_ids Schema
     * <p>
     * <p>
     * (Required)
     */
    @JsonProperty("user_equipment_ids")
    public void setUserEquipmentIds(List<String> userEquipmentIds) {
        this.userEquipmentIds = userEquipmentIds;
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
