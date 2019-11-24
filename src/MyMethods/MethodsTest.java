package MyMethods;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MethodsTest {

    MethodsCode c1 = new MethodsCode();

    @Test
    public void getTotal1() {

        String myNum = "5421312341";


        int myTotal = c1.getTotal(myNum);

        int expected = 10;


        Assert.assertTrue(myTotal == expected);


    }

    @Test
    public void getTotal2() {

        String myNum = "5654656213";


        int myTotal = c1.getTotal(myNum);

        int expected = 29;


        Assert.assertTrue(myTotal == expected);


    }

    @Test
    public void getTotal3() {

        String myNum = "00000000000";

        int myTotal = c1.getTotal(myNum);

        int expected = -1;


        Assert.assertTrue(myTotal == expected);

    }


    @Test
    public void BankStatement_Calculator1() {

        ArrayList<String> myStatement = new ArrayList<>();

        myStatement.add("$23.21");
        myStatement.add("$18.10");
        myStatement.add("$22.18");
        myStatement.add("$100.90");
        myStatement.add("$23.10");


        double statmentTotal = c1.BankStatement_Calculator(myStatement);


        Assert.assertTrue(statmentTotal == 187.49);

    }

    @Test
    public void BankStatement_Calculator2() {

        ArrayList<String> myStatement = new ArrayList<>();

        myStatement.add("$14.21");
        myStatement.add("$200.60");
        myStatement.add("$1,000.28");
        myStatement.add("$2,000.50");
        myStatement.add("$23.10");


        double statmentTotal = c1.BankStatement_Calculator(myStatement);


        Assert.assertTrue(statmentTotal == 3238.69);

    }

    @Test
    public void BankStatement_Calculator3() {

        ArrayList<String> myStatement = new ArrayList<>();

        myStatement.add("$0");
        myStatement.add("$0");
        myStatement.add("$0");
        myStatement.add("$0");
        myStatement.add("$0");


        double statmentTotal = c1.BankStatement_Calculator(myStatement);


        Assert.assertTrue(statmentTotal == -1.0);

    }


    @Test
    public void getPopulation1() {

        ArrayList<String> CountryNames = new ArrayList<>();

        CountryNames.add("USA");
        CountryNames.add("Mexico");
        CountryNames.add("South Korea");
        CountryNames.add("Brazil");


        ArrayList<String> Population = new ArrayList<>();

        Population.add("300000000");
        Population.add("60000000");
        Population.add("5200000");
        Population.add("12000000");

        int randomNum = c1.RandomGenerator(CountryNames.size());

        String CountYname = CountryNames.get(randomNum);

        String populationREturn = c1.getPopulation(CountryNames, Population, CountYname);

        String population = Population.get(randomNum);

        Assert.assertTrue(population.equals(populationREturn));

    }

    @Test
    public void getPopulation2() {

        ArrayList<String> CountryNames = new ArrayList<>();

        CountryNames.add("Turkey");
        CountryNames.add("Greece");
        CountryNames.add("Romania");
        CountryNames.add("Germany");

        CountryNames.add("France");
        CountryNames.add("Russia");
        CountryNames.add("Argentina");
        CountryNames.add("South Korea");
        CountryNames.add("North Korea");
        CountryNames.add("China");
        CountryNames.add("India");
        CountryNames.add("Kazakhistan");
        CountryNames.add("Algeria");
        CountryNames.add("Belgium");
        CountryNames.add("Litvania");
        CountryNames.add("Somewhere");

        ArrayList<String> Population = new ArrayList<>();

        Population.add("80000000");
        Population.add("63200000");
        Population.add("965555520");
        Population.add("1000000");
        Population.add("14000000");
        Population.add("66200000");
        Population.add("999555520");
        Population.add("6700000");
        Population.add("123000000");
        Population.add("5432200000");
        Population.add("125555520");
        Population.add("6300000");
        Population.add("99000000");
        Population.add("69200000");
        Population.add("7655555520");
        Population.add("32100000");

        int randomNum = c1.RandomGenerator(CountryNames.size());

        String CountYname = CountryNames.get(randomNum);

        String populationREturn = c1.getPopulation(CountryNames, Population, CountYname);

        String population = Population.get(randomNum);

        Assert.assertTrue(population.equals(populationREturn));

    }


    @Test
    public void RandomGenerator(){


        for(int i = 0 ;i < 20 ; i++){

           int rnd =  c1.RandomGenerator(3);
            if(rnd==0){

                Assert.assertTrue(false);

            }else{
                Assert.assertTrue(true);

            }
        }

    }
    @Test
    public void getPopulation3() {

        ArrayList<String> CountryNames = new ArrayList<>();

        CountryNames.add("Sourh Africa");
        CountryNames.add("Mali");
        CountryNames.add("Morocco");
        CountryNames.add("Algeria");


        ArrayList<String> Population = new ArrayList<>();

        Population.add("20000000");
        Population.add("90000000");
        Population.add("2300000");
        Population.add("12000000");

        int randomNum = c1.RandomGenerator(CountryNames.size());

        String CountYname = "Somewhere";

        String populationREturn = c1.getPopulation(CountryNames, Population, CountYname);

        System.out.println(populationREturn);


        Assert.assertTrue(populationREturn.equals("-1"));

    }


//        if the total number = bigger then 18 return should be -->  "You have a chance"
//
//            if the total number = bigger or equal to 10 return should be --> "You are chicken"
//
//            if the total number = less then 10 return should be --> "You are deep loser"
    @Test
    public void BJ21_1() {

        String s1 = c1.BJ21();

        if(s1.contains("You are a loser")){
            Assert.assertTrue(true);

        }else if(s1.contains("You have a chance")){

            Assert.assertTrue(true);
        }else if(s1.contains("You are chicken")){
            Assert.assertTrue(true);

        }else if(s1.contains("You are deep loser")){

            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }

    }
}