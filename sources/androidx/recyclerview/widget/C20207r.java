package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.r */
public class C20207r extends RecyclerView.C20051a0 {

    /* renamed from: q */
    public static final boolean f52146q = false;

    /* renamed from: r */
    public static final float f52147r = 25.0f;

    /* renamed from: s */
    public static final int f52148s = 10000;

    /* renamed from: t */
    public static final int f52149t = -1;

    /* renamed from: u */
    public static final int f52150u = 1;

    /* renamed from: v */
    public static final int f52151v = 0;

    /* renamed from: w */
    public static final float f52152w = 1.2f;

    /* renamed from: i */
    public final LinearInterpolator f52153i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f52154j = new DecelerateInterpolator();

    /* renamed from: k */
    public PointF f52155k;

    /* renamed from: l */
    public final DisplayMetrics f52156l;

    /* renamed from: m */
    public boolean f52157m = false;

    /* renamed from: n */
    public float f52158n;

    /* renamed from: o */
    public int f52159o = 0;

    /* renamed from: p */
    public int f52160p = 0;

    public C20207r(Context context) {
        this.f52156l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    public int mo60651A() {
        PointF pointF = this.f52155k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: B */
    public final float mo60652B() {
        if (!this.f52157m) {
            this.f52158n = mo60285w(this.f52156l);
            this.f52157m = true;
        }
        return this.f52158n;
    }

    /* renamed from: C */
    public int mo60653C() {
        PointF pointF = this.f52155k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: D */
    public void mo60654D(RecyclerView.C20051a0.C20052a aVar) {
        PointF a = mo59693a(mo59698f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo59717f(mo59698f());
            mo59711s();
            return;
        }
        mo59702j(a);
        this.f52155k = a;
        this.f52159o = (int) (a.x * 10000.0f);
        this.f52160p = (int) (a.y * 10000.0f);
        aVar.mo59723l((int) (((float) this.f52159o) * 1.2f), (int) (((float) this.f52160p) * 1.2f), (int) (((float) mo60659y(10000)) * 1.2f), this.f52153i);
    }

    /* renamed from: m */
    public void mo59705m(int i, int i2, RecyclerView.C20055b0 b0Var, RecyclerView.C20051a0.C20052a aVar) {
        if (mo59695c() == 0) {
            mo59711s();
            return;
        }
        this.f52159o = mo60660z(this.f52159o, i);
        int z = mo60660z(this.f52160p, i2);
        this.f52160p = z;
        if (this.f52159o == 0 && z == 0) {
            mo60654D(aVar);
        }
    }

    /* renamed from: n */
    public void mo59706n() {
    }

    /* renamed from: o */
    public void mo59707o() {
        this.f52160p = 0;
        this.f52159o = 0;
        this.f52155k = null;
    }

    /* renamed from: p */
    public void mo59708p(View view, RecyclerView.C20055b0 b0Var, RecyclerView.C20051a0.C20052a aVar) {
        int u = mo60656u(view, mo60651A());
        int v = mo60657v(view, mo60653C());
        int x = mo60658x((int) Math.sqrt((double) ((u * u) + (v * v))));
        if (x > 0) {
            aVar.mo59723l(-u, -v, x, this.f52154j);
        }
    }

    /* renamed from: t */
    public int mo60655t(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: u */
    public int mo60656u(View view, int i) {
        RecyclerView.C20076o e = mo59697e();
        if (e == null || !e.mo59428v()) {
            return 0;
        }
        RecyclerView.C20081p pVar = (RecyclerView.C20081p) view.getLayoutParams();
        return mo60655t(e.mo59939g0(view) - pVar.leftMargin, e.mo59953j0(view) + pVar.rightMargin, e.getPaddingLeft(), e.mo59868B0() - e.getPaddingRight(), i);
    }

    /* renamed from: v */
    public int mo60657v(View view, int i) {
        RecyclerView.C20076o e = mo59697e();
        if (e == null || !e.mo59431w()) {
            return 0;
        }
        RecyclerView.C20081p pVar = (RecyclerView.C20081p) view.getLayoutParams();
        return mo60655t(e.mo59955k0(view) - pVar.topMargin, e.mo59934e0(view) + pVar.bottomMargin, e.getPaddingTop(), e.mo59958m0() - e.getPaddingBottom(), i);
    }

    /* renamed from: w */
    public float mo60285w(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: x */
    public int mo60658x(int i) {
        return (int) Math.ceil(((double) mo60659y(i)) / 0.3356d);
    }

    /* renamed from: y */
    public int mo60659y(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * mo60652B()));
    }

    /* renamed from: z */
    public final int mo60660z(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }
}
