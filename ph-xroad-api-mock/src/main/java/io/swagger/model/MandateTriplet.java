package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Mandate;
import io.swagger.model.Person;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandateTriplet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-14T09:20:23.675Z[GMT]")

@Builder
public class MandateTriplet   {
  @JsonProperty("representee")
  private Person representee = null;

  @JsonProperty("delegate")
  private Person delegate = null;

  @JsonProperty("mandates")
  @Valid
  private List<Mandate> mandates = new ArrayList<Mandate>();

  public MandateTriplet representee(Person representee) {
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

  public MandateTriplet delegate(Person delegate) {
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

  public MandateTriplet mandates(List<Mandate> mandates) {
    this.mandates = mandates;
    return this;
  }

  public MandateTriplet addMandatesItem(Mandate mandatesItem) {
    this.mandates.add(mandatesItem);
    return this;
  }

  /**
   * Mandates
   * @return mandates
   **/
  @Schema(required = true, description = "Mandates")
      @NotNull
    @Valid
    public List<Mandate> getMandates() {
    return mandates;
  }

  public void setMandates(List<Mandate> mandates) {
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
    MandateTriplet mandateTriplet = (MandateTriplet) o;
    return Objects.equals(this.representee, mandateTriplet.representee) &&
        Objects.equals(this.delegate, mandateTriplet.delegate) &&
        Objects.equals(this.mandates, mandateTriplet.mandates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(representee, delegate, mandates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateTriplet {\n");
    
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
