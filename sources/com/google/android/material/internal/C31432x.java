package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import com.google.android.material.C31076a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.x */
public class C31432x {

    /* renamed from: com.google.android.material.internal.x$a */
    public class C31433a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f75974a;

        public C31433a(View view) {
            this.f75974a = view;
        }

        public void run() {
            ((InputMethodManager) this.f75974a.getContext().getSystemService("input_method")).showSoftInput(this.f75974a, 1);
        }
    }

    /* renamed from: com.google.android.material.internal.x$b */
    public class C31434b implements C31437e {

        /* renamed from: a */
        public final /* synthetic */ boolean f75975a;

        /* renamed from: b */
        public final /* synthetic */ boolean f75976b;

        /* renamed from: c */
        public final /* synthetic */ boolean f75977c;

        /* renamed from: d */
        public final /* synthetic */ C31437e f75978d;

        public C31434b(boolean z, boolean z2, boolean z3, C31437e eVar) {
            this.f75975a = z;
            this.f75976b = z2;
            this.f75977c = z3;
            this.f75978d = eVar;
        }

        @C0359n0
        /* renamed from: a */
        public C18436z4 mo88352a(View view, @C0359n0 C18436z4 z4Var, @C0359n0 C31438f fVar) {
            if (this.f75975a) {
                fVar.f75984d += z4Var.mo53146o();
            }
            boolean k = C31432x.m127016k(view);
            if (this.f75976b) {
                if (k) {
                    fVar.f75983c += z4Var.mo53147p();
                } else {
                    fVar.f75981a += z4Var.mo53147p();
                }
            }
            if (this.f75977c) {
                if (k) {
                    fVar.f75981a += z4Var.mo53148q();
                } else {
                    fVar.f75983c += z4Var.mo53148q();
                }
            }
            fVar.mo90199a(view);
            C31437e eVar = this.f75978d;
            if (eVar != null) {
                return eVar.mo88352a(view, z4Var, fVar);
            }
            return z4Var;
        }
    }

    /* renamed from: com.google.android.material.internal.x$c */
    public class C31435c implements C18414x1 {

        /* renamed from: a */
        public final /* synthetic */ C31437e f75979a;

        /* renamed from: b */
        public final /* synthetic */ C31438f f75980b;

        public C31435c(C31437e eVar, C31438f fVar) {
            this.f75979a = eVar;
            this.f75980b = fVar;
        }

        /* renamed from: a */
        public C18436z4 mo1193a(View view, C18436z4 z4Var) {
            return this.f75979a.mo88352a(view, z4Var, new C31438f(this.f75980b));
        }
    }

    /* renamed from: com.google.android.material.internal.x$d */
    public class C31436d implements View.OnAttachStateChangeListener {
        public void onViewAttachedToWindow(@C0359n0 View view) {
            view.removeOnAttachStateChangeListener(this);
            C18196h2.m82642v1(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.x$e */
    public interface C31437e {
        /* renamed from: a */
        C18436z4 mo88352a(View view, C18436z4 z4Var, C31438f fVar);
    }

    /* renamed from: a */
    public static void m127006a(@C0363p0 View view, @C0359n0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: b */
    public static void m127007b(@C0359n0 View view, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        m127008c(view, attributeSet, i, i2, (C31437e) null);
    }

    /* renamed from: c */
    public static void m127008c(@C0359n0 View view, @C0363p0 AttributeSet attributeSet, int i, int i2, @C0363p0 C31437e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C31076a.C31091o.Insets, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C31076a.C31091o.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = obtainStyledAttributes.getBoolean(C31076a.C31091o.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = obtainStyledAttributes.getBoolean(C31076a.C31091o.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        m127009d(view, new C31434b(z, z2, z3, eVar));
    }

    /* renamed from: d */
    public static void m127009d(@C0359n0 View view, @C0359n0 C31437e eVar) {
        C18196h2.m82559a2(view, new C31435c(eVar, new C31438f(C18196h2.m82597k0(view), view.getPaddingTop(), C18196h2.m82593j0(view), view.getPaddingBottom())));
        m127020o(view);
    }

    /* renamed from: e */
    public static float m127010e(@C0359n0 Context context, @C0366r(unit = 0) int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    @C0363p0
    /* renamed from: f */
    public static Integer m127011f(@C0359n0 View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    @C0363p0
    /* renamed from: g */
    public static ViewGroup m127012g(@C0363p0 View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @C0363p0
    /* renamed from: h */
    public static C31431w m127013h(@C0359n0 View view) {
        return m127014i(m127012g(view));
    }

    @C0363p0
    /* renamed from: i */
    public static C31431w m127014i(@C0363p0 View view) {
        if (view == null) {
            return null;
        }
        return new C31430v(view);
    }

    /* renamed from: j */
    public static float m127015j(@C0359n0 View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C18196h2.m82529R((View) parent);
        }
        return f;
    }

    /* renamed from: k */
    public static boolean m127016k(View view) {
        return C18196h2.m82553Z(view) == 1;
    }

    /* renamed from: l */
    public static PorterDuff.Mode m127017l(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: m */
    public static void m127018m(@C0363p0 View view, @C0359n0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            m127019n(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    /* renamed from: n */
    public static void m127019n(@C0359n0 ViewTreeObserver viewTreeObserver, @C0359n0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: o */
    public static void m127020o(@C0359n0 View view) {
        if (C18196h2.m82521O0(view)) {
            C18196h2.m82642v1(view);
        } else {
            view.addOnAttachStateChangeListener(new C31436d());
        }
    }

    /* renamed from: p */
    public static void m127021p(@C0359n0 View view) {
        view.requestFocus();
        view.post(new C31433a(view));
    }

    /* renamed from: com.google.android.material.internal.x$f */
    public static class C31438f {

        /* renamed from: a */
        public int f75981a;

        /* renamed from: b */
        public int f75982b;

        /* renamed from: c */
        public int f75983c;

        /* renamed from: d */
        public int f75984d;

        public C31438f(int i, int i2, int i3, int i4) {
            this.f75981a = i;
            this.f75982b = i2;
            this.f75983c = i3;
            this.f75984d = i4;
        }

        /* renamed from: a */
        public void mo90199a(View view) {
            C18196h2.m82571d2(view, this.f75981a, this.f75982b, this.f75983c, this.f75984d);
        }

        public C31438f(@C0359n0 C31438f fVar) {
            this.f75981a = fVar.f75981a;
            this.f75982b = fVar.f75982b;
            this.f75983c = fVar.f75983c;
            this.f75984d = fVar.f75984d;
        }
    }
}
