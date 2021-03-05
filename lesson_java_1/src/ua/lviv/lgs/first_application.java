package ua.lviv.lgs;

//import java.util.Iterator;

public class first_application {
	
   public static void main(String[] args) {

//	   int a = 2; 
//	   long b = 3;
//	      
//	   System.out.println("var a = "+a); 
//	   System.out.println("var a = "+b);



// Приклад 1 : додавання і візнімання змінних

//	    int d = 1;
//	    int e = 2;
//	    
//	    int res1 = d + e;
//	    int res2 = d - e;
//	    int res3 = d * e;
//	    int res4 = d / e; 
//	    
//	    System.out.println("res1 = "+res1);
//	    System.out.println("res2 = "+res2);
//	    System.out.println("res3 = "+res3);
//	    System.out.println("res4 = "+res4);  //Тут в нас виходить 0, тому що int присвоює тільки ціле число, тому 1:2=0,5 і показує нам тільки те число котре є до коми, тобто 0.



// Приклад 2 : Який буде результат виведення на екран? (інкремент/декремент)

//	     int a = 0;
//	     int b = a++;
//	     int c = a++;
//	     System.out.println("Приклад 2 = " + a + " " + b + " " + c + " ");



// Приклад 3 : Операції з присвоєнням

//	     int f = 1;
//	     int g = 2;
//	     int h = 3;
//	   
//	     f+=5;      // f = f + 5 => f = 1 + 5 = 6
//	     g*=4;      // g = g * 4 => g = 2 * 4 = 8
//       h+=f*g;    // h = h + f*g => 3 + 6*8 = 51
//       h%=6;      // h = h % 6 => h = 51 % 6 = 3
//       
//       System.out.println("f = " + f);
//       System.out.println("g = " + g);
//       System.out.println("h = " + h);



// Приклад 4 : Тернарний оператор

//	      int a = 2;
//	      String s = "Vendeta";

//	      int r = a > 0 ? -3 : 2; // Тут типу значення "-3" це true, а значення "2" false 
// відповідно якщо "a > 0" тобто це правда, виведеться результат "-3"
// якщо "a < 0" тобто це неправда і виведеться результат "2"
//	      System.out.println("r = "+ r);



// Приклад 5 : Логічні оператори

//	      boolean j = true;
//	      boolean k = false;
//	      
//	      boolean l = j | k;   
//	            //  "|" оператор "або", шукає хоча би одне значення "true", а для "false" повинні бути два значення "false":
//	           //  може бути "true  | false" і нам в результаті покаже "true", 
//	          //  може бути "false | true" і нам в результаті також покаже "true",
//	         //  коли буде "false | false" тоді нам покаже "false",
//	        //  1 + 0 = 1 => true, 0 + 1 = 1 => true, 1 + 1 = 2 => false, 0 + 0 = 0 => false.
//         //   потрібно два "true" щоб змінній присвоїти результат "true", 
//        //    достатнього одного "false", щоб присвоїти значення "false".
//	      
//	    
//	      boolean m = j & k;    
//	         //  "&" оператор "і", те само що з оператором "або" тільки тут множення і чуть міняється тру з фолс:
//	        //   1 * 0 = 0 => false, 0 * 1 = 0 => false, 1 * 1 = 1 => true, 0 * 0 = 0 => true.
//	       //   потрібно два "true" щоб змінній присвоїти результат "true", 
//	      //    достатнього одного "false", щоб присвоїти значення "false".
//	      
//	      
//	      boolean n = (!j & k) | (j & !k);   
//	         // "!" це знак заперечення "не".
//	        // (не "true",  відповідно це буде "false", помножити на k = "false") плюс ("true" * на не "false", відповідно це буде "true")
//	       //  в нас false = 0, true = 1, тобто:
//	      // (0 * 0) + (1 * 1) = 0 + 1 = 1 тобто "true"
//	     
//	      
//	      
//	      boolean o = !j;   
//	      // тут заперечення, не "true", тобто виходить "false": 0 це "false"
//	      
//	      System.out.println("j = " + j);
//	      System.out.println("k = " + k);
//	      System.out.println("l = " + l);
//	      System.out.println("m = " + m);
//	      System.out.println("n = " + n);
//	      System.out.println("o = " + o);



// Приклад 6 : Операції рівності

//	      int t = 5;
//	      int u = 21;
//	      String result = (t>u) ? "Yes": "No";
//	      String result1 = (t<u) ? "Yes": "No";
//	      String result2 = (t==u) ? "Yes": "No";
//	      String result3 = (t>=u) ? "Yes": "No";
//	    
//	      System.out.println("result = " + result);
//	      System.out.println("result = " + result1);
//	      System.out.println("result = " + result2);
//	      System.out.println("result = " + result3);



// Приклад 7 : Конструкція "if-else"

//			int a1 = 12;
//			int b1 = 3;
//
//			if (a1 > b1) {
//				System.out.println("a1 > b1");
//			} else {
//				System.out.println("a1 < b1");
//			}



// Приклад 8 : Конструкція "if-else-if"

//			int a1 = 3;
//			int b1 = 9;
//			
//			if (a1 * a1 == b1) {
//				System.out.println("1");
//			} else if (a1 * a1 < b1) {
//				System.out.println("2");
//			} else {
//				System.out.println("3");
//			}
// так можна робити до без кінечності)



// Приклад 9 : Конструкція "switch" 1

//	       int user = 19;
//	       
//	       switch (user) {
//	       case 18:
//	    	   System.out.println("You're 18");
//	    	   break; 
//	    	   
//           case 19: 
//	          System.out.println("You're 19");
//	          break;
//	          
//           case 20:
//              System.out.println("You're 20");
//              break; 
//              
//            default: 
//              System.out.println("You're not 18, 19 or 20");
//	       }
// default - не є обовязковим, його можна не писати.



// Приклад 9 : Конструкція "switch" 2

//	        int k1 = 4;
//	        
//	        switch(k1) {
//	        case 1: case 3 : case 4:
//	        	 System.out.println("1, 3, 4");
//	        	 break; // якщо забрати брейк до відпрацює весь код по черзі, покажеться в результаті всі значення.
//	        
//	        case 2:
//	        	System.out.println("2");
//	            break;
//	        
//	        default: System.out.println("default");
//	        }



// Приклад 10 : Цикл "for"

//			for (int i = 0; i < 10; i++) {
//				System.out.println("i = " + i);
//			}



// Приклад 11 : Цикл "while"

//			int y = 0;
//			while (y < 10) {
//				System.out.println("y = " + y);
//				y++;
//			}



// Приклад 11 : Цикл "do while"
//	       
//	          int i = 0;
//	          
//	          do {
//	        	  System.out.println("do i = " + i);
//	        	  i++;
//	          } while  (i < 10);



// Приклад 12 : Масиви

				int array1[] = new int[10]; // тут ми створили пустий масив котрий має 10 комірок
				double[] array2 = new double[10];
				double array3[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };

				for (int i = 0; i < array1.length; i++) {
					array1[i] = i;
					array2[i] = i * i;
				}

				for (int i = 0; i < array1.length; i++) {
					System.out.print(array1[i] + " -> ");
					System.out.println(array2[i]);
				}

				for (int i = 0; i < array3.length; i++) {
					System.out.println(array3[i]);
				}



// Приклад 13 : Обгортки примітивів ( Wrappers primitives )

//           Byte a1 = 2;
//           Short a2 = 2;
//           Integer a3 = 2;
//           Long a4 = 2L; // до Лонгу приписуємо букву "L"
//           
//           int a5 = a1;
//	           a3 = a5; 
//	           
//	           Double b = 2.2;
//	           Float b1 = 3.3F; // до Флоату приписуємо букву "L"

}

}
