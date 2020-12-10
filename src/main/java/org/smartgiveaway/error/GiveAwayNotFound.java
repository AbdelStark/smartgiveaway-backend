package org.smartgiveaway.error;

public class GiveAwayNotFound extends RuntimeException {
  private static final String MESSAGE_TEMPLATE = "giveaway [%s] was not found";

  public GiveAwayNotFound(final String giveAwayID) {
    super(String.format(MESSAGE_TEMPLATE, giveAwayID));
  }
}
