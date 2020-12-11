package org.smartgiveaway.model.giveaway;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Builder
public class GiveAway {
  private String giveawayId;
  private String name;
  private String tweetLink;
  private String description;
  private int likeScore;
  private int retweetScore;
  private int maxParticipants;
  private double prize;
}
