package logicalprograms;

public class StopWatch {
		public static void main(String[] args){
			long startTime=System.currentTimeMillis();
			System.out.println("starttime:"+startTime);
			printHelloWorld();
			long endTime=System.currentTimeMillis();
			System.out.println("endTime is"+endTime);
			printElapsedTime(startTime,endTime);
		}
		private static void printElapsedTime(long startTime,long endTime)
		{
			long elapsedTime=endTime-startTime;
			System.out.println("Elapsed time:"+elapsedTime);;
		}
		public static void printHelloWorld()
		{
			for(int i=0;i<100;i++)
			{
				System.out.println("HelloWorld");
			}
		}
}
