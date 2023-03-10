public class Starpattern{
    public static void main(String args[]){

        /* pattern - 1


         *****
         *****
         ***** 
         *****
         *****


        */
        
        
         int irange = 5;
         int jrange = 5;

         for(int i = 0; i<irange; i++)
         {
            for(int j = 0; j<jrange; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
         }
        

         ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

               

        /* pattern - 2


          ***** 
          **** 
          *** 
          ** 
          *


        */
        
        for(int i = 0; i<5; i++)
          {
            for(int j = 0; j<5; j++)
            {
                if(j+i<=4)
                {
                    System.out.print("*");
                }else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
          }
        

          --------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        /* pattern - 3
          
          
          *
          **
          ***
          ****
          *****


        */
        

        for (int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(j-i<=0)
                {
                    System.out.print("*");
                }else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        /*  pattern - 4


        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *


         */
         
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(j-i<=0 && j+i<=8)
                {
                    System.out.print("*");
                }else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 5
          
        
        *****
        ****
        ***
        **
        *
        **
        ***
        ****
        *****


         */
          
         for(int i = 0; i<9; i++)
         {
             for(int j = 0; j<5; j++)
             {
                 if(j+i<=4 || j-i<=-4)
                 {
                     System.out.print("*");
                 }else 
                 {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
        

         --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 6
         

            *
           **
          ***
         ****
        *****


        */
        
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(j+i>=4)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        /* pattern - 7
         

        *****
         ****
          ***
           **
            *


         */
         
         for(int i = 0; i<5; i++)
         {
             for(int j = 0; j<5; j++)
             {
                 if(j-i>=0)
                 {
                     System.out.print("*");
                 }else
                 {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
         

         ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


         /* pattern - 8
          

            *
           **
          ***
         ****
        *****
         ****
          ***
           **
            *
        
         
        */
         
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(j+i>=4 && j-i>=-4)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        /* pattern - 9


            *                                                            *
           * *                                 use this pattern---->    **    condition and print space
          * * *                                                        ***
         * * * *                                                      ****   
        * * * * *                                                    *****


        */
         
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(j+i>=4)
                {
                    System.out.print("*" + " ");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 10


            *
           ***
          *****
         *******
        *********


        */
        
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if(j+i>=4 && j-i<=4)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    

        ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 11


        * * * * *                                                         *****
         * * * *                               use this pattern------>     ****  condition and print space
          * * *                                                             ***
           * *                                                               **
            *                                                                 *


         */
         
         for(int i = 0; i<5; i++)
         {
             for(int j = 0; j<5; j++)
             {
                 if(j-i>=0)
                 {
                     System.out.print("*" + " ");
                 }else
                 {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
        

         -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 12


        *********
         *******
          *****
           ***
            *


         */
         
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if(j-i>=0 && j+i<=8)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 14

        
        *****
         ****
          ***
           **
            *
           **
          ***
         ****
        *****


         */
        
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(j-i>=0 || j+i>=8)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 15


        *****
         ****
          ***
           **
            *
            **
            ***
            ****
            *****


         */ 
        
        
        for(int i = 0; i<9; i++)
         {
             for(int j = 0; j<9; j++)
             {
                if((j-i>=0 && j<=4) || (j-i<=0 && j>=4))
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
             }
             System.out.println();
         }
         

         -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 16
          

        *********
         *******
          *****
           ***
            *
           ***
          *****
         *******
        *********    


        */
          
        for(int i = 0; i<9; i++)
         {
             for(int j = 0; j<9; j++)
             {
                if((j+i>=8 && j-i<=0) || (j+i<=8 && j-i>=0))
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
             }
             System.out.println();
         }


         -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 17


        * * * * *                                                    *****
         * * * *                              use this pattern ---->  ****   condition and print space
          * * *                                                        ***  
           * *                                                          **
            *                                                            * 
           * *                                                          ** 
          * * *                                                        ***
         * * * *                                                      **** 
        * * * * *                                                    *****

    
        */
        
        for(int i = 0; i<9; i++)
         {
             for(int j = 0; j<5; j++)
             {
                if((j-i>=0 || j+i>=8))
                {
                    System.out.print("*" + " ");
                }else
                {
                    System.out.print(" ");
                }
             }
             System.out.println();
         }
        

         -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 18


            *                                                           *
           * *                                                         **
          * * *                             use this pattern -        ***    condition and print space
         * * * *                                                     ****
        * * * * *                                                   *****
         * * * *                                                     ****  
          * * *                                                       ***
           * *                                                         ** 
            *                                                           * 

        
        */
        
        for(int i = 0; i<9; i++)
         {
             for(int j = 0; j<5; j++)
             {
                if(j-i>=-4 && j+i>=4)
                {
                    System.out.print("*" + " ");
                }else
                {
                    System.out.print(" ");
                }
             }
             System.out.println();
         }
         

         -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


         /* pattern - 19
          

            *
           ***
          *****
         *******
        ********* 
         *******
          *****
           ***                    rechek this problem
            *


         */
         
         for(int i = 0; i<9; i++)
         {
             for(int j = 0; j<9; j++)
             {
                if(j-i>=-4 && j+i<=12 && j+i>=4 && j-i<=4)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
             }
             System.out.println();
         }
        
         
         -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 20

        
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        
        
         */
        
         for(int i = 0; i<9; i++)
         {
             for(int j = 0; j<9; j++)
             {
                if(j-i<=-4 || j+i<=4 || j+i>=12 || j-i>=4)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
             }
             System.out.println();
         }
    

         -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 21


            *****
           *****
          *****
         *****
        *****


         */
        
         for(int i = 0; i<5; i++)
         {
             for(int j = 0; j<9; j++)
             {
                if(j+i>=4 && j+i<=8)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
             }
             System.out.println();
         }
         

         -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
         

         /* pattern - 22
          

        *****
         *****
          *****
           *****
            *****


        */
        
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if(j-i>=0 && j-i<=3)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 23
         

        *****
         *****
          *****
           *****
            *****
           *****
          *****
         *****
        *****
        
        */
          
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if((j-i>=0 && j-i<=4 && i<=4)|| (j+i>=8 && j+i<=12 && i>=4))
                {
                    System.out.print("*");
                }else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 24
         

             *****
            *****
           *****
          *****
         *****
          *****
           *****
            *****
             *****    

        */
         
          
         for(int i = 0; i<9; i++)
         {
             for(int j = 0; j<9; j++)
             {
                 if((j+i>=4 && j+i<=8 && i<=4) || (j-i>=-4 && j-i<=0 && i>=4))
                 {
                     System.out.print("*");
                 }else 
                 {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
         

         -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 25 
         
      
        *    **********    *
        **   ****  ****   **
        ***  ***    ***  ***
        **** **      ** ****
        ******        ******


        */
          
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<20; j++)
            {
                if(j-i<=0 || j+i<=9 && j>=5 || j-i>=10 && j>=10 && j<=14 || j+i>=19 && j>=15)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 27


        *        *
        **      **
        ***    ***
        ****  ****
        **********
        ****  ****
        ***    ***
        **      **
        *        *


        */
        
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<10; j++)
            {
                if(j-i<=0 && j+i<=8 || j+i>=9 && j-i>=1)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 28 

        *        *
        **      **
        ***    ***
        ****  ****
        **********

        */
         
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<10; j++)
            {
                if(j-i<=0 || j+i>=9 && j>=5)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        /* pattern - 29
         
        *****
        *  *
        * *
        **
        *

        */
         
        
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(i==0 || j==0 || j+i==4)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 30

        *****
         *  *
          * *
           **
            *  

         */
          
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(i==0 || j-i==0 || j==4)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        /* pattern - 31
         
            *
           * *
          *   *
         *     *
        *********

        */
        
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if(j+i==4 || j-i==4 || i==4)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 32
         
        *********
         *     *
          *   *
           * *
            *

        */
        
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if(i==0 || j-i==0 || j+i==8)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 33


             *
            * *
           *   *
          *     *
         *       *
          *     *
           *   *
            * *
             *  
    

        */
         
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if(j+i==4 || j-i==4 || j-i==-4 || j+i==12)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 34
         
        *
        ** 
        * *
        *  *
        *   *
        *  *
        * *
        **
        * 

        */
         
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(j==0 || j-i==0 || j+i==8)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        /* pattern - 35

            *
           ** 
          * * 
         *  * 
        *   * 
         *  * 
          * * 
           ** 
            * 
        

        */
          
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(j==4 || j+i==4 || j-i==-4)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /*  pattern - 36

             *****
            *   *
           *   *
          *   *
         *****   

        */
         
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if(j+i==4 || i==0 && j>=4 || i==4 && j<=4 || j+i==8)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 37

        *****
         *   *
          *   *
           *   *
            *****

        */
         
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if(i==0 && j<=4 || j-i==0 || j-i==4 || i==4 && j>4)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 38
         
        *****
         * *
          *
         * *
        ***** 

        */
        
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(i==0 || j-i==0 || j+i==4 || i==4)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 39

         ** **
        *  *  *
         *   *
          * *
           *

        */
          
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<7; j++)
            {
                if(i==0 && j>0 && j<3 || j-i==2 && j>=2 && i<=1 || j+i==4 && i<=1 || i==0 && j>=4 && j<6 || j+i==7 || j-i==-1 && i>=1)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /* pattern - 40

           ***     ***
          *****   *****
         ******* *******
        *****************
        *****************
         ***************
          *************
           ***********
            *********
             *******
              *****
               ***
                *


        */ 
        

        for(int i = 0; i<13; i++)
        {
            for(int j = 0; j<17; j++)
            {
                if(j+i>=3 && j<4 && i<4 || j==4 && i<4 || j-i<=5 && j>=5 && j<=8 && i<4 || j+i>=11 && j<=11 && i<4 || j==12 && i<4 || j==12 && i<4 || j-i<=13 && j>=13 && i<4 || j-i>=-4 &&  j<=8 && i>=4 || j+i<=20 && j>=8 && i>=4)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    

        -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        

        /* pattern - name PRAMOD 
        

          ***    ***    *** *     * *** ****
        *     **    * *    ***   ***   **   *
        *     **    * *    ** * * **   **   *
        * ***  * ***  *******  *  **   **   *
        *      *    * *    **     **   **   *
        *      *    * *    **     **   **   *
        *      *    * *    **     * *** ****
        
        */
        
        for(int i = 0; i<7; i++)
        {
            for(int j = 0; j<32; j++)
            { 
                if(i==0 && j>0 && j<4 || j==0 && i>0 || j==4 && i>0 && i<3 || i==3 && j<4 || j==5 && i>0|| i==0 && j>5 && j<9 || j==9 && i>0 && i<3 || i==0 && j>5 && j<9 || j==9 && i>0 && i<3 || i==3 && j<9 || j==9 && i>3 || j==10 && i>0 || i==0 && j>10 && j<14 || j==14 && i>0 || i==3 && j<14 || j==15 || j-i==15 && i<=3 || j+i==21 && i<3 || j==21 || j==22 && i>0 && i<6 || i==0 && j>22 && j<26 || i==6 && j>22 && j<26 || j==26 && i>0 && i<6 || j==27 || i==0 && j>=27  && j<31 || j==31 && i>0 && i<6 || i==6 && j>27 && j<31)
                {
                    System.out.print("*");
                }else 
                {
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }
        
    }
}
                                                                    