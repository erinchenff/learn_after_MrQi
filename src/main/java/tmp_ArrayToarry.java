import java.util.*;

public class tmp_ArrayToarry {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);
        Iterator<Integer> iterator = list.iterator();
        list.add(8); //修改了ArrayList
        while(iterator.hasNext()) {
            System.out.println(iterator.next()); //java.util.ConcurrentModificationException
        }

//        List list = new ArrayList(new StringCollection()); //假设StringCollection集合内部是一个String数组
//        Object[] arr = list.toArray(); // 由于构造函数转换了数组类型，所以这个arr数组可以正常使用，真是nice啊
//        System.out.println(arr.getClass());// class [Ljava.lang.Object;返回的是Object数组
//        arr[0] = "";
//        arr[0] = 123;
//        arr[0] = new Object();


//        Object[] objArr = new String[5];
//        objArr[0] = "qwe";
//        objArr[1] = new Object(); //java.lang.ArrayStoreException
//        System.out.println(Arrays.toString(objArr));

//        List<Integer> list = new ArrayList<>();
//        Collections.addAll(list,1,2,3,4,5,6);
//        // 方式1 //
//        list.toArray(new Integer[0]); //涉及到反射，效率较低
//        // 方式2 //
//        list.toArray(new Integer[list.size()]);
    }


}
