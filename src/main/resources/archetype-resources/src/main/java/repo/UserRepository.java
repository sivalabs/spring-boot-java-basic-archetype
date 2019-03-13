#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repo;

import ${package}.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getById(Long id) {
        return new User();
    }
}
