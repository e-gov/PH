package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Link;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mandate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-15T06:15:59.962Z[GMT]")


public class Mandate   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("validFrom")
  private LocalDate validFrom = null;

  @JsonProperty("validThrough")
  private LocalDate validThrough = null;

  @JsonProperty("canSubDelegate")
  private Boolean canSubDelegate = null;

  @JsonProperty("links")
  @Valid
  private List<Link> links = null;

  public Mandate id(String id) {
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

  public Mandate namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace
   * @return namespace
   **/
  @Schema(example = "EMTA", required = true, description = "Namespace")
      @NotNull

    public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public Mandate role(String role) {
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

  public Mandate validFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Valid from
   * @return validFrom
   **/
  @Schema(example = "Fri Jul 21 00:00:00 GMT 2017", description = "Valid from")
  
    @Valid
    public LocalDate getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }

  public Mandate validThrough(LocalDate validThrough) {
    this.validThrough = validThrough;
    return this;
  }

  /**
   * Valid through (last day is inclusive, null if valid indefinitely)
   * @return validThrough
   **/
  @Schema(example = "Wed Feb 21 00:00:00 GMT 2024", description = "Valid through (last day is inclusive, null if valid indefinitely)")
  
    @Valid
    public LocalDate getValidThrough() {
    return validThrough;
  }

  public void setValidThrough(LocalDate validThrough) {
    this.validThrough = validThrough;
  }

  public Mandate canSubDelegate(Boolean canSubDelegate) {
    this.canSubDelegate = canSubDelegate;
    return this;
  }

  /**
   * Does the person have the right to sub-delegate (edasi volitada) this mandate.
   * @return canSubDelegate
   **/
  @Schema(description = "Does the person have the right to sub-delegate (edasi volitada) this mandate.")
  
    public Boolean isCanSubDelegate() {
    return canSubDelegate;
  }

  public void setCanSubDelegate(Boolean canSubDelegate) {
    this.canSubDelegate = canSubDelegate;
  }

  public Mandate links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Mandate addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Links that indicate allowed actions (like delete) and provide params for for calling other services
   * @return links
   **/
  @Schema(description = "Links that indicate allowed actions (like delete) and provide params for for calling other services")
      @Valid
    public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mandate mandate = (Mandate) o;
    return Objects.equals(this.id, mandate.id) &&
        Objects.equals(this.namespace, mandate.namespace) &&
        Objects.equals(this.role, mandate.role) &&
        Objects.equals(this.validFrom, mandate.validFrom) &&
        Objects.equals(this.validThrough, mandate.validThrough) &&
        Objects.equals(this.canSubDelegate, mandate.canSubDelegate) &&
        Objects.equals(this.links, mandate.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, namespace, role, validFrom, validThrough, canSubDelegate, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validThrough: ").append(toIndentedString(validThrough)).append("\n");
    sb.append("    canSubDelegate: ").append(toIndentedString(canSubDelegate)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
