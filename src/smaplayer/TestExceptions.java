/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaplayer;

import java.util.NoSuchElementException;

/**
 *
 * @author koropenkods
 */
public class TestExceptions {   
    
    public static void main(String[] args) {
        /*Runtime Exceptions*/
        try{
            //throw new NullPointerException("NullPointerException");
            //Object o = null;
            //o.getClass();
            
            //throw new IllegalArgumentException("IllegalArgumentException");           
            //throw new ClassCastException("ClassCastException");
            //Object o = new Object();
            //SmaPlayer sp = (SmaPlayer)o;
            
            //throw new ArithmeticException("ArithmeticException");
            //int x = 2/0;
            
            //throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
            //int[] arr = new int[5];
            //arr[6] = 0;
            
            //throw new NoSuchElementException("NoSuchFieldException");
            //throw new RuntimeException("RuntimeException");
        }   
        catch(NullPointerException e){
            //Объект нулевой
            System.out.println("NullPointerException");
        }
        catch (IllegalArgumentException e){
            //Аргумент в метод приходит нулевой
            //Плохое оформление кода
            System.out.println("IllegalArgumentException");
        }
        catch (ClassCastException e){
            //Неправильное приведение типов
            System.out.println("ClassCastException");
        }
        catch (ArithmeticException e){
            //Деление на ноль и другие арифметические аномалии
            System.out.println("ArithmeticException");
        }
        catch (IndexOutOfBoundsException e){
            //Выход за границы массива
            System.out.println("IndexOutOfBoundsException");
        }
        catch (NoSuchElementException e){
            //Это такая ебанина которая теряет элементы
            System.out.println("NoSuchElementException");
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    
        TestExceptions test = new TestExceptions();
        
        try{
            int x = test.delenie(2,0);    
        }
        catch (ExceptionTester e){
            System.out.println("Op. Mizantrop");
        }
        
    }   
    
    public int delenie(int a, int b){
        if (b == 0){
            throw new ExceptionTester();
        }
        
        return a/b;
    }    
}
