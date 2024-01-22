<%@ Page Title="" Language="C#" MasterPageFile="~/AdminPanel.Master" AutoEventWireup="true" CodeBehind="VoterVerification.aspx.cs" Inherits="DocumentVerification.VoterVerification" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
    <script src="fieldformatting.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</asp:Content>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="asp" %>
<asp:Content ID="Content3" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">

    <div class="content-wrapper">
          <asp:ToolkitScriptManager ID="ToolkitScriptManager1" runat="server" />
        <asp:UpdatePanel runat="server" ID="UpdatePanel" UpdateMode="Conditional">
            <ContentTemplate>
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>Voter Verification
            <small>Preview</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i>Dashboard</a></li>
                        <li><a href="#"><i class="fa fa-dashboard"></i>Document Verification</a></li>
                        <li class="active">Voter Verification</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">
                    <div class="row">
                        <div class="col-md-12">

                            <div class="box box-danger">
                                <div class="box-header">
                                </div>
                                <div class="box-body" style="margin-top: -5px">
                                    <div class="row">

                                        <div class="col-md-8 m-auto">

                                            <div class="row">
                                                <div class="col-md-5">
                                                    <label>Enter Voter ID :</label>
                                                </div>
                                                <div class="col-md-7">
                                                    <asp:TextBox runat="server" ID="txtvoterid" MaxLength="20" onkeypress="return FormatAlphanumeric(this);" CssClass="form-control" placeholder="Voter Number"></asp:TextBox>
                                                </div>
                                            </div>
                                            <br />
                                            <div class="row">
                                                <div class="col-md-5">
                                                    <asp:Button runat="server" ID="btnvoter" OnClick="btnvoter_Click" CssClass="btn btn-info" Text="Verify Voter" />
                                                    <asp:Button runat="server" ID="btnClear" OnClick="btnClear_Click" CssClass="btn btn-info" Text="Clear" />
                                                </div>
                                                <div class="col-md-7">
                                                </div>
                                            </div>
                                            <br />
                                            <div class="row" runat="server" id="divVoterInfo" visible="false">
                                                <div class="col-md-12">
                                                    <div class="row">
                                                        <div class="col-md-5">
                                                            <label>VoterId Id : </label>
                                                        </div>
                                                        <div class="col-md-7">
                                                            <asp:Label runat="server" id="lblvotenumber"></asp:Label>
                                                        </div>
                                                    </div>
                                                    <br />
                                                    <div class="row">
                                                        <div class="col-md-5">
                                                            <label>Full Name : </label>
                                                        </div>
                                                        <div class="col-md-7">
                                                            <asp:Label runat="server" id="lblfullname"></asp:Label>
                                                        </div>
                                                    </div>
                                                    <br />
                                                    <div class="row">
                                                        <div class="col-md-5">
                                                            <label>Gender : </label>
                                                        </div>
                                                        <div class="col-md-7">
                                                            <asp:Label runat="server" id="lblgender"></asp:Label>
                                                        </div>
                                                    </div>
                                                    <br />
                                                    <div class="row">
                                                        <div class="col-md-5">
                                                            <label>Age : </label>
                                                        </div>
                                                        <div class="col-md-7">
                                                            <asp:Label runat="server" id="lbldob"></asp:Label>
                                                        </div>
                                                    </div>
                                                    <br />
                                                    <div class="row">
                                                        <div class="col-md-5">
                                                            <label>Area : </label>
                                                        </div>
                                                        <div class="col-md-7">
                                                            <asp:Label runat="server" id="lblarea"></asp:Label>
                                                        </div>
                                                    </div>
                                                    <br />
                                                </div>
                                            </div>

                                            <%--<script type="text/javascript">
                                                $(document).ready(function () {
                                                    $(".divVoterInfo").hide();

                                                    $('[id$="btnvoter"]').click(function () {
                                                        debugger;

                                                        if ($('[id$="btnvoter"]').val() == '') {
                                                            alert("Please enter Aadhar Number.");
                                                            return;
                                                        }
                                                        else {
                                                            $.ajax({

                                                                url: 'http://localhost:1180/api/VerifyVoter/',
                                                                method: 'GET',
                                                                cContentType: 'application/json',
                                                                data: {
                                                                    value: $('[id$="txtpanid"]').val(),
                                                                },
                                                                success: function (data) {
                                                                    $.ajax({
                                                                        url: 'https://sandbox.aadhaarkyc.io/api/v1/voter-id/voter-id',
                                                                        method: 'POST',
                                                                        ContentType: 'application/json',
                                                                        headers: {
                                                                            'Authorization': 'Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDE0NjYzOTgsIm5iZiI6MTYwMTQ2NjM5OCwianRpIjoiMTNkNzI2NGItNjA4OS00ZTE1LTllMmItNThhMDIzYzZhMjU5IiwiZXhwIjoxNjA0MDU4Mzk4LCJpZGVudGl0eSI6ImRldi5hdnNpbnNvdGVjaEBhYWRoYWFyYXBpLmlvIiwiZnJlc2giOmZhbHNlLCJ0eXBlIjoiYWNjZXNzIiwidXNlcl9jbGFpbXMiOnsic2NvcGVzIjpbInJlYWQiXX19.j7yYyOJ3tq1GsyLbbdoD7EYa4Nj8lOcEegbJd7voNS4'
                                                                        },
                                                                        data: {
                                                                            id_number: $('[id$="txtvoterid"]').val(),
                                                                        },
                                                                        success: function (response) {
                                                                            $("#lblvotenumber").text(response.data.client_id);
                                                                            $("#lblfullname").text(response.data.name);
                                                                            $("#lblgender").text(response.data.gender);
                                                                            $("#lbldob").text(response.data.dob);
                                                                            $("#lblarea").text(response.data.area);
                                                                            $(".divVoterInfo").show();
                                                                            alert('Valid Voter ID');

                                                                            $.ajax({
                                                                                url: 'http://localhost:1180/api/SaveVoter/',
                                                                                method: 'POST',
                                                                                cContentType: 'application/json',
                                                                                data: {

                                                                                    VoterId: $('[id$="txtvoterid"]').val(),
                                                                                    Name: response.data.name,
                                                                                    DOB: response.data.dob,
                                                                                    Gender: response.data.gender,
                                                                                    Area: response.data.area,
                                                                                    State: response.data.state,
                                                                                    ClientId: response.data.client_id,
                                                                                    VerifiedBy: '<%= Session["user"] %>'

                                                                                    },
                                                                                    success: function (data) {
                                                                                    },
                                                                                    error: function (jqXHR) {

                                                                                    }
                                                                                });
                                                                            },
                                                                            error: function (jqXHR) {
                                                                                $('[id$="txtvoterid"]').val('');
                                                                                alert('Invalid Voter Id.');
                                                                                $(".divVoterInfo").hide();
                                                                            },
                                                                        });
                                                                    },
                                                                    error: function (jqXHR) {
                                                                        alert('Already Verified');
                                                                    },

                                                                });
                                                        }
                                                        event.preventDefault();
                                                    });

                                                });

                                            </script>--%>

                                        </div>
                                    </div>
                                </div>
                            </div>
                            <br />
                        </div>
                    </div>
                </section>

            </ContentTemplate>
             <Triggers>

                <asp:PostBackTrigger ControlID="btnvoter"  />   
                 <asp:PostBackTrigger ControlID="btnClear"  />                                  
           </Triggers>
        </asp:UpdatePanel>
    </div>
</asp:Content>
