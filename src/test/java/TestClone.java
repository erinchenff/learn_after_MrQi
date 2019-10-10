public class TestClone {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(10);

        Classes classes = new Classes();
        classes.setClassId(101);
        classes.setClassName("一班");
        stu.setClasses(classes);


        try{
            System.out.println("深克隆测试-----");
            //克隆
            Student stu2 = (Student)stu.clone();
            System.out.println("两个对象是否相同：" + (stu == stu2));
            System.out.println("两个对象name属性是否相同：" + (stu.getName() == stu2.getName()));
            System.out.println("两个对象classes是否相同：" + (stu.getClasses() == stu2.getClasses()));
            System.out.println("深克隆，Stu" + stu);
            System.out.println("深克隆，Stu2" + stu2);

            System.out.println("修改克隆对象属性");
            stu2.setName("李四"); // public final class String 一是不可变，二是禁止指令重排 修改了name属性的引用
            stu2.setAge(20);
            stu2.getClasses().setClassId(102);
            stu2.getClasses().setClassName("二班");
            System.out.println("修改克隆对象属性后，Stu " + stu);
            System.out.println("修改克隆对象属性后，Stu2 " + stu2);

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }



    }
}
