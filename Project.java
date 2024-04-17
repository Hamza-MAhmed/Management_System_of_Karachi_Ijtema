package MSofKI;

import java.util.ArrayList;
import java.util.Scanner;
class details {
    int[] town;
    ArrayList<String> Masjids = new ArrayList<>();
    ArrayList<Integer> Pole_no = new ArrayList<Integer>();
    int no = 1;
    ArrayList<Integer> no_of_attendies = new ArrayList<Integer>();
    ArrayList<Integer> no_of_Fastian = new ArrayList<Integer>();
    ArrayList<Integer> Fastian_attendies = new ArrayList<Integer>();
    static long total_attendies = 0 , total_Fastians = 0;
    ArrayList<Integer> input_towns = new ArrayList<Integer>();
    ArrayList<String> entering_Fastian = new ArrayList<>();
    ArrayList<ArrayList<String>> name_of_Fastian = new ArrayList<ArrayList<String>>();

}
class necessities{
    int rasta;
}
class FASTIANS{
    int qty;
}

public class Project {
    static void details() {
        System.out.println("1. Landhi       2. Korangi      3. Qaidabad     4. F.B. Area        5. Model Colony     6. Malir\n" +
                "7. ShahFaisal Colony       8. Jamshed Road     9. North Karachi        10. Burns Road      11. PIB Colony      12. Khadda Market\n" +
                "13. Kemari     14. Sarafa Bazaar       15. Jahangir Road       16. Orangi Town     17. Dehli Colony        18. Shershah\n" +
                "19. Balooch Colony     20. Nishtar Road        21. Sultanabad      22. Mehmoodabaad        23. Gulshan-e-Bahaar        24. Frontier Colony\n" +
                "25. New Karachi        26. Baldia      27. Nazimabaad      28. North Nazimabaad        29. Gulshan-e-Iqbaal        30. Hasan Square\n" +
                "31. Johar Moor     32. Mosmyaat        33. Defence     34. Clifton     35. Lyaari      36. Limarket\n" +
                "37. Hub Chowki     38. Ittehaad Town       39. Manghopeer      40. Gulshan-e-Hadeed        41. Maripoor        42. Sohraab Goth\n" +
                "43. Sabzi Mandi        44. Shadmaan Town       45. Gulshan-e-Memaar        46. Ehsanabaad     47. Lyaqtabaad");
    }

