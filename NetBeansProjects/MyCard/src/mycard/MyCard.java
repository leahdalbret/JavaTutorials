package mycard;

class ReturnTest 
{  
    public static final  
        void main( String[] argv ) 
        { 
            int result;   // (1)
     result = yearsToDays( 29 );  // (2)    
     System.out.println( "29 years is " + result + " days." );
     result = yearsToDays( 100 ); // (3)    
     System.out.println( "100 years is " + result + " days." );
     int young_person = 6;    
     result = yearsToDays( young_person );  // (4)    
     System.out.println( young_person + " years is " + result + " days." );
     int decade = 10;     result = yearsToDays( decade );        // (5)    
     System.out.println( decade + " years is " + result + " days." );
     System.out.println( decade + " years is "+ yearsToDays( decade )  + " days." );  // (6)
   }// end main
   static  int yearsToDays( int years )  {    int num_days;               
   num_days = years * 365;     return num_days; 
   }// end method
 }// end class
 