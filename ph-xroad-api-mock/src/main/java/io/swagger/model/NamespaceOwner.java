package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NamespaceOwner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T12:22:46.494Z[GMT]")


public class NamespaceOwner   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("code")
  private String code = null;

  public NamespaceOwner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the agency who is the maintainer of the namespace
   * @return name
   **/
  @Schema(example = "RIA", required = true, description = "Name of the agency who is the maintainer of the namespace")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NamespaceOwner code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Registry code of the maintainer
   * @return code
   **/
  @Schema(example = "70006317", description = "Registry code of the maintainer")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceOwner namespaceOwner = (NamespaceOwner) o;
    return Objects.equals(this.name, namespaceOwner.name) &&
        Objects.equals(this.code, namespaceOwner.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceOwner {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
