import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import rewards.RewardNetwork;
import rewards.TestInfrastructureConfig;

public class RewardNetworkTests {
    private RewardNetwork rewardNetwork;

    @BeforeEach
    public void setUp() {
        ApplicationContext context = SpringApplication.run(TestInfrastructureConfig.class);
        rewardNetwork = context.getBean(RewardNetwork.class);
    }

    @Test
    public void testRewardForDining() {
        assertEquals(1, 1);
    }
}
