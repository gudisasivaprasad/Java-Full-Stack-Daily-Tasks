/*People use different social media platforms with varying levels of engagement.
You must build a program that categorizes a user based on platform type and screen time usage.

✅ Input Requirements

You must take two inputs:

1️⃣ Platform Name — String (case-insensitive)
2️⃣ Daily Usage Hours — int (must be ≥ 0)

✅ Platform Classification Rules
Image-based Platforms

INSTAGRAM, FACEBOOK, SNAPCHAT
→ "Image-based Social Platform"

Microblogging & Discussion Platforms

TWITTER, THREADS, REDDIT
→ "Microblogging Discussion Platform"

Video Entertainment Platforms

YOUTUBE, TIKTOK, MOJ, ROPOSO
→ "Video Content Platform"


Additional Condition Inside Switch

If daily usage hours > 5, return:

High Usage — Consider reducing screen time

Finally print:

PLATFORM → RESULT

 Input Format
----------------
<platform>
<daily_usage_hours>

Output Format
----------------
PLATFORM → RESULT

If the given platform does NOT match any known list:
Unknown or Unsupported Platform *

void main() {
    String platform = IO.readln().toUpperCase();
    int dailyUsageHours = Integer.parseInt(IO.readln());


    String result = switch (platform) {
        case "INSTAGRAM", "FACEBOOK", "SNAPCHAT" -> {
            if (dailyUsageHours > 5) {
                yield "Image-based Social Platform — High Usage: Consider reducing screen time";
            } else {
                yield "Image-based Social Platform";
            }
        }
        case "TWITTER", "THREADS", "REDDIT" -> {
            if (dailyUsageHours > 5) {
                yield "Microblogging Discussion Platform — High Usage: Consider reducing screen time";
            } else {
                yield "Microblogging Discussion Platform";
            }
        }
        case "YOUTUBE", "TIKTOK", "MOJ", "ROPOSO" -> {
            if (dailyUsageHours > 5) {
                yield "Video Content Platform — High Usage: Consider reducing screen time";
            } else {
                yield "Video Content Platform";
            }
        }
        default -> "Unknown or Unsupported Platform";
    };

    IO.println(platform + " → " + result);
}

*/
void main(){
    String platformName = IO.readln().toUpperCase();
    int usageHours = Integer.parseInt(IO.readln());

     if(usageHours>5)
     {

         switch(platformName)
         {
              case "YOUTUBE"  ->
              {
                   IO.println("YOUTUBE = High Usage => Consider reducing screen time");
                   System.exit(0);
              }
              default -> IO.println("");
         }; 
         
     }else
     {
    String result = switch(platformName){
        case "INSTAGRAM","FACEBOOK","SNAPCHAT" -> "Image-based Social Platform";
        case "TWITTER","THREADS","REDDIT" -> "Microblogging Discussion Platform";
        case "YOUTUBE","TIKTOK","MOJ","ROPOSO" -> "Video Content Platform";
        default -> "Unknown or Unsupported Platform";
    };
     
    IO.println(platformName+" = "+result);
     }
}