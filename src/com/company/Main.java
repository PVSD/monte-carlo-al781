package com.company;

public class Main
    {
        public static void main(String[] args)
            {
	            MonteCarlo mcObj = new MonteCarlo(5,3,2);
	            int cirCount = 0;
	            int sqrCount = 0;
	            for(int i = 0; i < 100; i++)
                    {
                       cirCount++;
                        if(mcObj.insideCircle(mcObj.nextRainDrop_x(),mcObj.nextRainDrop_y()))
                           cirCount++;
                    }
                System.out.println(cirCount * ((2*mcObj.radius)*(2*mcObj.radius)) / (sqrCount * (mcObj.radius*mcObj.radius)));
            }
    }
