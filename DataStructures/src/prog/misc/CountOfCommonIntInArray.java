package prog.misc;

public class CountOfCommonIntInArray {
		public static int mode(final int[] n) {
		    int maxKey = 0;
		    int maxCounts = 0;

		    int[] counts = new int[n.length];

		    for (int i=0; i < n.length; i++) {
		        counts[n[i]]++;
		        if (maxCounts < counts[n[i]]) {
		            maxCounts = counts[n[i]];
		            maxKey = n[i];
		        }
		    }
		    return maxKey;
		}

		public static void main(String[] args) {
		    int[] n = new int[] { 3,7,4,1,3,8,9,3,7,1 };
		    System.out.println(mode(n));
		}

}
