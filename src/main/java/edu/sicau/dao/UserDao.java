package edu.sicau.dao;
import edu.sicau.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    void saveUser(User user);
}
