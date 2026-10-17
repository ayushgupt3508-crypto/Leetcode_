class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        //Doomsday algorithm
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int[] doomsdays = {0,leapYear ? 4 : 3, leapYear ? 29 : 28, 14,4,9,6,11,8,5,10,7,12};

        int centuryAnchor = year == 2100 ? 0 : year < 2000 ? 3 : 2;
        int yearDigits = year % 100;

        int a = 0, b = 0, c = 0;
        a = yearDigits / 12;
        b = yearDigits % 12;
        c = b / 4;
        
        int doomsday = (centuryAnchor + ( (a + b + c) % 7 )) % 7;
        
        int difference = day - doomsdays[month] % 7;
        if(difference < 0) difference += 7;
        return days[ (doomsday + difference) % 7];
        
        // return days[ (doomsday + ((day - doomsdays[month]) % 7) + 7) % 7];
    }
}