package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMultipleAttributes {

	public static void main(String[] args) {
		List<Player> pl = new ArrayList<Player>();
		pl.add(new Player("amy", 100));
		pl.add(new Player("david", 100));
		pl.add(new Player("heraldo", 50));
		pl.add(new Player("aakansha", 75));
		pl.add(new Player("aleksa", 150));
		
		Collections.sort(pl, new PlayerChainedComparator(
			new PlayerScoreComparator(),
			new PlayerChainedComparator()
		));
		

        System.out.println("\n*** After sorting:");
 
        for (Player p : pl) {
            System.out.println(p);
        }
	}
	
	static class Player {
		
		public String nama;
		
		public Integer score;

		public String getNama() {
			return nama;
		}

		public void setNama(String nama) {
			this.nama = nama;
		}

		public Integer getScore() {
			return score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}

		public Player(String nama, Integer score) {
			this.nama = nama;
			this.score = score;
		}

		@Override
		public String toString() {
			return String.format("%s\t%d", nama, score);
		}
	}
	
	static class PlayerScoreComparator implements Comparator<Player> {

		@Override
		public int compare(Player o1, Player o2) {
			return o2.getScore() - o1.getScore();
		}
	}
	
	static class PlayerNameComparator implements Comparator<Player> {

		@Override
		public int compare(Player p1, Player p2) {
			return p1.getNama().compareTo(p2.getNama());
		}
	}
	
	static class PlayerChainedComparator implements Comparator<Player> {
		 
	    private List<Comparator<Player>> listComparators;
	 
	    @SafeVarargs
	    public PlayerChainedComparator(Comparator<Player>... comparators) {
	        this.listComparators = Arrays.asList(comparators);
	    }
	 
	    @Override
	    public int compare(Player p1, Player p2) {
	        for (Comparator<Player> comparator : listComparators) {
	            int result = comparator.compare(p1, p2);
	            if (result != 0) {
	                return result;
	            }
	        }
	        return 0;
	    }
	}
}
