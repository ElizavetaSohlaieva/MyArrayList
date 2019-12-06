import com.epam.com.MyArrayList;
import com.epam.com.User;
import com.epam.com.UserDao;
import org.junit.Test;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class UnitTests {
    @Test
    public void testAddList(){
        MyArrayList list = new MyArrayList();
        list.add(1);
        assertNotNull("List is not empty", list);
    }
    @Test
    public void testSizeList() {
        final int expected = 0;
        MyArrayList list = new MyArrayList();
        assertEquals(expected, list.size());
    }
   @Test
    public void testContainsList(){
        MyArrayList list = new MyArrayList();
        list.add(5);
        assertTrue(list.contains(5));
    }
    @Test
    public void testClearList() {
        MyArrayList list = new MyArrayList();
        list.clear();
        assertNull("List is empty", null);
    }
    @Test
    public void testRemoveList() {
        MyArrayList list = new MyArrayList();
        list.add(5);
        list.add(1);
        list.remove(0);
        assertEquals(1, list.size());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testNegativeRemove() throws IndexOutOfBoundsException{
       new MyArrayList().remove(0);
    }

    @Test
    public void checkSaveUserDao(){
        UserDao user = new UserDao();
        user.save("q", "u");
        assertNotNull("List is not empty", user);
    }
    @Test
    public void checkContainsUserDao(){
        UserDao user = new UserDao();
        user.save("A", "B");
        assertTrue(user.contains(new User("A", "B")));
    }
    @Test
    public void checkClearUserDao(){
        UserDao user = new UserDao();
        user.clear();
        assertNull("DataBase is empty", null);
    }
}
