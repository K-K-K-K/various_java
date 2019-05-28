import java.util.Scanner;

class EuclideanAlgorithm {
	static Scanner sc = new Scanner(System.in);

	static int[] getTwoNums(Scanner sc) {

		int[] nums = new int[2];
		System.out.print("type two numbers with space : ");
		nums[0] = sc.nextInt();
		nums[1] = sc.nextInt();

		if(nums[0] < nums[1]) {
			nums[0] ^= nums[1];
			nums[1] ^= nums[0];
			nums[0] ^= nums[1];
		}

		return nums;
	}

	static int euclideanAlgorithm(int[] nums) {

		while(true) {
			int r = nums[0] % nums[1];

			if(r == 0) {
				return Math.abs(nums[1]);
			}

			nums[0] = nums[1];
			nums[1] = r;
		}
	}

	static void commandProcessing(Scanner sc) {

		while(true) {

			System.out.print("command : ");
			String command = sc.next();

			if(command.equalsIgnoreCase("quit")) {
				System.exit(0);
			} else if(command.equalsIgnoreCase("calc")) {
				System.out.println(euclideanAlgorithm(getTwoNums(sc)));
			} else if(command.equalsIgnoreCase("manual")) {
				System.out.println("command\n\tcalc : calcuration GCD of two numbers.\n\tmanual : display command list\n\tquit : finish the process");
			} else {
				System.out.println("The command doesn't exist.");
			}
		}
	}

	public static void main(String args[]) {
		commandProcessing(sc);
	}
}
