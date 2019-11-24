package MyMethods;

import java.util.ArrayList;
import java.util.Random;

public class MethodsCode {

    /*
            Create a method: method name is getTotal  <<<-------   get the name from here
                    it has one parameter and parameter is string(myNumbers)
             and return type is int

             myNumbers has = "854364363564"
                 Get the digits one by one if the number is even multiply by 2 and if the number is odd miltiply by -1 then sum all the numbers
               for example first number is 8 --> 8*2 = 16
               second numeber is 5  5*-1 = -5
               16 + (-5) = 11
               result is 11
               if result equal to 0 then return the -1

        */
    public int getTotal(String myNumbers){

        char[] myChar = myNumbers.toCharArray();

        int total = 0 ;
        for(int  i= 0 ; i<myChar.length ; i++){


            if(myChar[i]%2==0){

                String str = String.valueOf(myChar[i]);

                int myeven = Integer.parseInt(str);

                myeven = myeven*2;

                total = total + myeven;

            }else if(myChar[i]%2==1){

                String str = String.valueOf(myChar[i]);

                int myodd = Integer.parseInt(str);

                myodd = myodd*-1;

                total = total + myodd;

            }


        }


        if(total == 0 ){

            total = -1 ;
        }

        System.out.println(total);

        return total;
    }

/*
        Create a method name is:  BankStatement_Calculator <<<<-----  copy the name from here

            Parameter is String  arrayList(MyStatment)
                return type is double

        in my statement is like $15.23
                                $10,23
                                $21,87
                                $0,20
                                $1,020.23

                                remove the unneccessary icons and calculate the total

                                if result is equal to 0 then return -1

 */
public double BankStatement_Calculator(ArrayList<String> MyStatement){

    double total = 0 ;

    for(int i = 0 ; i<MyStatement.size(); i++){

        String myNum =MyStatement.get(i);

       myNum = myNum.replace("$" , "");
       myNum= myNum.replace("," , "");

        double num1 = Double.parseDouble(myNum);

        total = total +num1;


    }

    if (total == 0 ){

       total=-1;

    }

    return total;

}

/*
    Create a method which is generating the random number name is : RandomGenerator  <<--- take the name here

    parameter int (int max)
    return int

    return number should be between 1 and max

    if max is equal to 1 then return the 1
 */

    public int RandomGenerator(int i1){

        Random rnd = new Random();

        int rndNum = rnd.nextInt(i1-1)+1;

        return rndNum;
    }

    /*

    Create a method which is getPopulation <<--- take name from here

        Parameter 2 string arrayList and string

        one arrayList has the country name
        second arraylist has the population of the country

        String has one country name

        return String

        for exxample:
                arrayList one =>   USA , Mexico , Canada , Brazil
                arraylist second => 350000000  , 100000000 , 50000000 , 120000000
                and the string is USA

                return the 350000000

            if String country name is not in the arrayList one then return -1


        note:
        this method will not work if you don't finish the randomNumber method

     */

public String getPopulation(ArrayList<String> CountryName ,ArrayList<String> Population,String county  ){

    String result = "";

    for(int i =0 ; i< CountryName.size() ; i++){

        String myCoun = CountryName.get(i);

        if(myCoun.equals(county)){

            result = Population.get(i);

        }

    }


    if(result.equals("")){

        result ="-1";
    }

return result;
}

/*

Create a method name is : BJ21

        no parmeter
        Return Type String

        Create 1 int in the method then call the RandomGenerator

        max number for the random generator is 11

        call the randomGenerator 3 times and get the total of the 3 times calls  --> first call 4, second call 7, third call 10 -->> 21
                        hint: you should use a for loop


        if the total number = bigger then 21 return should be --> "You are a loser"

        if the total number = bigger then 18 return should be -->  "You have a chance"

        if the total number = bigger or equal to 10 return should be --> "You are chicken"

        if the total number = less then 10 return should be --> "You are deep loser"

note:
        this method will not work if you don't finish the randomNumber method

 */

public String BJ21(){

    int total = 0;

    String Result = "";
    for(int i=0 ; i< 3 ; i++){

        int randomNum = RandomGenerator(11);

        total = total +randomNum;

    }

    if(total>21){

        Result = "You are a loser";

    }else if(total>18){

        Result = "You have a chance";
    }else if(total>=10){

        Result = "You are chicken";
    }else if(total<10){

        Result = "You are deep loser";
    }

    return Result;
}


}
