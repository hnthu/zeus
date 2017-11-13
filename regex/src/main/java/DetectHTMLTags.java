import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Sample Input

2
<p><a href="http://www.quackit.com/html/tutorial/html_links.cfm">Example Link</a></p>
<div class="more-info"><a href="http://www.quackit.com/html/examples/html_links_examples.cfm">More Link Examples...</a></div>

Sample Output

a;div;p
*/
public class DetectHTMLTags {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Pattern pt = Pattern.compile("<\\s*(\\w+)\\s*.*>[\\s\\S]*<\\/\\s*\\1\\s*>");
            Pattern pt2 = Pattern.compile("<\\s*([^<>\\s\"]+)\\s*[^<>]*\\/>");
            int l = sc.nextInt();
            SortedSet<String> result = new TreeSet<>();
            StringBuilder temp = new StringBuilder(sc.nextLine().trim());
            while (l>0) {
                String nLine = sc.nextLine();
                temp.append(nLine.trim() + "\r\n");
                l--;
            }
            String line = temp.toString();
            Matcher mt = pt.matcher(line);
            while (mt.find()) {
                String fi = mt.group(1);
                result.add(fi);
                line = line.replaceAll("</" + fi, "");
                mt = pt.matcher(line);
            }
            Matcher mt2 = pt2.matcher(line);
            while (mt2.find()) {
                String fi = mt2.group(1);
                result.add(fi);
                line = line.replaceAll("<" + fi, "");
                mt2 = pt2.matcher(line);
            }

            String asd = result.toString();
            String out = asd.replaceAll("[\\[\\]\\s]", "").replace(",", ";");
            System.out.println(out);
        }
    }

}
