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
 * Translation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-09T08:21:54.440Z[GMT]")


public class Translation   {
  /**
   * Translation language
   */
  public enum LangEnum {
    ET("et"),
    
    EN("en"),
    
    RU("ru");

    private String value;

    LangEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LangEnum fromValue(String text) {
      for (LangEnum b : LangEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("lang")
  private LangEnum lang = null;

  @JsonProperty("value")
  private String value = null;

  public Translation lang(LangEnum lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Translation language
   * @return lang
   **/
  @Schema(description = "Translation language")
  
    public LangEnum getLang() {
    return lang;
  }

  public void setLang(LangEnum lang) {
    this.lang = lang;
  }

  public Translation value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Translation value
   * @return value
   **/
  @Schema(example = "Translation in that language", description = "Translation value")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
    return Objects.equals(this.lang, translation.lang) &&
        Objects.equals(this.value, translation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Translation {\n");
    
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
