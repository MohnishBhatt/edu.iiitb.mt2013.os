package org.iiitb.implementation;

import java.awt.Color;
import java.io.PrintWriter;

/**
 * View Constants
 * 
 * @author arjun
 * 
 */
public class ConstantsManual {

	// Segment View Constants start here

	public static final String SEGMENT_NAME[] = { "CONSTANT", "GLOBAL", "CODE",
			"HEAP", "STACK" };
	public static int defragmentationFlag = 0;
	
	public static int ProcessSizeConstant = 0;
	
	public static PrintWriter writer = null;
	
	public static int SEGCOLORS[][] = {{218,19,55}, {18,47,69}, {6,156,136}, {0,170,51}, {210,143,53}};
	
	public static int ColorCounter=0, CounterSize=5;
	
	public static String faq = "Que.  What is a Segment? \nAns.  Segment is basically a chunk a code combined into a unit by the Compiler."
		+"\n\nQue.  How and when are Segments made?"
		+"\nAns.  Segments are made by Compiler if the Operating System follows Memory Segmentation technique as part of Memory           Management scheme."
		+"\n          A program is a collection of segments. A segment is a logical unit such as:"
		+"\n          Main program"
		+"\n          Procedure"
		+"\n          Function"
		+"\n          Method"   
		+"\n          Object "      
		+"\n          Local variables"
		+"\n          Global variables"
		+"\n          Constants"
		+"\n          Common block"
		+"\n          Stack"
		+"\n          Heap  "     
		+"\n          Symbol table"
		+"\n          Arrays"
		+"\n          i.e. Anything, any piece of code that the Compiler wishes to make. This is totally on the Compiler, different Compiler makes different kinds of Segments."

+"\n\nQue.  How we have implemented it?"
+"\nAns.  The classification/construction is totally dependent on Compiler. For simulation of Memory Segmentatdion, it was difficult for us to make the Compiler and then make segments. So, we have made 5 segments for each and every process namely : Constants, Globals, Code, Heap, Stack and we have done some static calculations for making segments which are as follows:"
+"\nConstants : Process Size / 10"
+"\nGlobals : (Process Size - Constants)/8"
+"\nCode: (Process Size - Constants - Globals)/6"
+"\nHeap: (Process Size - Constants - Globals - Code)/3"
+"\nStack: Process Size - Constants - Globals - Code - Heap"

+"\n\nQue. Have done anything to serve the drawback of Memory Segmentation? Have we actually managed Memory efficiently?"
+"\nAns. Yes. We have worked over the drawback of External Fragmentation by Compaction/Defragmentation."

+"\n\nQue. Curious to know how you have implemented it. How you've achieved Compaction?"
+"\nAns. First we checked if the available memory is less than or equal to the process size. If yes, one thing was sure that we can accomodate all the segments of the process. Now, whenever a segment could not be allocated in any of the block in the freelist (a jargon related to this simulation which means, a list all available free holes in memory) we decided to go for Defragmentation/Compaction. What we did to accomodate a segment we would merge two freeblocks and check again if the segment in be allocated in the newly made freeblock and continued doing the same until we found a freeblock of the size greater than or equal to the segment."

+"\n\nQue. I have further queries w.r.t this project, where I can clear all of them?"
+"\nAns. Without a second thought contact us right away on: \nankit.gumber@iiitb.org \nkomal.gupta@iiitb.org \nbhuvanesh.srivastava@iiitb.org";


	// Segment View Constants end here
}
