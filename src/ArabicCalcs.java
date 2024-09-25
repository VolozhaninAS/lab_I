public class ArabicCalcs extends Calculations {
    public void trancription(String str){
        if(str.contains("+")){
            String[] nums = str.split("\\+");
            int[] arr = {Integer.parseInt(nums[0]),Integer.parseInt(nums[1])};
            this.addition(arr);
        }
        else if (str.contains("-")){
            String[] nums = str.split("-");
            int[] arr = {Integer.parseInt(nums[0]),Integer.parseInt(nums[1])};
            this.subtraction(arr);
        }
        else if (str.contains("*")){
            String[] nums = str.split("\\*");
            int[] arr = {Integer.parseInt(nums[0]),Integer.parseInt(nums[1])};
            this.multiplication(arr);
        }
        else{
            String[] nums = str.split("/");
            int[] arr = {Integer.parseInt(nums[0]),Integer.parseInt(nums[1])};
            this.division(arr);
        }

    }

}
