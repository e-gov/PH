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
 * MandateToSubDelegate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-19T09:44:20.956Z[GMT]")


public class MandateToSubDelegate   {
  @JsonProperty("validFrom")
  private LocalDate validFrom = null;

  @JsonProperty("validIndefinitely")
  private Boolean validIndefinitely = null;

  @JsonProperty("validThrough")
  private LocalDate validThrough = null;

  public MandateToSubDelegate validFrom(LocalDate validFrom) {
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

  public MandateToSubDelegate validIndefinitely(Boolean validIndefinitely) {
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

  public MandateToSubDelegate validThrough(LocalDate validThrough) {
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
    MandateToSubDelegate mandateToSubDelegate = (MandateToSubDelegate) o;
    return Objects.equals(this.validFrom, mandateToSubDelegate.validFrom) &&
        Objects.equals(this.validIndefinitely, mandateToSubDelegate.validIndefinitely) &&
        Objects.equals(this.validThrough, mandateToSubDelegate.validThrough);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validFrom, validIndefinitely, validThrough);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateToSubDelegate {\n");
    
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
