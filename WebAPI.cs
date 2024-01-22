using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;


namespace CISCS_V1
{
    public class WebAPI : ApiController
    {
        CISCS_testEntities1 db = new CISCS_testEntities1();
        // GET api/<controller>
        public IEnumerable<string> Get()
        {
            return new string[] { "value1", "value2" };
        }

        // GET api/<controller>/5
        public string Get(int id)
        {
            return "value";
        }

        // POST api/<controller>
        public void Post([FromBody]string value)
        {
        }

        // PUT api/<controller>/5
        public void Put(int id, [FromUri]string value)
        {
        }

        // DELETE api/<controller>/5
        public void Delete(int id)
        {
        }

        //[Route("api/VerifyAadhar/"), HttpPost]
        public string VerifyAadhar([FromUri] string value)
        {
            try
            {
                var result = db.tbl_AadharData.Where(x => x.AadharNumber == value).Select(x => x.AadharNumber).FirstOrDefault();

                if (result!=null)
                {
                    return "Exists";

                }
                else
                {
                    return "Sucess";
                }
            }
            catch (Exception ex)
            {
                return "invalid";
            }

        }
        //[Route("api/VerifyPan/"), HttpPost]
        public string VerifyPan([FromUri] string value)
        {
            try
            {
                var result = db.tbl_PanData.Where(x => x.PanNumber == value).Select(x => x.PanNumber).FirstOrDefault();

                if (result != null)
                {
                    return "Exists";

                }
                else
                {
                    return "Sucess";
                }
            }
            catch (Exception ex)
            {
                return "invalid";
            }

        }
        //[Route("api/VerifyVoter/"), HttpPost]
        //public string VerifyVoter([FromUri] string value)
        //{
          
        //    //try
        //    //{
        //    //    var result = db.tbl_VoterData.Where(x => x.VoterId == value).Select(x => x.VoterId).FirstOrDefault();

        //    //    if (result != null)
        //    //    {
        //    //        return "Exists";

        //    //    }
        //    //    else
        //    //    {
        //    //        return "Sucess";
        //    //    }
        //    //}
        //    //catch (Exception ex)
        //    //{
        //    //    return "invalid";
        //    //}

        //}
        //[Route("api/SaveAadhar/"), HttpPost]
        public string SaveAadhar([FromUri] tbl_AadharData value)
        {
            try
            {
                tbl_AadharData a = new tbl_AadharData();
                a.AadharNumber = value.AadharNumber;
                a.Name = value.Name;
                a.AgeRange = value.AgeRange;
                a.IsMobile = value.IsMobile;
                a.MobileLastDigit = value.MobileLastDigit;
                a.Gender = value.Gender;
                a.Address = value.Address;
                a.District = value.District;
                a.State = value.State;
                a.Zip = value.Zip;
                a.Country = value.Country;
                a.ClientId = value.ClientId;
                a.VerifiedBy = value.VerifiedBy;
                a.VerifiedDate = DateTime.Now;
                a.IsVerified = true;

                db.tbl_AadharData.Add(a);
                db.SaveChanges();

                return "Sucess";
            }
            catch (Exception ex)
            {
                return "invalid";
            }
        }
        //[Route("api/SavePan/"), HttpPost]
        public string SavePan([FromUri] tbl_PanData value)
        {
            try
            {
                tbl_PanData a = new tbl_PanData();
                a.PanNumber = value.PanNumber;
                a.Name = value.Name;
                a.FatherName = value.FatherName;
                a.DOB = value.DOB;
                a.ClientId = value.ClientId;
                a.VerifiedBy = value.VerifiedBy;
                a.VerifiedDate = DateTime.Now;
               

                db.tbl_PanData.Add(a);
                db.SaveChanges();

                return "Sucess";
            }
            catch (Exception ex)
            {
                return "invalid";
            }
        }
        //[Route("api/SaveVoter/"), HttpPost]
        //public string SaveVoter([FromUri] tbl_VoterData value)
        //{
        //    try
        //    {
        //        tbl_VoterData a = new tbl_VoterData();
        //        a.VoterId = value.VoterId;
        //        a.Name = value.Name;
        //        a.DOB = value.DOB;
        //        a.Gender = value.Gender;
        //        a.Area = value.Area;
        //        a.State = value.State;
        //        a.CliendId = value.CliendId;
        //        a.VerifiedBy = value.VerifiedBy;
        //        a.VerifiedDate = DateTime.Now;
            
        //        db.tbl_VoterData.Add(a);
        //        db.SaveChanges();

        //        return "Sucess";
        //    }
        //    catch (Exception ex)
        //    {
        //        return "invalid";
        //    }
        //}
    }
}