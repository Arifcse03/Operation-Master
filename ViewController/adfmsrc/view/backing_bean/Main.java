package view.backing_bean;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpSession;

import mnj.mfg.model.services.MainAMImpl;

import oracle.adf.view.rich.component.rich.data.RichColumn;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.adf.view.rich.event.DialogEvent;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;


import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;


public class Main {
    private RichInputListOfValues searchSTN;
    private RichInputListOfValues deptId;
    private RichColumn deptmentID;
    private RichInputListOfValues buyerid;
    private RichColumn deptmentId;
    private RichInputListOfValues deptmeniid2;
    private RichColumn departmentId;
    private RichInputText id;
    private RichInputText testDeptId;
    private RichInputText headerId;
    private RichTable operationTable;
    private RichInputText customerBuyerID;
    private RichInputListOfValues style;
    private RichInputText saleOrderId;
    private RichTable obTable;
    private RichTable htable;

    public Main() {
        super();
    }

    public void setSearchSTN(RichInputListOfValues searchSTN) {
        this.searchSTN = searchSTN;
    }

    public RichInputListOfValues getSearchSTN() {
        return searchSTN;
    }

    public String CopyAction() {
        // Add event code here...
        
        System.out.println("STN Numebr in Bean -->"+getSearchSTN().getValue());
        return null;
    }
    MainAMImpl appM = getAppModuleImpl();

    public MainAMImpl getAppModuleImpl() {
    DCBindingContainer bindingContainer =
    (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
    //BindingContext bindingContext = BindingContext.getCurrent();
    DCDataControl dc =
    bindingContainer.findDataControl("MainAMDataControl"); // Name of application module in datacontrolBinding.cpx
    MainAMImpl appM = (MainAMImpl)dc.getDataProvider();
    return appM;
    }
    
//    public void setDeptIdS(RichColumn id){
//        
//        FacesContext fctx = FacesContext.getCurrentInstance();
//        ExternalContext ectx = fctx.getExternalContext();
//        HttpSession userSession = (HttpSession) ectx.getSession(false);
//        userSession.setAttribute("DeptIdS", id.getValue());    
//    }
    
//    public void setDeptIdS(RichInputListOfValues id){        
//            FacesContext fctx = FacesContext.getCurrentInstance();
//            ExternalContext ectx = fctx.getExternalContext();
//            HttpSession userSession = (HttpSession) ectx.getSession(false);
//            userSession.setAttribute("DeptIdS", id.getValue());   
//        
//        }
    
    public void setDeptIdS(RichInputText id){        
            FacesContext fctx = FacesContext.getCurrentInstance();
            ExternalContext ectx = fctx.getExternalContext();
            HttpSession userSession = (HttpSession) ectx.getSession(false);
            userSession.setAttribute("DeptIdS", id.getValue());
            System.out.println("value -->"+id.getValue());
        
        }

    public void setId(RichInputText id) {
        this.id = id;
        System.out.println("value 2nd -->"+id.getValue());
        setDeptIdS(id);
        
    }

    public RichInputText getId() {
        return id;
    }

    public void setTestDeptId(RichInputText testDeptId) {
        this.testDeptId = testDeptId;
        System.out.println("test dept Id ---->"+testDeptId.getValue());
    }

    public RichInputText getTestDeptId() {
        return testDeptId;
    }
    
    public void setValues(ActionEvent actionEvent) {
       
        String newPage =
    "http://192.168.200.106:7003/FileUploading-ViewController-context-root/faces/view1?doc=OPM&docNo="+getHeaderId().getValue();
        // String newPage = "http://localhost:7101/PurchaseMemo-ViewController-context-root/faces/SearchPG?headerId="+getBomId().getValue();
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks =
            Service.getService(ctx.getRenderKit(), ExtendedRenderKitService.class);
        String url = "window.open('" + newPage + "','_self');";
        erks.addScript(FacesContext.getCurrentInstance(), url);


    }


    public void setHeaderId(RichInputText headerId) {
        this.headerId = headerId;
    }

    public RichInputText getHeaderId() {
        return headerId;
    }
    
           /** Bean Coding For FILL Operation Tab **/
           
           public void editPopupFetchListenerOperation(PopupFetchEvent popupFetchEvent) {
                         
                     System.out.println("sabih Error First");
                   
                     CallOperation();
                   
                     if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
                       
                         BindingContainer bindings = getBindings();
                         OperationBinding operationBinding = 
                                                 bindings.getOperationBinding("CreateInsert");
                         operationBinding.execute();
                     }
                 }
           
           
               
