public class RomanCalcs extends Calculations{
    private String[] provRoman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "L","C"};
    private String[] provArab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "50","100"};
    private int step = 0;

    public String[] restuct(String[] str){
        for(int i = 0; i < provRoman.length; i++){
            if (provRoman[i].equals(str[0])){
                str[0] = provArab[i];
            }
            if (provRoman[i].equals(str[1])){
                str[1] = provArab[i];
            }
        }
        return str;
    }

    @Override
    public void addition(int[] arr) {
        for(int i = 0; i < arr[0] + arr[1]; i += step){

            if(arr[0] + arr[1] - 10 - step >= 0){
                System.out.print("X");
                step += 10;
            }
            else if(arr[0] + arr[1] - 9 - step >= 0){
                System.out.print("IX");
                step += 9;
            }
            else if(arr[0] + arr[1] - 8 - step >= 0){
                System.out.print("VIII");
                step += 8;
            }
            else if(arr[0] + arr[1] - 7 - step >= 0){
                System.out.print("VII");
                step += 7;
            }
            else if(arr[0] + arr[1] - 6 - step >= 0){
                System.out.print("VI");
                step += 6;
            }
            else if(arr[0] + arr[1] - 5 - step >= 0){
                System.out.print("V");
                step += 5;
            }
            else if(arr[0] + arr[1] - 4 - step >= 0){
                System.out.print("IV");
                step += 4;
            }
            else if(arr[0] + arr[1] - 3 - step >= 0){
                System.out.print("III");
                step += 3;
            }
            else if(arr[0] + arr[1] - 2 - step >= 0){
                System.out.print("II");
                step += 2;
            }
            else if(arr[0] + arr[1] - 1 - step >= 0){
                System.out.print("I");
                step += 1;
            }
        }
    }

    @Override
    public void subtraction(int[] arr) {
        if(arr[0]-arr[1] < 1){
            System.out.println("Неположительный результат");
        }
        else{
            for(int i = 0; i < arr[0] - arr[1]; i += step){

                if(arr[0] - arr[1] - 10 - step >= 0){
                    System.out.print("X");
                    step += 10;
                }
                else if(arr[0] - arr[1] - 9 - step >= 0){
                    System.out.print("IX");
                    step += 9;
                }
                else if(arr[0] - arr[1] - 8 - step >= 0){
                    System.out.print("VIII");
                    step += 8;
                }
                else if(arr[0] - arr[1] - 7 - step >= 0){
                    System.out.print("VII");
                    step += 7;
                }
                else if(arr[0] - arr[1] - 6 - step >= 0){
                    System.out.print("VI");
                    step += 6;
                }
                else if(arr[0] - arr[1] - 5 - step >= 0){
                    System.out.print("V");
                    step += 5;
                }
                else if(arr[0] - arr[1] - 4 - step >= 0){
                    System.out.print("IV");
                    step += 4;
                }
                else if(arr[0] - arr[1] - 3 - step >= 0){
                    System.out.print("III");
                    step += 3;
                }
                else if(arr[0] - arr[1] - 2 - step >= 0){
                    System.out.print("II");
                    step += 2;
                }
                else if(arr[0] - arr[1] - 1 - step >= 0){
                    System.out.print("I");
                    step += 1;
                }
            }
        }
    }

    @Override
    public void multiplication(int[] arr) {
        for(int i = 0; i < arr[0] * arr[1]; i += step){

            if(arr[0] * arr[1] - 100 - step == 0){
                System.out.print("C");
                step = 100;
            }
            else if(arr[0] * arr[1] - 50 - step >= 0){
                System.out.print("L");
                step = 50;
            }
            else if(arr[0] * arr[1] - 10 - step >= 0){
                System.out.print("X");
                step += 10;
            }
            else if(arr[0] * arr[1] - 9 - step >= 0){
                System.out.print("IX");
                step += 9;
            }
            else if(arr[0] * arr[1] - 8 - step >= 0){
                System.out.print("VIII");
                step += 8;
            }
            else if(arr[0] * arr[1] - 7 - step >= 0){
                System.out.print("VII");
                step += 7;
            }
            else if(arr[0] * arr[1] - 6 - step >= 0){
                System.out.print("VI");
                step += 6;
            }
            else if(arr[0] * arr[1] - 5 - step >= 0){
                System.out.print("V");
                step += 5;
            }
            else if(arr[0] * arr[1] - 4 - step >= 0){
                System.out.print("IV");
                step += 4;
            }
            else if(arr[0] * arr[1] - 3 - step >= 0){
                System.out.print("III");
                step += 3;
            }
            else if(arr[0] * arr[1] - 2 - step >= 0){
                System.out.print("II");
                step += 2;
            }
            else if(arr[0] * arr[1] - 1 - step >= 0){
                System.out.print("I");
                step += 1;
            }
        }
    }

    @Override
    public void division(int[] arr) {
        for(int i = 0; i < arr[0] / arr[1]; i += step){

            if(arr[0] / arr[1] - 100 - step == 0){
                System.out.print("C");
                step = 100;
            }
            else if(arr[0] / arr[1] - 50 - step >= 0){
                System.out.print("L");
                step = 50;
            }
            else if(arr[0] / arr[1] - 10 - step >= 0){
                System.out.print("X");
                step += 10;
            }
            else if(arr[0] / arr[1] - 9 - step >= 0){
                System.out.print("IX");
                step += 9;
            }
            else if(arr[0] / arr[1] - 8 - step >= 0){
                System.out.print("VIII");
                step += 8;
            }
            else if(arr[0] / arr[1] - 7 - step >= 0){
                System.out.print("VII");
                step += 7;
            }
            else if(arr[0] / arr[1] - 6 - step >= 0){
                System.out.print("VI");
                step += 6;
            }
            else if(arr[0] / arr[1] - 5 - step >= 0){
                System.out.print("V");
                step += 5;
            }
            else if(arr[0] / arr[1] - 4 - step >= 0){
                System.out.print("IV");
                step += 4;
            }
            else if(arr[0] / arr[1] - 3 - step >= 0){
                System.out.print("III");
                step += 3;
            }
            else if(arr[0] / arr[1] - 2 - step >= 0){
                System.out.print("II");
                step += 2;
            }
            else if(arr[0] / arr[1] - 1 - step >= 0){
                System.out.print("I");
                step += 1;
            }
        }
    }

    public void trancription(String str){
        if(str.contains("+")){
            String[] nums = str.split("\\+");
            this.restuct(nums);
            int[] arr = {Integer.parseInt(nums[0]),Integer.parseInt(nums[1])};
            this.addition(arr);
        }
        else if (str.contains("-")){
            String[] nums = str.split("-");
            this.restuct(nums);
            int[] arr = {Integer.parseInt(nums[0]),Integer.parseInt(nums[1])};
            this.subtraction(arr);
        }
        else if (str.contains("*")){
            String[] nums = str.split("\\*");
            this.restuct(nums);
            int[] arr = {Integer.parseInt(nums[0]),Integer.parseInt(nums[1])};
            this.multiplication(arr);
        }
        else{
            String[] nums = str.split("/");
            this.restuct(nums);
            int[] arr = {Integer.parseInt(nums[0]),Integer.parseInt(nums[1])};
            this.division(arr);
        }

    }
}
