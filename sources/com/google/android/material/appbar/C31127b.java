package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.C17760a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import androidx.core.view.C18436z4;
import java.util.List;

/* renamed from: com.google.android.material.appbar.b */
public abstract class C31127b extends C31128c<View> {

    /* renamed from: d */
    public final Rect f74581d = new Rect();

    /* renamed from: e */
    public final Rect f74582e = new Rect();

    /* renamed from: f */
    public int f74583f = 0;

    /* renamed from: g */
    public int f74584g;

    public C31127b() {
    }

    /* renamed from: V */
    public static int m124882V(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* renamed from: K */
    public void mo88137K(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, int i) {
        View P = mo87998P(coordinatorLayout.mo51062w(view));
        if (P != null) {
            CoordinatorLayout.C16981g gVar = (CoordinatorLayout.C16981g) view.getLayoutParams();
            Rect rect = this.f74581d;
            rect.set(coordinatorLayout.getPaddingLeft() + gVar.leftMargin, P.getBottom() + gVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - gVar.rightMargin, ((coordinatorLayout.getHeight() + P.getBottom()) - coordinatorLayout.getPaddingBottom()) - gVar.bottomMargin);
            C18436z4 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C18196h2.m82538U(coordinatorLayout) && !C18196h2.m82538U(view)) {
                rect.left += lastWindowInsets.mo53147p();
                rect.right -= lastWindowInsets.mo53148q();
            }
            Rect rect2 = this.f74582e;
            C18306m0.m82989b(m124882V(gVar.f44897c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int Q = mo88138Q(P);
            view.layout(rect2.left, rect2.top - Q, rect2.right, rect2.bottom - Q);
            this.f74583f = rect2.top - P.getBottom();
            return;
        }
        super.mo88137K(coordinatorLayout, view, i);
        this.f74583f = 0;
    }

    @C0363p0
    /* renamed from: P */
    public abstract View mo87998P(List<View> list);

    /* renamed from: Q */
    public final int mo88138Q(View view) {
        if (this.f74584g == 0) {
            return 0;
        }
        float R = mo87999R(view);
        int i = this.f74584g;
        return C17760a.m81102e((int) (R * ((float) i)), 0, i);
    }

    /* renamed from: R */
    public float mo87999R(View view) {
        return 1.0f;
    }

    /* renamed from: S */
    public final int mo88139S() {
        return this.f74584g;
    }

    /* renamed from: T */
    public int mo88000T(@C0359n0 View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: U */
    public final int mo88140U() {
        return this.f74583f;
    }

    /* renamed from: W */
    public final void mo88141W(int i) {
        this.f74584g = i;
    }

    /* renamed from: X */
    public boolean mo88142X() {
        return false;
    }

    /* renamed from: n */
    public boolean mo51090n(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, int i, int i2, int i3, int i4) {
        View P;
        int i5;
        C18436z4 lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (P = mo87998P(coordinatorLayout.mo51062w(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C18196h2.m82538U(P) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo53149r() + lastWindowInsets.mo53146o();
        }
        int T = size + mo88000T(P);
        int measuredHeight = P.getMeasuredHeight();
        if (mo88142X()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            T -= measuredHeight;
        }
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        coordinatorLayout.mo51013O(view, i, i2, View.MeasureSpec.makeMeasureSpec(T, i5), i4);
        return true;
    }

    public C31127b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
