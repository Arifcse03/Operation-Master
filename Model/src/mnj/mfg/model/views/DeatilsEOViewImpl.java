package mnj.mfg.model.views;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 09 21:28:46 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DeatilsEOViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public DeatilsEOViewImpl() {
    }
    @Override
    public void insertRow(Row row) {

           Row lastRow = this.last();
           if (lastRow != null) {
               //insert new row at the end and make it current
               int indx = this.getRangeIndexOf(lastRow) + 1;
               this.insertRowAtRangeIndex(indx, row);
               this.setCurrentRow(row);
           } else { // empty Rowset
               super.insertRow(row);
           }
       }
}
