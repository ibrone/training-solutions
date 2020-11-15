package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] napok = { "hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};

        System.out.println(napok[1]);
        System.out.println(napok.length);


        int tomb [] = new int [5];
tomb [0]=1;
for (int i=1; i < tomb.length; i++) {
    tomb[i] = tomb[i-1]*2;

}
for (int i=0; i<tomb.length;i++){
    System.out.println(tomb[i] + " ");
}
///boolean [] truefalse = new boolean [6];
/// for (int i=0; i < truefalse.length;i++){
 //   truefalse[i]= !truefalse[i-1];}
// for(int i=0; i < truefalse.length;i++){
  //      System.out.println(truefalse[i] + " ");
//}

///
        boolean[] bools = new boolean[6];

        for (int i = 1; i < bools.length; i++) {
            bools[i] = !bools[i - 1];
        }

        for (int i = 0; i < bools.length; i++) {
            System.out.print(bools[i] + " ");
        }
    }


}
