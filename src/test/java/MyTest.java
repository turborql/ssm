import com.ql.domain.Books;
import com.ql.mapper.BookMapper;
import com.ql.service.BookServicesImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: QiuLan
 * @Date: 2020/2/10 9:02 上午
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServicesImpl bookServiceImpl = (BookServicesImpl) context.getBean("BookServicesImpl");
        for (Books books : bookServiceImpl.queryAll()) {
            System.out.println(books);
        }
    }
}
