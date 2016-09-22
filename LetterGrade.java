public class LetterGrade {

	public static void main(String[] args) {
		System.out.println("Enter Student Score: ");
		double score = IO.readDouble();
		if (score < 0 || score > 100) {
			System.out.println("Score out of range [0-100]");
			return;
		}
		if (score >= 90 ) {
			System.out.println("Student Letter Grade: A");
		} else if (score >= 80) {
			System.out.println("Student Letter Grade: B+");
		} else if (score >= 70) {
			System.out.println("Student Letter Grade: B");
		}  else if (score >= 60) {
			System.out.println("Student Letter Grade: C+");
		}  else if (score >= 50) {
			System.out.println("Student Letter Grade: C");
		}  else if (score >= 40) {
			System.out.println("Student Letter Grade: F");
		}  else if (score <=39) {
			System.out.println("Student Letter Grade: F");
		}
		
	}

}
