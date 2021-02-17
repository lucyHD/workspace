package fundamentals4.challenges;

import jdk.swing.interop.SwingInterOpUtils;

public class TeaParty {

    public static void main(String[] args) {


        int teaResult = teaParty(6, 8);
        System.out.println(teaResult);

    }

    private static int teaParty(int tea, int candy) {

        int partyResult = 0;
//
//        if ((tea < 5) || (candy < 5)) {
//            partyResult = 0;
        //don't actually need this first if as will be 0 anyway if none of the other statements are true
        if ((tea >= 5) && (candy >= 5)) {
            partyResult = 1;
            if ((tea >= candy * 2) || (candy >= tea * 2))
                partyResult = 2;
        } //has to be nested if because the inner if depends on the first if being true
        return partyResult;

    }}

//        int partyResult = 0;
//
//        if ((tea < 5) || (candy < 5)) {
//            return partyResult;
//        } if ((tea >= candy * 2) || (candy >= tea * 2)) {
//            return partyResult + 2;
//        } if ((tea >= 5) && (candy >= 5)) {
//            return partyResult + 1;
//        } else
//            return 10;
//
//    }





//
//tea and candy are equal or greater than 5 the party isg good!
//if tea is x2 candy then party is great
