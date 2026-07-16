class logicaloperator
{
    public static void main(String args[]){
        int a=10;
        int b=7;
        int y= 15;
        int z=25;
       // boolean result =a<b && y>z;  // F T = F
       //boolean result = a>b && y<=z;   // T T = T
       boolean result = a<=b || y<=z;      // F T =T
       System.out.println(result);
    }
}
