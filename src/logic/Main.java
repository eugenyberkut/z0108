package logic;

import java.util.*;

/**
 * Created by KlauS on 01.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
//        demo6();
//        demo7();
        demo8();
    }

    private void demo8() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Tuzik", 2));
        animals.add(new Animal("Murka", 1));
        animals.add(new Animal("Bobik", 3));
        animals.add(new Animal("Bobik", 1));
        System.out.println(animals);
        Collections.sort(animals);
        System.out.println(animals);
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(animals);
        Collections.sort(animals,
                Comparator.comparing(Animal::getName).reversed()
                        .thenComparing(Animal::getAge));
        System.out.println(animals);
    }

    private void demo7() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        Collections.shuffle(numbers, new Random(1234));
        System.out.println(numbers);
//        Collections.sort(numbers, new MyComparator());
//        System.out.println(numbers);
        Collections.sort(numbers, (o1, o2) -> {
            if (o1>o2) return -1;
            if (o1<o2) return 1;
            return 0;
        });
    }

    private void demo6() {
        TreeSet<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(1,5,6,8,2,3,4,0));
        for (Integer number : set) {
            System.out.println(number);
        }
    }

    private void demo5() {
        String text = "Hello world world another day time time word";
        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<words.length; i++) {
            Integer count = map.get(words[i]);
            if (count == null) count = 0;
            map.put(words[i], count+1);
        }
        System.out.println(map);
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.println(element.getKey() + " : " + element.getValue());
        }
    }

    private void demo4() {
        Queue<String> strings = new LinkedList<>();
        strings.offer("123");
        strings.offer("234");
        strings.offer("345");

        while (!strings.isEmpty()) {
            System.out.println(strings.poll());
        }
    }

    private void demo3() {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 4, 1, 2, 4, 5, 6, 7, 9, 0));
        System.out.println(list);
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);
//        for (int i=0; i<list.size(); i++){
//            if (list.get(i)%2!=0) {
//                list.remove(i);
//            }
//        }
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            if (next%2!=0) {
                iterator.remove();
            }
        }
        System.out.println("after delete: " + list);
        set.remove(6);
        System.out.println(set);
        list.remove(Integer.valueOf(4));
        System.out.println(list);
    }

    private void demo2() {
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(1,3,4,0,5,2,3,1,17,18,6,7,8,9,10,11));
        System.out.println(numbers);

    }

    private void demo1() {
        Collection<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("from");
        strings.add("me");


        System.out.println("strings = " + strings);
        strings.addAll(Arrays.asList("111", "222", "333"));
        System.out.println("strings = " + strings);
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            if (next.length()==3){
                iterator.remove();
            }
        }
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println("next = " + next);
        }

    }
}
