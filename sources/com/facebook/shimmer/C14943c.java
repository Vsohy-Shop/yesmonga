package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.C0354l;
import androidx.annotation.C0372t0;
import androidx.annotation.C0379x;
import com.facebook.shimmer.C14939b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.facebook.shimmer.c */
public class C14943c {

    /* renamed from: v */
    public static final int f37034v = 4;

    /* renamed from: a */
    public final float[] f37035a = new float[4];

    /* renamed from: b */
    public final int[] f37036b = new int[4];

    /* renamed from: c */
    public final RectF f37037c = new RectF();

    /* renamed from: d */
    public int f37038d = 0;
    @C0354l

    /* renamed from: e */
    public int f37039e = -1;
    @C0354l

    /* renamed from: f */
    public int f37040f = 1291845631;

    /* renamed from: g */
    public int f37041g = 0;

    /* renamed from: h */
    public int f37042h = 0;

    /* renamed from: i */
    public int f37043i = 0;

    /* renamed from: j */
    public float f37044j = 1.0f;

    /* renamed from: k */
    public float f37045k = 1.0f;

    /* renamed from: l */
    public float f37046l = 0.0f;

    /* renamed from: m */
    public float f37047m = 0.5f;

    /* renamed from: n */
    public float f37048n = 20.0f;

    /* renamed from: o */
    public boolean f37049o = true;

    /* renamed from: p */
    public boolean f37050p = true;

    /* renamed from: q */
    public boolean f37051q = true;

    /* renamed from: r */
    public int f37052r = -1;

    /* renamed from: s */
    public int f37053s = 1;

    /* renamed from: t */
    public long f37054t = 1000;

    /* renamed from: u */
    public long f37055u;

    /* renamed from: com.facebook.shimmer.c$a */
    public static class C14944a extends C14945b<C14944a> {
        public C14944a() {
            this.f37056a.f37051q = true;
        }

        /* renamed from: x */
        public C14944a mo37007f() {
            return this;
        }
    }

    /* renamed from: com.facebook.shimmer.c$b */
    public static abstract class C14945b<T extends C14945b<T>> {

        /* renamed from: a */
        public final C14943c f37056a = new C14943c();

        /* renamed from: b */
        public static float m64270b(float f, float f2, float f3) {
            return Math.min(f2, Math.max(f, f3));
        }

        /* renamed from: a */
        public C14943c mo37009a() {
            this.f37056a.mo37004c();
            this.f37056a.mo37005d();
            return this.f37056a;
        }

        /* renamed from: c */
        public T mo37010c(Context context, AttributeSet attributeSet) {
            return mo37011d(context.obtainStyledAttributes(attributeSet, C14939b.C14942c.ShimmerFrameLayout, 0, 0));
        }

