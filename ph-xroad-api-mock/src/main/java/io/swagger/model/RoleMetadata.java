package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleMetadata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-09T08:21:54.440Z[GMT]")


public class RoleMetadata   {
  @JsonProperty("xroadSubsystem")
  private String xroadSubsystem = null;

  public RoleMetadata xroadSubsystem(String xroadSubsystem) {
    this.xroadSubsystem = xroadSubsystem;
    return this;
  }

  /**
   * Xroad subsystem that stores roles of this type
   * @return xroadSubsystem
   **/
  @Schema(example = "stat-volitused", description = "Xroad subsystem that stores roles of this type")
  
    public String getXroadSubsystem() {
    return xroadSubsystem;
  }

  public void setXroadSubsystem(String xroadSubsystem) {
    this.xroadSubsystem = xroadSubsystem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMetadata roleMetadata = (RoleMetadata) o;
    return Objects.equals(this.xroadSubsystem, roleMetadata.xroadSubsystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xroadSubsystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMetadata {\n");
    
    sb.append("    xroadSubsystem: ").append(toIndentedString(xroadSubsystem)).append("\n");
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
