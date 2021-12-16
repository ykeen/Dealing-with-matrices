/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_task1;

/**
 *
 * @author Moaaz
 */
public class Matrices {
    public String printAdjMatrix(boolean[][] arr){
        String res ="";
        for(int i=0 ; i <arr.length ;i++)
	   {
		   res += "  "+ i + "   ";
           }
	   res += "\n";
	    for (int i = 0; i <arr.length; i++){
	    	res += i + "";
	        for (int j = 0; j < arr.length; j++){
                    // values that have been marked as set.
	            if (arr[i][j])
                    {
	            	res += "    " + "1";
	            }    
	            else 
	            {
	            	res += "    " + "0";
	            }
	        }
	        res += "\n";
	    }
            return res;
            
    }
    
    public String printAdjList(boolean[][] arr) 
   {
        String res = "";
        for (int i = 0; i <arr.length; i++) 
        {
            res += "Node " + i + " is connected to : ";

            for (int j = 0; j <arr.length; j++) 
            {
                if (arr[i][j]) 
                {
                    res += j + " ";
                }
            }
            res += "\n";
        }
        return res;
   }
    
}

