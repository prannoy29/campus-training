import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class maxpathSum {

	private static int[][] getInputArray(URL urlname, int height){

		int[][] matrix = new int[height][];

		URL url = new URL(urlname);
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openstream()));

		String inputLine;
		int i = 0;
		while((inputLine = br.readline())!= null) {

			matrix[i] = new int[i+1];
			int j = 0;

			Scanner tokens = new Scanner(inputLine);
			while(tokens.hasNext()) {
				int value = tokens.nextInt();
				triangle[i][j++] = value;
		}

		i++;
		return matrix;

	}
}



	private static void finalAnswer (int[][] matrix){

		for(int i = matrix.length-1; i > 1; --i){
			for(int j = 0; j = matrix[i-1].length; ++j){
				matrix[j][i-1] = max(matrix[j][i],matrix[j+1][i]);
			}
		}

		System.out.println("Maximum path sum is" + matrix[0][0]);
	}

	public static void main(String[] args){
		URL urlname = "";
		int height = 100;
		getInputArray(urlname,height);
		finalAnswer(matrix);
	}
} 