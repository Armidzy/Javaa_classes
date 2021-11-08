package com.ifmo.lesson11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopWords {
    public static void main(String[] args) throws IOException {
        // Создаем файл, указывая путь к текстовому файлу на диске
        File text = new File("wap.txt");

        // Вычитываем все строки из файла
        List<String> lines = Files.readAllLines(text.toPath());

        // Создаем пустую коллекцию для слов.
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            // Для каждой строки
            String[] wordSplit =
                    line.toLowerCase() // Переводим в нижний регистр
                            .replaceAll("\\p{Punct}", " ") // Заменяем все знаки на пробел
                            .trim() // Убираем пробелы в начале и конце строки.
                            .split("\\s"); // Разбиваем строки на слова

            for (String s : wordSplit) {
                // Выбираем только непустые слова.
                if (s.length() > 0)
                    words.add(s.trim());
            }
        }

        System.out.println(top10Words(words));
        System.out.println(top10Phrases(words));
        System.out.println(charactersFrequency(words));
    }

    /**
     * Возвращает 10 наиболее часто встречающихся слов с их
     * счётчиками.
     *
     * @param words Список слов.
     * @return Map, где ключ - слово, а значение - сколько раз встретилось.
     */
    public static Map<String, Integer> top10Words(List<String> words) {
        // todo implement
        Map<String, Integer> wordCount=new HashMap<>();
        for (String word: words){
            //containsKey(Object) – возвращает true, если такой ключ существует
            if (!wordCount.containsKey(word)){   //1.есть ли слово в map
                wordCount.put(word, 1);          //2. если нет то добавл со значением 1
            }
            else{                               //3. если есть извлекаем знач увелич на 1 и записываем обратно
                int val=wordCount.get(word)+1;
                wordCount.put(word, val);
            }
        }

        Map<String, Integer> top10WordsAns=new HashMap<>();
        String[] top10Words=new String[10];//массив 10 слов с их счетчиками
        int[] top10Counts = new int[10];
        int k=0;
        int minIndex;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (k<10 && entry.getValue() != null){
                top10Words[k]=entry.getKey();
                top10Counts[k]=entry.getValue();
                k++;
            }
            else{
                minIndex = findMin(top10Words, top10Counts);
                if (entry.getValue() > top10Counts[minIndex]){
                    top10Counts[minIndex]=entry.getValue();
                    top10Words[minIndex]=entry.getKey();
                }
            }
        }

        Map<String, Integer> ans=new HashMap<>();
        for (int i = 0; i < 10; i++) {
            ans.put(top10Words[i], top10Counts[i]);
        }

        return ans;
    }

    public  static int findMin(String[] words, int[] counts){
        int min=counts[0];
        int index=0;
        for (int i=1; i < words.length; i++){
            if (counts[i] < min){
                min=counts[i];
                index=i;
            }
        }
        return  index;
    }

    /**
     * Возвращает 10 наиболее часто встречающихся фраз и соответствующие счётчики.
     * Фраза - два подряд идущих слова.
     *
     * @param words Список слов.
     * @return Топ 10 фраз.
     */
    public static Map<String, Integer> top10Phrases(List<String> words) {
        // todo implement

        return Map.of();
    }

    /**
     * Возвращает символы и частоту их встречаемости.
     *
     * @param words Список слов.
     * @return Map где ключ - символ, а значение - сколько раз он встретился в списке слов.
     */
    public static Map<Character, Integer> charactersFrequency(List<String> words) {
        // todo implement

        return Map.of();
    }
}
