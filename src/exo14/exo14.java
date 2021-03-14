package exo14;

	import java.util.List;
	import java.util.Map;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	
		public class exo14 {

			public static void main(String[] args) {

				List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven","eight", "nine", "ten", "eleven", "twelve");
				
				//La 1ere question:
				    Stream<String> elements =strings.stream(); 
				    System.out.println("\n l'affichage des �l�ments de ce stream:\n");
				    elements.forEach(System.out::println);
				
				//La 2eme question
				    Stream<String> majuscule = strings.stream().map(word -> word.toUpperCase());
					System.out.println("\n l'affichage des �l�ments de ce stream mis en majuscule\n");
					majuscule.forEach(System.out::println);
					
				//La 3eme question
					Stream<Character> premierelettre = strings.stream().map(word -> word.toUpperCase().charAt(0)).distinct();
					System.out.println("\n L'affichage des premi�res lettres des �l�ments de ce stream, mises en majuscules, sans doublon\n");
					premierelettre.forEach(System.out::println);
					
			   //La 4eme question	
					Stream<Integer> longueur = strings.stream().map(word -> word.length()).distinct();
					System.out.println("\n L'affichage des longueurs des �l�ments de ce stream, sans doublon\n");
					longueur.forEach(System.out::println);
					 		
			  //La 5eme question	
					long nmbrelement = strings.stream().count();
					System.out.println("\n afficher le nombre d��l�ments de ce stream \n"+ nmbrelement);
					
			 //La 6eme question	
					long nmbrelementpair = strings.stream().filter(word -> word.length()% 2 == 0).count();
					System.out.println("\n afficherle nombre d��l�ments de ce stream qui ont une longueur paire \n "+ nmbrelementpair);
					
			//La 7eme question	
		            long  longueurlong = strings.stream().map(word -> word.length()).max(Integer::compare).get();
					System.out.println( "\n afficher la longueur de la cha�ne la plus longue\n "+longueurlong);
				
			//La 8eme question	
					List<String> majusculeimpaire =
					strings.stream().map(word -> word.toUpperCase()).filter(word -> word.length()% 2 != 0).collect(Collectors.toList());
					System.out.println( "\n la liste qui comporte que les cha�nes de longueur impaire, mises en majuscules \n ");
					majusculeimpaire.forEach(System.out::println);
					
		    //La 9 eme question
					String concatenation =strings.stream() .filter(word -> word.length()<= 5).sorted().collect(Collectors.joining(" , ", "{", "}")); 
					System.out.println("\nla concat�nation des cha�nes\n" + concatenation);
				
			//La 10 eme question
					Map<Integer, List<String>> maplongueur = strings.stream() .collect(Collectors.groupingBy(String::length));
					System.out.println("\n cr�er une table de hachage dont les cl�s sont les longueurs des cha�nes et les valeurs les listes de ces cha�nes\n ");
					maplongueur.forEach((key, value) -> System.out.println(key + " = " + value));
					
		   //La 11eme question
					Map<Character, String> maplettre = strings.stream().collect( Collectors.groupingBy( word -> word.charAt(0),Collectors.joining(", ") )) ;
				    System.out.println("\n une table de hachage dont les cl�s sont les premi�res lettres de ces cha�nes et les valeurs la concat�nation de ces cha�nes s�par�es par des virgules ");
					
					maplettre.forEach((key, value) -> System.out.println(key + " est associ�e � la cha�ne " + value));
					
					 
					 
	}

}
