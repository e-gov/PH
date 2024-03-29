package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Authorization;
import io.swagger.model.Document;
import io.swagger.model.Person;
import io.swagger.model.ValidityPeriod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandateToSubDelegate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")
@ToString
@EqualsAndHashCode
public class MandateToSubDelegate   {
  @JsonProperty("subDelegate")
  private Person subDelegate = null;

  @JsonProperty("validityPeriod")
  private ValidityPeriod validityPeriod = null;

  @JsonProperty("authorizations")
  @Valid
  private List<Authorization> authorizations = null;

  @JsonProperty("document")
  private Document document = null;

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

  public MandateToSubDelegate document(Document document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   **/
  @Schema(description = "")
  
    @Valid
    public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

}
