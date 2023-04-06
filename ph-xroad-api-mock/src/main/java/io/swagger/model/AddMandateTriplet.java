package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Authorization;
import io.swagger.model.MandateToAdd;
import io.swagger.model.Person;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Delegate is optional (in case company gets deleted then updating is needed).
 */
@Schema(description = "Delegate is optional (in case company gets deleted then updating is needed).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-23T06:43:49.006407902Z[GMT]")


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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddMandateTriplet addMandateTriplet = (AddMandateTriplet) o;
    return Objects.equals(this.representee, addMandateTriplet.representee) &&
        Objects.equals(this.delegate, addMandateTriplet.delegate) &&
        Objects.equals(this.mandate, addMandateTriplet.mandate) &&
        Objects.equals(this.authorizations, addMandateTriplet.authorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(representee, delegate, mandate, authorizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddMandateTriplet {\n");
    
    sb.append("    representee: ").append(toIndentedString(representee)).append("\n");
    sb.append("    delegate: ").append(toIndentedString(delegate)).append("\n");
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
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
