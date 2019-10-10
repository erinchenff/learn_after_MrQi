public class Classes implements Cloneable{

    private int classId;//基本类型

    private String className;//引用类型

    public void setClassId(int classId){
        this.classId = classId;
    }

    public void  setClassName(String className){
        this.className = className;
    }


    @Override
    public String toString() {
        return "Classes [classId=" + classId + ", className=" + className + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
