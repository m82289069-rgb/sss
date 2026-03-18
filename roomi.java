class roomi
{
int area,length,breadth;
roomi()
{
length=0;
breadth=0;
}
roomi(int l,int b)
{
length=l;
breadth=b;

roomi(roomi r)
{
length=r.length;
breadth=r.breadth;
}
public void calculatearea()
{
area=length*breadth;
System.out.println("area is"+area);
}
public static void main(String a[])
{
roomi r1=new roomi();
r1.calculatearea();
roomi r2=new roomi(4,3);
r2.calculatearea();
roomi r3=new roomi(r2);
r3.calculatearea();
}
}