package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;
import androidx.core.graphics.C17616m0;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import androidx.core.view.C18436z4;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.accessibility.C18098w0;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C18552c;
import androidx.customview.widget.C18553d;
import androidx.drawerlayout.C18935a;
import com.google.maps.android.heatmaps.C33876b;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup implements C18552c {

    /* renamed from: d1 */
    public static final String f48192d1 = "DrawerLayout";

    /* renamed from: e1 */
    public static final int[] f48193e1 = {16843828};

    /* renamed from: f1 */
    public static final int f48194f1 = 0;

    /* renamed from: g1 */
    public static final int f48195g1 = 1;

    /* renamed from: h1 */
    public static final int f48196h1 = 2;

    /* renamed from: i1 */
    public static final int f48197i1 = 0;

    /* renamed from: j1 */
    public static final int f48198j1 = 1;

    /* renamed from: k1 */
    public static final int f48199k1 = 2;

    /* renamed from: l1 */
    public static final int f48200l1 = 3;

    /* renamed from: m1 */
    public static final int f48201m1 = 64;

    /* renamed from: n1 */
    public static final int f48202n1 = -1728053248;

    /* renamed from: o1 */
    public static final int f48203o1 = 160;

    /* renamed from: p1 */
    public static final int f48204p1 = 400;

    /* renamed from: q1 */
    public static final boolean f48205q1 = false;

    /* renamed from: r1 */
    public static final boolean f48206r1 = true;

    /* renamed from: s1 */
    public static final float f48207s1 = 1.0f;

    /* renamed from: t1 */
    public static final int[] f48208t1 = {16842931};

    /* renamed from: u1 */
    public static final boolean f48209u1 = true;

    /* renamed from: v1 */
    public static final boolean f48210v1 = true;

    /* renamed from: w1 */
    public static final String f48211w1 = "androidx.drawerlayout.widget.DrawerLayout";

    /* renamed from: x1 */
    public static boolean f48212x1;

    /* renamed from: E0 */
    public boolean f48213E0;

    /* renamed from: F0 */
    public int f48214F0;

    /* renamed from: G0 */
    public int f48215G0;

    /* renamed from: H0 */
    public int f48216H0;

    /* renamed from: I0 */
    public int f48217I0;

    /* renamed from: J0 */
    public boolean f48218J0;
    @C0363p0

    /* renamed from: K0 */
    public C18951e f48219K0;

    /* renamed from: L0 */
    public List<C18951e> f48220L0;

    /* renamed from: M0 */
    public float f48221M0;

    /* renamed from: N0 */
    public float f48222N0;

    /* renamed from: O0 */
    public Drawable f48223O0;

    /* renamed from: P0 */
    public Drawable f48224P0;

    /* renamed from: Q0 */
    public Drawable f48225Q0;

    /* renamed from: R0 */
    public CharSequence f48226R0;

    /* renamed from: S0 */
    public CharSequence f48227S0;

    /* renamed from: T0 */
    public Object f48228T0;

    /* renamed from: U0 */
    public boolean f48229U0;

    /* renamed from: V0 */
    public Drawable f48230V0;

    /* renamed from: W0 */
    public Drawable f48231W0;

    /* renamed from: X0 */
    public Drawable f48232X0;

    /* renamed from: Y0 */
    public Drawable f48233Y0;

    /* renamed from: Z0 */
    public final ArrayList<View> f48234Z0;

    /* renamed from: a */
    public final C18950d f48235a;

    /* renamed from: a1 */
    public Rect f48236a1;

    /* renamed from: b */
    public float f48237b;

    /* renamed from: b1 */
    public Matrix f48238b1;

    /* renamed from: c */
    public int f48239c;

    /* renamed from: c1 */
    public final C18098w0 f48240c1;

    /* renamed from: d */
    public int f48241d;

    /* renamed from: e */
    public float f48242e;

    /* renamed from: f */
    public Paint f48243f;

    /* renamed from: g */
    public final C18553d f48244g;

    /* renamed from: v */
    public final C18553d f48245v;

    /* renamed from: w */
    public final C18954h f48246w;

    /* renamed from: x */
    public final C18954h f48247x;

    /* renamed from: y */
    public int f48248y;

    /* renamed from: z */
    public boolean f48249z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    public class C18947a implements C18098w0 {
        public C18947a() {
        }

        /* renamed from: a */
        public boolean mo19056a(@C0359n0 View view, @C0363p0 C18098w0.C18099a aVar) {
            if (!DrawerLayout.this.mo55744D(view) || DrawerLayout.this.mo55803r(view) == 2) {
                return false;
            }
            DrawerLayout.this.mo55774f(view);
            return true;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    public class C18948b implements View.OnApplyWindowInsetsListener {
        public C18948b() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z;
            DrawerLayout drawerLayout = (DrawerLayout) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z = true;
            } else {
                z = false;
            }
            drawerLayout.setChildInsets(windowInsets, z);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public class C18949c extends C18019a {

        /* renamed from: d */
        public final Rect f48257d = new Rect();

        public C18949c() {
        }

        /* renamed from: a */
        public boolean mo52489a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence s;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo52489a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View p = DrawerLayout.this.mo55801p();
            if (p == null || (s = DrawerLayout.this.mo55806s(DrawerLayout.this.mo55820t(p))) == null) {
                return true;
            }
            text.add(s);
            return true;
        }

        /* renamed from: f */
        public void mo52492f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo52492f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.f48211w1);
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            if (DrawerLayout.f48209u1) {
                super.mo19938g(view, l0Var);
            } else {
                C18065l0 I0 = C18065l0.m81935I0(l0Var);
                super.mo19938g(view, I0);
                l0Var.mo52551L1(view);
                ViewParent l0 = C18196h2.m82601l0(view);
                if (l0 instanceof View) {
                    l0Var.mo52528C1((View) l0);
                }
                mo55833o(l0Var, I0);
                I0.mo52550L0();
                mo55832n(l0Var, (ViewGroup) view);
            }
            l0Var.mo52592Z0(DrawerLayout.f48211w1);
            l0Var.mo52633l1(false);
            l0Var.mo52636m1(false);
            l0Var.mo52556N0(C18065l0.C18066a.f46669f);
            l0Var.mo52556N0(C18065l0.C18066a.f46670g);
        }

        /* renamed from: i */
        public boolean mo52494i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f48209u1 || DrawerLayout.m88595A(view)) {
                return super.mo52494i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: n */
        public final void mo55832n(C18065l0 l0Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m88595A(childAt)) {
                    l0Var.mo52602c(childAt);
                }
            }
        }

        /* renamed from: o */
        public final void mo55833o(C18065l0 l0Var, C18065l0 l0Var2) {
            Rect rect = this.f48257d;
            l0Var2.mo52654t(rect);
            l0Var.mo52580V0(rect);
            l0Var.mo52597a2(l0Var2.mo52533E0());
            l0Var.mo52522A1(l0Var2.mo52558O());
            l0Var.mo52592Z0(l0Var2.mo52664w());
            l0Var.mo52607d1(l0Var2.mo52520A());
            l0Var.mo52627j1(l0Var2.mo52646q0());
            l0Var.mo52636m1(l0Var2.mo52652s0());
            l0Var.mo52568R0(l0Var2.mo52623i0());
            l0Var.mo52545J1(l0Var2.mo52521A0());
            l0Var.mo52594a(l0Var2.mo52642p());
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public static final class C18950d extends C18019a {
        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            if (!DrawerLayout.m88595A(view)) {
                l0Var.mo52528C1((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public interface C18951e {
        /* renamed from: a */
        void mo1342a(@C0359n0 View view);

        /* renamed from: b */
        void mo1343b(@C0359n0 View view);

        /* renamed from: c */
        void mo1344c(int i);

        /* renamed from: d */
        void mo1345d(@C0359n0 View view, float f);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    public static abstract class C18953g implements C18951e {
        /* renamed from: a */
        public void mo1342a(View view) {
        }

        /* renamed from: b */
        public void mo1343b(View view) {
        }

        /* renamed from: c */
        public void mo1344c(int i) {
        }

        /* renamed from: d */
        public void mo1345d(View view, float f) {
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$h */
    public class C18954h extends C18553d.C18556c {

        /* renamed from: a */
        public final int f48266a;

        /* renamed from: b */
        public C18553d f48267b;

        /* renamed from: c */
        public final Runnable f48268c = new C18955a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$h$a */
        public class C18955a implements Runnable {
            public C18955a() {
            }

            public void run() {
                C18954h.this.mo55835o();
            }
        }

        public C18954h(int i) {
            this.f48266a = i;
        }

        /* renamed from: a */
        public int mo18293a(View view, int i, int i2) {
            if (DrawerLayout.this.mo55767c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: b */
        public int mo18294b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo53526d(View view) {
            if (DrawerLayout.this.mo55745E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: f */
        public void mo53528f(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.mo55787n(3);
            } else {
                view = DrawerLayout.this.mo55787n(5);
            }
            if (view != null && DrawerLayout.this.mo55803r(view) == 0) {
                this.f48267b.mo53502d(view, i2);
            }
        }

        /* renamed from: g */
        public boolean mo53529g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo53530h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f48268c, 160);
        }

        /* renamed from: i */
        public void mo18295i(View view, int i) {
            ((C18952f) view.getLayoutParams()).f48264c = false;
            mo55834n();
        }

        /* renamed from: j */
        public void mo18296j(int i) {
            DrawerLayout.this.mo55762V(i, this.f48267b.mo53522z());
        }

        /* renamed from: k */
        public void mo18297k(View view, int i, int i2, int i3, int i4) {
            float f;
            int i5;
            int width = view.getWidth();
            if (DrawerLayout.this.mo55767c(view, 3)) {
                f = (float) (i + width);
            } else {
                f = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            DrawerLayout.this.mo55759S(view, f2);
            if (f2 == 0.0f) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo18298l(View view, float f, float f2) {
            int i;
            float u = DrawerLayout.this.mo55821u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo55767c(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && u > 0.5f)) {
                    i = 0;
                } else {
                    i = -width;
                }
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f48267b.mo53495V(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo18299m(View view, int i) {
            if (!DrawerLayout.this.mo55745E(view) || !DrawerLayout.this.mo55767c(view, this.f48266a) || DrawerLayout.this.mo55803r(view) != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: n */
        public final void mo55834n() {
            int i = 3;
            if (this.f48266a == 3) {
                i = 5;
            }
            View n = DrawerLayout.this.mo55787n(i);
            if (n != null) {
                DrawerLayout.this.mo55774f(n);
            }
        }

        /* renamed from: o */
        public void mo55835o() {
            boolean z;
            View view;
            int i;
            int B = this.f48267b.mo53475B();
            int i2 = 0;
            if (this.f48266a == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                view = DrawerLayout.this.mo55787n(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + B;
            } else {
                view = DrawerLayout.this.mo55787n(5);
                i = DrawerLayout.this.getWidth() - B;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo55803r(view) == 0) {
                this.f48267b.mo53497X(view, i, view.getTop());
                ((C18952f) view.getLayoutParams()).f48264c = true;
                DrawerLayout.this.invalidate();
                mo55834n();
                DrawerLayout.this.mo55766b();
            }
        }

        /* renamed from: p */
        public void mo55836p() {
            DrawerLayout.this.removeCallbacks(this.f48268c);
        }

        /* renamed from: q */
        public void mo55837q(C18553d dVar) {
            this.f48267b = dVar;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            z = false;
        }
        f48212x1 = z;
    }

    public DrawerLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public static boolean m88595A(View view) {
        if (C18196h2.m82541V(view) == 4 || C18196h2.m82541V(view) == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public static String m88596w(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    /* renamed from: x */
    public static boolean m88597x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public boolean mo55742B(View view) {
        return ((C18952f) view.getLayoutParams()).f48262a == 0;
    }

    /* renamed from: C */
    public boolean mo55743C(int i) {
        View n = mo55787n(i);
        if (n != null) {
            return mo55744D(n);
        }
        return false;
    }

    /* renamed from: D */
    public boolean mo55744D(@C0359n0 View view) {
        if (!mo55745E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if ((((C18952f) view.getLayoutParams()).f48265d & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: E */
    public boolean mo55745E(View view) {
        int d = C18306m0.m82991d(((C18952f) view.getLayoutParams()).f48262a, C18196h2.m82553Z(view));
        if ((d & 3) == 0 && (d & 5) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public boolean mo55746F(int i) {
        View n = mo55787n(i);
        if (n != null) {
            return mo55747G(n);
        }
        return false;
    }

    /* renamed from: G */
    public boolean mo55747G(@C0359n0 View view) {
        if (!mo55745E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if (((C18952f) view.getLayoutParams()).f48263b > 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: H */
    public final boolean mo55748H(float f, float f2, View view) {
        if (this.f48236a1 == null) {
            this.f48236a1 = new Rect();
        }
        view.getHitRect(this.f48236a1);
        return this.f48236a1.contains((int) f, (int) f2);
    }

    /* renamed from: I */
    public final void mo55749I(Drawable drawable, int i) {
        if (drawable != null && C17549d.m80446h(drawable)) {
            C17549d.m80451m(drawable, i);
        }
    }

    /* renamed from: J */
    public void mo55750J(View view, float f) {
        float u = mo55821u(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (u * width));
        if (!mo55767c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo55759S(view, f);
    }

    /* renamed from: K */
    public void mo55751K(int i) {
        mo55752L(i, true);
    }

    /* renamed from: L */
    public void mo55752L(int i, boolean z) {
        View n = mo55787n(i);
        if (n != null) {
            mo55754N(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m88596w(i));
    }

    /* renamed from: M */
    public void mo55753M(@C0359n0 View view) {
        mo55754N(view, true);
    }

    /* renamed from: N */
    public void mo55754N(@C0359n0 View view, boolean z) {
        if (mo55745E(view)) {
            C18952f fVar = (C18952f) view.getLayoutParams();
            if (this.f48213E0) {
                fVar.f48263b = 1.0f;
                fVar.f48265d = 1;
                mo55761U(view, true);
                mo55760T(view);
            } else if (z) {
                fVar.f48265d |= 2;
                if (mo55767c(view, 3)) {
                    this.f48244g.mo53497X(view, 0, view.getTop());
                } else {
                    this.f48245v.mo53497X(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo55750J(view, 1.0f);
                mo55762V(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: O */
    public void mo55755O(@C0359n0 C18951e eVar) {
        List<C18951e> list;
        if (eVar != null && (list = this.f48220L0) != null) {
            list.remove(eVar);
        }
    }

    /* renamed from: P */
    public final Drawable mo55756P() {
        int Z = C18196h2.m82553Z(this);
        if (Z == 0) {
            Drawable drawable = this.f48230V0;
            if (drawable != null) {
                mo55749I(drawable, Z);
                return this.f48230V0;
            }
        } else {
            Drawable drawable2 = this.f48231W0;
            if (drawable2 != null) {
                mo55749I(drawable2, Z);
                return this.f48231W0;
            }
        }
        return this.f48232X0;
    }

    /* renamed from: Q */
    public final Drawable mo55757Q() {
        int Z = C18196h2.m82553Z(this);
        if (Z == 0) {
            Drawable drawable = this.f48231W0;
            if (drawable != null) {
                mo55749I(drawable, Z);
                return this.f48231W0;
            }
        } else {
            Drawable drawable2 = this.f48230V0;
            if (drawable2 != null) {
                mo55749I(drawable2, Z);
                return this.f48230V0;
            }
        }
        return this.f48233Y0;
    }

    /* renamed from: R */
    public final void mo55758R() {
        if (!f48210v1) {
            this.f48224P0 = mo55756P();
            this.f48225Q0 = mo55757Q();
        }
    }

    /* renamed from: S */
    public void mo55759S(View view, float f) {
        C18952f fVar = (C18952f) view.getLayoutParams();
        if (f != fVar.f48263b) {
            fVar.f48263b = f;
            mo55785l(view, f);
        }
    }

    /* renamed from: T */
    public final void mo55760T(View view) {
        C18065l0.C18066a aVar = C18065l0.C18066a.f46689z;
        C18196h2.m82626r1(view, aVar.mo52676b());
        if (mo55744D(view) && mo55803r(view) != 2) {
            C18196h2.m82638u1(view, aVar, (CharSequence) null, this.f48240c1);
        }
    }

    /* renamed from: U */
    public final void mo55761U(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || mo55745E(childAt)) && (!z || childAt != view)) {
                C18196h2.m82531R1(childAt, 4);
            } else {
                C18196h2.m82531R1(childAt, 1);
            }
        }
    }

    /* renamed from: V */
    public void mo55762V(int i, View view) {
        int i2;
        int F = this.f48244g.mo53479F();
        int F2 = this.f48245v.mo53479F();
        if (F == 1 || F2 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (!(F == 2 || F2 == 2)) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((C18952f) view.getLayoutParams()).f48263b;
            if (f == 0.0f) {
                mo55783j(view);
            } else if (f == 1.0f) {
                mo55784k(view);
            }
        }
        if (i2 != this.f48248y) {
            this.f48248y = i2;
            List<C18951e> list = this.f48220L0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f48220L0.get(size).mo1344c(i2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo55763a(@C0359n0 C18951e eVar) {
        if (eVar != null) {
            if (this.f48220L0 == null) {
                this.f48220L0 = new ArrayList();
            }
            this.f48220L0.add(eVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo55745E(childAt)) {
                    this.f48234Z0.add(childAt);
                } else if (mo55744D(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f48234Z0.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f48234Z0.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f48234Z0.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo55788o() != null || mo55745E(view)) {
            C18196h2.m82531R1(view, 4);
        } else {
            C18196h2.m82531R1(view, 1);
        }
        if (!f48209u1) {
            C18196h2.m82474B1(view, this.f48235a);
        }
    }

    /* renamed from: b */
    public void mo55766b() {
        if (!this.f48218J0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f48218J0 = true;
        }
    }

    /* renamed from: c */
    public boolean mo55767c(View view, int i) {
        return (mo55820t(view) & i) == i;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C18952f) && super.checkLayoutParams(layoutParams);
    }

    public void close() {
        mo55770d(C18306m0.f46960b);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C18952f) getChildAt(i).getLayoutParams()).f48263b);
        }
        this.f48242e = f;
        boolean o = this.f48244g.mo53513o(true);
        boolean o2 = this.f48245v.mo53513o(true);
        if (o || o2) {
            C18196h2.m82610n1(this);
        }
    }

    /* renamed from: d */
    public void mo55770d(int i) {
        mo55773e(i, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f48242e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (mo55748H(x, y, childAt) && !mo55742B(childAt) && mo55786m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean B = mo55742B(view2);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (B) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view2 && childAt.getVisibility() == 0 && m88597x(childAt) && mo55745E(childAt) && childAt.getHeight() >= height) {
                    if (mo55767c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f48242e;
        if (f > 0.0f && B) {
            int i4 = this.f48241d;
            this.f48243f.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f48243f);
        } else if (this.f48224P0 != null && mo55767c(view2, 3)) {
            int intrinsicWidth = this.f48224P0.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f48244g.mo53475B()), 1.0f));
            this.f48224P0.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f48224P0.setAlpha((int) (max * 255.0f));
            this.f48224P0.draw(canvas);
        } else if (this.f48225Q0 != null && mo55767c(view2, 5)) {
            int intrinsicWidth2 = this.f48225Q0.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f48245v.mo53475B()), 1.0f));
            this.f48225Q0.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f48225Q0.setAlpha((int) (max2 * 255.0f));
            this.f48225Q0.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void mo55773e(int i, boolean z) {
        View n = mo55787n(i);
        if (n != null) {
            mo55775g(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m88596w(i));
    }

    /* renamed from: f */
    public void mo55774f(@C0359n0 View view) {
        mo55775g(view, true);
    }

    /* renamed from: g */
    public void mo55775g(@C0359n0 View view, boolean z) {
        if (mo55745E(view)) {
            C18952f fVar = (C18952f) view.getLayoutParams();
            if (this.f48213E0) {
                fVar.f48263b = 0.0f;
                fVar.f48265d = 0;
            } else if (z) {
                fVar.f48265d |= 4;
                if (mo55767c(view, 3)) {
                    this.f48244g.mo53497X(view, -view.getWidth(), view.getTop());
                } else {
                    this.f48245v.mo53497X(view, getWidth(), view.getTop());
                }
            } else {
                mo55750J(view, 0.0f);
                mo55762V(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C18952f(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C18952f) {
            return new C18952f((C18952f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C18952f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C18952f(layoutParams);
    }

    public float getDrawerElevation() {
        if (f48210v1) {
            return this.f48237b;
        }
        return 0.0f;
    }

    @C0363p0
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f48223O0;
    }

    /* renamed from: h */
    public void mo55781h() {
        mo55782i(false);
    }

    /* renamed from: i */
    public void mo55782i(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C18952f fVar = (C18952f) childAt.getLayoutParams();
            if (mo55745E(childAt) && (!z || fVar.f48264c)) {
                int width = childAt.getWidth();
                if (mo55767c(childAt, 3)) {
                    z2 = this.f48244g.mo53497X(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.f48245v.mo53497X(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                fVar.f48264c = false;
            }
        }
        this.f48246w.mo55836p();
        this.f48247x.mo55836p();
        if (z3) {
            invalidate();
        }
    }

    public boolean isOpen() {
        return mo55743C(C18306m0.f46960b);
    }

    /* renamed from: j */
    public void mo55783j(View view) {
        View rootView;
        C18952f fVar = (C18952f) view.getLayoutParams();
        if ((fVar.f48265d & 1) == 1) {
            fVar.f48265d = 0;
            List<C18951e> list = this.f48220L0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f48220L0.get(size).mo1343b(view);
                }
            }
            mo55761U(view, false);
            mo55760T(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: k */
    public void mo55784k(View view) {
        C18952f fVar = (C18952f) view.getLayoutParams();
        if ((fVar.f48265d & 1) == 0) {
            fVar.f48265d = 1;
            List<C18951e> list = this.f48220L0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f48220L0.get(size).mo1342a(view);
                }
            }
            mo55761U(view, true);
            mo55760T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: l */
    public void mo55785l(View view, float f) {
        List<C18951e> list = this.f48220L0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f48220L0.get(size).mo1345d(view, f);
            }
        }
    }

    /* renamed from: m */
    public final boolean mo55786m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v = mo55822v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v);
            v.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: n */
    public View mo55787n(int i) {
        int d = C18306m0.m82991d(i, C18196h2.m82553Z(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo55820t(childAt) & 7) == d) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    public View mo55788o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C18952f) childAt.getLayoutParams()).f48265d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48213E0 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48213E0 = true;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f48229U0 && this.f48223O0 != null) {
            Object obj = this.f48228T0;
            if (obj != null) {
                i = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f48223O0.setBounds(0, 0, getWidth(), i);
                this.f48223O0.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.widget.d r1 = r6.f48244g
            boolean r1 = r1.mo53496W(r7)
            androidx.customview.widget.d r2 = r6.f48245v
            boolean r2 = r2.mo53496W(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            androidx.customview.widget.d r7 = r6.f48244g
            boolean r7 = r7.mo53504f(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f48246w
            r7.mo55836p()
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f48247x
            r7.mo55836p()
            goto L_0x0036
        L_0x0031:
            r6.mo55782i(r2)
            r6.f48218J0 = r3
        L_0x0036:
            r7 = r3
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f48221M0 = r0
            r6.f48222N0 = r7
            float r4 = r6.f48242e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            androidx.customview.widget.d r4 = r6.f48244g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.mo53518v(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.mo55742B(r7)
            if (r7 == 0) goto L_0x005d
            r7 = r2
            goto L_0x005e
        L_0x005d:
            r7 = r3
        L_0x005e:
            r6.f48218J0 = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.mo55823y()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.f48218J0
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !mo55824z()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View p = mo55801p();
        if (p != null && mo55803r(p) == 0) {
            mo55781h();
        }
        if (p != null) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2;
        int i6;
        boolean z3 = true;
        this.f48249z = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C18952f fVar = (C18952f) childAt.getLayoutParams();
                if (mo55742B(childAt)) {
                    int i9 = fVar.leftMargin;
                    childAt.layout(i9, fVar.topMargin, childAt.getMeasuredWidth() + i9, fVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo55767c(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (fVar.f48263b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i10 = i7 - ((int) (fVar.f48263b * f3));
                        f = ((float) (i7 - i10)) / f3;
                        i5 = i10;
                    }
                    if (f != fVar.f48263b) {
                        z2 = z3;
                    } else {
                        z2 = false;
                    }
                    int i11 = fVar.f48262a & 112;
                    if (i11 == 16) {
                        int i12 = i4 - i2;
                        int i13 = (i12 - measuredHeight) / 2;
                        int i14 = fVar.topMargin;
                        if (i13 < i14) {
                            i13 = i14;
                        } else {
                            int i15 = i13 + measuredHeight;
                            int i16 = fVar.bottomMargin;
                            if (i15 > i12 - i16) {
                                i13 = (i12 - i16) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i13, measuredWidth + i5, measuredHeight + i13);
                    } else if (i11 != 80) {
                        int i17 = fVar.topMargin;
                        childAt.layout(i5, i17, measuredWidth + i5, measuredHeight + i17);
                    } else {
                        int i18 = i4 - i2;
                        childAt.layout(i5, (i18 - fVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i18 - fVar.bottomMargin);
                    }
                    if (z2) {
                        mo55759S(childAt, f);
                    }
                    if (fVar.f48263b > 0.0f) {
                        i6 = 0;
                    } else {
                        i6 = 4;
                    }
                    if (childAt.getVisibility() != i6) {
                        childAt.setVisibility(i6);
                    }
                }
            }
            i8++;
            z3 = true;
        }
        if (f48212x1 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C17616m0 n = C18436z4.m83374K(rootWindowInsets).mo53145n();
            C18553d dVar = this.f48244g;
            dVar.mo53492S(Math.max(dVar.mo53474A(), n.f45995a));
            C18553d dVar2 = this.f48245v;
            dVar2.mo53492S(Math.max(dVar2.mo53474A(), n.f45997c));
        }
        this.f48249z = false;
        this.f48213E0 = false;
    }

    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f48228T0 == null || !C18196h2.m82538U(this)) {
            z = false;
        } else {
            z = true;
        }
        int Z = C18196h2.m82553Z(this);
        int childCount = getChildCount();
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C18952f fVar = (C18952f) childAt.getLayoutParams();
                if (z) {
                    int d = C18306m0.m82991d(fVar.f48262a, Z);
                    if (C18196h2.m82538U(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.f48228T0;
                        if (d == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (d == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.f48228T0;
                        if (d == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (d == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        fVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        fVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        fVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        fVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo55742B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - fVar.leftMargin) - fVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - fVar.topMargin) - fVar.bottomMargin, 1073741824));
                } else if (mo55745E(childAt)) {
                    if (f48210v1) {
                        float R = C18196h2.m82529R(childAt);
                        float f = this.f48237b;
                        if (R != f) {
                            C18196h2.m82519N1(childAt, f);
                        }
                    }
                    int t = mo55820t(childAt) & 7;
                    if (t == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((!z2 || !z3) && (z2 || !z4)) {
                        if (z2) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f48239c + fVar.leftMargin + fVar.rightMargin, fVar.width), ViewGroup.getChildMeasureSpec(i2, fVar.topMargin + fVar.bottomMargin, fVar.height));
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m88596w(t) + " but this " + f48192d1 + " already has a drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i4 = i;
            int i5 = i2;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        View n;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        int i = savedState.f48250c;
        if (!(i == 0 || (n = mo55787n(i)) == null)) {
            mo55753M(n);
        }
        int i2 = savedState.f48251d;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = savedState.f48252e;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = savedState.f48253f;
        if (i4 != 3) {
            setDrawerLockMode(i4, (int) C18306m0.f46960b);
        }
        int i5 = savedState.f48254g;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        mo55758R();
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C18952f fVar = (C18952f) getChildAt(i).getLayoutParams();
            int i2 = fVar.f48265d;
            boolean z2 = true;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.f48250c = fVar.f48262a;
            } else {
                i++;
            }
        }
        savedState.f48251d = this.f48214F0;
        savedState.f48252e = this.f48215G0;
        savedState.f48253f = this.f48216H0;
        savedState.f48254g = this.f48217I0;
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (mo55803r(r7) != 2) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.widget.d r0 = r6.f48244g
            r0.mo53486M(r7)
            androidx.customview.widget.d r0 = r6.f48245v
            r0.mo53486M(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005f
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006d
        L_0x001a:
            r6.mo55782i(r2)
            r6.f48218J0 = r1
            goto L_0x006d
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.customview.widget.d r3 = r6.f48244g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.mo53518v(r4, r5)
            if (r3 == 0) goto L_0x005a
            boolean r3 = r6.mo55742B(r3)
            if (r3 == 0) goto L_0x005a
            float r3 = r6.f48221M0
            float r0 = r0 - r3
            float r3 = r6.f48222N0
            float r7 = r7 - r3
            androidx.customview.widget.d r3 = r6.f48244g
            int r3 = r3.mo53478E()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005a
            android.view.View r7 = r6.mo55788o()
            if (r7 == 0) goto L_0x005a
            int r7 = r6.mo55803r(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005b
        L_0x005a:
            r1 = r2
        L_0x005b:
            r6.mo55782i(r1)
            goto L_0x006d
        L_0x005f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f48221M0 = r0
            r6.f48222N0 = r7
            r6.f48218J0 = r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void open() {
        mo55751K(C18306m0.f46960b);
    }

    /* renamed from: p */
    public View mo55801p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo55745E(childAt) && mo55747G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: q */
    public int mo55802q(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int Z = C18196h2.m82553Z(this);
        if (i == 3) {
            int i6 = this.f48214F0;
            if (i6 != 3) {
                return i6;
            }
            if (Z == 0) {
                i2 = this.f48216H0;
            } else {
                i2 = this.f48217I0;
            }
            if (i2 != 3) {
                return i2;
            }
            return 0;
        } else if (i == 5) {
            int i7 = this.f48215G0;
            if (i7 != 3) {
                return i7;
            }
            if (Z == 0) {
                i3 = this.f48217I0;
            } else {
                i3 = this.f48216H0;
            }
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 8388611) {
            int i8 = this.f48216H0;
            if (i8 != 3) {
                return i8;
            }
            if (Z == 0) {
                i4 = this.f48214F0;
            } else {
                i4 = this.f48215G0;
            }
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i9 = this.f48217I0;
            if (i9 != 3) {
                return i9;
            }
            if (Z == 0) {
                i5 = this.f48215G0;
            } else {
                i5 = this.f48214F0;
            }
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
    }

    /* renamed from: r */
    public int mo55803r(@C0359n0 View view) {
        if (mo55745E(view)) {
            return mo55802q(((C18952f) view.getLayoutParams()).f48262a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            mo55782i(true);
        }
    }

    public void requestLayout() {
        if (!this.f48249z) {
            super.requestLayout();
        }
    }

    @C0363p0
    /* renamed from: s */
    public CharSequence mo55806s(int i) {
        int d = C18306m0.m82991d(i, C18196h2.m82553Z(this));
        if (d == 3) {
            return this.f48226R0;
        }
        if (d == 5) {
            return this.f48227S0;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setChildInsets(Object obj, boolean z) {
        boolean z2;
        this.f48228T0 = obj;
        this.f48229U0 = z;
        if (z || getBackground() != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f48237b = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo55745E(childAt)) {
                C18196h2.m82519N1(childAt, this.f48237b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C18951e eVar) {
        C18951e eVar2 = this.f48219K0;
        if (eVar2 != null) {
            mo55755O(eVar2);
        }
        if (eVar != null) {
            mo55763a(eVar);
        }
        this.f48219K0 = eVar;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!f48210v1) {
            if ((i & C18306m0.f46960b) == 8388611) {
                this.f48230V0 = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.f48231W0 = drawable;
            } else if ((i & 3) == 3) {
                this.f48232X0 = drawable;
            } else if ((i & 5) == 5) {
                this.f48233Y0 = drawable;
            } else {
                return;
            }
            mo55758R();
            invalidate();
        }
    }

    public void setDrawerTitle(int i, @C0363p0 CharSequence charSequence) {
        int d = C18306m0.m82991d(i, C18196h2.m82553Z(this));
        if (d == 3) {
            this.f48226R0 = charSequence;
        } else if (d == 5) {
            this.f48227S0 = charSequence;
        }
    }

    public void setScrimColor(@C0354l int i) {
        this.f48241d = i;
        invalidate();
    }

    public void setStatusBarBackground(@C0363p0 Drawable drawable) {
        this.f48223O0 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@C0354l int i) {
        this.f48223O0 = new ColorDrawable(i);
        invalidate();
    }

    /* renamed from: t */
    public int mo55820t(View view) {
        return C18306m0.m82991d(((C18952f) view.getLayoutParams()).f48262a, C18196h2.m82553Z(this));
    }

    /* renamed from: u */
    public float mo55821u(View view) {
        return ((C18952f) view.getLayoutParams()).f48263b;
    }

    /* renamed from: v */
    public final MotionEvent mo55822v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f48238b1 == null) {
                this.f48238b1 = new Matrix();
            }
            matrix.invert(this.f48238b1);
            obtain.transform(this.f48238b1);
        }
        return obtain;
    }

    /* renamed from: y */
    public final boolean mo55823y() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C18952f) getChildAt(i).getLayoutParams()).f48264c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public final boolean mo55824z() {
        return mo55801p() != null;
    }

    public DrawerLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C18935a.C18936a.drawerLayoutStyle);
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48235a = new C18950d();
        this.f48241d = f48202n1;
        this.f48243f = new Paint();
        this.f48213E0 = true;
        this.f48214F0 = 3;
        this.f48215G0 = 3;
        this.f48216H0 = 3;
        this.f48217I0 = 3;
        this.f48230V0 = null;
        this.f48231W0 = null;
        this.f48232X0 = null;
        this.f48233Y0 = null;
        this.f48240c1 = new C18947a();
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f48239c = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C18954h hVar = new C18954h(3);
        this.f48246w = hVar;
        C18954h hVar2 = new C18954h(5);
        this.f48247x = hVar2;
        C18553d p = C18553d.m83925p(this, 1.0f, hVar);
        this.f48244g = p;
        p.mo53493T(1);
        p.mo53494U(f2);
        hVar.mo55837q(p);
        C18553d p2 = C18553d.m83925p(this, 1.0f, hVar2);
        this.f48245v = p2;
        p2.mo53493T(2);
        p2.mo53494U(f2);
        hVar2.mo55837q(p2);
        setFocusableInTouchMode(true);
        C18196h2.m82531R1(this, 1);
        C18196h2.m82474B1(this, new C18949c());
        setMotionEventSplittingEnabled(false);
        if (C18196h2.m82538U(this)) {
            setOnApplyWindowInsetsListener(new C18948b());
            setSystemUiVisibility(C33876b.f82189s);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f48193e1);
            try {
                this.f48223O0 = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C18935a.C18945j.DrawerLayout, i, 0);
        try {
            int i2 = C18935a.C18945j.DrawerLayout_elevation;
            if (obtainStyledAttributes2.hasValue(i2)) {
                this.f48237b = obtainStyledAttributes2.getDimension(i2, 0.0f);
            } else {
                this.f48237b = getResources().getDimension(C18935a.C18938c.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f48234Z0 = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setDrawerLockMode(int i, int i2) {
        View n;
        int d = C18306m0.m82991d(i2, C18196h2.m82553Z(this));
        if (i2 == 3) {
            this.f48214F0 = i;
        } else if (i2 == 5) {
            this.f48215G0 = i;
        } else if (i2 == 8388611) {
            this.f48216H0 = i;
        } else if (i2 == 8388613) {
            this.f48217I0 = i;
        }
        if (i != 0) {
            (d == 3 ? this.f48244g : this.f48245v).mo53501c();
        }
        if (i == 1) {
            View n2 = mo55787n(d);
            if (n2 != null) {
                mo55774f(n2);
            }
        } else if (i == 2 && (n = mo55787n(d)) != null) {
            mo55753M(n);
        }
    }

    public void setStatusBarBackground(int i) {
        this.f48223O0 = i != 0 ? C17318d.m79726i(getContext(), i) : null;
        invalidate();
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public static class C18952f extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        public static final int f48259e = 1;

        /* renamed from: f */
        public static final int f48260f = 2;

        /* renamed from: g */
        public static final int f48261g = 4;

        /* renamed from: a */
        public int f48262a;

        /* renamed from: b */
        public float f48263b;

        /* renamed from: c */
        public boolean f48264c;

        /* renamed from: d */
        public int f48265d;

        public C18952f(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f48262a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f48208t1);
            this.f48262a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C18952f(int i, int i2) {
            super(i, i2);
            this.f48262a = 0;
        }

        public C18952f(int i, int i2, int i3) {
            this(i, i2);
            this.f48262a = i3;
        }

        public C18952f(@C0359n0 C18952f fVar) {
            super(fVar);
            this.f48262a = 0;
            this.f48262a = fVar.f48262a;
        }

        public C18952f(@C0359n0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f48262a = 0;
        }

        public C18952f(@C0359n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f48262a = 0;
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C18952f(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C18946a();

        /* renamed from: c */
        public int f48250c = 0;

        /* renamed from: d */
        public int f48251d;

        /* renamed from: e */
        public int f48252e;

        /* renamed from: f */
        public int f48253f;

        /* renamed from: g */
        public int f48254g;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        public class C18946a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f48250c = parcel.readInt();
            this.f48251d = parcel.readInt();
            this.f48252e = parcel.readInt();
            this.f48253f = parcel.readInt();
            this.f48254g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f48250c);
            parcel.writeInt(this.f48251d);
            parcel.writeInt(this.f48252e);
            parcel.writeInt(this.f48253f);
            parcel.writeInt(this.f48254g);
        }

        public SavedState(@C0359n0 Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setDrawerShadow(@C0375v int i, int i2) {
        setDrawerShadow(C17318d.m79726i(getContext(), i), i2);
    }

    public void setDrawerLockMode(int i, @C0359n0 View view) {
        if (mo55745E(view)) {
            setDrawerLockMode(i, ((C18952f) view.getLayoutParams()).f48262a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }
}
