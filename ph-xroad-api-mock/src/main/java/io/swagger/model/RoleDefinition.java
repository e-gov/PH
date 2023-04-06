package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Translation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleDefinition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-05T11:46:16.611771420Z[GMT]")
@Builder
@ToString
@EqualsAndHashCode
public class RoleDefinition   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("title")
  private Translation title = null;

  @JsonProperty("description")
  private Translation description = null;

  @JsonProperty("modified")
  private OffsetDateTime modified = null;

  @JsonProperty("canSubDelegate")
  private Boolean canSubDelegate = null;

  /**
   * Gets or Sets representeeType
   */
  public enum RepresenteeTypeEnum {
    LEGAL_PERSON("LEGAL_PERSON"),
    
    NATURAL_PERSON("NATURAL_PERSON"),
    
    GORVENRMENT_PERSON("GORVENRMENT_PERSON");

    private String value;

    RepresenteeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RepresenteeTypeEnum fromValue(String text) {
      for (RepresenteeTypeEnum b : RepresenteeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("representeeType")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<RepresenteeTypeEnum> representeeType = null;

  /**
   * Gets or Sets delegateType
   */
  public enum DelegateTypeEnum {
    LEGAL_PERSON("LEGAL_PERSON"),
    
    NATURAL_PERSON("NATURAL_PERSON");

    private String value;

    DelegateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DelegateTypeEnum fromValue(String text) {
      for (DelegateTypeEnum b : DelegateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("delegateType")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<DelegateTypeEnum> delegateType = null;

  @JsonProperty("assignableBy")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<String> assignableBy = null;

  @JsonProperty("deletableBy")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<String> deletableBy = null;

  @JsonProperty("deletableByDelegate")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean deletableByDelegate = null;

  @JsonProperty("visible")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean visible = null;

  @JsonProperty("canAssignIfHasRoleAndOneOf")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<String> canAssignIfHasRoleAndOneOf = null;

  @JsonProperty("canDeleteIfHasRoleAndOneOf")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<String> canDeleteIfHasRoleAndOneOf = null;

  public RoleDefinition code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Namespace code + \":\" + role code. Role code can contain any UTF-8 character (even spaces and colons).
   * @return code
   **/
  @Schema(example = "STAT_ESTAT:Respondent", required = true, description = "Namespace code + \":\" + role code. Role code can contain any UTF-8 character (even spaces and colons).")
      @NotNull

    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RoleDefinition title(Translation title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Translation getTitle() {
    return title;
  }

  public void setTitle(Translation title) {
    this.title = title;
  }

  public RoleDefinition description(Translation description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    @Valid
    public Translation getDescription() {
    return description;
  }

  public void setDescription(Translation description) {
    this.description = description;
  }

  public RoleDefinition modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Last modified
   * @return modified
   **/
  @Schema(example = "2022-10-18T13:00+02:00", implementation = OffsetDateTime.class, description = "Last modified")
  
    @Valid
    public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public RoleDefinition canSubDelegate(Boolean canSubDelegate) {
    this.canSubDelegate = canSubDelegate;
    return this;
  }

  /**
   * Can this role be given out with the right to sub-delegate it.
   * @return canSubDelegate
   **/
  @Schema(description = "Can this role be given out with the right to sub-delegate it.")
  
    public Boolean isCanSubDelegate() {
    return canSubDelegate;
  }

  public void setCanSubDelegate(Boolean canSubDelegate) {
    this.canSubDelegate = canSubDelegate;
  }

  public RoleDefinition representeeType(List<RepresenteeTypeEnum> representeeType) {
    this.representeeType = representeeType;
    return this;
  }

  public RoleDefinition addRepresenteeTypeItem(RepresenteeTypeEnum representeeTypeItem) {
    if (this.representeeType == null) {
      this.representeeType = new ArrayList<RepresenteeTypeEnum>();
    }
    this.representeeType.add(representeeTypeItem);
    return this;
  }

  /**
   * What type of representees are allowed to delegate this role. GOVERNMENT_PERSON is a sub-type of a LEGAL_PERSON whose Estonian registry code starts with 7 (state and local government bodies).
   * @return representeeType
   **/
  @Schema(example = "[\"LEGAL_PERSON\",\"NATURAL_PERSON\"]", description = "What type of representees are allowed to delegate this role. GOVERNMENT_PERSON is a sub-type of a LEGAL_PERSON whose Estonian registry code starts with 7 (state and local government bodies).")
  
    public List<RepresenteeTypeEnum> getRepresenteeType() {
    return representeeType;
  }

  public void setRepresenteeType(List<RepresenteeTypeEnum> representeeType) {
    this.representeeType = representeeType;
  }

  public RoleDefinition delegateType(List<DelegateTypeEnum> delegateType) {
    this.delegateType = delegateType;
    return this;
  }

  public RoleDefinition addDelegateTypeItem(DelegateTypeEnum delegateTypeItem) {
    if (this.delegateType == null) {
      this.delegateType = new ArrayList<DelegateTypeEnum>();
    }
    this.delegateType.add(delegateTypeItem);
    return this;
  }

  /**
   * Whom this mandate can be assigned to. If not set then there are no restrictions.
   * @return delegateType
   **/
  @Schema(description = "Whom this mandate can be assigned to. If not set then there are no restrictions.")
  
    public List<DelegateTypeEnum> getDelegateType() {
    return delegateType;
  }

  public void setDelegateType(List<DelegateTypeEnum> delegateType) {
    this.delegateType = delegateType;
  }

  public RoleDefinition assignableBy(List<String> assignableBy) {
    this.assignableBy = assignableBy;
    return this;
  }

  public RoleDefinition addAssignableByItem(String assignableByItem) {
    if (this.assignableBy == null) {
      this.assignableBy = new ArrayList<String>();
    }
    this.assignableBy.add(assignableByItem);
    return this;
  }

  /**
   * Who has a mandatate with role in the list can give this mandate. There are situations when the list is empty.
   * @return assignableBy
   **/
  @Schema(example = "[\"FROM_BUSINESS_REGISTRY:MANAGEMENT_BOARD_MEMBER\",\"EMTA:I\"]", description = "Who has a mandatate with role in the list can give this mandate. There are situations when the list is empty.")
  
    public List<String> getAssignableBy() {
    return assignableBy;
  }

  public void setAssignableBy(List<String> assignableBy) {
    this.assignableBy = assignableBy;
  }

  public RoleDefinition deletableBy(List<String> deletableBy) {
    this.deletableBy = deletableBy;
    return this;
  }

  public RoleDefinition addDeletableByItem(String deletableByItem) {
    if (this.deletableBy == null) {
      this.deletableBy = new ArrayList<String>();
    }
    this.deletableBy.add(deletableByItem);
    return this;
  }

  /**
   * Who has a mandatate with role in the list can delete this mandate. If this list is not given then assignableBy is used.
   * @return deletableBy
   **/
  @Schema(example = "[\"FROM_BUSINESS_REGISTRY:MANAGEMENT_BOARD_MEMBER\",\"EMTA:I\"]", description = "Who has a mandatate with role in the list can delete this mandate. If this list is not given then assignableBy is used.")
  
    public List<String> getDeletableBy() {
    return deletableBy;
  }

  public void setDeletableBy(List<String> deletableBy) {
    this.deletableBy = deletableBy;
  }

  public RoleDefinition deletableByDelegate(Boolean deletableByDelegate) {
    this.deletableByDelegate = deletableByDelegate;
    return this;
  }

  /**
   * Is delegate allowed to delete (in Estonian \"loobuda\") a mandate with this role. True by default. False value is used (among other use cases) for management board members.
   * @return deletableByDelegate
   **/
  @Schema(description = "Is delegate allowed to delete (in Estonian \"loobuda\") a mandate with this role. True by default. False value is used (among other use cases) for management board members.")
  
    public Boolean isDeletableByDelegate() {
    return deletableByDelegate;
  }

  public void setDeletableByDelegate(Boolean deletableByDelegate) {
    this.deletableByDelegate = deletableByDelegate;
  }

  public RoleDefinition visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

  /**
   * True by default. Only visible roles are shown in Pääsuke and non-visible ones are not shown out. Non-visible role is a method to inform Pääsuke that a person can add some other role. For example we can create role AA with property AA.assignableBy:BB. Now we can create non-visible role BB that we add to persons who actually can add role AA.
   * @return visible
   **/
  @Schema(description = "True by default. Only visible roles are shown in Pääsuke and non-visible ones are not shown out. Non-visible role is a method to inform Pääsuke that a person can add some other role. For example we can create role AA with property AA.assignableBy:BB. Now we can create non-visible role BB that we add to persons who actually can add role AA.")
  
    public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public RoleDefinition canAssignIfHasRoleAndOneOf(List<String> canAssignIfHasRoleAndOneOf) {
    this.canAssignIfHasRoleAndOneOf = canAssignIfHasRoleAndOneOf;
    return this;
  }

  public RoleDefinition addCanAssignIfHasRoleAndOneOfItem(String canAssignIfHasRoleAndOneOfItem) {
    if (this.canAssignIfHasRoleAndOneOf == null) {
      this.canAssignIfHasRoleAndOneOf = new ArrayList<String>();
    }
    this.canAssignIfHasRoleAndOneOf.add(canAssignIfHasRoleAndOneOfItem);
    return this;
  }

  /**
   * A delegate can create a mandate with this role if the delegate has the following two conditions fulfilled&colon; 1) the delegate has a mandatate with role in the list 2) the deletate has a mandate with the role itself (so in order to add a role you must have that role yourself)
   * @return canAssignIfHasRoleAndOneOf
   **/
  @Schema(example = "[\"RR_PARTNER:VOLITUSTE_HALDUR_ENDA_ROLLIDE_PIIRES\"]", description = "A delegate can create a mandate with this role if the delegate has the following two conditions fulfilled&colon; 1) the delegate has a mandatate with role in the list 2) the deletate has a mandate with the role itself (so in order to add a role you must have that role yourself)")
  
    public List<String> getCanAssignIfHasRoleAndOneOf() {
    return canAssignIfHasRoleAndOneOf;
  }

  public void setCanAssignIfHasRoleAndOneOf(List<String> canAssignIfHasRoleAndOneOf) {
    this.canAssignIfHasRoleAndOneOf = canAssignIfHasRoleAndOneOf;
  }

  public RoleDefinition canDeleteIfHasRoleAndOneOf(List<String> canDeleteIfHasRoleAndOneOf) {
    this.canDeleteIfHasRoleAndOneOf = canDeleteIfHasRoleAndOneOf;
    return this;
  }

  public RoleDefinition addCanDeleteIfHasRoleAndOneOfItem(String canDeleteIfHasRoleAndOneOfItem) {
    if (this.canDeleteIfHasRoleAndOneOf == null) {
      this.canDeleteIfHasRoleAndOneOf = new ArrayList<String>();
    }
    this.canDeleteIfHasRoleAndOneOf.add(canDeleteIfHasRoleAndOneOfItem);
    return this;
  }

  /**
   * A delegate can delete mandates with this role if the delegate has the following two conditions fulfilled&colon; 1) the delegate has a mandatate with role in the list 2) the deletate has a mandate with the role itself (so in order to delete a role you must have that role yourself)
   * @return canDeleteIfHasRoleAndOneOf
   **/
  @Schema(example = "[\"RR_PARTNER:VOLITUSTE_HALDUR_ENDA_ROLLIDE_PIIRES\"]", description = "A delegate can delete mandates with this role if the delegate has the following two conditions fulfilled&colon; 1) the delegate has a mandatate with role in the list 2) the deletate has a mandate with the role itself (so in order to delete a role you must have that role yourself)")
  
    public List<String> getCanDeleteIfHasRoleAndOneOf() {
    return canDeleteIfHasRoleAndOneOf;
  }

  public void setCanDeleteIfHasRoleAndOneOf(List<String> canDeleteIfHasRoleAndOneOf) {
    this.canDeleteIfHasRoleAndOneOf = canDeleteIfHasRoleAndOneOf;
  }

}
