package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import org.joda.time.C12709i;
import org.joda.time.C12715o;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;

/* renamed from: org.joda.time.format.q */
public class C12693q {

    /* renamed from: j */
    public static final int f31319j = 1;

    /* renamed from: k */
    public static final int f31320k = 2;

    /* renamed from: l */
    public static final int f31321l = 3;

    /* renamed from: m */
    public static final int f31322m = 4;

    /* renamed from: n */
    public static final int f31323n = 5;

    /* renamed from: o */
    public static final int f31324o = 0;

    /* renamed from: p */
    public static final int f31325p = 1;

    /* renamed from: q */
    public static final int f31326q = 2;

    /* renamed from: r */
    public static final int f31327r = 3;

    /* renamed from: s */
    public static final int f31328s = 4;

    /* renamed from: t */
    public static final int f31329t = 5;

    /* renamed from: u */
    public static final int f31330u = 6;

    /* renamed from: v */
    public static final int f31331v = 7;

    /* renamed from: w */
    public static final int f31332w = 8;

    /* renamed from: x */
    public static final int f31333x = 9;

    /* renamed from: y */
    public static final int f31334y = 9;

    /* renamed from: z */
    public static final ConcurrentMap<String, Pattern> f31335z = new ConcurrentHashMap();

    /* renamed from: a */
    public int f31336a;

    /* renamed from: b */
    public int f31337b;

    /* renamed from: c */
    public int f31338c;

    /* renamed from: d */
    public boolean f31339d;

    /* renamed from: e */
    public C12699f f31340e;

    /* renamed from: f */
    public List<Object> f31341f;

    /* renamed from: g */
    public boolean f31342g;

    /* renamed from: h */
    public boolean f31343h;

    /* renamed from: i */
    public C12696c[] f31344i;

    /* renamed from: org.joda.time.format.q$a */
    public static class C12694a implements C12706s, C12705r {

        /* renamed from: a */
        public final C12706s[] f31345a;

        /* renamed from: b */
        public final C12705r[] f31346b;

        public C12694a(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            mo29373g(list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.f31345a = null;
            } else {
                this.f31345a = (C12706s[]) arrayList.toArray(new C12706s[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.f31346b = null;
            } else {
                this.f31346b = (C12705r[]) arrayList2.toArray(new C12705r[arrayList2.size()]);
            }
        }

        /* renamed from: a */
        public void mo29304a(Writer writer, C12715o oVar, Locale locale) throws IOException {
            for (C12706s a : this.f31345a) {
                a.mo29304a(writer, oVar, locale);
            }
        }

        /* renamed from: b */
        public int mo29305b(C12709i iVar, String str, int i, Locale locale) {
            C12705r[] rVarArr = this.f31346b;
            if (rVarArr != null) {
                int length = rVarArr.length;
                for (int i2 = 0; i2 < length && i >= 0; i2++) {
                    i = rVarArr[i2].mo29305b(iVar, str, i, locale);
                }
                return i;
            }
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public int mo29306c(C12715o oVar, int i, Locale locale) {
            C12706s[] sVarArr = this.f31345a;
            int length = sVarArr.length;
            int i2 = 0;
            while (i2 < i) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 += sVarArr[length].mo29306c(oVar, Integer.MAX_VALUE, locale);
            }
            return i2;
        }

        /* renamed from: d */
        public void mo29307d(StringBuffer stringBuffer, C12715o oVar, Locale locale) {
            for (C12706s d : this.f31345a) {
                d.mo29307d(stringBuffer, oVar, locale);
            }
        }

        /* renamed from: e */
        public int mo29308e(C12715o oVar, Locale locale) {
            C12706s[] sVarArr = this.f31345a;
            int length = sVarArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                i += sVarArr[length].mo29308e(oVar, locale);
            }
        }

        /* renamed from: f */
        public final void mo29372f(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object add : objArr) {
                    list.add(add);
                }
            }
        }

