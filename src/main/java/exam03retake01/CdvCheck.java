package exam03retake01;

public class CdvCheck {


    public boolean check(String cdv) {
        StringBuilder sb = new StringBuilder();
        int mass = 0;
        for (int i=0;i <9; i++){
            int sum = Integer.parseInt(cdv.valueOf(i);
            mass = sum * i;

        if (mass == Integer.parseInt(cdv.valueOf(9))){
            return true;
        }

        }
    return false;
    }
}

