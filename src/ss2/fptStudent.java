package ss2;


public class fptStudent {
    String code;


    String name;
    String tel;

    public fptStudent(String code, String name, String tel) {
        this.code = code;
        this.name = name;
        this.tel = tel;
    }

    public fptStudent(){
        System.out.println("hello world");
    }
    public fptStudent(String msg){
        System.out.println("hello world-fpt" + msg);
    }
    public void run() {
        System.out.println("run 5km/h");
    }

    public void run(int x) {
        System.out.println("run 15km/h");
    }

    public void run(String x) {
        System.out.println("run 25km/h");
    }

    public void run(int x, String z) {
        System.out.println("run 35km/h");
    }
    public void run(String x, int z) {
        System.out.println("run 45km/h");
    }



}
