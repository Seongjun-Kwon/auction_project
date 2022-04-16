package com.modaljoa.tft.dto;

import lombok.Data;

@Data
public class LeagueEntryDTO {

    private String leagueId;
    private String summonerId;
    private String summonerName;
    private String queueType;
    private String ratedTier;
    private int ratedRating;
    private String tier;
    private String rank;
    private int leaguePoints;
    private int wins;
    private int losses;
    private boolean hotStreak;
    private boolean veteran;
    private boolean freshBlood;
    private boolean inactive;
    private MiniSeriesDTO miniSeries;
}
