package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.engine.cache.C22205j;
import com.bumptech.glide.load.resource.bitmap.C22411h;
import com.bumptech.glide.util.C22635o;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.load.engine.prefill.a */
public final class C22260a implements Runnable {

    /* renamed from: X */
    public static final int f57207X = 4;

    /* renamed from: Y */
    public static final long f57208Y = TimeUnit.SECONDS.toMillis(1);
    @C0344h1

    /* renamed from: w */
    public static final String f57209w = "PreFillRunner";

    /* renamed from: x */
    public static final C22261a f57210x = new C22261a();

    /* renamed from: y */
    public static final long f57211y = 32;

    /* renamed from: z */
    public static final long f57212z = 40;

    /* renamed from: a */
    public final C22162e f57213a;

    /* renamed from: b */
    public final C22205j f57214b;

    /* renamed from: c */
    public final C22264c f57215c;

    /* renamed from: d */
    public final C22261a f57216d;

    /* renamed from: e */
    public final Set<C22265d> f57217e;

    /* renamed from: f */
    public final Handler f57218f;

    /* renamed from: g */
    public long f57219g;

    /* renamed from: v */
    public boolean f57220v;

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.prefill.a$a */
    public static class C22261a {
        /* renamed from: a */
        public long mo66196a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.prefill.a$b */
    public static final class C22262b implements C22108c {
        /* renamed from: b */
        public void mo65773b(@C0359n0 MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public C22260a(C22162e eVar, C22205j jVar, C22264c cVar) {
        this(eVar, jVar, cVar, f57210x, new Handler(Looper.getMainLooper()));
    }

    @C0344h1
    /* renamed from: a */
    public boolean mo66190a() {
        Bitmap bitmap;
        long a = this.f57216d.mo66196a();
        while (!this.f57215c.mo66200b() && !mo66194f(a)) {
            C22265d c = this.f57215c.mo66201c();
            if (!this.f57217e.contains(c)) {
                this.f57217e.add(c);
                bitmap = this.f57213a.mo65959g(c.mo66205d(), c.mo66203b(), c.mo66202a());
            } else {
                bitmap = Bitmap.createBitmap(c.mo66205d(), c.mo66203b(), c.mo66202a());
            }
            int h = C22635o.m102633h(bitmap);
            if (mo66192d() >= ((long) h)) {
                this.f57214b.mo66037f(new C22262b(), C22411h.m101762e(bitmap, this.f57213a));
            } else {
                this.f57213a.mo65956d(bitmap);
            }
            if (Log.isLoggable(f57209w, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("allocated [");
                sb.append(c.mo66205d());
                sb.append("x");
                sb.append(c.mo66203b());
                sb.append("] ");
                sb.append(c.mo66202a());
                sb.append(" size: ");
                sb.append(h);
            }
        }
        if (this.f57220v || this.f57215c.mo66200b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo66191c() {
        this.f57220v = true;
    }

    /* renamed from: d */
    public final long mo66192d() {
        return this.f57214b.mo66047e() - this.f57214b.mo66046d();
    }

    /* renamed from: e */
    public final long mo66193e() {
        long j = this.f57219g;
        this.f57219g = Math.min(4 * j, f57208Y);
        return j;
    }

    /* renamed from: f */
    public final boolean mo66194f(long j) {
        return this.f57216d.mo66196a() - j >= 32;
    }

    public void run() {
        if (mo66190a()) {
            this.f57218f.postDelayed(this, mo66193e());
        }
    }

    @C0344h1
    public C22260a(C22162e eVar, C22205j jVar, C22264c cVar, C22261a aVar, Handler handler) {
        this.f57217e = new HashSet();
        this.f57219g = 40;
        this.f57213a = eVar;
        this.f57214b = jVar;
        this.f57215c = cVar;
        this.f57216d = aVar;
        this.f57218f = handler;
    }
}
