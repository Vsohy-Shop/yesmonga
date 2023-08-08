package org.joda.time.format;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.channels.C11753k;
import org.joda.time.C12589a;
import org.joda.time.C12714n;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.format.a */
public class C12671a {

    /* renamed from: a */
    public static final int f31196a = 0;

    /* renamed from: b */
    public static final int f31197b = 1;

    /* renamed from: c */
    public static final int f31198c = 2;

    /* renamed from: d */
    public static final int f31199d = 3;

    /* renamed from: e */
    public static final int f31200e = 4;

    /* renamed from: f */
    public static final int f31201f = 0;

    /* renamed from: g */
    public static final int f31202g = 1;

    /* renamed from: h */
    public static final int f31203h = 2;

    /* renamed from: i */
    public static final int f31204i = 500;

    /* renamed from: j */
    public static final ConcurrentHashMap<String, C12674b> f31205j = new ConcurrentHashMap<>();

    /* renamed from: k */
    public static final AtomicReferenceArray<C12674b> f31206k = new AtomicReferenceArray<>(25);

    /* renamed from: org.joda.time.format.a$a */
    public static class C12672a implements C12688m, C12686k {

        /* renamed from: d */
        public static final ConcurrentHashMap<C12673b, C12674b> f31207d = new ConcurrentHashMap<>();

        /* renamed from: a */
        public final int f31208a;

        /* renamed from: b */
        public final int f31209b;

        /* renamed from: c */
        public final int f31210c;

        public C12672a(int i, int i2, int i3) {
            this.f31208a = i;
            this.f31209b = i2;
            this.f31210c = i3;
        }

        /* renamed from: a */
        public final C12674b mo29213a(Locale locale) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            C12673b bVar = new C12673b(this.f31210c, this.f31208a, this.f31209b, locale);
            ConcurrentHashMap<C12673b, C12674b> concurrentHashMap = f31207d;
            C12674b bVar2 = concurrentHashMap.get(bVar);
            if (bVar2 != null) {
                return bVar2;
            }
            C12674b f = C12671a.m54028f(mo29214c(locale));
            C12674b putIfAbsent = concurrentHashMap.putIfAbsent(bVar, f);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return f;
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            return mo29213a(dVar.mo29279q()).mo29243f().mo29196b(dVar, charSequence, i);
        }

