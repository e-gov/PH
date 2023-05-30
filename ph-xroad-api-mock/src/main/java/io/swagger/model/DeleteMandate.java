package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Authorization;
import io.swagger.model.Document;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * End the validity of a mandate. When document is not null it means that it was digitally signed by the persons in the authorizations list.
 */
@Schema(description = "End the validity of a mandate. When document is not null it means that it was digitally signed by the persons in the authorizations list.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")
@ToString
@EqualsAndHashCode
public class DeleteMandate   {
  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    DELETE("DELETE");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("action")
  private ActionEnum action = null;

  @JsonProperty("authorizations")
  @Valid
  private List<Authorization> authorizations = null;

  @JsonProperty("document")
  private Document document = null;

  public DeleteMandate action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   **/
  @Schema(example = "DELETE", required = true, description = "")
      @NotNull

    public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public DeleteMandate authorizations(List<Authorization> authorizations) {
    this.authorizations = authorizations;
    return this;
  }

  public DeleteMandate addAuthorizationsItem(Authorization authorizationsItem) {
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

  public DeleteMandate document(Document document) {
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
