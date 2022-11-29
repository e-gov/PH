package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MandateToAdd;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandatesToAdd
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T12:22:46.494Z[GMT]")


public class MandatesToAdd   {
  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("mandates")
  @Valid
  private List<MandateToAdd> mandates = new ArrayList<MandateToAdd>();

  public MandatesToAdd comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * The reason why mandates are added manually
   * @return comment
   **/
  @Schema(required = true, description = "The reason why mandates are added manually")
      @NotNull

    public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public MandatesToAdd mandates(List<MandateToAdd> mandates) {
    this.mandates = mandates;
    return this;
  }

  public MandatesToAdd addMandatesItem(MandateToAdd mandatesItem) {
    this.mandates.add(mandatesItem);
    return this;
  }

  /**
   * Mandates to be added
   * @return mandates
   **/
  @Schema(required = true, description = "Mandates to be added")
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
    MandatesToAdd mandatesToAdd = (MandatesToAdd) o;
    return Objects.equals(this.comment, mandatesToAdd.comment) &&
        Objects.equals(this.mandates, mandatesToAdd.mandates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, mandates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandatesToAdd {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
