package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")
@ToString
@EqualsAndHashCode
@Builder
public class Person   {
  /**
   * Person type
   */
  public enum TypeEnum {
    NATURAL_PERSON("NATURAL_PERSON"),
    
    LEGAL_PERSON("LEGAL_PERSON"),
    
    UNKNOWN("UNKNOWN"),
    
    OTHER("OTHER");

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

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("surname")
  private String surname = null;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("legalName")
  private String legalName = null;

  @JsonProperty("identifier")
  private String identifier = null;

  public Person type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Person type
   * @return type
   **/
  @Schema(required = true, description = "Person type")
      @NotNull

    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Person firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Person given name(s)
   * @return firstName
   **/
  @Schema(example = "Jüri", description = "Person given name(s)")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Person surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Person surname
   * @return surname
   **/
  @Schema(example = "Juurikas", description = "Person surname")
  
    public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Person legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

  /**
   * Name of legal entity
   * @return legalName
   **/
  @Schema(example = "Juurikas", description = "Name of legal entity")
  
    public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public Person identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Identity code
   * @return identifier
   **/
  @Schema(example = "EE38302250123", required = true, description = "Identity code")
      @NotNull

    public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

}
