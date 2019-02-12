package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle {
	public _06_IPodShuffle() {
		
		Song song =  new Song("demo.mp3");
		// 1. Use the Song class the play the demo.mp3 file.
//		song.play();
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

	}
	
	void uI () {
		Song lucidDreams = new Song("LucidDreams.mp3");
		Song girlsLikeYou = new Song("GirlsLikeYou");
		Song sickoMode = new Song("sickoMode.mp3");
		Song moBamba = new Song("MoBamba.mp3");
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(lucidDreams);
		songs.add(girlsLikeYou);
		songs.add(sickoMode);
		songs.add(moBamba);
	}

	public static void main(String[] args) {
		_06_IPodShuffle is = new _06_IPodShuffle();
	}
}