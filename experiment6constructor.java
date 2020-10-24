import java.io.*;

class constructor
{
    // data members of the class.
    String name;
    int id;

    constructor(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}

class contruct
{
    public static void main (String[] args)
    {
        // this would invoke the parameterized constructor.
        constructor val = new constructor("adam", 1);
        System.out.println("constructor experiment by deepak");
        System.out.println("Name :" + val.name +
                " and Id :" + val.id);
    }
}
