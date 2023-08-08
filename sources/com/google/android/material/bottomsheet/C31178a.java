package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.C0327c1;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.app.C0492q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import androidx.core.view.accessibility.C18065l0;
import com.google.android.material.C31076a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.C31266s;
import com.google.android.material.shape.C31525j;

/* renamed from: com.google.android.material.bottomsheet.a */
public class C31178a extends C0492q {
    @C0359n0

    /* renamed from: E0 */
    public BottomSheetBehavior.C31172f f74863E0;

    /* renamed from: X */
    public boolean f74864X;

    /* renamed from: Y */
    public BottomSheetBehavior.C31172f f74865Y;

    /* renamed from: Z */
    public boolean f74866Z;

    /* renamed from: f */
    public BottomSheetBehavior<FrameLayout> f74867f;

    /* renamed from: g */
    public FrameLayout f74868g;

    /* renamed from: v */
    public CoordinatorLayout f74869v;

    /* renamed from: w */
    public FrameLayout f74870w;

    /* renamed from: x */
    public boolean f74871x;

    /* renamed from: y */
    public boolean f74872y;

    /* renamed from: z */
    public boolean f74873z;

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    public class C31179a implements C18414x1 {
        public C31179a() {
        }

        /* renamed from: a */
        public C18436z4 mo1193a(View view, C18436z4 z4Var) {
            if (C31178a.this.f74865Y != null) {
                C31178a.this.f74867f.mo88399D0(C31178a.this.f74865Y);
            }
            if (z4Var != null) {
                C31178a aVar = C31178a.this;
                BottomSheetBehavior.C31172f unused = aVar.f74865Y = new C31184f(aVar.f74870w, z4Var, (C31179a) null);
                C31178a.this.f74867f.mo88421Y(C31178a.this.f74865Y);
            }
            return z4Var;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    public class C31180b implements View.OnClickListener {
        public C31180b() {
        }

        public void onClick(View view) {
            C31178a aVar = C31178a.this;
            if (aVar.f74872y && aVar.isShowing() && C31178a.this.mo88483x()) {
                C31178a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    public class C31181c extends C18019a {
        public C31181c() {
        }

        /* renamed from: g */
        public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            if (C31178a.this.f74872y) {
                l0Var.mo52594a(1048576);
                l0Var.mo52617g1(true);
                return;
            }
            l0Var.mo52617g1(false);
        }

        /* renamed from: j */
        public boolean mo19939j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C31178a aVar = C31178a.this;
                if (aVar.f74872y) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.mo19939j(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    public class C31182d implements View.OnTouchListener {
        public C31182d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$e */
    public class C31183e extends BottomSheetBehavior.C31172f {
        public C31183e() {
        }

        /* renamed from: b */
        public void mo68139b(@C0359n0 View view, float f) {
        }

        /* renamed from: c */
        public void mo68140c(@C0359n0 View view, int i) {
            if (i == 5) {
                C31178a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$f */
    public static class C31184f extends BottomSheetBehavior.C31172f {

        /* renamed from: a */
        public final boolean f74879a;

        /* renamed from: b */
        public final boolean f74880b;

        /* renamed from: c */
        public final C18436z4 f74881c;

        public /* synthetic */ C31184f(View view, C18436z4 z4Var, C31179a aVar) {
            this(view, z4Var);
        }

        /* renamed from: a */
        public void mo88469a(@C0359n0 View view) {
            mo88486d(view);
        }

        /* renamed from: b */
        public void mo68139b(@C0359n0 View view, float f) {
            mo88486d(view);
        }

        /* renamed from: c */
        public void mo68140c(@C0359n0 View view, int i) {
            mo88486d(view);
        }

        /* renamed from: d */
        public final void mo88486d(View view) {
            if (view.getTop() < this.f74881c.mo53149r()) {
                C31178a.m125339w(view, this.f74879a);
                view.setPadding(view.getPaddingLeft(), this.f74881c.mo53149r() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                C31178a.m125339w(view, this.f74880b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public C31184f(@C0359n0 View view, @C0359n0 C18436z4 z4Var) {
            ColorStateList colorStateList;
            this.f74881c = z4Var;
            boolean z = (view.getSystemUiVisibility() & 8192) != 0;
            this.f74880b = z;
            C31525j n0 = BottomSheetBehavior.m125237i0(view).mo88447n0();
            if (n0 != null) {
                colorStateList = n0.mo90797y();
            } else {
                colorStateList = C18196h2.m82517N(view);
            }
            if (colorStateList != null) {
                this.f74879a = C31266s.m125960k(colorStateList.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f74879a = C31266s.m125960k(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f74879a = z;
            }
        }
    }

    public C31178a(@C0359n0 Context context) {
        this(context, 0);
        this.f74866Z = getContext().getTheme().obtainStyledAttributes(new int[]{C31076a.C31079c.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* renamed from: j */
    public static int m125334j(@C0359n0 Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C31076a.C31079c.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return C31076a.C31090n.Theme_Design_Light_BottomSheetDialog;
    }

    /* renamed from: w */
    public static void m125339w(@C0359n0 View view, boolean z) {
        int i;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & -8193;
        }
        view.setSystemUiVisibility(i);
    }

    /* renamed from: A */
    public final View mo88472A(int i, @C0363p0 View view, @C0363p0 ViewGroup.LayoutParams layoutParams) {
        mo88475q();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f74868g.findViewById(C31076a.C31084h.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.f74866Z) {
            C18196h2.m82559a2(this.f74870w, new C31179a());
        }
        this.f74870w.removeAllViews();
        if (layoutParams == null) {
            this.f74870w.addView(view);
        } else {
            this.f74870w.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C31076a.C31084h.touch_outside).setOnClickListener(new C31180b());
        C18196h2.m82474B1(this.f74870w, new C31181c());
        this.f74870w.setOnTouchListener(new C31182d());
        return this.f74868g;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> r = mo88476r();
        if (!this.f74871x || r.mo88454u0() == 5) {
            super.cancel();
        } else {
            r.mo88418W0(5);
        }
    }

    public void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (!this.f74866Z || Color.alpha(window.getNavigationBarColor()) >= 255) {
                z = false;
            } else {
                z = true;
            }
            FrameLayout frameLayout = this.f74868g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f74869v;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f74867f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo88454u0() == 5) {
            this.f74867f.mo88418W0(4);
        }
    }

    /* renamed from: q */
    public final FrameLayout mo88475q() {
        if (this.f74868g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C31076a.C31087k.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f74868g = frameLayout;
            this.f74869v = (CoordinatorLayout) frameLayout.findViewById(C31076a.C31084h.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f74868g.findViewById(C31076a.C31084h.design_bottom_sheet);
            this.f74870w = frameLayout2;
            BottomSheetBehavior<FrameLayout> i0 = BottomSheetBehavior.m125237i0(frameLayout2);
            this.f74867f = i0;
            i0.mo88421Y(this.f74863E0);
            this.f74867f.mo88410O0(this.f74872y);
        }
        return this.f74868g;
    }

    @C0359n0
    /* renamed from: r */
    public BottomSheetBehavior<FrameLayout> mo88476r() {
        if (this.f74867f == null) {
            mo88475q();
        }
        return this.f74867f;
    }

    /* renamed from: s */
    public boolean mo88477s() {
        return this.f74871x;
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f74872y != z) {
            this.f74872y = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f74867f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo88410O0(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f74872y) {
            this.f74872y = true;
        }
        this.f74873z = z;
        this.f74864X = true;
    }

    public void setContentView(@C0347i0 int i) {
        super.setContentView(mo88472A(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    /* renamed from: t */
    public boolean mo88480t() {
        return this.f74866Z;
    }

    /* renamed from: u */
    public void mo88481u() {
        this.f74867f.mo88399D0(this.f74863E0);
    }

    /* renamed from: v */
    public void mo88482v(boolean z) {
        this.f74871x = z;
    }

    /* renamed from: x */
    public boolean mo88483x() {
        if (!this.f74864X) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f74873z = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f74864X = true;
        }
        return this.f74873z;
    }

    public void setContentView(View view) {
        super.setContentView(mo88472A(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(mo88472A(0, view, layoutParams));
    }

    public C31178a(@C0359n0 Context context, @C0327c1 int i) {
        super(context, m125334j(context, i));
        this.f74872y = true;
        this.f74873z = true;
        this.f74863E0 = new C31183e();
        mo1528l(1);
        this.f74866Z = getContext().getTheme().obtainStyledAttributes(new int[]{C31076a.C31079c.enableEdgeToEdge}).getBoolean(0, false);
    }

    public C31178a(@C0359n0 Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.f74872y = true;
        this.f74873z = true;
        this.f74863E0 = new C31183e();
        mo1528l(1);
        this.f74872y = z;
        this.f74866Z = getContext().getTheme().obtainStyledAttributes(new int[]{C31076a.C31079c.enableEdgeToEdge}).getBoolean(0, false);
    }
}
