package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.z */
public class C20227z extends C20115d0 {

    /* renamed from: g */
    public static final int f52212g = 100;
    @C0363p0

    /* renamed from: e */
    public C20224y f52213e;
    @C0363p0

    /* renamed from: f */
    public C20224y f52214f;

    /* renamed from: androidx.recyclerview.widget.z$a */
    public class C20228a extends C20207r {
        public C20228a(Context context) {
            super(context);
        }

        /* renamed from: p */
        public void mo59708p(View view, RecyclerView.C20055b0 b0Var, RecyclerView.C20051a0.C20052a aVar) {
            C20227z zVar = C20227z.this;
            int[] c = zVar.mo60275c(zVar.f51739a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int x = mo60658x(Math.max(Math.abs(i), Math.abs(i2)));
            if (x > 0) {
                aVar.mo59723l(i, i2, x, this.f52154j);
            }
        }

        /* renamed from: w */
        public float mo60285w(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: y */
        public int mo60659y(int i) {
            return Math.min(100, super.mo60659y(i));
        }
    }

    @C0363p0
    /* renamed from: c */
    public int[] mo60275c(@C0359n0 RecyclerView.C20076o oVar, @C0359n0 View view) {
        int[] iArr = new int[2];
        if (oVar.mo59428v()) {
            iArr[0] = mo60713m(view, mo60715o(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo59431w()) {
            iArr[1] = mo60713m(view, mo60717q(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @C0363p0
    /* renamed from: e */
    public RecyclerView.C20051a0 mo60277e(@C0359n0 RecyclerView.C20076o oVar) {
        if (!(oVar instanceof RecyclerView.C20051a0.C20053b)) {
            return null;
        }
        return new C20228a(this.f51739a.getContext());
    }

    @C0363p0
    /* renamed from: h */
    public View mo60280h(RecyclerView.C20076o oVar) {
        if (oVar.mo59431w()) {
            return mo60714n(oVar, mo60717q(oVar));
        }
        if (oVar.mo59428v()) {
            return mo60714n(oVar, mo60715o(oVar));
        }
        return null;
    }

    /* renamed from: i */
    public int mo60281i(RecyclerView.C20076o oVar, int i, int i2) {
        C20224y p;
        int i3;
        int o0 = oVar.mo59962o0();
        if (o0 == 0 || (p = mo60716p(oVar)) == null) {
            return -1;
        }
        int Y = oVar.mo59922Y();
        View view = null;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i6 = 0; i6 < Y; i6++) {
            View X = oVar.mo59919X(i6);
            if (X != null) {
                int m = mo60713m(X, p);
                if (m <= 0 && m > i5) {
                    view2 = X;
                    i5 = m;
                }
                if (m >= 0 && m < i4) {
                    view = X;
                    i4 = m;
                }
            }
        }
        boolean r = mo60718r(oVar, i, i2);
        if (r && view != null) {
            return oVar.mo59978u0(view);
        }
        if (!r && view2 != null) {
            return oVar.mo59978u0(view2);
        }
        if (r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int u0 = oVar.mo59978u0(view);
        if (mo60719s(oVar) == r) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = u0 + i3;
        if (i7 < 0 || i7 >= o0) {
            return -1;
        }
        return i7;
    }

    /* renamed from: m */
    public final int mo60713m(@C0359n0 View view, C20224y yVar) {
        return (yVar.mo60698g(view) + (yVar.mo60696e(view) / 2)) - (yVar.mo60705n() + (yVar.mo60706o() / 2));
    }

    @C0363p0
    /* renamed from: n */
    public final View mo60714n(RecyclerView.C20076o oVar, C20224y yVar) {
        int Y = oVar.mo59922Y();
        View view = null;
        if (Y == 0) {
            return null;
        }
        int n = yVar.mo60705n() + (yVar.mo60706o() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < Y; i2++) {
            View X = oVar.mo59919X(i2);
            int abs = Math.abs((yVar.mo60698g(X) + (yVar.mo60696e(X) / 2)) - n);
            if (abs < i) {
                view = X;
                i = abs;
            }
        }
        return view;
    }

    @C0359n0
    /* renamed from: o */
    public final C20224y mo60715o(@C0359n0 RecyclerView.C20076o oVar) {
        C20224y yVar = this.f52214f;
        if (yVar == null || yVar.f52209a != oVar) {
            this.f52214f = C20224y.m94588a(oVar);
        }
        return this.f52214f;
    }

    @C0363p0
    /* renamed from: p */
    public final C20224y mo60716p(RecyclerView.C20076o oVar) {
        if (oVar.mo59431w()) {
            return mo60717q(oVar);
        }
        if (oVar.mo59428v()) {
            return mo60715o(oVar);
        }
        return null;
    }

    @C0359n0
    /* renamed from: q */
    public final C20224y mo60717q(@C0359n0 RecyclerView.C20076o oVar) {
        C20224y yVar = this.f52213e;
        if (yVar == null || yVar.f52209a != oVar) {
            this.f52213e = C20224y.m94590c(oVar);
        }
        return this.f52213e;
    }

    /* renamed from: r */
    public final boolean mo60718r(RecyclerView.C20076o oVar, int i, int i2) {
        return oVar.mo59428v() ? i > 0 : i2 > 0;
    }

    /* renamed from: s */
    public final boolean mo60719s(RecyclerView.C20076o oVar) {
        PointF a;
        int o0 = oVar.mo59962o0();
        if (!(oVar instanceof RecyclerView.C20051a0.C20053b) || (a = ((RecyclerView.C20051a0.C20053b) oVar).mo59393a(o0 - 1)) == null) {
            return false;
        }
        if (a.x < 0.0f || a.y < 0.0f) {
            return true;
        }
        return false;
    }
}
