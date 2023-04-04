package com.sideproject.celticssideproject.model;

public class Player {
    private int playerId;
    private String playerName;
    private String position;
    private String pointsPerGame;
    private String assistsPerGame;
    private String reboundsPerGame;
    private String fieldGoalPercentage;
    private String threePointPercentage;
    private String freeThrowPercentage;

    public Player(int playerId, String playerName, String position, String pointsPerGame, String assistsPerGame, String reboundsPerGame, String fieldGoalPercentage, String threePointPercentage, String freeThrowPercentage) {
        this.playerId=playerId;
        this.playerName = playerName;
        this.position = position;
        this.pointsPerGame = pointsPerGame;
        this.assistsPerGame = assistsPerGame;
        this.reboundsPerGame = reboundsPerGame;
        this.fieldGoalPercentage = fieldGoalPercentage;
        this.threePointPercentage = threePointPercentage;
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public Player() {

    }


//    @Override
//    public String toString() {
//        return "\n--------------------------------------------" +
//                "\n Player Name: " + playerName +
//                "\n--------------------------------------------" +
//                "\n Position: " + position +
//                "\n points per game: " + pointsPerGame +
//                "\n assists per game: " + assistsPerGame +
//                "\n rebounds per game: " + reboundsPerGame +
//                "\n three point %: " + threePointPercentage +
//                "\n free throw %: " + freeThrowPercentage;

public void setPlayerId(int playerId) {
        this.playerId=playerId;
}
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPointsPerGame(String pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public void setAssistsPerGame(String assistsPerGame) {
        this.assistsPerGame = assistsPerGame;
    }

    public void setReboundsPerGame(String reboundsPerGame) {
        this.reboundsPerGame = reboundsPerGame;
    }

    public void setFieldGoalPercentage(String fieldGoalPercentage) {
        this.fieldGoalPercentage = fieldGoalPercentage;
    }

    public void setThreePointPercentage(String threePointPercentage) {
        this.threePointPercentage = threePointPercentage;
    }

    public void setFreeThrowPercentage(String freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }
    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPosition() {
        return position;
    }

    public String getPoints_per_game() {
        return pointsPerGame;
    }

    public String getAssistsPerGame() {
        return assistsPerGame;
    }

    public String getReboundsPerGame() {
        return reboundsPerGame;
    }

    public String getFieldGoalPercentage() {
        return fieldGoalPercentage;
    }

    public String getThreePointPercentage() {
        return threePointPercentage;
    }

    public String getFreeThrowPercentage() {
        return freeThrowPercentage;
    }
}
