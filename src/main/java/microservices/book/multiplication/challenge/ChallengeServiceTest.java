package microservices.book.multiplication.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ChallengeServiceTest {
    private ChallengeService challengeService;

    @BeforeEach
    public void setUp() {
        challengeService = new ChallengeServiceImpl();
    }

    @Test
    public void checkCorrectAttemptTest() {
        //givin
        ChallengeAttemptDto dto = new ChallengeAttemptDto(50, 60, "Rico", 3000);
        //when
        ChallengeAttempt attempt = challengeService.verifyAttemp(dto);
        //then
        then(attempt.isCorrect()).isTrue();
    }
    @Test
    public void checkWrongAttemptTest() {
        //given
        ChallengeAttemptDto dto = new ChallengeAttemptDto(20, 30, "Faby", 50000);
        //when
        ChallengeAttempt attempt = challengeService.verifyAttemp(dto);
        //then
        then(attempt.isCorrect()).isFalse();
    }
}
