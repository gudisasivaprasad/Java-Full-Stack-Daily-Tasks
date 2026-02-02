/*Students learn concepts from multiple sources.
You must take a learning source input and categorize it using a new switch expression with grouped cases.

Categorization Rules:

FACULTY, TEACHER, CLASS
→ "Best understood in Classroom Session"

MENTOR, GUIDE, TRAINER
→ "Best understood during Mentorship"

LAB, PRACTICAL, WORKSHOP
→ "Best understood during Lab Practice"

Any other input
→ "Invalid Source"

Use switch expression returning String, then print the message.

Input Format
---------------
<string>

Output Format
-----------------
Student understood concept: <message> */

void main() {
    String role = IO.readln().toUpperCase();

    String message = switch (role) {
        case "FACULTY", "TEACHER", "CLASS" -> "Best understood in Classroom Session";
        case "MENTOR", "GUIDE", "TRAINER" -> "Best understood during Mentorship";
        case "LAB", "PRACTICAL", "WORKSHOP" -> "Best understood during Lab Practice";
        default -> "Invalid Source";
    };

    IO.println(message);
    IO.println("Student understood concept: " + role);
}
