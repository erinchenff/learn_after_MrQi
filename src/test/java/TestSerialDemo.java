import java.io.*;

public class TestSerialDemo {
    public static void main(String[] args) throws Exception {
        serializeFlyPig();

        FlyPig flyPig = deserailizeDemo();
        System.out.println(flyPig.toString());
    }

    /**
     * 序列化
     */
    private static void serializeFlyPig() throws IOException {
        FlyPig flyPig = new FlyPig();
        flyPig.setColor("red");
        flyPig.setName("haohao");
        flyPig.setCar("0000");

        // 序列化操作  ObjectOutputStream 对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("output/flypig.txt")));
        oos.writeObject(flyPig);
        System.out.println("FlyPig 对象序列化成功！");
        oos.close();

    }

    /**
     * 反序列化  ObjectInputStream 对象输入流
     */
    private static FlyPig deserailizeDemo() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("output/flypig.txt")));
        FlyPig person = (FlyPig) ois.readObject();
        System.out.println("FlyPig对象反序列化成功！");
        return person;
    }
}
