package edu.sicau;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("edu.sicau.dao")
public class SpringBootApplicationn {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationn.class);
    }
}
