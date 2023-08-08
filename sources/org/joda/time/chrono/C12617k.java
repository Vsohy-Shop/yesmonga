package org.joda.time.chrono;

import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.C12641d;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* renamed from: org.joda.time.chrono.k */
public class C12617k {

    /* renamed from: p */
    public static ConcurrentMap<Locale, C12617k> f31079p = new ConcurrentHashMap();

    /* renamed from: a */
    public final String[] f31080a;

    /* renamed from: b */
    public final String[] f31081b;

    /* renamed from: c */
    public final String[] f31082c;

    /* renamed from: d */
    public final String[] f31083d;

    /* renamed from: e */
    public final String[] f31084e;

    /* renamed from: f */
    public final String[] f31085f;

    /* renamed from: g */
    public final TreeMap<String, Integer> f31086g;

    /* renamed from: h */
    public final TreeMap<String, Integer> f31087h;

    /* renamed from: i */
    public final TreeMap<String, Integer> f31088i;

    /* renamed from: j */
    public final int f31089j;

    /* renamed from: k */
    public final int f31090k;

    /* renamed from: l */
    public final int f31091l;

    /* renamed from: m */
    public final int f31092m;

    /* renamed from: n */
    public final int f31093n;

    /* renamed from: o */
    public final int f31094o;

    public C12617k(Locale locale) {
        DateFormatSymbols f = C12641d.m53371f(locale);
        this.f31080a = f.getEras();
        this.f31081b = m53224u(f.getWeekdays());
        this.f31082c = m53224u(f.getShortWeekdays());
        this.f31083d = m53225v(f.getMonths());
        this.f31084e = m53225v(f.getShortMonths());
        this.f31085f = f.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap<String, Integer> treeMap = new TreeMap<>(comparator);
        this.f31086g = treeMap;
        m53221b(treeMap, this.f31080a, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(comparator);
        this.f31087h = treeMap2;
        m53221b(treeMap2, this.f31081b, numArr);
        m53221b(treeMap2, this.f31082c, numArr);
        m53220a(treeMap2, 1, 7, numArr);
        TreeMap<String, Integer> treeMap3 = new TreeMap<>(comparator);
        this.f31088i = treeMap3;
        m53221b(treeMap3, this.f31083d, numArr);
        m53221b(treeMap3, this.f31084e, numArr);
        m53220a(treeMap3, 1, 12, numArr);
        this.f31089j = m53223q(this.f31080a);
        this.f31090k = m53223q(this.f31081b);
        this.f31091l = m53223q(this.f31082c);
        this.f31092m = m53223q(this.f31083d);
        this.f31093n = m53223q(this.f31084e);
        this.f31094o = m53223q(this.f31085f);
    }

    /* renamed from: a */
    public static void m53220a(TreeMap<String, Integer> treeMap, int i, int i2, Integer[] numArr) {
        while (i <= i2) {
            treeMap.put(String.valueOf(i).intern(), numArr[i]);
            i++;
        }
    }

    /* renamed from: b */
    public static void m53221b(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                String str = strArr[length];
                if (str != null) {
                    treeMap.put(str, numArr[length]);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public static C12617k m53222h(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        C12617k kVar = f31079p.get(locale);
        if (kVar != null) {
            return kVar;
        }
        C12617k kVar2 = new C12617k(locale);
        C12617k putIfAbsent = f31079p.putIfAbsent(locale, kVar2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return kVar2;
    }

    /* renamed from: q */
    public static int m53223q(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            length2--;
            if (length2 < 0) {
                return i;
            }
            String str = strArr[length2];
            if (str != null && (length = str.length()) > i) {
                i = length;
            }
        }
    }

    /* renamed from: u */
    public static String[] m53224u(String[] strArr) {
        int i;
        String[] strArr2 = new String[8];
        for (int i2 = 1; i2 < 8; i2++) {
            if (i2 < 7) {
                i = i2 + 1;
            } else {
                i = 1;
            }
            strArr2[i2] = strArr[i];
        }
        return strArr2;
    }

    /* renamed from: v */
    public static String[] m53225v(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    /* renamed from: c */
    public int mo28966c(String str) {
        Integer num = this.f31087h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.m51306B(), str);
    }

    /* renamed from: d */
    public String mo28967d(int i) {
        return this.f31082c[i];
    }

    /* renamed from: e */
    public String mo28968e(int i) {
        return this.f31081b[i];
    }

    /* renamed from: f */
    public int mo28969f(String str) {
        Integer num = this.f31086g.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.m51308D(), str);
    }

    /* renamed from: g */
    public String mo28970g(int i) {
        return this.f31080a[i];
    }

    /* renamed from: i */
    public int mo28971i() {
        return this.f31091l;
    }

    /* renamed from: j */
    public int mo28972j() {
        return this.f31090k;
    }

    /* renamed from: k */
    public int mo28973k() {
        return this.f31089j;
    }

    /* renamed from: l */
    public int mo28974l() {
        return this.f31094o;
    }

    /* renamed from: m */
    public int mo28975m() {
        return this.f31093n;
    }

    /* renamed from: n */
    public int mo28976n() {
        return this.f31092m;
    }

    /* renamed from: o */
    public int mo28977o(String str) {
        String[] strArr = this.f31085f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.m51309I(), str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return length;
    }

    /* renamed from: p */
    public String mo28978p(int i) {
        return this.f31085f[i];
    }

    /* renamed from: r */
    public int mo28979r(String str) {
        Integer num = this.f31088i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.m51316Q(), str);
    }

    /* renamed from: s */
    public String mo28980s(int i) {
        return this.f31084e[i];
    }

    /* renamed from: t */
    public String mo28981t(int i) {
        return this.f31083d[i];
    }
}
