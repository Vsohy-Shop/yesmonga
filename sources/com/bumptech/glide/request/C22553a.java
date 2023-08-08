package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0337f0;
import androidx.annotation.C0349j;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0379x;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.C22109d;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.C22234h;
import com.bumptech.glide.load.model.stream.C22341b;
import com.bumptech.glide.load.resource.bitmap.C22405e;
import com.bumptech.glide.load.resource.bitmap.C22429n;
import com.bumptech.glide.load.resource.bitmap.C22431o;
import com.bumptech.glide.load.resource.bitmap.C22433p;
import com.bumptech.glide.load.resource.bitmap.C22439v;
import com.bumptech.glide.load.resource.bitmap.C22446z;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.gif.C22488i;
import com.bumptech.glide.request.C22553a;
import com.bumptech.glide.signature.C22611c;
import com.bumptech.glide.util.C22617b;
import com.bumptech.glide.util.C22633m;
import com.bumptech.glide.util.C22635o;
import java.util.Map;

/* renamed from: com.bumptech.glide.request.a */
public abstract class C22553a<T extends C22553a<T>> implements Cloneable {

    /* renamed from: P0 */
    public static final int f57821P0 = -1;

    /* renamed from: Q0 */
    public static final int f57822Q0 = 2;

    /* renamed from: R0 */
    public static final int f57823R0 = 4;

    /* renamed from: S0 */
    public static final int f57824S0 = 8;

    /* renamed from: T0 */
    public static final int f57825T0 = 16;

    /* renamed from: U0 */
    public static final int f57826U0 = 32;

    /* renamed from: V0 */
    public static final int f57827V0 = 64;

    /* renamed from: W0 */
    public static final int f57828W0 = 128;

    /* renamed from: X0 */
    public static final int f57829X0 = 256;

    /* renamed from: Y0 */
    public static final int f57830Y0 = 512;

    /* renamed from: Z0 */
    public static final int f57831Z0 = 1024;

    /* renamed from: a1 */
    public static final int f57832a1 = 2048;

    /* renamed from: b1 */
    public static final int f57833b1 = 4096;

    /* renamed from: c1 */
    public static final int f57834c1 = 8192;

    /* renamed from: d1 */
    public static final int f57835d1 = 16384;

    /* renamed from: e1 */
    public static final int f57836e1 = 32768;

    /* renamed from: f1 */
    public static final int f57837f1 = 65536;

    /* renamed from: g1 */
    public static final int f57838g1 = 131072;

    /* renamed from: h1 */
    public static final int f57839h1 = 262144;

    /* renamed from: i1 */
    public static final int f57840i1 = 524288;

    /* renamed from: j1 */
    public static final int f57841j1 = 1048576;

    /* renamed from: E0 */
    public int f57842E0;
    @C0359n0

    /* renamed from: F0 */
    public C22277f f57843F0 = new C22277f();
    @C0359n0

    /* renamed from: G0 */
    public Map<Class<?>, C22280i<?>> f57844G0 = new C22617b();
    @C0359n0

    /* renamed from: H0 */
    public Class<?> f57845H0 = Object.class;

    /* renamed from: I0 */
    public boolean f57846I0;
    @C0363p0

    /* renamed from: J0 */
    public Resources.Theme f57847J0;

    /* renamed from: K0 */
    public boolean f57848K0;

    /* renamed from: L0 */
    public boolean f57849L0;

    /* renamed from: M0 */
    public boolean f57850M0;

    /* renamed from: N0 */
    public boolean f57851N0 = true;

    /* renamed from: O0 */
    public boolean f57852O0;

    /* renamed from: X */
    public boolean f57853X;

    /* renamed from: Y */
    public boolean f57854Y = true;
    @C0363p0

    /* renamed from: Z */
    public Drawable f57855Z;

    /* renamed from: a */
    public int f57856a;

    /* renamed from: b */
    public float f57857b = 1.0f;
    @C0359n0

    /* renamed from: c */
    public C22234h f57858c = C22234h.f57127e;
    @C0359n0

    /* renamed from: d */
    public Priority f57859d = Priority.NORMAL;
    @C0363p0

    /* renamed from: e */
    public Drawable f57860e;

    /* renamed from: f */
    public int f57861f;
    @C0363p0

    /* renamed from: g */
    public Drawable f57862g;

    /* renamed from: v */
    public int f57863v;

    /* renamed from: w */
    public boolean f57864w = true;

