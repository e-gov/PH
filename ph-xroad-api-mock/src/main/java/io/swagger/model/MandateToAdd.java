package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ValidityPeriod;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandateToAdd
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-14T09:20:23.675Z[GMT]")


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
  @Schema(example = "GLOBAL1_EMTA:ACCOUNTANT", description = "Role code")
  
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
        Objects.equals(this.canSubDelegate, mandateToAdd.canSubDelegate) &&
        Objects.equals(this.validityPeriod, mandateToAdd.validityPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, canSubDelegate, validityPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateToAdd {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    canSubDelegate: ").append(toIndentedString(canSubDelegate)).append("\n");
    sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
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
