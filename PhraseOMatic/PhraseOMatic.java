//random phrase generator

public class PhraseOMatic{
    public static void main(String[] args){
	//make three sets of words

	String wordListOne[] = {"amazink", "win-win", "smart", "dynamic"};
	String wordListTwo[] = {"outside-the-box", "sticky", "web-based"};
	String wordListThree[] = {"process", "mission", "solution", "portal", "strategy"};

	//finding out the number of words in each list

	int list1 = wordListOne.length;
	int list2 = wordListTwo.length;
	int list3 = wordListThree.length;

	//generating random numbers
	int rand1 = (int) (Math.random()*list1);
	int rand2 = (int) (Math.random()*list2);
	int rand3 = (int) (Math.random()*list3); //writing (int) typecastes it

	// Math.random() generates a double between
	//building a phrase
	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

	//printing the phrase
	System.out.println(phrase);



	
    }//main block
}//class block
