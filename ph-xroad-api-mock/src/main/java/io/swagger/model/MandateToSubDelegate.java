package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Authorization;
import io.swagger.model.Person;
import io.swagger.model.ValidityPeriod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandateToSubDelegate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-26T16:34:35.714Z[GMT]")


public class MandateToSubDelegate   {
  @JsonProperty("subDelegate")
  private Person subDelegate = null;

  @JsonProperty("validityPeriod")
  private ValidityPeriod validityPeriod = null;

  @JsonProperty("authorizations")
  @Valid
  private List<Authorization> authorizations = null;

  public MandateToSubDelegate subDelegate(Person subDelegate) {
    this.subDelegate = subDelegate;
    return this;
  }

  /**
   * Get subDelegate
   * @return subDelegate
   **/
  @Schema(description = "")
  
    @Valid
    public Person getSubDelegate() {
    return subDelegate;
  }

  public void setSubDelegate(Person subDelegate) {
    this.subDelegate = subDelegate;
  }

  public MandateToSubDelegate validityPeriod(ValidityPeriod validityPeriod) {
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

  public MandateToSubDelegate authorizations(List<Authorization> authorizations) {
    this.authorizations = authorizations;
    return this;
  }

  public MandateToSubDelegate addAuthorizationsItem(Authorization authorizationsItem) {
    if (this.authorizations == null) {
      this.authorizations = new ArrayList<Authorization>();
    }
    this.authorizations.add(authorizationsItem);
    return this;
  }

  /**
   * Get authorizations
   * @return authorizations
   **/
  @Schema(description = "")
      @Valid
    public List<Authorization> getAuthorizations() {
    return authorizations;
  }

  public void setAuthorizations(List<Authorization> authorizations) {
    this.authorizations = authorizations;
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
    return Objects.equals(this.subDelegate, mandateToSubDelegate.subDelegate) &&
        Objects.equals(this.validityPeriod, mandateToSubDelegate.validityPeriod) &&
        Objects.equals(this.authorizations, mandateToSubDelegate.authorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subDelegate, validityPeriod, authorizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateToSubDelegate {\n");
    
    sb.append("    subDelegate: ").append(toIndentedString(subDelegate)).append("\n");
    sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
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
