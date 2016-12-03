package com;

public class MyControllerTest {

//    @Test
//    public  void shouldMain() {
//
//        List<Integer> custLocation = Arrays.asList(32, 32, 4,3, 2, 5, 6,7,7, 8, 8, 8, 8,1, 0, 4, 3);
//
//        List<Integer> temp = Arrays.asList(0,0,0,0,0);
//        int k =5;
//        int tempo;
//        Integer max = custLocation.get(0);
//        for (int i=1; i<k; i++){
//            if(max < custLocation.get(i)){
//                temp.set(i - 1, max);
//                max = custLocation.get(i);
//
//            }
//            else
//                temp.set(i - 1, custLocation.get(i));
//        }
//
//        temp.set(k-1, max);
//
//        for(int i = k; i<custLocation.size(); i++){
//            if(custLocation.get(i) < temp.get(k-1)){
//                temp.set(k-1, custLocation.get(i));
//                for(int j= k-1; j> 0 ; j--){
//                    if(temp.get(k-1) < temp.get(j - 1)){
//                        tempo = temp.get(k-1);
//                        temp.set(k-1, temp.get(j - 1));
//                        temp.set(j - 1, tempo);
//                    }
//                }
//            }
//        }
//
//        System.out.println(temp);
//
//    }
//
//    @Test
//    public void anothermain() throws IOException {
//
//        List<Integer> list= Arrays.asList(0,1,2, 3,4, 5, 6, 7, 70);
//        int key=8;
//        int Arraysize = list.size();
//        int pivot = Arraysize /2;
//        int first = list.get(0);
//        int last = list.get(Arraysize - 1);
//        int ceil=0;
//        int floor=0;
//        while(first<= last)
//        {
//            if(list.get(pivot) ==   key){
//                ceil =key;
//                floor = key;
//                System.out.println(ceil);
//                System.out.println(floor);
//                exit(0);
//            }
//            if(list.get(pivot) < key)
//                first = list.get(pivot+1);
//            else
//                last = list.get(pivot-1);
//
//            pivot =(list.indexOf(first)+list.indexOf(last))/2;
//        }
//
//        if(ceil != key){
//            ceil = first;
//            floor = last;
//        }
//
//        System.out.println(ceil);
//        System.out.println(floor);
//    }
//
//    @Test
//    public void anothermain1() {
//        Scanner scanner = new Scanner(System.in);
//        String numberOfTC = scanner.nextLine();
//        int tc = Integer.parseInt(numberOfTC);
//        List<Integer> count = Arrays.asList(new Integer[tc]);
//        for(int j=0; j<tc ; j++){
//            int key=0;
//            List<Integer> list;
//            String listSize = scanner.next();
//            int size = Integer.parseInt(listSize);
//            String keyToSearch = scanner.next();
//            key = Integer.parseInt(keyToSearch);
//            list= new ArrayList<Integer>();
//            for(int i = 0; i< size; i++){
//                String listValues = scanner.next();
//                list.add(Integer.parseInt(listValues));
//            }
//            int arraySize = list.size();
//            int pivot = arraySize /2;
//            int first = 0;
//            int last = arraySize-1;
//            count.set(j, -1);
//            while(first<=last)
//            {
//                if(list.get(pivot) ==  key){
//                    Integer integer = 0;
//                    for(int i=first; i<=last; i++)
//                    {
//                        if(list.get(i)== key){
//                            integer++;
//                            count.set(j, integer);
//                        }
//                    }
//                    break;
//                }
//                if(list.get(pivot) < key)
//                    first = pivot+1;
//                else
//                    last = pivot-1;
//
//                pivot =(first+last)/2;
//            }
//        }
//
//        for (int i : count) {
//            System.out.println(i);
//        }
//    }
//
//    @Test
//    public void another() throws IOException {
//        FileReader file = new FileReader("/Users/apurvagu/Projects/myapp/src/test/java/xyz.txt");
//        BufferedReader bufferedReader = new BufferedReader(file);
//        String s = bufferedReader.readLine();
//        int count = 0;
//        while(s!= null) {
//            String[] split = s.split("\\s+");
//            count +=  split.length;
//            s = bufferedReader.readLine();
//        }
//        System.out.println(count);
//    }
}