        /* renamed from: d */
        public T mo37011d(TypedArray typedArray) {
            int i = C14939b.C14942c.ShimmerFrameLayout_shimmer_clip_to_children;
            if (typedArray.hasValue(i)) {
                mo37015i(typedArray.getBoolean(i, this.f37056a.f37049o));
            }
            int i2 = C14939b.C14942c.ShimmerFrameLayout_shimmer_auto_start;
            if (typedArray.hasValue(i2)) {
                mo37013g(typedArray.getBoolean(i2, this.f37056a.f37050p));
            }
            int i3 = C14939b.C14942c.ShimmerFrameLayout_shimmer_base_alpha;
            if (typedArray.hasValue(i3)) {
                mo37014h(typedArray.getFloat(i3, 0.3f));
            }
            int i4 = C14939b.C14942c.ShimmerFrameLayout_shimmer_highlight_alpha;
            if (typedArray.hasValue(i4)) {
                mo37022p(typedArray.getFloat(i4, 1.0f));
            }
            int i5 = C14939b.C14942c.ShimmerFrameLayout_shimmer_duration;
            if (typedArray.hasValue(i5)) {
                mo37018l((long) typedArray.getInt(i5, (int) this.f37056a.f37054t));
            }
            int i6 = C14939b.C14942c.ShimmerFrameLayout_shimmer_repeat_count;
            if (typedArray.hasValue(i6)) {
                mo37024r(typedArray.getInt(i6, this.f37056a.f37052r));
            }
            int i7 = C14939b.C14942c.ShimmerFrameLayout_shimmer_repeat_delay;
            if (typedArray.hasValue(i7)) {
                mo37025s((long) typedArray.getInt(i7, (int) this.f37056a.f37055u));
            }
            int i8 = C14939b.C14942c.ShimmerFrameLayout_shimmer_repeat_mode;
            if (typedArray.hasValue(i8)) {
                mo37026t(typedArray.getInt(i8, this.f37056a.f37053s));
            }
            int i9 = C14939b.C14942c.ShimmerFrameLayout_shimmer_direction;
            if (typedArray.hasValue(i9)) {
                int i10 = typedArray.getInt(i9, this.f37056a.f37038d);
                if (i10 == 1) {
                    mo37016j(1);
                } else if (i10 == 2) {
                    mo37016j(2);
                } else if (i10 != 3) {
                    mo37016j(0);
                } else {
                    mo37016j(3);
                }
            }
            int i11 = C14939b.C14942c.ShimmerFrameLayout_shimmer_shape;
            if (typedArray.hasValue(i11)) {
                if (typedArray.getInt(i11, this.f37056a.f37041g) != 1) {
                    mo37027u(0);
                } else {
                    mo37027u(1);
                }
            }
            int i12 = C14939b.C14942c.ShimmerFrameLayout_shimmer_dropoff;
            if (typedArray.hasValue(i12)) {
                mo37017k(typedArray.getFloat(i12, this.f37056a.f37047m));
            }
            int i13 = C14939b.C14942c.ShimmerFrameLayout_shimmer_fixed_width;
            if (typedArray.hasValue(i13)) {
                mo37020n(typedArray.getDimensionPixelSize(i13, this.f37056a.f37042h));
            }
            int i14 = C14939b.C14942c.ShimmerFrameLayout_shimmer_fixed_height;
            if (typedArray.hasValue(i14)) {
                mo37019m(typedArray.getDimensionPixelSize(i14, this.f37056a.f37043i));
            }
            int i15 = C14939b.C14942c.ShimmerFrameLayout_shimmer_intensity;
            if (typedArray.hasValue(i15)) {
                mo37023q(typedArray.getFloat(i15, this.f37056a.f37046l));
            }
            int i16 = C14939b.C14942c.ShimmerFrameLayout_shimmer_width_ratio;
            if (typedArray.hasValue(i16)) {
                mo37029w(typedArray.getFloat(i16, this.f37056a.f37044j));
            }
            int i17 = C14939b.C14942c.ShimmerFrameLayout_shimmer_height_ratio;
            if (typedArray.hasValue(i17)) {
                mo37021o(typedArray.getFloat(i17, this.f37056a.f37045k));
            }
            int i18 = C14939b.C14942c.ShimmerFrameLayout_shimmer_tilt;
            if (typedArray.hasValue(i18)) {
                mo37028v(typedArray.getFloat(i18, this.f37056a.f37048n));
            }
            return mo37007f();
        }

        /* renamed from: e */
        public T mo37012e(C14943c cVar) {
            mo37016j(cVar.f37038d);
            mo37027u(cVar.f37041g);
            mo37020n(cVar.f37042h);
            mo37019m(cVar.f37043i);
            mo37029w(cVar.f37044j);
            mo37021o(cVar.f37045k);
            mo37023q(cVar.f37046l);
            mo37017k(cVar.f37047m);
            mo37028v(cVar.f37048n);
            mo37015i(cVar.f37049o);
            mo37013g(cVar.f37050p);
            mo37024r(cVar.f37052r);
            mo37026t(cVar.f37053s);
            mo37025s(cVar.f37055u);
            mo37018l(cVar.f37054t);
            C14943c cVar2 = this.f37056a;
            cVar2.f37040f = cVar.f37040f;
            cVar2.f37039e = cVar.f37039e;
            return mo37007f();
        }

        /* renamed from: f */
        public abstract T mo37007f();

        /* renamed from: g */
        public T mo37013g(boolean z) {
            this.f37056a.f37050p = z;
            return mo37007f();
        }

        /* renamed from: h */
        public T mo37014h(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
            C14943c cVar = this.f37056a;
            cVar.f37040f = (((int) (m64270b(0.0f, 1.0f, f) * 255.0f)) << 24) | (cVar.f37040f & 16777215);
            return mo37007f();
        }

        /* renamed from: i */
        public T mo37015i(boolean z) {
            this.f37056a.f37049o = z;
            return mo37007f();
        }

        /* renamed from: j */
        public T mo37016j(int i) {
            this.f37056a.f37038d = i;
            return mo37007f();
        }

