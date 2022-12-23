package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MandateToAddMisp;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandatesToAddMisp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-19T09:44:20.956Z[GMT]")


public class MandatesToAddMisp   {
  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("mandates")
  @Valid
  private List<MandateToAddMisp> mandates = new ArrayList<MandateToAddMisp>();

  public MandatesToAddMisp comment(String comment) {
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

  public MandatesToAddMisp mandates(List<MandateToAddMisp> mandates) {
    this.mandates = mandates;
    return this;
  }

  public MandatesToAddMisp addMandatesItem(MandateToAddMisp mandatesItem) {
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
    public List<MandateToAddMisp> getMandates() {
    return mandates;
  }

  public void setMandates(List<MandateToAddMisp> mandates) {
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
    MandatesToAddMisp mandatesToAddMisp = (MandatesToAddMisp) o;
    return Objects.equals(this.comment, mandatesToAddMisp.comment) &&
        Objects.equals(this.mandates, mandatesToAddMisp.mandates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, mandates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandatesToAddMisp {\n");
    
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
