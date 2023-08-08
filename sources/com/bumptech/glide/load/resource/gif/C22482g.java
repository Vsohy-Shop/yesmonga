package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.C22092j;
import com.bumptech.glide.gifdecoder.C22068a;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.load.engine.C22234h;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.request.C22561h;
import com.bumptech.glide.request.target.C22568e;
import com.bumptech.glide.request.transition.C22598f;
import com.bumptech.glide.signature.C22613e;
import com.bumptech.glide.util.C22633m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.gif.g */
public class C22482g {

    /* renamed from: a */
    public final C22068a f57635a;

    /* renamed from: b */
    public final Handler f57636b;

    /* renamed from: c */
    public final List<C22484b> f57637c;

    /* renamed from: d */
    public final C22092j f57638d;

    /* renamed from: e */
    public final C22162e f57639e;

    /* renamed from: f */
    public boolean f57640f;

    /* renamed from: g */
    public boolean f57641g;

    /* renamed from: h */
    public boolean f57642h;

    /* renamed from: i */
    public C22090i<Bitmap> f57643i;

    /* renamed from: j */
    public C22483a f57644j;

    /* renamed from: k */
    public boolean f57645k;

    /* renamed from: l */
    public C22483a f57646l;

    /* renamed from: m */
    public Bitmap f57647m;

    /* renamed from: n */
    public C22280i<Bitmap> f57648n;

    /* renamed from: o */
    public C22483a f57649o;
    @C0363p0

    /* renamed from: p */
    public C22486d f57650p;

    /* renamed from: q */
    public int f57651q;

    /* renamed from: r */
    public int f57652r;

    /* renamed from: s */
    public int f57653s;

    @C0344h1
    /* renamed from: com.bumptech.glide.load.resource.gif.g$a */
    public static class C22483a extends C22568e<Bitmap> {

        /* renamed from: d */
        public final Handler f57654d;

        /* renamed from: e */
        public final int f57655e;

        /* renamed from: f */
        public final long f57656f;

        /* renamed from: g */
        public Bitmap f57657g;

        public C22483a(Handler handler, int i, long j) {
            this.f57654d = handler;
            this.f57655e = i;
            this.f57656f = j;
        }

        /* renamed from: e */
        public Bitmap mo66556e() {
            return this.f57657g;
        }

        /* renamed from: f */
        public void mo65592l(@C0359n0 Bitmap bitmap, @C0363p0 C22598f<? super Bitmap> fVar) {
            this.f57657g = bitmap;
            this.f57654d.sendMessageAtTime(this.f57654d.obtainMessage(1, this), this.f57656f);
        }

