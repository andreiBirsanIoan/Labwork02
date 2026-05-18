void main() {
        int[] numbers=getNumbers();
        for(int n:numbers){
            IO.print(n+" ");
        }
        int[] numbers2=filterEvenNumbers(numbers);
        for(int n:numbers2){
            IO.print(n+" ");
        }
        int[] numbers3=filterOddNumbers(numbers);
        for(int n:numbers3){
            IO.print(n+" ");
        }
}
int[] getNumbers(){
    int[] numbers=new int[100];
    for(int i=1;i<100;i++){
        numbers[i]=i;
    }
    return numbers;
}
int[] filterEvenNumbers(int[] numbers)
{
    int[] evenNumbers=new int[100];
    int i=0;
    for(int n:numbers){
        if(n%2==0)
        {
            evenNumbers[i++]=n;
        }
    }
    return evenNumbers;
}
int[] filterOddNumbers(int[] numbers)
{
    int[] oddNumbers=new int[100];
    int i=0;
    for(int n:numbers){
        if(n%2==1)
        {
            oddNumbers[i++]=n;
        }
    }
    return oddNumbers;
}
