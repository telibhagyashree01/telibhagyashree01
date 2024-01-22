<%@ Page Title="" Language="C#" MasterPageFile="~/DocumentVerification.Master" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="CISCS_V1.WebForm1" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
     <script src="fieldformatting.js"></script>
    <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
 <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False">
    <Columns>
           <%--  Date_of_Purchase	CLIENTID	CLIENTNM	balance	AadharDebit	PANDEBIT--%>
        <asp:BoundField DataField="CLIENTID" HeaderText="CLIENTID"  Visible="false"/>
        
                                                    <asp:TemplateField HeaderText="SrNo" Visible="true" HeaderStyle-Width="100px">

                                                       <ItemTemplate>
                                                            <%#Container.DataItemIndex+1 %>
                                                        </ItemTemplate>
                                                    </asp:TemplateField>
               <asp:BoundField DataField="Date_of_Purchase" HeaderText="Date_of_Purchase"  />
               <asp:BoundField DataField="CLIENTNM" HeaderText="Name"  />
               <asp:BoundField DataField="balance" HeaderText="Balance"  />
               <asp:BoundField DataField="AadharDebit" HeaderText="AadharDebit"  />
               <asp:BoundField DataField="PANDEBIT" HeaderText="PANDEBIT"  />
             
                                                    

        <asp:TemplateField HeaderText="Action">
            <ItemTemplate>
                <asp:LinkButton ID="lnkButton" CommandArgument='<%#Eval("CLIENTID")+","+ Eval("CLIENTID")%>'  runat="server"  Text="Click Here" OnClick="lnkButton_Click"></asp:LinkButton>
            </ItemTemplate>
        </asp:TemplateField>
    </Columns>
</asp:GridView>

    <div id="SearchDiv" class="modal fade" role="dialog" ">
        <div class="modal-dialog modal-lg" style="width: 60%;padding-top:100px " >

            <!-- Modal content-->
            <div class="modal-content" style="height:90%;">
               
                <div class="modal-body">
                     <div class="panel-heading" style="background-color: #4d88ff; font-size:30px"><b>Details</b></div>
                    <div class="panel-body">
                   <asp:Table ID="TblDiv_MainWindow" runat="server" Width="100%">
                                    <asp:TableRow ID="Tbl_R1" runat="server">
                                        <asp:TableCell ID="Tbl_c1" runat="server" Width="100%" BorderStyle="Solid" BorderWidth="1px">
                       <div class="row" style="margin: 7px 0 7px 0">
                                                <div class="col-lg-12">
                                                    <label class="control-label col-md-2">Credit</label>
                                                    <div class="col-md-2">
                                                        <asp:TextBox ID="TxtBrcd" CssClass="form-control" runat="server" TabIndex="1"></asp:TextBox>
                                                    </div>

                                                    <div class="col-md-2">
                                                        <asp:TextBox ID="TextBox2" Visible="false" CssClass="form-control" runat="server" TabIndex="1"></asp:TextBox>
                                                    </div>

                                                     <div class="col-md-2">
                                                        <asp:TextBox ID="TextBox3" Visible="false" CssClass="form-control" runat="server" TabIndex="1"></asp:TextBox>
                                                    </div>
                                                </div>
                                            </div>
                                            <div id="Div2" class="row" style="margin: 7px 0 7px 0" runat="server">
                                                <div class="col-lg-12">
                                                    <label class="control-label col-md-2">Date_of_Purchase<span class="required">*</span></label>
                                                    <div class="col-md-3">
                                                        <%--<asp:TextBox ID="TextBox1" CssClass="form-control" runat="server" AutoPostBack="true" TabIndex="2"></asp:TextBox>
                                   --%>                
                                                    <%--    <asp:TextBox runat="server" ID="TextBox1" CssClass="form-control" onkeyup="FormatIt(this);" onkeypress="javascript:return isNumber (event)" placeholder="From Date"  type="date"/>
                                    --%>          <asp:TextBox runat="server" ID="txtfrmdate" CssClass="form-control" onkeyup="FormatIt(this);" onkeypress="javascript:return isNumber (event)" placeholder="From Date"  />
                                  

                                                    </div>
                                                   <label class="control-label col-md-2">DOC Type:<span class="required">*</span></label>
                                                        <div class="col-lg-2">
                                                            <asp:DropDownList ID="ddldoctype" runat="server" CssClass="form-control">
                                                                <asp:ListItem Value="0">--Select--</asp:ListItem>
                                                                <asp:ListItem Value="1">Adhar</asp:ListItem>
                                                                <asp:ListItem Value="2">PAN</asp:ListItem>
                                                            </asp:DropDownList>
                                                        </div>
                                                </div>
                                            </div>
                                                                                                                           
                                          
                                        </asp:TableCell>
                                        <asp:TableCell ID="TableCell2" runat="server" Width="30%" BorderStyle="Solid" BorderWidth="1px">
                                        </asp:TableCell>
                                    </asp:TableRow>
                                </asp:Table>
                                <%-- -------------------------FOR INSURANCE DETAILS---------------------------------- --%>

                               
                          
                          
                        <div class="row" style="margin:7px 0 7px 0" >
                            <div class="col-md-4">
                                </div>
                              <div class="col-md-2"><asp:Button ID="Button3" runat="server"  Text="Submit" CssClass="btn btn-primary" OnClick="Button3_Click" /></div>
                             <div class="col-md-2">
                                  
                             <asp:Button ID="Button1" runat="server"  Text="Exit" CssClass="btn btn-primary" data-dismiss="modal" />
                            
                                 </div>
                        </div>

                        </div>
                        </div>
                   
                    </div>
                </div>
    </div>
</asp:Content>
