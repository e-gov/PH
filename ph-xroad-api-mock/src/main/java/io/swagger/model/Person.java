package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Link;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T12:22:46.494Z[GMT]")


public class Person   {
  @JsonProperty("id")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String id = null;

  /**
   * Type
   */
  public enum TypeEnum {
    NATURAL_PERSON("NATURAL_PERSON"),
    
    LEGAL_ENTITY("LEGAL_ENTITY");

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

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("identityCodeCountry")
  private String identityCodeCountry = null;

  @JsonProperty("identityCode")
  private String identityCode = null;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("links")
  @Valid
  private List<Link> links = null;

  public Person id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID
   * @return id
   **/
  @Schema(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, description = "ID")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Person type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type
   * @return type
   **/
  @Schema(required = true, description = "Type")
      @NotNull

    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Person name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name
   * @return name
   **/
  @Schema(example = "Jüri Juurikas", description = "Name")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person identityCodeCountry(String identityCodeCountry) {
    this.identityCodeCountry = identityCodeCountry;
    return this;
  }

  /**
   * Identity code country
   * @return identityCodeCountry
   **/
  @Schema(example = "EE", required = true, description = "Identity code country")
      @NotNull

    public String getIdentityCodeCountry() {
    return identityCodeCountry;
  }

  public void setIdentityCodeCountry(String identityCodeCountry) {
    this.identityCodeCountry = identityCodeCountry;
  }

  public Person identityCode(String identityCode) {
    this.identityCode = identityCode;
    return this;
  }

  /**
   * Identity code
   * @return identityCode
   **/
  @Schema(example = "38302250123", required = true, description = "Identity code")
      @NotNull

    public String getIdentityCode() {
    return identityCode;
  }

  public void setIdentityCode(String identityCode) {
    this.identityCode = identityCode;
  }

  public Person links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Person addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Links that indicate allowed actions and provide parameters for for calling other services
   * @return links
   **/
  @Schema(description = "Links that indicate allowed actions and provide parameters for for calling other services")
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
    Person person = (Person) o;
    return Objects.equals(this.id, person.id) &&
        Objects.equals(this.type, person.type) &&
        Objects.equals(this.name, person.name) &&
        Objects.equals(this.identityCodeCountry, person.identityCodeCountry) &&
        Objects.equals(this.identityCode, person.identityCode) &&
        Objects.equals(this.links, person.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, identityCodeCountry, identityCode, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identityCodeCountry: ").append(toIndentedString(identityCodeCountry)).append("\n");
    sb.append("    identityCode: ").append(toIndentedString(identityCode)).append("\n");
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
