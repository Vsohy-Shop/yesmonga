package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.C22050b;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.engine.cache.C22185a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.engine.cache.e */
public class C22197e implements C22185a {

    /* renamed from: f */
    public static final String f57018f = "DiskLruCacheWrapper";

    /* renamed from: g */
    public static final int f57019g = 1;

    /* renamed from: h */
    public static final int f57020h = 1;

    /* renamed from: i */
    public static C22197e f57021i;

    /* renamed from: a */
    public final C22212m f57022a;

    /* renamed from: b */
    public final File f57023b;

    /* renamed from: c */
    public final long f57024c;

    /* renamed from: d */
    public final C22190c f57025d = new C22190c();

    /* renamed from: e */
    public C22050b f57026e;

    @Deprecated
    public C22197e(File file, long j) {
        this.f57023b = file;
        this.f57024c = j;
        this.f57022a = new C22212m();
    }

    /* renamed from: d */
    public static C22185a m101078d(File file, long j) {
        return new C22197e(file, j);
    }

    @Deprecated
    /* renamed from: e */
    public static synchronized C22185a m101079e(File file, long j) {
        C22197e eVar;
        synchronized (C22197e.class) {
            if (f57021i == null) {
                f57021i = new C22197e(file, j);
            }
            eVar = f57021i;
        }
        return eVar;
    }

    /* renamed from: a */
    public void mo66022a(C22108c cVar, C22185a.C22187b bVar) {
        C22050b.C22053c r;
        String b = this.f57022a.mo66064b(cVar);
        this.f57025d.mo66028a(b);
        try {
            if (Log.isLoggable(f57018f, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(b);
                sb.append(" for for Key: ");
                sb.append(cVar);
            }
            try {
                C22050b f = mo66033f();
                if (f.mo65542u(b) == null) {
                    r = f.mo65540r(b);
                    if (r != null) {
                        if (bVar.mo66027a(r.mo65552f(0))) {
                            r.mo65551e();
                        }
                        r.mo65550b();
                        this.f57025d.mo66029b(b);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b);
                }
            } catch (IOException unused) {
                boolean isLoggable = Log.isLoggable(f57018f, 5);
            } catch (Throwable th) {
                r.mo65550b();
                throw th;
            }
        } finally {
            this.f57025d.mo66029b(b);
        }
    }

    /* renamed from: b */
    public File mo66023b(C22108c cVar) {
        String b = this.f57022a.mo66064b(cVar);
        if (Log.isLoggable(f57018f, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(b);
            sb.append(" for for Key: ");
            sb.append(cVar);
        }
        try {
            C22050b.C22055e u = mo66033f().mo65542u(b);
            if (u != null) {
                return u.mo65562b(0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public void mo66024c(C22108c cVar) {
        try {
            mo66033f().mo65530F(this.f57022a.mo66064b(cVar));
        } catch (IOException unused) {
        }
    }

    public synchronized void clear() {
        try {
            mo66033f().mo65539p();
        } catch (IOException unused) {
            try {
                boolean isLoggable = Log.isLoggable(f57018f, 5);
            } catch (Throwable th) {
                mo66034g();
                throw th;
            }
        }
        mo66034g();
    }

    /* renamed from: f */
    public final synchronized C22050b mo66033f() throws IOException {
        if (this.f57026e == null) {
            this.f57026e = C22050b.m100433z(this.f57023b, 1, 1, this.f57024c);
        }
        return this.f57026e;
    }

    /* renamed from: g */
    public final synchronized void mo66034g() {
        this.f57026e = null;
    }
}
