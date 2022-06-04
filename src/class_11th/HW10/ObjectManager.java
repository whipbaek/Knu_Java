package class_11th.HW10;

import java.io.*;
import java.util.ArrayList;

/**
 * 1. 파일을 읽어서 합친다.
 * 2. 줄마다 데이터를 읽어서, 콤마를 기준으로 파싱하고 데이터를 Ticket 객체의 프로퍼티에 저장한다. ( ArrayList<Ticket> 으로 만들어 객체를 추가 )
 * 3. List 에 속해있는 객체들을 total price 기준으로 내림차순 한다.
 * 4. Serialization 후 object.dat 으로 저장하고, deSerialization 을 통하여 객체로 다시 read 한다.
 * 5. 가격순으로 내림차순 하여 출력한다.
 * 6. fare 타입에 따른 사람 수를 출력한다, total people 마지막에 출력한다.
 */



public class ObjectManager {
    private int numOfAdults = 0;
    private int numOfStudents = 0;
    private int numOfChildren = 0;
    private int total = 0;

    private int highestTicket = 0;
    private int cheapestTicket = 0;

    public ObjectManager() {
    }

    public ObjectManager(String destinationFile, String fileToMerge) throws IOException {

        //문자열 읽어오는 스트림 열기
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jibae\\Java_Programming\\src\\class_11th\\HW10\\"+fileToMerge));
        //문자열 출력 버퍼스트림
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\jibae\\Java_Programming\\src\\class_11th\\HW10\\"+destinationFile,true));

        String c;

        //한줄씩 읽기
        while((c=br.readLine())!=null) {
            bw.write(c + "\r\n");
            bw.flush(); //플러쉬로 버퍼를 비운다.
        }

        br.close();
        bw.close();

    }

    public void fileIOAndObjectSerialization(String destinationFile, String binaryFile) throws IOException {

        String c;

        ArrayList<Ticket> tickets = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\jibae\\Java_Programming\\src\\class_11th\\HW10\\"+destinationFile));
        while((c=reader.readLine())!=null) {
            String[] split = c.split(",");
            Ticket ticket = new Ticket(split[0], split[1], split[2], split[3], Integer.parseInt(split[4]), Integer.parseInt(split[5]));
            tickets.add(ticket);
        }

        tickets.sort(new PriceComparator());


        String fullPath = "C:\\Users\\jibae\\Java_Programming\\src\\class_11th\\HW10\\"+binaryFile;
        ObjectManager ojm = new ObjectManager();
        ojm.saveObject(fullPath,tickets); // 직렬화
        ArrayList<Ticket> deTickets = ojm.loadObject(fullPath);

        System.out.println("------------ after Serialization, deSerialization ---------");
        System.out.println();
        for (Ticket deTicket : deTickets) {
            switch (deTicket.getFare()){
                case "Adult" :
                    numOfAdults++;
                    break;
                case "Student" :
                    numOfStudents++;
                    break;
                case "Child" :
                    numOfChildren++;
                    break;
            }
            System.out.println(deTicket);
            System.out.println();
        }

        System.out.println();
        System.out.println("-------------");
        System.out.println();

        System.out.println("Highest ticket price : " + deTickets.get(0).getName() + " - ₩" + deTickets.get(0).getPrice());
        System.out.println("Cheapest ticket price : " + deTickets.get(deTickets.size()-1).getName() + " - ₩" + deTickets.get(deTickets.size()-1).getPrice());

        System.out.println("Number of Adults : " + numOfAdults + " adults" );
        System.out.println("Number of Students : " + numOfStudents + " students" );
        System.out.println("Number of Children : " + numOfChildren + " children");
        total = numOfAdults + numOfStudents + numOfChildren;
        System.out.println("Total : " + total + " people");
    }

    public void saveObject(String fullPath, ArrayList<Ticket> tickets) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fullPath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(tickets);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public ArrayList<Ticket> loadObject(String fullPath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(fullPath);
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            ArrayList<Ticket> tickets = (ArrayList<Ticket>)obj;
            return tickets;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (fis != null) {
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public int getNumOfAdults() {
        return numOfAdults;
    }

    public void setNumOfAdults(int numOfAdults) {
        this.numOfAdults = numOfAdults;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHighestTicket() {
        return highestTicket;
    }

    public void setHighestTicket(int highestTicket) {
        this.highestTicket = highestTicket;
    }

    public int getCheapestTicket() {
        return cheapestTicket;
    }

    public void setCheapestTicket(int cheapestTicket) {
        this.cheapestTicket = cheapestTicket;
    }
}
