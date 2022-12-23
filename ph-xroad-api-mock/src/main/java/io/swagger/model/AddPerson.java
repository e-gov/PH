package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AddPerson
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-23T08:01:40.233Z[GMT]")


public class AddPerson   {
  /**
   * Type
   */
  public enum TypeEnum {
    NATURAL_PERSON("NATURAL_PERSON"),
    
    LEGAL_PERSON("LEGAL_PERSON");

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

  public AddPerson type(TypeEnum type) {
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

  public AddPerson name(String name) {
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

  public AddPerson identityCodeCountry(String identityCodeCountry) {
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

  public AddPerson identityCode(String identityCode) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddPerson addPerson = (AddPerson) o;
    return Objects.equals(this.type, addPerson.type) &&
        Objects.equals(this.name, addPerson.name) &&
        Objects.equals(this.identityCodeCountry, addPerson.identityCodeCountry) &&
        Objects.equals(this.identityCode, addPerson.identityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, identityCodeCountry, identityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPerson {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identityCodeCountry: ").append(toIndentedString(identityCodeCountry)).append("\n");
    sb.append("    identityCode: ").append(toIndentedString(identityCode)).append("\n");
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
