package org.joda.time.p014tz;

import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.g */
public class C12733g implements C12724c {

    /* renamed from: a */
    public final File f31440a;

    /* renamed from: b */
    public final String f31441b;

    /* renamed from: c */
    public final ClassLoader f31442c;

    /* renamed from: d */
    public final Map<String, Object> f31443d;

    /* renamed from: e */
    public final Set<String> f31444e;

    /* renamed from: org.joda.time.tz.g$a */
    public class C12734a implements PrivilegedAction<InputStream> {

        /* renamed from: a */
        public final /* synthetic */ String f31445a;

        public C12734a(String str) {
            this.f31445a = str;
        }

        /* renamed from: a */
        public InputStream run() {
            if (C12733g.this.f31442c != null) {
                return C12733g.this.f31442c.getResourceAsStream(this.f31445a);
            }
            return ClassLoader.getSystemResourceAsStream(this.f31445a);
        }
    }

    public C12733g() throws IOException {
        this(DateTimeZone.f30656f);
    }

    /* renamed from: e */
    public static Map<String, Object> m54757e(InputStream inputStream) throws IOException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            m54758g(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.f30651a));
            return concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: g */
    public static void m54758g(DataInputStream dataInputStream, Map<String, Object> map) throws IOException {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        int i = 0;
        for (int i2 = 0; i2 < readUnsignedShort; i2++) {
            strArr[i2] = dataInputStream.readUTF().intern();
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        while (i < readUnsignedShort2) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                i++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    /* renamed from: a */
    public DateTimeZone mo29465a(String str) {
        Object obj;
        if (str == null || (obj = this.f31443d.get(str)) == null) {
            return null;
        }
        if (obj instanceof SoftReference) {
            DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
            if (dateTimeZone != null) {
                return dateTimeZone;
            }
            return mo29482d(str);
        } else if (str.equals(obj)) {
            return mo29482d(str);
        } else {
            return mo29465a((String) obj);
        }
    }

    /* renamed from: b */
    public Set<String> mo29466b() {
        return this.f31444e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c A[SYNTHETIC, Splitter:B:19:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[SYNTHETIC, Splitter:B:24:0x0032] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.joda.time.DateTimeZone mo29482d(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r1 = r5.mo29483f(r6)     // Catch:{ IOException -> 0x0020, all -> 0x001e }
            org.joda.time.DateTimeZone r2 = org.joda.time.p014tz.DateTimeZoneBuilder.m54637g(r1, r6)     // Catch:{ IOException -> 0x001c }
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.f31443d     // Catch:{ IOException -> 0x001c }
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference     // Catch:{ IOException -> 0x001c }
            r4.<init>(r2)     // Catch:{ IOException -> 0x001c }
            r3.put(r6, r4)     // Catch:{ IOException -> 0x001c }
            if (r1 == 0) goto L_0x0018
            r1.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r2
        L_0x0019:
            r6 = move-exception
            r0 = r1
            goto L_0x0030
        L_0x001c:
            r2 = move-exception
            goto L_0x0022
        L_0x001e:
            r6 = move-exception
            goto L_0x0030
        L_0x0020:
            r2 = move-exception
            r1 = r0
        L_0x0022:
            r5.mo29484h(r2)     // Catch:{ all -> 0x0019 }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f31443d     // Catch:{ all -> 0x0019 }
            r2.remove(r6)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r0
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p014tz.C12733g.mo29482d(java.lang.String):org.joda.time.DateTimeZone");
    }

    /* renamed from: f */
    public final InputStream mo29483f(String str) throws IOException {
        String str2;
        if (this.f31440a != null) {
            return new FileInputStream(new File(this.f31440a, str));
        }
        String concat = this.f31441b.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new C12734a(concat));
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Resource not found: \"");
        sb.append(concat);
        sb.append("\" ClassLoader: ");
        ClassLoader classLoader = this.f31442c;
        if (classLoader != null) {
            str2 = classLoader.toString();
        } else {
            str2 = C10108c.f27822y;
        }
        sb.append(str2);
        throw new IOException(sb.toString());
    }

    /* renamed from: h */
    public void mo29484h(Exception exc) {
        exc.printStackTrace();
    }

    public C12733g(File file) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("No file directory provided");
        } else if (!file.exists()) {
            throw new IOException("File directory doesn't exist: " + file);
        } else if (file.isDirectory()) {
            this.f31440a = file;
            this.f31441b = null;
            this.f31442c = null;
            Map<String, Object> e = m54757e(mo29483f("ZoneInfoMap"));
            this.f31443d = e;
            this.f31444e = Collections.unmodifiableSortedSet(new TreeSet(e.keySet()));
        } else {
            throw new IOException("File doesn't refer to a directory: " + file);
        }
    }

    public C12733g(String str) throws IOException {
        this(str, (ClassLoader) null, false);
    }

    public C12733g(String str, ClassLoader classLoader) throws IOException {
        this(str, classLoader, true);
    }

    public C12733g(String str, ClassLoader classLoader, boolean z) throws IOException {
        if (str != null) {
            if (!str.endsWith("/")) {
                str = str + '/';
            }
            this.f31440a = null;
            this.f31441b = str;
            if (classLoader == null && !z) {
                classLoader = getClass().getClassLoader();
            }
            this.f31442c = classLoader;
            Map<String, Object> e = m54757e(mo29483f("ZoneInfoMap"));
            this.f31443d = e;
            this.f31444e = Collections.unmodifiableSortedSet(new TreeSet(e.keySet()));
            return;
        }
        throw new IllegalArgumentException("No resource path provided");
    }
}
