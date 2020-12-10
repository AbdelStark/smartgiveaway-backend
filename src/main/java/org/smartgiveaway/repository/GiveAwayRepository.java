package org.smartgiveaway.repository;

import java.util.List;
import java.util.Optional;

import org.smartgiveaway.model.giveaway.GiveAway;

public interface GiveAwayRepository {

  void save(GiveAway giveAway);

  Optional<GiveAway> findByID(String giveawayID);

  List<GiveAway> findAll();
}
