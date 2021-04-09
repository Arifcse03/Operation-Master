package mnj.mfg.model.views;

import mnj.mfg.model.entities.MnjMfgOperationMasterLImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 09 21:26:51 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgOperationMasterLViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        LineId {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getLineId();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        HeaderId {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getHeaderId();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        DeptId {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getDeptId();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setDeptId((Number)value);
            }
        }
        ,
        DeptName {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getDeptName();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setDeptName((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        Creator {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getCreator();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setCreator((String)value);
            }
        }
        ,
        LastUdatedBy {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getLastUdatedBy();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setLastUdatedBy((Number)value);
            }
        }
        ,
        Updater {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getUpdater();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setUpdater((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        EffectiveStartDate {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getEffectiveStartDate();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setEffectiveStartDate((Date)value);
            }
        }
        ,
        EffectiveEndDate {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getEffectiveEndDate();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setEffectiveEndDate((Date)value);
            }
        }
        ,
        DeptNo {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getDeptNo();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setDeptNo((String)value);
            }
        }
        ,
        TardetProduction {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getTardetProduction();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setTardetProduction((Number)value);
            }
        }
        ,
        OptionNo {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getOptionNo();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setOptionNo((String)value);
            }
        }
        ,
        VersionNo {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getVersionNo();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setVersionNo((String)value);
            }
        }
        ,
        TotalSamValue {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getTotalSamValue();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setTotalSamValue((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        DeatilsEOView {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getDeatilsEOView();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        BomDepartments1 {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getBomDepartments1();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        DepartmentVO1 {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getDepartmentVO1();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Option_No_VO1 {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getOption_No_VO1();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Version_No_VO1 {
            public Object get(MnjMfgOperationMasterLViewRowImpl obj) {
                return obj.getVersion_No_VO1();
            }

            public void put(MnjMfgOperationMasterLViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgOperationMasterLViewRowImpl object);

        public abstract void put(MnjMfgOperationMasterLViewRowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int DEPTID = AttributesEnum.DeptId.index();
    public static final int DEPTNAME = AttributesEnum.DeptName.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATOR = AttributesEnum.Creator.index();
    public static final int LASTUDATEDBY = AttributesEnum.LastUdatedBy.index();
    public static final int UPDATER = AttributesEnum.Updater.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int EFFECTIVESTARTDATE = AttributesEnum.EffectiveStartDate.index();
    public static final int EFFECTIVEENDDATE = AttributesEnum.EffectiveEndDate.index();
    public static final int DEPTNO = AttributesEnum.DeptNo.index();
    public static final int TARDETPRODUCTION = AttributesEnum.TardetProduction.index();
    public static final int OPTIONNO = AttributesEnum.OptionNo.index();
    public static final int VERSIONNO = AttributesEnum.VersionNo.index();
    public static final int TOTALSAMVALUE = AttributesEnum.TotalSamValue.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int DEATILSEOVIEW = AttributesEnum.DeatilsEOView.index();
    public static final int BOMDEPARTMENTS1 = AttributesEnum.BomDepartments1.index();
    public static final int DEPARTMENTVO1 = AttributesEnum.DepartmentVO1.index();
    public static final int OPTION_NO_VO1 = AttributesEnum.Option_No_VO1.index();
    public static final int VERSION_NO_VO1 = AttributesEnum.Version_No_VO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgOperationMasterLViewRowImpl() {
    }

    /**
     * Gets MnjMfgOperationMasterL entity object.
     * @return the MnjMfgOperationMasterL
     */
    public MnjMfgOperationMasterLImpl getMnjMfgOperationMasterL() {
        return (MnjMfgOperationMasterLImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for LINE_ID using the alias name LineId.
     * @return the LINE_ID
     */
    public Number getLineId() {
        return (Number) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for LINE_ID using the alias name LineId.
     * @param value value to set the LINE_ID
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for HEADER_ID using the alias name HeaderId.
     * @return the HEADER_ID
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for HEADER_ID using the alias name HeaderId.
     * @param value value to set the HEADER_ID
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for DEPT_ID using the alias name DeptId.
     * @return the DEPT_ID
     */
    public Number getDeptId() {
        return (Number) getAttributeInternal(DEPTID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPT_ID using the alias name DeptId.
     * @param value value to set the DEPT_ID
     */
    public void setDeptId(Number value) {
        setAttributeInternal(DEPTID, value);
    }

    /**
     * Gets the attribute value for DEPT_NAME using the alias name DeptName.
     * @return the DEPT_NAME
     */
    public String getDeptName() {
        return (String) getAttributeInternal(DEPTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPT_NAME using the alias name DeptName.
     * @param value value to set the DEPT_NAME
     */
    public void setDeptName(String value) {
        setAttributeInternal(DEPTNAME, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Creator.
     * @return the Creator
     */
    public String getCreator() {
        return (String) getAttributeInternal(CREATOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Creator.
     * @param value value to set the  Creator
     */
    public void setCreator(String value) {
        setAttributeInternal(CREATOR, value);
    }

    /**
     * Gets the attribute value for LAST_UDATED_BY using the alias name LastUdatedBy.
     * @return the LAST_UDATED_BY
     */
    public Number getLastUdatedBy() {
        return (Number) getAttributeInternal(LASTUDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UDATED_BY using the alias name LastUdatedBy.
     * @param value value to set the LAST_UDATED_BY
     */
    public void setLastUdatedBy(Number value) {
        setAttributeInternal(LASTUDATEDBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Updater.
     * @return the Updater
     */
    public String getUpdater() {
        return (String) getAttributeInternal(UPDATER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Updater.
     * @param value value to set the  Updater
     */
    public void setUpdater(String value) {
        setAttributeInternal(UPDATER, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for EFFECTIVE_START_DATE using the alias name EffectiveStartDate.
     * @return the EFFECTIVE_START_DATE
     */
    public Date getEffectiveStartDate() {
        return (Date) getAttributeInternal(EFFECTIVESTARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for EFFECTIVE_START_DATE using the alias name EffectiveStartDate.
     * @param value value to set the EFFECTIVE_START_DATE
     */
    public void setEffectiveStartDate(Date value) {
        setAttributeInternal(EFFECTIVESTARTDATE, value);
    }

    /**
     * Gets the attribute value for EFFECTIVE_END_DATE using the alias name EffectiveEndDate.
     * @return the EFFECTIVE_END_DATE
     */
    public Date getEffectiveEndDate() {
        return (Date) getAttributeInternal(EFFECTIVEENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for EFFECTIVE_END_DATE using the alias name EffectiveEndDate.
     * @param value value to set the EFFECTIVE_END_DATE
     */
    public void setEffectiveEndDate(Date value) {
        setAttributeInternal(EFFECTIVEENDDATE, value);
    }

    /**
     * Gets the attribute value for DEPT_NO using the alias name DeptNo.
     * @return the DEPT_NO
     */
    public String getDeptNo() {
        return (String) getAttributeInternal(DEPTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPT_NO using the alias name DeptNo.
     * @param value value to set the DEPT_NO
     */
    public void setDeptNo(String value) {
        setAttributeInternal(DEPTNO, value);
    }

    /**
     * Gets the attribute value for TARDET_PRODUCTION using the alias name TardetProduction.
     * @return the TARDET_PRODUCTION
     */
    public Number getTardetProduction() {
        return (Number) getAttributeInternal(TARDETPRODUCTION);
    }

    /**
     * Sets <code>value</code> as attribute value for TARDET_PRODUCTION using the alias name TardetProduction.
     * @param value value to set the TARDET_PRODUCTION
     */
    public void setTardetProduction(Number value) {
        setAttributeInternal(TARDETPRODUCTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OptionNo.
     * @return the OptionNo
     */
    public String getOptionNo() {
        return (String) getAttributeInternal(OPTIONNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OptionNo.
     * @param value value to set the  OptionNo
     */
    public void setOptionNo(String value) {
        setAttributeInternal(OPTIONNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute VersionNo.
     * @return the VersionNo
     */
    public String getVersionNo() {
        return (String) getAttributeInternal(VERSIONNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute VersionNo.
     * @param value value to set the  VersionNo
     */
    public void setVersionNo(String value) {
        setAttributeInternal(VERSIONNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TotalSamValue.
     * @return the TotalSamValue
     */
    public Number getTotalSamValue() {
        return (Number) getAttributeInternal(TOTALSAMVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TotalSamValue.
     * @param value value to set the  TotalSamValue
     */
    public void setTotalSamValue(Number value) {
        setAttributeInternal(TOTALSAMVALUE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DeatilsEOView.
     */
    public RowIterator getDeatilsEOView() {
        return (RowIterator)getAttributeInternal(DEATILSEOVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> BomDepartments1.
     */
    public RowSet getBomDepartments1() {
        return (RowSet)getAttributeInternal(BOMDEPARTMENTS1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DepartmentVO1.
     */
    public RowSet getDepartmentVO1() {
        return (RowSet)getAttributeInternal(DEPARTMENTVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Option_No_VO1.
     */
    public RowSet getOption_No_VO1() {
        return (RowSet)getAttributeInternal(OPTION_NO_VO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Version_No_VO1.
     */
    public RowSet getVersion_No_VO1() {
        return (RowSet)getAttributeInternal(VERSION_NO_VO1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}