package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-15T06:15:59.962Z[GMT]")


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
  private List<Translation> title = new ArrayList<Translation>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("description")
  @Valid
  private List<Translation> description = null;

  @JsonProperty("modified")
  private OffsetDateTime modified = null;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("metadata")
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
    this.title.add(titleItem);
    return this;
  }

  /**
   * Title
   * @return title
   **/
  @Schema(required = true, description = "Title")
      @NotNull
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
        Objects.equals(this.modified, roleDefinition.modified) &&
        Objects.equals(this.metadata, roleDefinition.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, namespace, role, title, description, modified, metadata);
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
