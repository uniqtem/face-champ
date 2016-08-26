/**
 *
 */
package facechamp.security;

import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @since 2016. 7. 28.
 * @author Just Burrow just.burrow@lul.kr
 */
@Component
public class UserService implements UserDetailsService {
  private final AccountStatusUserDetailsChecker detailsChecker = new AccountStatusUserDetailsChecker();

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // <I>UserDetailsService
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
   * (non-Javadoc)
   * @since 2016. 7. 28.
   */
  @Override
  public final User loadUserByUsername(String username) throws UsernameNotFoundException {
    // User user;
    // if (0L < this.accountRepository.countByUsername(username)) {
    // user = new User(username, "", Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
    // } else {
    // throw new UsernameNotFoundException("user not found");
    // }
    // this.detailsChecker.check(user);
    // return user;
    return null;
  }
}