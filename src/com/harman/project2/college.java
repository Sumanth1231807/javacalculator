package com.harman.project2;

public class college {


    void setAcademicfee();
}
class cse_dept implements College{

    public void setAcademics()
    {
        System.out.println("inr 75000");
    }

}
class officeadministrator{
    public static void main(String[] args) {
        college ob_cse=new cse_dept();
        ob_cse.setAcademicfee();
    }
}

