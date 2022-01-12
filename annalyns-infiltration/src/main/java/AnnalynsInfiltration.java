class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake==true || archerIsAwake==true || prisonerIsAwake==true)
            return true;
        else
            return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(prisonerIsAwake==true && archerIsAwake==false)
            return true;
        else return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
     if((petDogIsPresent==true && archerIsAwake==false) ||
        (petDogIsPresent==false && prisonerIsAwake==true && knightIsAwake==false 
        && archerIsAwake==false))
         return true;
     else if (petDogIsPresent==false && prisonerIsAwake==false)
        return false;
     return false;         
    }
}
