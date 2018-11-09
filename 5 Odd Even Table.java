
package oddevenarrayeligio;

public class OddEvenArrayEligio {

    public static void main(String[] args) {
        
        
        String[] nums = {
            "3",
            "2",
            "15",
            "20",
            "23",
            "18",
            "65",
            "4",
            "9",
            "14",
            "21"
        };
        System.out.println("Array elements are: ");
        
        for(int x = 0;x<nums.length;x++){
            System.out.print(nums[x]);
        }
        
        System.out.print("\n\n");
        
        int[] num = {
            3,
            2,
            15,
            20,
            23,
            18,
            65,
            4,
            9,
            14,
            21,
            5,
            3,
            
        };
        
        System.out.print("Odd\tEven");
        for(int i = 0;i<num.length;i++){
            
            if(num[i]%2==0){
                //System.out.print("\n");
                System.out.print("\t" + num[i]);
            }
            else if(num[i]%2!=0){
                System.out.print("\n");
                System.out.print("" + num[i]);
                
            }
            
        }
        System.out.print("\n");
        
        
    }
    
}
