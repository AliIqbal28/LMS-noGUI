package com.ALI;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {


    Admin a;
    private List<Course> l_courses;
    private Registration reg;
    private Transcript t;
    private List<Evaluations> ev;


    public Student(String name, int id) {
        super(name, id);
        l_courses =new ArrayList<Course>();
        ev=new ArrayList<Evaluations>();
        reg=null;

    }

    public void setA(Admin a) {
        this.a = a;
    }

    public void setReg(Registration reg) {
        this.reg = reg;
    }

    public void addCourse(String course_name, String sec_name)  // available courses and section name should be shown in GUI
    {
        int i=0;
        while(a.getA_l_cou().get(i).getCourseName()!=course_name)
            i++;

        Course ctemp=a.getA_l_cou().get(i);

        if(reg.reg_period()) {

            l_courses.add(ctemp);
            ctemp.add_in_section(sec_name, this);
            Evaluations e = new Evaluations(0, 0, 0, ctemp);
            ev.add(e);
           // System.out.println("course added");
          //  System.out.println("student added in section " + ctemp.get_section().getName());

        }
        else
            System.out.println("registration period is not active");
    }

    public void add_marks(Course obj) //for teacher class
    {
        for(int i=0;i<ev.size();i++)
        {
            if(ev.get(i).getCs()==obj)
            {
                ev.get(i).setQuiz(43);
                ev.get(i).print(); //to check
            }
        }
    }

    public void dropCourse(Course obj)
    {
        if(reg.reg_period()) {
            l_courses.remove(obj);
            System.out.println("course added");

        }
        else
            System.out.println("registration period is not active");
    }

    public void print_all_courses()
    {
        for(int i = 0; i< l_courses.size(); i++)
        {
            System.out.println(l_courses.get(i).getCourseName());
        }
    }


}
