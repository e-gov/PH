package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * On what grounds did Pääsuke allow the user to perform this addition
 */
@Schema(description = "On what grounds did Pääsuke allow the user to perform this addition")
@Validated
@ToString
@EqualsAndHashCode
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")


public class Authorization   {
  @JsonProperty("userIdentifier")
  private String userIdentifier = null;

  @JsonProperty("hasRole")
  private String hasRole = null;

  public Authorization userIdentifier(String userIdentifier) {
    this.userIdentifier = userIdentifier;
    return this;
  }

  /**
   * Get userIdentifier
   * @return userIdentifier
   **/
  @Schema(example = "EE39912310123", description = "")
  
    public String getUserIdentifier() {
    return userIdentifier;
  }

  public void setUserIdentifier(String userIdentifier) {
    this.userIdentifier = userIdentifier;
  }

  public Authorization hasRole(String hasRole) {
    this.hasRole = hasRole;
    return this;
  }

  /**
   * List of roles the user had
   * @return hasRole
   **/
  @Schema(example = "BR_REPRIGHT:SOLEREP", description = "List of roles the user had")
  
    public String getHasRole() {
    return hasRole;
  }

  public void setHasRole(String hasRole) {
    this.hasRole = hasRole;
  }

}
