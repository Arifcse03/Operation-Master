package mnj.mfg.model.services.client;

import mnj.mfg.model.services.common.MainAM;

import oracle.jbo.Row;
import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Aug 09 12:46:17 BDT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MainAMClient extends ApplicationModuleImpl implements MainAM {
    /**
     * This is the default constructor (do not remove).
     */
    public MainAMClient() {
    }


    public void populateOperationLines1() {
        Object _ret =
            this.riInvokeExportedMethod(this,"populateOperationLines1",null,null);
        return;
    }


    public void copyMethod(String stn) {
        Object _ret =
            this.riInvokeExportedMethod(this,"copyMethod",new String [] {"java.lang.String"},new Object[] {stn});
        return;
    }

    public void populteLines(Row r) {
        Object _ret =
            this.riInvokeExportedMethod(this,"populteLines",new String [] {"oracle.jbo.Row"},new Object[] {r});
        return;
    }

    public void populteDetails(Row r) {
        Object _ret =
            this.riInvokeExportedMethod(this,"populteDetails",new String [] {"oracle.jbo.Row"},new Object[] {r});
        return;
    }

    public void populateOperationLines(Row poprow) {
        Object _ret =
            this.riInvokeExportedMethod(this,"populateOperationLines",new String [] {"oracle.jbo.Row"},new Object[] {poprow});
        return;
    }

    public String getPopulateValue(Row r, String columnName) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getPopulateValue",new String [] {"oracle.jbo.Row","java.lang.String"},new Object[] {r, columnName});
        return (String)_ret;
    }

    public Row createOperationLines() {
        Object _ret =
            this.riInvokeExportedMethod(this,"createOperationLines",null,null);
        return (Row)_ret;
    }

    public Row createLines() {
        Object _ret = this.riInvokeExportedMethod(this,"createLines",null,null);
        return (Row)_ret;
    }

    public Row createDetails() {
        Object _ret = this.riInvokeExportedMethod(this,"createDetails",null,null);
        return (Row)_ret;
    }

    public void callOperationFetch() {
        Object _ret =
            this.riInvokeExportedMethod(this,"callOperationFetch",null,null);
        return;
    }

    public void afterCommit(TransactionEvent transactionEvent) {
        Object _ret =
            this.riInvokeExportedMethod(this,"afterCommit",new String [] {"oracle.jbo.server.TransactionEvent"},new Object[] {transactionEvent});
        return;
    }

    public void copyMethodNew(String style) {
        Object _ret =
            this.riInvokeExportedMethod(this,"copyMethodNew",new String [] {"java.lang.String"},new Object[] {style});
        return;
    }

    public void whereClasDeptName(String style) {
        Object _ret =
            this.riInvokeExportedMethod(this,"whereClasDeptName",new String [] {"java.lang.String"},new Object[] {style});
        return;
    }

    public void setSessionValues(String orgId, String userId, String respId,
                                 String respAppl) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setSessionValues",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {orgId, userId, respId, respAppl});
        return;
    }

    public void Save() {
        Object _ret = this.riInvokeExportedMethod(this,"Save",null,null);
        return;
    }
}
