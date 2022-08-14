package com.ALI;

import java.util.ArrayList;
import java.util.List;

public class Course  {
    private String coursename;
    private List<Section> sec;



    public void set_course_Sec(List<Section> sec) {
        this.sec = sec;
    }

    public Course() {

    }


    public Course(String c_name, String s_name, int seats) {
        sec=new ArrayList<Section>();
        this.coursename = c_name;
        Section s1=new Section(s_name,seats);
        sec.add(s1);
        System.out.println("new section "+ s_name);
    }

    public List<Section> getSecList() {
        return sec;
    }

    public void add_in_section(String sec_name, Student s)
    {
        int i=0;
        while(sec.get(i).getName()!=sec_name)
            i++;

        if(sec.get(i).add_student(s))
            System.out.println(s.getName() + " added in section "+ sec_name + " of " + coursename);
        else
        System.out.println("section full");


    }



    public Section get_latest_section()
    {
        return sec.get(sec.size()-1); //returns the latest section
    }

    public void make_new_section(String s_name, int seats)
    {
        Section s2=new Section(s_name,seats);
        System.out.println("new section "+ s_name);
        sec.add(s2);

    }


    public String getCourseName() {
        return coursename;
    }

}
