import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
// 1.Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш
public class task2 {
    //* */ public static void main(String[] args) {
    //     System.out.println(isPalindrome("krot")); 
    //     System.out.println(isPalindrome("122221")); 
    //     System.out.println(isPalindrome("abba")); 
    // }
    // public static boolean isPalindrome(String str) {
    //     return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    // } 
    // */  }
     


    // 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.
     
    public static void main(String[] args) throws IOException {
        Path file = Path.of("file.txt");
    
        
        // Files.createFile(file);
        // Files.createDirectory(file);


        Files.writeString(file, "Test".repeat(100));
        
        String content = Files.readString(file);
        System.out.println(content);
   
    
    }
}
