package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.d0 */
public abstract class C20115d0 extends RecyclerView.C20083r {

    /* renamed from: d */
    public static final float f51738d = 100.0f;

    /* renamed from: a */
    public RecyclerView f51739a;

    /* renamed from: b */
    public Scroller f51740b;

    /* renamed from: c */
    public final RecyclerView.C20085t f51741c = new C20116a();

    /* renamed from: androidx.recyclerview.widget.d0$a */
    public class C20116a extends RecyclerView.C20085t {

        /* renamed from: a */
        public boolean f51742a = false;

        public C20116a() {
        }

        /* renamed from: a */
        public void mo30661a(RecyclerView recyclerView, int i) {
            super.mo30661a(recyclerView, i);
            if (i == 0 && this.f51742a) {
                this.f51742a = false;
                C20115d0.this.mo60284l();
            }
        }

        /* renamed from: b */
        public void mo30662b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f51742a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d0$b */
    public class C20117b extends C20207r {
        public C20117b(Context context) {
            super(context);
        }

        /* renamed from: p */
        public void mo59708p(View view, RecyclerView.C20055b0 b0Var, RecyclerView.C20051a0.C20052a aVar) {
            C20115d0 d0Var = C20115d0.this;
            RecyclerView recyclerView = d0Var.f51739a;
            if (recyclerView != null) {
                int[] c = d0Var.mo60275c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int x = mo60658x(Math.max(Math.abs(i), Math.abs(i2)));
                if (x > 0) {
                    aVar.mo59723l(i, i2, x, this.f52154j);
                }
            }
        }

        /* renamed from: w */
        public float mo60285w(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: a */
    public boolean mo60001a(int i, int i2) {
        RecyclerView.C20076o layoutManager = this.f51739a.getLayoutManager();
        if (layoutManager == null || this.f51739a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f51739a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && mo60283k(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo60274b(@C0363p0 RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f51739a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo60279g();
            }
            this.f51739a = recyclerView;
            if (recyclerView != null) {
                mo60282j();
                this.f51740b = new Scroller(this.f51739a.getContext(), new DecelerateInterpolator());
                mo60284l();
            }
        }
    }

    @C0363p0
    /* renamed from: c */
    public abstract int[] mo60275c(@C0359n0 RecyclerView.C20076o oVar, @C0359n0 View view);

    /* renamed from: d */
    public int[] mo60276d(int i, int i2) {
        this.f51740b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f51740b.getFinalX(), this.f51740b.getFinalY()};
    }

    @C0363p0
    /* renamed from: e */
    public RecyclerView.C20051a0 mo60277e(@C0359n0 RecyclerView.C20076o oVar) {
        return mo60278f(oVar);
    }

    @C0363p0
    @Deprecated
    /* renamed from: f */
    public C20207r mo60278f(@C0359n0 RecyclerView.C20076o oVar) {
        if (!(oVar instanceof RecyclerView.C20051a0.C20053b)) {
            return null;
        }
        return new C20117b(this.f51739a.getContext());
    }

    /* renamed from: g */
    public final void mo60279g() {
        this.f51739a.mo59656w1(this.f51741c);
        this.f51739a.setOnFlingListener((RecyclerView.C20083r) null);
    }

    @C0363p0
    /* renamed from: h */
    public abstract View mo60280h(RecyclerView.C20076o oVar);

    /* renamed from: i */
    public abstract int mo60281i(RecyclerView.C20076o oVar, int i, int i2);

    /* renamed from: j */
    public final void mo60282j() throws IllegalStateException {
        if (this.f51739a.getOnFlingListener() == null) {
            this.f51739a.mo59613r(this.f51741c);
            this.f51739a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    public final boolean mo60283k(@C0359n0 RecyclerView.C20076o oVar, int i, int i2) {
        RecyclerView.C20051a0 e;
        int i3;
        if (!(oVar instanceof RecyclerView.C20051a0.C20053b) || (e = mo60277e(oVar)) == null || (i3 = mo60281i(oVar, i, i2)) == -1) {
            return false;
        }
        e.mo59709q(i3);
        oVar.mo59941g2(e);
        return true;
    }

    /* renamed from: l */
    public void mo60284l() {
        RecyclerView.C20076o layoutManager;
        View h;
        RecyclerView recyclerView = this.f51739a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = mo60280h(layoutManager)) != null) {
            int[] c = mo60275c(layoutManager, h);
            int i = c[0];
            if (i != 0 || c[1] != 0) {
                this.f51739a.mo59491K1(i, c[1]);
            }
        }
    }
}
