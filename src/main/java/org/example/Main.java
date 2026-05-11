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
