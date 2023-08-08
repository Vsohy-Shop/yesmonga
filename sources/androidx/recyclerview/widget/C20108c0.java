package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.c0 */
public abstract class C20108c0 extends RecyclerView.C20069l {

    /* renamed from: m */
    public static final boolean f51718m = false;

    /* renamed from: n */
    public static final String f51719n = "SimpleItemAnimator";

    /* renamed from: l */
    public boolean f51720l = true;

    /* renamed from: D */
    public abstract boolean mo60240D(RecyclerView.C20061e0 e0Var);

    /* renamed from: E */
    public abstract boolean mo60241E(RecyclerView.C20061e0 e0Var, RecyclerView.C20061e0 e0Var2, int i, int i2, int i3, int i4);

    /* renamed from: F */
    public abstract boolean mo60242F(RecyclerView.C20061e0 e0Var, int i, int i2, int i3, int i4);

    /* renamed from: G */
    public abstract boolean mo60243G(RecyclerView.C20061e0 e0Var);

    /* renamed from: H */
    public final void mo60244H(RecyclerView.C20061e0 e0Var) {
        mo60253Q(e0Var);
        mo59839h(e0Var);
    }

    /* renamed from: I */
    public final void mo60245I(RecyclerView.C20061e0 e0Var) {
        mo60254R(e0Var);
    }

    /* renamed from: J */
    public final void mo60246J(RecyclerView.C20061e0 e0Var, boolean z) {
        mo60255S(e0Var, z);
        mo59839h(e0Var);
    }

    /* renamed from: K */
    public final void mo60247K(RecyclerView.C20061e0 e0Var, boolean z) {
        mo60256T(e0Var, z);
    }

    /* renamed from: L */
    public final void mo60248L(RecyclerView.C20061e0 e0Var) {
        mo60257U(e0Var);
        mo59839h(e0Var);
    }

    /* renamed from: M */
    public final void mo60249M(RecyclerView.C20061e0 e0Var) {
        mo60258V(e0Var);
    }

    /* renamed from: N */
    public final void mo60250N(RecyclerView.C20061e0 e0Var) {
        mo60259W(e0Var);
        mo59839h(e0Var);
    }

    /* renamed from: O */
    public final void mo60251O(RecyclerView.C20061e0 e0Var) {
        mo60260X(e0Var);
    }

    /* renamed from: P */
    public boolean mo60252P() {
        return this.f51720l;
    }

    /* renamed from: Q */
    public void mo60253Q(RecyclerView.C20061e0 e0Var) {
    }

    /* renamed from: R */
    public void mo60254R(RecyclerView.C20061e0 e0Var) {
    }

    /* renamed from: S */
    public void mo60255S(RecyclerView.C20061e0 e0Var, boolean z) {
    }

    /* renamed from: T */
    public void mo60256T(RecyclerView.C20061e0 e0Var, boolean z) {
    }

    /* renamed from: U */
    public void mo60257U(RecyclerView.C20061e0 e0Var) {
    }

    /* renamed from: V */
    public void mo60258V(RecyclerView.C20061e0 e0Var) {
    }

    /* renamed from: W */
    public void mo60259W(RecyclerView.C20061e0 e0Var) {
    }

    /* renamed from: X */
    public void mo60260X(RecyclerView.C20061e0 e0Var) {
    }

    /* renamed from: Y */
    public void mo60261Y(boolean z) {
        this.f51720l = z;
    }

    /* renamed from: a */
    public boolean mo59833a(@C0359n0 RecyclerView.C20061e0 e0Var, @C0363p0 RecyclerView.C20069l.C20073d dVar, @C0359n0 RecyclerView.C20069l.C20073d dVar2) {
        int i;
        int i2;
        if (dVar == null || ((i = dVar.f51564a) == (i2 = dVar2.f51564a) && dVar.f51565b == dVar2.f51565b)) {
            return mo60240D(e0Var);
        }
        return mo60242F(e0Var, i, dVar.f51565b, i2, dVar2.f51565b);
    }

    /* renamed from: b */
    public boolean mo59834b(@C0359n0 RecyclerView.C20061e0 e0Var, @C0359n0 RecyclerView.C20061e0 e0Var2, @C0359n0 RecyclerView.C20069l.C20073d dVar, @C0359n0 RecyclerView.C20069l.C20073d dVar2) {
        int i;
        int i2;
        int i3 = dVar.f51564a;
        int i4 = dVar.f51565b;
        if (e0Var2.shouldIgnore()) {
            int i5 = dVar.f51564a;
            i = dVar.f51565b;
            i2 = i5;
        } else {
            i2 = dVar2.f51564a;
            i = dVar2.f51565b;
        }
        return mo60241E(e0Var, e0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo59835c(@C0359n0 RecyclerView.C20061e0 e0Var, @C0359n0 RecyclerView.C20069l.C20073d dVar, @C0363p0 RecyclerView.C20069l.C20073d dVar2) {
        int i;
        int i2;
        int i3 = dVar.f51564a;
        int i4 = dVar.f51565b;
        View view = e0Var.itemView;
        if (dVar2 == null) {
            i = view.getLeft();
        } else {
            i = dVar2.f51564a;
        }
        int i5 = i;
        if (dVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = dVar2.f51565b;
        }
        int i6 = i2;
        if (e0Var.isRemoved() || (i3 == i5 && i4 == i6)) {
            return mo60243G(e0Var);
        }
        view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
        return mo60242F(e0Var, i3, i4, i5, i6);
    }

    /* renamed from: d */
    public boolean mo59836d(@C0359n0 RecyclerView.C20061e0 e0Var, @C0359n0 RecyclerView.C20069l.C20073d dVar, @C0359n0 RecyclerView.C20069l.C20073d dVar2) {
        int i = dVar.f51564a;
        int i2 = dVar2.f51564a;
        if (i == i2 && dVar.f51565b == dVar2.f51565b) {
            mo60248L(e0Var);
            return false;
        }
        return mo60242F(e0Var, i, dVar.f51565b, i2, dVar2.f51565b);
    }

    /* renamed from: f */
    public boolean mo59837f(@C0359n0 RecyclerView.C20061e0 e0Var) {
        return !this.f51720l || e0Var.isInvalid();
    }
}
