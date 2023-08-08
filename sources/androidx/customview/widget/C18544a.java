package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1887m;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18035b;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.accessibility.C18089u0;
import androidx.core.view.accessibility.C18094v0;
import androidx.customview.widget.C18548b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.customview.widget.a */
public abstract class C18544a extends C18019a {

    /* renamed from: n */
    public static final int f47319n = Integer.MIN_VALUE;

    /* renamed from: o */
    public static final int f47320o = -1;

    /* renamed from: p */
    public static final String f47321p = "android.view.View";

    /* renamed from: q */
    public static final Rect f47322q = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: r */
    public static final C18548b.C18549a<C18065l0> f47323r = new C18545a();

    /* renamed from: s */
    public static final C18548b.C18550b<C1887m<C18065l0>, C18065l0> f47324s = new C18546b();

    /* renamed from: d */
    public final Rect f47325d = new Rect();

    /* renamed from: e */
    public final Rect f47326e = new Rect();

    /* renamed from: f */
    public final Rect f47327f = new Rect();

    /* renamed from: g */
    public final int[] f47328g = new int[2];

    /* renamed from: h */
    public final AccessibilityManager f47329h;

    /* renamed from: i */
    public final View f47330i;

    /* renamed from: j */
    public C18547c f47331j;

    /* renamed from: k */
    public int f47332k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f47333l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f47334m = Integer.MIN_VALUE;

    /* renamed from: androidx.customview.widget.a$a */
    public class C18545a implements C18548b.C18549a<C18065l0> {
        /* renamed from: b */
        public void mo53464a(C18065l0 l0Var, Rect rect) {
            l0Var.mo52651s(rect);
        }
    }

    /* renamed from: androidx.customview.widget.a$b */
    public class C18546b implements C18548b.C18550b<C1887m<C18065l0>, C18065l0> {
        /* renamed from: c */
        public C18065l0 mo53466a(C1887m<C18065l0> mVar, int i) {
            return mVar.mo6354H(i);
        }

        /* renamed from: d */
        public int mo53467b(C1887m<C18065l0> mVar) {
            return mVar.mo6353G();
        }
    }

    /* renamed from: androidx.customview.widget.a$c */
    public class C18547c extends C18089u0 {
        public C18547c() {
        }

        /* renamed from: b */
        public C18065l0 mo52699b(int i) {
            return C18065l0.m81935I0(C18544a.this.mo53436L(i));
        }

        /* renamed from: d */
        public C18065l0 mo52701d(int i) {
            int i2;
            if (i == 2) {
                i2 = C18544a.this.f47332k;
            } else {
                i2 = C18544a.this.f47333l;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo52699b(i2);
        }

        /* renamed from: f */
        public boolean mo52703f(int i, int i2, Bundle bundle) {
            return C18544a.this.mo53444T(i, i2, bundle);
        }
    }

