public class Leetcode1185_dayOfTheWeek {
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(31, 8, 2100));
    }
    // 注意：闰年
    // 当一个年份是整百的年份时，
    // 他需要能被 400 整除才是闰年，而不是被 4 整除
    // 所以 2000 年是闰年，但 1900 年和 2100 年都不是闰年
    public static String dayOfTheWeek(int day, int month, int year){
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int sum = 0;
        for(int i = 1971; i < year; i++){
            if(i % 4 == 0){
                if(i % 100 == 0){
                    if(i % 400 == 0){
                        sum = sum + 366;
                    }
                    else{
                        sum = sum + 355;
                    }
                }
                else{
                    sum = sum + 366;
                }
            }
            else{
                sum = sum + 365;
            }
        }
        for(int i = 1; i < month; i++){
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                sum = sum + 31;
                continue;
            }
            if(i == 4 || i == 6 || i == 9 || i == 11){
                sum = sum + 30;
                continue;
            }
            if(i == 2){
                if(year % 4 == 0){
                    if(year % 100 == 0){
                        if(year % 400 == 0){
                            sum = sum + 29;
                        }
                        else{
                            sum = sum + 28;
                        }
                    }
                    else{
                        sum = sum + 29;
                    }
                }
                else{
                    sum = sum + 28;
                }
            }
        }
        sum = sum + day - 1;
        sum = sum % 7;
        sum = (4 + sum) % 7;
        return days[sum];
    }
}
