package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ValidityPeriod;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandateToAdd
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")
@ToString
@EqualsAndHashCode
public class MandateToAdd   {
  @JsonProperty("role")
  private String role = null;

  @JsonProperty("canSubDelegate")
  private Boolean canSubDelegate = null;

  @JsonProperty("validityPeriod")
  private ValidityPeriod validityPeriod = null;

  public MandateToAdd role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role code
   * @return role
   **/
  @Schema(example = "GLOBAL1_EMTA:ACCOUNTANT", required = true, description = "Role code")
  @NotNull
    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public MandateToAdd canSubDelegate(Boolean canSubDelegate) {
    this.canSubDelegate = canSubDelegate;
    return this;
  }

  /**
   * Can this role be given out with the right to sub-delegate it.
   * @return canSubDelegate
   **/
  @Schema(description = "Can this role be given out with the right to sub-delegate it.")
  
    public Boolean isCanSubDelegate() {
    return canSubDelegate;
  }

  public void setCanSubDelegate(Boolean canSubDelegate) {
    this.canSubDelegate = canSubDelegate;
  }

  public MandateToAdd validityPeriod(ValidityPeriod validityPeriod) {
    this.validityPeriod = validityPeriod;
    return this;
  }

  /**
   * Get validityPeriod
   * @return validityPeriod
   **/
  @Schema(description = "")
  
    @Valid
    public ValidityPeriod getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(ValidityPeriod validityPeriod) {
    this.validityPeriod = validityPeriod;
  }

}
