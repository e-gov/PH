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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")

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

}
