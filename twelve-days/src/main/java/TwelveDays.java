class TwelveDays {
    String[] days = {"first", "second", "third","fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    
    String[] message = {" a Partridge in a Pear Tree.\n", " two Turtle Doves,", " three French Hens,", " four Calling Birds,", " five Gold Rings,", " six Geese-a-Laying,", " seven Swans-a-Swimming,", " eight Maids-a-Milking,", " nine Ladies Dancing,", " ten Lords-a-Leaping,", " eleven Pipers Piping,", " twelve Drummers Drumming,"};
    
    String verse(int verseNumber) {
        String initialString = "On the " + days[verseNumber-1] + " day of Christmas my true love gave to me:";
        for(int i=verseNumber;i>0;i--)
        {
            if(i==1 && verseNumber>1)
                initialString+=" and"+message[i-1];
            else
                initialString+=message[i-1];
        }
        return initialString;
    }

    String verses(int startVerse, int endVerse) {
        String finalString="";
        for(int i=startVerse;i<=endVerse;i++)
        {
            String initialString="";
            initialString+="On the " + days[i-1] + " day of Christmas my true love gave to me:";
            for(int j=i;j>0;j--)
            {
                if(j==1 && i>1)
                    initialString+=" and"+message[j-1];
                else
                    initialString+=message[j-1];
            }                 
            if(i!=endVerse)
                finalString+=initialString + "\n";
            else
                finalString+=initialString;
        }
        return finalString;
    }
    
    String sing() {
        String finalString="";
        for(int i=1;i<=12;i++)
        {
            String initialString="";
            initialString+="On the " + days[i-1] + " day of Christmas my true love gave to me:";
            for(int j=i;j>0;j--)
            {
                if(j==1 && i>1)
                    initialString+=" and"+message[j-1];
                else
                    initialString+=message[j-1];
            }       
            if(i!=12)
                finalString+=initialString + "\n";
            else
                finalString+=initialString;
        }
        return finalString;
    }
}

