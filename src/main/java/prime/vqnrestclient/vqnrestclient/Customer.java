package prime.vqnrestclient.vqnrestclient;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Customer {
    private String   customer_No ;
    private String   customer_Type ;
    private String   customer_Name ;
    private String   first_Name ;
    private String   middle_Name ;
    private String   last_Name ;
    private String   nib_No ;

    private String     date_Of_Birth ;
    private String   sex ;
    private String   customer_Category ;
    private String   birth_Country ;
    private String   country ;
    private String   e_Mail ;
    private String   telephone ;
    private String   mobile_Number ;
    private String   work_Phone ;
    private String   fax_Number ;
    private String   corporate_Name ;
    private String     incorp_Date ;
    private String   business_Licence_No ;
    private String   business_Description ;
    private String   ssn ;

    public String getCustomer_No() {
        return customer_No;
    }

    public void setCustomer_No(String customer_No) {
        this.customer_No = customer_No;
    }

    public String getCustomer_Type() {
        return customer_Type;
    }

    public void setCustomer_Type(String customer_Type) {
        this.customer_Type = customer_Type;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getMiddle_Name() {
        return middle_Name;
    }

    public void setMiddle_Name(String middle_Name) {
        this.middle_Name = middle_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getNib_No() {
        return nib_No;
    }

    public void setNib_No(String nib_No) {
        this.nib_No = nib_No;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCustomer_Category() {
        return customer_Category;
    }

    public void setCustomer_Category(String customer_Category) {
        this.customer_Category = customer_Category;
    }

    public String getBirth_Country() {
        return birth_Country;
    }

    public void setBirth_Country(String birth_Country) {
        this.birth_Country = birth_Country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getE_Mail() {
        return e_Mail;
    }

    public void setE_Mail(String e_Mail) {
        this.e_Mail = e_Mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile_Number() {
        return mobile_Number;
    }

    public void setMobile_Number(String mobile_Number) {
        this.mobile_Number = mobile_Number;
    }

    public String getWork_Phone() {
        return work_Phone;
    }

    public void setWork_Phone(String work_Phone) {
        this.work_Phone = work_Phone;
    }

    public String getFax_Number() {
        return fax_Number;
    }

    public void setFax_Number(String fax_Number) {
        this.fax_Number = fax_Number;
    }

    public String getCorporate_Name() {
        return corporate_Name;
    }

    public void setCorporate_Name(String corporate_Name) {
        this.corporate_Name = corporate_Name;
    }

    public String getBusiness_Licence_No() {
        return business_Licence_No;
    }

    public void setBusiness_Licence_No(String business_Licence_No) {
        this.business_Licence_No = business_Licence_No;
    }

    public String getBusiness_Description() {
        return business_Description;
    }

    public void setBusiness_Description(String business_Description) {
        this.business_Description = business_Description;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDate_Of_Birth() {
        return this.date_Of_Birth;
    }

    public void setDate_Of_Birth(String date_Of_Birth) {
        this.date_Of_Birth = date_Of_Birth;
    }

    public String getIncorp_Date() {
        return incorp_Date;
    }

    public void setIncorp_Date(String incorp_Date) {
        this.incorp_Date = incorp_Date;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this) ;
    }
}
