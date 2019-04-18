import java.util.*;



public class CalendarDates {

    private static String month, day, year, hour, minute;

    private static String prov;

    private static int start;

    private static int stop;

    private static Scanner scanner =new Scanner(System.in);

    private static  Calendar calendar = Calendar.getInstance();

    private static Calendar calenderTwo = new GregorianCalendar();



    public static void main(String[] args) {

        calenderTwo.set(2019, Calendar.JANUARY, 1);

        calendar.set(2019, 0, 1);

        System.out.println("Enter a date in the format of, yyyy,mm,dd");

        parseDate(scanner.next().split(","));

        System.out.println("Enter a time in the format of, hh,mm");

        parseTimr(scanner.next().split(","));

        quarter(String.valueOf(Integer.parseInt(month)));

        System.out.println("Enter a starting week between 1 and 52");

        start = scanner.nextInt();

        System.out.println("Enter an end week from 1 to 52");

        stop = scanner.nextInt();

        while(start >= stop){

            System.out.println("Enter an end week from 1 to 52");

            stop = scanner.nextInt();

        }

        System.out.println("Enter a province: AB, BC, MB, NL. NB, NS, NT, NU, ON, PE, QC, SK, YU");

        prov = scanner.next();

        while(!prov.equals("AB") && !prov.equals("BC") && !prov.equals("MB") && !prov.equals("NL") && !prov.equals("NB") && !prov.equals("NS")

                && !prov.equals("NT") && !prov.equals("NU") && !prov.equals("ON") && !prov.equals("PE") && !prov.equals("QC") && !prov.equals("SK") && !prov.equals("YU")

        ) {

            System.out.println("Enter a province: AB, BC, MB, NL. NB, NS, NT, NU, ON, PE, QC, SK, YU");

            prov = scanner.next();

        }

        holiday(start, stop, prov);

    }



    private static void parseDate(String[] date) {

        if (date[0].length() == 4 && Double.parseDouble(date[1]) > 0 && Double.parseDouble(date[1]) < 13 &&

                Double.parseDouble(date[2]) > 0 && Double.parseDouble(date[2]) < 32){

            year = date[0];

            month = date[1];

            day = date[2];

        } else {

            System.out.println("Incorrect format try again");

            parseDate(scanner.next().split(","));

        }

    }



    private static void parseTimr(String[] time) {

        if (Double.parseDouble(time[0]) > 0 && Double.parseDouble(time[0]) <= 24 &&

                Double.parseDouble(time[1]) >= 0 && Double.parseDouble(time[1]) <= 60){

            hour = time[0];

            minute = time[1];

        } else {

            System.out.println("Incorrect format try again");

            parseTimr(scanner.next().split(","));

        }

    }



