package com.ALI;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User  {

    private Course t_c;
    private List<Section> t_sections;

    public Teacher(String name, int id, Course t_c) {
        super(name, id);
        this.t_c = t_c;
        t_sections=new ArrayList<Section>();
    }

    public void add_section_in_teacher(String sec_name)
    {
        int i;
        for( i=0;t_c.getSecList().get(i).getName()!=sec_name;i++)
        {
            //do nothing
        }
        t_sections.add(t_c.getSecList().get(i));
        System.out.println("section "+ sec_name + " added in teacher");




    }
}
