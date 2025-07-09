package Leetcode.LogicalQuestion;

import java.util.*;
 
public class StudentAttendance_552 {
/*     public static boolean checkRecord(String s) {
boolean late = true;
for (int i = 0; i < s.length() - 2; i++) {
    if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
        late = false;
        break;
    }

}
int c = 0;
for (int i = 0; i < s.length(); i++) {

    if (s.charAt(i) == 'A') {
        c += 1;
    }

}
boolean absent = true;
if (c >= 2) {
    absent = false;
}
return late && absent;
}

public static void Record(int n, List<String> ll, String s) {
if (n == 0) {
    ll.add(s);
    return;
}
if (n < 0) {
    return;
}
Record(n - 1, ll, s + "A");
Record(n - 1, ll, s + "P");
Record(n - 1, ll, s + "L");
}

public static void main(String[] args) {
int n = 100;
List<String> ll = new ArrayList<>();
Record(n, ll,"");
System.out.println(ll);

int count = 0;
for (int i = 0; i < ll.size(); i++) {
    if (checkRecord(ll.get(i))) {
        count++;
    }
}
System.out.println(count);

} */
    
 
/*     public static void Record(int n, List<String> ll,int ca,   String s) {
if (n == 0) {
    ll.add(s);
    return;
}
if (n < 0) {
    return;
}

if (ca < 1) {
    Record(n - 1, ll, ca + 1,  s + "A");
}
if (s.length() >= 2 && s.charAt(s.length()-2) == 'L' && s.charAt(s.length()-1) == 'L') {
    return;
}
Record(n - 1, ll,ca , s + "L");
Record(n - 1, ll,ca,   s + "P");
}

public static void main(String[] args) {
int n = 4;
List<String> ll = new ArrayList<>();
Record(n, ll,0,  "");
System.out.println(ll.size());
 

} */
   
static int count = 0;
public static void Record(int n,  int ca, String s) {
    if (n == 0) {
        count += 1;
        return;
    }
    if (n < 0) {
        return;
    }

    if (ca < 1) {
        Record(n - 1, ca + 1, s + "A");
    }
    if (s.length() >= 2 && s.charAt(s.length() - 2) == 'L' && s.charAt(s.length() - 1) == 'L') {
        return;
    }
    Record(n - 1, ca, s + "L");
    Record(n - 1, ca, s + "P");
}

public static void main(String[] args) {
    int n = 40;
    count = 0;
    Record(n, 0, "");
    System.out.println(count);

}
}

