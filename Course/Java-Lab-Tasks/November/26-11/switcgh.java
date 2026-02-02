void main(){
    IO.println("Enter the Day");    
    String day = IO.readln().toUpperCase();
    String result = switch(day)
    {
        case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> "is a Weekend";
        case "SATURDAY","SUNDAY" -> "is a Weekend";
        default -> "is not a valid day";

    };

    IO.println(day + "is a" + result);
}