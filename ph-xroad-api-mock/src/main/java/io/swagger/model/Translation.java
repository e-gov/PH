package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Translation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-23T06:43:43.708Z[GMT]")


public class Translation   {
  @JsonProperty("et")
  private String et = null;

  @JsonProperty("en")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String en = null;

  @JsonProperty("ru")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String ru = null;

  public Translation et(String et) {
    this.et = et;
    return this;
  }

  /**
   * Translation in Estonian
   * @return et
   **/
  @Schema(example = "Tere", required = true, description = "Translation in Estonian")
      @NotNull

    public String getEt() {
    return et;
  }

  public void setEt(String et) {
    this.et = et;
  }

  public Translation en(String en) {
    this.en = en;
    return this;
  }

  /**
   * Translation in English
   * @return en
   **/
  @Schema(example = "Hello", description = "Translation in English")
  
    public String getEn() {
    return en;
  }

  public void setEn(String en) {
    this.en = en;
  }

  public Translation ru(String ru) {
    this.ru = ru;
    return this;
  }

  /**
   * Translation in Russian
   * @return ru
   **/
  @Schema(example = "Привет", description = "Translation in Russian")
  
    public String getRu() {
    return ru;
  }

  public void setRu(String ru) {
    this.ru = ru;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Translation translation = (Translation) o;
    return Objects.equals(this.et, translation.et) &&
        Objects.equals(this.en, translation.en) &&
        Objects.equals(this.ru, translation.ru);
  }

  @Override
  public int hashCode() {
    return Objects.hash(et, en, ru);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Translation {\n");
    
    sb.append("    et: ").append(toIndentedString(et)).append("\n");
    sb.append("    en: ").append(toIndentedString(en)).append("\n");
    sb.append("    ru: ").append(toIndentedString(ru)).append("\n");
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