        /* renamed from: c */
        public String mo29214c(Locale locale) {
            DateFormat dateFormat;
            int i = this.f31210c;
            if (i == 0) {
                dateFormat = DateFormat.getDateInstance(this.f31208a, locale);
            } else if (i == 1) {
                dateFormat = DateFormat.getTimeInstance(this.f31209b, locale);
            } else if (i != 2) {
                dateFormat = null;
            } else {
                dateFormat = DateFormat.getDateTimeInstance(this.f31208a, this.f31209b, locale);
            }
            if (dateFormat instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) dateFormat).toPattern();
            }
            throw new IllegalArgumentException("No datetime pattern for locale: " + locale);
        }

        /* renamed from: g */
        public int mo29197g() {
            return 40;
        }

        /* renamed from: q */
        public int mo29198q() {
            return 40;
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
            mo29213a(locale).mo29246i().mo29199w(appendable, nVar, locale);
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            Locale locale2 = locale;
            mo29213a(locale2).mo29246i().mo29200y(appendable, j, aVar, i, dateTimeZone, locale2);
        }
    }

    /* renamed from: org.joda.time.format.a$b */
    public static class C12673b {

        /* renamed from: a */
        public final int f31211a;

        /* renamed from: b */
        public final Locale f31212b;

        public C12673b(int i, int i2, int i3, Locale locale) {
            this.f31212b = locale;
            this.f31211a = i + (i2 << 4) + (i3 << 8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C12673b)) {
                return false;
            }
            C12673b bVar = (C12673b) obj;
            if (this.f31211a != bVar.f31211a) {
                return false;
            }
            Locale locale = this.f31212b;
            if (locale == null) {
                if (bVar.f31212b != null) {
                    return false;
                }
            } else if (!locale.equals(bVar.f31212b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = (this.f31211a + 31) * 31;
            Locale locale = this.f31212b;
            if (locale == null) {
                i = 0;
            } else {
                i = locale.hashCode();
            }
            return i2 + i;
        }
    }

    /* renamed from: a */
    public static void m54023a(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        m54040r(dateTimeFormatterBuilder, str);
    }

    /* renamed from: b */
    public static C12674b m54024b(int i, int i2) {
        int i3;
        if (i == 4) {
            i3 = 1;
        } else if (i2 == 4) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        C12672a aVar = new C12672a(i, i2, i3);
        return new C12674b((C12688m) aVar, (C12686k) aVar);
    }

    /* renamed from: c */
    public static C12674b m54025c(String str) {
        C12674b putIfAbsent;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification");
        }
        ConcurrentHashMap<String, C12674b> concurrentHashMap = f31205j;
        C12674b bVar = concurrentHashMap.get(str);
        if (bVar != null) {
            return bVar;
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        m54040r(dateTimeFormatterBuilder, str);
        C12674b u0 = dateTimeFormatterBuilder.mo29188u0();
        if (concurrentHashMap.size() >= 500 || (putIfAbsent = concurrentHashMap.putIfAbsent(str, u0)) == null) {
            return u0;
        }
        return putIfAbsent;
    }

    /* renamed from: d */
    public static C12674b m54026d(String str) {
        if (str == null || str.length() != 2) {
            throw new IllegalArgumentException("Invalid style specification: " + str);
        }
        int u = m54043u(str.charAt(0));
        int u2 = m54043u(str.charAt(1));
        if (u != 4 || u2 != 4) {
            return m54027e(u, u2);
        }
        throw new IllegalArgumentException("Style '--' is invalid");
    }

    /* renamed from: e */
    public static C12674b m54027e(int i, int i2) {
        int i3 = (i << 2) + i + i2;
        AtomicReferenceArray<C12674b> atomicReferenceArray = f31206k;
        if (i3 >= atomicReferenceArray.length()) {
            return m54024b(i, i2);
        }
        C12674b bVar = atomicReferenceArray.get(i3);
        if (bVar != null) {
            return bVar;
        }
        C12674b b = m54024b(i, i2);
        if (!C11753k.m46648a(atomicReferenceArray, i3, (Object) null, b)) {
            return atomicReferenceArray.get(i3);
        }
        return b;
    }

    /* renamed from: f */
    public static C12674b m54028f(String str) {
        return m54025c(str);
    }

    /* renamed from: g */
    public static C12674b m54029g(String str) {
        return m54026d(str);
    }

    /* renamed from: h */
    public static C12674b m54030h() {
        return m54027e(0, 4);
    }

    /* renamed from: i */
    public static C12674b m54031i() {
        return m54027e(0, 0);
    }

    /* renamed from: j */
    public static C12674b m54032j() {
        return m54027e(4, 0);
    }

    /* renamed from: k */
    public static boolean m54033k(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    break;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static C12674b m54034l() {
        return m54027e(1, 4);
    }

    /* renamed from: m */
    public static C12674b m54035m() {
        return m54027e(1, 1);
    }

    /* renamed from: n */
    public static C12674b m54036n() {
        return m54027e(4, 1);
    }

    /* renamed from: o */
    public static C12674b m54037o() {
        return m54027e(2, 4);
    }

    /* renamed from: p */
    public static C12674b m54038p() {
        return m54027e(2, 2);
    }

    /* renamed from: q */
    public static C12674b m54039q() {
        return m54027e(4, 2);
    }

    /* renamed from: r */
    public static void m54040r(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        boolean z;
        int length = str.length();
        int[] iArr = new int[1];
        int i = 0;
        while (i < length) {
            iArr[0] = i;
            String s = m54041s(str, iArr);
            int i2 = iArr[0];
            int length2 = s.length();
            if (length2 != 0) {
                char charAt = s.charAt(0);
                if (charAt == '\'') {
                    String substring = s.substring(1);
                    if (substring.length() == 1) {
                        dateTimeFormatterBuilder.mo29125B(substring.charAt(0));
                    } else {
                        dateTimeFormatterBuilder.mo29126C(new String(substring));
                    }
                } else if (charAt == 'K') {
                    dateTimeFormatterBuilder.mo29124A(length2);
                } else if (charAt != 'M') {
                    if (charAt == 'S') {
                        dateTimeFormatterBuilder.mo29193x(length2, length2);
                    } else if (charAt == 'a') {
                        dateTimeFormatterBuilder.mo29194y();
                    } else if (charAt == 'h') {
                        dateTimeFormatterBuilder.mo29167j(length2);
                    } else if (charAt == 'k') {
                        dateTimeFormatterBuilder.mo29165i(length2);
                    } else if (charAt == 'm') {
                        dateTimeFormatterBuilder.mo29130G(length2);
                    } else if (charAt == 's') {
                        dateTimeFormatterBuilder.mo29137N(length2);
                    } else if (charAt == 'G') {
                        dateTimeFormatterBuilder.mo29179q();
                    } else if (charAt != 'H') {
                        if (charAt != 'Y') {
                            if (charAt != 'Z') {
                                if (charAt == 'd') {
                                    dateTimeFormatterBuilder.mo29169k(length2);
                                } else if (charAt != 'e') {
                                    switch (charAt) {
                                        case 'C':
                                            dateTimeFormatterBuilder.mo29163h(length2, length2);
                                            continue;
                                        case 'D':
                                            dateTimeFormatterBuilder.mo29177o(length2);
                                            continue;
                                        case 'E':
                                            if (length2 < 4) {
                                                dateTimeFormatterBuilder.mo29173m();
                                                break;
                                            } else {
                                                dateTimeFormatterBuilder.mo29175n();
                                                continue;
                                            }
                                        default:
                                            switch (charAt) {
                                                case 'w':
                                                    dateTimeFormatterBuilder.mo29156d0(length2);
                                                    continue;
                                                case 'x':
                                                case 'y':
                                                    break;
                                                case 'z':
                                                    if (length2 < 4) {
                                                        dateTimeFormatterBuilder.mo29147X((Map<String, DateTimeZone>) null);
                                                        break;
                                                    } else {
                                                        dateTimeFormatterBuilder.mo29142S();
                                                        continue;
                                                        continue;
                                                    }
                                                default:
                                                    throw new IllegalArgumentException("Illegal pattern component: " + s);
                                            }
                                    }
                                } else {
                                    dateTimeFormatterBuilder.mo29171l(length2);
                                }
                            } else if (length2 == 1) {
                                dateTimeFormatterBuilder.mo29144U((String) null, "Z", false, 2, 2);
                            } else if (length2 == 2) {
                                dateTimeFormatterBuilder.mo29144U((String) null, "Z", true, 2, 2);
                            } else {
                                dateTimeFormatterBuilder.mo29141R();
                            }
                        }
                        if (length2 == 2) {
                            if (i2 + 1 < length) {
                                iArr[0] = iArr[0] + 1;
                                z = !m54033k(m54041s(str, iArr));
                                iArr[0] = iArr[0] - 1;
                            } else {
                                z = true;
                            }
                            if (charAt != 'x') {
                                dateTimeFormatterBuilder.mo29153b0(new DateTime().getYear() - 30, z);
                            } else {
                                dateTimeFormatterBuilder.mo29149Z(new DateTime().mo28714Z0() - 30, z);
                            }
                        } else {
                            int i3 = 9;
                            if (i2 + 1 < length) {
                                iArr[0] = iArr[0] + 1;
                                if (m54033k(m54041s(str, iArr))) {
                                    i3 = length2;
                                }
                                iArr[0] = iArr[0] - 1;
                            }
                            if (charAt == 'Y') {
                                dateTimeFormatterBuilder.mo29164h0(length2, i3);
                            } else if (charAt == 'x') {
                                dateTimeFormatterBuilder.mo29158e0(length2, i3);
                            } else if (charAt == 'y') {
                                dateTimeFormatterBuilder.mo29160f0(length2, i3);
                            }
                        }
                    } else {
                        dateTimeFormatterBuilder.mo29195z(length2);
                    }
                } else if (length2 < 3) {
                    dateTimeFormatterBuilder.mo29131H(length2);
                } else if (length2 >= 4) {
                    dateTimeFormatterBuilder.mo29133J();
                } else {
                    dateTimeFormatterBuilder.mo29132I();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    public static String m54041s(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i2;
            }
        } else {
            sb.append('\'');
            boolean z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 == '\'') {
                    int i3 = i + 1;
                    if (i3 >= length || str.charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        sb.append(charAt2);
                        i = i3;
                    }
                } else if (z || ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < 'a' || charAt2 > 'z'))) {
                    sb.append(charAt2);
                }
                i++;
            }
            i--;
        }
        iArr[0] = i;
        return sb.toString();
    }

    /* renamed from: t */
    public static String m54042t(String str, Locale locale) {
        C12674b d = m54026d(str);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return ((C12672a) d.mo29246i()).mo29214c(locale);
    }

    /* renamed from: u */
    public static int m54043u(char c) {
        if (c == '-') {
            return 4;
        }
        if (c == 'F') {
            return 0;
        }
        if (c == 'S') {
            return 3;
        }
        if (c == 'L') {
            return 1;
        }
        if (c == 'M') {
            return 2;
        }
        throw new IllegalArgumentException("Invalid style character: " + c);
    }

    /* renamed from: v */
    public static C12674b m54044v() {
        return m54027e(3, 4);
    }

    /* renamed from: w */
    public static C12674b m54045w() {
        return m54027e(3, 3);
    }

    /* renamed from: x */
    public static C12674b m54046x() {
        return m54027e(4, 3);
    }
}
