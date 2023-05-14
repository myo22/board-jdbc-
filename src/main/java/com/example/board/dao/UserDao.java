package com.example.board.dao;

import com.example.board.dto.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

// 데이터를 처리해 주는 역할. 직관적으로 알려줌
@Repository // spring이 관리하는 Bean
public class UserDao {
    // Spring JDBC를 이용한 코드.

    @Transactional // 두개의 쿼리가 실행되기 때문에 하나의 트랜잭션으로 실행해야 한다.
    public User addUser(String email, String name, String password){
        // Service에서 이미 트랜잭션이 시작했기 때문에, 그 트랜잭션에 포함된다. (새롭게 만들어지는것 X)
        // insert into user(email, name, password, regdate) values(?,?,?, now()); #user_id는 자동생성 -> auto generation.
        // SELECT LAST_INSERT_ID(); 바로 user에 담아서 리턴해준다.
        return null;
    }

//    public int getLastInsertId(){ 별도로 만드는 것보다 INSERT 작업때 같이 들어가는게 좋다.
//        // SELECT LAST_INSERT_ID();
//        return 0;
//    }

    @Transactional
    public void mappintUserRole(int userId){
        // Service에서 이미 트랜잭션이 시작했기 때문에, 그 트랜잭션에 포함된다. (새롭게 만들어지는것 X)
        //  insert into user_role(user_id, role_id) values (?, 1); # 첫번째 물음표는 위에서 생성된 아이디를 아래에서 사용
    }
}

