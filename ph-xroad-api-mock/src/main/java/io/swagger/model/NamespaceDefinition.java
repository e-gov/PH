package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.NamespaceOwner;
import io.swagger.model.Translation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NamespaceDefinition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-23T09:37:06.463Z[GMT]")


public class NamespaceDefinition   {
  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("parentNamespace")
  private String parentNamespace = null;

  @JsonProperty("title")
  private Translation title = null;

  @JsonProperty("hiddenDescription")
  private Translation hiddenDescription = null;

  /**
   * Roles in PARENT namespace cannot be assigned to delegates. CHILD namespace must point at some parent_namespace and can only declare roles that exists in that parent namespace. AUTOMATIC namespace has roles that are automatically assigned and removed from persons based on some external info (for example when becoming a management board member of some company). STANDALONE roles are regular roles. EXTERNAL roles (and mandates connected with these roles) are stored at owner's side and only made available to Pääsuke.
   */
  public enum TypeEnum {
    PARENT("PARENT"),
    
    CHILD("CHILD"),
    
    STANDALONE("STANDALONE"),
    
    AUTOMATIC("AUTOMATIC"),
    
    EXTERNAL("EXTERNAL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("owner")
  private NamespaceOwner owner = null;

  public NamespaceDefinition namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace
   * @return namespace
   **/
  @Schema(example = "STAT", required = true, description = "Namespace")
      @NotNull

  @Pattern(regexp="[A-Z0-9_\\.]+")   public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public NamespaceDefinition parentNamespace(String parentNamespace) {
    this.parentNamespace = parentNamespace;
    return this;
  }

  /**
   * Parent namespace (has value if namespace type is set to 'CHILD')
   * @return parentNamespace
   **/
  @Schema(description = "Parent namespace (has value if namespace type is set to 'CHILD')")
  
    public String getParentNamespace() {
    return parentNamespace;
  }

  public void setParentNamespace(String parentNamespace) {
    this.parentNamespace = parentNamespace;
  }

  public NamespaceDefinition title(Translation title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @Schema(description = "")
  
    @Valid
    public Translation getTitle() {
    return title;
  }

  public void setTitle(Translation title) {
    this.title = title;
  }

  public NamespaceDefinition hiddenDescription(Translation hiddenDescription) {
    this.hiddenDescription = hiddenDescription;
    return this;
  }

  /**
   * Get hiddenDescription
   * @return hiddenDescription
   **/
  @Schema(description = "")
  
    @Valid
    public Translation getHiddenDescription() {
    return hiddenDescription;
  }

  public void setHiddenDescription(Translation hiddenDescription) {
    this.hiddenDescription = hiddenDescription;
  }

  public NamespaceDefinition type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Roles in PARENT namespace cannot be assigned to delegates. CHILD namespace must point at some parent_namespace and can only declare roles that exists in that parent namespace. AUTOMATIC namespace has roles that are automatically assigned and removed from persons based on some external info (for example when becoming a management board member of some company). STANDALONE roles are regular roles. EXTERNAL roles (and mandates connected with these roles) are stored at owner's side and only made available to Pääsuke.
   * @return type
   **/
  @Schema(example = "STANDALONE", description = "Roles in PARENT namespace cannot be assigned to delegates. CHILD namespace must point at some parent_namespace and can only declare roles that exists in that parent namespace. AUTOMATIC namespace has roles that are automatically assigned and removed from persons based on some external info (for example when becoming a management board member of some company). STANDALONE roles are regular roles. EXTERNAL roles (and mandates connected with these roles) are stored at owner's side and only made available to Pääsuke.")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NamespaceDefinition owner(NamespaceOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   **/
  @Schema(description = "")
  
    @Valid
    public NamespaceOwner getOwner() {
    return owner;
  }

  public void setOwner(NamespaceOwner owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceDefinition namespaceDefinition = (NamespaceDefinition) o;
    return Objects.equals(this.namespace, namespaceDefinition.namespace) &&
        Objects.equals(this.parentNamespace, namespaceDefinition.parentNamespace) &&
        Objects.equals(this.title, namespaceDefinition.title) &&
        Objects.equals(this.hiddenDescription, namespaceDefinition.hiddenDescription) &&
        Objects.equals(this.type, namespaceDefinition.type) &&
        Objects.equals(this.owner, namespaceDefinition.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, parentNamespace, title, hiddenDescription, type, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceDefinition {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    parentNamespace: ").append(toIndentedString(parentNamespace)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    hiddenDescription: ").append(toIndentedString(hiddenDescription)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
