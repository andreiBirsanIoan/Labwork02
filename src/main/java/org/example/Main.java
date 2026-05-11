void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] numbers=getNumbers();
        for(int n:numbers){
            IO.print(n+" ");
        }
}
int[] getNumbers(){
    int[] numbers=new int[100];
    for(int i=1;i<=100;i++){
        numbers[i]=i;
    }
    return numbers;
}
int[] getEvenNumbers()
{
    int[] evenNumbers=new int[100];
    int i=0;
    for(int n:evenNumbers){
        if(n%2==0)
        {
            evenNumbers[i++]=n;
        }
    }
    return evenNumbers;
}
int[] getOddNumbers()
{
    int[] oddNumbers=new int[100];
    int i=0;
    for(int n:oddNumbers){
        if(n%2==1)
        {
            oddNumbers[i++]=n;
        }
    }
    return oddNumbers;
}
