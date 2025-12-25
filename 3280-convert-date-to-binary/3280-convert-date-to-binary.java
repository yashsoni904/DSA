class Solution {
    public String convertDateToBinary(String date) {
        StringBuffer sb = new StringBuffer();
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        sb.append(Integer.toBinaryString(year));
        sb.append("-");
        sb.append(Integer.toBinaryString(month));
        sb.append("-");
        sb.append(Integer.toBinaryString(day));
        return sb.toString();
    }
}