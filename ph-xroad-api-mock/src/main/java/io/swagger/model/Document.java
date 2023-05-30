package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * If the operation was digitally signed then a document was created. This provides information about the signed container.
 */
@Schema(description = "If the operation was digitally signed then a document was created. This provides information about the signed container.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:36:08.218418870Z[GMT]")
@ToString
@EqualsAndHashCode
public class Document   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("singleDelegate")
  private Boolean singleDelegate = null;

  public Document uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Unique identifier that points to the signed document
   * @return uuid
   **/
  @Schema(example = "5b72e01c-fa7f-479c-b014-cc19efe5b732", description = "Unique identifier that points to the signed document")
  
    public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Document singleDelegate(Boolean singleDelegate) {
    this.singleDelegate = singleDelegate;
    return this;
  }

  /**
   * True in case the signed document contains information about a single delegate and it is safe to reveal the document to the delegate. False means that the signed contaier contains information about multiple delegates and it is only safe to reveal it to the representee.
   * @return singleDelegate
   **/
  @Schema(description = "True in case the signed document contains information about a single delegate and it is safe to reveal the document to the delegate. False means that the signed contaier contains information about multiple delegates and it is only safe to reveal it to the representee.")
  
    public Boolean isSingleDelegate() {
    return singleDelegate;
  }

  public void setSingleDelegate(Boolean singleDelegate) {
    this.singleDelegate = singleDelegate;
  }

}
