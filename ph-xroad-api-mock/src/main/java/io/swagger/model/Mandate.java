package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MandateLinks;
import io.swagger.model.ValidityPeriod;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mandate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")
@Builder
@ToString
@EqualsAndHashCode
public class Mandate   {
  @JsonProperty("role")
  private String role = null;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("validityPeriod")
  private ValidityPeriod validityPeriod = null;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("links")
  private MandateLinks links = null;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("subDelegatorIdentifier")
  private String subDelegatorIdentifier = null;

  public Mandate role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role
   * @return role
   **/
  @Schema(example = "STAT:Legal_person_data_viewer_package", required = true, description = "Role")
      @NotNull

    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Mandate validityPeriod(ValidityPeriod validityPeriod) {
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

  public Mandate links(MandateLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @Schema(description = "")
  
    @Valid
    public MandateLinks getLinks() {
    return links;
  }

  public void setLinks(MandateLinks links) {
    this.links = links;
  }

  public Mandate subDelegatorIdentifier(String subDelegatorIdentifier) {
    this.subDelegatorIdentifier = subDelegatorIdentifier;
    return this;
  }

  /**
   * Identifier of the person who created this mandate through sub-delegation.
   * @return subDelegatorIdentifier
   **/
  @Schema(example = "EE12345678", description = "Identifier of the person who created this mandate through sub-delegation.")
  
    public String getSubDelegatorIdentifier() {
    return subDelegatorIdentifier;
  }

  public void setSubDelegatorIdentifier(String subDelegatorIdentifier) {
    this.subDelegatorIdentifier = subDelegatorIdentifier;
  }

}