    public static void main(String[] ags) {
        Scanner s = new Scanner(System.in);
        details[][] gates_rasta = new details[10][2];
        gates_rasta[0][0] = new details();
        gates_rasta[0][0].town = new int[]{1, 2, 3}; //l,k q
        gates_rasta[0][1] = new details();
        gates_rasta[0][1].town = new int[]{4, 5, 6}; //fb,model,malir
        gates_rasta[1][0] = new details();
        gates_rasta[1][0].town = new int[]{7, 8}; // shahfaisal , jamshed
        gates_rasta[1][1] = new details();
        gates_rasta[1][1].town = new int[]{9, 10, 11}; //north k , burns, pib
        gates_rasta[2][0] = new details();
        gates_rasta[2][0].town = new int[]{12, 13, 14}; //khada ,kenari,sarafa
        gates_rasta[2][1] = new details();
        gates_rasta[2][1].town = new int[]{15, 16}; //jahangir orangi
        gates_rasta[3][0] = new details();
        gates_rasta[3][0].town = new int[]{17, 18, 19}; //dehli coclony shershah baloch col
        gates_rasta[3][1] = new details();
        gates_rasta[3][1].town = new int[]{20, 21, 22}; //nishtar sultanabad mehmodabad
        gates_rasta[4][0] = new details();
        gates_rasta[4][0].town = new int[]{23, 24}; // gulshan bahar , frontier col
        gates_rasta[4][1] = new details();
        gates_rasta[4][1].town = new int[]{25, 26};//new karachi , baldia
        gates_rasta[5][0] = new details();
        gates_rasta[5][0].town = new int[]{27, 28}; //nazima, north naz
        gates_rasta[5][1] = new details();
        gates_rasta[5][1].town = new int[]{29, 30}; //gulsahniqbal/nepa , hasan
        gates_rasta[6][0] = new details();
        gates_rasta[6][0].town = new int[]{31, 32}; // joharmor , mosmyat south/north
        gates_rasta[6][1] = new details();
        gates_rasta[6][1].town = new int[]{33, 34};//def , clif
        gates_rasta[7][0] = new details();
        gates_rasta[7][0].town = new int[]{35, 36}; //lyari,limarket
        gates_rasta[7][1] = new details();
        gates_rasta[7][1].town = new int[]{37, 38}; //hub choki , itehad town
        gates_rasta[8][0] = new details();
        gates_rasta[8][0].town = new int[]{39, 40}; //manghopeer  , gulshanehadeed
        gates_rasta[8][1] = new details();
        gates_rasta[8][1].town = new int[]{41, 42}; //maripor , sohrab
        gates_rasta[9][0] = new details();
        gates_rasta[9][0].town = new int[]{43, 44}; //sabzi mandi,shadman
        gates_rasta[9][1] = new details();
        gates_rasta[9][1].town = new int[]{45, 46, 47}; //gulshanmemar , ehsanabad

        int choice = 1, i, j = 0 , pn=0;

        while (choice != 5) {
            int temp = 0;
            System.out.println("\n****************Welcome To Karachi Ijtame****************\nIntroduce yourself\n 1. Leader of any Masjid\n 2. Any People\n 3. Leader of FAST\n 4. Hazraat\n(Enter 5 for exit)");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("What do you want\n 1. Register the Masjid for getting the sitting place\n 2. Update total no of people\n"); //3. Update details of FASTIANS");
                    int val = s.nextInt();
                    if (val == 1) {
                        System.out.println("Select your Town");
                        details();
                        int t = s.nextInt();
                        for (i = 0; i < 10; i++) {
                            for (j = 0; j < 2; j++) {
                                for (int k = 0; k < gates_rasta[i][j].town.length; k++) {
                                    if (t == gates_rasta[i][j].town[k]) {
                                        gates_rasta[i][j].input_towns.add(t);
                                        System.out.println("Tell the name of Masjid");
                                        String masjid = s.next();
                                        String m = masjid.toLowerCase();
                                        gates_rasta[i][j].Masjids.add(m);
                                        int noo = gates_rasta[i][j].no;
                                        gates_rasta[i][j].Pole_no.add(noo);
                                        System.out.println("Please Note that the Sitting Place of your Masjid is at Pole no " + gates_rasta[i][j].Pole_no.get(gates_rasta[i][j].no - 1) + "/" + gates_rasta[i][j].town[k]);

                                        gates_rasta[i][j].no++;
                                        if (i < 5) {
                                            temp = j + i + i + 1;
                                        } else {
                                            temp = j + i + i + 1 - 10;
                                        }
                                        System.out.println("It is near to the Gate No " + (i + 1) + " and at Rasta No " + temp);
                                        pn = temp;
                                        break;
                                    }
                                }
                                if (temp > 0)
                                    break;
                            }
                            if (temp > 0)
                                break;
                        }
                        System.out.println("Tell the total no of people coming with you");
                        gates_rasta[i][j].no_of_attendies.add(s.nextInt());
                        details.total_attendies += gates_rasta[i][j].no_of_attendies.get(gates_rasta[i][j].no_of_attendies.size() - 1);
                        System.out.println("Tell the number of FASTIANS who live in your town");
                        gates_rasta[i][j].no_of_Fastian.add(s.nextInt());
                        System.out.println("Now tell the number of FASTIANS who come with you in Ijtema");
                        int f_attendies = s.nextInt();
                        gates_rasta[i][j].Fastian_attendies.add(f_attendies);
                        details.total_Fastians += gates_rasta[i][j].Fastian_attendies.get(gates_rasta[i][j].Fastian_attendies.size() - 1);
                        System.out.println("Please Enter their Names");
                        for (int a=0 ; a<f_attendies ; a++) {
                            gates_rasta[i][j].entering_Fastian.add(s.next());
                        }
                        gates_rasta[i][j].name_of_Fastian.add(gates_rasta[i][j].entering_Fastian);

                    } else if (val == 2) {
                        System.out.println("Select your Town");
                        details();
                        int t = s.nextInt();
                        for (i = 0; i < 10; i++) {
                            for (j = 0; j < 2; j++) {
                                for (int k = 0; k < gates_rasta[i][j].town.length; k++) {
                                    if (t == gates_rasta[i][j].town[k]) {
                                        System.out.println("Tell the name of Masjid");
                                        String m = s.next();
                                        String masjid = m.toLowerCase();
                                        if (gates_rasta[i][j].Masjids.contains(masjid)) {
                                            for (int l = 0; l < gates_rasta[i][j].Masjids.size(); l++) {
                                                if (masjid.equals(gates_rasta[i][j].Masjids.get(l))) {
                                                    if (t == gates_rasta[i][j].input_towns.get(l)) {
                                                        System.out.println("Tell the no of new comers");
                                                        int n_after = s.nextInt();
                                                        details.total_attendies += n_after;
                                                        gates_rasta[i][j].no_of_attendies.set(l, gates_rasta[i][j].no_of_attendies.get(l) + n_after);

                                                    } else {
                                                        System.out.println("This Masjid has not been registered yet");
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("This Masjid has not been registered yet");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println(" 1. Wanted to know Masjid place\n 2. Wanted to know necessities area near my Masjid");
                    val = s.nextInt();
                    if (val == 1) {
                        System.out.println("Select your Town");
                        details();
                        int t = s.nextInt();
                        for (i = 0; i < 10; i++) {
                            for (j = 0; j < 2; j++) {
                                for (int k = 0; k < gates_rasta[i][j].town.length; k++) {
                                    if (t == gates_rasta[i][j].town[k]) {
                                        System.out.println("Tell the name of Masjid");
                                        String m = s.next();
                                        String masjid = m.toLowerCase();
                                        if (gates_rasta[i][j].Masjids.contains(masjid)) {
                                            for (int l = 0; l < gates_rasta[i][j].Masjids.size(); l++) {
                                                if (masjid.equals(gates_rasta[i][j].Masjids.get(l))) {
                                                    if (t == gates_rasta[i][j].input_towns.get(l)) {
                                                        System.out.println("Please Note that the Sitting Place of your Masjid is at Pole no " + gates_rasta[i][j].Pole_no.get(l) + "/" + gates_rasta[i][j].town[k]);
                                                        System.out.println("It is near to the Gate No " + (i + 1) + " and at Rasta No " + pn);
                                                    } else {
                                                        System.out.println("This Masjid has not been registered yet");
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("This Masjid has not been registered yet");
                                        }

                                    }
                                }
                            }
                        }

                    } else if (val == 2) {
                        necessities n = new necessities();
                        System.out.println("Sorry for the inconvenience\n    1. You want for Washrooms/Wuzu Khana\n   2. Or want for Canteens");
                        val = s.nextInt();
                        if (val == 1) {
                            System.out.println("At which rasta number your camp is placed");
                            n.rasta = s.nextInt();
                            if (n.rasta == 1 || n.rasta == 4 || n.rasta == 7 || n.rasta == 10) {
                                System.out.println("In front of entrance gate of your rasta there are washrooms and wuzu kanas");
                            } else if (n.rasta == 2 || n.rasta == 5 || n.rasta == 8) {
                                System.out.println("You should move back from the entrance gate of your rasta towards rasta number " + --n.rasta + ". After short walk you see at the right hand washrooms and wuzukhanas");
                            } else if (n.rasta == 3 || n.rasta == 6 || n.rasta == 9) {
                                n.rasta++;
                                System.out.println("You should move forward from the entrance gate of your rasta towards rasta number" + n.rasta + ". After short walk you see at the left hand washrooms and wuzukhanas");
                            }
                            else {
                                System.out.println("It is not a valid input, rasta no's are from 1 to 10");
                            }
                        } else if (val == 2) {
                            System.out.println("At which rasta number your camp is placed");
                            n.rasta = s.nextInt();
                            if (n.rasta == 1 || n.rasta == 2 || n.rasta == 3) {
                                System.out.println("In between the entrance gate of rasta number 2 and 3 there is a canteen");
                            } else if (n.rasta == 4 || n.rasta == 5 || n.rasta == 6) {
                                System.out.println("In between the entrance gate of rasta number 5 and 6 there is a canteen");
                            } else if (n.rasta == 7 || n.rasta == 8 || n.rasta == 9 || n.rasta == 10) {
                                System.out.println("In between the entrance gate of rasta number 8 and 9 there is a canteen");
                            }
                            else {
                                System.out.println("It is not a valid input, rasta no's are from 1 to 10");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("What do you want\n      1. Wanted to know sitting place\n      2. Want to update no of FASTIANS who are with you\n      3. Want to know Details of FASTIANS");
                    val = s.nextInt();
                    FASTIANS fast = new FASTIANS();
                    if (val == 1) {
                        System.out.println("Starting camp of rasta no 6, enter from gate no 7");
                        System.out.println("Tell the no of FASTIANS who are with you");
                        fast.qty = s.nextInt();
                        details.total_Fastians += fast.qty;
                    } else if (val == 2) {
                        System.out.println("Tell the quantity of new comers");
                        details.total_Fastians -= fast.qty;
                        fast.qty += s.nextInt();
                        details.total_Fastians += fast.qty;
                    }
                    else if (val == 3){
                        System.out.println("Which detail you want to found \n 1. Want to see total no FASTIANS \n2. Want to see qty of FAASTIANS with their name of any specific Masjid");
                        val = s.nextInt();
                        if (val == 1){
                            System.out.println("The total no of FASTIANS are: "+details.total_Fastians);
                        }
                        else if (val == 2){
                            System.out.println("Select the town of Masjid");
                            details();
                            int t = s.nextInt();
                            for (i = 0; i < 10; i++) {
                                for (j = 0; j < 2; j++) {
                                    for (int k = 0; k < gates_rasta[i][j].town.length; k++) {
                                        if (t == gates_rasta[i][j].town[k]) {
                                            System.out.println("Tell the name of Masjid");
                                            String m = s.next();
                                            String masjid = m.toLowerCase();
                                            if (gates_rasta[i][j].Masjids.contains(masjid)) {
                                                for (int l = 0; l < gates_rasta[i][j].Masjids.size(); l++)
                                                    if (masjid.equals(gates_rasta[i][j].Masjids.get(l))) {
                                                        if (t == gates_rasta[i][j].input_towns.get(l)) {
                                                            System.out.println("The no of FASTIANS in this Masjid are: " + gates_rasta[i][j].Fastian_attendies.get(l)); //check
                                                            System.out.println("And their names are: ");
                                                            for (int a=0 ; a<gates_rasta[i][j].Fastian_attendies.get(l) ; a++) {
                                                                System.out.println(gates_rasta[i][j].entering_Fastian.get(l+a));
                                                            }
                                                        } else {
                                                            System.out.println("This Masjid has not been registered yet");
                                                        }
                                                    }
                                            }
                                            else {
                                                System.out.println("This Masjid has not been registered yet");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                    break;
                case 4:
                    System.out.println("What do you want\n      1. Want to know total no of people\n        2. Want to know the no of people of any particular Masjid");
                    val = s.nextInt();
                    if (val == 1) {
                        System.out.println("The total no of people are: "+details.total_attendies);
                    }
                    else if (val == 2){
                        System.out.println("Select the town of Masjid");
                        details();
                        int t = s.nextInt();
                        for (i = 0; i < 10; i++) {
                            for (j = 0; j < 2; j++) {
                                for (int k = 0; k < gates_rasta[i][j].town.length; k++) {
                                    if (t == gates_rasta[i][j].town[k]) {
                                        System.out.println("Tell the name of Masjid");
                                        String m = s.next();
                                        String masjid = m.toLowerCase();
                                        if (gates_rasta[i][j].Masjids.contains(masjid)) {
                                            for (int l = 0; l < gates_rasta[i][j].Masjids.size(); l++)
                                                if (masjid.equals(gates_rasta[i][j].Masjids.get(l))) {
                                                    if (t == gates_rasta[i][j].input_towns.get(l)) {
                                                        System.out.println("The no of people in this Masjid are: " + gates_rasta[i][j].no_of_attendies.get(l));
                                                    } else {
                                                        System.out.println("This Masjid has not been registered yet");
                                                    }
                                                }
                                        }
                                        else {
                                            System.out.println("This Masjid has not been registered yet");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                default:
                    return;
            }
        }
    }
}


