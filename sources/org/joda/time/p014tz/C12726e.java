package org.joda.time.p014tz;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.carrefour.fid.android.shared.util.C28932h;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

/* renamed from: org.joda.time.tz.e */
public class C12726e {

    /* renamed from: e */
    public static C12727a f31412e;

    /* renamed from: f */
    public static C12589a f31413f;

    /* renamed from: a */
    public Map<String, C12729c> f31414a = new HashMap();

    /* renamed from: b */
    public List<C12730d> f31415b = new ArrayList();

    /* renamed from: c */
    public List<String> f31416c = new ArrayList();

    /* renamed from: d */
    public List<String> f31417d = new ArrayList();

    /* renamed from: org.joda.time.tz.e$c */
    public static class C12729c {

        /* renamed from: a */
        public List<C12728b> f31431a;

        public C12729c(C12728b bVar) {
            ArrayList arrayList = new ArrayList();
            this.f31431a = arrayList;
            arrayList.add(bVar);
        }

        /* renamed from: a */
        public void mo29475a(DateTimeZoneBuilder dateTimeZoneBuilder, int i, String str) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f31431a.size(); i3++) {
                int i4 = this.f31431a.get(i3).f31429f;
                if (i4 < 0) {
                    i2 = Math.min(i2, i4);
                }
            }
            if (i2 < 0) {
                System.out.println("Fixed negative save values for rule '" + this.f31431a.get(0).f31424a + "'");
                i += i2;
                int indexOf = str.indexOf("/");
                if (indexOf > 0) {
                    str = str.substring(indexOf + 1) + "/" + str.substring(0, indexOf);
                }
            }
            dateTimeZoneBuilder.mo29405j(i);
            if (i2 < 0) {
                new C12728b(this.f31431a.get(0)).mo29473a(dateTimeZoneBuilder, i2, str);
            }
            for (int i5 = 0; i5 < this.f31431a.size(); i5++) {
                this.f31431a.get(i5).mo29473a(dateTimeZoneBuilder, i2, str);
            }
        }

        /* renamed from: b */
        public void mo29476b(C12728b bVar) {
            if (bVar.f31424a.equals(this.f31431a.get(0).f31424a)) {
                this.f31431a.add(bVar);
                return;
            }
            throw new IllegalArgumentException("Rule name mismatch");
        }
    }

    /* renamed from: org.joda.time.tz.e$d */
    public static class C12730d {

        /* renamed from: a */
        public final String f31432a;

        /* renamed from: b */
        public final int f31433b;

        /* renamed from: c */
        public final String f31434c;

        /* renamed from: d */
        public final String f31435d;

        /* renamed from: e */
        public final int f31436e;

        /* renamed from: f */
        public final C12727a f31437f;

        /* renamed from: g */
        public C12730d f31438g;

        public C12730d(StringTokenizer stringTokenizer) {
            this(stringTokenizer.nextToken(), stringTokenizer);
        }

        /* renamed from: b */
        public static void m54750b(C12730d dVar, DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, C12729c> map) {
            while (dVar != null) {
                String str = dVar.f31434c;
                if (str == null) {
                    dateTimeZoneBuilder.mo29405j(dVar.f31433b);
                    dateTimeZoneBuilder.mo29404i(dVar.f31435d, 0);
                } else {
                    try {
                        int i = C12726e.m54735i(str);
                        dateTimeZoneBuilder.mo29405j(dVar.f31433b);
                        dateTimeZoneBuilder.mo29404i(dVar.f31435d, i);
                    } catch (Exception unused) {
                        C12729c cVar = map.get(dVar.f31434c);
                        if (cVar != null) {
                            cVar.mo29475a(dateTimeZoneBuilder, dVar.f31433b, dVar.f31435d);
                        } else {
                            throw new IllegalArgumentException("Rules not found: " + dVar.f31434c);
                        }
                    }
                }
                int i2 = dVar.f31436e;
                if (i2 != Integer.MAX_VALUE) {
                    dVar.f31437f.mo29470a(dateTimeZoneBuilder, i2);
                    dVar = dVar.f31438g;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public void mo29477a(DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, C12729c> map) {
            m54750b(this, dateTimeZoneBuilder, map);
        }

        /* renamed from: c */
        public void mo29478c(StringTokenizer stringTokenizer) {
            C12730d dVar = this.f31438g;
            if (dVar != null) {
                dVar.mo29478c(stringTokenizer);
            } else {
                this.f31438g = new C12730d(this.f31432a, stringTokenizer);
            }
        }

        public String toString() {
            String str = "[Zone]\nName: " + this.f31432a + "\nOffsetMillis: " + this.f31433b + "\nRules: " + this.f31434c + "\nFormat: " + this.f31435d + "\nUntilYear: " + this.f31436e + "\n" + this.f31437f;
            if (this.f31438g == null) {
                return str;
            }
            return str + "...\n" + this.f31438g.toString();
        }

        public C12730d(String str, StringTokenizer stringTokenizer) {
            int i;
            this.f31432a = str.intern();
            this.f31433b = C12726e.m54735i(stringTokenizer.nextToken());
            this.f31434c = C12726e.m54734h(stringTokenizer.nextToken());
            this.f31435d = stringTokenizer.nextToken().intern();
            C12727a c = C12726e.m54730c();
            if (stringTokenizer.hasMoreTokens()) {
                i = Integer.parseInt(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    c = new C12727a(stringTokenizer);
                }
            } else {
                i = Integer.MAX_VALUE;
            }
            this.f31436e = i;
            this.f31437f = c;
        }
    }

    /* renamed from: b */
    public static C12589a m54729b() {
        if (f31413f == null) {
            f31413f = LenientChronology.m52992b0(ISOChronology.m52935c0());
        }
        return f31413f;
    }

    /* renamed from: c */
    public static C12727a m54730c() {
        if (f31412e == null) {
            f31412e = new C12727a();
        }
        return f31412e;
    }

    /* renamed from: d */
    public static void m54731d(String[] strArr) throws Exception {
        File file;
        if (strArr.length == 0) {
            m54738l();
            return;
        }
        File file2 = null;
        int i = 0;
        File file3 = null;
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= strArr.length) {
                break;
            }
            try {
                if ("-src".equals(strArr[i2])) {
                    i2++;
                    file2 = new File(strArr[i2]);
                } else if ("-dst".equals(strArr[i2])) {
                    i2++;
                    file3 = new File(strArr[i2]);
                } else if ("-verbose".equals(strArr[i2])) {
                    z = true;
                } else if ("-?".equals(strArr[i2])) {
                    m54738l();
                    return;
                }
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                m54738l();
                return;
            }
        }
        if (i2 >= strArr.length) {
            m54738l();
            return;
        }
        File[] fileArr = new File[(strArr.length - i2)];
        while (i2 < strArr.length) {
            if (file2 == null) {
                String str = strArr[i2];
            } else {
                file = new File(file2, strArr[i2]);
            }
            fileArr[i] = file;
            i2++;
            i++;
        }
        C12731f.m54753a(z);
        new C12726e().mo29467a(file3, fileArr);
    }

    /* renamed from: f */
    public static int m54732f(String str) {
        C12599c h = ISOChronology.m52935c0().mo28642h();
        return h.mo28828g(h.mo28818U(0, str, Locale.ENGLISH));
    }

    /* renamed from: g */
    public static int m54733g(String str) {
        C12599c E = ISOChronology.m52935c0().mo28619E();
        return E.mo28828g(E.mo28818U(0, str, Locale.ENGLISH));
    }

    /* renamed from: h */
    public static String m54734h(String str) {
        if (str.equals("-")) {
            return null;
        }
        return str;
    }

    /* renamed from: i */
    public static int m54735i(String str) {
        C12674b I = C12683i.m54179I();
        MutableDateTime mutableDateTime = new MutableDateTime(0, m54729b());
        boolean startsWith = str.startsWith("-");
        if (I.mo29252o(mutableDateTime, str, startsWith ? 1 : 0) != (!startsWith)) {
            int k = (int) mutableDateTime.mo27912k();
            if (startsWith) {
                return -k;
            }
            return k;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: j */
    public static int m54736j(String str, int i) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.equals("minimum") || lowerCase.equals("min")) {
            return Integer.MIN_VALUE;
        }
        if (lowerCase.equals("maximum") || lowerCase.equals("max")) {
            return Integer.MAX_VALUE;
        }
        if (lowerCase.equals("only")) {
            return i;
        }
        return Integer.parseInt(lowerCase);
    }

    /* renamed from: k */
    public static char m54737k(char c) {
        if (c != 'G') {
            if (c != 'S') {
                if (!(c == 'U' || c == 'Z' || c == 'g')) {
                    if (c != 's') {
                        if (c == 'u' || c == 'z') {
                            return C12361b.f30265p;
                        }
                        return 'w';
                    }
                }
            }
            return C15369g.f37987m;
        }
        return C12361b.f30265p;
    }

    /* renamed from: l */
    public static void m54738l() {
        System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        System.out.println("where possible options include:");
        System.out.println("  -src <directory>    Specify where to read source files");
        System.out.println("  -dst <directory>    Specify where to write generated files");
        System.out.println("  -verbose            Output verbosely (default false)");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0104, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0106, code lost:
        if (r1 < 0) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0108, code lost:
        r8 = r0.mo27816I(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010e, code lost:
        if (r8 == r5) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0112, code lost:
        if (r8 >= r3) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0115, code lost:
        r5 = ((java.lang.Long) r13.get(r1)).longValue() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0124, code lost:
        if (r5 == r8) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0126, code lost:
        java.lang.System.out.println("*r* Error in " + r17.mo27824q() + " " + new org.joda.time.DateTime(r8, (org.joda.time.C12589a) org.joda.time.chrono.ISOChronology.m52935c0()) + " != " + new org.joda.time.DateTime(r5, (org.joda.time.C12589a) org.joda.time.chrono.ISOChronology.m52935c0()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0160, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0161, code lost:
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return true;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m54739m(java.lang.String r16, org.joda.time.DateTimeZone r17) {
        /*
            r0 = r17
            java.lang.String r1 = r17.mo27824q()
            r2 = r16
            boolean r1 = r2.equals(r1)
            r2 = 1
            if (r1 != 0) goto L_0x0010
            return r2
        L_0x0010:
            org.joda.time.chrono.ISOChronology r1 = org.joda.time.chrono.ISOChronology.m52935c0()
            org.joda.time.c r1 = r1.mo28631S()
            r3 = 0
            r5 = 1850(0x73a, float:2.592E-42)
            long r6 = r1.mo28816S(r3, r5)
            org.joda.time.chrono.ISOChronology r1 = org.joda.time.chrono.ISOChronology.m52935c0()
            org.joda.time.c r1 = r1.mo28631S()
            r8 = 2050(0x802, float:2.873E-42)
            long r9 = r1.mo28816S(r3, r8)
            int r1 = r0.mo27830w(r6)
            int r11 = r0.mo27811C(r6)
            java.lang.String r12 = r0.mo27829u(r6)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x003f:
            long r14 = r0.mo27815G(r6)
            int r6 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            r7 = 0
            java.lang.String r2 = " "
            if (r6 == 0) goto L_0x00e4
            int r6 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0050
            goto L_0x00e4
        L_0x0050:
            int r6 = r0.mo27830w(r14)
            int r5 = r0.mo27811C(r14)
            java.lang.String r3 = r0.mo27829u(r14)
            if (r1 != r6) goto L_0x0090
            if (r11 != r5) goto L_0x0090
            boolean r1 = r12.equals(r3)
            if (r1 == 0) goto L_0x0090
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "*d* Error in "
            r3.append(r4)
            java.lang.String r0 = r17.mo27824q()
            r3.append(r0)
            r3.append(r2)
            org.joda.time.DateTime r0 = new org.joda.time.DateTime
            org.joda.time.chrono.ISOChronology r2 = org.joda.time.chrono.ISOChronology.m52935c0()
            r0.<init>((long) r14, (org.joda.time.C12589a) r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.println(r0)
            return r7
        L_0x0090:
            if (r3 == 0) goto L_0x00b2
            int r1 = r3.length()
            r4 = 3
            if (r1 >= r4) goto L_0x00a2
            java.lang.String r1 = "??"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00a2
            goto L_0x00b2
        L_0x00a2:
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r13.add(r1)
            r12 = r3
            r1 = r6
            r6 = r14
            r2 = 1
            r3 = 0
            r5 = 1850(0x73a, float:2.592E-42)
            goto L_0x003f
        L_0x00b2:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "*s* Error in "
            r4.append(r5)
            java.lang.String r0 = r17.mo27824q()
            r4.append(r0)
            r4.append(r2)
            org.joda.time.DateTime r0 = new org.joda.time.DateTime
            org.joda.time.chrono.ISOChronology r2 = org.joda.time.chrono.ISOChronology.m52935c0()
            r0.<init>((long) r14, (org.joda.time.C12589a) r2)
            r4.append(r0)
            java.lang.String r0 = ", nameKey="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            r1.println(r0)
            return r7
        L_0x00e4:
            org.joda.time.chrono.ISOChronology r1 = org.joda.time.chrono.ISOChronology.m52935c0()
            org.joda.time.c r1 = r1.mo28631S()
            r3 = 0
            long r5 = r1.mo28816S(r3, r8)
            org.joda.time.chrono.ISOChronology r1 = org.joda.time.chrono.ISOChronology.m52935c0()
            org.joda.time.c r1 = r1.mo28631S()
            r8 = 1850(0x73a, float:2.592E-42)
            long r3 = r1.mo28816S(r3, r8)
            int r1 = r13.size()
        L_0x0104:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0163
            long r8 = r0.mo27816I(r5)
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0163
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0115
            goto L_0x0163
        L_0x0115:
            java.lang.Object r5 = r13.get(r1)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r10 = 1
            long r5 = r5 - r10
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0161
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "*r* Error in "
            r3.append(r4)
            java.lang.String r0 = r17.mo27824q()
            r3.append(r0)
            r3.append(r2)
            org.joda.time.DateTime r0 = new org.joda.time.DateTime
            org.joda.time.chrono.ISOChronology r2 = org.joda.time.chrono.ISOChronology.m52935c0()
            r0.<init>((long) r8, (org.joda.time.C12589a) r2)
            r3.append(r0)
            java.lang.String r0 = " != "
            r3.append(r0)
            org.joda.time.DateTime r0 = new org.joda.time.DateTime
            org.joda.time.chrono.ISOChronology r2 = org.joda.time.chrono.ISOChronology.m52935c0()
            r0.<init>((long) r5, (org.joda.time.C12589a) r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.println(r0)
            return r7
        L_0x0161:
            r5 = r8
            goto L_0x0104
        L_0x0163:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p014tz.C12726e.m54739m(java.lang.String, org.joda.time.DateTimeZone):boolean");
    }

    /* renamed from: o */
    public static void m54740o(DataOutputStream dataOutputStream, Map<String, DateTimeZone> map) throws IOException {
        if (dataOutputStream != null) {
            HashMap hashMap = new HashMap(map.size());
            TreeMap treeMap = new TreeMap();
            short s = 0;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (!hashMap.containsKey(str)) {
                    Short valueOf = Short.valueOf(s);
                    hashMap.put(str, valueOf);
                    treeMap.put(valueOf, str);
                    s = (short) (s + 1);
                    if (s == 0) {
                        throw new InternalError("Too many time zone ids");
                    }
                }
                String q = ((DateTimeZone) next.getValue()).mo27824q();
                if (!hashMap.containsKey(q)) {
                    Short valueOf2 = Short.valueOf(s);
                    hashMap.put(q, valueOf2);
                    treeMap.put(valueOf2, q);
                    s = (short) (s + 1);
                    if (s == 0) {
                        throw new InternalError("Too many time zone ids");
                    }
                }
            }
            dataOutputStream.writeShort(treeMap.size());
            for (String writeUTF : treeMap.values()) {
                dataOutputStream.writeUTF(writeUTF);
            }
            dataOutputStream.writeShort(map.size());
            for (Map.Entry next2 : map.entrySet()) {
                dataOutputStream.writeShort(((Short) hashMap.get((String) next2.getKey())).shortValue());
                dataOutputStream.writeShort(((Short) hashMap.get(((DateTimeZone) next2.getValue()).mo27824q())).shortValue());
            }
            return;
        }
        throw new IllegalArgumentException("DataOutputStream must not be null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, org.joda.time.DateTimeZone> mo29467a(java.io.File r12, java.io.File[] r13) throws java.io.IOException {
        /*
            r11 = this;
            r0 = 0
            if (r13 == 0) goto L_0x0033
            r1 = r0
        L_0x0004:
            int r2 = r13.length
            if (r1 >= r2) goto L_0x0033
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x002c }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x002c }
            r5 = r13[r1]     // Catch:{ all -> 0x002c }
            r4.<init>(r5)     // Catch:{ all -> 0x002c }
            r3.<init>(r4)     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "backward"
            r4 = r13[r1]     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0029 }
            r11.mo29468e(r3, r2)     // Catch:{ all -> 0x0029 }
            r3.close()
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0029:
            r12 = move-exception
            r2 = r3
            goto L_0x002d
        L_0x002c:
            r12 = move-exception
        L_0x002d:
            if (r2 == 0) goto L_0x0032
            r2.close()
        L_0x0032:
            throw r12
        L_0x0033:
            if (r12 == 0) goto L_0x0077
            boolean r13 = r12.exists()
            if (r13 != 0) goto L_0x0059
            boolean r13 = r12.mkdirs()
            if (r13 == 0) goto L_0x0042
            goto L_0x0059
        L_0x0042:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Destination directory doesn't exist and cannot be created: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x0059:
            boolean r13 = r12.isDirectory()
            if (r13 == 0) goto L_0x0060
            goto L_0x0077
        L_0x0060:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Destination is not a directory: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x0077:
            java.util.TreeMap r13 = new java.util.TreeMap
            r13.<init>()
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "Writing zoneinfo files"
            r2.println(r3)
            r2 = r0
        L_0x0089:
            java.util.List<org.joda.time.tz.e$d> r3 = r11.f31415b
            int r3 = r3.size()
            r4 = 1
            if (r2 >= r3) goto L_0x00ca
            java.util.List<org.joda.time.tz.e$d> r3 = r11.f31415b
            java.lang.Object r3 = r3.get(r2)
            org.joda.time.tz.e$d r3 = (org.joda.time.p014tz.C12726e.C12730d) r3
            org.joda.time.tz.DateTimeZoneBuilder r5 = new org.joda.time.tz.DateTimeZoneBuilder
            r5.<init>()
            java.util.Map<java.lang.String, org.joda.time.tz.e$c> r6 = r11.f31414a
            r3.mo29477a(r5, r6)
            java.lang.String r6 = r3.f31432a
            org.joda.time.DateTimeZone r4 = r5.mo29406k(r6, r4)
            java.lang.String r6 = r4.mo27824q()
            boolean r6 = m54739m(r6, r4)
            if (r6 == 0) goto L_0x00c7
            java.lang.String r6 = r4.mo27824q()
            r13.put(r6, r4)
            java.lang.String r6 = r4.mo27824q()
            r1.put(r6, r3)
            if (r12 == 0) goto L_0x00c7
            r11.mo29469n(r12, r5, r4)
        L_0x00c7:
            int r2 = r2 + 1
            goto L_0x0089
        L_0x00ca:
            r2 = r0
        L_0x00cb:
            java.util.List<java.lang.String> r3 = r11.f31416c
            int r3 = r3.size()
            java.lang.String r5 = " -> "
            java.lang.String r6 = "' to"
            java.lang.String r7 = "' to link alias '"
            if (r2 >= r3) goto L_0x0169
            java.util.List<java.lang.String> r3 = r11.f31416c
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List<java.lang.String> r8 = r11.f31416c
            int r9 = r2 + 1
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r1.get(r3)
            org.joda.time.tz.e$d r9 = (org.joda.time.p014tz.C12726e.C12730d) r9
            if (r9 != 0) goto L_0x0113
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Cannot find source zone '"
            r9.append(r10)
            r9.append(r3)
            r9.append(r7)
            r9.append(r8)
            r9.append(r6)
            java.lang.String r3 = r9.toString()
            r5.println(r3)
            goto L_0x0165
        L_0x0113:
            org.joda.time.tz.DateTimeZoneBuilder r6 = new org.joda.time.tz.DateTimeZoneBuilder
            r6.<init>()
            java.util.Map<java.lang.String, org.joda.time.tz.e$c> r7 = r11.f31414a
            r9.mo29477a(r6, r7)
            org.joda.time.DateTimeZone r7 = r6.mo29406k(r8, r4)
            java.lang.String r9 = r7.mo27824q()
            boolean r9 = m54739m(r9, r7)
            if (r9 == 0) goto L_0x0137
            java.lang.String r9 = r7.mo27824q()
            r13.put(r9, r7)
            if (r12 == 0) goto L_0x0137
            r11.mo29469n(r12, r6, r7)
        L_0x0137:
            java.lang.String r6 = r7.mo27824q()
            r13.put(r6, r7)
            boolean r6 = org.joda.time.p014tz.C12731f.m54754b()
            if (r6 == 0) goto L_0x0165
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Good link: "
            r7.append(r9)
            r7.append(r8)
            r7.append(r5)
            r7.append(r3)
            java.lang.String r3 = " revived"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r6.println(r3)
        L_0x0165:
            int r2 = r2 + 2
            goto L_0x00cb
        L_0x0169:
            r1 = r0
        L_0x016a:
            r2 = 2
            if (r1 >= r2) goto L_0x01e1
            r2 = r0
        L_0x016e:
            java.util.List<java.lang.String> r3 = r11.f31417d
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x01de
            java.util.List<java.lang.String> r3 = r11.f31417d
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List<java.lang.String> r4 = r11.f31417d
            int r8 = r2 + 1
            java.lang.Object r4 = r4.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r13.get(r3)
            org.joda.time.DateTimeZone r8 = (org.joda.time.DateTimeZone) r8
            if (r8 != 0) goto L_0x01b2
            if (r1 <= 0) goto L_0x01db
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Cannot find time zone '"
            r9.append(r10)
            r9.append(r3)
            r9.append(r7)
            r9.append(r4)
            r9.append(r6)
            java.lang.String r3 = r9.toString()
            r8.println(r3)
            goto L_0x01db
        L_0x01b2:
            r13.put(r4, r8)
            boolean r3 = org.joda.time.p014tz.C12731f.m54754b()
            if (r3 == 0) goto L_0x01db
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Back link: "
            r9.append(r10)
            r9.append(r4)
            r9.append(r5)
            java.lang.String r4 = r8.mo27824q()
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r3.println(r4)
        L_0x01db:
            int r2 = r2 + 2
            goto L_0x016e
        L_0x01de:
            int r1 = r1 + 1
            goto L_0x016a
        L_0x01e1:
            if (r12 == 0) goto L_0x0222
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Writing ZoneInfoMap"
            r0.println(r1)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "ZoneInfoMap"
            r0.<init>(r12, r1)
            java.io.File r12 = r0.getParentFile()
            boolean r12 = r12.exists()
            if (r12 != 0) goto L_0x0202
            java.io.File r12 = r0.getParentFile()
            r12.mkdirs()
        L_0x0202:
            java.io.FileOutputStream r12 = new java.io.FileOutputStream
            r12.<init>(r0)
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r12)
            java.util.TreeMap r12 = new java.util.TreeMap     // Catch:{ all -> 0x021d }
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ all -> 0x021d }
            r12.<init>(r1)     // Catch:{ all -> 0x021d }
            r12.putAll(r13)     // Catch:{ all -> 0x021d }
            m54740o(r0, r12)     // Catch:{ all -> 0x021d }
            r0.close()
            goto L_0x0222
        L_0x021d:
            r12 = move-exception
            r0.close()
            throw r12
        L_0x0222:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p014tz.C12726e.mo29467a(java.io.File, java.io.File[]):java.util.Map");
    }

    /* renamed from: e */
    public void mo29468e(BufferedReader bufferedReader, boolean z) throws IOException {
        while (true) {
            C12730d dVar = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String trim = readLine.trim();
                    if (!(trim.length() == 0 || trim.charAt(0) == '#')) {
                        int indexOf = readLine.indexOf(35);
                        if (indexOf >= 0) {
                            readLine = readLine.substring(0, indexOf);
                        }
                        StringTokenizer stringTokenizer = new StringTokenizer(readLine, " \t");
                        if (!Character.isWhitespace(readLine.charAt(0)) || !stringTokenizer.hasMoreTokens()) {
                            if (dVar != null) {
                                this.f31415b.add(dVar);
                            }
                            if (!stringTokenizer.hasMoreTokens()) {
                                break;
                            }
                            String nextToken = stringTokenizer.nextToken();
                            if (nextToken.equalsIgnoreCase("Rule")) {
                                C12728b bVar = new C12728b(stringTokenizer);
                                C12729c cVar = this.f31414a.get(bVar.f31424a);
                                if (cVar == null) {
                                    this.f31414a.put(bVar.f31424a, new C12729c(bVar));
                                } else {
                                    cVar.mo29476b(bVar);
                                }
                            } else if (nextToken.equalsIgnoreCase("Zone")) {
                                if (stringTokenizer.countTokens() >= 4) {
                                    dVar = new C12730d(stringTokenizer);
                                } else {
                                    throw new IllegalArgumentException("Attempting to create a Zone from an incomplete tokenizer");
                                }
                            } else if (nextToken.equalsIgnoreCase("Link")) {
                                String nextToken2 = stringTokenizer.nextToken();
                                String nextToken3 = stringTokenizer.nextToken();
                                if (z || nextToken3.equals("US/Pacific-New") || nextToken3.startsWith("Etc/") || nextToken3.equals(C28932h.f70913W)) {
                                    this.f31417d.add(nextToken2);
                                    this.f31417d.add(nextToken3);
                                } else {
                                    this.f31416c.add(nextToken2);
                                    this.f31416c.add(nextToken3);
                                }
                            } else {
                                System.out.println("Unknown line: " + readLine);
                            }
                        } else if (dVar != null) {
                            dVar.mo29478c(stringTokenizer);
                        }
                    }
                } else if (dVar != null) {
                    this.f31415b.add(dVar);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: n */
    public final void mo29469n(File file, DateTimeZoneBuilder dateTimeZoneBuilder, DateTimeZone dateTimeZone) throws IOException {
        if (C12731f.m54754b()) {
            PrintStream printStream = System.out;
            printStream.println("Writing " + dateTimeZone.mo27824q());
        }
        File file2 = new File(file, dateTimeZone.mo27824q());
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            dateTimeZoneBuilder.mo29408n(dateTimeZone.mo27824q(), fileOutputStream);
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(file2);
            DateTimeZone g = DateTimeZoneBuilder.m54637g(fileInputStream, dateTimeZone.mo27824q());
            fileInputStream.close();
            if (!dateTimeZone.equals(g)) {
                PrintStream printStream2 = System.out;
                printStream2.println("*e* Error in " + dateTimeZone.mo27824q() + ": Didn't read properly from file");
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    /* renamed from: org.joda.time.tz.e$a */
    public static class C12727a {

        /* renamed from: a */
        public final int f31418a;

        /* renamed from: b */
        public final int f31419b;

        /* renamed from: c */
        public final int f31420c;

        /* renamed from: d */
        public final boolean f31421d;

        /* renamed from: e */
        public final int f31422e;

        /* renamed from: f */
        public final char f31423f;

        public C12727a() {
            this.f31418a = 1;
            this.f31419b = 1;
            this.f31420c = 0;
            this.f31421d = false;
            this.f31422e = 0;
            this.f31423f = 'w';
        }

        /* renamed from: a */
        public void mo29470a(DateTimeZoneBuilder dateTimeZoneBuilder, int i) {
            dateTimeZoneBuilder.mo29400a(i, this.f31423f, this.f31418a, this.f31419b, this.f31420c, this.f31421d, this.f31422e);
        }

        /* renamed from: b */
        public void mo29471b(DateTimeZoneBuilder dateTimeZoneBuilder, String str, int i, int i2, int i3) {
            dateTimeZoneBuilder.mo29401b(str, i, i2, i3, this.f31423f, this.f31418a, this.f31419b, this.f31420c, this.f31421d, this.f31422e);
        }

        public String toString() {
            return "MonthOfYear: " + this.f31418a + "\nDayOfMonth: " + this.f31419b + "\nDayOfWeek: " + this.f31420c + "\nAdvanceDayOfWeek: " + this.f31421d + "\nMillisOfDay: " + this.f31422e + "\nZoneChar: " + this.f31423f + "\n";
        }

        public C12727a(StringTokenizer stringTokenizer) {
            int i;
            boolean z;
            int i2;
            int i3;
            LocalDate localDate;
            int i4 = 1;
            int i5 = 0;
            char c = 'w';
            if (stringTokenizer.hasMoreTokens()) {
                int g = C12726e.m54733g(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    if (nextToken.startsWith("last")) {
                        z = false;
                        i3 = C12726e.m54732f(nextToken.substring(4));
                        i2 = -1;
                    } else {
                        try {
                            i2 = Integer.parseInt(nextToken);
                            i3 = 0;
                            z = false;
                        } catch (NumberFormatException unused) {
                            int indexOf = nextToken.indexOf(">=");
                            if (indexOf > 0) {
                                int parseInt = Integer.parseInt(nextToken.substring(indexOf + 2));
                                i3 = C12726e.m54732f(nextToken.substring(0, indexOf));
                                i2 = parseInt;
                                z = true;
                            } else {
                                int indexOf2 = nextToken.indexOf("<=");
                                if (indexOf2 > 0) {
                                    int parseInt2 = Integer.parseInt(nextToken.substring(indexOf2 + 2));
                                    i3 = C12726e.m54732f(nextToken.substring(0, indexOf2));
                                    i2 = parseInt2;
                                    z = false;
                                } else {
                                    throw new IllegalArgumentException(nextToken);
                                }
                            }
                        }
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken2 = stringTokenizer.nextToken();
                        c = C12726e.m54737k(nextToken2.charAt(nextToken2.length() - 1));
                        if (!nextToken2.equals("24:00")) {
                            i5 = C12726e.m54735i(nextToken2);
                        } else if (g == 12 && i2 == 31) {
                            i5 = C12726e.m54735i("23:59:59.999");
                        } else {
                            if (i2 == -1) {
                                localDate = new LocalDate(2001, g, 1).mo28004w1(1);
                            } else {
                                localDate = new LocalDate(2001, g, i2).mo27992q1(1);
                            }
                            boolean z2 = (i2 == -1 || i3 == 0) ? false : true;
                            int B0 = localDate.mo27935B0();
                            int R1 = localDate.mo27957R1();
                            i3 = i3 != 0 ? (((i3 - 1) + 1) % 7) + 1 : i3;
                            z = z2;
                            i4 = B0;
                            i2 = R1;
                            i = i5;
                            i5 = i3;
                        }
                    }
                    i4 = g;
                    i = i5;
                    i5 = i3;
                } else {
                    i2 = 1;
                    i = 0;
                    z = false;
                    i4 = g;
                }
            } else {
                i2 = 1;
                i = 0;
                z = false;
            }
            this.f31418a = i4;
            this.f31419b = i2;
            this.f31420c = i5;
            this.f31421d = z;
            this.f31422e = i;
            this.f31423f = c;
        }
    }

    /* renamed from: org.joda.time.tz.e$b */
    public static class C12728b {

        /* renamed from: a */
        public final String f31424a;

        /* renamed from: b */
        public final int f31425b;

        /* renamed from: c */
        public final int f31426c;

        /* renamed from: d */
        public final String f31427d;

        /* renamed from: e */
        public final C12727a f31428e;

        /* renamed from: f */
        public final int f31429f;

        /* renamed from: g */
        public final String f31430g;

        public C12728b(StringTokenizer stringTokenizer) {
            if (stringTokenizer.countTokens() >= 6) {
                this.f31424a = stringTokenizer.nextToken().intern();
                int j = C12726e.m54736j(stringTokenizer.nextToken(), 0);
                this.f31425b = j;
                int j2 = C12726e.m54736j(stringTokenizer.nextToken(), j);
                this.f31426c = j2;
                if (j2 >= j) {
                    this.f31427d = C12726e.m54734h(stringTokenizer.nextToken());
                    this.f31428e = new C12727a(stringTokenizer);
                    this.f31429f = C12726e.m54735i(stringTokenizer.nextToken());
                    this.f31430g = C12726e.m54734h(stringTokenizer.nextToken());
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Attempting to create a Rule from an incomplete tokenizer");
        }

        /* renamed from: b */
        public static String m54746b(String str, int i, String str2) {
            String str3;
            int indexOf = str.indexOf(47);
            if (indexOf <= 0) {
                int indexOf2 = str.indexOf("%s");
                if (indexOf2 < 0) {
                    return str;
                }
                String substring = str.substring(0, indexOf2);
                String substring2 = str.substring(indexOf2 + 2);
                if (str2 == null) {
                    str3 = substring.concat(substring2);
                } else {
                    str3 = substring + str2 + substring2;
                }
                return str3.intern();
            } else if (i == 0) {
                return str.substring(0, indexOf).intern();
            } else {
                return str.substring(indexOf + 1).intern();
            }
        }

        /* renamed from: a */
        public void mo29473a(DateTimeZoneBuilder dateTimeZoneBuilder, int i, String str) {
            int i2 = this.f31429f + (-i);
            DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder;
            this.f31428e.mo29471b(dateTimeZoneBuilder2, m54746b(str, i2, this.f31430g), i2, this.f31425b, this.f31426c);
        }

        public String toString() {
            return "[Rule]\nName: " + this.f31424a + "\nFromYear: " + this.f31425b + "\nToYear: " + this.f31426c + "\nType: " + this.f31427d + "\n" + this.f31428e + "SaveMillis: " + this.f31429f + "\nLetterS: " + this.f31430g + "\n";
        }

        public C12728b(C12728b bVar) {
            this.f31424a = bVar.f31424a;
            this.f31425b = 1800;
            this.f31426c = bVar.f31425b;
            this.f31427d = null;
            this.f31428e = bVar.f31428e;
            this.f31429f = 0;
            this.f31430g = bVar.f31430g;
        }
    }
}
