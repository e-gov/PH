package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Translation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")
@ToString
@NoArgsConstructor
@EqualsAndHashCode
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

}
