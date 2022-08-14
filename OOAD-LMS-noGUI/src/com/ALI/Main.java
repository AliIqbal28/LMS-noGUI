package com.ALI;

public class Main {

    public static void main(String[] args) {

        //Registration r=new Registration();

        Admin admin=new Admin("aftab",45);
        
        admin.set_re_startdate(2019,1,1);

        admin.set_re_enddate(2019,5,1);

        //load students in admin list
        admin.add_new_student("ali",4134);
        //load courses in in list
        admin.add_new_course("ooad", "A", 55);
       // Student s=new Student("ali",4134);
       // Course c=new Course("ooad", "A", 55);
        //s.setReg(r);
        String st_name="ali";
        //int i=0;
       // while(admin.getA_l_st().get(i).getName()!=st_name)
          //  i++;

       Student s=admin.getA_l_st().get(0); // temp student, first student at index 0

       String courseName="ooad";   //hardcoded, instead of this, whole list of available courses will be shown
        s.addCourse(courseName,"A");
       // s.add_marks(c); it works for a course object, implement it later

       // Teacher t=new Teacher("shakeel",6,);
        //t.add_section_in_teacher("A");


        //implement-if seats are full do not show in drop down menu



    }
}
