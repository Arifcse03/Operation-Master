package mnj.mfg.model.services.common;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Aug 09 12:46:17 BDT 2015
// ---------------------------------------------------------------------
public interface MainAM extends ApplicationModule {
    void copyMethod(String stn);

    void populteLines(Row r);

    void populteDetails(Row r);


    void populateOperationLines(Row poprow);

    String getPopulateValue(Row r, String columnName);

    Row createOperationLines();

    Row createLines();

    Row createDetails();

    void callOperationFetch();

    void afterCommit(TransactionEvent transactionEvent);

    void copyMethodNew(String style);

    void whereClasDeptName(String style);

    void setSessionValues(String orgId, String userId, String respId,
                          String respAppl);

    void Save();
}