    public C18544a(@C0359n0 View view) {
        if (view != null) {
            this.f47330i = view;
            this.f47329h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C18196h2.m82541V(view) == 0) {
                C18196h2.m82531R1(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: E */
    public static Rect m83856E(@C0359n0 View view, int i, @C0359n0 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: J */
    public static int m83857J(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    @Deprecated
    /* renamed from: A */
    public int mo53427A() {
        return mo53461x();
    }

    /* renamed from: B */
    public final int mo53428B() {
        return this.f47333l;
    }

    /* renamed from: C */
    public abstract int mo53429C(float f, float f2);

    /* renamed from: D */
    public abstract void mo53430D(List<Integer> list);

    /* renamed from: F */
    public final void mo53431F() {
        mo53433H(-1, 1);
    }

    /* renamed from: G */
    public final void mo53432G(int i) {
        mo53433H(i, 0);
    }

    /* renamed from: H */
    public final void mo53433H(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f47329h.isEnabled() && (parent = this.f47330i.getParent()) != null) {
            AccessibilityEvent q = mo53454q(i, 2048);
            C18035b.m81896i(q, i2);
            parent.requestSendAccessibilityEvent(this.f47330i, q);
        }
    }

    /* renamed from: I */
    public final boolean mo53434I(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f47330i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f47330i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final boolean mo53435K(int i, @C0363p0 Rect rect) {
        C18065l0 l0Var;
        C18065l0 l0Var2;
        boolean z;
        C1887m<C18065l0> y = mo53462y();
        int i2 = this.f47333l;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            l0Var = null;
        } else {
            l0Var = y.mo6363k(i2);
        }
        C18065l0 l0Var3 = l0Var;
        if (i == 1 || i == 2) {
            if (C18196h2.m82553Z(this.f47330i) == 1) {
                z = true;
            } else {
                z = false;
            }
            l0Var2 = (C18065l0) C18548b.m83910d(y, f47324s, f47323r, l0Var3, i, z, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f47333l;
            if (i4 != Integer.MIN_VALUE) {
                mo53463z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m83856E(this.f47330i, i, rect2);
            }
            l0Var2 = (C18065l0) C18548b.m83909c(y, f47324s, f47323r, l0Var3, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (l0Var2 != null) {
            i3 = y.mo6368s(y.mo6366n(l0Var2));
        }
        return mo53448X(i3);
    }

    @C0359n0
    /* renamed from: L */
    public C18065l0 mo53436L(int i) {
        if (i == -1) {
            return mo53458u();
        }
        return mo53457t(i);
    }

    /* renamed from: M */
    public final void mo53437M(boolean z, int i, @C0363p0 Rect rect) {
        int i2 = this.f47333l;
        if (i2 != Integer.MIN_VALUE) {
            mo53452o(i2);
        }
        if (z) {
            mo53435K(i, rect);
        }
    }

    /* renamed from: N */
    public abstract boolean mo53438N(int i, int i2, @C0363p0 Bundle bundle);

    /* renamed from: O */
    public void mo53439O(@C0359n0 AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: P */
    public void mo53440P(int i, @C0359n0 AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: Q */
    public void mo53441Q(@C0359n0 C18065l0 l0Var) {
    }

    /* renamed from: R */
    public abstract void mo53442R(int i, @C0359n0 C18065l0 l0Var);

    /* renamed from: S */
    public void mo53443S(int i, boolean z) {
    }

    /* renamed from: T */
    public boolean mo53444T(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return mo53445U(i, i2, bundle);
        }
        return mo53446V(i2, bundle);
    }

    /* renamed from: U */
    public final boolean mo53445U(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo53448X(i);
        }
        if (i2 == 2) {
            return mo53452o(i);
        }
        if (i2 == 64) {
            return mo53447W(i);
        }
        if (i2 != 128) {
            return mo53438N(i, i2, bundle);
        }
        return mo53451n(i);
    }

    /* renamed from: V */
    public final boolean mo53446V(int i, Bundle bundle) {
        return C18196h2.m82602l1(this.f47330i, i, bundle);
    }

    /* renamed from: W */
    public final boolean mo53447W(int i) {
        int i2;
        if (!this.f47329h.isEnabled() || !this.f47329h.isTouchExplorationEnabled() || (i2 = this.f47332k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo53451n(i2);
        }
        this.f47332k = i;
        this.f47330i.invalidate();
        mo53449Y(i, 32768);
        return true;
    }

    /* renamed from: X */
    public final boolean mo53448X(int i) {
        int i2;
        if ((!this.f47330i.isFocused() && !this.f47330i.requestFocus()) || (i2 = this.f47333l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo53452o(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f47333l = i;
        mo53443S(i, true);
        mo53449Y(i, 8);
        return true;
    }

    /* renamed from: Y */
    public final boolean mo53449Y(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f47329h.isEnabled() || (parent = this.f47330i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f47330i, mo53454q(i, i2));
    }

    /* renamed from: Z */
    public final void mo53450Z(int i) {
        int i2 = this.f47334m;
        if (i2 != i) {
            this.f47334m = i;
            mo53449Y(i, 128);
            mo53449Y(i2, 256);
        }
    }

    /* renamed from: b */
    public C18089u0 mo45416b(View view) {
        if (this.f47331j == null) {
            this.f47331j = new C18547c();
        }
        return this.f47331j;
    }

    /* renamed from: f */
    public void mo52492f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo52492f(view, accessibilityEvent);
        mo53439O(accessibilityEvent);
    }

    /* renamed from: g */
    public void mo19938g(View view, C18065l0 l0Var) {
        super.mo19938g(view, l0Var);
        mo53441Q(l0Var);
    }

    /* renamed from: n */
    public final boolean mo53451n(int i) {
        if (this.f47332k != i) {
            return false;
        }
        this.f47332k = Integer.MIN_VALUE;
        this.f47330i.invalidate();
        mo53449Y(i, 65536);
        return true;
    }

    /* renamed from: o */
    public final boolean mo53452o(int i) {
        if (this.f47333l != i) {
            return false;
        }
        this.f47333l = Integer.MIN_VALUE;
        mo53443S(i, false);
        mo53449Y(i, 8);
        return true;
    }

    /* renamed from: p */
    public final boolean mo53453p() {
        int i = this.f47333l;
        return i != Integer.MIN_VALUE && mo53438N(i, 16, (Bundle) null);
    }

    /* renamed from: q */
    public final AccessibilityEvent mo53454q(int i, int i2) {
        if (i != -1) {
            return mo53455r(i, i2);
        }
        return mo53456s(i2);
    }

    /* renamed from: r */
    public final AccessibilityEvent mo53455r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C18065l0 L = mo53436L(i);
        obtain.getText().add(L.mo52579V());
        obtain.setContentDescription(L.mo52520A());
        obtain.setScrollable(L.mo52673z0());
        obtain.setPassword(L.mo52667x0());
        obtain.setEnabled(L.mo52646q0());
        obtain.setChecked(L.mo52629k0());
        mo53440P(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(L.mo52664w());
            C18094v0.m82148Y(obtain, this.f47330i, i);
            obtain.setPackageName(this.f47330i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: s */
    public final AccessibilityEvent mo53456s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f47330i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @C0359n0
    /* renamed from: t */
    public final C18065l0 mo53457t(int i) {
        boolean z;
        C18065l0 F0 = C18065l0.m81932F0();
        F0.mo52627j1(true);
        F0.mo52633l1(true);
        F0.mo52592Z0("android.view.View");
        Rect rect = f47322q;
        F0.mo52577U0(rect);
        F0.mo52580V0(rect);
        F0.mo52528C1(this.f47330i);
        mo53442R(i, F0);
        if (F0.mo52579V() == null && F0.mo52520A() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        F0.mo52651s(this.f47326e);
        if (!this.f47326e.equals(rect)) {
            int p = F0.mo52642p();
            if ((p & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((p & 128) == 0) {
                F0.mo52522A1(this.f47330i.getContext().getPackageName());
                F0.mo52554M1(this.f47330i, i);
                if (this.f47332k == i) {
                    F0.mo52568R0(true);
                    F0.mo52594a(128);
                } else {
                    F0.mo52568R0(false);
                    F0.mo52594a(64);
                }
                if (this.f47333l == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    F0.mo52594a(2);
                } else if (F0.mo52649r0()) {
                    F0.mo52594a(1);
                }
                F0.mo52636m1(z);
                this.f47330i.getLocationOnScreen(this.f47328g);
                F0.mo52654t(this.f47325d);
                if (this.f47325d.equals(rect)) {
                    F0.mo52651s(this.f47325d);
                    if (F0.f46644b != -1) {
                        C18065l0 F02 = C18065l0.m81932F0();
                        for (int i2 = F0.f46644b; i2 != -1; i2 = F02.f46644b) {
                            F02.mo52531D1(this.f47330i, -1);
                            F02.mo52577U0(f47322q);
                            mo53442R(i2, F02);
                            F02.mo52651s(this.f47326e);
                            Rect rect2 = this.f47325d;
                            Rect rect3 = this.f47326e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        F02.mo52550L0();
                    }
                    this.f47325d.offset(this.f47328g[0] - this.f47330i.getScrollX(), this.f47328g[1] - this.f47330i.getScrollY());
                }
                if (this.f47330i.getLocalVisibleRect(this.f47327f)) {
                    this.f47327f.offset(this.f47328g[0] - this.f47330i.getScrollX(), this.f47328g[1] - this.f47330i.getScrollY());
                    if (this.f47325d.intersect(this.f47327f)) {
                        F0.mo52580V0(this.f47325d);
                        if (mo53434I(this.f47325d)) {
                            F0.mo52597a2(true);
                        }
                    }
                }
                return F0;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    @C0359n0
    /* renamed from: u */
    public final C18065l0 mo53458u() {
        C18065l0 G0 = C18065l0.m81933G0(this.f47330i);
        C18196h2.m82590i1(this.f47330i, G0);
        ArrayList arrayList = new ArrayList();
        mo53430D(arrayList);
        if (G0.mo52661v() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                G0.mo52605d(this.f47330i, ((Integer) arrayList.get(i)).intValue());
            }
            return G0;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: v */
    public final boolean mo53459v(@C0359n0 MotionEvent motionEvent) {
        if (!this.f47329h.isEnabled() || !this.f47329h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int C = mo53429C(motionEvent.getX(), motionEvent.getY());
            mo53450Z(C);
            if (C != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f47334m == Integer.MIN_VALUE) {
            return false;
        } else {
            mo53450Z(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo53460w(@C0359n0 KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int J = m83857J(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && mo53435K(J, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            mo53453p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return mo53435K(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return mo53435K(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: x */
    public final int mo53461x() {
        return this.f47332k;
    }

    /* renamed from: y */
    public final C1887m<C18065l0> mo53462y() {
        ArrayList arrayList = new ArrayList();
        mo53430D(arrayList);
        C1887m<C18065l0> mVar = new C1887m<>();
        for (int i = 0; i < arrayList.size(); i++) {
            mVar.mo6369t(((Integer) arrayList.get(i)).intValue(), mo53457t(((Integer) arrayList.get(i)).intValue()));
        }
        return mVar;
    }

    /* renamed from: z */
    public final void mo53463z(int i, Rect rect) {
        mo53436L(i).mo52651s(rect);
    }
}
