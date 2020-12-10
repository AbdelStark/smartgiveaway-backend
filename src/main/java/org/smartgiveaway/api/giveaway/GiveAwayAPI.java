package org.smartgiveaway.api.giveaway;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.smartgiveaway.model.giveaway.GiveAway;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(path = "/giveaway", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "GiveAway API", description = "GiveAway Web API documentation")
public interface GiveAwayAPI {
  @Operation(summary = "Find a giveaway by id")
  @GetMapping(path = "/{giveawayID}")
  @ResponseBody
  GiveAway findByID(@Parameter(description = "giveaway id") @PathVariable String giveawayID);

  @Operation(summary = "Find all giveaways")
  @GetMapping
  @ResponseBody
  List<GiveAway> findAll();

  @Operation(summary = "Create giveaway")
  @PostMapping
  @ResponseBody
  void create(@RequestBody GiveAway giveAway);
}
