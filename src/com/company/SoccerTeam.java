package com.company;

public class SoccerTeam {
	
	private int wins;
	private int losses;
	private int ties;
	
	private static int gamesPlayed=0;
	private static int goalsScored=0;
	
	public SoccerTeam()
	{
		wins = 0;
		losses = 0;
		ties = 0;
	}
	
	public void played(SoccerTeam other, int myScore, int otherScore)
	{
		gamesPlayed++;
		goalsScored += (myScore + otherScore);
		
		if(myScore > otherScore){
			wins++;
			other.losses++;
		}
		else if(myScore < otherScore){
			losses++;
			other.wins++;
		}
		else{
			ties++;
			other.ties++;
		}
			
	}
	
	public int getPoints()
	{
		return 3*wins + ties;
	}
	
	public void reset()
	{
		wins = 0;
		losses = 0;
		ties = 0;
	}
	
	public static int getGamesPlayed()
	{
		return gamesPlayed;
	}
	
	public static int getGoalsScored()
	{
		return goalsScored;
	}
	
	public static void resetTournament()
	{
		gamesPlayed = 0;
		goalsScored = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoccerTeam revs = new SoccerTeam();
		SoccerTeam nyrb = new SoccerTeam();
		SoccerTeam fire = new SoccerTeam();
		SoccerTeam sounders = new SoccerTeam();
		
		resetTournament();
		
		revs.played(nyrb,  4,  2);
		nyrb.played(fire, 3, 5);
		fire.played(sounders, 3, 3);
		sounders.played(revs, 0, 2);
		
		System.out.println("Revs " + revs.getPoints());
		System.out.println("Red Bulls " + nyrb.getPoints());
		System.out.println("Fire " + fire.getPoints());
		System.out.println("Sounders " + sounders.getPoints());
		
		System.out.println("Total games played " + getGamesPlayed());
		System.out.println("Total goals scored " + getGoalsScored());

	}

}
