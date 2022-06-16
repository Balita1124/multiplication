package microservices.book.multiplication.challenge;

import microservices.book.multiplication.user.User;

public class ChallengeServiceImpl implements ChallengeService {
    @Override
    public ChallengeAttempt verifyAttemp(ChallengeAttemptDto dto) {
        boolean isCorrect = dto.getGuess() == (dto.getFactorA() * dto.getFactorB());
        User user = new User(null, dto.getUserAlias());
        return new ChallengeAttempt(null, user, dto.getFactorA(), dto.getFactorB(), dto.getGuess(), isCorrect);
    }
}
