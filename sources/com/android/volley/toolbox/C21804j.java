package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.C0344h1;
import com.android.volley.C21751e;
import com.android.volley.C21759i;
import com.android.volley.C21776s;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.android.volley.toolbox.j */
public class C21804j implements C21751e {

    /* renamed from: e */
    public static final int f56406e = 5242880;
    @C0344h1

    /* renamed from: f */
    public static final float f56407f = 0.9f;

    /* renamed from: g */
    public static final int f56408g = 538247942;

    /* renamed from: a */
    public final Map<String, C21806b> f56409a;

    /* renamed from: b */
    public long f56410b;

    /* renamed from: c */
    public final C21808d f56411c;

    /* renamed from: d */
    public final int f56412d;

    /* renamed from: com.android.volley.toolbox.j$a */
    public class C21805a implements C21808d {

        /* renamed from: a */
        public final /* synthetic */ File f56413a;

        public C21805a(File file) {
            this.f56413a = file;
        }

        public File get() {
            return this.f56413a;
        }
    }

    /* renamed from: com.android.volley.toolbox.j$d */
    public interface C21808d {
        File get();
    }

    public C21804j(File file, int i) {
        this.f56409a = new LinkedHashMap(16, 0.75f, true);
        this.f56410b = 0;
        this.f56411c = new C21805a(file);
        this.f56412d = i;
    }

    /* renamed from: l */
    public static int m100177l(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: m */
    public static List<C21759i> m100178m(C21807c cVar) throws IOException {
        List<C21759i> list;
        int n = m100179n(cVar);
        if (n >= 0) {
            if (n == 0) {
                list = Collections.emptyList();
            } else {
                list = new ArrayList<>();
            }
            for (int i = 0; i < n; i++) {
                list.add(new C21759i(m100181p(cVar).intern(), m100181p(cVar).intern()));
            }
            return list;
        }
        throw new IOException("readHeaderList size=" + n);
    }

    /* renamed from: n */
    public static int m100179n(InputStream inputStream) throws IOException {
        return (m100177l(inputStream) << 24) | (m100177l(inputStream) << 0) | 0 | (m100177l(inputStream) << 8) | (m100177l(inputStream) << 16);
    }

    /* renamed from: o */
    public static long m100180o(InputStream inputStream) throws IOException {
        return ((((long) m100177l(inputStream)) & 255) << 0) | 0 | ((((long) m100177l(inputStream)) & 255) << 8) | ((((long) m100177l(inputStream)) & 255) << 16) | ((((long) m100177l(inputStream)) & 255) << 24) | ((((long) m100177l(inputStream)) & 255) << 32) | ((((long) m100177l(inputStream)) & 255) << 40) | ((((long) m100177l(inputStream)) & 255) << 48) | ((255 & ((long) m100177l(inputStream))) << 56);
    }

    /* renamed from: p */
    public static String m100181p(C21807c cVar) throws IOException {
        return new String(m100182r(cVar, m100180o(cVar)), "UTF-8");
    }

    @C0344h1
    /* renamed from: r */
    public static byte[] m100182r(C21807c cVar, long j) throws IOException {
        long b = cVar.mo65018b();
        if (j >= 0 && j <= b) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + b);
    }

    /* renamed from: s */
    public static void m100183s(List<C21759i> list, OutputStream outputStream) throws IOException {
        if (list != null) {
            m100184t(outputStream, list.size());
            for (C21759i next : list) {
                m100186v(outputStream, next.mo64934a());
                m100186v(outputStream, next.mo64935b());
            }
            return;
        }
        m100184t(outputStream, 0);
    }

