package org.example;

class Super
{
    int length,breadth;
    Super(int l,int b)
    {
        length=l;
        breadth=b;
    }
    int getarea()
    {
        return(length*breadth);
    }
}
class Perimeter extends Super
{
    Perimeter(int l,int b)
    {
        super(l,b);
    }
    int getperimeter()
    {
        System.out.printf("Perimeter of rectangle for L=%d and B=%d is:",length,breadth);
        return(2*getarea());
    }
}
class Areaperimeter
{
    public static void main(String args[])
    {
        int length=8,breadth=12;
        Perimeter p1=new Perimeter(length,breadth);
        System.out.println("Area of rectangle for L="+length+" and B="+breadth+" is:" +p1.getarea());
        Perimeter p2=new Perimeter(10,15);
        System.out.println(+p2.getperimeter());
    }
}