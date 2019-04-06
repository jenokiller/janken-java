package com.janken.janken;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class JankenApplicationTests {

	private Janken janken;
	String ROCK = "rock";
	String SCISSORS = "scissors";
	String PAPER = "paper";

	@Before
	public void setUp() {
		janken = new Janken();
	}

	@Test
	public void P1がグーP2がチョキの時P1が勝つこと() {
		assertThat(janken.play(ROCK, SCISSORS), equalTo("p1"));
	}

	@Test
	public void P1がグーP2がグーの時引き分けになること() {
		assertThat(janken.play(ROCK, ROCK), equalTo("draw"));
	}

	@Test
	public void P1がグーP2がパーの時P2が勝つこと() {
		assertThat(janken.play(ROCK, PAPER), equalTo("p2"));
	}

	@Test
	public void P1がチョキP2がグーの時P2が勝つこと() {
		assertThat(janken.play(SCISSORS, ROCK), equalTo("p2"));
	}

	@Test
	public void P1がパーP2がチョキの時P2が勝つこと() {
		assertThat(janken.play(PAPER, SCISSORS), equalTo("p2"));
	}
}
