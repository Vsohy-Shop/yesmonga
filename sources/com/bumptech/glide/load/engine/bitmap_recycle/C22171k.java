package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.k */
public class C22171k implements C22162e {

    /* renamed from: k */
    public static final String f56971k = "LruBitmapPool";

    /* renamed from: l */
    public static final Bitmap.Config f56972l = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final C22175l f56973a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f56974b;

    /* renamed from: c */
    public final long f56975c;

    /* renamed from: d */
    public final C22172a f56976d;

    /* renamed from: e */
    public long f56977e;

    /* renamed from: f */
    public long f56978f;

    /* renamed from: g */
    public int f56979g;

    /* renamed from: h */
    public int f56980h;

    /* renamed from: i */
    public int f56981i;

    /* renamed from: j */
    public int f56982j;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.k$a */
    public interface C22172a {
        /* renamed from: a */
        void mo66000a(Bitmap bitmap);

        /* renamed from: b */
        void mo66001b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.k$b */
    public static final class C22173b implements C22172a {
        /* renamed from: a */
        public void mo66000a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo66001b(Bitmap bitmap) {
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.k$c */
    public static class C22174c implements C22172a {

        /* renamed from: a */
        public final Set<Bitmap> f56983a = Collections.synchronizedSet(new HashSet());

        /* renamed from: a */
        public void mo66000a(Bitmap bitmap) {
            if (this.f56983a.contains(bitmap)) {
                this.f56983a.remove(bitmap);
                return;
            }
            throw new IllegalStateException("Cannot remove bitmap not in tracker");
        }

        /* renamed from: b */
        public void mo66001b(Bitmap bitmap) {
            if (!this.f56983a.contains(bitmap)) {
                this.f56983a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }
    }

    public C22171k(long j, C22175l lVar, Set<Bitmap.Config> set) {
        this.f56975c = j;
        this.f56977e = j;
        this.f56973a = lVar;
        this.f56974b = set;
        this.f56976d = new C22173b();
    }

    @TargetApi(26)
    /* renamed from: h */
    public static void m100994h(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @C0359n0
    /* renamed from: i */
    public static Bitmap m100995i(int i, int i2, @C0363p0 Bitmap.Config config) {
        if (config == null) {
            config = f56972l;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @TargetApi(26)
    /* renamed from: o */
    public static Set<Bitmap.Config> m100996o() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: p */
    public static C22175l m100997p() {
        return new C22177n();
    }

    @TargetApi(19)
    /* renamed from: s */
    public static void m100998s(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: u */
    public static void m100999u(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m100998s(bitmap);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo65953a(int i) {
        if (Log.isLoggable(f56971k, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
        }
        if (i >= 40 || i >= 20) {
            mo65954b();
        } else if (i >= 20 || i == 15) {
            mo65999v(mo65957e() / 2);
        }
    }

    /* renamed from: b */
    public void mo65954b() {
        mo65999v(0);
    }

    /* renamed from: c */
    public synchronized void mo65955c(float f) {
        this.f56977e = (long) Math.round(((float) this.f56975c) * f);
        mo65993l();
    }

    /* renamed from: d */
    public synchronized void mo65956d(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f56973a.mo65940e(bitmap)) <= this.f56977e) {
                        if (this.f56974b.contains(bitmap.getConfig())) {
                            int e = this.f56973a.mo65940e(bitmap);
                            this.f56973a.mo65939d(bitmap);
                            this.f56976d.mo66001b(bitmap);
                            this.f56981i++;
                            this.f56978f += (long) e;
                            if (Log.isLoggable(f56971k, 2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Put bitmap in pool=");
                                sb.append(this.f56973a.mo65936a(bitmap));
                            }
                            mo65991j();
                            mo65993l();
                            return;
                        }
                    }
                    if (Log.isLoggable(f56971k, 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.f56973a.mo65936a(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f56974b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: e */
    public long mo65957e() {
        return this.f56977e;
    }

    @C0359n0
    /* renamed from: f */
    public Bitmap mo65958f(int i, int i2, Bitmap.Config config) {
        Bitmap q = mo65996q(i, i2, config);
        if (q == null) {
            return m100995i(i, i2, config);
        }
        q.eraseColor(0);
        return q;
    }

    @C0359n0
    /* renamed from: g */
    public Bitmap mo65959g(int i, int i2, Bitmap.Config config) {
        Bitmap q = mo65996q(i, i2, config);
        if (q == null) {
            return m100995i(i, i2, config);
        }
        return q;
    }

    /* renamed from: j */
    public final void mo65991j() {
        if (Log.isLoggable(f56971k, 2)) {
            mo65992k();
        }
    }

    /* renamed from: k */
    public final void mo65992k() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f56979g);
        sb.append(", misses=");
        sb.append(this.f56980h);
        sb.append(", puts=");
        sb.append(this.f56981i);
        sb.append(", evictions=");
        sb.append(this.f56982j);
        sb.append(", currentSize=");
        sb.append(this.f56978f);
        sb.append(", maxSize=");
        sb.append(this.f56977e);
        sb.append("\nStrategy=");
        sb.append(this.f56973a);
    }

    /* renamed from: l */
    public final void mo65993l() {
        mo65999v(this.f56977e);
    }

    /* renamed from: m */
    public long mo65994m() {
        return (long) this.f56982j;
    }

    /* renamed from: n */
    public long mo65995n() {
        return this.f56978f;
    }

    @C0363p0
    /* renamed from: q */
    public final synchronized Bitmap mo65996q(int i, int i2, @C0363p0 Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap f;
        m100994h(config);
        C22175l lVar = this.f56973a;
        if (config != null) {
            config2 = config;
        } else {
            config2 = f56972l;
        }
        f = lVar.mo65941f(i, i2, config2);
        if (f == null) {
            if (Log.isLoggable(f56971k, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f56973a.mo65938c(i, i2, config));
            }
            this.f56980h++;
        } else {
            this.f56979g++;
            this.f56978f -= (long) this.f56973a.mo65940e(f);
            this.f56976d.mo66000a(f);
            m100999u(f);
        }
        if (Log.isLoggable(f56971k, 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f56973a.mo65938c(i, i2, config));
        }
        mo65991j();
        return f;
    }

    /* renamed from: r */
    public long mo65997r() {
        return (long) this.f56979g;
    }

    /* renamed from: t */
    public long mo65998t() {
        return (long) this.f56980h;
    }

    /* renamed from: v */
    public final synchronized void mo65999v(long j) {
        while (this.f56978f > j) {
            Bitmap b = this.f56973a.mo65937b();
            if (b == null) {
                if (Log.isLoggable(f56971k, 5)) {
                    mo65992k();
                }
                this.f56978f = 0;
                return;
            }
            this.f56976d.mo66000a(b);
            this.f56978f -= (long) this.f56973a.mo65940e(b);
            this.f56982j++;
            if (Log.isLoggable(f56971k, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f56973a.mo65936a(b));
            }
            mo65991j();
            b.recycle();
        }
    }

    public C22171k(long j) {
        this(j, m100997p(), m100996o());
    }

    public C22171k(long j, Set<Bitmap.Config> set) {
        this(j, m100997p(), set);
    }
}
