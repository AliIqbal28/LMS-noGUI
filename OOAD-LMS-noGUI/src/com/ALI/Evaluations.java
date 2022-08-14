package com.ALI;

public class Evaluations {
    private int Quiz;
    private int mid;
    private int finals;
    private Course cs;

    public Evaluations(int quiz, int mid, int finals, Course cs) {
        Quiz = quiz;
        this.mid = mid;
        this.finals = finals;
        this.cs = cs;
    }

    public Course getCs() {
        return cs;
    }

    public void setQuiz(int quiz) {
        Quiz = quiz;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public void setFinals(int finals) {
        this.finals = finals;
    }

    public void print()
    {
        System.out.println("course: "+cs.getCourseName());
        System.out.println("quiz: "+ Quiz);
    }
}
