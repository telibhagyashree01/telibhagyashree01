using CISCS_V1;
using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Net;
using System.Text;
using System.Text.RegularExpressions;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace DocumentVerification
{
    public partial class VoterVerification : System.Web.UI.Page
    {
        CISCS_testEntities1 db = new CISCS_testEntities1();
        
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnvoter_Click(object sender, EventArgs e)
        {
            //if (txtvoterid.Text == "")
            //{
            //    ScriptManager.RegisterClientScriptBlock(this, this.GetType(), "alertMessage", "alert('Plese Enter Voter Id!!')", true);
            //    return;
            //}
            //var result = db.tbl_VoterData.Where(x => x.VoterId == txtvoterid.Text.ToUpper()).Select(x => x.VoterId).FirstOrDefault();
            //if (result == null)
            //{
            //    NameValueCollection data = new NameValueCollection();
            //    string resopnse = "";
            //    //WebClient client = new WebClient();
            //    string url = ConfigurationManager.AppSettings["VoterUrl"];
            //    string token = ConfigurationManager.AppSettings["Token"];
            //    data["id_number"] = txtvoterid.Text;
            //    using (WebClient client = new WebClient())
            //    {
            //        client.Headers.Clear();
            //        client.Headers.Add("ContentType", "application/json");
            //        client.Headers.Add("Authorization", "Bearer " + token);


            //        ServicePointManager.SecurityProtocol = SecurityProtocolType.Ssl3 | SecurityProtocolType.Tls | SecurityProtocolType.Tls11 | SecurityProtocolType.Tls12;

            //        try
            //        {
            //            var apiresult = client.UploadValues(url, "POST", data);
            //            resopnse = Encoding.UTF8.GetString(apiresult);
            //            DataTable dt = JsonStringToDataTable(resopnse);

            //            try
            //            {

            //                lblvotenumber.Text = dt.Rows[0][1].ToString();
            //                lblfullname.Text = dt.Rows[0][4].ToString();
            //                lblgender.Text= dt.Rows[0][2].ToString();
            //                lbldob.Text= dt.Rows[0][9].ToString();
            //                lblarea.Text= dt.Rows[0][10].ToString();

            //                tbl_VoterData a = new tbl_VoterData();
            //                a.VoterId = dt.Rows[0][1].ToString().Substring(1) == "" ? null : dt.Rows[0][1].ToString().Substring(1);
            //                a.Name = dt.Rows[0][4].ToString() == "" ? null : dt.Rows[0][4].ToString();
            //                a.DOB = null;
            //                a.Gender = dt.Rows[0][2].ToString() == "" ? null : dt.Rows[0][2].ToString();
            //                a.Area = dt.Rows[0][10].ToString() == "" ? null : dt.Rows[0][10].ToString();
            //                a.State = dt.Rows[0][3].ToString() == "" ? null : dt.Rows[0][3].ToString();
            //                a.CliendId = dt.Rows[0]["data"].ToString().Substring(11) == "" ? null : dt.Rows[0]["data"].ToString().Substring(11);
            //                a.VerifiedBy = Session["user"].ToString() == "" ? null : Session["user"].ToString();
            //                a.VerifiedDate = DateTime.Now;
                            
            //                db.tbl_VoterData.Add(a);
            //                db.SaveChanges();

            //                divVoterInfo.Visible = true;
            //                ScriptManager.RegisterClientScriptBlock(this, this.GetType(), "alertMessage", "alert('Valid Voter Id!!')", true);
            //                return;

            //            }
            //            catch (Exception ex)
            //            {
            //                divVoterInfo.Visible = false;
            //                ScriptManager.RegisterClientScriptBlock(this, this.GetType(), "alertMessage", "alert('Something wrong!!')", true);
            //                return;
            //            }
            //        }
            //        catch (Exception ex)
            //        {
            //            divVoterInfo.Visible = false;
            //            ScriptManager.RegisterClientScriptBlock(this, this.GetType(), "alertMessage", "alert('Invalid Voter Id!!')", true);
            //            return;
            //        }
            //    }
            //}
            //else
            //{
            //    divVoterInfo.Visible = false;
            //    ScriptManager.RegisterClientScriptBlock(this, this.GetType(), "alertMessage", "alert('Voter Id Already Verified!!')", true);
            //    return;
            //}
        }

        public DataTable JsonStringToDataTable(string jsonString)
        {
            DataTable dt = new DataTable();
            string[] jsonStringArray = Regex.Split(jsonString.Replace("[", "").Replace("]", ""), "},{");
            List<string> ColumnsName = new List<string>();
            foreach (string jSA in jsonStringArray)
            {
                string[] jsonStringData = Regex.Split(jSA.Replace("{", "").Replace("}", ""), ",");
                foreach (string ColumnsNameData in jsonStringData)
                {
                    try
                    {
                        int idx = ColumnsNameData.IndexOf(":");
                        string ColumnsNameString = ColumnsNameData.Substring(0, idx - 1).Replace("\"", "");
                        if (!ColumnsName.Contains(ColumnsNameString))
                        {
                            ColumnsName.Add(ColumnsNameString);
                        }
                    }
                    catch (Exception ex)
                    {
                        throw new Exception(string.Format("Error Parsing Column Name : {0}", ColumnsNameData));
                    }
                }
                break;
            }
            foreach (string AddColumnName in ColumnsName)
            {
                dt.Columns.Add(AddColumnName);
            }
            foreach (string jSA in jsonStringArray)
            {
                string[] RowData = Regex.Split(jSA.Replace("{", "").Replace("}", ""), ",");
                DataRow nr = dt.NewRow();
                foreach (string rowData in RowData)
                {
                    try
                    {
                        int idx = rowData.IndexOf(":");
                        string RowColumns = rowData.Substring(0, idx - 1).Replace("\"", "");
                        string RowDataString = rowData.Substring(idx + 1).Replace("\"", "");
                        nr[RowColumns] = RowDataString;
                    }
                    catch (Exception ex)
                    {
                        continue;
                    }
                }
                dt.Rows.Add(nr);
            }
            return dt;
        }

        protected void btnClear_Click(object sender, EventArgs e)
        {
            txtvoterid.Text = String.Empty;
            divVoterInfo.Visible = false;
        }
    }
}