package study.jpaReadWrite;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.jpaReadWrite.entity.User;
import study.jpaReadWrite.service.UserService;

import java.util.List;

@Slf4j
@SpringBootTest
class JpaReadWriteApplicationTests {

	@Autowired private UserService userService;

	@Test
	void contextLoads() {

		List<User> userRead = userService.getListRead();
		List<User> userWrite = userService.getListWrite();

		log.info("읽기 DB={}", userRead.get(0).getName());
		log.info("쓰기 DB={}", userWrite.get(0).getName());

	}

}
