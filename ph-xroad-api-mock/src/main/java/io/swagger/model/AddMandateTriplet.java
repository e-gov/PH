package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Authorization;
import io.swagger.model.Document;
import io.swagger.model.MandateToAdd;
import io.swagger.model.Person;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Delegate is optional (in case company gets deleted then updating is needed).
 */
@Schema(description = "Delegate is optional (in case company gets deleted then updating is needed).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")
@ToString
@EqualsAndHashCode
public class AddMandateTriplet   {
  @JsonProperty("representee")
  private Person representee = null;

  @JsonProperty("delegate")
  private Person delegate = null;

  @JsonProperty("mandate")
  private MandateToAdd mandate = null;

  @JsonProperty("authorizations")
  @Valid
  private List<Authorization> authorizations = null;

  @JsonProperty("document")
  private Document document = null;

  public AddMandateTriplet representee(Person representee) {
    this.representee = representee;
    return this;
  }

  /**
   * Get representee
   * @return representee
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Person getRepresentee() {
    return representee;
  }

  public void setRepresentee(Person representee) {
    this.representee = representee;
  }

  public AddMandateTriplet delegate(Person delegate) {
    this.delegate = delegate;
    return this;
  }

  /**
   * Get delegate
   * @return delegate
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Person getDelegate() {
    return delegate;
  }

  public void setDelegate(Person delegate) {
    this.delegate = delegate;
  }

  public AddMandateTriplet mandate(MandateToAdd mandate) {
    this.mandate = mandate;
    return this;
  }

  /**
   * Get mandate
   * @return mandate
   **/
  @Schema(description = "")
  
    @Valid
    public MandateToAdd getMandate() {
    return mandate;
  }

  public void setMandate(MandateToAdd mandate) {
    this.mandate = mandate;
  }

  public AddMandateTriplet authorizations(List<Authorization> authorizations) {
    this.authorizations = authorizations;
    return this;
  }

  public AddMandateTriplet addAuthorizationsItem(Authorization authorizationsItem) {
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

  public AddMandateTriplet document(Document document) {
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
