package Test;

import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by biao.hu on 2017/11/8.
 */

public class TestJava8 {
    @Test
    public void testTime() {
        LocalDateTime from = LocalDateTime.of(2014, Month.APRIL, 16, 23, 24);
        LocalDateTime to = LocalDateTime.of(2015, Month.DECEMBER, 23, 14, 26);
        Duration duration = Duration.between(from, to);
        System.out.println(duration.toDays());

    }

    @Test
    public void testJavaScript() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        System.out.println("Result:" + engine.eval("function f() { return 1; }; f() + 1;"));
    }

    @Test
    public void testBase64() {
        final String text = "Base64 finally in Java 8!";
        byte[] encoded = Base64.getEncoder().encode(text.getBytes(StandardCharsets.UTF_8));
        String decoded = new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
        System.out.println(decoded);
    }

    @Test
    public void testLambda() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        names.sort(String::compareTo);
    }

    @Test
    public void testParall() {
        long[] arrayOfLong = new long[20000];

        Arrays.parallelSetAll(arrayOfLong,
                index -> ThreadLocalRandom.current().nextInt(1000000));
        Arrays.stream(arrayOfLong).limit(10).forEach(
                i -> System.out.print(i + " "));
        System.out.println();

        Arrays.parallelSort(arrayOfLong);
        Arrays.stream(arrayOfLong).limit(10).forEach(
                i -> System.out.print(i + " "));
        System.out.println();
    }

    @Test
    public void testOptional() {
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println(fullName.isPresent());
        System.out.println(fullName.orElse("sfdsf"));
    }

    /*@Test
    public void testFunc() {
        Car car = Car.create(Car::new);
        List<Car> cars = Arrays.asList(car);
        cars.forEach(Car::repair);
        System.out.println(car);
    }*/

    @Test
    public void testStream() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        String collect = strings.stream()
                .filter(str -> !strings.isEmpty())
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(collect);

    }

    @Test
    public void testSummaryStatistics() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }

    public @Test
    void testReduce() {
        Integer result = Stream.of(1, 2, 3).reduce(0, Integer::sum);
    }

    /*public @Test
    void testArtist() {
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist("zhanghanyi", "china"));
        artists.add(new Artist("ww", "chinese"));
        List<String> collect = artists.stream()
                .flatMap(artist -> Arrays.stream(new String[]{artist.getName(), artist.getNationlity()}))
                .collect(toList());
        System.out.println(collect);
    }*/

    public @Test
    void testChars() {
        List<String> list = new ArrayList<>();
        list.add("asdfDFddfDSFdsddfs");
        list.add("aEEEEEEfDFddfDSFdsddfs");
        list.add("asdfDDssdsdfDSFdsdsfasfasdfasfdfs");

//        list.stream()
//                .max(Comparator.comparingLong(this::countStringLowercaseLetters))
//                .ifPresent(System.out::println);
        list.stream().max(Comparator.comparingLong(str -> str.chars().filter(Character::isLowerCase).count())).ifPresent(System.out::println);
    }

    //    private long countStringLowercaseLetters(String string) {
//        return string.chars().filter(Character::isLowerCase).count();
//    }
    /*public @Test
    void testMapping() {
        List<StudentScore> studentList = Arrays.asList(
                new StudentScore(1, "小明", "语文", 85),
                new StudentScore(2, "小明", "数学", 90),
                new StudentScore(3, "小明", "英语", 80),
                new StudentScore(4, "小红", "语文", 80),
                new StudentScore(5, "小红", "数学", 80),
                new StudentScore(6, "小红", "英语", 80));
//
        Map<String, List<String>> collect = studentList.stream()
                .collect(Collectors.groupingBy(StudentScore::getName, mapping(StudentScore::getSubject, toList())));
//        studentList.stream().map(StudentScore::getName).distinct().collect(toList()).forEach(System.out::println);
//        IntSummaryStatistics statistics = studentList.stream().mapToInt(StudentScore::getScore).summaryStatistics();
//        studentList.stream().flatMap(student -> Stream.of(student.getName(), student.getSubject())).collect(toList()).forEach(System.out::println);
    }*/

    @Test
    public void convertTest() {
        List<String> collected = new ArrayList<>();
        collected.add("alpha");
        collected.add("beta");
        collected.add("cool");
        collected.add("delta");
        List<String> collect = collected.stream().map(String::toUpperCase).collect(toList());
        System.out.println(collected);//此处打印出来的是大写还是小写，为什么？
        System.out.println(collect);//此处打印出来的是大写还是小写，为什么？
    }

    public @Test
    void testInt() {
        Optional<Integer> collect = Stream.of(1, 23, 34, 231, 34).max(Comparator.comparingInt(o -> o));
        System.out.println(collect.get());
    }

    public @Test
    void testII() {
        Map<Boolean, Long> collect = Stream.of(1, 23, 34, 231, 34).collect(Collectors.partitioningBy(i -> i % 2 == 0, Collectors.counting()));
        System.out.println(collect);
    }

    public @Test
    void testIII() {

    }

/*    public @Test
    void testFunctionInterface() {
        Date date = outFunc("2017-12-13 12:41:10", (ConvertorInterface<String, Date>) s -> {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
            return dateFormat.parse(s, new ParsePosition(1));
        });
        System.out.println(date);

        ConvertorInterface<String, Double> convertorInterface = Double::parseDouble;
        System.out.println(convertorInterface.convertor("12"));
        ConvertorInterface<String, Boolean> stringBooleanConvertorInterface = "asdf"::startsWith;
        System.out.println(stringBooleanConvertorInterface.convertor("af"));
        Function<String, Integer> toInteger = Integer::valueOf;
        toInteger.andThen(String::valueOf);
        Supplier<Car> supplier = Car::new;
    }*/

/*    public <T, D> D outFunc(String strDate, ConvertorInterface<T, D> convertorInterface) {
        return convertorInterface.convertor((T) strDate);
    }*/

    public @Test
    void testProperties() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("haha", "asdfl");

        FileWriter fw = new FileWriter("e:\\properites.txt");
        properties.store(fw, "张涵弈");
    }

    public @Test
    void testBuffer() throws IOException {
        ByteBuffer buff = ByteBuffer.allocate(1024);
//        System.out.println(buff.position());
//        buff.putInt(10);
//        buff.putInt(14);
//        buff.putInt(13);
//        System.out.println(buff.position());
//        buff.flip();
//        System.out.println("切换写模式后，position———limit，" + buff.position() + "———" + buff.limit());
//        buff.clear();
//        System.out.println("切换读模式后，position———limit，" + buff.position() + "———" + buff.limit());
        File f1 = new File("e:\\properites.txt");
        FileChannel channel = new RandomAccessFile(f1, "rw").getChannel();
        int read = channel.read(buff);
        System.out.println(buff);
    }

    public @Test
    void testThread() throws ExecutionException, InterruptedException {
        FutureTask<Object> task = new FutureTask<>(() -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
            }
            return sum;
        });
        Thread t1 = new Thread(task, "Call线程");
        t1.start();
        Thread.sleep(1000);
        if (task.isDone()) {
            System.out.println(task.get());
        }
    }

    public @Test
    void testUtils() throws IOException {
        Path path = Paths.get("e:", "properites.txt");
        File file = new File("d:\\demo.txt");
        file.createNewFile();
        Files.copy(path, new FileOutputStream(file));
    }
}