        /* renamed from: k */
        public T mo37017k(float f) {
            if (f >= 0.0f) {
                this.f37056a.f37047m = f;
                return mo37007f();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }

        /* renamed from: l */
        public T mo37018l(long j) {
            if (j >= 0) {
                this.f37056a.f37054t = j;
                return mo37007f();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j);
        }

        /* renamed from: m */
        public T mo37019m(@C0372t0 int i) {
            if (i >= 0) {
                this.f37056a.f37043i = i;
                return mo37007f();
            }
            throw new IllegalArgumentException("Given invalid height: " + i);
        }

        /* renamed from: n */
        public T mo37020n(@C0372t0 int i) {
            if (i >= 0) {
                this.f37056a.f37042h = i;
                return mo37007f();
            }
            throw new IllegalArgumentException("Given invalid width: " + i);
        }

        /* renamed from: o */
        public T mo37021o(float f) {
            if (f >= 0.0f) {
                this.f37056a.f37045k = f;
                return mo37007f();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }

        /* renamed from: p */
        public T mo37022p(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
            C14943c cVar = this.f37056a;
            cVar.f37039e = (((int) (m64270b(0.0f, 1.0f, f) * 255.0f)) << 24) | (cVar.f37039e & 16777215);
            return mo37007f();
        }

        /* renamed from: q */
        public T mo37023q(float f) {
            if (f >= 0.0f) {
                this.f37056a.f37046l = f;
                return mo37007f();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        /* renamed from: r */
        public T mo37024r(int i) {
            this.f37056a.f37052r = i;
            return mo37007f();
        }

        /* renamed from: s */
        public T mo37025s(long j) {
            if (j >= 0) {
                this.f37056a.f37055u = j;
                return mo37007f();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j);
        }

        /* renamed from: t */
        public T mo37026t(int i) {
            this.f37056a.f37053s = i;
            return mo37007f();
        }

        /* renamed from: u */
        public T mo37027u(int i) {
            this.f37056a.f37041g = i;
            return mo37007f();
        }

        /* renamed from: v */
        public T mo37028v(float f) {
            this.f37056a.f37048n = f;
            return mo37007f();
        }

        /* renamed from: w */
        public T mo37029w(float f) {
            if (f >= 0.0f) {
                this.f37056a.f37044j = f;
                return mo37007f();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
    }

    /* renamed from: com.facebook.shimmer.c$c */
    public static class C14946c extends C14945b<C14946c> {
        public C14946c() {
            this.f37056a.f37051q = false;
        }

        /* renamed from: A */
        public C14946c mo37030A(@C0354l int i) {
            this.f37056a.f37039e = i;
            return mo37007f();
        }

        /* renamed from: x */
        public C14946c mo37011d(TypedArray typedArray) {
            super.mo37011d(typedArray);
            int i = C14939b.C14942c.ShimmerFrameLayout_shimmer_base_color;
            if (typedArray.hasValue(i)) {
                mo37033z(typedArray.getColor(i, this.f37056a.f37040f));
            }
            int i2 = C14939b.C14942c.ShimmerFrameLayout_shimmer_highlight_color;
            if (typedArray.hasValue(i2)) {
                mo37030A(typedArray.getColor(i2, this.f37056a.f37039e));
            }
            return mo37007f();
        }

        /* renamed from: y */
        public C14946c mo37007f() {
            return this;
        }

        /* renamed from: z */
        public C14946c mo37033z(@C0354l int i) {
            C14943c cVar = this.f37056a;
            cVar.f37040f = (i & 16777215) | (cVar.f37040f & -16777216);
            return mo37007f();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.facebook.shimmer.c$d */
    public @interface C14947d {

        /* renamed from: d0 */
        public static final int f37057d0 = 0;

        /* renamed from: e0 */
        public static final int f37058e0 = 1;

        /* renamed from: f0 */
        public static final int f37059f0 = 2;

        /* renamed from: g0 */
        public static final int f37060g0 = 3;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.facebook.shimmer.c$e */
    public @interface C14948e {

        /* renamed from: h0 */
        public static final int f37061h0 = 0;

        /* renamed from: i0 */
        public static final int f37062i0 = 1;
    }

    /* renamed from: a */
    public int mo37002a(int i) {
        int i2 = this.f37043i;
        return i2 > 0 ? i2 : Math.round(this.f37045k * ((float) i));
    }

    /* renamed from: b */
    public void mo37003b(int i, int i2) {
        double max = (double) Math.max(i, i2);
        int round = Math.round(((float) ((max / Math.sin(1.5707963267948966d - Math.toRadians((double) (this.f37048n % 90.0f)))) - max)) / 2.0f) * 3;
        float f = (float) (-round);
        this.f37037c.set(f, f, (float) (mo37006e(i) + round), (float) (mo37002a(i2) + round));
    }

    /* renamed from: c */
    public void mo37004c() {
        if (this.f37041g != 1) {
            int[] iArr = this.f37036b;
            int i = this.f37040f;
            iArr[0] = i;
            int i2 = this.f37039e;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.f37036b;
        int i3 = this.f37039e;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.f37040f;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    /* renamed from: d */
    public void mo37005d() {
        if (this.f37041g != 1) {
            this.f37035a[0] = Math.max(((1.0f - this.f37046l) - this.f37047m) / 2.0f, 0.0f);
            this.f37035a[1] = Math.max(((1.0f - this.f37046l) - 0.001f) / 2.0f, 0.0f);
            this.f37035a[2] = Math.min(((this.f37046l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f37035a[3] = Math.min(((this.f37046l + 1.0f) + this.f37047m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f37035a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f37046l, 1.0f);
        this.f37035a[2] = Math.min(this.f37046l + this.f37047m, 1.0f);
        this.f37035a[3] = 1.0f;
    }

    /* renamed from: e */
    public int mo37006e(int i) {
        int i2 = this.f37042h;
        return i2 > 0 ? i2 : Math.round(this.f37044j * ((float) i));
    }
}
