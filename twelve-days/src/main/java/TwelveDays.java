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
            String initialString = verse(i);  
            if(i!=endVerse)
                finalString+=initialString + "\n";
            else
                finalString+=initialString;
        }
        return finalString;
    }
    
    String sing() {
        return verses(1, 12);
    }
}

