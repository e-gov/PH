package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandateLinks
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-14T09:20:23.675Z[GMT]")

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MandateLinks   {
  @JsonProperty("delete")
  private String delete = null;

  @JsonProperty("addSubDelegate")
  private String addSubDelegate = null;

  @JsonProperty("origin")
  private String origin = null;

  public MandateLinks delete(String delete) {
    this.delete = delete;
    return this;
  }

  /**
   * Get delete
   * @return delete
   **/
  @Schema(example = "/v1/nss/{ns}/representees/{representeeId}/delegates/{delegateId}/mandates/{mandateId}", description = "")
  
    public String getDelete() {
    return delete;
  }

  public void setDelete(String delete) {
    this.delete = delete;
  }

  public MandateLinks addSubDelegate(String addSubDelegate) {
    this.addSubDelegate = addSubDelegate;
    return this;
  }

  /**
   * Get addSubDelegate
   * @return addSubDelegate
   **/
  @Schema(example = "/v1/nss/{ns}/representees/{representee}/delegates/{delegate}/mandates/{mandateId}/subdelegates", description = "")
  
    public String getAddSubDelegate() {
    return addSubDelegate;
  }

  public void setAddSubDelegate(String addSubDelegate) {
    this.addSubDelegate = addSubDelegate;
  }

  public MandateLinks origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
   **/
  @Schema(example = "https://vaarikas.emta.ee/view/123", description = "")
  
    public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateLinks mandateLinks = (MandateLinks) o;
    return Objects.equals(this.delete, mandateLinks.delete) &&
        Objects.equals(this.addSubDelegate, mandateLinks.addSubDelegate) &&
        Objects.equals(this.origin, mandateLinks.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delete, addSubDelegate, origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateLinks {\n");
    
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    addSubDelegate: ").append(toIndentedString(addSubDelegate)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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
