

import java.io.*;
import java.util.*;



// Text invers:

/* Donat un text imprimeix-lo de manera inversa.

Input Format

Cadena de text fins a final de línia.

Constraints

No n'hi ha.

Output Format

Cadena de text invertida.

Sample Input 0

Hola Text Invers.
Sample Output 0

.srevnI txeT aloH

 */



public class Solution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        word = word.trim();
        String result = "";

        char[] ch=word.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--)
        {
            result += ch[i];
        }
        System.out.println(result.trim());
    }
}
