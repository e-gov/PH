package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Translation;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A Problem Details object (RFC 7807)
 */
@Schema(description = "A Problem Details object (RFC 7807)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")
@ToString
@EqualsAndHashCode
public class Problem   {
  @JsonProperty("type")
  private String type = "about:blank";

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("translation")
  private Translation translation = null;

  @JsonProperty("instance")
  private String instance = null;

  public Problem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * An absolute URI that identifies the problem type
   * @return type
   **/
  @Schema(description = "An absolute URI that identifies the problem type")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Problem href(String href) {
    this.href = href;
    return this;
  }

  /**
   * An absolute URI that, when dereferenced, provides human-readable documentation for the problem type (e.g. using HTML).
   * @return href
   **/
  @Schema(description = "An absolute URI that, when dereferenced, provides human-readable documentation for the problem type (e.g. using HTML).")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Problem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A short summary of the problem type. Written in English and readable for engineers (usually not suited for non technical stakeholders and not localized).
   * @return title
   **/
  @Schema(example = "Service Unavailable", description = "A short summary of the problem type. Written in English and readable for engineers (usually not suited for non technical stakeholders and not localized).")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Problem translation(Translation translation) {
    this.translation = translation;
    return this;
  }

  /**
   * Get translation
   * @return translation
   **/
  @Schema(description = "")
  
    @Valid
    public Translation getTranslation() {
    return translation;
  }

  public void setTranslation(Translation translation) {
    this.translation = translation;
  }

  public Problem instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Reference that identifies the specific occurrence of the problem. UI should display this without dashes.
   * @return instance
   **/
  @Schema(description = "Reference that identifies the specific occurrence of the problem. UI should display this without dashes.")
  
    public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

}