    /* renamed from: t */
    public static void m100184t(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: u */
    public static void m100185u(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) (j >>> 0)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: v */
    public static void m100186v(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m100185u(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @C0344h1
    /* renamed from: a */
    public InputStream mo65007a(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0057 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo64875b() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.android.volley.toolbox.j$d r0 = r9.f56411c     // Catch:{ all -> 0x005f }
            java.io.File r0 = r0.get()     // Catch:{ all -> 0x005f }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x005f }
            r2 = 0
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x005f }
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "Unable to create cache dir %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x005f }
            r3[r2] = r0     // Catch:{ all -> 0x005f }
            com.android.volley.C21776s.m100099c(r1, r3)     // Catch:{ all -> 0x005f }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x002c
            monitor-exit(r9)
            return
        L_0x002c:
            int r1 = r0.length     // Catch:{ all -> 0x005f }
        L_0x002d:
            if (r2 >= r1) goto L_0x005d
            r3 = r0[r2]     // Catch:{ all -> 0x005f }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0057 }
            com.android.volley.toolbox.j$c r6 = new com.android.volley.toolbox.j$c     // Catch:{ IOException -> 0x0057 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0057 }
            java.io.InputStream r8 = r9.mo65007a(r3)     // Catch:{ IOException -> 0x0057 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0057 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0057 }
            com.android.volley.toolbox.j$b r7 = com.android.volley.toolbox.C21804j.C21806b.m100200b(r6)     // Catch:{ all -> 0x0052 }
            r7.f56415a = r4     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = r7.f56416b     // Catch:{ all -> 0x0052 }
            r9.mo65013k(r4, r7)     // Catch:{ all -> 0x0052 }
            r6.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005a
        L_0x0052:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0057 }
            throw r4     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r3.delete()     // Catch:{ all -> 0x005f }
        L_0x005a:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x005d:
            monitor-exit(r9)
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C21804j.mo64875b():void");
    }

    /* renamed from: c */
    public synchronized void mo64876c(String str, boolean z) {
        C21751e.C21752a aVar = get(str);
        if (aVar != null) {
            aVar.f56265f = 0;
            if (z) {
                aVar.f56264e = 0;
            }
            mo64878d(str, aVar);
        }
    }

    public synchronized void clear() {
        File[] listFiles = this.f56411c.get().listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        this.f56409a.clear();
        this.f56410b = 0;
        C21776s.m100098b("Cache cleared.", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r0.delete() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        com.android.volley.C21776s.m100098b("Could not clean up file %s", r0.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        mo65011i();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0061 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo64878d(java.lang.String r8, com.android.volley.C21751e.C21752a r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.f56410b     // Catch:{ all -> 0x0079 }
            byte[] r2 = r9.f56260a     // Catch:{ all -> 0x0079 }
            int r3 = r2.length     // Catch:{ all -> 0x0079 }
            long r3 = (long) r3     // Catch:{ all -> 0x0079 }
            long r0 = r0 + r3
            int r3 = r7.f56412d     // Catch:{ all -> 0x0079 }
            long r4 = (long) r3     // Catch:{ all -> 0x0079 }
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            int r0 = r2.length     // Catch:{ all -> 0x0079 }
            float r0 = (float) r0
            float r1 = (float) r3
            r2 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            monitor-exit(r7)
            return
        L_0x001c:
            java.io.File r0 = r7.mo65009g(r8)     // Catch:{ all -> 0x0079 }
            r1 = 0
            r2 = 1
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0061 }
            java.io.OutputStream r4 = r7.mo65008f(r0)     // Catch:{ IOException -> 0x0061 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0061 }
            com.android.volley.toolbox.j$b r4 = new com.android.volley.toolbox.j$b     // Catch:{ IOException -> 0x0061 }
            r4.<init>(r8, r9)     // Catch:{ IOException -> 0x0061 }
            boolean r5 = r4.mo65016d(r3)     // Catch:{ IOException -> 0x0061 }
            if (r5 == 0) goto L_0x004b
            byte[] r9 = r9.f56260a     // Catch:{ IOException -> 0x0061 }
            r3.write(r9)     // Catch:{ IOException -> 0x0061 }
            r3.close()     // Catch:{ IOException -> 0x0061 }
            long r5 = r0.length()     // Catch:{ IOException -> 0x0061 }
            r4.f56415a = r5     // Catch:{ IOException -> 0x0061 }
            r7.mo65013k(r8, r4)     // Catch:{ IOException -> 0x0061 }
            r7.mo65012j()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0077
        L_0x004b:
            r3.close()     // Catch:{ IOException -> 0x0061 }
            java.lang.String r8 = "Failed to write header for %s"
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0061 }
            java.lang.String r3 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0061 }
            r9[r1] = r3     // Catch:{ IOException -> 0x0061 }
            com.android.volley.C21776s.m100098b(r8, r9)     // Catch:{ IOException -> 0x0061 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x0061 }
            r8.<init>()     // Catch:{ IOException -> 0x0061 }
            throw r8     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            boolean r8 = r0.delete()     // Catch:{ all -> 0x0079 }
            if (r8 != 0) goto L_0x0074
            java.lang.String r8 = "Could not clean up file %s"
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0079 }
            r9[r1] = r0     // Catch:{ all -> 0x0079 }
            com.android.volley.C21776s.m100098b(r8, r9)     // Catch:{ all -> 0x0079 }
        L_0x0074:
            r7.mo65011i()     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r7)
            return
        L_0x0079:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C21804j.mo64878d(java.lang.String, com.android.volley.e$a):void");
    }

    /* renamed from: e */
    public synchronized void mo64879e(String str) {
        boolean delete = mo65009g(str).delete();
        mo65014q(str);
        if (!delete) {
            C21776s.m100098b("Could not delete cache entry for key=%s, filename=%s", str, mo65010h(str));
        }
    }

    @C0344h1
    /* renamed from: f */
    public OutputStream mo65008f(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    /* renamed from: g */
    public File mo65009g(String str) {
        return new File(this.f56411c.get(), mo65010h(str));
    }

    public synchronized C21751e.C21752a get(String str) {
        C21807c cVar;
        C21806b bVar = this.f56409a.get(str);
        if (bVar == null) {
            return null;
        }
        File g = mo65009g(str);
        try {
            cVar = new C21807c(new BufferedInputStream(mo65007a(g)), g.length());
            C21806b b = C21806b.m100200b(cVar);
            if (!TextUtils.equals(str, b.f56416b)) {
                C21776s.m100098b("%s: key=%s, found=%s", g.getAbsolutePath(), str, b.f56416b);
                mo65014q(str);
                cVar.close();
                return null;
            }
            C21751e.C21752a c = bVar.mo65015c(m100182r(cVar, cVar.mo65018b()));
            cVar.close();
            return c;
        } catch (IOException e) {
            C21776s.m100098b("%s: %s", g.getAbsolutePath(), e.toString());
            mo64879e(str);
            return null;
        } catch (Throwable th) {
            cVar.close();
            throw th;
        }
    }

    /* renamed from: h */
    public final String mo65010h(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: i */
    public final void mo65011i() {
        if (!this.f56411c.get().exists()) {
            C21776s.m100098b("Re-initializing cache after external clearing.", new Object[0]);
            this.f56409a.clear();
            this.f56410b = 0;
            mo64875b();
        }
    }

    /* renamed from: j */
    public final void mo65012j() {
        if (this.f56410b >= ((long) this.f56412d)) {
            if (C21776s.f56329b) {
                C21776s.m100102f("Pruning old cache entries.", new Object[0]);
            }
            long j = this.f56410b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, C21806b>> it = this.f56409a.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                C21806b bVar = (C21806b) it.next().getValue();
                if (mo65009g(bVar.f56416b).delete()) {
                    this.f56410b -= bVar.f56415a;
                } else {
                    String str = bVar.f56416b;
                    C21776s.m100098b("Could not delete cache entry for key=%s, filename=%s", str, mo65010h(str));
                }
                it.remove();
                i++;
                if (((float) this.f56410b) < ((float) this.f56412d) * 0.9f) {
                    break;
                }
            }
            if (C21776s.f56329b) {
                C21776s.m100102f("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f56410b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: k */
    public final void mo65013k(String str, C21806b bVar) {
        if (!this.f56409a.containsKey(str)) {
            this.f56410b += bVar.f56415a;
        } else {
            this.f56410b += bVar.f56415a - this.f56409a.get(str).f56415a;
        }
        this.f56409a.put(str, bVar);
    }

    /* renamed from: q */
    public final void mo65014q(String str) {
        C21806b remove = this.f56409a.remove(str);
        if (remove != null) {
            this.f56410b -= remove.f56415a;
        }
    }

    @C0344h1
    /* renamed from: com.android.volley.toolbox.j$c */
    public static class C21807c extends FilterInputStream {

        /* renamed from: a */
        public final long f56423a;

        /* renamed from: b */
        public long f56424b;

        public C21807c(InputStream inputStream, long j) {
            super(inputStream);
            this.f56423a = j;
        }

        @C0344h1
        /* renamed from: a */
        public long mo65017a() {
            return this.f56424b;
        }

        /* renamed from: b */
        public long mo65018b() {
            return this.f56423a - this.f56424b;
        }

        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f56424b++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f56424b += (long) read;
            }
            return read;
        }
    }

    public C21804j(C21808d dVar, int i) {
        this.f56409a = new LinkedHashMap(16, 0.75f, true);
        this.f56410b = 0;
        this.f56411c = dVar;
        this.f56412d = i;
    }

    @C0344h1
    /* renamed from: com.android.volley.toolbox.j$b */
    public static class C21806b {

        /* renamed from: a */
        public long f56415a;

        /* renamed from: b */
        public final String f56416b;

        /* renamed from: c */
        public final String f56417c;

        /* renamed from: d */
        public final long f56418d;

        /* renamed from: e */
        public final long f56419e;

        /* renamed from: f */
        public final long f56420f;

        /* renamed from: g */
        public final long f56421g;

        /* renamed from: h */
        public final List<C21759i> f56422h;

        public C21806b(String str, String str2, long j, long j2, long j3, long j4, List<C21759i> list) {
            this.f56416b = str;
            this.f56417c = "".equals(str2) ? null : str2;
            this.f56418d = j;
            this.f56419e = j2;
            this.f56420f = j3;
            this.f56421g = j4;
            this.f56422h = list;
        }

        /* renamed from: a */
        public static List<C21759i> m100199a(C21751e.C21752a aVar) {
            List<C21759i> list = aVar.f56267h;
            if (list != null) {
                return list;
            }
            return C21812m.m100219i(aVar.f56266g);
        }

        /* renamed from: b */
        public static C21806b m100200b(C21807c cVar) throws IOException {
            if (C21804j.m100179n(cVar) == 538247942) {
                return new C21806b(C21804j.m100181p(cVar), C21804j.m100181p(cVar), C21804j.m100180o(cVar), C21804j.m100180o(cVar), C21804j.m100180o(cVar), C21804j.m100180o(cVar), C21804j.m100178m(cVar));
            }
            throw new IOException();
        }

        /* renamed from: c */
        public C21751e.C21752a mo65015c(byte[] bArr) {
            C21751e.C21752a aVar = new C21751e.C21752a();
            aVar.f56260a = bArr;
            aVar.f56261b = this.f56417c;
            aVar.f56262c = this.f56418d;
            aVar.f56263d = this.f56419e;
            aVar.f56264e = this.f56420f;
            aVar.f56265f = this.f56421g;
            aVar.f56266g = C21812m.m100220j(this.f56422h);
            aVar.f56267h = Collections.unmodifiableList(this.f56422h);
            return aVar;
        }

        /* renamed from: d */
        public boolean mo65016d(OutputStream outputStream) {
            try {
                C21804j.m100184t(outputStream, C21804j.f56408g);
                C21804j.m100186v(outputStream, this.f56416b);
                String str = this.f56417c;
                if (str == null) {
                    str = "";
                }
                C21804j.m100186v(outputStream, str);
                C21804j.m100185u(outputStream, this.f56418d);
                C21804j.m100185u(outputStream, this.f56419e);
                C21804j.m100185u(outputStream, this.f56420f);
                C21804j.m100185u(outputStream, this.f56421g);
                C21804j.m100183s(this.f56422h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C21776s.m100098b("%s", e.toString());
                return false;
            }
        }

        public C21806b(String str, C21751e.C21752a aVar) {
            this(str, aVar.f56261b, aVar.f56262c, aVar.f56263d, aVar.f56264e, aVar.f56265f, m100199a(aVar));
        }
    }

    public C21804j(File file) {
        this(file, 5242880);
    }

    public C21804j(C21808d dVar) {
        this(dVar, 5242880);
    }
}
