package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandateLinks
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
@EqualsAndHashCode
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
  @Schema(example = "/v1/representees/{representeeId}/delegates/{delegateId}/mandates/{mandateId}", description = "")
  
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
  @Schema(example = "/v1/representees/{representee}/delegates/{delegate}/mandates/{mandateId}/subdelegates", description = "")
  
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

}
