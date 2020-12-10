package org.smartgiveaway.repository.inmem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.smartgiveaway.model.giveaway.GiveAway;
import org.smartgiveaway.repository.GiveAwayRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InMemGiveAwayRepository implements GiveAwayRepository {
  private final Map<String, GiveAway> giveaways;

  public InMemGiveAwayRepository() {
    giveaways = new HashMap<>();
  }

  @Override
  public void save(final GiveAway giveAway) {
    giveaways.put(giveAway.getGiveawayId(), giveAway);
  }

  @Override
  public Optional<GiveAway> findByID(final String giveAwayID) {
    if (!giveaways.containsKey(giveAwayID)) {
      return Optional.empty();
    }
    return Optional.of(giveaways.get(giveAwayID));
  }

  @Override
  public List<GiveAway> findAll() {
    return new ArrayList<>(giveaways.values());
  }

  @Override
  public void remove(final String giveawayID) {
    giveaways.remove(giveawayID);
  }
}