        /* renamed from: k */
        public void mo65591k(@C0363p0 Drawable drawable) {
            this.f57657g = null;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.g$b */
    public interface C22484b {
        /* renamed from: a */
        void mo66499a();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.g$c */
    public class C22485c implements Handler.Callback {

        /* renamed from: d */
        public static final int f57658d = 1;

        /* renamed from: e */
        public static final int f57659e = 2;

        public C22485c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C22482g.this.mo66547o((C22483a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C22482g.this.f57638d.mo65712B((C22483a) message.obj);
                return false;
            }
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.resource.gif.g$d */
    public interface C22486d {
        /* renamed from: a */
        void mo66559a();
    }

    public C22482g(C22038b bVar, C22068a aVar, int i, int i2, C22280i<Bitmap> iVar, Bitmap bitmap) {
        this(bVar.mo65480h(), C22038b.m100350E(bVar.mo65482j()), aVar, (Handler) null, m102007k(C22038b.m100350E(bVar.mo65482j()), i, i2), iVar, bitmap);
    }

    /* renamed from: g */
    public static C22108c m102006g() {
        return new C22613e(Double.valueOf(Math.random()));
    }

    /* renamed from: k */
    public static C22090i<Bitmap> m102007k(C22092j jVar, int i, int i2) {
        return jVar.mo65748w().mo65688b(((C22561h) ((C22561h) C22561h.m102395v1(C22234h.f57124b).mo66806o1(true)).mo66782c1(true)).mo66761R0(i, i2));
    }

    /* renamed from: a */
    public void mo66535a() {
        this.f57637c.clear();
        mo66548p();
        mo66553u();
        C22483a aVar = this.f57644j;
        if (aVar != null) {
            this.f57638d.mo65712B(aVar);
            this.f57644j = null;
        }
        C22483a aVar2 = this.f57646l;
        if (aVar2 != null) {
            this.f57638d.mo65712B(aVar2);
            this.f57646l = null;
        }
        C22483a aVar3 = this.f57649o;
        if (aVar3 != null) {
            this.f57638d.mo65712B(aVar3);
            this.f57649o = null;
        }
        this.f57635a.clear();
        this.f57645k = true;
    }

    /* renamed from: b */
    public ByteBuffer mo66536b() {
        return this.f57635a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap mo66537c() {
        C22483a aVar = this.f57644j;
        return aVar != null ? aVar.mo66556e() : this.f57647m;
    }

    /* renamed from: d */
    public int mo66538d() {
        C22483a aVar = this.f57644j;
        if (aVar != null) {
            return aVar.f57655e;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap mo66539e() {
        return this.f57647m;
    }

    /* renamed from: f */
    public int mo66540f() {
        return this.f57635a.mo65610d();
    }

    /* renamed from: h */
    public C22280i<Bitmap> mo66541h() {
        return this.f57648n;
    }

    /* renamed from: i */
    public int mo66542i() {
        return this.f57653s;
    }

    /* renamed from: j */
    public int mo66543j() {
        return this.f57635a.mo65613g();
    }

    /* renamed from: l */
    public int mo66544l() {
        return this.f57635a.mo65626p() + this.f57651q;
    }

    /* renamed from: m */
    public int mo66545m() {
        return this.f57652r;
    }

    /* renamed from: n */
    public final void mo66546n() {
        boolean z;
        if (this.f57640f && !this.f57641g) {
            if (this.f57642h) {
                if (this.f57649o == null) {
                    z = true;
                } else {
                    z = false;
                }
                C22633m.m102621a(z, "Pending target must be null when starting from the first frame");
                this.f57635a.mo65621k();
                this.f57642h = false;
            }
            C22483a aVar = this.f57649o;
            if (aVar != null) {
                this.f57649o = null;
                mo66547o(aVar);
                return;
            }
            this.f57641g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f57635a.mo65620j());
            this.f57635a.mo65608c();
            this.f57646l = new C22483a(this.f57636b, this.f57635a.mo65623m(), uptimeMillis);
            this.f57643i.mo65688b(C22561h.m102386Q1(m102006g())).mo65603s(this.f57635a).mo65672H1(this.f57646l);
        }
    }

    @C0344h1
    /* renamed from: o */
    public void mo66547o(C22483a aVar) {
        C22486d dVar = this.f57650p;
        if (dVar != null) {
            dVar.mo66559a();
        }
        this.f57641g = false;
        if (this.f57645k) {
            this.f57636b.obtainMessage(2, aVar).sendToTarget();
        } else if (this.f57640f) {
            if (aVar.mo66556e() != null) {
                mo66548p();
                C22483a aVar2 = this.f57644j;
                this.f57644j = aVar;
                for (int size = this.f57637c.size() - 1; size >= 0; size--) {
                    this.f57637c.get(size).mo66499a();
                }
                if (aVar2 != null) {
                    this.f57636b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            mo66546n();
        } else if (this.f57642h) {
            this.f57636b.obtainMessage(2, aVar).sendToTarget();
        } else {
            this.f57649o = aVar;
        }
    }

    /* renamed from: p */
    public final void mo66548p() {
        Bitmap bitmap = this.f57647m;
        if (bitmap != null) {
            this.f57639e.mo65956d(bitmap);
            this.f57647m = null;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.bumptech.glide.load.i<android.graphics.Bitmap>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66549q(com.bumptech.glide.load.C22280i<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            java.lang.Object r0 = com.bumptech.glide.util.C22633m.m102624d(r3)
            com.bumptech.glide.load.i r0 = (com.bumptech.glide.load.C22280i) r0
            r2.f57648n = r0
            java.lang.Object r0 = com.bumptech.glide.util.C22633m.m102624d(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.f57647m = r0
            com.bumptech.glide.i<android.graphics.Bitmap> r0 = r2.f57643i
            com.bumptech.glide.request.h r1 = new com.bumptech.glide.request.h
            r1.<init>()
            com.bumptech.glide.request.a r3 = r1.mo66787f1(r3)
            com.bumptech.glide.i r3 = r0.mo65688b(r3)
            r2.f57643i = r3
            int r3 = com.bumptech.glide.util.C22635o.m102633h(r4)
            r2.f57651q = r3
            int r3 = r4.getWidth()
            r2.f57652r = r3
            int r3 = r4.getHeight()
            r2.f57653s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.gif.C22482g.mo66549q(com.bumptech.glide.load.i, android.graphics.Bitmap):void");
    }

    /* renamed from: r */
    public void mo66550r() {
        C22633m.m102621a(!this.f57640f, "Can't restart a running animation");
        this.f57642h = true;
        C22483a aVar = this.f57649o;
        if (aVar != null) {
            this.f57638d.mo65712B(aVar);
            this.f57649o = null;
        }
    }

    @C0344h1
    /* renamed from: s */
    public void mo66551s(@C0363p0 C22486d dVar) {
        this.f57650p = dVar;
    }

    /* renamed from: t */
    public final void mo66552t() {
        if (!this.f57640f) {
            this.f57640f = true;
            this.f57645k = false;
            mo66546n();
        }
    }

    /* renamed from: u */
    public final void mo66553u() {
        this.f57640f = false;
    }

    /* renamed from: v */
    public void mo66554v(C22484b bVar) {
        if (this.f57645k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f57637c.contains(bVar)) {
            boolean isEmpty = this.f57637c.isEmpty();
            this.f57637c.add(bVar);
            if (isEmpty) {
                mo66552t();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* renamed from: w */
    public void mo66555w(C22484b bVar) {
        this.f57637c.remove(bVar);
        if (this.f57637c.isEmpty()) {
            mo66553u();
        }
    }

    public C22482g(C22162e eVar, C22092j jVar, C22068a aVar, Handler handler, C22090i<Bitmap> iVar, C22280i<Bitmap> iVar2, Bitmap bitmap) {
        this.f57637c = new ArrayList();
        this.f57638d = jVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C22485c()) : handler;
        this.f57639e = eVar;
        this.f57636b = handler;
        this.f57643i = iVar;
        this.f57635a = aVar;
        mo66549q(iVar2, bitmap);
    }
}