    private static void quarter(String month) {

        if (Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 3){

            ArrayList<String> fridays = new ArrayList<>();

            ArrayList<Integer> mondays = new ArrayList<>();

            System.out.println("First day of Quarter: JAN 01");

            System.out.println("Last day of Quarter: MAR 31");

            calendar.set(Integer.parseInt(year), Calendar.JANUARY, 1);

            System.out.println("First day of JAN: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of JAN: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.JANUARY, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI JAN 0" + d);

                    } else {

                        fridays.add("FRI JAN " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.JANUARY, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of JAN: " + Collections.min(mondays));

            System.out.println("Last monday of JAN: " + Collections.max(mondays));

            mondays.clear();



            calendar.set(Integer.parseInt(year), Calendar.FEBRUARY, 1);

            System.out.println("First day of FEB: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of FEB: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.FEBRUARY, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI FEB 0" + d);

                    } else {

                        fridays.add("FRI FEB " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.FEBRUARY, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of FEB: " + Collections.min(mondays));

            System.out.println("Last monday of FEB: " + Collections.max(mondays));

            mondays.clear();



            calendar.set(Integer.parseInt(year), Calendar.MARCH, 1);

            System.out.println("First day of MAR: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of MAR: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.MARCH, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI MAR 0" + d);

                    } else {

                        fridays.add("FRI MAR " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.MARCH, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek == 2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of MAR: " + Collections.min(mondays));

            System.out.println("Last monday of MAR: " + Collections.max(mondays));

            mondays.clear();



            System.out.println("Fridays in the quarter:");

            for (String friday : fridays) {

                System.out.println(friday);

            }

            System.out.println("Paydays: ");

            for (int i = 1; i < 13; i++) {

                int temp;

                calendar.set(Integer.parseInt(year), i, 15);

                temp = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

                if (calendar.get(Calendar.DAY_OF_WEEK) == 1){

                    System.out.println("2019," + i + "13");

                } else if (calendar.get(Calendar.DAY_OF_WEEK) == 7){

                    System.out.println("2019," + i + "14");

                }

                calendar.set(Integer.parseInt(year), i, 30);

                if (calendar.get(Calendar.DAY_OF_WEEK) == 1){

                    System.out.println("2019," + i + "28");

                } else if (calendar.get(Calendar.DAY_OF_WEEK) == 7){

                    System.out.println("2019," + i + "29");

                }

            }

        }



        if (Integer.parseInt(month) >= 4 && Integer.parseInt(month) <= 6){

            ArrayList<String> fridays = new ArrayList<>();

            ArrayList<Integer> mondays = new ArrayList<>();

            System.out.println("First day of Quarter: APR 01");

            System.out.println("Last day of Quarter: JUN 30");

            calendar.set(Integer.parseInt(year), Calendar.APRIL, 1);

            System.out.println("First day of APR: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of APR: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.APRIL, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI APR 0" + d);

                    } else {

                        fridays.add("FRI APR " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.APRIL, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of APR: " + Collections.min(mondays));

            System.out.println("Last monday of APR: " + Collections.max(mondays));

            mondays.clear();



            calendar.set(Integer.parseInt(year), Calendar.MAY, 1);

            System.out.println("First day of FEB: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of FEB: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.MAY, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI FEB 0" + d);

                    } else {

                        fridays.add("FRI FEB " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.MAY, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of FEB: " + Collections.min(mondays));

            System.out.println("Last monday of FEB: " + Collections.max(mondays));

            mondays.clear();



            calendar.set(Integer.parseInt(year), Calendar.JUNE, 1);

            System.out.println("First day of JUN: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of JUN: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.JUNE, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI JUN 0" + d);

                    } else {

                        fridays.add("FRI JUN " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.JUNE, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek == 2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of JUN: " + Collections.min(mondays));

            System.out.println("Last monday of JUN: " + Collections.max(mondays));

            mondays.clear();



            System.out.println("Fridays in the quarter:");

            for (String friday : fridays) {

                System.out.println(friday);

            }

            System.out.println("Paydays: ");

            for (int i = 1; i < 13; i++) {

                int temp;

                calendar.set(Integer.parseInt(year), i, 15);

                temp = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

                if (calendar.get(Calendar.DAY_OF_WEEK) == 1){

                    System.out.println("2019," + i + "13");

                } else if (calendar.get(Calendar.DAY_OF_WEEK) == 7){

                    System.out.println("2019," + i + "14");

                }

                calendar.set(Integer.parseInt(year), i, 30);

                if (calendar.get(Calendar.DAY_OF_WEEK) == 1){

                    System.out.println("2019," + i + "28");

                } else if (calendar.get(Calendar.DAY_OF_WEEK) == 7){

                    System.out.println("2019," + i + "29");

                }

            }

        }



        if (Integer.parseInt(month) >= 7 && Integer.parseInt(month) <= 9){

            ArrayList<String> fridays = new ArrayList<>();

            ArrayList<Integer> mondays = new ArrayList<>();

            System.out.println("First day of Quarter: JUL 01");

            System.out.println("Last day of Quarter: SEP 30");

            calendar.set(Integer.parseInt(year), Calendar.JULY, 1);

            System.out.println("First day of JUL: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of JUL: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.JULY, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI JUL 0" + d);

                    } else {

                        fridays.add("FRI JUL " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.JULY, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of JUL: " + Collections.min(mondays));

            System.out.println("Last monday of JUL: " + Collections.max(mondays));

            mondays.clear();



            calendar.set(Integer.parseInt(year), Calendar.AUGUST, 1);

            System.out.println("First day of AUG: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of AUG: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.AUGUST, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI AUG 0" + d);

                    } else {

                        fridays.add("FRI AUG " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.AUGUST, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of AUG: " + Collections.min(mondays));

            System.out.println("Last monday of AUG: " + Collections.max(mondays));

            mondays.clear();



            calendar.set(Integer.parseInt(year), Calendar.SEPTEMBER, 1);

            System.out.println("First day of SEP: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of SEP: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.SEPTEMBER, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI SEP 0" + d);

                    } else {

                        fridays.add("FRI SEP " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.SEPTEMBER, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek == 2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of SEP: " + Collections.min(mondays));

            System.out.println("Last monday of SEP: " + Collections.max(mondays));

            mondays.clear();



            System.out.println("Fridays in the quarter:");

            for (String friday : fridays) {

                System.out.println(friday);

            }

            System.out.println("Paydays: ");

            for (int i = 1; i < 13; i++) {

                int temp;

                calendar.set(Integer.parseInt(year), i, 15);

                temp = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

                if (calendar.get(Calendar.DAY_OF_WEEK) == 1){

                    System.out.println("2019," + i + "13");

                } else if (calendar.get(Calendar.DAY_OF_WEEK) == 7){

                    System.out.println("2019," + i + "14");

                }

                calendar.set(Integer.parseInt(year), i, 30);

                if (calendar.get(Calendar.DAY_OF_WEEK) == 1){

                    System.out.println("2019," + i + "28");

                } else if (calendar.get(Calendar.DAY_OF_WEEK) == 7){

                    System.out.println("2019," + i + "29");

                }

            }

        }



        if (Integer.parseInt(month) >= 10 && Integer.parseInt(month) <= 12){

            ArrayList<String> fridays = new ArrayList<>();

            ArrayList<Integer> mondays = new ArrayList<>();

            System.out.println("First day of Quarter: OCT 01");

            System.out.println("Last day of Quarter: DEC 31");

            calendar.set(Integer.parseInt(year), Calendar.OCTOBER, 1);

            System.out.println("First day of OCT: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of OCT: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.OCTOBER, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI OCT 0" + d);

                    } else {

                        fridays.add("FRI OCT " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.OCTOBER, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of OCT: " + Collections.min(mondays));

            System.out.println("Last monday of OCT: " + Collections.max(mondays));

            mondays.clear();



            calendar.set(Integer.parseInt(year), Calendar.NOVEMBER, 1);

            System.out.println("First day of NOV: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of NOV: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.NOVEMBER, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI NOV 0" + d);

                    } else {

                        fridays.add("FRI NOV " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.NOVEMBER, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of NOV: " + Collections.min(mondays));

            System.out.println("Last monday of NOV: " + Collections.max(mondays));

            mondays.clear();



            calendar.set(Integer.parseInt(year), Calendar.DECEMBER, 1);

            System.out.println("First day of DEC: " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            System.out.println("First day of DEC: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.DECEMBER, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==6) {

                    if (d < 10){

                        fridays.add("FRI DEC 0" + d);

                    } else {

                        fridays.add("FRI DEC " + d);

                    }

                }

            }

            for (int d = 1;  d <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  d++) {

                calendar.set(Integer.parseInt(year), Calendar.DECEMBER, d);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek == 2) {

                    mondays.add(d);

                }

            }

            System.out.println("First Monday of DEC: " + Collections.min(mondays));

            System.out.println("Last monday of DEC: " + Collections.max(mondays));

            mondays.clear();



            System.out.println("Fridays in the quarter:");

            for (String friday : fridays) {

                System.out.println(friday);

            }

            System.out.println("Paydays: ");

            for (int i = 1; i < 13; i++) {

                int temp;

                calendar.set(Integer.parseInt(year), i, 15);

                temp = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

                if (calendar.get(Calendar.DAY_OF_WEEK) == 1){

                    System.out.println("2019," + i + "13");

                } else if (calendar.get(Calendar.DAY_OF_WEEK) == 7){

                    System.out.println("2019," + i + "14");

                }

                calendar.set(Integer.parseInt(year), i, 30);

                if (calendar.get(Calendar.DAY_OF_WEEK) == 1){

                    System.out.println("2019," + i + "28");

                } else if (calendar.get(Calendar.DAY_OF_WEEK) == 7){

                    System.out.println("2019," + i + "29");

                }

            }

        }

    }



    private static void holiday(int start, int stop, String prov) {

        String[] canada = new String[365];

        String[] AB = new String[365];

        String[] BC = new String[365];

        String[] MB = new String[365];

        String[] NL = new String[365];

        String[] NB = new String[365];

        String[] NS = new String[365];

        String[] NT = new String[365];

        String[] NU = new String[365];

        String[] ON = new String[365];

        String[] PE = new String[365];

        String[] QC = new String[365];

        String[] SK = new String[365];

        String[] YU = new String[365];

        canada[1] = "New Year's Day";

        PE[49] = "Islander's Day";

        BC[42] = "Family Day";

        AB[49] = "Family Day";

        SK[49] = "Family Day";

        ON[49] = "Family Day";

        NB[49] = "Family Day";

        MB[49] = "Louis Riel Day";

        NL[76] = "St. Patrick's Day";

        AB[109] = "Good Friday";

        BC[109] = "Good Friday";

        MB[109] = "Good Friday";

        NL[109] = "Good Friday";

        NB[109] = "Good Friday";

        NS[109] = "Good Friday";

        NT[109] = "Good Friday";

        NU[109] = "Good Friday";

        ON[109] = "Good Friday";

        PE[109] = "Good Friday";

        SK [109] = "Good Friday";

        YU[109] = "Good Friday";

        QC[112] = "Easter Monday";

        NL[113] = "St. George's Day";

        AB[140] = "Victoria Day";

        BC[140] = "Victoria Day";

        MB[140] = "Victoria Day";

        NT[140] = "Victoria Day";

        NU[140] = "Victoria Day";

        ON[140] = "Victoria Day";

        SK[140] = "Victoria Day";

        YU[140] = "Victoria Day";

        QC[140] = "Victoria Day";

        NT[172] = "National Aboriginal Day";

        QC[175] = "Féte Nationale";

        NL[175] = "Discovery Day";

        canada[182] = "Canada Day";

        NT[190] = "Nunavut Day";

        AB[216] = "Civic Holiday";

        BC[216] = "Civic Holiday";

        SK[216] = "Civic Holiday";

        ON[216] = "Civic Holiday";

        NB[216] = "Civic Holiday";

        NU[216] = "Civic Holiday";

        canada[245] = "Labour Day";

        AB[287] = "Thanksgiving";

        BC[287] = "Thanksgiving";

        MB[287] = "Thanksgiving";

        NT[287] = "Thanksgiving";

        NU[287] = "Thanksgiving";

        ON[287] = "Thanksgiving";

        SK [287] = "Thanksgiving";

        YU[287] = "Thanksgiving";

        QC[287] = "Thanksgiving";

        AB[315] = "Remembrance Day";

        BC[315] = "Remembrance Day";

        MB[315] = "Remembrance Day";

        NB[315] = "Remembrance Day";

        NT[315] = "Remembrance Day";

        NU[315] = "Remembrance Day";

        PE[315] =  "Remembrance Day";

        SK [315] =  "Remembrance Day";

        YU[315] = "Remembrance Day";

        canada[359] = "Christmas Day";

        ON[360] = "Boxing Day";



        for (int i = start * 7 - 6; i <= stop * 7; i++) {

            if (canada[i] != null){

                calenderTwo.set(2019, Calendar.JANUARY, i);

                System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + canada[i]);

            }

            switch (prov){

                case "AB":

                    if (AB[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + AB[i]);

                    }

                    break;

                case "BC":

                    if (BC[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + BC[i]);

                    }

                    break;

                case "MB":

                    if (MB[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + MB[i]);

                    }

                    break;

                case "NL":

                    if (NL[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + NL[i]);

                    }

                    break;

                case "NB":

                    if (NB[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + NB[i]);

                    }

                    break;

                case "NS":

                    if (NS[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + NS[i]);

                    }

                    break;

                case "NT":

                    if (NT[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + NT[i]);

                    }

                    break;

                case "NU":

                    if (NU[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + NU[i]);

                    }

                    break;

                case "ON":

                    if (ON[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + ON[i]);

                    }

                    break;

                case "PE":

                    if (PE[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + PE[i]);

                    }

                    break;

                case "QC":

                    if (QC[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + QC[i]);

                    }

                    break;

                case "SK":

                    if (SK[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + SK[i]);

                    }

                    break;

                case "YU":

                    if (YU[i] != null){

                        calenderTwo.set(2019, Calendar.JANUARY, i);

                        System.out.println(calenderTwo.get(Calendar.MONTH) + "/" + calenderTwo.get(Calendar.DAY_OF_MONTH) + "/2019: " + YU[i]);

                    }

                    break;

            }

        }

    }

}