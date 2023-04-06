package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * On what grounds did Pääsuke allow the user to perform this addition
 */
@Schema(description = "On what grounds did Pääsuke allow the user to perform this addition")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-23T06:43:43.708Z[GMT]")


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
  @Schema(example = "EE49028099999", description = "")
  
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
  @Schema(example = "FROM_BUSINESS_REGISTRY:MANAGEMENT_BOARD_MEMBER_FULL", description = "List of roles the user had")
  
    public String getHasRole() {
    return hasRole;
  }

  public void setHasRole(String hasRole) {
    this.hasRole = hasRole;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authorization authorization = (Authorization) o;
    return Objects.equals(this.userIdentifier, authorization.userIdentifier) &&
        Objects.equals(this.hasRole, authorization.hasRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIdentifier, hasRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorization {\n");
    
    sb.append("    userIdentifier: ").append(toIndentedString(userIdentifier)).append("\n");
    sb.append("    hasRole: ").append(toIndentedString(hasRole)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
