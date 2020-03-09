package pl.boniaszczuk.weekop.dao;

import pl.boniaszczuk.weekop.model.Vote;

public interface VoteDAO extends GenericDAO<Vote, Long> {

    public Vote getVoteByUserIdDiscoveryId(long userId, long discoveryId);
}
