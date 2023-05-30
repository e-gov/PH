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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-23T12:54:25.236828535Z[GMT]")
@Builder
@ToString
@EqualsAndHashCode
public class RoleDefinition   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("title")
  private Translation title = null;

  @JsonProperty("addableBy")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<String> addableBy = null;

  @JsonProperty("addableOnlyIfRepresenteeHasRoleIn")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<String> addableOnlyIfRepresenteeHasRoleIn = null;

  @JsonProperty("addingMustBeSigned")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean addingMustBeSigned = null;

  @JsonProperty("canSubDelegate")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean canSubDelegate = null;

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
  @Valid
  private List<DelegateTypeEnum> delegateType = new ArrayList<DelegateTypeEnum>();

  @JsonProperty("delegateCanEqualToRepresentee")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean delegateCanEqualToRepresentee = null;

  @JsonProperty("description")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Translation description = null;

  @JsonProperty("hidden")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean hidden = null;

  @JsonProperty("modified")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private OffsetDateTime modified = null;

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
  @Valid
  private List<RepresenteeTypeEnum> representeeType = new ArrayList<RepresenteeTypeEnum>();

  /**
   * Gets or Sets subDelegateType
   */
  public enum SubDelegateTypeEnum {
    LEGAL_PERSON("LEGAL_PERSON"),
    
    NATURAL_PERSON("NATURAL_PERSON");

    private String value;

    SubDelegateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubDelegateTypeEnum fromValue(String text) {
      for (SubDelegateTypeEnum b : SubDelegateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("subDelegateType")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<SubDelegateTypeEnum> subDelegateType = null;

  @JsonProperty("subDelegableBy")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<String> subDelegableBy = null;

  @JsonProperty("waivableBy")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<String> waivableBy = null;

  @JsonProperty("waivingMustBeSigned")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean waivingMustBeSigned = null;

  @JsonProperty("withdrawableBy")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<String> withdrawableBy = null;

  @JsonProperty("withdrawalMustBeSigned")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean withdrawalMustBeSigned = null;

  @JsonProperty("assignableBy")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<String> assignableBy = null;

  @JsonProperty("assignableOnlyIfRepresenteeHasRoleIn")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Valid
  private List<String> assignableOnlyIfRepresenteeHasRoleIn = null;

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

  public RoleDefinition addableBy(List<String> addableBy) {
    this.addableBy = addableBy;
    return this;
  }

  public RoleDefinition addAddableByItem(String addableByItem) {
    if (this.addableBy == null) {
      this.addableBy = new ArrayList<String>();
    }
    this.addableBy.add(addableByItem);
    return this;
  }

  /**
   * In order to add a mandate with this role the user representing the representee must have a valid mandate with a role in this list. If the value is empty or null, this role cannot be assigned from Pääsuke. If the role is configured so that representeeType has the value NATURAL_PERSON in it then add \"NAT_REPRIGHT:SOLEREP\" to this list - this value indicates that a natural person (as a representee) is allowed to add a mandate with this role if the natural person adding the mandate has the right to represent oneself (kui volituse andja teovõime ei ole piiratud).
   * @return addableBy
   **/
  @Schema(example = "[\"BR_REPRIGHT:SOLEREP\",\"EMTA:I\"]", description = "In order to add a mandate with this role the user representing the representee must have a valid mandate with a role in this list. If the value is empty or null, this role cannot be assigned from Pääsuke. If the role is configured so that representeeType has the value NATURAL_PERSON in it then add \"NAT_REPRIGHT:SOLEREP\" to this list - this value indicates that a natural person (as a representee) is allowed to add a mandate with this role if the natural person adding the mandate has the right to represent oneself (kui volituse andja teovõime ei ole piiratud).")
  
    public List<String> getAddableBy() {
    return addableBy;
  }

  public void setAddableBy(List<String> addableBy) {
    this.addableBy = addableBy;
  }

  public RoleDefinition addableOnlyIfRepresenteeHasRoleIn(List<String> addableOnlyIfRepresenteeHasRoleIn) {
    this.addableOnlyIfRepresenteeHasRoleIn = addableOnlyIfRepresenteeHasRoleIn;
    return this;
  }

  public RoleDefinition addAddableOnlyIfRepresenteeHasRoleInItem(String addableOnlyIfRepresenteeHasRoleInItem) {
    if (this.addableOnlyIfRepresenteeHasRoleIn == null) {
      this.addableOnlyIfRepresenteeHasRoleIn = new ArrayList<String>();
    }
    this.addableOnlyIfRepresenteeHasRoleIn.add(addableOnlyIfRepresenteeHasRoleInItem);
    return this;
  }

  /**
   * Defining this list is used in rare cases where in order to assign the role, the <u>representee</u> also must have at least one mandate with a role in this list. For example to add some PRIA role the user representing the <u>representee</u> must have a role in the addableBy list and the representee must have the role \"PRIA:PRIA.customer\"
   * @return addableOnlyIfRepresenteeHasRoleIn
   **/
  @Schema(example = "[\"PRIA:PRIA.customer\"]", description = "Defining this list is used in rare cases where in order to assign the role, the <u>representee</u> also must have at least one mandate with a role in this list. For example to add some PRIA role the user representing the <u>representee</u> must have a role in the addableBy list and the representee must have the role \"PRIA:PRIA.customer\"")
  
    public List<String> getAddableOnlyIfRepresenteeHasRoleIn() {
    return addableOnlyIfRepresenteeHasRoleIn;
  }

  public void setAddableOnlyIfRepresenteeHasRoleIn(List<String> addableOnlyIfRepresenteeHasRoleIn) {
    this.addableOnlyIfRepresenteeHasRoleIn = addableOnlyIfRepresenteeHasRoleIn;
  }

  public RoleDefinition addingMustBeSigned(Boolean addingMustBeSigned) {
    this.addingMustBeSigned = addingMustBeSigned;
    return this;
  }

  /**
   * If this is set as true then the user adding a mandate with this role needs to digitally sign it
   * @return addingMustBeSigned
   **/
  @Schema(description = "If this is set as true then the user adding a mandate with this role needs to digitally sign it")
  
    public Boolean isAddingMustBeSigned() {
    return addingMustBeSigned;
  }

  public void setAddingMustBeSigned(Boolean addingMustBeSigned) {
    this.addingMustBeSigned = addingMustBeSigned;
  }

  public RoleDefinition canSubDelegate(Boolean canSubDelegate) {
    this.canSubDelegate = canSubDelegate;
    return this;
  }

  /**
   * If this is set as true then a mandate with this role can be added with the right to further sub-delegate it.
   * @return canSubDelegate
   **/
  @Schema(description = "If this is set as true then a mandate with this role can be added with the right to further sub-delegate it.")
  
    public Boolean isCanSubDelegate() {
    return canSubDelegate;
  }

  public void setCanSubDelegate(Boolean canSubDelegate) {
    this.canSubDelegate = canSubDelegate;
  }

  public RoleDefinition delegateType(List<DelegateTypeEnum> delegateType) {
    this.delegateType = delegateType;
    return this;
  }

  public RoleDefinition addDelegateTypeItem(DelegateTypeEnum delegateTypeItem) {
    this.delegateType.add(delegateTypeItem);
    return this;
  }

  /**
   * Type of persons this role can be assigned to. Setting delegateType only to LEGAL_PERSON is meant to be used for machine-to-machine roles. For example EMTA has a role \"Käibedeklaratsiooni (KMD) andmete saatmine masin-masin liidese vahendusel (kood XT_MM_KMD)\".
   * @return delegateType
   **/
  @Schema(required = true, description = "Type of persons this role can be assigned to. Setting delegateType only to LEGAL_PERSON is meant to be used for machine-to-machine roles. For example EMTA has a role \"Käibedeklaratsiooni (KMD) andmete saatmine masin-masin liidese vahendusel (kood XT_MM_KMD)\".")
      @NotNull

    public List<DelegateTypeEnum> getDelegateType() {
    return delegateType;
  }

  public void setDelegateType(List<DelegateTypeEnum> delegateType) {
    this.delegateType = delegateType;
  }

  public RoleDefinition delegateCanEqualToRepresentee(Boolean delegateCanEqualToRepresentee) {
    this.delegateCanEqualToRepresentee = delegateCanEqualToRepresentee;
    return this;
  }

  /**
   * If this is set to true then in the Pääsuke Admin Portal it is possible to create mandates with this role where the value of the representee equals the value of the delegate. This functionality is used for the eesti.ee RR partner services. These types of roles where representee=delegate can only be added and deleted from the Admin portal (so in eesti.ee they are displayed as read-only).
   * @return delegateCanEqualToRepresentee
   **/
  @Schema(description = "If this is set to true then in the Pääsuke Admin Portal it is possible to create mandates with this role where the value of the representee equals the value of the delegate. This functionality is used for the eesti.ee RR partner services. These types of roles where representee=delegate can only be added and deleted from the Admin portal (so in eesti.ee they are displayed as read-only).")
  
    public Boolean isDelegateCanEqualToRepresentee() {
    return delegateCanEqualToRepresentee;
  }

  public void setDelegateCanEqualToRepresentee(Boolean delegateCanEqualToRepresentee) {
    this.delegateCanEqualToRepresentee = delegateCanEqualToRepresentee;
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

  public RoleDefinition hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Mandates with hidden roles are not shown in Pääsuke UI. A hidden role is a method to add extra information about the person. For example, we could create a role AA with property addableBy=BB, hidden=false. Now we can create hidden role BB and we can add a mandate with the role BB to persons who are allowed to add role AA. False by default. If hidden is set to true then all of the role properties (except 'code' and 'modified') are ignored.
   * @return hidden
   **/
  @Schema(description = "Mandates with hidden roles are not shown in Pääsuke UI. A hidden role is a method to add extra information about the person. For example, we could create a role AA with property addableBy=BB, hidden=false. Now we can create hidden role BB and we can add a mandate with the role BB to persons who are allowed to add role AA. False by default. If hidden is set to true then all of the role properties (except 'code' and 'modified') are ignored.")
  
    public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public RoleDefinition modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * When this role definition was last modified. It is highly recommended to include this value in the response.
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

  public RoleDefinition representeeType(List<RepresenteeTypeEnum> representeeType) {
    this.representeeType = representeeType;
    return this;
  }

  public RoleDefinition addRepresenteeTypeItem(RepresenteeTypeEnum representeeTypeItem) {
    this.representeeType.add(representeeTypeItem);
    return this;
  }

  /**
   * Type of representees who can add a mandate with this role. GOVERNMENT_PERSON is a sub-type of LEGAL_PERSON whose Estonian registry code starts with 7. Since LEGAL_PERSON includes GOVERNMENT_PERSON it is never needed to list both types for the same role. Setting representeeType=null could be used for hidden roles.
   * @return representeeType
   **/
  @Schema(example = "[\"LEGAL_PERSON\",\"NATURAL_PERSON\"]", required = true, description = "Type of representees who can add a mandate with this role. GOVERNMENT_PERSON is a sub-type of LEGAL_PERSON whose Estonian registry code starts with 7. Since LEGAL_PERSON includes GOVERNMENT_PERSON it is never needed to list both types for the same role. Setting representeeType=null could be used for hidden roles.")
      @NotNull

    public List<RepresenteeTypeEnum> getRepresenteeType() {
    return representeeType;
  }

  public void setRepresenteeType(List<RepresenteeTypeEnum> representeeType) {
    this.representeeType = representeeType;
  }

  public RoleDefinition subDelegateType(List<SubDelegateTypeEnum> subDelegateType) {
    this.subDelegateType = subDelegateType;
    return this;
  }

  public RoleDefinition addSubDelegateTypeItem(SubDelegateTypeEnum subDelegateTypeItem) {
    if (this.subDelegateType == null) {
      this.subDelegateType = new ArrayList<SubDelegateTypeEnum>();
    }
    this.subDelegateType.add(subDelegateTypeItem);
    return this;
  }

  /**
   * Type of persons this role can be sub-delegated to. Defaults to NATURAL_PERSON (if canSubDelegate is set as true).
   * @return subDelegateType
   **/
  @Schema(description = "Type of persons this role can be sub-delegated to. Defaults to NATURAL_PERSON (if canSubDelegate is set as true).")
  
    public List<SubDelegateTypeEnum> getSubDelegateType() {
    return subDelegateType;
  }

  public void setSubDelegateType(List<SubDelegateTypeEnum> subDelegateType) {
    this.subDelegateType = subDelegateType;
  }

  public RoleDefinition subDelegableBy(List<String> subDelegableBy) {
    this.subDelegableBy = subDelegableBy;
    return this;
  }

  public RoleDefinition addSubDelegableByItem(String subDelegableByItem) {
    if (this.subDelegableBy == null) {
      this.subDelegableBy = new ArrayList<String>();
    }
    this.subDelegableBy.add(subDelegableByItem);
    return this;
  }

  /**
   * In order to add a sub-delegate for a mandate with this role the user representing the delegate must have a valid mandate with a role in this list. Defaults to addableBy.
   * @return subDelegableBy
   **/
  @Schema(example = "[\"BR_REPRIGHT:SOLEREP\",\"EMTA:I\"]", description = "In order to add a sub-delegate for a mandate with this role the user representing the delegate must have a valid mandate with a role in this list. Defaults to addableBy.")
  
    public List<String> getSubDelegableBy() {
    return subDelegableBy;
  }

  public void setSubDelegableBy(List<String> subDelegableBy) {
    this.subDelegableBy = subDelegableBy;
  }

  public RoleDefinition waivableBy(List<String> waivableBy) {
    this.waivableBy = waivableBy;
    return this;
  }

  public RoleDefinition addWaivableByItem(String waivableByItem) {
    if (this.waivableBy == null) {
      this.waivableBy = new ArrayList<String>();
    }
    this.waivableBy.add(waivableByItem);
    return this;
  }

  /**
   * The user representing the delegate must have a valid mandate with a role in the list to waive this mandate from the delegate side (volitusest loobumine). If this is set to an empty list then this mandate cannot be waived. Defaults to addableBy.
   * @return waivableBy
   **/
  @Schema(example = "[\"BR_REPRIGHT:SOLEREP\",\"NAT_REPRIGHT:SOLEREP\",\"EMTA:I\"]", description = "The user representing the delegate must have a valid mandate with a role in the list to waive this mandate from the delegate side (volitusest loobumine). If this is set to an empty list then this mandate cannot be waived. Defaults to addableBy.")
  
    public List<String> getWaivableBy() {
    return waivableBy;
  }

  public void setWaivableBy(List<String> waivableBy) {
    this.waivableBy = waivableBy;
  }

  public RoleDefinition waivingMustBeSigned(Boolean waivingMustBeSigned) {
    this.waivingMustBeSigned = waivingMustBeSigned;
    return this;
  }

  /**
   * If this is set true then the delegate has to digitally sign when the delegate (volituse saaja) wants to waive the mandate (volitusest loobumine).
   * @return waivingMustBeSigned
   **/
  @Schema(description = "If this is set true then the delegate has to digitally sign when the delegate (volituse saaja) wants to waive the mandate (volitusest loobumine).")
  
    public Boolean isWaivingMustBeSigned() {
    return waivingMustBeSigned;
  }

  public void setWaivingMustBeSigned(Boolean waivingMustBeSigned) {
    this.waivingMustBeSigned = waivingMustBeSigned;
  }

  public RoleDefinition withdrawableBy(List<String> withdrawableBy) {
    this.withdrawableBy = withdrawableBy;
    return this;
  }

  public RoleDefinition addWithdrawableByItem(String withdrawableByItem) {
    if (this.withdrawableBy == null) {
      this.withdrawableBy = new ArrayList<String>();
    }
    this.withdrawableBy.add(withdrawableByItem);
    return this;
  }

  /**
   * The user representing the representee must have a mandate with a role in the list to withdraw this mandate from the representee side (volituse tagasivõtmine). If this is set to an empty list then this mandate cannot be withdrawn. Defaults to addableBy.
   * @return withdrawableBy
   **/
  @Schema(example = "[\"BR_REPRIGHT:SOLEREP\",\"EMTA:I\"]", description = "The user representing the representee must have a mandate with a role in the list to withdraw this mandate from the representee side (volituse tagasivõtmine). If this is set to an empty list then this mandate cannot be withdrawn. Defaults to addableBy.")
  
    public List<String> getWithdrawableBy() {
    return withdrawableBy;
  }

  public void setWithdrawableBy(List<String> withdrawableBy) {
    this.withdrawableBy = withdrawableBy;
  }

  public RoleDefinition withdrawalMustBeSigned(Boolean withdrawalMustBeSigned) {
    this.withdrawalMustBeSigned = withdrawalMustBeSigned;
    return this;
  }

  /**
   * If this is set true then the representee (or the person representing the representee) has to digitally sign when he wants to withdraw the mandate (volituse tagasivõtmine).
   * @return withdrawalMustBeSigned
   **/
  @Schema(description = "If this is set true then the representee (or the person representing the representee) has to digitally sign when he wants to withdraw the mandate (volituse tagasivõtmine).")
  
    public Boolean isWithdrawalMustBeSigned() {
    return withdrawalMustBeSigned;
  }

  public void setWithdrawalMustBeSigned(Boolean withdrawalMustBeSigned) {
    this.withdrawalMustBeSigned = withdrawalMustBeSigned;
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
   * Deprecated. Use 'addableBy' instead.
   * @return assignableBy
   **/
  @Schema(example = "[\"EMTA:I\"]", description = "Deprecated. Use 'addableBy' instead.")
  
    public List<String> getAssignableBy() {
    return assignableBy;
  }

  public void setAssignableBy(List<String> assignableBy) {
    this.assignableBy = assignableBy;
  }

  public RoleDefinition assignableOnlyIfRepresenteeHasRoleIn(List<String> assignableOnlyIfRepresenteeHasRoleIn) {
    this.assignableOnlyIfRepresenteeHasRoleIn = assignableOnlyIfRepresenteeHasRoleIn;
    return this;
  }

  public RoleDefinition addAssignableOnlyIfRepresenteeHasRoleInItem(String assignableOnlyIfRepresenteeHasRoleInItem) {
    if (this.assignableOnlyIfRepresenteeHasRoleIn == null) {
      this.assignableOnlyIfRepresenteeHasRoleIn = new ArrayList<String>();
    }
    this.assignableOnlyIfRepresenteeHasRoleIn.add(assignableOnlyIfRepresenteeHasRoleInItem);
    return this;
  }

  /**
   * Deprecated. Use 'addableOnlyIfRepresenteeHasRoleIn' instead.
   * @return assignableOnlyIfRepresenteeHasRoleIn
   **/
  @Schema(example = "[\"Eesti.ee.RR.partner:isik_aadressid\"]", description = "Deprecated. Use 'addableOnlyIfRepresenteeHasRoleIn' instead.")
  
    public List<String> getAssignableOnlyIfRepresenteeHasRoleIn() {
    return assignableOnlyIfRepresenteeHasRoleIn;
  }

  public void setAssignableOnlyIfRepresenteeHasRoleIn(List<String> assignableOnlyIfRepresenteeHasRoleIn) {
    this.assignableOnlyIfRepresenteeHasRoleIn = assignableOnlyIfRepresenteeHasRoleIn;
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
   * Deprecated. Use 'withdrawableBy' instead.
   * @return deletableBy
   **/
  @Schema(example = "[\"BR_REPRIGHT:SOLEREP\",\"EMTA:I\"]", description = "Deprecated. Use 'withdrawableBy' instead.")
  
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
   * Deprecated. Use 'waivingAllowed' instead.
   * @return deletableByDelegate
   **/
  @Schema(description = "Deprecated. Use 'waivingAllowed' instead.")
  
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
   * Deprecated. Use 'hidden' instead.
   * @return visible
   **/
  @Schema(description = "Deprecated. Use 'hidden' instead.")
  
    public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

}
