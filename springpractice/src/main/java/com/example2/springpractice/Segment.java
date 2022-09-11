package com.example2.springpractice;

public class Segment

{

    private Point e1;

    private Point e2;

    public Segment() {
    }

    public Segment(Point e1, Point e2)

    {

        this.e1 = e1;

        this.e2 = e2;

    }

    public Point getE1()

    {

        return e1;

    }

    public void setE1(Point e1)

    {

        this.e1 = e1;

    }

    public Point getE2()

    {

        return e2;

    }

    public void setE2(Point e2)

    {

        this.e2 = e2;

    }

    @Override

    public String toString()

    {

        return "Segment{" + "e1=" + e1 + ", e2=" + e2 + '}';

    }

}
