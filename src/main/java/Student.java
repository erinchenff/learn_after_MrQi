public class Student implements Cloneable{

    private String name;//引用类型  final关键字 一是不可变，二是禁止指令重排

    private int age;//基本类型

    private Classes classes;//引用类型

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setClasses(Classes classes){
        this.classes = classes;
    }

    public String getName(){
        return name;
    }

    public Classes getClasses(){
        return classes;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", classes=" + classes + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student stu = (Student)super.clone();
        //克隆classes属性时候调用Classes类的clone();
        Classes cla = (Classes)classes.clone();
        stu.setClasses(cla);
        return stu;
    }
}
