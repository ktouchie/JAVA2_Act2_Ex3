import java.util.*;
class betterbubble {

	public static void main(String[] args) {
        
        int[] tab = {5,9,4,1,2,7,3,8,6,0};
        
        boolean swap = false;
        int j = tab.length-1;
        int currentSwap = -1;
        
        do {
            swap = false;
        
            int i = 0;
           
            while (i<j) {
                
                if (tab[i]>tab[i+1]) {
                    int x = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = x;
                    swap = true;                   
                }
                currentSwap = i+1;
                i++;
            }
            
            j = currentSwap;
            
        } while (swap == true);
        System.out.println(Arrays.toString(tab));
    }
}
