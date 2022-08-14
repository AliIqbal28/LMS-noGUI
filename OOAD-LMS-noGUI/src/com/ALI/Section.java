package com.ALI;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private String name;
    private int max_seats;
    private int curr_st;
    private List<Student> st;

    public Section(String name, int max_seats) {
        this.name = name;
        this.max_seats = max_seats;
        curr_st=0;
        st=new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public boolean add_student(Student obj)
    {
        if(curr_st==max_seats)
            return false;
        else {
            st.add(obj);
            curr_st++;
            return true;
        }


    }

    public void setName(String name) {
        this.name = name;
    }
}