        /* renamed from: g */
        public final void mo29373g(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof C12706s) {
                    if (obj instanceof C12694a) {
                        mo29372f(list2, ((C12694a) obj).f31345a);
                    } else {
                        list2.add(obj);
                    }
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof C12705r) {
                    if (obj2 instanceof C12694a) {
                        mo29372f(list3, ((C12694a) obj2).f31346b);
                    } else {
                        list3.add(obj2);
                    }
                }
            }
        }
    }

    /* renamed from: org.joda.time.format.q$b */
    public static class C12695b extends C12697d {

        /* renamed from: b */
        public final C12699f f31347b;

        /* renamed from: c */
        public final C12699f f31348c;

        /* renamed from: d */
        public final String[] f31349d;

        public C12695b(C12699f fVar, C12699f fVar2) {
            this.f31347b = fVar;
            this.f31348c = fVar2;
            HashSet hashSet = new HashSet();
            for (String str : fVar.mo29377d()) {
                for (String str2 : this.f31348c.mo29377d()) {
                    hashSet.add(str + str2);
                }
            }
            this.f31349d = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        /* renamed from: a */
        public int mo29374a(String str, int i) {
            int a;
            int a2 = this.f31347b.mo29374a(str, i);
            if (a2 < 0 || ((a = this.f31348c.mo29374a(str, this.f31347b.mo29378e(str, a2))) >= 0 && mo29388h(this.f31348c.mo29378e(str, a) - a2, str, i))) {
                return ~i;
            }
            if (a2 > 0) {
                return a2;
            }
            return a;
        }

        /* renamed from: b */
        public int mo29375b(int i) {
            return this.f31347b.mo29375b(i) + this.f31348c.mo29375b(i);
        }

        /* renamed from: c */
        public void mo29376c(Writer writer, int i) throws IOException {
            this.f31347b.mo29376c(writer, i);
            this.f31348c.mo29376c(writer, i);
        }

        /* renamed from: d */
        public String[] mo29377d() {
            return (String[]) this.f31349d.clone();
        }

        /* renamed from: e */
        public int mo29378e(String str, int i) {
            int e = this.f31347b.mo29378e(str, i);
            if (e < 0 || (e = this.f31348c.mo29378e(str, e)) < 0 || !mo29388h(mo29378e(str, e) - e, str, i)) {
                return e;
            }
            return ~i;
        }

        /* renamed from: f */
        public void mo29379f(StringBuffer stringBuffer, int i) {
            this.f31347b.mo29379f(stringBuffer, i);
            this.f31348c.mo29379f(stringBuffer, i);
        }
    }

    /* renamed from: org.joda.time.format.q$d */
    public static abstract class C12697d implements C12699f {

        /* renamed from: a */
        public volatile String[] f31358a;

        /* renamed from: g */
        public void mo29387g(Set<C12699f> set) {
            if (this.f31358a == null) {
                int i = Integer.MAX_VALUE;
                String str = null;
                for (String str2 : mo29377d()) {
                    if (str2.length() < i) {
                        i = str2.length();
                        str = str2;
                    }
                }
                HashSet hashSet = new HashSet();
                for (C12699f next : set) {
                    if (next != null) {
                        for (String str3 : next.mo29377d()) {
                            if (str3.length() > i || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                hashSet.add(str3);
                            }
                        }
                    }
                }
                this.f31358a = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        }

        /* renamed from: h */
        public boolean mo29388h(int i, String str, int i2) {
            if (this.f31358a != null) {
                for (String str2 : this.f31358a) {
                    int length = str2.length();
                    if (i < length && str.regionMatches(true, i2, str2, 0, length)) {
                        return true;
                    }
                    if (i == length && str.regionMatches(false, i2, str2, 0, length)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: org.joda.time.format.q$e */
    public static class C12698e implements C12706s, C12705r {

        /* renamed from: b */
        public static final C12698e f31359b = new C12698e("");

        /* renamed from: a */
        public final String f31360a;

        public C12698e(String str) {
            this.f31360a = str;
        }

        /* renamed from: a */
        public void mo29304a(Writer writer, C12715o oVar, Locale locale) throws IOException {
            writer.write(this.f31360a);
        }

        /* renamed from: b */
        public int mo29305b(C12709i iVar, String str, int i, Locale locale) {
            String str2 = this.f31360a;
            if (str.regionMatches(true, i, str2, 0, str2.length())) {
                return i + this.f31360a.length();
            }
            return ~i;
        }

        /* renamed from: c */
        public int mo29306c(C12715o oVar, int i, Locale locale) {
            return 0;
        }

        /* renamed from: d */
        public void mo29307d(StringBuffer stringBuffer, C12715o oVar, Locale locale) {
            stringBuffer.append(this.f31360a);
        }

        /* renamed from: e */
        public int mo29308e(C12715o oVar, Locale locale) {
            return this.f31360a.length();
        }
    }

    /* renamed from: org.joda.time.format.q$f */
    public interface C12699f {
        /* renamed from: a */
        int mo29374a(String str, int i);

        /* renamed from: b */
        int mo29375b(int i);

        /* renamed from: c */
        void mo29376c(Writer writer, int i) throws IOException;

        /* renamed from: d */
        String[] mo29377d();

        /* renamed from: e */
        int mo29378e(String str, int i);

        /* renamed from: f */
        void mo29379f(StringBuffer stringBuffer, int i);

        /* renamed from: g */
        void mo29387g(Set<C12699f> set);
    }

    /* renamed from: org.joda.time.format.q$g */
    public static class C12700g extends C12697d {

        /* renamed from: b */
        public final String f31361b;

        /* renamed from: c */
        public final String f31362c;

        public C12700g(String str, String str2) {
            this.f31361b = str;
            this.f31362c = str2;
        }

        /* renamed from: a */
        public int mo29374a(String str, int i) {
            String str2;
            String str3;
            String str4 = str;
            String str5 = this.f31362c;
            String str6 = this.f31361b;
            if (str5.length() < str6.length()) {
                str2 = str5;
                str3 = str6;
            } else {
                str3 = str5;
                str2 = str6;
            }
            int length = str3.length();
            int length2 = str2.length();
            int length3 = str.length();
            for (int i2 = i; i2 < length3; i2++) {
                if (str.regionMatches(true, i2, str3, 0, length) && !mo29388h(str3.length(), str, i2)) {
                    return i2;
                }
                if (str.regionMatches(true, i2, str2, 0, length2) && !mo29388h(str2.length(), str, i2)) {
                    return i2;
                }
            }
            return ~i;
        }

        /* renamed from: b */
        public int mo29375b(int i) {
            return (i == 1 ? this.f31361b : this.f31362c).length();
        }

        /* renamed from: c */
        public void mo29376c(Writer writer, int i) throws IOException {
            writer.write(i == 1 ? this.f31361b : this.f31362c);
        }

        /* renamed from: d */
        public String[] mo29377d() {
            return new String[]{this.f31361b, this.f31362c};
        }

        /* renamed from: e */
        public int mo29378e(String str, int i) {
            String str2;
            int length;
            String str3 = this.f31362c;
            String str4 = this.f31361b;
            if (str3.length() < str4.length()) {
                str2 = str3;
                str3 = str4;
            } else {
                str2 = str4;
            }
            if (!str.regionMatches(true, i, str3, 0, str3.length()) || mo29388h(str3.length(), str, i)) {
                if (!str.regionMatches(true, i, str2, 0, str2.length()) || mo29388h(str2.length(), str, i)) {
                    return ~i;
                }
                length = str2.length();
            } else {
                length = str3.length();
            }
            return i + length;
        }

        /* renamed from: f */
        public void mo29379f(StringBuffer stringBuffer, int i) {
            stringBuffer.append(i == 1 ? this.f31361b : this.f31362c);
        }
    }

    /* renamed from: org.joda.time.format.q$h */
    public static class C12701h extends C12697d {

        /* renamed from: e */
        public static final Comparator<String> f31363e = new C12702a();

        /* renamed from: b */
        public final String[] f31364b;

        /* renamed from: c */
        public final Pattern[] f31365c;

        /* renamed from: d */
        public final String[] f31366d;

        /* renamed from: org.joda.time.format.q$h$a */
        public static class C12702a implements Comparator<String> {
            /* renamed from: a */
            public int compare(String str, String str2) {
                return str2.length() - str.length();
            }
        }

        public C12701h(String[] strArr, String[] strArr2) {
            this.f31364b = (String[]) strArr2.clone();
            this.f31365c = new Pattern[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                Pattern pattern = (Pattern) C12693q.f31335z.get(strArr[i]);
                if (pattern == null) {
                    pattern = Pattern.compile(strArr[i]);
                    C12693q.f31335z.putIfAbsent(strArr[i], pattern);
                }
                this.f31365c[i] = pattern;
            }
            String[] strArr3 = (String[]) this.f31364b.clone();
            this.f31366d = strArr3;
            Arrays.sort(strArr3, f31363e);
        }

        /* renamed from: a */
        public int mo29374a(String str, int i) {
            int length = str.length();
            for (int i2 = i; i2 < length; i2++) {
                for (String str2 : this.f31366d) {
                    if (str.regionMatches(true, i2, str2, 0, str2.length()) && !mo29388h(str2.length(), str, i2)) {
                        return i2;
                    }
                }
            }
            return ~i;
        }

        /* renamed from: b */
        public int mo29375b(int i) {
            return this.f31364b[mo29389i(i)].length();
        }

        /* renamed from: c */
        public void mo29376c(Writer writer, int i) throws IOException {
            writer.write(this.f31364b[mo29389i(i)]);
        }

        /* renamed from: d */
        public String[] mo29377d() {
            return (String[]) this.f31364b.clone();
        }

        /* renamed from: e */
        public int mo29378e(String str, int i) {
            for (String str2 : this.f31366d) {
                if (str.regionMatches(true, i, str2, 0, str2.length()) && !mo29388h(str2.length(), str, i)) {
                    return i + str2.length();
                }
            }
            return ~i;
        }

        /* renamed from: f */
        public void mo29379f(StringBuffer stringBuffer, int i) {
            stringBuffer.append(this.f31364b[mo29389i(i)]);
        }

        /* renamed from: i */
        public final int mo29389i(int i) {
            String valueOf = String.valueOf(i);
            int i2 = 0;
            while (true) {
                Pattern[] patternArr = this.f31365c;
                if (i2 >= patternArr.length) {
                    return patternArr.length - 1;
                }
                if (patternArr[i2].matcher(valueOf).matches()) {
                    return i2;
                }
                i2++;
            }
        }
    }

    /* renamed from: org.joda.time.format.q$i */
    public static class C12703i implements C12706s, C12705r {

        /* renamed from: a */
        public final String f31367a;

        /* renamed from: b */
        public final String f31368b;

        /* renamed from: c */
        public final String[] f31369c;

        /* renamed from: d */
        public final boolean f31370d;

        /* renamed from: e */
        public final boolean f31371e;

        /* renamed from: f */
        public final C12706s f31372f;

        /* renamed from: g */
        public volatile C12706s f31373g;

        /* renamed from: h */
        public final C12705r f31374h;

        /* renamed from: i */
        public volatile C12705r f31375i;

        public C12703i(String str, String str2, String[] strArr, C12706s sVar, C12705r rVar, boolean z, boolean z2) {
            this.f31367a = str;
            this.f31368b = str2;
            if ((str2 == null || str.equals(str2)) && (strArr == null || strArr.length == 0)) {
                this.f31369c = new String[]{str};
            } else {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        }
                        treeSet.add(strArr[length]);
                    }
                }
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.f31369c = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            this.f31372f = sVar;
            this.f31374h = rVar;
            this.f31370d = z;
            this.f31371e = z2;
        }

        /* renamed from: a */
        public void mo29304a(Writer writer, C12715o oVar, Locale locale) throws IOException {
            String str;
            C12706s sVar = this.f31372f;
            C12706s sVar2 = this.f31373g;
            sVar.mo29304a(writer, oVar, locale);
            if (this.f31370d) {
                if (sVar.mo29306c(oVar, 1, locale) > 0) {
                    if (this.f31371e) {
                        int c = sVar2.mo29306c(oVar, 2, locale);
                        if (c > 0) {
                            if (c > 1) {
                                str = this.f31367a;
                            } else {
                                str = this.f31368b;
                            }
                            writer.write(str);
                        }
                    } else {
                        writer.write(this.f31367a);
                    }
                }
            } else if (this.f31371e && sVar2.mo29306c(oVar, 1, locale) > 0) {
                writer.write(this.f31367a);
            }
            sVar2.mo29304a(writer, oVar, locale);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo29305b(org.joda.time.C12709i r18, java.lang.String r19, int r20, java.util.Locale r21) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r8 = r19
                r2 = r20
                r9 = r21
                org.joda.time.format.r r3 = r0.f31374h
                int r10 = r3.mo29305b(r1, r8, r2, r9)
                if (r10 >= 0) goto L_0x0013
                return r10
            L_0x0013:
                r11 = 0
                if (r10 <= r2) goto L_0x0049
                java.lang.String[] r12 = r0.f31369c
                int r13 = r12.length
                r14 = r11
            L_0x001a:
                if (r14 >= r13) goto L_0x0049
                r15 = r12[r14]
                if (r15 == 0) goto L_0x003a
                int r2 = r15.length()
                if (r2 == 0) goto L_0x003a
                r3 = 1
                r6 = 0
                int r7 = r15.length()
                r2 = r19
                r4 = r10
                r5 = r15
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x0037
                goto L_0x003a
            L_0x0037:
                int r14 = r14 + 1
                goto L_0x001a
            L_0x003a:
                if (r15 != 0) goto L_0x003d
                goto L_0x0041
            L_0x003d:
                int r11 = r15.length()
            L_0x0041:
                int r10 = r10 + r11
                r2 = 1
                r16 = r11
                r11 = r2
                r2 = r16
                goto L_0x004a
            L_0x0049:
                r2 = -1
            L_0x004a:
                org.joda.time.format.r r3 = r0.f31375i
                int r1 = r3.mo29305b(r1, r8, r10, r9)
                if (r1 >= 0) goto L_0x0053
                return r1
            L_0x0053:
                if (r11 == 0) goto L_0x005b
                if (r1 != r10) goto L_0x005b
                if (r2 <= 0) goto L_0x005b
                int r1 = ~r10
                return r1
            L_0x005b:
                if (r1 <= r10) goto L_0x0064
                if (r11 != 0) goto L_0x0064
                boolean r2 = r0.f31370d
                if (r2 != 0) goto L_0x0064
                int r1 = ~r10
            L_0x0064:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.C12693q.C12703i.mo29305b(org.joda.time.i, java.lang.String, int, java.util.Locale):int");
        }

        /* renamed from: c */
        public int mo29306c(C12715o oVar, int i, Locale locale) {
            int c = this.f31372f.mo29306c(oVar, i, locale);
            if (c < i) {
                return c + this.f31373g.mo29306c(oVar, i, locale);
            }
            return c;
        }

        /* renamed from: d */
        public void mo29307d(StringBuffer stringBuffer, C12715o oVar, Locale locale) {
            String str;
            C12706s sVar = this.f31372f;
            C12706s sVar2 = this.f31373g;
            sVar.mo29307d(stringBuffer, oVar, locale);
            if (this.f31370d) {
                if (sVar.mo29306c(oVar, 1, locale) > 0) {
                    if (this.f31371e) {
                        int c = sVar2.mo29306c(oVar, 2, locale);
                        if (c > 0) {
                            if (c > 1) {
                                str = this.f31367a;
                            } else {
                                str = this.f31368b;
                            }
                            stringBuffer.append(str);
                        }
                    } else {
                        stringBuffer.append(this.f31367a);
                    }
                }
            } else if (this.f31371e && sVar2.mo29306c(oVar, 1, locale) > 0) {
                stringBuffer.append(this.f31367a);
            }
            sVar2.mo29307d(stringBuffer, oVar, locale);
        }

        /* renamed from: e */
        public int mo29308e(C12715o oVar, Locale locale) {
            int i;
            String str;
            C12706s sVar = this.f31372f;
            C12706s sVar2 = this.f31373g;
            int e = sVar.mo29308e(oVar, locale) + sVar2.mo29308e(oVar, locale);
            if (this.f31370d) {
                if (sVar.mo29306c(oVar, 1, locale) <= 0) {
                    return e;
                }
                if (this.f31371e) {
                    int c = sVar2.mo29306c(oVar, 2, locale);
                    if (c <= 0) {
                        return e;
                    }
                    if (c > 1) {
                        str = this.f31367a;
                    } else {
                        str = this.f31368b;
                    }
                    i = str.length();
                } else {
                    i = this.f31367a.length();
                }
            } else if (!this.f31371e || sVar2.mo29306c(oVar, 1, locale) <= 0) {
                return e;
            } else {
                i = this.f31367a.length();
            }
            return e + i;
        }

        /* renamed from: h */
        public C12703i mo29392h(C12706s sVar, C12705r rVar) {
            this.f31373g = sVar;
            this.f31375i = rVar;
            return this;
        }
    }

    /* renamed from: org.joda.time.format.q$j */
    public static class C12704j extends C12697d {

        /* renamed from: b */
        public final String f31376b;

        public C12704j(String str) {
            this.f31376b = str;
        }

        /* renamed from: a */
        public int mo29374a(String str, int i) {
            String str2 = this.f31376b;
            int length = str2.length();
            int length2 = str.length();
            int i2 = i;
            while (i2 < length2) {
                if (str.regionMatches(true, i2, str2, 0, length) && !mo29388h(length, str, i2)) {
                    return i2;
                }
                switch (str.charAt(i2)) {
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i2++;
                }
                return ~i;
            }
            return ~i;
        }

        /* renamed from: b */
        public int mo29375b(int i) {
            return this.f31376b.length();
        }

        /* renamed from: c */
        public void mo29376c(Writer writer, int i) throws IOException {
            writer.write(this.f31376b);
        }

        /* renamed from: d */
        public String[] mo29377d() {
            return new String[]{this.f31376b};
        }

        /* renamed from: e */
        public int mo29378e(String str, int i) {
            String str2 = this.f31376b;
            int length = str2.length();
            if (!str.regionMatches(true, i, str2, 0, length) || mo29388h(length, str, i)) {
                return ~i;
            }
            return i + length;
        }

        /* renamed from: f */
        public void mo29379f(StringBuffer stringBuffer, int i) {
            stringBuffer.append(this.f31376b);
        }
    }

    public C12693q() {
        mo29334G();
    }

    /* renamed from: I */
    public static Object[] m54391I(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            C12698e eVar = C12698e.f31359b;
            return new Object[]{eVar, eVar};
        } else if (size != 1) {
            C12694a aVar = new C12694a(list);
            return new Object[]{aVar, aVar};
        } else {
            return new Object[]{list.get(0), list.get(1)};
        }
    }

    /* renamed from: S */
    public static C12692p m54392S(List<Object> list, boolean z, boolean z2) {
        if (!z || !z2) {
            int size = list.size();
            if (size >= 2 && (list.get(0) instanceof C12703i)) {
                C12703i iVar = (C12703i) list.get(0);
                if (iVar.f31375i == null && iVar.f31373g == null) {
                    C12692p S = m54392S(list.subList(2, size), z, z2);
                    C12703i h = iVar.mo29392h(S.mo29317g(), S.mo29316f());
                    return new C12692p(h, h);
                }
            }
            Object[] I = m54391I(list);
            if (z) {
                return new C12692p((C12706s) null, (C12705r) I[1]);
            }
            if (z2) {
                return new C12692p((C12706s) I[0], (C12705r) null);
            }
            return new C12692p((C12706s) I[0], (C12705r) I[1]);
        }
        throw new IllegalStateException("Builder has created neither a printer nor a parser");
    }

    /* renamed from: A */
    public C12693q mo29328A(String str) {
        if (str != null) {
            return mo29330C(new C12704j(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: B */
    public C12693q mo29329B(String str, String str2) {
        if (str != null && str2 != null) {
            return mo29330C(new C12700g(str, str2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: C */
    public final C12693q mo29330C(C12699f fVar) {
        Object obj;
        Object obj2;
        if (this.f31341f.size() > 0) {
            List<Object> list = this.f31341f;
            obj2 = list.get(list.size() - 2);
            List<Object> list2 = this.f31341f;
            obj = list2.get(list2.size() - 1);
        } else {
            obj2 = null;
            obj = null;
        }
        if (obj2 == null || obj == null || obj2 != obj || !(obj2 instanceof C12696c)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        mo29335H();
        C12696c cVar = new C12696c((C12696c) obj2, fVar);
        List<Object> list3 = this.f31341f;
        list3.set(list3.size() - 2, cVar);
        List<Object> list4 = this.f31341f;
        list4.set(list4.size() - 1, cVar);
        this.f31344i[cVar.mo29381g()] = cVar;
        return this;
    }

    /* renamed from: D */
    public C12693q mo29331D(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return mo29330C(new C12701h(strArr, strArr2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: E */
    public C12693q mo29332E() {
        mo29351f(2);
        return this;
    }

    /* renamed from: F */
    public C12693q mo29333F() {
        mo29351f(0);
        return this;
    }

    /* renamed from: G */
    public void mo29334G() {
        this.f31336a = 1;
        this.f31337b = 2;
        this.f31338c = 10;
        this.f31339d = false;
        this.f31340e = null;
        List<Object> list = this.f31341f;
        if (list == null) {
            this.f31341f = new ArrayList();
        } else {
            list.clear();
        }
        this.f31342g = false;
        this.f31343h = false;
        this.f31344i = new C12696c[10];
    }

    /* renamed from: H */
    public final void mo29335H() throws IllegalStateException {
        if (this.f31340e == null) {
            this.f31340e = null;
            return;
        }
        throw new IllegalStateException("Prefix not followed by field");
    }

    /* renamed from: J */
    public C12693q mo29336J(int i) {
        this.f31338c = i;
        return this;
    }

    /* renamed from: K */
    public C12693q mo29337K(int i) {
        this.f31336a = i;
        return this;
    }

    /* renamed from: L */
    public C12693q mo29338L() {
        this.f31337b = 4;
        return this;
    }

    /* renamed from: M */
    public C12693q mo29339M() {
        this.f31337b = 3;
        return this;
    }

    /* renamed from: N */
    public C12693q mo29340N() {
        this.f31337b = 5;
        return this;
    }

    /* renamed from: O */
    public C12693q mo29341O() {
        this.f31337b = 1;
        return this;
    }

    /* renamed from: P */
    public C12693q mo29342P() {
        this.f31337b = 2;
        return this;
    }

    /* renamed from: Q */
    public C12693q mo29343Q(boolean z) {
        this.f31339d = z;
        return this;
    }

    /* renamed from: R */
    public C12692p mo29344R() {
        C12692p S = m54392S(this.f31341f, this.f31342g, this.f31343h);
        for (C12696c cVar : this.f31344i) {
            if (cVar != null) {
                cVar.mo29380f(this.f31344i);
            }
        }
        this.f31344i = (C12696c[]) this.f31344i.clone();
        return S;
    }

    /* renamed from: T */
    public C12705r mo29345T() {
        if (this.f31343h) {
            return null;
        }
        return mo29344R().mo29316f();
    }

    /* renamed from: U */
    public C12706s mo29346U() {
        if (this.f31342g) {
            return null;
        }
        return mo29344R().mo29317g();
    }

    /* renamed from: b */
    public C12693q mo29347b(C12692p pVar) {
        if (pVar != null) {
            mo29335H();
            mo29349d(pVar.mo29317g(), pVar.mo29316f());
            return this;
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    /* renamed from: c */
    public C12693q mo29348c(C12706s sVar, C12705r rVar) {
        if (sVar == null && rVar == null) {
            throw new IllegalArgumentException("No printer or parser supplied");
        }
        mo29335H();
        mo29349d(sVar, rVar);
        return this;
    }

    /* renamed from: d */
    public final C12693q mo29349d(C12706s sVar, C12705r rVar) {
        boolean z;
        this.f31341f.add(sVar);
        this.f31341f.add(rVar);
        boolean z2 = this.f31342g;
        boolean z3 = true;
        if (sVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.f31342g = z | z2;
        boolean z4 = this.f31343h;
        if (rVar != null) {
            z3 = false;
        }
        this.f31343h = z4 | z3;
        return this;
    }

    /* renamed from: e */
    public C12693q mo29350e() {
        mo29351f(3);
        return this;
    }

    /* renamed from: f */
    public final void mo29351f(int i) {
        mo29352g(i, this.f31336a);
    }

    /* renamed from: g */
    public final void mo29352g(int i, int i2) {
        C12696c cVar = new C12696c(i2, this.f31337b, this.f31338c, this.f31339d, i, this.f31344i, this.f31340e, (C12699f) null);
        mo29349d(cVar, cVar);
        this.f31344i[i] = cVar;
        this.f31340e = null;
    }

    /* renamed from: h */
    public C12693q mo29353h() {
        mo29351f(4);
        return this;
    }

    /* renamed from: i */
    public C12693q mo29354i(String str) {
        if (str != null) {
            mo29335H();
            C12698e eVar = new C12698e(str);
            mo29349d(eVar, eVar);
            return this;
        }
        throw new IllegalArgumentException("Literal must not be null");
    }

    /* renamed from: j */
    public C12693q mo29355j() {
        mo29351f(7);
        return this;
    }

    /* renamed from: k */
    public C12693q mo29356k() {
        mo29352g(7, 3);
        return this;
    }

    /* renamed from: l */
    public C12693q mo29357l() {
        mo29351f(5);
        return this;
    }

    /* renamed from: m */
    public C12693q mo29358m() {
        mo29351f(1);
        return this;
    }

    /* renamed from: n */
    public C12693q mo29359n(String str) {
        if (str != null) {
            return mo29361p(new C12704j(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: o */
    public C12693q mo29360o(String str, String str2) {
        if (str != null && str2 != null) {
            return mo29361p(new C12700g(str, str2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public final C12693q mo29361p(C12699f fVar) {
        if (fVar != null) {
            C12699f fVar2 = this.f31340e;
            if (fVar2 != null) {
                fVar = new C12695b(fVar2, fVar);
            }
            this.f31340e = fVar;
            return this;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q */
    public C12693q mo29362q(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return mo29361p(new C12701h(strArr, strArr2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public C12693q mo29363r() {
        mo29351f(6);
        return this;
    }

    /* renamed from: s */
    public C12693q mo29364s() {
        mo29351f(8);
        return this;
    }

    /* renamed from: t */
    public C12693q mo29365t() {
        mo29351f(9);
        return this;
    }

    /* renamed from: u */
    public C12693q mo29366u(String str) {
        return mo29369x(str, str, (String[]) null, true, true);
    }

    /* renamed from: v */
    public C12693q mo29367v(String str, String str2) {
        return mo29369x(str, str2, (String[]) null, true, true);
    }

    /* renamed from: w */
    public C12693q mo29368w(String str, String str2, String[] strArr) {
        return mo29369x(str, str2, strArr, true, true);
    }

    /* renamed from: x */
    public final C12693q mo29369x(String str, String str2, String[] strArr, boolean z, boolean z2) {
        C12703i iVar;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        mo29335H();
        List<Object> list = this.f31341f;
        if (list.size() == 0) {
            if (z2 && !z) {
                C12698e eVar = C12698e.f31359b;
                C12703i iVar2 = new C12703i(str, str2, strArr, eVar, eVar, z, z2);
                mo29349d(iVar2, iVar2);
            }
            return this;
        }
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                iVar = null;
                break;
            } else if (list.get(i) instanceof C12703i) {
                iVar = (C12703i) list.get(i);
                list = list.subList(i + 1, list.size());
                break;
            } else {
                size = i - 1;
            }
        }
        List<Object> list2 = list;
        if (iVar == null || list2.size() != 0) {
            Object[] I = m54391I(list2);
            list2.clear();
            C12703i iVar3 = new C12703i(str, str2, strArr, (C12706s) I[0], (C12705r) I[1], z, z2);
            list2.add(iVar3);
            list2.add(iVar3);
            return this;
        }
        throw new IllegalStateException("Cannot have two adjacent separators");
    }

    /* renamed from: y */
    public C12693q mo29370y(String str) {
        return mo29369x(str, str, (String[]) null, false, true);
    }

    /* renamed from: z */
    public C12693q mo29371z(String str) {
        return mo29369x(str, str, (String[]) null, true, false);
    }

    /* renamed from: org.joda.time.format.q$c */
    public static class C12696c implements C12706s, C12705r {

        /* renamed from: a */
        public final int f31350a;

        /* renamed from: b */
        public final int f31351b;

        /* renamed from: c */
        public final int f31352c;

        /* renamed from: d */
        public final boolean f31353d;

        /* renamed from: e */
        public final int f31354e;

        /* renamed from: f */
        public final C12696c[] f31355f;

        /* renamed from: g */
        public final C12699f f31356g;

        /* renamed from: h */
        public final C12699f f31357h;

        public C12696c(int i, int i2, int i3, boolean z, int i4, C12696c[] cVarArr, C12699f fVar, C12699f fVar2) {
            this.f31350a = i;
            this.f31351b = i2;
            this.f31352c = i3;
            this.f31353d = z;
            this.f31354e = i4;
            this.f31355f = cVarArr;
            this.f31356g = fVar;
            this.f31357h = fVar2;
        }

        /* renamed from: a */
        public void mo29304a(Writer writer, C12715o oVar, Locale locale) throws IOException {
            long h = mo29382h(oVar);
            if (h != Long.MAX_VALUE) {
                int i = (int) h;
                if (this.f31354e >= 8) {
                    i = (int) (h / 1000);
                }
                C12699f fVar = this.f31356g;
                if (fVar != null) {
                    fVar.mo29376c(writer, i);
                }
                int i2 = this.f31350a;
                if (i2 <= 1) {
                    C12682h.m54169n(writer, i);
                } else {
                    C12682h.m54167l(writer, i, i2);
                }
                if (this.f31354e >= 8) {
                    int abs = (int) (Math.abs(h) % 1000);
                    if (this.f31354e == 8 || abs > 0) {
                        writer.write(46);
                        C12682h.m54167l(writer, abs, 3);
                    }
                }
                C12699f fVar2 = this.f31357h;
                if (fVar2 != null) {
                    fVar2.mo29376c(writer, i);
                }
            }
        }

        /* renamed from: b */
        public int mo29305b(C12709i iVar, String str, int i, Locale locale) {
            boolean z;
            int i2;
            int i3;
            C12699f fVar;
            int i4;
            char charAt;
            C12709i iVar2 = iVar;
            String str2 = str;
            int i5 = i;
            if (this.f31351b == 4) {
                z = true;
            } else {
                z = false;
            }
            if (i5 < str.length()) {
                C12699f fVar2 = this.f31356g;
                if (fVar2 != null) {
                    i5 = fVar2.mo29378e(str2, i5);
                    if (i5 >= 0) {
                        z = true;
                    } else if (!z) {
                        return ~i5;
                    } else {
                        return i5;
                    }
                }
                C12699f fVar3 = this.f31357h;
                int i6 = -1;
                if (fVar3 == null || z) {
                    i2 = -1;
                } else {
                    i2 = fVar3.mo29374a(str2, i5);
                    if (i2 >= 0) {
                        z = true;
                    } else if (!z) {
                        return ~i2;
                    } else {
                        return i2;
                    }
                }
                if (!z && !mo29383i(iVar.mo27841F1(), this.f31354e)) {
                    return i5;
                }
                if (i2 > 0) {
                    i3 = Math.min(this.f31352c, i2 - i5);
                } else {
                    i3 = Math.min(this.f31352c, str.length() - i5);
                }
                int i7 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (i7 < i3) {
                    int i8 = i5 + i7;
                    char charAt2 = str2.charAt(i8);
                    if (i7 == 0 && ((charAt2 == '-' || charAt2 == '+') && !this.f31353d)) {
                        if (charAt2 == '-') {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i9 = i7 + 1;
                        if (i9 >= i3 || (charAt = str2.charAt(i8 + 1)) < '0' || charAt > '9') {
                            break;
                        }
                        if (z3) {
                            i7 = i9;
                        } else {
                            i5++;
                        }
                        i3 = Math.min(i3 + 1, str.length() - i5);
                    } else {
                        if (charAt2 < '0' || charAt2 > '9') {
                            if ((charAt2 != '.' && charAt2 != ',') || (((i4 = this.f31354e) != 8 && i4 != 9) || i6 >= 0)) {
                                break;
                            }
                            i3 = Math.min(i3 + 1, str.length() - i5);
                            i6 = i8 + 1;
                        } else {
                            z2 = true;
                        }
                        i7++;
                    }
                }
                if (!z2) {
                    return ~i5;
                }
                if (i2 >= 0 && i5 + i7 != i2) {
                    return i5;
                }
                int i10 = this.f31354e;
                if (i10 != 8 && i10 != 9) {
                    mo29386l(iVar2, i10, mo29385k(str2, i5, i7));
                } else if (i6 < 0) {
                    mo29386l(iVar2, 6, mo29385k(str2, i5, i7));
                    mo29386l(iVar2, 7, 0);
                } else {
                    int i11 = 0;
                    int k = mo29385k(str2, i5, (i6 - i5) - 1);
                    mo29386l(iVar2, 6, k);
                    int i12 = (i5 + i7) - i6;
                    if (i12 > 0) {
                        if (i12 >= 3) {
                            i11 = mo29385k(str2, i6, 3);
                        } else {
                            int k2 = mo29385k(str2, i6, i12);
                            if (i12 == 1) {
                                i11 = k2 * 100;
                            } else {
                                i11 = k2 * 10;
                            }
                        }
                        if (z3 || k < 0) {
                            i11 = -i11;
                        }
                    }
                    mo29386l(iVar2, 7, i11);
                }
                int i13 = i5 + i7;
                if (i13 < 0 || (fVar = this.f31357h) == null) {
                    return i13;
                }
                return fVar.mo29378e(str2, i13);
            } else if (z) {
                return ~i5;
            } else {
                return i5;
            }
        }

        /* renamed from: c */
        public int mo29306c(C12715o oVar, int i, Locale locale) {
            if (i <= 0) {
                return 0;
            }
            return (this.f31351b == 4 || mo29382h(oVar) != Long.MAX_VALUE) ? 1 : 0;
        }

        /* renamed from: d */
        public void mo29307d(StringBuffer stringBuffer, C12715o oVar, Locale locale) {
            long h = mo29382h(oVar);
            if (h != Long.MAX_VALUE) {
                int i = (int) h;
                if (this.f31354e >= 8) {
                    i = (int) (h / 1000);
                }
                C12699f fVar = this.f31356g;
                if (fVar != null) {
                    fVar.mo29379f(stringBuffer, i);
                }
                int length = stringBuffer.length();
                int i2 = this.f31350a;
                if (i2 <= 1) {
                    C12682h.m54162g(stringBuffer, i);
                } else {
                    C12682h.m54158c(stringBuffer, i, i2);
                }
                if (this.f31354e >= 8) {
                    int abs = (int) (Math.abs(h) % 1000);
                    if (this.f31354e == 8 || abs > 0) {
                        if (h < 0 && h > -1000) {
                            stringBuffer.insert(length, '-');
                        }
                        stringBuffer.append('.');
                        C12682h.m54158c(stringBuffer, abs, 3);
                    }
                }
                C12699f fVar2 = this.f31357h;
                if (fVar2 != null) {
                    fVar2.mo29379f(stringBuffer, i);
                }
            }
        }

        /* renamed from: e */
        public int mo29308e(C12715o oVar, Locale locale) {
            int i;
            long h = mo29382h(oVar);
            if (h == Long.MAX_VALUE) {
                return 0;
            }
            int max = Math.max(C12682h.m54164i(h), this.f31350a);
            if (this.f31354e >= 8) {
                if (h < 0) {
                    i = 5;
                } else {
                    i = 4;
                }
                max = Math.max(max, i) + 1;
                if (this.f31354e == 9 && Math.abs(h) % 1000 == 0) {
                    max -= 4;
                }
                h /= 1000;
            }
            int i2 = (int) h;
            C12699f fVar = this.f31356g;
            if (fVar != null) {
                max += fVar.mo29375b(i2);
            }
            C12699f fVar2 = this.f31357h;
            if (fVar2 != null) {
                return max + fVar2.mo29375b(i2);
            }
            return max;
        }

        /* renamed from: f */
        public void mo29380f(C12696c[] cVarArr) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (C12696c cVar : cVarArr) {
                if (cVar != null && !equals(cVar)) {
                    hashSet.add(cVar.f31356g);
                    hashSet2.add(cVar.f31357h);
                }
            }
            C12699f fVar = this.f31356g;
            if (fVar != null) {
                fVar.mo29387g(hashSet);
            }
            C12699f fVar2 = this.f31357h;
            if (fVar2 != null) {
                fVar2.mo29387g(hashSet2);
            }
        }

        /* renamed from: g */
        public int mo29381g() {
            return this.f31354e;
        }

        /* renamed from: h */
        public long mo29382h(C12715o oVar) {
            PeriodType periodType;
            long j;
            int i;
            if (this.f31351b == 4) {
                periodType = null;
            } else {
                periodType = oVar.mo27841F1();
            }
            if (periodType != null && !mo29383i(periodType, this.f31354e)) {
                return Long.MAX_VALUE;
            }
            switch (this.f31354e) {
                case 0:
                    i = oVar.mo28694B1(DurationFieldType.m51466o());
                    break;
                case 1:
                    i = oVar.mo28694B1(DurationFieldType.m51462k());
                    break;
                case 2:
                    i = oVar.mo28694B1(DurationFieldType.m51464m());
                    break;
                case 3:
                    i = oVar.mo28694B1(DurationFieldType.m51456b());
                    break;
                case 4:
                    i = oVar.mo28694B1(DurationFieldType.m51459g());
                    break;
                case 5:
                    i = oVar.mo28694B1(DurationFieldType.m51461j());
                    break;
                case 6:
                    i = oVar.mo28694B1(DurationFieldType.m51463l());
                    break;
                case 7:
                    i = oVar.mo28694B1(DurationFieldType.m51460i());
                    break;
                case 8:
                case 9:
                    j = (((long) oVar.mo28694B1(DurationFieldType.m51463l())) * 1000) + ((long) oVar.mo28694B1(DurationFieldType.m51460i()));
                    break;
                default:
                    return Long.MAX_VALUE;
            }
            j = (long) i;
            if (j == 0) {
                int i2 = this.f31351b;
                if (i2 == 1) {
                    if (mo29384j(oVar)) {
                        C12696c[] cVarArr = this.f31355f;
                        int i3 = this.f31354e;
                        if (cVarArr[i3] == this) {
                            int min = Math.min(i3, 8);
                            while (true) {
                                min--;
                                if (min >= 0 && min <= 9) {
                                    if (!mo29383i(periodType, min) || this.f31355f[min] == null) {
                                    }
                                }
                            }
                        }
                    }
                    return Long.MAX_VALUE;
                } else if (i2 == 2) {
                    if (mo29384j(oVar)) {
                        C12696c[] cVarArr2 = this.f31355f;
                        int i4 = this.f31354e;
                        if (cVarArr2[i4] == this) {
                            for (int i5 = i4 + 1; i5 <= 9; i5++) {
                                if (mo29383i(periodType, i5) && this.f31355f[i5] != null) {
                                    return Long.MAX_VALUE;
                                }
                            }
                        }
                    }
                    return Long.MAX_VALUE;
                } else if (i2 != 5) {
                    return j;
                } else {
                    return Long.MAX_VALUE;
                }
            }
            return j;
        }

        /* renamed from: i */
        public boolean mo29383i(PeriodType periodType, int i) {
            switch (i) {
                case 0:
                    return periodType.mo28458j(DurationFieldType.m51466o());
                case 1:
                    return periodType.mo28458j(DurationFieldType.m51462k());
                case 2:
                    return periodType.mo28458j(DurationFieldType.m51464m());
                case 3:
                    return periodType.mo28458j(DurationFieldType.m51456b());
                case 4:
                    return periodType.mo28458j(DurationFieldType.m51459g());
                case 5:
                    return periodType.mo28458j(DurationFieldType.m51461j());
                case 6:
                    return periodType.mo28458j(DurationFieldType.m51463l());
                case 7:
                    return periodType.mo28458j(DurationFieldType.m51460i());
                case 8:
                case 9:
                    if (periodType.mo28458j(DurationFieldType.m51463l()) || periodType.mo28458j(DurationFieldType.m51460i())) {
                        return true;
                    }
                    return false;
                default:
                    return false;
            }
        }

        /* renamed from: j */
        public boolean mo29384j(C12715o oVar) {
            int size = oVar.size();
            for (int i = 0; i < size; i++) {
                if (oVar.getValue(i) != 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: k */
        public final int mo29385k(String str, int i, int i2) {
            if (i2 >= 10) {
                return Integer.parseInt(str.substring(i, i2 + i));
            }
            boolean z = false;
            if (i2 <= 0) {
                return 0;
            }
            int i3 = i + 1;
            char charAt = str.charAt(i);
            int i4 = i2 - 1;
            if (charAt == '-') {
                i4--;
                if (i4 < 0) {
                    return 0;
                }
                char charAt2 = str.charAt(i3);
                i3++;
                charAt = charAt2;
                z = true;
            }
            int i5 = charAt - '0';
            while (true) {
                int i6 = i4 - 1;
                if (i4 <= 0) {
                    break;
                }
                i3++;
                i5 = (((i5 << 3) + (i5 << 1)) + str.charAt(i3)) - 48;
                i4 = i6;
            }
            if (z) {
                return -i5;
            }
            return i5;
        }

        /* renamed from: l */
        public void mo29386l(C12709i iVar, int i, int i2) {
            switch (i) {
                case 0:
                    iVar.mo28357m0(i2);
                    return;
                case 1:
                    iVar.mo28330H1(i2);
                    return;
                case 2:
                    iVar.mo28351c1(i2);
                    return;
                case 3:
                    iVar.mo28368w1(i2);
                    return;
                case 4:
                    iVar.mo28359o0(i2);
                    return;
                case 5:
                    iVar.mo28342U0(i2);
                    return;
                case 6:
                    iVar.mo28373z1(i2);
                    return;
                case 7:
                    iVar.mo28333L0(i2);
                    return;
                default:
                    return;
            }
        }

        public C12696c(C12696c cVar, C12699f fVar) {
            this.f31350a = cVar.f31350a;
            this.f31351b = cVar.f31351b;
            this.f31352c = cVar.f31352c;
            this.f31353d = cVar.f31353d;
            this.f31354e = cVar.f31354e;
            this.f31355f = cVar.f31355f;
            this.f31356g = cVar.f31356g;
            C12699f fVar2 = cVar.f31357h;
            this.f31357h = fVar2 != null ? new C12695b(fVar2, fVar) : fVar;
        }
    }
}
