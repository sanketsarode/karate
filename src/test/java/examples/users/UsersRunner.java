package examples.users;

import com.intuit.karate.junit5.Karate;

class UsersRunner {

    @Karate.Test
    Karate testFullPath() {
        return new Karate().feature("classpath:features/users.feature").tags("@FirstScenario");
    }
}