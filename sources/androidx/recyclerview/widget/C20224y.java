package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.y */
public abstract class C20224y {

    /* renamed from: d */
    public static final int f52206d = Integer.MIN_VALUE;

    /* renamed from: e */
    public static final int f52207e = 0;

    /* renamed from: f */
    public static final int f52208f = 1;

    /* renamed from: a */
    public final RecyclerView.C20076o f52209a;

    /* renamed from: b */
    public int f52210b;

    /* renamed from: c */
    public final Rect f52211c;

    /* renamed from: androidx.recyclerview.widget.y$a */
    public class C20225a extends C20224y {
        public C20225a(RecyclerView.C20076o oVar) {
            super(oVar, (C20225a) null);
        }

        /* renamed from: d */
        public int mo60695d(View view) {
            return this.f52209a.mo59953j0(view) + ((RecyclerView.C20081p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo60696e(View view) {
            RecyclerView.C20081p pVar = (RecyclerView.C20081p) view.getLayoutParams();
            return this.f52209a.mo59951i0(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: f */
        public int mo60697f(View view) {
            RecyclerView.C20081p pVar = (RecyclerView.C20081p) view.getLayoutParams();
            return this.f52209a.mo59948h0(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: g */
        public int mo60698g(View view) {
            return this.f52209a.mo59939g0(view) - ((RecyclerView.C20081p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo60699h() {
            return this.f52209a.mo59868B0();
        }

        /* renamed from: i */
        public int mo60700i() {
            return this.f52209a.mo59868B0() - this.f52209a.getPaddingRight();
        }

        /* renamed from: j */
        public int mo60701j() {
            return this.f52209a.getPaddingRight();
        }

        /* renamed from: l */
        public int mo60703l() {
            return this.f52209a.mo59870C0();
        }

        /* renamed from: m */
        public int mo60704m() {
            return this.f52209a.mo59960n0();
        }

        /* renamed from: n */
        public int mo60705n() {
            return this.f52209a.getPaddingLeft();
        }

        /* renamed from: o */
        public int mo60706o() {
            return (this.f52209a.mo59868B0() - this.f52209a.getPaddingLeft()) - this.f52209a.getPaddingRight();
        }

        /* renamed from: q */
        public int mo60708q(View view) {
            this.f52209a.mo59866A0(view, true, this.f52211c);
            return this.f52211c.right;
        }

        /* renamed from: r */
        public int mo60709r(View view) {
            this.f52209a.mo59866A0(view, true, this.f52211c);
            return this.f52211c.left;
        }

        /* renamed from: s */
        public void mo60710s(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        /* renamed from: t */
        public void mo60711t(int i) {
            this.f52209a.mo59914V0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.y$b */
    public class C20226b extends C20224y {
        public C20226b(RecyclerView.C20076o oVar) {
            super(oVar, (C20225a) null);
        }

        /* renamed from: d */
        public int mo60695d(View view) {
            return this.f52209a.mo59934e0(view) + ((RecyclerView.C20081p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo60696e(View view) {
            RecyclerView.C20081p pVar = (RecyclerView.C20081p) view.getLayoutParams();
            return this.f52209a.mo59948h0(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: f */
        public int mo60697f(View view) {
            RecyclerView.C20081p pVar = (RecyclerView.C20081p) view.getLayoutParams();
            return this.f52209a.mo59951i0(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: g */
        public int mo60698g(View view) {
            return this.f52209a.mo59955k0(view) - ((RecyclerView.C20081p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo60699h() {
            return this.f52209a.mo59958m0();
        }

        /* renamed from: i */
        public int mo60700i() {
            return this.f52209a.mo59958m0() - this.f52209a.getPaddingBottom();
        }

        /* renamed from: j */
        public int mo60701j() {
            return this.f52209a.getPaddingBottom();
        }

        /* renamed from: l */
        public int mo60703l() {
            return this.f52209a.mo59960n0();
        }

        /* renamed from: m */
        public int mo60704m() {
            return this.f52209a.mo59870C0();
        }

        /* renamed from: n */
        public int mo60705n() {
            return this.f52209a.getPaddingTop();
        }

        /* renamed from: o */
        public int mo60706o() {
            return (this.f52209a.mo59958m0() - this.f52209a.getPaddingTop()) - this.f52209a.getPaddingBottom();
        }

        /* renamed from: q */
        public int mo60708q(View view) {
            this.f52209a.mo59866A0(view, true, this.f52211c);
            return this.f52211c.bottom;
        }

        /* renamed from: r */
        public int mo60709r(View view) {
            this.f52209a.mo59866A0(view, true, this.f52211c);
            return this.f52211c.top;
        }

        /* renamed from: s */
        public void mo60710s(View view, int i) {
            view.offsetTopAndBottom(i);
        }

        /* renamed from: t */
        public void mo60711t(int i) {
            this.f52209a.mo59917W0(i);
        }
    }

    public /* synthetic */ C20224y(RecyclerView.C20076o oVar, C20225a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static C20224y m94588a(RecyclerView.C20076o oVar) {
        return new C20225a(oVar);
    }

    /* renamed from: b */
    public static C20224y m94589b(RecyclerView.C20076o oVar, int i) {
        if (i == 0) {
            return m94588a(oVar);
        }
        if (i == 1) {
            return m94590c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static C20224y m94590c(RecyclerView.C20076o oVar) {
        return new C20226b(oVar);
    }

    /* renamed from: d */
    public abstract int mo60695d(View view);

    /* renamed from: e */
    public abstract int mo60696e(View view);

    /* renamed from: f */
    public abstract int mo60697f(View view);

    /* renamed from: g */
    public abstract int mo60698g(View view);

    /* renamed from: h */
    public abstract int mo60699h();

    /* renamed from: i */
    public abstract int mo60700i();

    /* renamed from: j */
    public abstract int mo60701j();

    /* renamed from: k */
    public RecyclerView.C20076o mo60702k() {
        return this.f52209a;
    }

    /* renamed from: l */
    public abstract int mo60703l();

    /* renamed from: m */
    public abstract int mo60704m();

    /* renamed from: n */
    public abstract int mo60705n();

    /* renamed from: o */
    public abstract int mo60706o();

    /* renamed from: p */
    public int mo60707p() {
        if (Integer.MIN_VALUE == this.f52210b) {
            return 0;
        }
        return mo60706o() - this.f52210b;
    }

    /* renamed from: q */
    public abstract int mo60708q(View view);

    /* renamed from: r */
    public abstract int mo60709r(View view);

    /* renamed from: s */
    public abstract void mo60710s(View view, int i);

    /* renamed from: t */
    public abstract void mo60711t(int i);

    /* renamed from: u */
    public void mo60712u() {
        this.f52210b = mo60706o();
    }

    public C20224y(RecyclerView.C20076o oVar) {
        this.f52210b = Integer.MIN_VALUE;
        this.f52211c = new Rect();
        this.f52209a = oVar;
    }
}
