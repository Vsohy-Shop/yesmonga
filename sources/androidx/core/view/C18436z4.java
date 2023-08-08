package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C17616m0;
import androidx.core.util.C17992m;
import androidx.core.util.C18001r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: androidx.core.view.z4 */
public class C18436z4 {

    /* renamed from: b */
    public static final String f47102b = "WindowInsetsCompat";
    @C0359n0

    /* renamed from: c */
    public static final C18436z4 f47103c;

    /* renamed from: a */
    public final C18448l f47104a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    @C0376v0(21)
    /* renamed from: androidx.core.view.z4$a */
    public static class C18437a {

        /* renamed from: a */
        public static Field f47105a;

        /* renamed from: b */
        public static Field f47106b;

        /* renamed from: c */
        public static Field f47107c;

        /* renamed from: d */
        public static boolean f47108d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f47105a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f47106b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f47107c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets from AttachInfo ");
                sb.append(e.getMessage());
            }
        }

        @C0363p0
        /* renamed from: a */
        public static C18436z4 m83412a(@C0359n0 View view) {
            if (f47108d && view.isAttachedToWindow()) {
                try {
                    Object obj = f47105a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f47106b.get(obj);
                        Rect rect2 = (Rect) f47107c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            C18436z4 a = new C18438b().mo53162f(C17616m0.m80698e(rect)).mo53164h(C17616m0.m80698e(rect2)).mo53157a();
                            a.mo53127H(a);
                            a.mo53133d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get insets from AttachInfo. ");
                    sb.append(e.getMessage());
                }
            }
            return null;
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.view.z4$e */
    public static class C18441e extends C18440d {
        public C18441e() {
        }

        /* renamed from: d */
        public void mo53174d(int i, @C0359n0 C17616m0 m0Var) {
            WindowInsets.Builder unused = this.f47116c.setInsets(C18451n.m83513a(i), m0Var.mo52063h());
        }

        /* renamed from: e */
        public void mo53175e(int i, @C0359n0 C17616m0 m0Var) {
            WindowInsets.Builder unused = this.f47116c.setInsetsIgnoringVisibility(C18451n.m83513a(i), m0Var.mo52063h());
        }

        /* renamed from: k */
        public void mo53176k(int i, boolean z) {
            WindowInsets.Builder unused = this.f47116c.setVisible(C18451n.m83513a(i), z);
        }

        public C18441e(@C0359n0 C18436z4 z4Var) {
            super(z4Var);
        }
    }

    /* renamed from: androidx.core.view.z4$f */
    public static class C18442f {

        /* renamed from: a */
        public final C18436z4 f47117a;

        /* renamed from: b */
        public C17616m0[] f47118b;

        public C18442f() {
            this(new C18436z4((C18436z4) null));
        }

        /* renamed from: a */
        public final void mo53177a() {
            C17616m0[] m0VarArr = this.f47118b;
            if (m0VarArr != null) {
                C17616m0 m0Var = m0VarArr[C18449m.m83506e(1)];
                C17616m0 m0Var2 = this.f47118b[C18449m.m83506e(2)];
                if (m0Var2 == null) {
                    m0Var2 = this.f47117a.mo53136f(2);
                }
                if (m0Var == null) {
                    m0Var = this.f47117a.mo53136f(1);
                }
                mo53169i(C17616m0.m80695b(m0Var, m0Var2));
                C17616m0 m0Var3 = this.f47118b[C18449m.m83506e(16)];
                if (m0Var3 != null) {
                    mo53172h(m0Var3);
                }
                C17616m0 m0Var4 = this.f47118b[C18449m.m83506e(32)];
                if (m0Var4 != null) {
                    mo53171f(m0Var4);
                }
                C17616m0 m0Var5 = this.f47118b[C18449m.m83506e(64)];
                if (m0Var5 != null) {
                    mo53173j(m0Var5);
                }
            }
        }

        @C0359n0
        /* renamed from: b */
        public C18436z4 mo53167b() {
            mo53177a();
            return this.f47117a;
        }

        /* renamed from: c */
        public void mo53170c(@C0363p0 C18140d0 d0Var) {
        }

        /* renamed from: d */
        public void mo53174d(int i, @C0359n0 C17616m0 m0Var) {
            if (this.f47118b == null) {
                this.f47118b = new C17616m0[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f47118b[C18449m.m83506e(i2)] = m0Var;
                }
            }
        }

        /* renamed from: e */
        public void mo53175e(int i, @C0359n0 C17616m0 m0Var) {
            if (i == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        /* renamed from: f */
        public void mo53171f(@C0359n0 C17616m0 m0Var) {
        }

        /* renamed from: g */
        public void mo53168g(@C0359n0 C17616m0 m0Var) {
        }

        /* renamed from: h */
        public void mo53172h(@C0359n0 C17616m0 m0Var) {
        }

        /* renamed from: i */
        public void mo53169i(@C0359n0 C17616m0 m0Var) {
        }

        /* renamed from: j */
        public void mo53173j(@C0359n0 C17616m0 m0Var) {
        }

        /* renamed from: k */
        public void mo53176k(int i, boolean z) {
        }

        public C18442f(@C0359n0 C18436z4 z4Var) {
            this.f47117a = z4Var;
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.view.z4$i */
    public static class C18445i extends C18444h {
        public C18445i(@C0359n0 C18436z4 z4Var, @C0359n0 WindowInsets windowInsets) {
            super(z4Var, windowInsets);
        }

        @C0359n0
        /* renamed from: a */
        public C18436z4 mo53197a() {
            return C18436z4.m83374K(this.f47124c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18445i)) {
                return false;
            }
            C18445i iVar = (C18445i) obj;
            if (!Objects.equals(this.f47124c, iVar.f47124c) || !Objects.equals(this.f47128g, iVar.f47128g)) {
                return false;
            }
            return true;
        }

        @C0363p0
        /* renamed from: f */
        public C18140d0 mo53198f() {
            return C18140d0.m82312i(this.f47124c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f47124c.hashCode();
        }

        public C18445i(@C0359n0 C18436z4 z4Var, @C0359n0 C18445i iVar) {
            super(z4Var, (C18444h) iVar);
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.view.z4$k */
    public static class C18447k extends C18446j {
        @C0359n0

        /* renamed from: q */
        public static final C18436z4 f47133q = C18436z4.m83374K(WindowInsets.CONSUMED);

        public C18447k(@C0359n0 C18436z4 z4Var, @C0359n0 WindowInsets windowInsets) {
            super(z4Var, windowInsets);
        }

        /* renamed from: d */
        public final void mo53178d(@C0359n0 View view) {
        }

        @C0359n0
        /* renamed from: g */
        public C17616m0 mo53181g(int i) {
            return C17616m0.m80700g(this.f47124c.getInsets(C18451n.m83513a(i)));
        }

        @C0359n0
        /* renamed from: h */
        public C17616m0 mo53182h(int i) {
            return C17616m0.m80700g(this.f47124c.getInsetsIgnoringVisibility(C18451n.m83513a(i)));
        }

        /* renamed from: q */
        public boolean mo53186q(int i) {
            return this.f47124c.isVisible(C18451n.m83513a(i));
        }

        public C18447k(@C0359n0 C18436z4 z4Var, @C0359n0 C18447k kVar) {
            super(z4Var, (C18446j) kVar);
        }
    }

    /* renamed from: androidx.core.view.z4$l */
    public static class C18448l {
        @C0359n0

        /* renamed from: b */
        public static final C18436z4 f47134b = new C18438b().mo53157a().mo53130a().mo53131b().mo53132c();

        /* renamed from: a */
        public final C18436z4 f47135a;

        public C18448l(@C0359n0 C18436z4 z4Var) {
            this.f47135a = z4Var;
        }

        @C0359n0
        /* renamed from: a */
        public C18436z4 mo53197a() {
            return this.f47135a;
        }

        @C0359n0
        /* renamed from: b */
        public C18436z4 mo53192b() {
            return this.f47135a;
        }

        @C0359n0
        /* renamed from: c */
        public C18436z4 mo53193c() {
            return this.f47135a;
        }

        /* renamed from: d */
        public void mo53178d(@C0359n0 View view) {
        }

        /* renamed from: e */
        public void mo53179e(@C0359n0 C18436z4 z4Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18448l)) {
                return false;
            }
            C18448l lVar = (C18448l) obj;
            if (mo53185p() != lVar.mo53185p() || mo53195o() != lVar.mo53195o() || !C17992m.m81740a(mo53183l(), lVar.mo53183l()) || !C17992m.m81740a(mo53194j(), lVar.mo53194j()) || !C17992m.m81740a(mo53198f(), lVar.mo53198f())) {
                return false;
            }
            return true;
        }

        @C0363p0
        /* renamed from: f */
        public C18140d0 mo53198f() {
            return null;
        }

        @C0359n0
        /* renamed from: g */
        public C17616m0 mo53181g(int i) {
            return C17616m0.f45994e;
        }

        @C0359n0
        /* renamed from: h */
        public C17616m0 mo53182h(int i) {
            if ((i & 8) == 0) {
                return C17616m0.f45994e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return C17992m.m81741b(Boolean.valueOf(mo53185p()), Boolean.valueOf(mo53195o()), mo53183l(), mo53194j(), mo53198f());
        }

        @C0359n0
        /* renamed from: i */
        public C17616m0 mo53200i() {
            return mo53183l();
        }

        @C0359n0
        /* renamed from: j */
        public C17616m0 mo53194j() {
            return C17616m0.f45994e;
        }

        @C0359n0
        /* renamed from: k */
        public C17616m0 mo53201k() {
            return mo53183l();
        }

        @C0359n0
        /* renamed from: l */
        public C17616m0 mo53183l() {
            return C17616m0.f45994e;
        }

        @C0359n0
        /* renamed from: m */
        public C17616m0 mo53202m() {
            return mo53183l();
        }

        @C0359n0
        /* renamed from: n */
        public C18436z4 mo53184n(int i, int i2, int i3, int i4) {
            return f47134b;
        }

        /* renamed from: o */
        public boolean mo53195o() {
            return false;
        }

        /* renamed from: p */
        public boolean mo53185p() {
            return false;
        }

        /* renamed from: q */
        public boolean mo53186q(int i) {
            return true;
        }

        /* renamed from: r */
        public void mo53187r(C17616m0[] m0VarArr) {
        }

        /* renamed from: s */
        public void mo53188s(@C0359n0 C17616m0 m0Var) {
        }

        /* renamed from: t */
        public void mo53189t(@C0363p0 C18436z4 z4Var) {
        }

        /* renamed from: u */
        public void mo53196u(C17616m0 m0Var) {
        }
    }

    /* renamed from: androidx.core.view.z4$m */
    public static final class C18449m {

        /* renamed from: a */
        public static final int f47136a = 1;

        /* renamed from: b */
        public static final int f47137b = 1;

        /* renamed from: c */
        public static final int f47138c = 2;

        /* renamed from: d */
        public static final int f47139d = 4;

        /* renamed from: e */
        public static final int f47140e = 8;

        /* renamed from: f */
        public static final int f47141f = 16;

        /* renamed from: g */
        public static final int f47142g = 32;

        /* renamed from: h */
        public static final int f47143h = 64;

        /* renamed from: i */
        public static final int f47144i = 128;

        /* renamed from: j */
        public static final int f47145j = 256;

        /* renamed from: k */
        public static final int f47146k = 9;

        /* renamed from: l */
        public static final int f47147l = 256;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.core.view.z4$m$a */
        public @interface C18450a {
        }

        @SuppressLint({"WrongConstant"})
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: a */
        public static int m83502a() {
            return -1;
        }

        /* renamed from: b */
        public static int m83503b() {
            return 4;
        }

        /* renamed from: c */
        public static int m83504c() {
            return 128;
        }

        /* renamed from: d */
        public static int m83505d() {
            return 8;
        }

        /* renamed from: e */
        public static int m83506e(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        /* renamed from: f */
        public static int m83507f() {
            return 32;
        }

        /* renamed from: g */
        public static int m83508g() {
            return 2;
        }

        /* renamed from: h */
        public static int m83509h() {
            return 1;
        }

        /* renamed from: i */
        public static int m83510i() {
            return 7;
        }

        /* renamed from: j */
        public static int m83511j() {
            return 16;
        }

        /* renamed from: k */
        public static int m83512k() {
            return 64;
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.view.z4$n */
    public static final class C18451n {
        private C18451n() {
        }

        /* renamed from: a */
        public static int m83513a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f47103c = C18447k.f47133q;
        } else {
            f47103c = C18448l.f47134b;
        }
    }

    @C0376v0(20)
    public C18436z4(@C0359n0 WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f47104a = new C18447k(this, windowInsets);
        } else if (i >= 29) {
            this.f47104a = new C18446j(this, windowInsets);
        } else if (i >= 28) {
            this.f47104a = new C18445i(this, windowInsets);
        } else {
            this.f47104a = new C18444h(this, windowInsets);
        }
    }

    @C0359n0
    @C0376v0(20)
    /* renamed from: K */
    public static C18436z4 m83374K(@C0359n0 WindowInsets windowInsets) {
        return m83375L(windowInsets, (View) null);
    }

    @C0359n0
    @C0376v0(20)
    /* renamed from: L */
    public static C18436z4 m83375L(@C0359n0 WindowInsets windowInsets, @C0363p0 View view) {
        C18436z4 z4Var = new C18436z4((WindowInsets) C18001r.m81775l(windowInsets));
        if (view != null && C18196h2.m82521O0(view)) {
            z4Var.mo53127H(C18196h2.m82613o0(view));
            z4Var.mo53133d(view.getRootView());
        }
        return z4Var;
    }

    /* renamed from: z */
    public static C17616m0 m83376z(@C0359n0 C17616m0 m0Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, m0Var.f45995a - i);
        int max2 = Math.max(0, m0Var.f45996b - i2);
        int max3 = Math.max(0, m0Var.f45997c - i3);
        int max4 = Math.max(0, m0Var.f45998d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return m0Var;
        }
        return C17616m0.m80697d(max, max2, max3, max4);
    }

    /* renamed from: A */
    public boolean mo53120A() {
        return this.f47104a.mo53195o();
    }

    /* renamed from: B */
    public boolean mo53121B() {
        return this.f47104a.mo53185p();
    }

    /* renamed from: C */
    public boolean mo53122C(int i) {
        return this.f47104a.mo53186q(i);
    }

    @C0359n0
    @Deprecated
    /* renamed from: D */
    public C18436z4 mo53123D(int i, int i2, int i3, int i4) {
        return new C18438b(this).mo53164h(C17616m0.m80697d(i, i2, i3, i4)).mo53157a();
    }

    @C0359n0
    @Deprecated
    /* renamed from: E */
    public C18436z4 mo53124E(@C0359n0 Rect rect) {
        return new C18438b(this).mo53164h(C17616m0.m80698e(rect)).mo53157a();
    }

    /* renamed from: F */
    public void mo53125F(C17616m0[] m0VarArr) {
        this.f47104a.mo53187r(m0VarArr);
    }

    /* renamed from: G */
    public void mo53126G(@C0359n0 C17616m0 m0Var) {
        this.f47104a.mo53188s(m0Var);
    }

    /* renamed from: H */
    public void mo53127H(@C0363p0 C18436z4 z4Var) {
        this.f47104a.mo53189t(z4Var);
    }

    /* renamed from: I */
    public void mo53128I(@C0363p0 C17616m0 m0Var) {
        this.f47104a.mo53196u(m0Var);
    }

    @C0363p0
    @C0376v0(20)
    /* renamed from: J */
    public WindowInsets mo53129J() {
        C18448l lVar = this.f47104a;
        if (lVar instanceof C18443g) {
            return ((C18443g) lVar).f47124c;
        }
        return null;
    }

    @C0359n0
    @Deprecated
    /* renamed from: a */
    public C18436z4 mo53130a() {
        return this.f47104a.mo53197a();
    }

    @C0359n0
    @Deprecated
    /* renamed from: b */
    public C18436z4 mo53131b() {
        return this.f47104a.mo53192b();
    }

    @C0359n0
    @Deprecated
    /* renamed from: c */
    public C18436z4 mo53132c() {
        return this.f47104a.mo53193c();
    }

    /* renamed from: d */
    public void mo53133d(@C0359n0 View view) {
        this.f47104a.mo53178d(view);
    }

    @C0363p0
    /* renamed from: e */
    public C18140d0 mo53134e() {
        return this.f47104a.mo53198f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18436z4)) {
            return false;
        }
        return C17992m.m81740a(this.f47104a, ((C18436z4) obj).f47104a);
    }

    @C0359n0
    /* renamed from: f */
    public C17616m0 mo53136f(int i) {
        return this.f47104a.mo53181g(i);
    }

    @C0359n0
    /* renamed from: g */
    public C17616m0 mo53137g(int i) {
        return this.f47104a.mo53182h(i);
    }

    @C0359n0
    @Deprecated
    /* renamed from: h */
    public C17616m0 mo53138h() {
        return this.f47104a.mo53200i();
    }

    public int hashCode() {
        C18448l lVar = this.f47104a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo53140i() {
        return this.f47104a.mo53194j().f45998d;
    }

    @Deprecated
    /* renamed from: j */
    public int mo53141j() {
        return this.f47104a.mo53194j().f45995a;
    }

    @Deprecated
    /* renamed from: k */
    public int mo53142k() {
        return this.f47104a.mo53194j().f45997c;
    }

    @Deprecated
    /* renamed from: l */
    public int mo53143l() {
        return this.f47104a.mo53194j().f45996b;
    }

    @C0359n0
    @Deprecated
    /* renamed from: m */
    public C17616m0 mo53144m() {
        return this.f47104a.mo53194j();
    }

    @C0359n0
    @Deprecated
    /* renamed from: n */
    public C17616m0 mo53145n() {
        return this.f47104a.mo53201k();
    }

    @Deprecated
    /* renamed from: o */
    public int mo53146o() {
        return this.f47104a.mo53183l().f45998d;
    }

    @Deprecated
    /* renamed from: p */
    public int mo53147p() {
        return this.f47104a.mo53183l().f45995a;
    }

    @Deprecated
    /* renamed from: q */
    public int mo53148q() {
        return this.f47104a.mo53183l().f45997c;
    }

    @Deprecated
    /* renamed from: r */
    public int mo53149r() {
        return this.f47104a.mo53183l().f45996b;
    }

    @C0359n0
    @Deprecated
    /* renamed from: s */
    public C17616m0 mo53150s() {
        return this.f47104a.mo53183l();
    }

    @C0359n0
    @Deprecated
    /* renamed from: t */
    public C17616m0 mo53151t() {
        return this.f47104a.mo53202m();
    }

    /* renamed from: u */
    public boolean mo53152u() {
        C17616m0 f = mo53136f(C18449m.m83502a());
        C17616m0 m0Var = C17616m0.f45994e;
        if (!f.equals(m0Var) || !mo53137g(C18449m.m83502a() ^ C18449m.m83505d()).equals(m0Var) || mo53134e() != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: v */
    public boolean mo53153v() {
        return !this.f47104a.mo53194j().equals(C17616m0.f45994e);
    }

    @Deprecated
    /* renamed from: w */
    public boolean mo53154w() {
        return !this.f47104a.mo53183l().equals(C17616m0.f45994e);
    }

    @C0359n0
    /* renamed from: x */
    public C18436z4 mo53155x(@C0337f0(from = 0) int i, @C0337f0(from = 0) int i2, @C0337f0(from = 0) int i3, @C0337f0(from = 0) int i4) {
        return this.f47104a.mo53184n(i, i2, i3, i4);
    }

    @C0359n0
    /* renamed from: y */
    public C18436z4 mo53156y(@C0359n0 C17616m0 m0Var) {
        return mo53155x(m0Var.f45995a, m0Var.f45996b, m0Var.f45997c, m0Var.f45998d);
    }

    @C0376v0(api = 20)
    /* renamed from: androidx.core.view.z4$c */
    public static class C18439c extends C18442f {

        /* renamed from: e */
        public static Field f47110e = null;

        /* renamed from: f */
        public static boolean f47111f = false;

        /* renamed from: g */
        public static Constructor<WindowInsets> f47112g = null;

        /* renamed from: h */
        public static boolean f47113h = false;

        /* renamed from: c */
        public WindowInsets f47114c;

        /* renamed from: d */
        public C17616m0 f47115d;

        public C18439c() {
            this.f47114c = m83423l();
        }

        @C0363p0
        /* renamed from: l */
        private static WindowInsets m83423l() {
            Class<WindowInsets> cls = WindowInsets.class;
            if (!f47111f) {
                try {
                    f47110e = cls.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f47111f = true;
            }
            Field field = f47110e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f47113h) {
                try {
                    f47112g = cls.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException unused3) {
                }
                f47113h = true;
            }
            Constructor<WindowInsets> constructor = f47112g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @C0359n0
        /* renamed from: b */
        public C18436z4 mo53167b() {
            mo53177a();
            C18436z4 K = C18436z4.m83374K(this.f47114c);
            K.mo53125F(this.f47118b);
            K.mo53128I(this.f47115d);
            return K;
        }

        /* renamed from: g */
        public void mo53168g(@C0363p0 C17616m0 m0Var) {
            this.f47115d = m0Var;
        }

        /* renamed from: i */
        public void mo53169i(@C0359n0 C17616m0 m0Var) {
            WindowInsets windowInsets = this.f47114c;
            if (windowInsets != null) {
                this.f47114c = windowInsets.replaceSystemWindowInsets(m0Var.f45995a, m0Var.f45996b, m0Var.f45997c, m0Var.f45998d);
            }
        }

        public C18439c(@C0359n0 C18436z4 z4Var) {
            super(z4Var);
            this.f47114c = z4Var.mo53129J();
        }
    }

    @C0376v0(api = 29)
    /* renamed from: androidx.core.view.z4$d */
    public static class C18440d extends C18442f {

        /* renamed from: c */
        public final WindowInsets.Builder f47116c;

        public C18440d() {
            C18272j5.m82898a();
            this.f47116c = C18229h5.m82822a();
        }

        @C0359n0
        /* renamed from: b */
        public C18436z4 mo53167b() {
            mo53177a();
            C18436z4 K = C18436z4.m83374K(this.f47116c.build());
            K.mo53125F(this.f47118b);
            return K;
        }

        /* renamed from: c */
        public void mo53170c(@C0363p0 C18140d0 d0Var) {
            WindowInsets.Builder unused = this.f47116c.setDisplayCutout(d0Var != null ? d0Var.mo52802h() : null);
        }

        /* renamed from: f */
        public void mo53171f(@C0359n0 C17616m0 m0Var) {
            WindowInsets.Builder unused = this.f47116c.setMandatorySystemGestureInsets(m0Var.mo52063h());
        }

        /* renamed from: g */
        public void mo53168g(@C0359n0 C17616m0 m0Var) {
            WindowInsets.Builder unused = this.f47116c.setStableInsets(m0Var.mo52063h());
        }

        /* renamed from: h */
        public void mo53172h(@C0359n0 C17616m0 m0Var) {
            WindowInsets.Builder unused = this.f47116c.setSystemGestureInsets(m0Var.mo52063h());
        }

        /* renamed from: i */
        public void mo53169i(@C0359n0 C17616m0 m0Var) {
            WindowInsets.Builder unused = this.f47116c.setSystemWindowInsets(m0Var.mo52063h());
        }

        /* renamed from: j */
        public void mo53173j(@C0359n0 C17616m0 m0Var) {
            WindowInsets.Builder unused = this.f47116c.setTappableElementInsets(m0Var.mo52063h());
        }

        public C18440d(@C0359n0 C18436z4 z4Var) {
            super(z4Var);
            WindowInsets.Builder builder;
            WindowInsets J = z4Var.mo53129J();
            if (J != null) {
                C18272j5.m82898a();
                builder = C18237i5.m82829a(J);
            } else {
                C18272j5.m82898a();
                builder = C18229h5.m82822a();
            }
            this.f47116c = builder;
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.view.z4$h */
    public static class C18444h extends C18443g {

        /* renamed from: m */
        public C17616m0 f47129m = null;

        public C18444h(@C0359n0 C18436z4 z4Var, @C0359n0 WindowInsets windowInsets) {
            super(z4Var, windowInsets);
        }

        @C0359n0
        /* renamed from: b */
        public C18436z4 mo53192b() {
            return C18436z4.m83374K(this.f47124c.consumeStableInsets());
        }

        @C0359n0
        /* renamed from: c */
        public C18436z4 mo53193c() {
            return C18436z4.m83374K(this.f47124c.consumeSystemWindowInsets());
        }

        @C0359n0
        /* renamed from: j */
        public final C17616m0 mo53194j() {
            if (this.f47129m == null) {
                this.f47129m = C17616m0.m80697d(this.f47124c.getStableInsetLeft(), this.f47124c.getStableInsetTop(), this.f47124c.getStableInsetRight(), this.f47124c.getStableInsetBottom());
            }
            return this.f47129m;
        }

        /* renamed from: o */
        public boolean mo53195o() {
            return this.f47124c.isConsumed();
        }

        /* renamed from: u */
        public void mo53196u(@C0363p0 C17616m0 m0Var) {
            this.f47129m = m0Var;
        }

        public C18444h(@C0359n0 C18436z4 z4Var, @C0359n0 C18444h hVar) {
            super(z4Var, (C18443g) hVar);
            this.f47129m = hVar.f47129m;
        }
    }

    @C0376v0(20)
    /* renamed from: androidx.core.view.z4$g */
    public static class C18443g extends C18448l {

        /* renamed from: h */
        public static boolean f47119h = false;

        /* renamed from: i */
        public static Method f47120i;

        /* renamed from: j */
        public static Class<?> f47121j;

        /* renamed from: k */
        public static Field f47122k;

        /* renamed from: l */
        public static Field f47123l;
        @C0359n0

        /* renamed from: c */
        public final WindowInsets f47124c;

        /* renamed from: d */
        public C17616m0[] f47125d;

        /* renamed from: e */
        public C17616m0 f47126e;

        /* renamed from: f */
        public C18436z4 f47127f;

        /* renamed from: g */
        public C17616m0 f47128g;

        public C18443g(@C0359n0 C18436z4 z4Var, @C0359n0 WindowInsets windowInsets) {
            super(z4Var);
            this.f47126e = null;
            this.f47124c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: A */
        private static void m83448A() {
            try {
                f47120i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f47121j = cls;
                f47122k = cls.getDeclaredField("mVisibleInsets");
                f47123l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f47122k.setAccessible(true);
                f47123l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets. (Reflection error). ");
                sb.append(e.getMessage());
            }
            f47119h = true;
        }

        @SuppressLint({"WrongConstant"})
        @C0359n0
        /* renamed from: v */
        private C17616m0 m83449v(int i, boolean z) {
            C17616m0 m0Var = C17616m0.f45994e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m0Var = C17616m0.m80695b(m0Var, mo53190w(i2, z));
                }
            }
            return m0Var;
        }

        /* renamed from: x */
        private C17616m0 m83450x() {
            C18436z4 z4Var = this.f47127f;
            if (z4Var != null) {
                return z4Var.mo53144m();
            }
            return C17616m0.f45994e;
        }

        @C0363p0
        /* renamed from: y */
        private C17616m0 m83451y(@C0359n0 View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f47119h) {
                    m83448A();
                }
                Method method = f47120i;
                if (!(method == null || f47121j == null || f47122k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f47122k.get(f47123l.get(invoke));
                        if (rect != null) {
                            return C17616m0.m80698e(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to get visible insets. (Reflection error). ");
                        sb.append(e.getMessage());
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        /* renamed from: d */
        public void mo53178d(@C0359n0 View view) {
            C17616m0 y = m83451y(view);
            if (y == null) {
                y = C17616m0.f45994e;
            }
            mo53188s(y);
        }

        /* renamed from: e */
        public void mo53179e(@C0359n0 C18436z4 z4Var) {
            z4Var.mo53127H(this.f47127f);
            z4Var.mo53126G(this.f47128g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f47128g, ((C18443g) obj).f47128g);
        }

        @C0359n0
        /* renamed from: g */
        public C17616m0 mo53181g(int i) {
            return m83449v(i, false);
        }

        @C0359n0
        /* renamed from: h */
        public C17616m0 mo53182h(int i) {
            return m83449v(i, true);
        }

        @C0359n0
        /* renamed from: l */
        public final C17616m0 mo53183l() {
            if (this.f47126e == null) {
                this.f47126e = C17616m0.m80697d(this.f47124c.getSystemWindowInsetLeft(), this.f47124c.getSystemWindowInsetTop(), this.f47124c.getSystemWindowInsetRight(), this.f47124c.getSystemWindowInsetBottom());
            }
            return this.f47126e;
        }

        @C0359n0
        /* renamed from: n */
        public C18436z4 mo53184n(int i, int i2, int i3, int i4) {
            C18438b bVar = new C18438b(C18436z4.m83374K(this.f47124c));
            bVar.mo53164h(C18436z4.m83376z(mo53183l(), i, i2, i3, i4));
            bVar.mo53162f(C18436z4.m83376z(mo53194j(), i, i2, i3, i4));
            return bVar.mo53157a();
        }

        /* renamed from: p */
        public boolean mo53185p() {
            return this.f47124c.isRound();
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: q */
        public boolean mo53186q(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !mo53191z(i2)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: r */
        public void mo53187r(C17616m0[] m0VarArr) {
            this.f47125d = m0VarArr;
        }

        /* renamed from: s */
        public void mo53188s(@C0359n0 C17616m0 m0Var) {
            this.f47128g = m0Var;
        }

        /* renamed from: t */
        public void mo53189t(@C0363p0 C18436z4 z4Var) {
            this.f47127f = z4Var;
        }

        @C0359n0
        /* renamed from: w */
        public C17616m0 mo53190w(int i, boolean z) {
            int i2;
            C18140d0 d0Var;
            if (i != 1) {
                C17616m0 m0Var = null;
                if (i != 2) {
                    if (i == 8) {
                        C17616m0[] m0VarArr = this.f47125d;
                        if (m0VarArr != null) {
                            m0Var = m0VarArr[C18449m.m83506e(8)];
                        }
                        if (m0Var != null) {
                            return m0Var;
                        }
                        C17616m0 l = mo53183l();
                        C17616m0 x = m83450x();
                        int i3 = l.f45998d;
                        if (i3 > x.f45998d) {
                            return C17616m0.m80697d(0, 0, 0, i3);
                        }
                        C17616m0 m0Var2 = this.f47128g;
                        if (m0Var2 == null || m0Var2.equals(C17616m0.f45994e) || (i2 = this.f47128g.f45998d) <= x.f45998d) {
                            return C17616m0.f45994e;
                        }
                        return C17616m0.m80697d(0, 0, 0, i2);
                    } else if (i == 16) {
                        return mo53201k();
                    } else {
                        if (i == 32) {
                            return mo53200i();
                        }
                        if (i == 64) {
                            return mo53202m();
                        }
                        if (i != 128) {
                            return C17616m0.f45994e;
                        }
                        C18436z4 z4Var = this.f47127f;
                        if (z4Var != null) {
                            d0Var = z4Var.mo53134e();
                        } else {
                            d0Var = mo53198f();
                        }
                        if (d0Var != null) {
                            return C17616m0.m80697d(d0Var.mo52797d(), d0Var.mo52800f(), d0Var.mo52798e(), d0Var.mo52796c());
                        }
                        return C17616m0.f45994e;
                    }
                } else if (z) {
                    C17616m0 x2 = m83450x();
                    C17616m0 j = mo53194j();
                    return C17616m0.m80697d(Math.max(x2.f45995a, j.f45995a), 0, Math.max(x2.f45997c, j.f45997c), Math.max(x2.f45998d, j.f45998d));
                } else {
                    C17616m0 l2 = mo53183l();
                    C18436z4 z4Var2 = this.f47127f;
                    if (z4Var2 != null) {
                        m0Var = z4Var2.mo53144m();
                    }
                    int i4 = l2.f45998d;
                    if (m0Var != null) {
                        i4 = Math.min(i4, m0Var.f45998d);
                    }
                    return C17616m0.m80697d(l2.f45995a, 0, l2.f45997c, i4);
                }
            } else if (z) {
                return C17616m0.m80697d(0, Math.max(m83450x().f45996b, mo53183l().f45996b), 0, 0);
            } else {
                return C17616m0.m80697d(0, mo53183l().f45996b, 0, 0);
            }
        }

        /* renamed from: z */
        public boolean mo53191z(int i) {
            if (!(i == 1 || i == 2)) {
                if (i == 4) {
                    return false;
                }
                if (!(i == 8 || i == 128)) {
                    return true;
                }
            }
            return !mo53190w(i, false).equals(C17616m0.f45994e);
        }

        public C18443g(@C0359n0 C18436z4 z4Var, @C0359n0 C18443g gVar) {
            this(z4Var, new WindowInsets(gVar.f47124c));
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.core.view.z4$j */
    public static class C18446j extends C18445i {

        /* renamed from: n */
        public C17616m0 f47130n = null;

        /* renamed from: o */
        public C17616m0 f47131o = null;

        /* renamed from: p */
        public C17616m0 f47132p = null;

        public C18446j(@C0359n0 C18436z4 z4Var, @C0359n0 WindowInsets windowInsets) {
            super(z4Var, windowInsets);
        }

        @C0359n0
        /* renamed from: i */
        public C17616m0 mo53200i() {
            if (this.f47131o == null) {
                this.f47131o = C17616m0.m80700g(this.f47124c.getMandatorySystemGestureInsets());
            }
            return this.f47131o;
        }

        @C0359n0
        /* renamed from: k */
        public C17616m0 mo53201k() {
            if (this.f47130n == null) {
                this.f47130n = C17616m0.m80700g(this.f47124c.getSystemGestureInsets());
            }
            return this.f47130n;
        }

        @C0359n0
        /* renamed from: m */
        public C17616m0 mo53202m() {
            if (this.f47132p == null) {
                this.f47132p = C17616m0.m80700g(this.f47124c.getTappableElementInsets());
            }
            return this.f47132p;
        }

        @C0359n0
        /* renamed from: n */
        public C18436z4 mo53184n(int i, int i2, int i3, int i4) {
            return C18436z4.m83374K(this.f47124c.inset(i, i2, i3, i4));
        }

        /* renamed from: u */
        public void mo53196u(@C0363p0 C17616m0 m0Var) {
        }

        public C18446j(@C0359n0 C18436z4 z4Var, @C0359n0 C18446j jVar) {
            super(z4Var, (C18445i) jVar);
        }
    }

    /* renamed from: androidx.core.view.z4$b */
    public static final class C18438b {

        /* renamed from: a */
        public final C18442f f47109a;

        public C18438b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f47109a = new C18441e();
            } else if (i >= 29) {
                this.f47109a = new C18440d();
            } else {
                this.f47109a = new C18439c();
            }
        }

        @C0359n0
        /* renamed from: a */
        public C18436z4 mo53157a() {
            return this.f47109a.mo53167b();
        }

        @C0359n0
        /* renamed from: b */
        public C18438b mo53158b(@C0363p0 C18140d0 d0Var) {
            this.f47109a.mo53170c(d0Var);
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C18438b mo53159c(int i, @C0359n0 C17616m0 m0Var) {
            this.f47109a.mo53174d(i, m0Var);
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C18438b mo53160d(int i, @C0359n0 C17616m0 m0Var) {
            this.f47109a.mo53175e(i, m0Var);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: e */
        public C18438b mo53161e(@C0359n0 C17616m0 m0Var) {
            this.f47109a.mo53171f(m0Var);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: f */
        public C18438b mo53162f(@C0359n0 C17616m0 m0Var) {
            this.f47109a.mo53168g(m0Var);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: g */
        public C18438b mo53163g(@C0359n0 C17616m0 m0Var) {
            this.f47109a.mo53172h(m0Var);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: h */
        public C18438b mo53164h(@C0359n0 C17616m0 m0Var) {
            this.f47109a.mo53169i(m0Var);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: i */
        public C18438b mo53165i(@C0359n0 C17616m0 m0Var) {
            this.f47109a.mo53173j(m0Var);
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C18438b mo53166j(int i, boolean z) {
            this.f47109a.mo53176k(i, z);
            return this;
        }

        public C18438b(@C0359n0 C18436z4 z4Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f47109a = new C18441e(z4Var);
            } else if (i >= 29) {
                this.f47109a = new C18440d(z4Var);
            } else {
                this.f47109a = new C18439c(z4Var);
            }
        }
    }

    public C18436z4(@C0363p0 C18436z4 z4Var) {
        if (z4Var != null) {
            C18448l lVar = z4Var.f47104a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (lVar instanceof C18447k)) {
                this.f47104a = new C18447k(this, (C18447k) lVar);
            } else if (i >= 29 && (lVar instanceof C18446j)) {
                this.f47104a = new C18446j(this, (C18446j) lVar);
            } else if (i >= 28 && (lVar instanceof C18445i)) {
                this.f47104a = new C18445i(this, (C18445i) lVar);
            } else if (lVar instanceof C18444h) {
                this.f47104a = new C18444h(this, (C18444h) lVar);
            } else if (lVar instanceof C18443g) {
                this.f47104a = new C18443g(this, (C18443g) lVar);
            } else {
                this.f47104a = new C18448l(this);
            }
            lVar.mo53179e(this);
            return;
        }
        this.f47104a = new C18448l(this);
    }
}
