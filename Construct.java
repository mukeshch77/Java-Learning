class Demo
{
int x, y;
Demo(int p, int q)
{
x=p;
y=q;
}
Demo(int f)
{
}
Demo()
{
}
}
class Construct
{
public static void main(String []args)
{
Demo d1=new Demo(5,6);
Demo d2=new Demo(7);
Demo d3=new Demo();
}
}