    public void CallOperation(){
        
        System.out.println("sabih Error Here");
        OperationBinding operationBinding = executeOperation("whereClasDeptName");
        operationBinding.getParamsMap().put("style", getDeptName());
        System.out.println("DeptName id usman CallOperation BEN----->"+getDeptName());
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
           System.out.println("if errors-->");
    //            List errors = operationBinding.getErrors();
    //            System.out.println(@);
        }
    }

           
           public void editDialogListenerOperation(DialogEvent dialogEvent) {
                  if (dialogEvent.getOutcome().name().equals("ok")) {     
                   FillOperation();
                      AdfFacesContext.getCurrentInstance().addPartialTarget(operationTable);    
                  } else if (dialogEvent.getOutcome().name().equals("cancel")) {          
                   ;
                  }
              }
           
           public  void FillOperation() {
               OperationBinding operationBinding = executeOperation("callOperationFetch");
               operationBinding.execute();
              }
           public BindingContainer getBindings() {
                  return BindingContext.getCurrent().getCurrentBindingsEntry();
              }
           
           public OperationBinding executeOperation(String operation) {
               OperationBinding createParam = getBindingsCont().getOperationBinding(operation);
               return createParam;

           }
           
           /*****Generic Method to Get BindingContainer**/
               public BindingContainer getBindingsCont() {
                   return BindingContext.getCurrent().getCurrentBindingsEntry();
               }


           public void editPopupCancelListenerOperation(PopupCanceledEvent popupCanceledEvent) {
                  
              }


    /** End Bean Coding For FILL Operation Tab **/
    
    
    public void setOperationTable(RichTable operationTable) {
        this.operationTable = operationTable;
    }

    public RichTable getOperationTable() {
        return operationTable;
    }
    public void setCustomerIdS(RichInputText id){
        
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession) ectx.getSession(false);
        userSession.setAttribute("CustomerIdS", id.getValue());    
    }

    public void setCustomerBuyerID(RichInputText customerBuyerID) {
        this.customerBuyerID = customerBuyerID;
        setCustomerIdS(customerBuyerID);
    }

    public RichInputText getCustomerBuyerID() {
        return customerBuyerID;
    }

    public void setStyle(RichInputListOfValues style) {
        this.style = style;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("style", style.getValue());
        System.out.println("Session style-->"+style.getValue());
    }

    public RichInputListOfValues getStyle() {
        return style;
    }

    public void setSaleOrderId(RichInputText saleOrderId) {
        this.saleOrderId = saleOrderId;
    }

    public RichInputText getSaleOrderId() {
        return saleOrderId;
    }
    
    public String getDeptName() {
    
        oracle.adf.view.rich.component.UIXTable table = getObTable();
               // Get the Selected Row key set iterator
               java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
               String DeptName = null;
               while (selectionIt.hasNext()) {
                   Object rowKey = selectionIt.next();
                   table.setRowKey(rowKey);
                   int index = table.getRowIndex();
                   FacesCtrlHierNodeBinding row =
                       (FacesCtrlHierNodeBinding)table.getRowData(index);
                   Row selectedRow = row.getRow();
         System.out.println("usman id BEN---->"+selectedRow.getAttribute("DeptName"));
         DeptName  = selectedRow.getAttribute("DeptName").toString();  

                   }
               System.out.println("DeptName id usman BEN----->"+DeptName);
               return DeptName;
    }




    public void setObTable(RichTable obTable) {
        this.obTable = obTable;
    }



    public RichTable getObTable() {
        return obTable;
    }

    public void Save(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding =
            executeOperation("Save");
        operationBinding.execute();
        ViewObject hview=appM.getMnjMfgOperationMasterHView1();
       
        //hview.clearCache();
        AdfFacesContext.getCurrentInstance().addPartialTarget(htable);
    }

    public void setHtable(RichTable htable) {
        this.htable = htable;
    }

    public RichTable getHtable() {
        return htable;
    }
}
