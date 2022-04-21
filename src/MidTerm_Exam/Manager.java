package MidTerm_Exam;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Manager {
    private ArrayList<FullTimeWorker> ftWorkers = null;
    private ArrayList<TemporaryWorker> tempWokers = null;

    public Manager() {
        ftWorkers = new ArrayList<>();
        tempWokers = new ArrayList<>();
    }

    public void loadData() {
        //implement this...
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\jibae\\Java_Programming\\src\\MidTerm_Exam\\workers.txt"));

            while (sc.hasNext()) {
                FullTimeWorker temp = new FullTimeWorker();
                String name = sc.next();
                String department = sc.next();
                int startyear = Integer.parseInt(sc.next());
                int basevacation = Integer.parseInt(sc.next());
                int score = Integer.parseInt(sc.next());

                if (score == -1) { //FullTimeWorker
                    ftWorkers.add(new FullTimeWorker(name, department, startyear, basevacation));
                } else {
                    tempWokers.add(new TemporaryWorker(name, department, startyear, basevacation, score));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public void printAll() {
        //implement this...
        System.out.println("Name     Department          Start Year  " +
                "  Base Vacation     Score           JobStatus   ");
        System.out.println("----------------------------------------------------");
        for (FullTimeWorker ftWorker : ftWorkers) {
            ftWorker.print();
            System.out.print ("             null         ");
            System.out.println("   Fulltime Worker");
        }

        for (TemporaryWorker tempWoker : tempWokers) {
            tempWoker.print();
            System.out.println("             Temporary Worker");
        }
    }

    public String findPosition(String name) {
        String returnStr = "";
        for (FullTimeWorker ftWorker : ftWorkers) {
            if (ftWorker.getName().equals(name)) {
                returnStr = name + " is " + ftWorker.findPosition();
            }
        }

        for (TemporaryWorker tempWoker : tempWokers) {
            if (tempWoker.getName().equals(name)) {
                returnStr = name + " is Temporary Worker!";
            }
        }

        return returnStr;
    }

    public String findVacation(String name) {
        String returnStr = "";

        for (FullTimeWorker ftWorker : ftWorkers) {
            if (ftWorker.getName().equals(name)) {
                returnStr = name + " has " + Integer.toString(ftWorker.calculateVacation())
                + " vacation days";
            }
        }

        for (TemporaryWorker tempWoker : tempWokers) {
            if (tempWoker.getName().equals(name)) {
                returnStr = name + " has " + Integer.toString(tempWoker.getBaseVacation())
                        + " vacation days";
            }
        }

        return returnStr;
    }


    public void updateTemporaryWorker() {
        //implement this...

        ArrayList<String> arrayList = new ArrayList<>();
        for (TemporaryWorker tempWoker : tempWokers) {
            if(tempWoker.isFulltimeWorker()){
                ftWorkers.add(new FullTimeWorker(tempWoker));
                arrayList.add(tempWoker.getName());
                System.out.println(tempWoker.getName() + " bacame a full-time worker!");
            }
        }

            for (String s : arrayList) {
                int cnt=0;
                for(int i=0; i<tempWokers.size(); i++){
                    if(tempWokers.get(i).getName().equals(s)){
                        tempWokers.remove(i);
                        cnt++;
                        break;
                    }
                }
                if(cnt==0) break;
            }

    }

    public void writeWorkers() {
            FileOutputStream fos = null;
            try{
                fos = new FileOutputStream("C:\\Users\\jibae\\Java_Programming\\src\\MidTerm_Exam\\workers.txt");
                String space = " ";
                String linechange = "\n";
                for (FullTimeWorker ftWorker : ftWorkers) {
                    fos.write(ftWorker.getName().getBytes(StandardCharsets.UTF_8));
                    fos.write(space.getBytes(StandardCharsets.UTF_8));

                    fos.write(ftWorker.getDepartment().getBytes(StandardCharsets.UTF_8));
                    fos.write(space.getBytes(StandardCharsets.UTF_8));

                    fos.write(Integer.toString(ftWorker.getStartYear()).getBytes(StandardCharsets.UTF_8));
                    fos.write(space.getBytes(StandardCharsets.UTF_8));

                    fos.write(Integer.toString(ftWorker.getBaseVacation()).getBytes(StandardCharsets.UTF_8));
                    fos.write(space.getBytes(StandardCharsets.UTF_8));

                    fos.write(Integer.toString(-1).getBytes(StandardCharsets.UTF_8));
                    fos.write(space.getBytes(StandardCharsets.UTF_8));

                    fos.write(linechange.getBytes(StandardCharsets.UTF_8));
                    //fos.write(ft);
                }

                for (TemporaryWorker tempWoker : tempWokers) {
                    fos.write(tempWoker.getName().getBytes(StandardCharsets.UTF_8));
                    fos.write(space.getBytes(StandardCharsets.UTF_8));

                    fos.write(tempWoker.getDepartment().getBytes(StandardCharsets.UTF_8));
                    fos.write(space.getBytes(StandardCharsets.UTF_8));

                    fos.write(Integer.toString(tempWoker.getStartYear()).getBytes(StandardCharsets.UTF_8));
                    fos.write(space.getBytes(StandardCharsets.UTF_8));

                    fos.write(Integer.toString(tempWoker.getBaseVacation()).getBytes(StandardCharsets.UTF_8));
                    fos.write(space.getBytes(StandardCharsets.UTF_8));

                    fos.write(Integer.toString(tempWoker.getScore()).getBytes(StandardCharsets.UTF_8));
                    fos.write(space.getBytes(StandardCharsets.UTF_8));

                    fos.write(linechange.getBytes(StandardCharsets.UTF_8));
                    //fos.write(ft);

                    fos.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
