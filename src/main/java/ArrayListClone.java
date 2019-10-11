import java.util.ArrayList;
import java.util.List;

public class ArrayListClone {

    public static void main(String[] args) {
        User u1 = new User();
        u1.setUsername("qwe");
        u1.setPassword("qwePASSWORD");
        User u2 = new User();
        u2.setUsername("asd");
        u2.setPassword("asdPassword");
        ArrayList<User> list1 = new ArrayList<>();
        list1.add(u1);
        list1.add(u2);
        ArrayList<User> list2 = (ArrayList<User>) list1.clone();
        list2.get(0).setUsername("zxc"); //修改u1的username
        list2.get(0).setPassword("zxcPassword"); ////修改u1的password
        System.out.println(list1); //[User [username=zxc, password=zxcPassword], User                                             //[username=asd, password=asdPassword]]
    }
    /**
     * 实现深复制
     */
    private static List<User> deepClone(List<User> from) throws CloneNotSupportedException {
        List<User> list = new ArrayList<>();
        for(User item : from) {
//            list.add((User)item.clone());
        }
        return list;
    }
}

class User {
    private String username;
    private String password;
    public User() {
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + "]";
    }
}