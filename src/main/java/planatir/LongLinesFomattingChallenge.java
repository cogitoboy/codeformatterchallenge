package planatir;


/**
 * This class demonstrates various edge cases and challenging formatting scenarios.
 *
 *
 *                      <java>
 *                         <trimTrailingWhitespace/>
 *                         <endWithNewline/>
 *                         <includes>
 *                             <include>src/main/java/planatir/*.java</include>
 *                         </includes>
 *                         <palantirJavaFormat>
 *                             <version>2.39.0</version>                     <!-- optional -->
 *                             <style>PALANTIR</style>                       <!-- or AOSP/GOOGLE (optional) -->
 *                             <!--formatJavadoc>false</formatJavadoc--      <!-- defaults to false (optional, requires at least Palantir 2.39.0) -->
 *                         </palantirJavaFormat>
 *                         <formatAnnotations />
 *                         <indent>
 *                             <tabs>true</tabs>
 *                             <spacesPerTab>2</spacesPerTab>
 *                         </indent>
 *                         <indent>
 *                             <spaces>true</spaces>
 *                             <spacesPerTab>4</spacesPerTab>
 *                         </indent>
 *                     </java>
 *
 *
 */
public class LongLinesFomattingChallenge {
        public static void main(String[] args) {
                String reallyLongString =
                                "This is a really long string that goes on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on and on";

                String anotherLongString =
                                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor, magna a bibendum bibendum, augue magna tincidunt enim, eget ultricies augue nisl eget nisl. Sed euismod, nulla sit amet aliquam lacinia, nisl nisl aliquam nisl, nec aliquam nisl nisl sit amet nisl. Sed euismod, nulla sit amet aliquam lacinia, nisl nisl aliquam nisl, nec aliquam nisl nisl sit amet nisl. Sed euismod, nulla sit amet aliquam lacinia, nisl nisl aliquam nisl, nec aliquam nisl nisl sit amet nisl. Sed euismod, nulla sit amet aliquam lacinia, nisl nisl aliquam nisl, nec aliquam nisl nisl sit amet nisl. Sed euismod, nulla sit amet aliquam lacinia, nisl nisl aliquam nisl, nec aliquam nisl nisl sit amet nisl. Sed euismod, nulla sit amet aliquam lacinia, nisl nisl aliquam nisl, nec aliquam nisl nisl sit amet nisl. Sed euismod, nulla sit amet aliquam lacinia, nisl nisl aliquam nisl, nec aliquam nisl nisl sit amet nisl. Sed euismod, nulla sit amet aliquam lacinia, nisl nisl aliquam nisl, nec aliquam nisl nisl sit amet nisl. Sed euismod, nulla sit amet aliquam lacinia, nisl nisl aliquam nisl, nec aliquam nisl nisl sit amet nisl. Sed euismod, nulla sit amet aliquam lacinia, nisl nisl aliquam nisl, nec aliquam nisl nisl sit amet nisl. Sed euismod, nulla sit amet aliquam lacinia, nisl nisl aliquam nisl, nec aliquam nisl nisl sit amet nisl.";

                System.out.println("Really long string: " + reallyLongString);
                System.out.println("Another long string: " + anotherLongString);

                String concatenatedString =
                                "This is a concatenated string that will be very long and will need to be split across multiple lines. "
                                                + "It includes multiple concatenations to make it even longer. "
                                                + "The goal is to have a string that exceeds the typical line length limit and requires formatting. "
                                                + "We can add more text to make it even longer. "
                                                + "And even more text to really push the limits. "
                                                + "Let's keep going and see how long we can make this string. "
                                                + "We're not done yet, let's add more content. "
                                                + "Just a few more lines to make sure it's really long. "
                                                + "Okay, I think this should be long enough for testing purposes.";

                System.out.println("Concatenated string: " + concatenatedString);

                // Some long lines of code
                int result = calculateComplexFormula(
                                10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200);
                String formattedResult = String.format(
                                "The result of the complex formula with a lot of arguments is: %d. This line is intentionally long to test the code formatter.",
                                result);
                System.out.println(formattedResult);
        }

        private static int calculateComplexFormula(
                        int a,
                        int b,
                        int c,
                        int d,
                        int e,
                        int f,
                        int g,
                        int h,
                        int i,
                        int j,
                        int k,
                        int l,
                        int m,
                        int n,
                        int o,
                        int p,
                        int q,
                        int r,
                        int s,
                        int t) {
                return a + b - c * d / e + f - g * h / i + j - k * l / m + n - o * p / q + r - s * t;
        }
}
