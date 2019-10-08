import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/**
 * @desc ArrayList 遍历方式和效率的测试程序
 * 每次跑的数据不准确
 * iteratorThroughRandomAccess: 4 ms
 * IteratorThroughIterator: 6 ms
 * iteratorThroughFor: 5 ms
 * 结论：遍历ArrayList时，使用随机访问(即，通过索引序号访问)效率最高，而使用迭代器的效率最低！
 */
public class ArrayListRandomAccessTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10000000; i++)
            list.add(i);
        //isRandomAccessSupported(list）；
        iteratorThroughRandomAccess(list);
        iteratorThroughIterator(list);
        iteratorThroughFor(list);

    }

    private static void isRandomAccessSupported(List list) {
        if (list instanceof RandomAccess) {
            System.out.println("RandomAccess implemented!");
        } else {
            System.out.println("RandomAccess not implemented!");
        }
    }

    //    随机访问，通过索引值去遍历  由于ArrayList实现了RandomAccess接口，它支持通过索引值去随机访问元素。
    public static void iteratorThroughRandomAccess(List list) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughRandomAccess: " + interval + " ms");
    }

    //    通过迭代器遍历。即通过Iterator去遍历
    public static void iteratorThroughIterator(List list) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for (Iterator iter = list.iterator(); iter.hasNext(); ) {
            iter.next();
        }
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("IteratorThroughIterator: " + interval + " ms");
    }

    //    for循环遍历
    public static void iteratorThroughFor(List list) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for (Object obj : list)
            ;
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughFor: " + interval + " ms");
    }
}
