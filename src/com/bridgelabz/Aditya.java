package com.bridgelabz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class Aditya {

    //    public static final int GLOBAL_VARIABLE = 250;
    int x = 250;
    static int a;//0
    static String b;//null
    int c;//0

    public static void main(String[] args) {
//        System.out.println(a);
//        System.out.println(b);
//        Aditya aditya = new Aditya();
//        System.out.println(aditya.c);
//        System.out.println(aditya.x);

        /*
        int ageBoy = 21;
        int ageGirl = 18;
        if (ageBoy >= 21 && ageGirl >= 18){
            System.out.println("right age for marriage");
        }else {
            System.out.println("not right age");
        }
         */
        /*
        boolean x = true;
        boolean y = false;
        if (x && x){
            System.out.println("condition is true");
        }else {
            System.out.println("condition is false");
        }
         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int i=1;
        while (i <= 10 ){
            System.out.println(num * i);
            i++;
        }
         */
        /*
        //5 table print
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
         */
        /*
       //1 to 10 table print
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
        for (int i = 1;i <= 10;i++){
            System.out.println("=============");
            for (int j = 1;j<=10;j++){
                System.out.println(i * j);
            }
        }
         */
        /*
        //if else if ladder
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("First number");
        } else if (i == 2) {
            System.out.println("Second Number");
        } else if (i == 3) {
            System.out.println("Third Number");
        } else {
            System.out.println("Not a number");
        }
         */
        /*
        //Switch Case Using number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int i = sc.nextInt();
        switch (i){
            case 1:
                System.out.println("First Number");
                break;
            case 2:
                System.out.println("Second Number");
                break;
            case 3:
                System.out.println("Third Number");
                break;
            default:
                System.out.println("Not Number");
        }

         */

        /*
        //Switch Case using String
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a alphabet");
//        String a = sc.next();
        String a = "Aditya";
        switch (a.toLowerCase()){
            case "aditya":
                System.out.println("My name is Aditya");
                break;
            case "suraj":
                System.out.println("Suraj");
                break;
            default:
                System.out.println("Not Name");
        }
         */
        /*
        //Prime number or not
        int i,m,flag=0;
        int num = 33;
        m = num/2;
        if (num == 0 || num == 1){
            System.out.println("not a prime no");
        }else {
            for (i = 2;i<=m;i++){
                if (num % i == 0){
                    System.out.println("not a prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println("this is a prime number");
            }
        }
         */
        /*
        //1 to 10 pring using break 5 apply iteration stop
        //1 to 10 print using continue apply skip code specific condition of code
        for (int i = 1; i <=10; i++){
        //for (int i = 1,j=1;i<=10 && j<=10 ;i++,j++){
            //System.out.println(j);
            if (i == 5){
                //break;//loop is a iteration stop(Break statement used to terminate the loop)
                continue;//it continuous the current flow of the program and skip remaning code at the specific condition
            }
            System.out.println(i);
        }
        }
         */
        //fibonacci Series
//        int i = 0, j = 1, k = 0, a;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = sc.nextInt();
//        System.out.print(i+" "+j);
//        for (a = 2; a < n; a++) {
//            k = i + j;
//            // System.out.print(" "+k);
//            i = j;
//            j = k;
//            System.out.print(" "+k);
        /*
        int a = 0, b = 1, c = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.print(a + " " + b);
        for (i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
         */
        /*
        //Swap Two Number Without use Third Variable
        int a = 10,b = 20;
        System.out.println("Swap a two Numbr");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
        */
        /*
        //Swap Two Number Using Third Variable
        int a = 10,b = 20,c;
        System.out.println("Swap two number");
        c = a;
        a = b;
        b = c;
        System.out.println("a="+a);
        System.out.println("b="+b);
         */
        /*
        //Sum of series number
        int a = 12345, sumOfNumber = 0;
        System.out.println("Addition of  Number");
        while (true) {
            sumOfNumber = sumOfNumber + a % 10;
            a = a / 10;
            //System.out.println(sumOfNumber);
            if (a < 10) {
                break;
            }
        }
        sumOfNumber = sumOfNumber + a;
        System.out.println(sumOfNumber);

         */
        /*
        //String method use
        String str = "00000hello";
        String str1 = " Aditya ";
        String str2 = new String("Aditya");
        String str3 = "A d i t y a";
        String str4 = "Aditya";
        String str5 = "Motewar";
        System.out.println(str.replaceAll("0",""));
        System.out.println(str.replaceAll("0"," "));
        System.out.println(str.replaceAll("0","a"));
        System.out.println(str.replaceAll("e","b"));
        System.out.println("=================");
        System.out.println(str1.toUpperCase());//Convert a String Lower to Upper
        System.out.println(str1.toLowerCase());//Convert a String Upper to Lower
        System.out.println(str1.trim());//Remove White Space
        System.out.println("====================");
        System.out.println(str1.equals(str2));//Compare to String
        System.out.println("====================");
        System.out.println(str3.replaceAll("\\s",""));
        System.out.println("====================");
        System.out.println(str4.concat(str5));
        */
        /*
        //Method OverLoading
        method();
        method1();
        method1();
        }
        public static void method(){
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
        }
        public static void method1(){
            System.out.println("***************");
        int i = 20;
        while (i <= 30){
            System.out.println(i);
            i++;
        }
         */
        /*
        //Method OverLoading
        method(1,10);
        System.out.println("*****************");
        method(20,30);
        }
        public static void method(int val,int val1) {
            while (val <= val1) {
                System.out.println(val);
                val++;
            }
         */
        /*
        //Methd OverLoading
        System.out.println(rectAngle(10,15.5F));
        System.out.println(square(25.50));
        System.out.println(square(26));
        System.out.println(rectangle(20,10));
        }
    public static float rectAngle( int length,float width){
        return length * width;
    }
    public static double square(double sqr){
        return sqr * sqr;
    }
    public static int square(int sqr){
        return sqr * sqr;
    }
    public static int rectangle(int length,int width){
        return length * width;
    }
         */
        /*
        //Leap Year or Not program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year");
        }
        */
        /*
        //Even or odd integers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
         */
        /*
        //Largest among 3 Numbers
        int a = 40,b = 20,c = 30;
        if (a >= b && a >= c){
            System.out.println("a is greater");
        } else if (b >= c && b >= a) {
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }
         */
        /*
        //Factorial NUmber
        int i, fact = 1;
        for (i = 1; i <= 5; i++)
            fact = fact * i;
        System.out.println(fact);
         */
        /*
        //display all prime numbers from 1 to N
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int a = 2;a <= num;a++){
            int flag = 0;
            for (i = 2; i <= a/2; i++) {
                if (a % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(a);
            }
        }
         */
        /*
        //Display Vowels or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Non Vowel");
        }
         */
        /*
        //if-else-if ladder use to vowels or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        char ch = sc.next().charAt(0);
        //char ch = 'a';
        if (ch == 'a'){
            System.out.println("vowels");
        } else if (ch == 'e') {
            System.out.println("vowels");
        } else if (ch == 'i') {
            System.out.println("Vowels");
        } else if (ch == 'o') {
            System.out.println("vowels");
        } else if (ch == 'u') {
            System.out.println("vowels");
        }else {
            System.out.println("Not Vowels");
        }
         */
        /*
        //Armstrong number or not
     int num = 153,number,temp,total = 0;
     number = num;
     while (number != 0){
         temp = number % 10;
         total = total + temp * temp * temp;
         number = number / 10;
     }
     if (total == num){
         System.out.println("Armstrong Number");
     }else {
         System.out.println("Not Armstong Number ");
     }
         */
        /*
        //Star pattern program
        for (int i = 1; i <= 5; i++) {
            System.out.print("\n");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                //System.out.print(j);
            }
        }
         */
        /*
        //output of program
//        5
//        54
//        543
//        5432
//        54321
        int i,j;
        for (i=5;i>=1;i--){
            System.out.print("\n");
            for (j=5;j>=i;j--){
                System.out.print(j);
            }
        }
         */
        /*
        //Pattern Problem
        int i, j;
        for (i = 1; i <=5; i++) {
            System.out.println("\t");

            for (j = 1; j <= i; j++) {
                System.out.print(j+ " ");
                //System.out.print(i+ " ");
                //System.out.print(j);
                //System.out.print("* ");
            }
            // System.out.println(" ");
        }
         */
        /*
        //Single Dimentional Array
        int[] Arrays = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < Arrays.length; i++) {
            System.out.print(Arrays[i] + " ");
        }
        System.out.println("\n");
        System.out.println(Arrays.length);

        Arrays[4] = 20;
        for (int i = 0; i < Arrays.length; i++) {
            System.out.print(Arrays[i] + " ");
        }
        System.out.println("\n");
        for (int a : Arrays) {
            System.out.println(a);
        }
         */
        /*
        //Muli Dimentional Array
        int[][] multiDimen = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0;i <= 2;i++){
            for (int j = 0;j <= 2; j++){
                System.out.print(multiDimen[i][j] + " ");

            }
            System.out.println();
        }
        */
        /*
        //Reverse number print using for loop
        int num = 123, i = 0;
        for (; num != 0; ) {
            int rem = num % 10;
            i = i * 10 + rem;
            num = num / 10;
        }
        System.out.println(i);
         */
        /*
        //Reverse Number Print using While loop
        int num = 123,i = 0;
        while (num != 0){
            int rem = num % 10;
            i = i * 10 + rem;
            num = num / 10;
        }
        System.out.println(i);
         */
        /*
        //Palindrome Number or Not
        int num = 121, i = 0,temp;
        temp = num;
        for (; num != 0; ) {
            int rem = num % 10;
            i = i * 10 + rem;
            num = num / 10;
        }
        if (temp == i) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
         */
        /*
        //Sum of n natural number
        int num = 5, sum = 0, i;
        for (i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        */
        /*
        //While loop to Print table
        int a = 1,num = 2;
        while (a <= 10){
            System.out.println(a * num );
            a++;
        }
         */
        /*
        //Using Arrray Table Print using for Each Loop
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 2;
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i] * num);
        }
        for (int i : arr) {
            System.out.println(i);
        }
         */
         /*
        //multi Dimentional Array Table Print
        int[][] multiDimen = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0;i <= 2;i++){
            for (int j = 0; j <= 2;j++){
                System.out.print(multiDimen[i][j] * 2+" ");
                //System.out.println(multiDimen[1][1]);
                //System.out.println(multiDimen[0][1]);
            }
            System.out.println();
        }
          */
        /*
        //Array using multi dimentional
        int[][] twoDimen = new int[3][3];
        twoDimen[0][0] = 1;
        twoDimen[0][1] = 2;
        twoDimen[0][2] = 3;
        twoDimen[1][0] = 4;
        twoDimen[1][1] = 5;
        twoDimen[1][2] = 6;
        twoDimen[2][0] = 7;
        twoDimen[2][1] = 8;
        twoDimen[2][2] = 9;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++)
                System.out.print(twoDimen[i][j] + " ");
        }
        System.out.println();
         */
        /*
        //Array List Print Using For Loop,While Loop(Iterato),For Each Loop
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        for (int i : arrayList){
            System.out.println(i);
        }
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (int i =1;i <= arrayList.size();i++){
            System.out.println(i);
        }
         */
        /*
        //Array List for Loop Use
        List<Integer> arrayList = new ArrayList<>(5);
        for (int i = 1;i <= 5;i++){
            arrayList.add(i);
            //System.out.println(arrayList);
        }
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
         */
         /*
        //Using Set in Java Repeated Data Not Display
        Set<String> data = new LinkedHashSet<>();
        data.add("adi");
        data.add("aki");
        data.add("ani");
        data.add("adi");
        data.add("abhi");
        for (String i : data){
            System.out.println(i);
        }
        Iterator itr = data.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
          */
        /*
        List<String> arrayList = new ArrayList<>();
        arrayList.add("adi");
        arrayList.add("abhi");
        arrayList.add("saku");
        arrayList.add("ram");
        arrayList.add("suraj");
        for (String i : arrayList){
            System.out.println(i.replaceAll("a","b"));
            arrayList.set(1,"motewar");
            //arrayList.add(5,"sanket");
            System.out.print(i);
        }
        */
        /*
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 = new String("HELLO");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
         */
        /*
        //Enter a no an stop loop
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int n = 1;
        while (flag) {
            System.out.println("select option \n1.aas.\n2.fad.\n3-ade.\n4.Exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("vv");
                    break;
                case 2:
                    System.out.println("sf");
                    break;
                case 3:
                    System.out.println("notdata");
                    break;
                default:
                    flag = false;
                    break;
            }
        }
         */
        List<String> obj = new LinkedList<>();
        obj.add("Aditya");
        obj.add("kash");
        obj.add("ram");
        obj.add("uraj");
        obj.add("sanjay");
        System.out.println(obj);
        System.out.println("=================");
        //Sorting Array order
        obj.sort(null);
        System.out.println(obj);
        System.out.println("==================");
        List<String> obj2 = new LinkedList<>();
        obj2.add("Aniket");
        obj2.add("Vishnu");
        obj2.add("Akash");
        obj.add(1, "Motewar");
        System.out.println(obj);
        System.out.println("====================");
        //Two List Add
        obj.addAll(obj2);
        System.out.println(obj);
        System.out.println("=======================");
        obj.listIterator(2);
        System.out.println(obj);
        System.out.println("==============");
        //Reverse List Print
        Collections.reverse(obj);
        System.out.println(obj);
        System.out.println("============");

    }
}


