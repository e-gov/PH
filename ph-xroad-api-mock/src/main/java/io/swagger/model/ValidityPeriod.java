package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ValidityPeriod
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-26T16:34:35.714Z[GMT]")


public class ValidityPeriod   {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("from")
  private LocalDate from = null;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("through")
  private LocalDate through = null;

  public ValidityPeriod from(LocalDate from) {
    this.from = from;
    return this;
  }

  /**
   * First day of being in effect. If null then is already valid or becomes valid immediately after being added.
   * @return from
   **/
  @Schema(example = "Fri Jul 21 00:00:00 GMT 2017", description = "First day of being in effect. If null then is already valid or becomes valid immediately after being added.")
  
    @Valid
    public LocalDate getFrom() {
    return from;
  }

  public void setFrom(LocalDate from) {
    this.from = from;
  }

  public ValidityPeriod through(LocalDate through) {
    this.through = through;
    return this;
  }

  /**
   * Valid through (last day is inclusive). If no value is set (null) then valid indefinitely.
   * @return through
   **/
  @Schema(example = "Wed Feb 21 00:00:00 GMT 2024", description = "Valid through (last day is inclusive). If no value is set (null) then valid indefinitely.")
  
    @Valid
    public LocalDate getThrough() {
    return through;
  }

  public void setThrough(LocalDate through) {
    this.through = through;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidityPeriod validityPeriod = (ValidityPeriod) o;
    return Objects.equals(this.from, validityPeriod.from) &&
        Objects.equals(this.through, validityPeriod.through);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, through);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidityPeriod {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    through: ").append(toIndentedString(through)).append("\n");
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
