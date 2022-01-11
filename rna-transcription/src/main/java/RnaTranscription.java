class RnaTranscription {

    String transcribe(String dnaStrand) {
        String s1="";
        for(int i=0;i<dnaStrand.length();i++)
        {
            if(dnaStrand.charAt(i)=='C')
                s1+='G';
            else if(dnaStrand.charAt(i)=='G')
                s1+='C';
            else if(dnaStrand.charAt(i)=='T')
                s1+='A';
            else if(dnaStrand.charAt(i)=='A')
                s1+='U';
        }
        return s1;
    }

}
