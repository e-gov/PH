package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Link
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-09T08:21:54.440Z[GMT]")


public class Link   {
  @JsonProperty("href")
  private String href = null;

  @JsonProperty("rel")
  private String rel = null;

  public Link href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
   **/
  @Schema(example = "/namespaces/STAT/representees/representeeIdentifierAtStat/delegates/delegateidentifierAtStat/mandates/roleIdentifierAtStat", description = "")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Link rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Get rel
   * @return rel
   **/
  @Schema(example = "delete", description = "")
  
    public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.href, link.href) &&
        Objects.equals(this.rel, link.rel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, rel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
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
