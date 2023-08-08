package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C31076a;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: M */
    public static final int[] f76674M;

    /* renamed from: N */
    public static final int[] f76675N;
    @C0363p0

    /* renamed from: J */
    public final AccessibilityManager f76676J;

    /* renamed from: K */
    public boolean f76677K;
    @C0363p0

    /* renamed from: L */
    public BaseTransientBottomBar.C31591s<Snackbar> f76678L;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(@C0363p0 Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@C0363p0 Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(@C0363p0 View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    public class C31596a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ View.OnClickListener f76679a;

        public C31596a(View.OnClickListener onClickListener) {
            this.f76679a = onClickListener;
        }

        public void onClick(View view) {
            this.f76679a.onClick(view);
            Snackbar.this.mo91164u(1);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$b */
    public static class C31597b extends BaseTransientBottomBar.C31591s<Snackbar> {

        /* renamed from: f */
        public static final int f76681f = 0;

        /* renamed from: g */
        public static final int f76682g = 1;

        /* renamed from: h */
        public static final int f76683h = 2;

        /* renamed from: i */
        public static final int f76684i = 3;

        /* renamed from: j */
        public static final int f76685j = 4;

        /* renamed from: c */
        public void mo91213a(Snackbar snackbar, int i) {
        }

        /* renamed from: d */
        public void mo91214b(Snackbar snackbar) {
        }
    }

    static {
        int i = C31076a.C31079c.snackbarButtonStyle;
        f76674M = new int[]{i};
        f76675N = new int[]{i, C31076a.C31079c.snackbarTextViewStyle};
    }

    public Snackbar(@C0359n0 Context context, @C0359n0 ViewGroup viewGroup, @C0359n0 View view, @C0359n0 C31598a aVar) {
        super(context, viewGroup, view, aVar);
        this.f76676J = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @C0363p0
    /* renamed from: o0 */
    public static ViewGroup m127961o0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @Deprecated
    /* renamed from: s0 */
    public static boolean m127962s0(@C0359n0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f76674M);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    public static boolean m127963t0(@C0359n0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f76675N);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: u0 */
    public static Snackbar m127964u0(@C0359n0 Context context, @C0359n0 View view, @C0359n0 CharSequence charSequence, int i) {
        return m127967x0(context, view, charSequence, i);
    }

    @C0359n0
    /* renamed from: v0 */
    public static Snackbar m127965v0(@C0359n0 View view, @C0324b1 int i, int i2) {
        return m127966w0(view, view.getResources().getText(i), i2);
    }

    @C0359n0
    /* renamed from: w0 */
    public static Snackbar m127966w0(@C0359n0 View view, @C0359n0 CharSequence charSequence, int i) {
        return m127967x0((Context) null, view, charSequence, i);
    }

    @C0359n0
    /* renamed from: x0 */
    public static Snackbar m127967x0(@C0363p0 Context context, @C0359n0 View view, @C0359n0 CharSequence charSequence, int i) {
        int i2;
        ViewGroup o0 = m127961o0(view);
        if (o0 != null) {
            if (context == null) {
                context = o0.getContext();
            }
            LayoutInflater from = LayoutInflater.from(context);
            if (m127963t0(context)) {
                i2 = C31076a.C31087k.mtrl_layout_snackbar_include;
            } else {
                i2 = C31076a.C31087k.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, o0, false);
            Snackbar snackbar = new Snackbar(context, o0, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo91226I0(charSequence);
            snackbar.mo91146b0(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: A */
    public int mo91119A() {
        int i;
        int A = super.mo91119A();
        if (A == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f76677K) {
                i = 4;
            } else {
                i = 0;
            }
            return this.f76676J.getRecommendedTimeoutMillis(A, i | 1 | 2);
        } else if (!this.f76677K || !this.f76676J.isTouchExplorationEnabled()) {
            return A;
        } else {
            return -2;
        }
    }

    @C0359n0
    /* renamed from: A0 */
    public Snackbar mo91218A0(@C0354l int i) {
        mo91230p0().setTextColor(i);
        return this;
    }

    @C0359n0
    /* renamed from: B0 */
    public Snackbar mo91219B0(ColorStateList colorStateList) {
        mo91230p0().setTextColor(colorStateList);
        return this;
    }

    @C0359n0
    /* renamed from: C0 */
    public Snackbar mo91220C0(@C0354l int i) {
        return mo91221D0(ColorStateList.valueOf(i));
    }

    @C0359n0
    /* renamed from: D0 */
    public Snackbar mo91221D0(@C0363p0 ColorStateList colorStateList) {
        this.f76617c.setBackgroundTintList(colorStateList);
        return this;
    }

    @C0359n0
    /* renamed from: E0 */
    public Snackbar mo91222E0(@C0363p0 PorterDuff.Mode mode) {
        this.f76617c.setBackgroundTintMode(mode);
        return this;
    }

    @C0359n0
    @Deprecated
    /* renamed from: F0 */
    public Snackbar mo91223F0(@C0363p0 C31597b bVar) {
        BaseTransientBottomBar.C31591s<Snackbar> sVar = this.f76678L;
        if (sVar != null) {
            mo91140V(sVar);
        }
        if (bVar != null) {
            mo91159p(bVar);
        }
        this.f76678L = bVar;
        return this;
    }

    @C0359n0
    /* renamed from: G0 */
    public Snackbar mo91224G0(@C0366r int i) {
        mo91231q0().setMaxInlineActionWidth(i);
        return this;
    }

    @C0359n0
    /* renamed from: H0 */
    public Snackbar mo91225H0(@C0324b1 int i) {
        return mo91226I0(mo91169z().getText(i));
    }

    @C0359n0
    /* renamed from: I0 */
    public Snackbar mo91226I0(@C0359n0 CharSequence charSequence) {
        mo91232r0().setText(charSequence);
        return this;
    }

    @C0359n0
    /* renamed from: J0 */
    public Snackbar mo91227J0(@C0354l int i) {
        mo91232r0().setTextColor(i);
        return this;
    }

    @C0359n0
    /* renamed from: K0 */
    public Snackbar mo91228K0(ColorStateList colorStateList) {
        mo91232r0().setTextColor(colorStateList);
        return this;
    }

    @C0359n0
    /* renamed from: L0 */
    public Snackbar mo91229L0(int i) {
        mo91232r0().setMaxLines(i);
        return this;
    }

    /* renamed from: M */
    public boolean mo91131M() {
        return super.mo91131M();
    }

    /* renamed from: g0 */
    public void mo91151g0() {
        super.mo91151g0();
    }

    /* renamed from: p0 */
    public final Button mo91230p0() {
        return mo91231q0().getActionView();
    }

    /* renamed from: q0 */
    public final SnackbarContentLayout mo91231q0() {
        return (SnackbarContentLayout) this.f76617c.getChildAt(0);
    }

    /* renamed from: r0 */
    public final TextView mo91232r0() {
        return mo91231q0().getMessageView();
    }

    /* renamed from: t */
    public void mo91163t() {
        super.mo91163t();
    }

    @C0359n0
    /* renamed from: y0 */
    public Snackbar mo91233y0(@C0324b1 int i, View.OnClickListener onClickListener) {
        return mo91234z0(mo91169z().getText(i), onClickListener);
    }

    @C0359n0
    /* renamed from: z0 */
    public Snackbar mo91234z0(@C0363p0 CharSequence charSequence, @C0363p0 View.OnClickListener onClickListener) {
        Button p0 = mo91230p0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            p0.setVisibility(8);
            p0.setOnClickListener((View.OnClickListener) null);
            this.f76677K = false;
        } else {
            this.f76677K = true;
            p0.setVisibility(0);
            p0.setText(charSequence);
            p0.setOnClickListener(new C31596a(onClickListener));
        }
        return this;
    }
}
