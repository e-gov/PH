package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Translation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A Problem Details object (RFC 7807)
 */
@Schema(description = "A Problem Details object (RFC 7807)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-03T08:03:34.064Z[GMT]")


public class Problem   {
  @JsonProperty("type")
  private String type = "about:blank";

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("translation")
  private Translation translation = null;

  @JsonProperty("ticket")
  private String ticket = null;

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

  public Problem ticket(String ticket) {
    this.ticket = ticket;
    return this;
  }

  /**
   * Reference that identifies the specific occurrence of the problem. It may or may not yield further information if dereferenced.
   * @return ticket
   **/
  @Schema(description = "Reference that identifies the specific occurrence of the problem. It may or may not yield further information if dereferenced.")
  
    public String getTicket() {
    return ticket;
  }

  public void setTicket(String ticket) {
    this.ticket = ticket;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problem problem = (Problem) o;
    return Objects.equals(this.type, problem.type) &&
        Objects.equals(this.href, problem.href) &&
        Objects.equals(this.title, problem.title) &&
        Objects.equals(this.translation, problem.translation) &&
        Objects.equals(this.ticket, problem.ticket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, href, title, translation, ticket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    translation: ").append(toIndentedString(translation)).append("\n");
    sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
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
