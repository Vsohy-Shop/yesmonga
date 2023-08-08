package org.joda.time;

import androidx.camera.view.C1814q;
import com.carrefour.fid.android.shared.util.C28932h;
import com.google.android.material.badge.C31132a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12682h;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.p014tz.C12722a;
import org.joda.time.p014tz.C12723b;
import org.joda.time.p014tz.C12724c;
import org.joda.time.p014tz.FixedDateTimeZone;
import p073j$.util.DesugarTimeZone;

public abstract class DateTimeZone implements Serializable {

    /* renamed from: a */
    public static final DateTimeZone f30651a = UTCDateTimeZone.f30804g;

    /* renamed from: b */
    public static final int f30652b = 86399999;

    /* renamed from: c */
    public static final AtomicReference<C12724c> f30653c = new AtomicReference<>();

    /* renamed from: d */
    public static final AtomicReference<C12723b> f30654d = new AtomicReference<>();

    /* renamed from: e */
    public static final AtomicReference<DateTimeZone> f30655e = new AtomicReference<>();

    /* renamed from: f */
    public static final String f30656f = "org/joda/time/tz/data";
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;

    public static final class LazyInit {

        /* renamed from: a */
        public static final Map<String, String> f30657a = m51401b();

        /* renamed from: b */
        public static final C12674b f30658b = m51400a();

        /* renamed from: a */
        public static C12674b m51400a() {
            return new DateTimeFormatterBuilder().mo29145V((String) null, true, 2, 4).mo29188u0().mo29230N(new BaseChronology() {
                private static final long serialVersionUID = -3128740902654445468L;

                /* renamed from: Q */
                public C12589a mo27834Q() {
                    return this;
                }

                /* renamed from: R */
                public C12589a mo27835R(DateTimeZone dateTimeZone) {
                    return this;
                }

                /* renamed from: s */
                public DateTimeZone mo27836s() {
                    return null;
                }

                public String toString() {
                    return C125881.class.getName();
                }
            });
        }

        /* renamed from: b */
        public static Map<String, String> m51401b() {
            HashMap hashMap = new HashMap();
            hashMap.put(C28932h.f70913W, "UTC");
            hashMap.put("WET", "WET");
            hashMap.put("CET", "CET");
            hashMap.put("MET", "CET");
            hashMap.put("ECT", "CET");
            hashMap.put("EET", "EET");
            hashMap.put("MIT", "Pacific/Apia");
            hashMap.put("HST", "Pacific/Honolulu");
            hashMap.put("AST", "America/Anchorage");
            hashMap.put("PST", "America/Los_Angeles");
            hashMap.put("MST", "America/Denver");
            hashMap.put("PNT", "America/Phoenix");
            hashMap.put("CST", "America/Chicago");
            hashMap.put("EST", "America/New_York");
            hashMap.put("IET", "America/Indiana/Indianapolis");
            hashMap.put("PRT", "America/Puerto_Rico");
            hashMap.put("CNT", "America/St_Johns");
            hashMap.put("AGT", "America/Argentina/Buenos_Aires");
            hashMap.put("BET", "America/Sao_Paulo");
            hashMap.put("ART", "Africa/Cairo");
            hashMap.put("CAT", "Africa/Harare");
            hashMap.put("EAT", "Africa/Addis_Ababa");
            hashMap.put("NET", "Asia/Yerevan");
            hashMap.put("PLT", "Asia/Karachi");
            hashMap.put("IST", "Asia/Kolkata");
            hashMap.put("BST", "Asia/Dhaka");
            hashMap.put("VST", "Asia/Ho_Chi_Minh");
            hashMap.put("CTT", "Asia/Shanghai");
            hashMap.put("JST", "Asia/Tokyo");
            hashMap.put("ACT", "Australia/Darwin");
            hashMap.put("AET", "Australia/Sydney");
            hashMap.put("SST", "Pacific/Guadalcanal");
            hashMap.put("NST", "Pacific/Auckland");
            return Collections.unmodifiableMap(hashMap);
        }
    }

    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;

        /* renamed from: a */
        public transient String f30659a;

