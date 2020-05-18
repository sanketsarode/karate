package examples.users;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit5.Karate;

class UsersRunner {

    @Karate.Test
    Karate testFullPath() {
        return Karate.run("classpath:features/users.feature").tags("@FirstScenario");
    }
}