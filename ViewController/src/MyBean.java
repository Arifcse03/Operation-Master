import java.io.Serializable;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;

public class MyBean  {
    private RichInputText deptId;
    private RichInputText deptName;
    private RichInputListOfValues stnNo;
    private RichInputListOfValues deptNo;

    public MyBean() {
    }

    public void setDeptId(RichInputText deptId) {
        this.deptId = deptId;
        System.out.println("Dept Id---->"+deptId.getValue());
    }

    public RichInputText getDeptId() {
        return deptId;
    }

    public void setDeptName(RichInputText deptName) {
        this.deptName = deptName;
        System.out.println("Dept Name -->"+deptName.getValue());
    }

    public RichInputText getDeptName() {
        return deptName;
    }

    public void setStnNo(RichInputListOfValues stnNo) {
        this.stnNo = stnNo;
        System.out.println("Snt---->"+stnNo.getValue());
    }

    public RichInputListOfValues getStnNo() {
        return stnNo;
    }

    public void setDeptNo(RichInputListOfValues deptNo) {
        this.deptNo = deptNo;
        System.out.println("department -->"+deptNo.getValue());
    }

    public RichInputListOfValues getDeptNo() {
        return deptNo;
    }

    public void testval(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        System.out.println("Get value --->"+valueChangeEvent.getNewValue());
        setDeptIdS(valueChangeEvent.getNewValue());
       
    }
    
    
    public void setDeptIdS(Object id){        
            FacesContext fctx = FacesContext.getCurrentInstance();
            ExternalContext ectx = fctx.getExternalContext();
            HttpSession userSession = (HttpSession) ectx.getSession(false);
            if(id != null)
            userSession.setAttribute("DeptIdS", id);
            System.out.println("value -->"+id);
        
        }
}
