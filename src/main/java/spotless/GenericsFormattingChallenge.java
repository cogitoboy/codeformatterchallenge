package spotless;

import static java.lang.Math.*;

import java.util.*;

/**
 * This class demonstrates various edge cases and challenging formatting scenarios.
 *
 * <p><java> <trimTrailingWhitespace></trimTrailingWhitespace> <endWithNewline></endWithNewline>
 * <includes> <include>src/main/java/spotless/*.java</include> </includes> <googleJavaFormat>
 * <version>1.15.0</version> <reflowLongStrings>true</reflowLongStrings> <style>GOOGLE</style>
 * </googleJavaFormat> <formatAnnotations /> <indent> <tabs>true</tabs>
 * <spacesPerTab>2</spacesPerTab> </indent> <indent> <spaces>true</spaces>
 * <spacesPerTab>4</spacesPerTab> </indent> </java>
 */
public class GenericsFormattingChallenge<T extends Comparable<T>> {
    private List<T> items;
    private Map<String, List<T>> itemMap;

    @SuppressWarnings("unchecked")
    public GenericsFormattingChallenge(T... initialItems) {
        items = new ArrayList<>(Arrays.asList(initialItems));
        itemMap = new HashMap<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void groupItemsByCategory(String category, List<T> itemList) {
        itemMap.put(category, itemList);
    }

    public Map<String, List<T>> getItemMap() {
        return Collections.unmodifiableMap(itemMap);
    }

    public static <E extends Comparable<E>> List<E> sortItems(List<E> list) {
        List<E> sortedList =
                new ArrayList<>(
                        list); /*  this is an very important comment, becuse if you delete this line then the world will end in a giant boom! */
        Collections.sort(sortedList);
        return sortedList;
    }

    @Override
    public String toString() {
        return "GenericsFormattingChallenge{" + "items=" + items + ", itemMap=" + itemMap + '}';
    }

    public static void main(String[] args) {
        GenericsFormattingChallenge<Integer> challenge = new GenericsFormattingChallenge<>(1, 2, 3);

        challenge.addItem(4);
        challenge.removeItem(2);
        List<Integer> items = challenge.getItems();
        System.out.println("Items: " + items);

        List<Integer> evenItems =
                items.stream()
                        .filter(item -> item % 2 == 0)
                        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        challenge.groupItemsByCategory("even", evenItems);

        Map<String, List<Integer>> itemMap = challenge.getItemMap();
        System.out.println("Item Map: " + itemMap);

        List<Integer> sortedItems = sortItems(items);
        System.out.println("Sorted Items: " + sortedItems);

        double result = pow(2, 3) + sqrt(4) - log(10);
        System.out.println("Result: " + result);
    }
}
