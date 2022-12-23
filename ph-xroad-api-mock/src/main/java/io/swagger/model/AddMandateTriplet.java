package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AddPerson;
import io.swagger.model.MandateToAdd;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AddMandateTriplet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-19T09:44:20.956Z[GMT]")


public class AddMandateTriplet   {
  @JsonProperty("representee")
  private AddPerson representee = null;

  @JsonProperty("delegate")
  private AddPerson delegate = null;

  @JsonProperty("mandates")
  @Valid
  private List<MandateToAdd> mandates = new ArrayList<MandateToAdd>();

  public AddMandateTriplet representee(AddPerson representee) {
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
    public AddPerson getRepresentee() {
    return representee;
  }

  public void setRepresentee(AddPerson representee) {
    this.representee = representee;
  }

  public AddMandateTriplet delegate(AddPerson delegate) {
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
    public AddPerson getDelegate() {
    return delegate;
  }

  public void setDelegate(AddPerson delegate) {
    this.delegate = delegate;
  }

  public AddMandateTriplet mandates(List<MandateToAdd> mandates) {
    this.mandates = mandates;
    return this;
  }

  public AddMandateTriplet addMandatesItem(MandateToAdd mandatesItem) {
    this.mandates.add(mandatesItem);
    return this;
  }

  /**
   * Get mandates
   * @return mandates
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<MandateToAdd> getMandates() {
    return mandates;
  }

  public void setMandates(List<MandateToAdd> mandates) {
    this.mandates = mandates;
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
        Objects.equals(this.mandates, addMandateTriplet.mandates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(representee, delegate, mandates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddMandateTriplet {\n");
    
    sb.append("    representee: ").append(toIndentedString(representee)).append("\n");
    sb.append("    delegate: ").append(toIndentedString(delegate)).append("\n");
    sb.append("    mandates: ").append(toIndentedString(mandates)).append("\n");
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
