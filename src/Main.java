public class Main {
    public static void main(String[] args) {
        //elemanlarımız
        int[] list={10,20,20,10,10,20,5,20};
        //işimizi kolaylaştımak için ilk başta sıralama yaptım böylelikle bi tık daha hızlı olur diye düşündüm.
        for (int i=0;i<list.length;i++){
            int temp=0;
            for (int j=0;j<list.length;j++){
                if (list[j]<list[i]){
                    temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }

        int temp=0;

        for (int i=0;i< list.length;i++){
            int tekrarSayisi=0;
            for (int j=0;j< list.length;j++){
                if (list[i]==list[j]){
                    tekrarSayisi++;
                }
            }
            if (temp!=list[i]){
                System.out.println(list[i]+" sayısı  "+tekrarSayisi+" kere tekrar edildi.");
            }
            temp=list[i];
        }
    }
}
