package me.weinzierl.main;

public class Score {
	private int score;
	public Score () {
		score = 0;
	}
	public void add(int i) {
		score = score + i;
	}
	public void sub(int i) {
		score = score - i;
		if(score <0) {
			score = 0;
		}
	}
	public int sc() {
		return score;
	}
}
