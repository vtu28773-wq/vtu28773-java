class HighestAltitude  {

    public int largestAltitude(int[] gain) {
        int currentAltitde = 0;
        //heighest altitude at 0
        int heighestpoint = currentAltitde;
        for (int  altitudegain : gain){
            //adding
            currentAltitde += altitudegain;
            heighestpoint = Math.max(heighestpoint, currentAltitde);
        }
        return heighestpoint;
        
    }
}