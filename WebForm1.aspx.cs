using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using CISCS_V1.Appcode;

namespace CISCS_V1
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        ClsLogMaintainance CLM = new ClsLogMaintainance();
        clsLookupMaster CLS = new clsLookupMaster();
        string sql = "", RESULT = "";
        DataTable DT = new DataTable();
        ClsBindDropdown BD = new ClsBindDropdown();
        int result;
        string user = "";
        string sResult = "", FL = "";
        int Result = 0;
        string Flag = "";
        
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                BindGrid();
            }
        }

        //protected void BindData()
        //{
        //    // Assuming you have a list of items to display in the grid view
        //   // List<MyItem> items = GetItems();

        //    GridView1.DataSource = items;
        //    GridView1.DataBind();
        //}
        public void BindGrid()
        {
            CLS.BindLIMITAMOUNT(GridView1, Session["MID"].ToString());
        }
        protected void lnkButton_Click(object sender, EventArgs e)
        {
            // Handle the link button click event here
            //LinkButton lnkButton = (LinkButton)sender;
            //GridViewRow row = (GridViewRow)lnkButton.NamingContainer;
            //int rowIndex = row.RowIndex;

            //// Access the data associated with the clicked row
            //string name = GridView1.DataKeys[rowIndex]["CLIENTID"].ToString();

            LinkButton lnkedit = (LinkButton)sender;
            string str = lnkedit.CommandArgument.ToString();
            string[] ARR = str.Split(',');
            ViewState["CLIENTID"] = ARR[0].ToString();
            ViewState["CLIENTID"] = ARR[1].ToString();
            try
            {

                  CallEdit();

                System.Text.StringBuilder sb = new System.Text.StringBuilder();
                sb.Append(@"<script type='text/javascript'>");
                sb.Append("$('#SearchDiv').modal('show');");
                sb.Append(@"</script>");
                ScriptManager.RegisterClientScriptBlock(this, this.GetType(), "AddShowModalScript", sb.ToString(), false);
            }
            catch (Exception Ex)
            {
                ExceptionLogging.SendErrorToText(Ex);
            }
        }

        public void CallEdit()
        {
            try
            {
                DataTable DT = new DataTable();
                DT = CLS.GetAMTDet(ViewState["CLIENTID"].ToString());
                if (DT.Rows.Count > 0)
                {
                    TxtBrcd.Text = DT.Rows[0]["balance"].ToString();
                    txtfrmdate.Text = DT.Rows[0]["Date_of_Purchase"].ToString();
                  //  ddldoctype.SelectedValue = Convert.ToString(DT.Rows[0]["doc_type"].ToString());
                    TextBox2.Text = DT.Rows[0]["CLIENTID"].ToString();
                    TextBox3.Text = DT.Rows[0]["CLIENTNM"].ToString();
                }

            }
            catch (Exception Ex)
            {
                ExceptionLogging.SendErrorToText(Ex);
            }
        }

        protected void Button3_Click(object sender, System.EventArgs e)
        {

            Result = CLS.SaveDataLIMIT(Id: TextBox2.Text, date: txtfrmdate.Text.ToString(), Amt: TxtBrcd.Text, DESC: TextBox3.Text, doc_type: ddldoctype.SelectedValue.ToString());
            if (Result > 0)
            {
                BindGrid();
                WebMsgBox.Show("Data Insert Successfully...", this.Page);
                FL = "Insert";//Dhanya Shetty               
                return;
            }
        }

    }
}