    /* renamed from: x */
    public int f57865x = -1;

    /* renamed from: y */
    public int f57866y = -1;
    @C0359n0

    /* renamed from: z */
    public C22108c f57867z = C22611c.m102570c();

    /* renamed from: w0 */
    public static boolean m102246w0(int i, int i2) {
        return (i & i2) != 0;
    }

    @C0349j
    @C0359n0
    /* renamed from: A */
    public T mo66732A(@C0359n0 C22234h hVar) {
        if (this.f57848K0) {
            return clone().mo66732A(hVar);
        }
        this.f57858c = (C22234h) C22633m.m102624d(hVar);
        this.f57856a |= 4;
        return mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: B */
    public T mo66733B() {
        return mo66775Z0(C22488i.f57663b, Boolean.TRUE);
    }

    /* renamed from: B0 */
    public final boolean mo66734B0() {
        return mo66813v0(2048);
    }

    @C0349j
    @C0359n0
    /* renamed from: C */
    public T mo66735C() {
        if (this.f57848K0) {
            return clone().mo66735C();
        }
        this.f57844G0.clear();
        this.f57853X = false;
        this.f57854Y = false;
        this.f57856a = (this.f57856a & -2049 & -131073) | 65536;
        this.f57851N0 = true;
        return mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: D */
    public T mo66736D(@C0359n0 DownsampleStrategy downsampleStrategy) {
        return mo66775Z0(DownsampleStrategy.f57449h, C22633m.m102624d(downsampleStrategy));
    }

    /* renamed from: D0 */
    public final boolean mo66737D0() {
        return C22635o.m102648w(this.f57866y, this.f57865x);
    }

    @C0349j
    @C0359n0
    /* renamed from: E */
    public T mo66738E(@C0359n0 Bitmap.CompressFormat compressFormat) {
        return mo66775Z0(C22405e.f57520c, C22633m.m102624d(compressFormat));
    }

    @C0359n0
    /* renamed from: E0 */
    public T mo66739E0() {
        this.f57846I0 = true;
        return mo66771X0();
    }

    @C0349j
    @C0359n0
    /* renamed from: F */
    public T mo66740F(@C0337f0(from = 0, mo995to = 100) int i) {
        return mo66775Z0(C22405e.f57519b, Integer.valueOf(i));
    }

    @C0349j
    @C0359n0
    /* renamed from: F0 */
    public T mo66741F0(boolean z) {
        if (this.f57848K0) {
            return clone().mo66741F0(z);
        }
        this.f57850M0 = z;
        this.f57856a |= 524288;
        return mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: G */
    public T mo66742G(@C0375v int i) {
        if (this.f57848K0) {
            return clone().mo66742G(i);
        }
        this.f57861f = i;
        this.f57860e = null;
        this.f57856a = (this.f57856a | 32) & -17;
        return mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: G0 */
    public T mo66743G0() {
        return mo66756O0(DownsampleStrategy.f57446e, new C22429n());
    }

    @C0349j
    @C0359n0
    /* renamed from: H */
    public T mo66744H(@C0363p0 Drawable drawable) {
        if (this.f57848K0) {
            return clone().mo66744H(drawable);
        }
        this.f57860e = drawable;
        this.f57861f = 0;
        this.f57856a = (this.f57856a | 16) & -33;
        return mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: H0 */
    public T mo66745H0() {
        return mo66752L0(DownsampleStrategy.f57445d, new C22431o());
    }

    @C0349j
    @C0359n0
    /* renamed from: I */
    public T mo66746I(@C0375v int i) {
        if (this.f57848K0) {
            return clone().mo66746I(i);
        }
        this.f57842E0 = i;
        this.f57855Z = null;
        this.f57856a = (this.f57856a | 16384) & -8193;
        return mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: I0 */
    public T mo66747I0() {
        return mo66756O0(DownsampleStrategy.f57446e, new C22433p());
    }

    @C0349j
    @C0359n0
    /* renamed from: J */
    public T mo66748J(@C0363p0 Drawable drawable) {
        if (this.f57848K0) {
            return clone().mo66748J(drawable);
        }
        this.f57855Z = drawable;
        this.f57842E0 = 0;
        this.f57856a = (this.f57856a | 8192) & -16385;
        return mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: J0 */
    public T mo66749J0() {
        return mo66752L0(DownsampleStrategy.f57444c, new C22446z());
    }

    @C0349j
    @C0359n0
    /* renamed from: K */
    public T mo66750K() {
        return mo66769V0(DownsampleStrategy.f57444c, new C22446z());
    }

    @C0349j
    @C0359n0
    /* renamed from: L */
    public T mo66751L(@C0359n0 DecodeFormat decodeFormat) {
        C22633m.m102624d(decodeFormat);
        return mo66775Z0(C22439v.f57567g, decodeFormat).mo66775Z0(C22488i.f57662a, decodeFormat);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.i<android.graphics.Bitmap>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0359n0
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo66752L0(@androidx.annotation.C0359n0 com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 0
            com.bumptech.glide.request.a r2 = r1.mo66770W0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66752L0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.i):com.bumptech.glide.request.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.i<android.graphics.Bitmap>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0349j
    @androidx.annotation.C0359n0
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo66753M0(@androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 0
            com.bumptech.glide.request.a r2 = r1.mo66789g1(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66753M0(com.bumptech.glide.load.i):com.bumptech.glide.request.a");
    }

    @C0349j
    @C0359n0
    /* renamed from: N */
    public T mo66754N(@C0337f0(from = 0) long j) {
        return mo66775Z0(VideoDecoder.f57463g, Long.valueOf(j));
    }

    @C0359n0
    /* renamed from: O */
    public final C22234h mo66755O() {
        return this.f57858c;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.i<android.graphics.Bitmap>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0359n0
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo66756O0(@androidx.annotation.C0359n0 com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f57848K0
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.request.a r0 = r1.clone()
            com.bumptech.glide.request.a r2 = r0.mo66756O0(r2, r3)
            return r2
        L_0x000d:
            r1.mo66736D(r2)
            r2 = 0
            com.bumptech.glide.request.a r2 = r1.mo66789g1(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66756O0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.i):com.bumptech.glide.request.a");
    }

    /* renamed from: P */
    public final int mo66757P() {
        return this.f57861f;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.i<Y>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @androidx.annotation.C0349j
    @androidx.annotation.C0359n0
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo66758P0(@androidx.annotation.C0359n0 java.lang.Class<Y> r2, @androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<Y> r3) {
        /*
            r1 = this;
            r0 = 0
            com.bumptech.glide.request.a r2 = r1.mo66800l1(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66758P0(java.lang.Class, com.bumptech.glide.load.i):com.bumptech.glide.request.a");
    }

    @C0349j
    @C0359n0
    /* renamed from: Q0 */
    public T mo66759Q0(int i) {
        return mo66761R0(i, i);
    }

    @C0363p0
    /* renamed from: R */
    public final Drawable mo66760R() {
        return this.f57860e;
    }

    @C0349j
    @C0359n0
    /* renamed from: R0 */
    public T mo66761R0(int i, int i2) {
        if (this.f57848K0) {
            return clone().mo66761R0(i, i2);
        }
        this.f57866y = i;
        this.f57865x = i2;
        this.f57856a |= 512;
        return mo66773Y0();
    }

    @C0363p0
    /* renamed from: S */
    public final Drawable mo66762S() {
        return this.f57855Z;
    }

    @C0349j
    @C0359n0
    /* renamed from: S0 */
    public T mo66763S0(@C0375v int i) {
        if (this.f57848K0) {
            return clone().mo66763S0(i);
        }
        this.f57863v = i;
        this.f57862g = null;
        this.f57856a = (this.f57856a | 128) & -65;
        return mo66773Y0();
    }

    /* renamed from: T */
    public final int mo66764T() {
        return this.f57842E0;
    }

    @C0349j
    @C0359n0
    /* renamed from: T0 */
    public T mo66765T0(@C0363p0 Drawable drawable) {
        if (this.f57848K0) {
            return clone().mo66765T0(drawable);
        }
        this.f57862g = drawable;
        this.f57863v = 0;
        this.f57856a = (this.f57856a | 64) & -129;
        return mo66773Y0();
    }

    /* renamed from: U */
    public final boolean mo66766U() {
        return this.f57850M0;
    }

    @C0349j
    @C0359n0
    /* renamed from: U0 */
    public T mo66767U0(@C0359n0 Priority priority) {
        if (this.f57848K0) {
            return clone().mo66767U0(priority);
        }
        this.f57859d = (Priority) C22633m.m102624d(priority);
        this.f57856a |= 8;
        return mo66773Y0();
    }

    @C0359n0
    /* renamed from: V */
    public final C22277f mo66768V() {
        return this.f57843F0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.i<android.graphics.Bitmap>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0359n0
    /* renamed from: V0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo66769V0(@androidx.annotation.C0359n0 com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 1
            com.bumptech.glide.request.a r2 = r1.mo66770W0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66769V0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.i):com.bumptech.glide.request.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.i<android.graphics.Bitmap>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0359n0
    /* renamed from: W0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo66770W0(@androidx.annotation.C0359n0 com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1, @androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<android.graphics.Bitmap> r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0007
            com.bumptech.glide.request.a r1 = r0.mo66791h1(r1, r2)
            goto L_0x000b
        L_0x0007:
            com.bumptech.glide.request.a r1 = r0.mo66756O0(r1, r2)
        L_0x000b:
            r2 = 1
            r1.f57851N0 = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66770W0(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.i, boolean):com.bumptech.glide.request.a");
    }

    /* renamed from: X0 */
    public final T mo66771X0() {
        return this;
    }

    /* renamed from: Y */
    public final int mo66772Y() {
        return this.f57865x;
    }

    @C0359n0
    /* renamed from: Y0 */
    public final T mo66773Y0() {
        if (!this.f57846I0) {
            return mo66771X0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: Z */
    public final int mo66774Z() {
        return this.f57866y;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.e<Y>, com.bumptech.glide.load.e, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0349j
    @androidx.annotation.C0359n0
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo66775Z0(@androidx.annotation.C0359n0 com.bumptech.glide.load.C22139e<Y> r2, @androidx.annotation.C0359n0 Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f57848K0
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.request.a r0 = r1.clone()
            com.bumptech.glide.request.a r2 = r0.mo66775Z0(r2, r3)
            return r2
        L_0x000d:
            com.bumptech.glide.util.C22633m.m102624d(r2)
            com.bumptech.glide.util.C22633m.m102624d(r3)
            com.bumptech.glide.load.f r0 = r1.f57843F0
            r0.mo66234e(r2, r3)
            com.bumptech.glide.request.a r2 = r1.mo66773Y0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66775Z0(com.bumptech.glide.load.e, java.lang.Object):com.bumptech.glide.request.a");
    }

    @C0363p0
    /* renamed from: a0 */
    public final Drawable mo66776a0() {
        return this.f57862g;
    }

    @C0349j
    @C0359n0
    /* renamed from: a1 */
    public T mo66777a1(@C0359n0 C22108c cVar) {
        if (this.f57848K0) {
            return clone().mo66777a1(cVar);
        }
        this.f57867z = (C22108c) C22633m.m102624d(cVar);
        this.f57856a |= 1024;
        return mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: b */
    public T mo65688b(@C0359n0 C22553a<?> aVar) {
        if (this.f57848K0) {
            return clone().mo65688b(aVar);
        }
        if (m102246w0(aVar.f57856a, 2)) {
            this.f57857b = aVar.f57857b;
        }
        if (m102246w0(aVar.f57856a, 262144)) {
            this.f57849L0 = aVar.f57849L0;
        }
        if (m102246w0(aVar.f57856a, 1048576)) {
            this.f57852O0 = aVar.f57852O0;
        }
        if (m102246w0(aVar.f57856a, 4)) {
            this.f57858c = aVar.f57858c;
        }
        if (m102246w0(aVar.f57856a, 8)) {
            this.f57859d = aVar.f57859d;
        }
        if (m102246w0(aVar.f57856a, 16)) {
            this.f57860e = aVar.f57860e;
            this.f57861f = 0;
            this.f57856a &= -33;
        }
        if (m102246w0(aVar.f57856a, 32)) {
            this.f57861f = aVar.f57861f;
            this.f57860e = null;
            this.f57856a &= -17;
        }
        if (m102246w0(aVar.f57856a, 64)) {
            this.f57862g = aVar.f57862g;
            this.f57863v = 0;
            this.f57856a &= -129;
        }
        if (m102246w0(aVar.f57856a, 128)) {
            this.f57863v = aVar.f57863v;
            this.f57862g = null;
            this.f57856a &= -65;
        }
        if (m102246w0(aVar.f57856a, 256)) {
            this.f57864w = aVar.f57864w;
        }
        if (m102246w0(aVar.f57856a, 512)) {
            this.f57866y = aVar.f57866y;
            this.f57865x = aVar.f57865x;
        }
        if (m102246w0(aVar.f57856a, 1024)) {
            this.f57867z = aVar.f57867z;
        }
        if (m102246w0(aVar.f57856a, 4096)) {
            this.f57845H0 = aVar.f57845H0;
        }
        if (m102246w0(aVar.f57856a, 8192)) {
            this.f57855Z = aVar.f57855Z;
            this.f57842E0 = 0;
            this.f57856a &= -16385;
        }
        if (m102246w0(aVar.f57856a, 16384)) {
            this.f57842E0 = aVar.f57842E0;
            this.f57855Z = null;
            this.f57856a &= -8193;
        }
        if (m102246w0(aVar.f57856a, 32768)) {
            this.f57847J0 = aVar.f57847J0;
        }
        if (m102246w0(aVar.f57856a, 65536)) {
            this.f57854Y = aVar.f57854Y;
        }
        if (m102246w0(aVar.f57856a, 131072)) {
            this.f57853X = aVar.f57853X;
        }
        if (m102246w0(aVar.f57856a, 2048)) {
            this.f57844G0.putAll(aVar.f57844G0);
            this.f57851N0 = aVar.f57851N0;
        }
        if (m102246w0(aVar.f57856a, 524288)) {
            this.f57850M0 = aVar.f57850M0;
        }
        if (!this.f57854Y) {
            this.f57844G0.clear();
            this.f57853X = false;
            this.f57856a = this.f57856a & -2049 & -131073;
            this.f57851N0 = true;
        }
        this.f57856a |= aVar.f57856a;
        this.f57843F0.mo66233d(aVar.f57843F0);
        return mo66773Y0();
    }

    /* renamed from: b0 */
    public final int mo66778b0() {
        return this.f57863v;
    }

    @C0349j
    @C0359n0
    /* renamed from: b1 */
    public T mo66779b1(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        if (this.f57848K0) {
            return clone().mo66779b1(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f57857b = f;
        this.f57856a |= 2;
        return mo66773Y0();
    }

    @C0359n0
    /* renamed from: c */
    public T mo66780c() {
        if (!this.f57846I0 || this.f57848K0) {
            this.f57848K0 = true;
            return mo66739E0();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    @C0359n0
    /* renamed from: c0 */
    public final Priority mo66781c0() {
        return this.f57859d;
    }

    @C0349j
    @C0359n0
    /* renamed from: c1 */
    public T mo66782c1(boolean z) {
        if (this.f57848K0) {
            return clone().mo66782c1(true);
        }
        this.f57864w = !z;
        this.f57856a |= 256;
        return mo66773Y0();
    }

    @C0359n0
    /* renamed from: d0 */
    public final Class<?> mo66783d0() {
        return this.f57845H0;
    }

    @C0349j
    @C0359n0
    /* renamed from: d1 */
    public T mo66784d1(@C0363p0 Resources.Theme theme) {
        if (this.f57848K0) {
            return clone().mo66784d1(theme);
        }
        this.f57847J0 = theme;
        this.f57856a |= 32768;
        return mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: e1 */
    public T mo66785e1(@C0337f0(from = 0) int i) {
        return mo66775Z0(C22341b.f57374b, Integer.valueOf(i));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22553a)) {
            return false;
        }
        C22553a aVar = (C22553a) obj;
        if (Float.compare(aVar.f57857b, this.f57857b) == 0 && this.f57861f == aVar.f57861f && C22635o.m102629d(this.f57860e, aVar.f57860e) && this.f57863v == aVar.f57863v && C22635o.m102629d(this.f57862g, aVar.f57862g) && this.f57842E0 == aVar.f57842E0 && C22635o.m102629d(this.f57855Z, aVar.f57855Z) && this.f57864w == aVar.f57864w && this.f57865x == aVar.f57865x && this.f57866y == aVar.f57866y && this.f57853X == aVar.f57853X && this.f57854Y == aVar.f57854Y && this.f57849L0 == aVar.f57849L0 && this.f57850M0 == aVar.f57850M0 && this.f57858c.equals(aVar.f57858c) && this.f57859d == aVar.f57859d && this.f57843F0.equals(aVar.f57843F0) && this.f57844G0.equals(aVar.f57844G0) && this.f57845H0.equals(aVar.f57845H0) && C22635o.m102629d(this.f57867z, aVar.f57867z) && C22635o.m102629d(this.f57847J0, aVar.f57847J0)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.i<android.graphics.Bitmap>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0349j
    @androidx.annotation.C0359n0
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo66787f1(@androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            com.bumptech.glide.request.a r2 = r1.mo66789g1(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66787f1(com.bumptech.glide.load.i):com.bumptech.glide.request.a");
    }

    @C0359n0
    /* renamed from: g0 */
    public final C22108c mo66788g0() {
        return this.f57867z;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.i<android.graphics.Bitmap>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0359n0
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo66789g1(@androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f57848K0
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.request.a r0 = r2.clone()
            com.bumptech.glide.request.a r3 = r0.mo66789g1(r3, r4)
            return r3
        L_0x000d:
            com.bumptech.glide.load.resource.bitmap.x r0 = new com.bumptech.glide.load.resource.bitmap.x
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo66800l1(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo66800l1(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.i r0 = r0.mo66464c()
            r2.mo66800l1(r1, r0, r4)
            com.bumptech.glide.load.resource.gif.f r0 = new com.bumptech.glide.load.resource.gif.f
            r0.<init>(r3)
            java.lang.Class<com.bumptech.glide.load.resource.gif.c> r3 = com.bumptech.glide.load.resource.gif.C22477c.class
            r2.mo66800l1(r3, r0, r4)
            com.bumptech.glide.request.a r3 = r2.mo66773Y0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66789g1(com.bumptech.glide.load.i, boolean):com.bumptech.glide.request.a");
    }

    /* renamed from: h0 */
    public final float mo66790h0() {
        return this.f57857b;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.i<android.graphics.Bitmap>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0349j
    @androidx.annotation.C0359n0
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo66791h1(@androidx.annotation.C0359n0 com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f57848K0
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.request.a r0 = r1.clone()
            com.bumptech.glide.request.a r2 = r0.mo66791h1(r2, r3)
            return r2
        L_0x000d:
            r1.mo66736D(r2)
            com.bumptech.glide.request.a r2 = r1.mo66787f1(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66791h1(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.i):com.bumptech.glide.request.a");
    }

    public int hashCode() {
        return C22635o.m102642q(this.f57847J0, C22635o.m102642q(this.f57867z, C22635o.m102642q(this.f57845H0, C22635o.m102642q(this.f57844G0, C22635o.m102642q(this.f57843F0, C22635o.m102642q(this.f57859d, C22635o.m102642q(this.f57858c, C22635o.m102644s(this.f57850M0, C22635o.m102644s(this.f57849L0, C22635o.m102644s(this.f57854Y, C22635o.m102644s(this.f57853X, C22635o.m102641p(this.f57866y, C22635o.m102641p(this.f57865x, C22635o.m102644s(this.f57864w, C22635o.m102642q(this.f57855Z, C22635o.m102641p(this.f57842E0, C22635o.m102642q(this.f57862g, C22635o.m102641p(this.f57863v, C22635o.m102642q(this.f57860e, C22635o.m102641p(this.f57861f, C22635o.m102638m(this.f57857b)))))))))))))))))))));
    }

    @C0363p0
    /* renamed from: i0 */
    public final Resources.Theme mo66793i0() {
        return this.f57847J0;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.i<Y>, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @androidx.annotation.C0349j
    @androidx.annotation.C0359n0
    /* renamed from: i1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo66794i1(@androidx.annotation.C0359n0 java.lang.Class<Y> r2, @androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<Y> r3) {
        /*
            r1 = this;
            r0 = 1
            com.bumptech.glide.request.a r2 = r1.mo66800l1(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66794i1(java.lang.Class, com.bumptech.glide.load.i):com.bumptech.glide.request.a");
    }

    @C0359n0
    /* renamed from: j0 */
    public final Map<Class<?>, C22280i<?>> mo66795j0() {
        return this.f57844G0;
    }

    @C0349j
    @C0359n0
    /* renamed from: k */
    public T mo66796k() {
        return mo66791h1(DownsampleStrategy.f57446e, new C22429n());
    }

    /* renamed from: k0 */
    public final boolean mo66797k0() {
        return this.f57852O0;
    }

    @C0349j
    @C0359n0
    /* renamed from: l */
    public T mo66798l() {
        return mo66769V0(DownsampleStrategy.f57445d, new C22431o());
    }

    /* renamed from: l0 */
    public final boolean mo66799l0() {
        return this.f57849L0;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.i<Y>, java.lang.Object, com.bumptech.glide.load.i] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @androidx.annotation.C0359n0
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo66800l1(@androidx.annotation.C0359n0 java.lang.Class<Y> r2, @androidx.annotation.C0359n0 com.bumptech.glide.load.C22280i<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f57848K0
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.request.a r0 = r1.clone()
            com.bumptech.glide.request.a r2 = r0.mo66800l1(r2, r3, r4)
            return r2
        L_0x000d:
            com.bumptech.glide.util.C22633m.m102624d(r2)
            com.bumptech.glide.util.C22633m.m102624d(r3)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r0 = r1.f57844G0
            r0.put(r2, r3)
            int r2 = r1.f57856a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.f57854Y = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f57856a = r2
            r0 = 0
            r1.f57851N0 = r0
            if (r4 == 0) goto L_0x0030
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f57856a = r2
            r1.f57853X = r3
        L_0x0030:
            com.bumptech.glide.request.a r2 = r1.mo66773Y0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C22553a.mo66800l1(java.lang.Class, com.bumptech.glide.load.i, boolean):com.bumptech.glide.request.a");
    }

    /* renamed from: m0 */
    public final boolean mo66801m0() {
        return this.f57848K0;
    }

    @C0349j
    @C0359n0
    /* renamed from: m1 */
    public T mo66802m1(@C0359n0 C22280i<Bitmap>... iVarArr) {
        if (iVarArr.length > 1) {
            return mo66789g1(new C22109d((C22280i<T>[]) iVarArr), true);
        }
        if (iVarArr.length == 1) {
            return mo66787f1(iVarArr[0]);
        }
        return mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: n */
    public T mo66803n() {
        return mo66791h1(DownsampleStrategy.f57445d, new C22433p());
    }

    @C0349j
    @C0359n0
    @Deprecated
    /* renamed from: n1 */
    public T mo66804n1(@C0359n0 C22280i<Bitmap>... iVarArr) {
        return mo66789g1(new C22109d((C22280i<T>[]) iVarArr), true);
    }

    @C0349j
    /* renamed from: o */
    public T clone() {
        try {
            T t = (C22553a) super.clone();
            C22277f fVar = new C22277f();
            t.f57843F0 = fVar;
            fVar.mo66233d(this.f57843F0);
            C22617b bVar = new C22617b();
            t.f57844G0 = bVar;
            bVar.putAll(this.f57844G0);
            t.f57846I0 = false;
            t.f57848K0 = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: o0 */
    public final boolean mo66805o0() {
        return mo66813v0(4);
    }

    @C0349j
    @C0359n0
    /* renamed from: o1 */
    public T mo66806o1(boolean z) {
        if (this.f57848K0) {
            return clone().mo66806o1(z);
        }
        this.f57852O0 = z;
        this.f57856a |= 1048576;
        return mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: p1 */
    public T mo66807p1(boolean z) {
        if (this.f57848K0) {
            return clone().mo66807p1(z);
        }
        this.f57849L0 = z;
        this.f57856a |= 262144;
        return mo66773Y0();
    }

    /* renamed from: q0 */
    public final boolean mo66808q0() {
        return this.f57846I0;
    }

    /* renamed from: r0 */
    public final boolean mo66809r0() {
        return this.f57864w;
    }

    /* renamed from: s0 */
    public final boolean mo66810s0() {
        return mo66813v0(8);
    }

    /* renamed from: u0 */
    public boolean mo66811u0() {
        return this.f57851N0;
    }

    @C0349j
    @C0359n0
    /* renamed from: v */
    public T mo66812v(@C0359n0 Class<?> cls) {
        if (this.f57848K0) {
            return clone().mo66812v(cls);
        }
        this.f57845H0 = (Class) C22633m.m102624d(cls);
        this.f57856a |= 4096;
        return mo66773Y0();
    }

    /* renamed from: v0 */
    public final boolean mo66813v0(int i) {
        return m102246w0(this.f57856a, i);
    }

    @C0349j
    @C0359n0
    /* renamed from: x */
    public T mo66814x() {
        return mo66775Z0(C22439v.f57571k, Boolean.FALSE);
    }

    /* renamed from: x0 */
    public final boolean mo66815x0() {
        return mo66813v0(256);
    }

    /* renamed from: y0 */
    public final boolean mo66816y0() {
        return this.f57854Y;
    }

    /* renamed from: z0 */
    public final boolean mo66817z0() {
        return this.f57853X;
    }
}