        public Stub(String str) {
            this.f30659a = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.f30659a = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.m51367g(this.f30659a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.f30659a);
        }
    }

    public DateTimeZone(String str) {
        if (str != null) {
            this.iID = str;
            return;
        }
        throw new IllegalArgumentException("Id must not be null");
    }

    /* renamed from: H */
    public static int m51359H(String str) {
        return -((int) LazyInit.f30658b.mo29256s(str));
    }

    /* renamed from: J */
    public static String m51360J(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        C12682h.m54158c(stringBuffer, i2, 2);
        int i3 = i - (i2 * 3600000);
        int i4 = i3 / 60000;
        stringBuffer.append(C12361b.f30257h);
        C12682h.m54158c(stringBuffer, i4, 2);
        int i5 = i3 - (i4 * 60000);
        if (i5 == 0) {
            return stringBuffer.toString();
        }
        int i6 = i5 / 1000;
        stringBuffer.append(C12361b.f30257h);
        C12682h.m54158c(stringBuffer, i6, 2);
        int i7 = i5 - (i6 * 1000);
        if (i7 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        C12682h.m54158c(stringBuffer, i7, 3);
        return stringBuffer.toString();
    }

    /* renamed from: K */
    public static void m51361K(DateTimeZone dateTimeZone) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone != null) {
            f30655e.set(dateTimeZone);
            return;
        }
        throw new IllegalArgumentException("The datetime zone must not be null");
    }

    /* renamed from: L */
    public static void m51362L(C12723b bVar) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        if (bVar == null) {
            bVar = m51375o();
        }
        f30654d.set(bVar);
    }

    /* renamed from: M */
    public static void m51363M(C12724c cVar) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (cVar == null) {
            cVar = m51376p();
        } else {
            m51364O(cVar);
        }
        f30653c.set(cVar);
    }

    /* renamed from: O */
    public static C12724c m51364O(C12724c cVar) {
        Set<String> b = cVar.mo29466b();
        if (b == null || b.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        } else if (!b.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        } else if (f30651a.equals(cVar.mo29465a("UTC"))) {
            return cVar;
        } else {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
    }

    /* renamed from: d */
    public static String m51365d(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            int digit = Character.digit(sb.charAt(i), 10);
            if (digit >= 0) {
                sb.setCharAt(i, (char) (digit + 48));
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static DateTimeZone m51366f(String str, int i) {
        if (i == 0) {
            return f30651a;
        }
        return new FixedDateTimeZone(str, (String) null, i, i);
    }

    @FromString
    /* renamed from: g */
    public static DateTimeZone m51367g(String str) {
        if (str == null) {
            return m51374n();
        }
        if (str.equals("UTC")) {
            return f30651a;
        }
        DateTimeZone a = m51378z().mo29465a(str);
        if (a != null) {
            return a;
        }
        if (str.startsWith(C31132a.f74628J0) || str.startsWith("-")) {
            int H = m51359H(str);
            if (((long) H) == 0) {
                return f30651a;
            }
            return m51366f(m51360J(H), H);
        }
        throw new IllegalArgumentException("The datetime zone id '" + str + "' is not recognised");
    }

    /* renamed from: h */
    public static DateTimeZone m51368h(int i) throws IllegalArgumentException {
        return m51369i(i, 0);
    }

    /* renamed from: i */
    public static DateTimeZone m51369i(int i, int i2) throws IllegalArgumentException {
        int i3;
        if (i == 0 && i2 == 0) {
            return f30651a;
        }
        if (i < -23 || i > 23) {
            throw new IllegalArgumentException("Hours out of range: " + i);
        } else if (i2 < -59 || i2 > 59) {
            throw new IllegalArgumentException("Minutes out of range: " + i2);
        } else if (i <= 0 || i2 >= 0) {
            int i4 = i * 60;
            if (i4 < 0) {
                try {
                    i3 = i4 - Math.abs(i2);
                } catch (ArithmeticException unused) {
                    throw new IllegalArgumentException("Offset is too large");
                }
            } else {
                i3 = i4 + i2;
            }
            return m51370j(C12652e.m53798h(i3, 60000));
        } else {
            throw new IllegalArgumentException("Positive hours must not have negative minutes: " + i2);
        }
    }

    /* renamed from: j */
    public static DateTimeZone m51370j(int i) {
        if (i >= -86399999 && i <= 86399999) {
            return m51366f(m51360J(i), i);
        }
        throw new IllegalArgumentException("Millis out of range: " + i);
    }

    /* renamed from: k */
    public static DateTimeZone m51371k(TimeZone timeZone) {
        DateTimeZone dateTimeZone;
        char charAt;
        if (timeZone == null) {
            return m51374n();
        }
        String id = timeZone.getID();
        if (id == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        } else if (id.equals("UTC")) {
            return f30651a;
        } else {
            String m = m51373m(id);
            C12724c z = m51378z();
            if (m != null) {
                dateTimeZone = z.mo29465a(m);
            } else {
                dateTimeZone = null;
            }
            if (dateTimeZone == null) {
                dateTimeZone = z.mo29465a(id);
            }
            if (dateTimeZone != null) {
                return dateTimeZone;
            }
            if (m != null || (!id.startsWith("GMT+") && !id.startsWith("GMT-"))) {
                throw new IllegalArgumentException("The datetime zone id '" + id + "' is not recognised");
            }
            String substring = id.substring(3);
            if (substring.length() > 2 && (charAt = substring.charAt(1)) > '9' && Character.isDigit(charAt)) {
                substring = m51365d(substring);
            }
            int H = m51359H(substring);
            if (((long) H) == 0) {
                return f30651a;
            }
            return m51366f(m51360J(H), H);
        }
    }

    /* renamed from: l */
    public static Set<String> m51372l() {
        return m51378z().mo29466b();
    }

    /* renamed from: m */
    public static String m51373m(String str) {
        return LazyInit.f30657a.get(str);
    }

    /* renamed from: n */
    public static DateTimeZone m51374n() {
        DateTimeZone dateTimeZone = f30655e.get();
        if (dateTimeZone != null) {
            return dateTimeZone;
        }
        try {
            String property = System.getProperty("user.timezone");
            if (property != null) {
                dateTimeZone = m51367g(property);
            }
        } catch (RuntimeException unused) {
        }
        if (dateTimeZone == null) {
            try {
                dateTimeZone = m51371k(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (dateTimeZone == null) {
            dateTimeZone = f30651a;
        }
        AtomicReference<DateTimeZone> atomicReference = f30655e;
        if (!C1814q.m7242a(atomicReference, (Object) null, dateTimeZone)) {
            return atomicReference.get();
        }
        return dateTimeZone;
    }

    /* renamed from: o */
    public static C12723b m51375o() {
        Class<C12723b> cls = C12723b.class;
        C12723b bVar = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                Class<?> cls2 = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                if (cls.isAssignableFrom(cls2)) {
                    bVar = (C12723b) cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
                } else {
                    throw new IllegalArgumentException("System property referred to class that does not implement " + cls);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (SecurityException unused) {
        }
        if (bVar == null) {
            return new C12722a();
        }
        return bVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x006e */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.joda.time.p014tz.C12724c m51376p() {
        /*
            java.lang.Class<org.joda.time.tz.c> r0 = org.joda.time.p014tz.C12724c.class
            java.lang.String r1 = "org.joda.time.DateTimeZone.Provider"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ SecurityException -> 0x0050 }
            if (r1 == 0) goto L_0x0050
            java.lang.Class<org.joda.time.DateTimeZone> r2 = org.joda.time.DateTimeZone.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x0049 }
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch:{ Exception -> 0x0049 }
            boolean r2 = r0.isAssignableFrom(r1)     // Catch:{ Exception -> 0x0049 }
            if (r2 == 0) goto L_0x0032
            java.lang.Class r0 = r1.asSubclass(r0)     // Catch:{ Exception -> 0x0049 }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0049 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch:{ Exception -> 0x0049 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ Exception -> 0x0049 }
            org.joda.time.tz.c r0 = (org.joda.time.p014tz.C12724c) r0     // Catch:{ Exception -> 0x0049 }
            org.joda.time.tz.c r0 = m51364O(r0)     // Catch:{ Exception -> 0x0049 }
            return r0
        L_0x0032:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0049 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049 }
            r2.<init>()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r3 = "System property referred to class that does not implement "
            r2.append(r3)     // Catch:{ Exception -> 0x0049 }
            r2.append(r0)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0049 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0049 }
            throw r1     // Catch:{ Exception -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ SecurityException -> 0x0050 }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x0050 }
            throw r1     // Catch:{ SecurityException -> 0x0050 }
        L_0x0050:
            java.lang.String r0 = "org.joda.time.DateTimeZone.Folder"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x006e }
            if (r0 == 0) goto L_0x006e
            org.joda.time.tz.g r1 = new org.joda.time.tz.g     // Catch:{ Exception -> 0x0067 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0067 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0067 }
            r1.<init>((java.io.File) r2)     // Catch:{ Exception -> 0x0067 }
            org.joda.time.tz.c r0 = m51364O(r1)     // Catch:{ Exception -> 0x0067 }
            return r0
        L_0x0067:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ SecurityException -> 0x006e }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x006e }
            throw r1     // Catch:{ SecurityException -> 0x006e }
        L_0x006e:
            org.joda.time.tz.g r0 = new org.joda.time.tz.g     // Catch:{ Exception -> 0x007a }
            java.lang.String r1 = "org/joda/time/tz/data"
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x007a }
            org.joda.time.tz.c r0 = m51364O(r0)     // Catch:{ Exception -> 0x007a }
            return r0
        L_0x007a:
            r0 = move-exception
            r0.printStackTrace()
            org.joda.time.tz.d r0 = new org.joda.time.tz.d
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.m51376p():org.joda.time.tz.c");
    }

    /* renamed from: v */
    public static C12723b m51377v() {
        AtomicReference<C12723b> atomicReference = f30654d;
        C12723b bVar = atomicReference.get();
        if (bVar != null) {
            return bVar;
        }
        C12723b o = m51375o();
        if (!C1814q.m7242a(atomicReference, (Object) null, o)) {
            return atomicReference.get();
        }
        return o;
    }

    /* renamed from: z */
    public static C12724c m51378z() {
        AtomicReference<C12724c> atomicReference = f30653c;
        C12724c cVar = atomicReference.get();
        if (cVar != null) {
            return cVar;
        }
        C12724c p = m51376p();
        if (!C1814q.m7242a(atomicReference, (Object) null, p)) {
            return atomicReference.get();
        }
        return p;
    }

    /* renamed from: A */
    public final String mo27809A(long j) {
        return mo27810B(j, (Locale) null);
    }

    /* renamed from: B */
    public String mo27810B(long j, Locale locale) {
        String str;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String u = mo27829u(j);
        if (u == null) {
            return this.iID;
        }
        C12723b v = m51377v();
        if (v instanceof C12722a) {
            str = ((C12722a) v).mo29464g(locale, this.iID, u, mo27814F(j));
        } else {
            str = v.mo29459b(locale, this.iID, u);
        }
        if (str != null) {
            return str;
        }
        return m51360J(mo27830w(j));
    }

    /* renamed from: C */
    public abstract int mo27811C(long j);

    /* renamed from: D */
    public abstract boolean mo27812D();

    /* renamed from: E */
    public boolean mo27813E(LocalDateTime localDateTime) {
        if (mo27812D()) {
            return false;
        }
        try {
            localDateTime.mo28094q2(this);
            return false;
        } catch (IllegalInstantException unused) {
            return true;
        }
    }

    /* renamed from: F */
    public boolean mo27814F(long j) {
        return mo27830w(j) == mo27811C(j);
    }

    /* renamed from: G */
    public abstract long mo27815G(long j);

    /* renamed from: I */
    public abstract long mo27816I(long j);

    /* renamed from: N */
    public TimeZone mo27817N() {
        return DesugarTimeZone.getTimeZone(this.iID);
    }

    /* renamed from: a */
    public long mo27818a(long j, boolean z) {
        long j2 = j - 10800000;
        long w = (long) mo27830w(j2);
        long w2 = (long) mo27830w(10800000 + j);
        if (w <= w2) {
            return j;
        }
        long j3 = w - w2;
        long G = mo27815G(j2);
        long j4 = G - j3;
        long j5 = G + j3;
        if (j < j4 || j >= j5) {
            return j;
        }
        if (j - j4 >= j3) {
            if (z) {
                return j;
            }
            return j - j3;
        } else if (z) {
            return j + j3;
        } else {
            return j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo27819b(long r11, boolean r13) {
        /*
            r10 = this;
            int r0 = r10.mo27830w(r11)
            long r1 = (long) r0
            long r1 = r11 - r1
            int r3 = r10.mo27830w(r1)
            if (r0 == r3) goto L_0x003d
            if (r13 != 0) goto L_0x0011
            if (r0 >= 0) goto L_0x003d
        L_0x0011:
            long r4 = r10.mo27815G(r1)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 != 0) goto L_0x001f
            r4 = r6
        L_0x001f:
            long r1 = (long) r3
            long r1 = r11 - r1
            long r8 = r10.mo27815G(r1)
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r6 = r8
        L_0x002c:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x003d
            if (r13 != 0) goto L_0x0033
            goto L_0x003e
        L_0x0033:
            org.joda.time.IllegalInstantException r13 = new org.joda.time.IllegalInstantException
            java.lang.String r0 = r10.mo27824q()
            r13.<init>(r11, r0)
            throw r13
        L_0x003d:
            r0 = r3
        L_0x003e:
            long r0 = (long) r0
            long r2 = r11 - r0
            long r4 = r11 ^ r2
            r6 = 0
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x0057
            long r11 = r11 ^ r0
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 < 0) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            java.lang.String r12 = "Subtracting time zone offset caused overflow"
            r11.<init>(r12)
            throw r11
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.mo27819b(long, boolean):long");
    }

    /* renamed from: c */
    public long mo27820c(long j, boolean z, long j2) {
        int w = mo27830w(j2);
        long j3 = j - ((long) w);
        if (mo27830w(j3) == w) {
            return j3;
        }
        return mo27819b(j, z);
    }

    /* renamed from: e */
    public long mo27821e(long j) {
        long w = (long) mo27830w(j);
        long j2 = j + w;
        if ((j ^ j2) >= 0 || (j ^ w) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    public int hashCode() {
        return mo27824q().hashCode() + 57;
    }

    @ToString
    /* renamed from: q */
    public final String mo27824q() {
        return this.iID;
    }

    /* renamed from: r */
    public long mo27825r(DateTimeZone dateTimeZone, long j) {
        if (dateTimeZone == null) {
            dateTimeZone = m51374n();
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone2 == this) {
            return j;
        }
        return dateTimeZone2.mo27820c(mo27821e(j), false, j);
    }

    /* renamed from: s */
    public final String mo27826s(long j) {
        return mo27827t(j, (Locale) null);
    }

    /* renamed from: t */
    public String mo27827t(long j, Locale locale) {
        String str;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String u = mo27829u(j);
        if (u == null) {
            return this.iID;
        }
        C12723b v = m51377v();
        if (v instanceof C12722a) {
            str = ((C12722a) v).mo29461d(locale, this.iID, u, mo27814F(j));
        } else {
            str = v.mo29458a(locale, this.iID, u);
        }
        if (str != null) {
            return str;
        }
        return m51360J(mo27830w(j));
    }

    public String toString() {
        return mo27824q();
    }

    /* renamed from: u */
    public abstract String mo27829u(long j);

    /* renamed from: w */
    public abstract int mo27830w(long j);

    public Object writeReplace() throws ObjectStreamException {
        return new Stub(this.iID);
    }

    /* renamed from: x */
    public final int mo27832x(C12712l lVar) {
        if (lVar == null) {
            return mo27830w(C12641d.m53368c());
        }
        return mo27830w(lVar.mo27912k());
    }

    /* renamed from: y */
    public int mo27833y(long j) {
        int w = mo27830w(j);
        long j2 = j - ((long) w);
        int w2 = mo27830w(j2);
        if (w != w2) {
            if (w - w2 < 0) {
                long G = mo27815G(j2);
                long j3 = Long.MAX_VALUE;
                if (G == j2) {
                    G = Long.MAX_VALUE;
                }
                long j4 = j - ((long) w2);
                long G2 = mo27815G(j4);
                if (G2 != j4) {
                    j3 = G2;
                }
                if (G != j3) {
                    return w;
                }
            }
        } else if (w >= 0) {
            long I = mo27816I(j2);
            if (I < j2) {
                int w3 = mo27830w(I);
                if (j2 - I <= ((long) (w3 - w))) {
                    return w3;
                }
            }
        }
        return w2;
    }
}
