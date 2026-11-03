import java.util.Scanner;
class Point{
    private int x;  
    private int y;
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
class Rectangle{
    Point p1;
    Point p2;
    int area;
    public void setPoint (Point p1, Point p2){
        this.p1 =p1;
        this.p2 = p2;
    }
    public int getArea(){
        int a = Math.abs (p1.getX ()-p2.getX ());
        int b = Math.abs (p1.getY ()-p2.getY ());
        return a*b;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        Point p1 = new Point(); 
        Point p2 = new Point();  

        System.out.print("输入第一个端点的坐标：");
        p1.setX(sc.nextInt());
        p1.setY(sc.nextInt());

        System.out.print("输入第二个端点的坐标：");
        p2.setX(sc.nextInt());
        p2.setY(sc.nextInt());

        Rectangle rect = new Rectangle(); //创建矩形对象
        rect.setPoint(p1,p2);             //给矩形传入两个对角点
        System.out.println("Area: " + rect.getArea()); //调用方法求面积输出

        sc.close(); //关闭扫描器
    }
}
