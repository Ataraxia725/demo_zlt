import edu.sicau.SpringBootApplicationn;
import edu.sicau.dao.UserDao;
import edu.sicau.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootApplicationn.class})
public class SpringBootDemoTest {

    @Autowired
    UserDao dao;
    @Test
    public void testSaveUser(){
        User user = new User();
        user.setUsername("pyy");
        user.setPassword("123");
        dao.saveUser(user);
    }
}
