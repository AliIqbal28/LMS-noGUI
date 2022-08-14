package com.ALI;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private Registration a_reg;
    private List<Course> a_l_cou;
   // private List<Section> a_l_sec;  because course has the option to make new section
    private List<Student> a_l_st;
    private List<Teacher> a_l_tc;

    public Admin(String name, int id) {
        super(name, id);
        a_reg=new Registration();
        a_l_cou=new ArrayList<Course>();
        a_l_st=new ArrayList<Student>();
        a_l_tc=new ArrayList<Teacher>();

    }

    public List<Student> getA_l_st() {
        return a_l_st;
    }

    public List<Course> getA_l_cou() {
        return a_l_cou;
    }

    public void set_re_startdate(int year, int month, int dayOfMonth)
    {
        a_reg.setStart_date(year,month,dayOfMonth);

    }

    public void set_re_enddate(int year, int month, int dayOfMonth)
    {
        a_reg.setEnd_date(year,month,dayOfMonth);

    }

    public void add_new_course(String course_name, String sec_name, int seats)
    {
        Course c=new Course("ooad", "A", 55); //list of courses for students to choose from
        a_l_cou.add(c);

    }


    public void add_new_CourseSection(String cou_name)  //adds new section to a course
    {
        int i=0;
        while(a_l_cou.get(i).getCourseName()!= cou_name)
            i++;

        String sec_name="A";  //hardcoded
        int seats=55;

        a_l_cou.get(i).make_new_section(sec_name,seats);

    }

    public void add_new_student(String name, int id) //complete list of students
    {
        Student s=new Student("ali",4134);
        a_l_st.add(s);
        s.setA(this);
        s.setReg(a_reg);

    }

    public void add_new_teacher(String name, int id, Course c) //complete list of teachers with their courses
    {
        Teacher t=new Teacher("farwa",1, c);

    }


}
