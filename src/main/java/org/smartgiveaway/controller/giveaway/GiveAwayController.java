package org.smartgiveaway.controller.giveaway;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.smartgiveaway.api.giveaway.GiveAwayAPI;
import org.smartgiveaway.error.GiveAwayNotFound;
import org.smartgiveaway.model.giveaway.GiveAway;
import org.smartgiveaway.repository.GiveAwayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Slf4j
public class GiveAwayController implements GiveAwayAPI {
  @Autowired private GiveAwayRepository repository;

  @Override
  public GiveAway findByID(final String giveawayID) {
    return repository.findByID(giveawayID).orElseThrow(() -> new GiveAwayNotFound(giveawayID));
  }

  @Override
  public void delete(final String giveawayID) {
    log.info("removing giveaway: {}", giveawayID);
    repository.remove(giveawayID);
  }

  @Override
  public List<GiveAway> findAll() {
    return repository.findAll();
  }

  @Override
  public void create(final GiveAway giveAway) {
    log.info("creating giveaway: {}", giveAway);
    repository.save(giveAway);
  }
}
