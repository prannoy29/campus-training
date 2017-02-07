	//import java.io.InputStreamReader;
	//import java.net.URL;
	//import java.net.URLConnection;
	import java.net.*;
	import java.io.*;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.Scanner;

public class maxpathSum {//import java.io.BufferedReader;
	
			private static int[][] getInputArray (String urlname, int height)throws Exception{

			int[][] matrix = new int[height][];

			URL url = new URL(urlname);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

			String inputLine;
			int i = 0;
			while((inputLine = br.readLine())!= null) {

				matrix[i] = new int[i+1];
				int j = 0;

				Scanner tokens = new Scanner(inputLine);
				while(tokens.hasNext()) {
					int value = tokens.nextInt();
					matrix[i][j++] = value;
			}

			i++;
		}
		return matrix;
	}



		private static void finalAnswer (int[][] matrix){

			for(int i = matrix.length-1; i > 0; --i){
				for(int j = 0; j < matrix[i-1].length ; ++j){
					matrix[i-1][j] += Math.max(matrix[i][j],matrix[i][j+1]);
				}
			}

			System.out.println("Maximum path sum is " + matrix[0][0]);
		}

		public static void main(String[] args)throws Exception{
			String urlname = "https://projecteuler.net/project/resources/p067_triangle.txt";
			int height = 100;
			int matrix[][]= getInputArray(urlname,height);
			finalAnswer(matrix);
		}
	} 