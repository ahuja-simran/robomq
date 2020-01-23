import java.util.HashSet;
import java.util.Set;

public class ElectionHashSet {
		public static void main(String[] args)
		{
			HashSet<Elections>parties = new HashSet<Elections>();
			
			parties.add(new Elections(1, "BJP", "1-1-2019","kota","Contituency1","10-1-2019"));
			parties.add(new Elections(2, "Congress", "1-1-2019","jaipur","Contituency2","10-2-2019"));
			parties.add(new Elections(3, "Aam Admi", "1-3-2019","bhilwara","Contituency2","10-3-2019"));
			parties.add(new Elections(3, "p4", "1-3-2019","banswara","Contituency2","10-3-2019"));			
		
		//System.out.println(parties);
			//Set<String>set = new HashSet<String>();
			for (Elections s:parties) {
				if(s.getElectiondate().equals(getElectiondate()))
				System.out.println(s);
		}
}

		private static Object getElectiondate() {
			// TODO Auto-generated method stub
			return null;
		}
}