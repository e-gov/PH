package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandateToAddMisp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-19T09:44:20.956Z[GMT]")


public class MandateToAddMisp   {
  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("validFrom")
  private LocalDate validFrom = null;

  @JsonProperty("validIndefinitely")
  private Boolean validIndefinitely = null;

  @JsonProperty("validThrough")
  private LocalDate validThrough = null;

  public MandateToAddMisp namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The namespace the mandate is added under
   * @return namespace
   **/
  @Schema(example = "STAT_ESTAT", required = true, description = "The namespace the mandate is added under")
      @NotNull

    public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public MandateToAddMisp role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role
   * @return role
   **/
  @Schema(example = "Legal_person_data_viewer_package", required = true, description = "Role")
      @NotNull

    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public MandateToAddMisp validFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Valid from date.
   * @return validFrom
   **/
  @Schema(example = "Fri Jul 21 00:00:00 GMT 2017", description = "Valid from date.")
  
    @Valid
    public LocalDate getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }

  public MandateToAddMisp validIndefinitely(Boolean validIndefinitely) {
    this.validIndefinitely = validIndefinitely;
    return this;
  }

  /**
   * Is valid indefinitely
   * @return validIndefinitely
   **/
  @Schema(description = "Is valid indefinitely")
  
    public Boolean isValidIndefinitely() {
    return validIndefinitely;
  }

  public void setValidIndefinitely(Boolean validIndefinitely) {
    this.validIndefinitely = validIndefinitely;
  }

  public MandateToAddMisp validThrough(LocalDate validThrough) {
    this.validThrough = validThrough;
    return this;
  }

  /**
   * Valid through (last day is inclusive, used only if not valid indefinitely)
   * @return validThrough
   **/
  @Schema(example = "Wed Feb 21 00:00:00 GMT 2024", description = "Valid through (last day is inclusive, used only if not valid indefinitely)")
  
    @Valid
    public LocalDate getValidThrough() {
    return validThrough;
  }

  public void setValidThrough(LocalDate validThrough) {
    this.validThrough = validThrough;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateToAddMisp mandateToAddMisp = (MandateToAddMisp) o;
    return Objects.equals(this.namespace, mandateToAddMisp.namespace) &&
        Objects.equals(this.role, mandateToAddMisp.role) &&
        Objects.equals(this.validFrom, mandateToAddMisp.validFrom) &&
        Objects.equals(this.validIndefinitely, mandateToAddMisp.validIndefinitely) &&
        Objects.equals(this.validThrough, mandateToAddMisp.validThrough);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, role, validFrom, validIndefinitely, validThrough);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateToAddMisp {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validIndefinitely: ").append(toIndentedString(validIndefinitely)).append("\n");
    sb.append("    validThrough: ").append(toIndentedString(validThrough)).append("\n");
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
