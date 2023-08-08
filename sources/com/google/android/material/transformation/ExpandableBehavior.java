package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C18196h2;
import com.google.android.material.expandable.C31335b;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.C16977c<View> {

    /* renamed from: b */
    public static final int f77248b = 0;

    /* renamed from: c */
    public static final int f77249c = 1;

    /* renamed from: d */
    public static final int f77250d = 2;

    /* renamed from: a */
    public int f77251a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class C31727a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f77252a;

        /* renamed from: b */
        public final /* synthetic */ int f77253b;

        /* renamed from: c */
        public final /* synthetic */ C31335b f77254c;

        public C31727a(View view, int i, C31335b bVar) {
            this.f77252a = view;
            this.f77253b = i;
            this.f77254c = bVar;
        }

        public boolean onPreDraw() {
            this.f77252a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f77251a == this.f77253b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C31335b bVar = this.f77254c;
                expandableBehavior.mo92043K((View) bVar, this.f77252a, bVar.mo89561b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    @C0363p0
    /* renamed from: J */
    public static <T extends ExpandableBehavior> T m128672J(@C0359n0 View view, @C0359n0 Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C16981g) {
            CoordinatorLayout.C16977c f = ((CoordinatorLayout.C16981g) layoutParams).mo51111f();
            if (f instanceof ExpandableBehavior) {
                return (ExpandableBehavior) cls.cast(f);
            }
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: H */
    public final boolean mo92041H(boolean z) {
        if (z) {
            int i = this.f77251a;
            if (i == 0 || i == 2) {
                return true;
            }
            return false;
        } else if (this.f77251a == 1) {
            return true;
        } else {
            return false;
        }
    }

    @C0363p0
    /* renamed from: I */
    public C31335b mo92042I(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view) {
        List<View> w = coordinatorLayout.mo51062w(view);
        int size = w.size();
        for (int i = 0; i < size; i++) {
            View view2 = w.get(i);
            if (mo51082f(coordinatorLayout, view, view2)) {
                return (C31335b) view2;
            }
        }
        return null;
    }

    /* renamed from: K */
    public abstract boolean mo92043K(View view, View view2, boolean z, boolean z2);

    /* renamed from: f */
    public abstract boolean mo51082f(CoordinatorLayout coordinatorLayout, View view, View view2);

    @C0346i
    /* renamed from: i */
    public boolean mo51085i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        C31335b bVar = (C31335b) view2;
        if (!mo92041H(bVar.mo89561b())) {
            return false;
        }
        if (bVar.mo89561b()) {
            i = 1;
        } else {
            i = 2;
        }
        this.f77251a = i;
        return mo92043K((View) bVar, view, bVar.mo89561b(), true);
    }

    @C0346i
    /* renamed from: m */
    public boolean mo51089m(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, int i) {
        C31335b I;
        int i2;
        if (C18196h2.m82539U0(view) || (I = mo92042I(coordinatorLayout, view)) == null || !mo92041H(I.mo89561b())) {
            return false;
        }
        if (I.mo89561b()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f77251a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new C31727a(view, i2, I));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
