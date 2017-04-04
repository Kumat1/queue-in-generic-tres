package queue;

/**
 * Created by Taufik Kamil on 04/04/2017.
 */
public class queue {
    int antrian[];
    int depan, belakang;
    int jumlah, ukuran;
    queue(int n){
        antrian = new int[n]; ukuran=n;
        jumlah=depan=belakang=0;
    }

    public static void main(String s[]){
        queue q = new queue(5);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(9);
        q.view();
    }

    void enqueue(int size){
        if(jumlah<ukuran){
            antrian[belakang]=size;
            jumlah++; belakang++;
            System.out.println(size+" masuk");
        }
        else
            System.out.print("Data Penuh");
    }

    void dequeue(){
        for(int i=0; i<jumlah-1 ;i++){
            antrian[i]=antrian[i+1];
        }
        jumlah--;
        belakang--;
    }

    void view(){
        System.out.println("Isi Antrian : ");
        for(int i=0; i<jumlah; i++){
            System.out.print(antrian[i]+" ");
        }
    }
}
