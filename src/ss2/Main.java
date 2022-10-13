package ss2;
import congThuc.Student;
public class Main {
    public static void main(String[] args) {
        fptStudent s =new fptStudent("hello--11");
        s.run();
        s.run(5);
        s.run("hello");
        s.run(5,"hello");
        s.run("hello",3);
        fptStudent t2 = new fptStudent("3102","hien","0912313");
        System.out.println(t2.code+t2.name+t2.tel);


    }
}
