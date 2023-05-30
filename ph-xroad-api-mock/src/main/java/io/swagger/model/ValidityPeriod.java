package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ValidityPeriod
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")
@Builder
@ToString
@EqualsAndHashCode
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
  @Schema(example = "Sat Jan 01 00:00:00 GMT 2028", description = "First day of being in effect. If null then is already valid or becomes valid immediately after being added.")
  
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
  @Schema(example = "Tue Dec 31 00:00:00 GMT 2030", description = "Valid through (last day is inclusive). If no value is set (null) then valid indefinitely.")
  
    @Valid
    public LocalDate getThrough() {
    return through;
  }

  public void setThrough(LocalDate through) {
    this.through = through;
  }

}
