package com.company;

import java.util.Random;

public class MonteCarlo
    {
        public double xPosition;
        public double yPosition;
        public double radius;
        private Random rndm = new Random();
        public MonteCarlo(double h, double k, double r)
            {
                xPosition = h;
                yPosition = k;
                radius = r;
            }
        public double nextRainDrop_x()
            {
                return ((rndm.nextDouble()*(2*radius))+xPosition);
            }
        public double nextRainDrop_y()
        {
            return ((rndm.nextDouble()*(2*radius))+yPosition);
        }
        public boolean insideCircle(double x, double y )
            {
                if (((x - xPosition) * (x - xPosition)) + ((y - yPosition) * (y - yPosition)) <= radius*radius)
                    {
                        return true;
                    }
                else
                    {
                        return false;
                    }
            }
    }
