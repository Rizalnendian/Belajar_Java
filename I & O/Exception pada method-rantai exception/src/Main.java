import java.util.Scanner;

public void main(String[] args) {
    int [] arrayData = {0,1,2,3};
    Scanner userInput = new Scanner(System.in);
    System.out.print("Data ke: ");
    int indexInput = userInput.nextInt();

    //exception biasa
    System.out.println("Exception biasa");
    try{
        System.out.printf("Data dari array index ke %d adalah %d\n\n", indexInput, arrayData[indexInput]);
    } catch (Exception e){
        System.err.println(e);
    }

    //exception dalam method
    System.out.println("Exception dalam method atau fungsi");
    int data = ambilDataDariArray(arrayData, indexInput);
    System.out.printf("Data dari array index ke %d adalah %d\n\n", indexInput, data);

    //exception dalam method throws by method
    System.out.println("Exception throws by method");
    int data2 = 0;
    try{
        data2 = ambilDataDariArray_2(arrayData, indexInput);
    } catch (Exception e){
        System.err.println(e);
    }
    System.out.printf("Data dari array index ke %d adalah %d\n\n", indexInput, data);


    System.out.println("\n\nAkhir program");
}
private static int ambilDataDariArray(int [] array, int index){
   int hasil = 0;
    try{
        hasil = array[index];
    } catch (Exception e){
        System.err.println(e);
    }

    return hasil;
}

private static int ambilDataDariArray_2(int [] array, int index) throws Exception {
    int hasil = array[index];
    return hasil;
}