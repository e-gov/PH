package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.RoleMetadata;
import io.swagger.model.Translation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleDefinition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T12:22:46.494Z[GMT]")


public class RoleDefinition   {
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("title")
  @Valid
  private List<Translation> title = null;

  @JsonProperty("description")
  @Valid
  private List<Translation> description = null;

  /**
   * Role is ACTIVE if it can be assigned; ACTIVE_GOVERNMENT if role can be assigned only to representees that are govenrment agencyes (representee registry code starts with 7); HIDDEN if role is still supported but cannot be assigned to new employees; REMOVED if role is no longer in action
   */
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    ACTIVE_GOVERNMENT("ACTIVE_GOVERNMENT"),
    
    HIDDEN("HIDDEN"),
    
    REMOVED("REMOVED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("state")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private StateEnum state = null;

  @JsonProperty("modified")
  private OffsetDateTime modified = null;

  @JsonProperty("metadata")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private RoleMetadata metadata = null;

  public RoleDefinition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID
   * @return id
   **/
  @Schema(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", description = "ID")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RoleDefinition namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace
   * @return namespace
   **/
  @Schema(example = "STAT", required = true, description = "Namespace")
      @NotNull

    public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public RoleDefinition role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role
   * @return role
   **/
  @Schema(example = "Respondent", required = true, description = "Role")
      @NotNull

    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RoleDefinition title(List<Translation> title) {
    this.title = title;
    return this;
  }

  public RoleDefinition addTitleItem(Translation titleItem) {
    if (this.title == null) {
      this.title = new ArrayList<Translation>();
    }
    this.title.add(titleItem);
    return this;
  }

  /**
   * Title
   * @return title
   **/
  @Schema(description = "Title")
      @Valid
    public List<Translation> getTitle() {
    return title;
  }

  public void setTitle(List<Translation> title) {
    this.title = title;
  }

  public RoleDefinition description(List<Translation> description) {
    this.description = description;
    return this;
  }

  public RoleDefinition addDescriptionItem(Translation descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<Translation>();
    }
    this.description.add(descriptionItem);
    return this;
  }

  /**
   * Description
   * @return description
   **/
  @Schema(description = "Description")
      @Valid
    public List<Translation> getDescription() {
    return description;
  }

  public void setDescription(List<Translation> description) {
    this.description = description;
  }

  public RoleDefinition state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Role is ACTIVE if it can be assigned; ACTIVE_GOVERNMENT if role can be assigned only to representees that are govenrment agencyes (representee registry code starts with 7); HIDDEN if role is still supported but cannot be assigned to new employees; REMOVED if role is no longer in action
   * @return state
   **/
  @Schema(description = "Role is ACTIVE if it can be assigned; ACTIVE_GOVERNMENT if role can be assigned only to representees that are govenrment agencyes (representee registry code starts with 7); HIDDEN if role is still supported but cannot be assigned to new employees; REMOVED if role is no longer in action")
  
    public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public RoleDefinition modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Last modified
   * @return modified
   **/
  @Schema(example = "2022-10-18T13:00+02:00", description = "Last modified")
  
    @Valid
    public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public RoleDefinition metadata(RoleMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public RoleMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(RoleMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleDefinition roleDefinition = (RoleDefinition) o;
    return Objects.equals(this.id, roleDefinition.id) &&
        Objects.equals(this.namespace, roleDefinition.namespace) &&
        Objects.equals(this.role, roleDefinition.role) &&
        Objects.equals(this.title, roleDefinition.title) &&
        Objects.equals(this.description, roleDefinition.description) &&
        Objects.equals(this.state, roleDefinition.state) &&
        Objects.equals(this.modified, roleDefinition.modified) &&
        Objects.equals(this.metadata, roleDefinition.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, namespace, role, title, description, state, modified, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
