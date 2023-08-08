package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import androidx.core.view.C18338p3;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.r1 */
public class C0779r1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: E0 */
    public static C0779r1 f2538E0 = null;

    /* renamed from: X */
    public static final long f2539X = 15000;

    /* renamed from: Y */
    public static final long f2540Y = 3000;

    /* renamed from: Z */
    public static C0779r1 f2541Z = null;

    /* renamed from: y */
    public static final String f2542y = "TooltipCompatHandler";

    /* renamed from: z */
    public static final long f2543z = 2500;

    /* renamed from: a */
    public final View f2544a;

    /* renamed from: b */
    public final CharSequence f2545b;

    /* renamed from: c */
    public final int f2546c;

    /* renamed from: d */
    public final Runnable f2547d = new C0763p1(this);

    /* renamed from: e */
    public final Runnable f2548e = new C0776q1(this);

    /* renamed from: f */
    public int f2549f;

    /* renamed from: g */
    public int f2550g;

    /* renamed from: v */
    public C0783s1 f2551v;

    /* renamed from: w */
    public boolean f2552w;

    /* renamed from: x */
    public boolean f2553x;

    public C0779r1(View view, CharSequence charSequence) {
        this.f2544a = view;
        this.f2545b = charSequence;
        this.f2546c = C18338p3.m83060c(ViewConfiguration.get(view.getContext()));
        mo3633c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m3791e() {
        mo3636i(false);
    }

    /* renamed from: g */
    public static void m3792g(C0779r1 r1Var) {
        C0779r1 r1Var2 = f2541Z;
        if (r1Var2 != null) {
            r1Var2.mo3632b();
        }
        f2541Z = r1Var;
        if (r1Var != null) {
            r1Var.mo3635f();
        }
    }

    /* renamed from: h */
    public static void m3793h(View view, CharSequence charSequence) {
        C0779r1 r1Var = f2541Z;
        if (r1Var != null && r1Var.f2544a == view) {
            m3792g((C0779r1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0779r1 r1Var2 = f2538E0;
            if (r1Var2 != null && r1Var2.f2544a == view) {
                r1Var2.mo3634d();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0779r1(view, charSequence);
    }

    /* renamed from: b */
    public final void mo3632b() {
        this.f2544a.removeCallbacks(this.f2547d);
    }

    /* renamed from: c */
    public final void mo3633c() {
        this.f2553x = true;
    }

    /* renamed from: d */
    public void mo3634d() {
        if (f2538E0 == this) {
            f2538E0 = null;
            C0783s1 s1Var = this.f2551v;
            if (s1Var != null) {
                s1Var.mo3645c();
                this.f2551v = null;
                mo3633c();
                this.f2544a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f2541Z == this) {
            m3792g((C0779r1) null);
        }
        this.f2544a.removeCallbacks(this.f2548e);
    }

    /* renamed from: f */
    public final void mo3635f() {
        this.f2544a.postDelayed(this.f2547d, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: i */
    public void mo3636i(boolean z) {
        long j;
        long j2;
        long j3;
        if (C18196h2.m82521O0(this.f2544a)) {
            m3792g((C0779r1) null);
            C0779r1 r1Var = f2538E0;
            if (r1Var != null) {
                r1Var.mo3634d();
            }
            f2538E0 = this;
            this.f2552w = z;
            C0783s1 s1Var = new C0783s1(this.f2544a.getContext());
            this.f2551v = s1Var;
            s1Var.mo3647e(this.f2544a, this.f2549f, this.f2550g, this.f2552w, this.f2545b);
            this.f2544a.addOnAttachStateChangeListener(this);
            if (this.f2552w) {
                j = 2500;
            } else {
                if ((C18196h2.m82477C0(this.f2544a) & 1) == 1) {
                    j3 = (long) ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    j3 = (long) ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j = j2 - j3;
            }
            this.f2544a.removeCallbacks(this.f2548e);
            this.f2544a.postDelayed(this.f2548e, j);
        }
    }

    /* renamed from: j */
    public final boolean mo3637j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f2553x && Math.abs(x - this.f2549f) <= this.f2546c && Math.abs(y - this.f2550g) <= this.f2546c) {
            return false;
        }
        this.f2549f = x;
        this.f2550g = y;
        this.f2553x = false;
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2551v != null && this.f2552w) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2544a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                mo3633c();
                mo3634d();
            }
        } else if (this.f2544a.isEnabled() && this.f2551v == null && mo3637j(motionEvent)) {
            m3792g(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f2549f = view.getWidth() / 2;
        this.f2550g = view.getHeight() / 2;
        mo3636i(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo3634d();
    }
}
