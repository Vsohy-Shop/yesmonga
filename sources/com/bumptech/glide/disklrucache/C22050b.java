package com.bumptech.glide.disklrucache;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import androidx.camera.core.ImageSaver;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.disklrucache.b */
public final class C22050b implements Closeable {

    /* renamed from: E0 */
    public static final String f56568E0 = "journal.tmp";

    /* renamed from: F0 */
    public static final String f56569F0 = "journal.bkp";

    /* renamed from: G0 */
    public static final String f56570G0 = "libcore.io.DiskLruCache";

    /* renamed from: H0 */
    public static final String f56571H0 = "1";

    /* renamed from: I0 */
    public static final long f56572I0 = -1;

    /* renamed from: J0 */
    public static final String f56573J0 = "CLEAN";

    /* renamed from: K0 */
    public static final String f56574K0 = "DIRTY";

    /* renamed from: L0 */
    public static final String f56575L0 = "REMOVE";

    /* renamed from: M0 */
    public static final String f56576M0 = "READ";

    /* renamed from: Z */
    public static final String f56577Z = "journal";

    /* renamed from: X */
    public final ThreadPoolExecutor f56578X = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C22052b((C22051a) null));

    /* renamed from: Y */
    public final Callable<Void> f56579Y = new C22051a();

    /* renamed from: a */
    public final File f56580a;

    /* renamed from: b */
    public final File f56581b;

    /* renamed from: c */
    public final File f56582c;

    /* renamed from: d */
    public final File f56583d;

    /* renamed from: e */
    public final int f56584e;

    /* renamed from: f */
    public long f56585f;

    /* renamed from: g */
    public final int f56586g;

    /* renamed from: v */
    public long f56587v = 0;

    /* renamed from: w */
    public Writer f56588w;

    /* renamed from: x */
    public final LinkedHashMap<String, C22054d> f56589x = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: y */
    public int f56590y;

    /* renamed from: z */
    public long f56591z = 0;

    /* renamed from: com.bumptech.glide.disklrucache.b$a */
    public class C22051a implements Callable<Void> {
        public C22051a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                com.bumptech.glide.disklrucache.b r0 = com.bumptech.glide.disklrucache.C22050b.this
                monitor-enter(r0)
                com.bumptech.glide.disklrucache.b r1 = com.bumptech.glide.disklrucache.C22050b.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f56588w     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                com.bumptech.glide.disklrucache.b r1 = com.bumptech.glide.disklrucache.C22050b.this     // Catch:{ all -> 0x0028 }
                r1.mo65533K()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.disklrucache.b r1 = com.bumptech.glide.disklrucache.C22050b.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.mo65545y()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                com.bumptech.glide.disklrucache.b r1 = com.bumptech.glide.disklrucache.C22050b.this     // Catch:{ all -> 0x0028 }
                r1.mo65529E()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.disklrucache.b r1 = com.bumptech.glide.disklrucache.C22050b.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f56590y = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.C22050b.C22051a.call():java.lang.Void");
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.b$b */
    public static final class C22052b implements ThreadFactory {
        public C22052b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ C22052b(C22051a aVar) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.b$c */
    public final class C22053c {

        /* renamed from: a */
        public final C22054d f56593a;

        /* renamed from: b */
        public final boolean[] f56594b;

        /* renamed from: c */
        public boolean f56595c;

        public /* synthetic */ C22053c(C22050b bVar, C22054d dVar, C22051a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo65549a() throws IOException {
            C22050b.this.mo65538o(this, false);
        }

        /* renamed from: b */
        public void mo65550b() {
            if (!this.f56595c) {
                try {
                    mo65549a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo65551e() throws IOException {
            C22050b.this.mo65538o(this, true);
            this.f56595c = true;
        }

        /* renamed from: f */
        public File mo65552f(int i) throws IOException {
            File k;
            synchronized (C22050b.this) {
                if (this.f56593a.f56602f == this) {
                    if (!this.f56593a.f56601e) {
                        this.f56594b[i] = true;
                    }
                    k = this.f56593a.mo65557k(i);
                    C22050b.this.f56580a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        /* renamed from: g */
        public String mo65553g(int i) throws IOException {
            InputStream h = mo65554h(i);
            if (h != null) {
                return C22050b.m100432x(h);
            }
            return null;
        }

        /* renamed from: h */
        public final InputStream mo65554h(int i) throws IOException {
            synchronized (C22050b.this) {
                if (this.f56593a.f56602f != this) {
                    throw new IllegalStateException();
                } else if (!this.f56593a.f56601e) {
                    return null;
                } else {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.f56593a.mo65556j(i));
                        return fileInputStream;
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }

        /* renamed from: i */
        public void mo65555i(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(mo65552f(i)), C22058d.f56619b);
                try {
                    outputStreamWriter2.write(str);
                    C22058d.m100483a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    C22058d.m100483a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C22058d.m100483a(outputStreamWriter);
                throw th;
            }
        }

        public C22053c(C22054d dVar) {
            this.f56593a = dVar;
            this.f56594b = dVar.f56601e ? null : new boolean[C22050b.this.f56586g];
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.b$d */
    public final class C22054d {

        /* renamed from: a */
        public final String f56597a;

        /* renamed from: b */
        public final long[] f56598b;

        /* renamed from: c */
        public File[] f56599c;

        /* renamed from: d */
        public File[] f56600d;

        /* renamed from: e */
        public boolean f56601e;

        /* renamed from: f */
        public C22053c f56602f;

        /* renamed from: g */
        public long f56603g;

        public /* synthetic */ C22054d(C22050b bVar, String str, C22051a aVar) {
            this(str);
        }

        /* renamed from: j */
        public File mo65556j(int i) {
            return this.f56599c[i];
        }

        /* renamed from: k */
        public File mo65557k(int i) {
            return this.f56600d[i];
        }

        /* renamed from: l */
        public String mo65558l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f56598b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException mo65559m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void mo65560n(String[] strArr) throws IOException {
            if (strArr.length == C22050b.this.f56586g) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f56598b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw mo65559m(strArr);
                    }
                }
                return;
            }
            throw mo65559m(strArr);
        }

        public C22054d(String str) {
            this.f56597a = str;
            this.f56598b = new long[C22050b.this.f56586g];
            this.f56599c = new File[C22050b.this.f56586g];
            this.f56600d = new File[C22050b.this.f56586g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C22050b.this.f56586g; i++) {
                sb.append(i);
                this.f56599c[i] = new File(C22050b.this.f56580a, sb.toString());
                sb.append(ImageSaver.f3843w);
                this.f56600d[i] = new File(C22050b.this.f56580a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.b$e */
    public final class C22055e {

        /* renamed from: a */
        public final String f56605a;

        /* renamed from: b */
        public final long f56606b;

        /* renamed from: c */
        public final long[] f56607c;

        /* renamed from: d */
        public final File[] f56608d;

        public /* synthetic */ C22055e(C22050b bVar, String str, long j, File[] fileArr, long[] jArr, C22051a aVar) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public C22053c mo65561a() throws IOException {
            return C22050b.this.mo65541s(this.f56605a, this.f56606b);
        }

        /* renamed from: b */
        public File mo65562b(int i) {
            return this.f56608d[i];
        }

        /* renamed from: c */
        public long mo65563c(int i) {
            return this.f56607c[i];
        }

        /* renamed from: d */
        public String mo65564d(int i) throws IOException {
            return C22050b.m100432x(new FileInputStream(this.f56608d[i]));
        }

        public C22055e(String str, long j, File[] fileArr, long[] jArr) {
            this.f56605a = str;
            this.f56606b = j;
            this.f56608d = fileArr;
            this.f56607c = jArr;
        }
    }

    public C22050b(File file, int i, int i2, long j) {
        File file2 = file;
        this.f56580a = file2;
        this.f56584e = i;
        this.f56581b = new File(file2, f56577Z);
        this.f56582c = new File(file2, f56568E0);
        this.f56583d = new File(file2, f56569F0);
        this.f56586g = i2;
        this.f56585f = j;
    }

    /* renamed from: G */
    public static void m100418G(File file, File file2, boolean z) throws IOException {
        if (z) {
            m100430q(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* renamed from: n */
    public static void m100429n(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: q */
    public static void m100430q(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* renamed from: t */
    public static void m100431t(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: x */
    public static String m100432x(InputStream inputStream) throws IOException {
        return C22058d.m100485c(new InputStreamReader(inputStream, C22058d.f56619b));
    }

    /* renamed from: z */
    public static C22050b m100433z(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, f56569F0);
            if (file2.exists()) {
                File file3 = new File(file, f56577Z);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m100418G(file2, file3, false);
                }
            }
            C22050b bVar = new C22050b(file, i, i2, j);
            if (bVar.f56581b.exists()) {
                try {
                    bVar.mo65527C();
                    bVar.mo65526B();
                    return bVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    bVar.mo65539p();
                }
            }
            file.mkdirs();
            C22050b bVar2 = new C22050b(file, i, i2, j);
            bVar2.mo65529E();
            return bVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: B */
    public final void mo65526B() throws IOException {
        m100430q(this.f56582c);
        Iterator<C22054d> it = this.f56589x.values().iterator();
        while (it.hasNext()) {
            C22054d next = it.next();
            int i = 0;
            if (next.f56602f == null) {
                while (i < this.f56586g) {
                    this.f56587v += next.f56598b[i];
                    i++;
                }
            } else {
                C22053c unused = next.f56602f = null;
                while (i < this.f56586g) {
                    m100430q(next.mo65556j(i));
                    m100430q(next.mo65557k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f56590y = r0 - r9.f56589x.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo65566c() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        mo65529E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f56588w = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f56581b, true), com.bumptech.glide.disklrucache.C22058d.f56618a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65527C() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.bumptech.glide.disklrucache.c r1 = new com.bumptech.glide.disklrucache.c
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f56581b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.bumptech.glide.disklrucache.C22058d.f56618a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo65568d()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo65568d()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo65568d()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo65568d()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo65568d()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f56584e     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f56586g     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo65568d()     // Catch:{ EOFException -> 0x005f }
            r9.mo65528D(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r2 = r9.f56589x     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f56590y = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo65566c()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.mo65529E()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f56581b     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.bumptech.glide.disklrucache.C22058d.f56618a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f56588w = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            com.bumptech.glide.disklrucache.C22058d.m100483a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.bumptech.glide.disklrucache.C22058d.m100483a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.C22050b.mo65527C():void");
    }

    /* renamed from: D */
    public final void mo65528D(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith(f56575L0)) {
                    this.f56589x.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C22054d dVar = this.f56589x.get(str2);
            if (dVar == null) {
                dVar = new C22054d(this, str2, (C22051a) null);
                this.f56589x.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(f56573J0)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f56601e = true;
                C22053c unused2 = dVar.f56602f = null;
                dVar.mo65560n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(f56574K0)) {
                C22053c unused3 = dVar.f56602f = new C22053c(this, dVar, (C22051a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(f56576M0)) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: E */
    public final synchronized void mo65529E() throws IOException {
        Writer writer = this.f56588w;
        if (writer != null) {
            m100429n(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f56582c), C22058d.f56618a));
        try {
            bufferedWriter.write(f56570G0);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f56584e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f56586g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C22054d next : this.f56589x.values()) {
                if (next.f56602f != null) {
                    bufferedWriter.write("DIRTY " + next.f56597a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f56597a + next.mo65558l() + 10);
                }
            }
            m100429n(bufferedWriter);
            if (this.f56581b.exists()) {
                m100418G(this.f56581b, this.f56583d, true);
            }
            m100418G(this.f56582c, this.f56581b, false);
            this.f56583d.delete();
            this.f56588w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f56581b, true), C22058d.f56618a));
        } catch (Throwable th) {
            m100429n(bufferedWriter);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo65530F(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.mo65537m()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r0 = r7.f56589x     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            com.bumptech.glide.disklrucache.b$d r0 = (com.bumptech.glide.disklrucache.C22050b.C22054d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            com.bumptech.glide.disklrucache.b$c r2 = r0.f56602f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f56586g     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo65556j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f56587v     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f56598b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f56587v = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f56598b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f56590y     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f56590y = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f56588w     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f56588w     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f56588w     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f56588w     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r0 = r7.f56589x     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.mo65545y()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f56578X     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f56579Y     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.C22050b.mo65530F(java.lang.String):boolean");
    }

    /* renamed from: I */
    public synchronized void mo65531I(long j) {
        this.f56585f = j;
        this.f56578X.submit(this.f56579Y);
    }

    /* renamed from: J */
    public synchronized long mo65532J() {
        return this.f56587v;
    }

    /* renamed from: K */
    public final void mo65533K() throws IOException {
        while (this.f56587v > this.f56585f) {
            mo65530F((String) this.f56589x.entrySet().iterator().next().getKey());
        }
    }

    public synchronized void close() throws IOException {
        if (this.f56588w != null) {
            Iterator it = new ArrayList(this.f56589x.values()).iterator();
            while (it.hasNext()) {
                C22054d dVar = (C22054d) it.next();
                if (dVar.f56602f != null) {
                    dVar.f56602f.mo65549a();
                }
            }
            mo65533K();
            m100429n(this.f56588w);
            this.f56588w = null;
        }
    }

    public synchronized void flush() throws IOException {
        mo65537m();
        mo65533K();
        m100431t(this.f56588w);
    }

    public synchronized boolean isClosed() {
        boolean z;
        if (this.f56588w == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: m */
    public final void mo65537m() {
        if (this.f56588w == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo65538o(com.bumptech.glide.disklrucache.C22050b.C22053c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.bumptech.glide.disklrucache.b$d r0 = r10.f56593a     // Catch:{ all -> 0x010e }
            com.bumptech.glide.disklrucache.b$c r1 = r0.f56602f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f56601e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = r1
        L_0x0015:
            int r3 = r9.f56586g     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f56594b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo65557k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo65549a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo65549a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f56586g     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo65557k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo65556j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f56598b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f56598b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f56587v     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f56587v = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m100430q(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f56590y     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f56590y = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            com.bumptech.glide.disklrucache.C22050b.C22053c unused = r0.f56602f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f56601e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f56601e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f56588w     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f56588w     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f56588w     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f56597a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f56588w     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo65558l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f56588w     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f56591z     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f56591z = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f56603g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r10 = r9.f56589x     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f56597a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f56588w     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f56588w     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f56588w     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f56597a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f56588w     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f56588w     // Catch:{ all -> 0x010e }
            m100431t(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f56587v     // Catch:{ all -> 0x010e }
            long r0 = r9.f56585f     // Catch:{ all -> 0x010e }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ff
            boolean r10 = r9.mo65545y()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f56578X     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f56579Y     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.C22050b.mo65538o(com.bumptech.glide.disklrucache.b$c, boolean):void");
    }

    /* renamed from: p */
    public void mo65539p() throws IOException {
        close();
        C22058d.m100484b(this.f56580a);
    }

    /* renamed from: r */
    public C22053c mo65540r(String str) throws IOException {
        return mo65541s(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bumptech.glide.disklrucache.C22050b.C22053c mo65541s(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo65537m()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r0 = r5.f56589x     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.disklrucache.b$d r0 = (com.bumptech.glide.disklrucache.C22050b.C22054d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r3 = r0.f56603g     // Catch:{ all -> 0x005d }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r2
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            com.bumptech.glide.disklrucache.b$d r0 = new com.bumptech.glide.disklrucache.b$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r2)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r7 = r5.f56589x     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            com.bumptech.glide.disklrucache.b$c r7 = r0.f56602f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r2
        L_0x0034:
            com.bumptech.glide.disklrucache.b$c r7 = new com.bumptech.glide.disklrucache.b$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.disklrucache.C22050b.C22053c unused = r0.f56602f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f56588w     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f56588w     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f56588w     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f56588w     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f56588w     // Catch:{ all -> 0x005d }
            m100431t(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.C22050b.mo65541s(java.lang.String, long):com.bumptech.glide.disklrucache.b$c");
    }

    /* renamed from: u */
    public synchronized C22055e mo65542u(String str) throws IOException {
        mo65537m();
        C22054d dVar = this.f56589x.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f56601e) {
            return null;
        }
        for (File exists : dVar.f56599c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f56590y++;
        this.f56588w.append(f56576M0);
        this.f56588w.append(' ');
        this.f56588w.append(str);
        this.f56588w.append(10);
        if (mo65545y()) {
            this.f56578X.submit(this.f56579Y);
        }
        return new C22055e(this, str, dVar.f56603g, dVar.f56599c, dVar.f56598b, (C22051a) null);
    }

    /* renamed from: v */
    public File mo65543v() {
        return this.f56580a;
    }

    /* renamed from: w */
    public synchronized long mo65544w() {
        return this.f56585f;
    }

    /* renamed from: y */
    public final boolean mo65545y() {
        int i = this.f56590y;
        if (i < 2000 || i < this.f56589x.size()) {
            return false;
        }
        return true;
    }
}
