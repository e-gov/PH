package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandateToAdd
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-15T06:15:59.962Z[GMT]")


public class MandateToAdd   {
  @JsonProperty("role")
  private String role = null;

  @JsonProperty("validFrom")
  private LocalDate validFrom = null;

  @JsonProperty("validIndefinitely")
  private Boolean validIndefinitely = null;

  @JsonProperty("validThrough")
  private LocalDate validThrough = null;

  public MandateToAdd role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role
   * @return role
   **/
  @Schema(example = "Legal_person_data_viewer_package", required = true, description = "Role")
      @NotNull

    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public MandateToAdd validFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Valid from date.
   * @return validFrom
   **/
  @Schema(example = "Fri Jul 21 00:00:00 GMT 2017", description = "Valid from date.")
  
    @Valid
    public LocalDate getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }

  public MandateToAdd validIndefinitely(Boolean validIndefinitely) {
    this.validIndefinitely = validIndefinitely;
    return this;
  }

  /**
   * Is valid indefinitely
   * @return validIndefinitely
   **/
  @Schema(description = "Is valid indefinitely")
  
    public Boolean isValidIndefinitely() {
    return validIndefinitely;
  }

  public void setValidIndefinitely(Boolean validIndefinitely) {
    this.validIndefinitely = validIndefinitely;
  }

  public MandateToAdd validThrough(LocalDate validThrough) {
    this.validThrough = validThrough;
    return this;
  }

  /**
   * Valid through (last day is inclusive, used only if not valid indefinitely)
   * @return validThrough
   **/
  @Schema(example = "Wed Feb 21 00:00:00 GMT 2024", description = "Valid through (last day is inclusive, used only if not valid indefinitely)")
  
    @Valid
    public LocalDate getValidThrough() {
    return validThrough;
  }

  public void setValidThrough(LocalDate validThrough) {
    this.validThrough = validThrough;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateToAdd mandateToAdd = (MandateToAdd) o;
    return Objects.equals(this.role, mandateToAdd.role) &&
        Objects.equals(this.validFrom, mandateToAdd.validFrom) &&
        Objects.equals(this.validIndefinitely, mandateToAdd.validIndefinitely) &&
        Objects.equals(this.validThrough, mandateToAdd.validThrough);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, validFrom, validIndefinitely, validThrough);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateToAdd {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validIndefinitely: ").append(toIndentedString(validIndefinitely)).append("\n");
    sb.append("    validThrough: ").append(toIndentedString(validThrough)).append("\n");
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
