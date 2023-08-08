package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.app.C0441a;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.view.C0534a;
import androidx.appcompat.view.C0535b;
import androidx.appcompat.view.C0543g;
import androidx.appcompat.view.C0546h;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0582m;
import androidx.appcompat.view.menu.C0594s;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0707d0;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C18196h2;
import androidx.core.view.C18402w3;
import androidx.core.view.C18416x3;
import androidx.core.view.C18426y3;
import androidx.core.view.C18435z3;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19234h0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.app.d0 */
public class C0469d0 extends C0441a implements ActionBarOverlayLayout.C0601d {

    /* renamed from: N */
    public static final String f1174N = "WindowDecorActionBar";

    /* renamed from: O */
    public static final Interpolator f1175O = new AccelerateInterpolator();

    /* renamed from: P */
    public static final Interpolator f1176P = new DecelerateInterpolator();

    /* renamed from: Q */
    public static final int f1177Q = -1;

    /* renamed from: R */
    public static final long f1178R = 100;

    /* renamed from: S */
    public static final long f1179S = 200;

    /* renamed from: A */
    public boolean f1180A;

    /* renamed from: B */
    public int f1181B = 0;

    /* renamed from: C */
    public boolean f1182C = true;

    /* renamed from: D */
    public boolean f1183D;

    /* renamed from: E */
    public boolean f1184E;

    /* renamed from: F */
    public boolean f1185F;

    /* renamed from: G */
    public boolean f1186G = true;

    /* renamed from: H */
    public C0546h f1187H;

    /* renamed from: I */
    public boolean f1188I;

    /* renamed from: J */
    public boolean f1189J;

    /* renamed from: K */
    public final C18416x3 f1190K = new C0470a();

    /* renamed from: L */
    public final C18416x3 f1191L = new C0471b();

    /* renamed from: M */
    public final C18435z3 f1192M = new C0472c();

    /* renamed from: i */
    public Context f1193i;

    /* renamed from: j */
    public Context f1194j;

    /* renamed from: k */
    public Activity f1195k;

    /* renamed from: l */
    public ActionBarOverlayLayout f1196l;

    /* renamed from: m */
    public ActionBarContainer f1197m;

    /* renamed from: n */
    public C0707d0 f1198n;

    /* renamed from: o */
    public ActionBarContextView f1199o;

    /* renamed from: p */
    public View f1200p;

    /* renamed from: q */
    public ScrollingTabContainerView f1201q;

    /* renamed from: r */
    public ArrayList<C0474e> f1202r = new ArrayList<>();

    /* renamed from: s */
    public C0474e f1203s;

    /* renamed from: t */
    public int f1204t = -1;

    /* renamed from: u */
    public boolean f1205u;

    /* renamed from: v */
    public C0473d f1206v;

    /* renamed from: w */
    public C0535b f1207w;

    /* renamed from: x */
    public C0535b.C0536a f1208x;

    /* renamed from: y */
    public boolean f1209y;

    /* renamed from: z */
    public ArrayList<C0441a.C0445d> f1210z = new ArrayList<>();

    /* renamed from: androidx.appcompat.app.d0$a */
    public class C0470a extends C18426y3 {
        public C0470a() {
        }

        /* renamed from: b */
        public void mo1198b(View view) {
            View view2;
            C0469d0 d0Var = C0469d0.this;
            if (d0Var.f1182C && (view2 = d0Var.f1200p) != null) {
                view2.setTranslationY(0.0f);
                C0469d0.this.f1197m.setTranslationY(0.0f);
            }
            C0469d0.this.f1197m.setVisibility(8);
            C0469d0.this.f1197m.setTransitioning(false);
            C0469d0 d0Var2 = C0469d0.this;
            d0Var2.f1187H = null;
            d0Var2.mo1431H0();
            ActionBarOverlayLayout actionBarOverlayLayout = C0469d0.this.f1196l;
            if (actionBarOverlayLayout != null) {
                C18196h2.m82642v1(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.d0$b */
    public class C0471b extends C18426y3 {
        public C0471b() {
        }

        /* renamed from: b */
        public void mo1198b(View view) {
            C0469d0 d0Var = C0469d0.this;
            d0Var.f1187H = null;
            d0Var.f1197m.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.d0$c */
    public class C0472c implements C18435z3 {
        public C0472c() {
        }

        /* renamed from: a */
        public void mo1451a(View view) {
            ((View) C0469d0.this.f1197m.getParent()).invalidate();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.app.d0$d */
    public class C0473d extends C0535b implements C0568g.C0569a {

        /* renamed from: c */
        public final Context f1214c;

        /* renamed from: d */
        public final C0568g f1215d;

        /* renamed from: e */
        public C0535b.C0536a f1216e;

        /* renamed from: f */
        public WeakReference<View> f1217f;

        public C0473d(Context context, C0535b.C0536a aVar) {
            this.f1214c = context;
            this.f1216e = aVar;
            C0568g Z = new C0568g(context).mo2038Z(1);
            this.f1215d = Z;
            Z.mo2036X(this);
        }

        /* renamed from: a */
        public boolean mo1111a(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
            C0535b.C0536a aVar = this.f1216e;
            if (aVar != null) {
                return aVar.mo1211c(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo1114b(@C0359n0 C0568g gVar) {
            if (this.f1216e != null) {
                mo1458k();
                C0469d0.this.f1199o.mo2344o();
            }
        }

        /* renamed from: c */
        public void mo1452c() {
            C0469d0 d0Var = C0469d0.this;
            if (d0Var.f1206v == this) {
                if (!C0469d0.m2055F0(d0Var.f1183D, d0Var.f1184E, false)) {
                    C0469d0 d0Var2 = C0469d0.this;
                    d0Var2.f1207w = this;
                    d0Var2.f1208x = this.f1216e;
                } else {
                    this.f1216e.mo1209a(this);
                }
                this.f1216e = null;
                C0469d0.this.mo1429E0(false);
                C0469d0.this.f1199o.mo2350p();
                C0469d0 d0Var3 = C0469d0.this;
                d0Var3.f1196l.setHideOnContentScrollEnabled(d0Var3.f1189J);
                C0469d0.this.f1206v = null;
            }
        }

        /* renamed from: d */
        public View mo1453d() {
            WeakReference<View> weakReference = this.f1217f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo1454e() {
            return this.f1215d;
        }

        /* renamed from: f */
        public MenuInflater mo1455f() {
            return new C0543g(this.f1214c);
        }

        /* renamed from: g */
        public CharSequence mo1456g() {
            return C0469d0.this.f1199o.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo1457i() {
            return C0469d0.this.f1199o.getTitle();
        }

        /* renamed from: k */
        public void mo1458k() {
            if (C0469d0.this.f1206v == this) {
                this.f1215d.mo2080m0();
                try {
                    this.f1216e.mo1212d(this, this.f1215d);
                } finally {
                    this.f1215d.mo2078l0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo1459l() {
            return C0469d0.this.f1199o.mo2353s();
        }

        /* renamed from: n */
        public void mo1460n(View view) {
            C0469d0.this.f1199o.setCustomView(view);
            this.f1217f = new WeakReference<>(view);
        }

        /* renamed from: o */
        public void mo1461o(int i) {
            mo1462p(C0469d0.this.f1193i.getResources().getString(i));
        }

        /* renamed from: p */
        public void mo1462p(CharSequence charSequence) {
            C0469d0.this.f1199o.setSubtitle(charSequence);
        }

        /* renamed from: r */
        public void mo1463r(int i) {
            mo1464s(C0469d0.this.f1193i.getResources().getString(i));
        }

        /* renamed from: s */
        public void mo1464s(CharSequence charSequence) {
            C0469d0.this.f1199o.setTitle(charSequence);
        }

        /* renamed from: t */
        public void mo1465t(boolean z) {
            super.mo1465t(z);
            C0469d0.this.f1199o.setTitleOptional(z);
        }

        /* renamed from: u */
        public boolean mo1466u() {
            this.f1215d.mo2080m0();
            try {
                return this.f1216e.mo1210b(this, this.f1215d);
            } finally {
                this.f1215d.mo2078l0();
            }
        }

        /* renamed from: v */
        public void mo1467v(C0568g gVar, boolean z) {
        }

        /* renamed from: w */
        public void mo1468w(C0594s sVar) {
        }

        /* renamed from: x */
        public boolean mo1469x(C0594s sVar) {
            if (this.f1216e == null) {
                return false;
            }
            if (!sVar.hasVisibleItems()) {
                return true;
            }
            new C0582m(C0469d0.this.mo1240A(), sVar).mo2254l();
            return true;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.app.d0$e */
    public class C0474e extends C0441a.C0447f {

        /* renamed from: b */
        public C0441a.C0448g f1219b;

        /* renamed from: c */
        public Object f1220c;

        /* renamed from: d */
        public Drawable f1221d;

        /* renamed from: e */
        public CharSequence f1222e;

        /* renamed from: f */
        public CharSequence f1223f;

        /* renamed from: g */
        public int f1224g = -1;

        /* renamed from: h */
        public View f1225h;

        public C0474e() {
        }

        /* renamed from: a */
        public CharSequence mo1318a() {
            return this.f1223f;
        }

        /* renamed from: b */
        public View mo1319b() {
            return this.f1225h;
        }

        /* renamed from: c */
        public Drawable mo1320c() {
            return this.f1221d;
        }

        /* renamed from: d */
        public int mo1321d() {
            return this.f1224g;
        }

        /* renamed from: e */
        public Object mo1322e() {
            return this.f1220c;
        }

        /* renamed from: f */
        public CharSequence mo1323f() {
            return this.f1222e;
        }

        /* renamed from: g */
        public void mo1324g() {
            C0469d0.this.mo1262S(this);
        }

        /* renamed from: h */
        public C0441a.C0447f mo1325h(int i) {
            return mo1326i(C0469d0.this.f1193i.getResources().getText(i));
        }

        /* renamed from: i */
        public C0441a.C0447f mo1326i(CharSequence charSequence) {
            this.f1223f = charSequence;
            int i = this.f1224g;
            if (i >= 0) {
                C0469d0.this.f1201q.mo2894m(i);
            }
            return this;
        }

        /* renamed from: j */
        public C0441a.C0447f mo1327j(int i) {
            return mo1328k(LayoutInflater.from(C0469d0.this.mo1240A()).inflate(i, (ViewGroup) null));
        }

        /* renamed from: k */
        public C0441a.C0447f mo1328k(View view) {
            this.f1225h = view;
            int i = this.f1224g;
            if (i >= 0) {
                C0469d0.this.f1201q.mo2894m(i);
            }
            return this;
        }

        /* renamed from: l */
        public C0441a.C0447f mo1329l(int i) {
            return mo1330m(C0507a.m2346b(C0469d0.this.f1193i, i));
        }

        /* renamed from: m */
        public C0441a.C0447f mo1330m(Drawable drawable) {
            this.f1221d = drawable;
            int i = this.f1224g;
            if (i >= 0) {
                C0469d0.this.f1201q.mo2894m(i);
            }
            return this;
        }

        /* renamed from: n */
        public C0441a.C0447f mo1331n(C0441a.C0448g gVar) {
            this.f1219b = gVar;
            return this;
        }

        /* renamed from: o */
        public C0441a.C0447f mo1332o(Object obj) {
            this.f1220c = obj;
            return this;
        }

        /* renamed from: p */
        public C0441a.C0447f mo1333p(int i) {
            return mo1334q(C0469d0.this.f1193i.getResources().getText(i));
        }

        /* renamed from: q */
        public C0441a.C0447f mo1334q(CharSequence charSequence) {
            this.f1222e = charSequence;
            int i = this.f1224g;
            if (i >= 0) {
                C0469d0.this.f1201q.mo2894m(i);
            }
            return this;
        }

        /* renamed from: r */
        public C0441a.C0448g mo1470r() {
            return this.f1219b;
        }

        /* renamed from: s */
        public void mo1471s(int i) {
            this.f1224g = i;
        }
    }

    public C0469d0(Activity activity, boolean z) {
        this.f1195k = activity;
        View decorView = activity.getWindow().getDecorView();
        mo1440Q0(decorView);
        if (!z) {
            this.f1200p = decorView.findViewById(16908290);
        }
    }

    /* renamed from: F0 */
    public static boolean m2055F0(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: A */
    public Context mo1240A() {
        if (this.f1194j == null) {
            TypedValue typedValue = new TypedValue();
            this.f1193i.getTheme().resolveAttribute(C0387a.C0389b.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1194j = new ContextThemeWrapper(this.f1193i, i);
            } else {
                this.f1194j = this.f1193i;
            }
        }
        return this.f1194j;
    }

    /* renamed from: A0 */
    public void mo1241A0(CharSequence charSequence) {
        this.f1198n.setTitle(charSequence);
    }

    /* renamed from: B */
    public CharSequence mo1242B() {
        return this.f1198n.getTitle();
    }

    /* renamed from: B0 */
    public void mo1243B0(CharSequence charSequence) {
        this.f1198n.setWindowTitle(charSequence);
    }

    /* renamed from: C */
    public void mo1244C() {
        if (!this.f1183D) {
            this.f1183D = true;
            mo1444U0(false);
        }
    }

    /* renamed from: C0 */
    public void mo1245C0() {
        if (this.f1183D) {
            this.f1183D = false;
            mo1444U0(false);
        }
    }

    /* renamed from: D0 */
    public C0535b mo1247D0(C0535b.C0536a aVar) {
        C0473d dVar = this.f1206v;
        if (dVar != null) {
            dVar.mo1452c();
        }
        this.f1196l.setHideOnContentScrollEnabled(false);
        this.f1199o.mo2361t();
        C0473d dVar2 = new C0473d(this.f1199o.getContext(), aVar);
        if (!dVar2.mo1466u()) {
            return null;
        }
        this.f1206v = dVar2;
        dVar2.mo1458k();
        this.f1199o.mo2351q(dVar2);
        mo1429E0(true);
        return dVar2;
    }

    /* renamed from: E */
    public boolean mo1248E() {
        return this.f1196l.mo2430y();
    }

    /* renamed from: E0 */
    public void mo1429E0(boolean z) {
        C18402w3 w3Var;
        C18402w3 w3Var2;
        if (z) {
            mo1443T0();
        } else {
            mo1439P0();
        }
        if (mo1442S0()) {
            if (z) {
                w3Var = this.f1198n.mo3383q(4, 100);
                w3Var2 = this.f1199o.mo2343n(0, 200);
            } else {
                w3Var2 = this.f1198n.mo3383q(0, 200);
                w3Var = this.f1199o.mo2343n(8, 100);
            }
            C0546h hVar = new C0546h();
            hVar.mo1809d(w3Var, w3Var2);
            hVar.mo1813h();
        } else if (z) {
            this.f1198n.setVisibility(4);
            this.f1199o.setVisibility(0);
        } else {
            this.f1198n.setVisibility(0);
            this.f1199o.setVisibility(8);
        }
    }

    /* renamed from: F */
    public boolean mo1249F() {
        int r = mo1298r();
        if (!this.f1186G || (r != 0 && mo1300s() >= r)) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public boolean mo1250G() {
        C0707d0 d0Var = this.f1198n;
        return d0Var != null && d0Var.mo3377k();
    }

    /* renamed from: G0 */
    public final void mo1430G0() {
        if (this.f1203s != null) {
            mo1262S((C0441a.C0447f) null);
        }
        this.f1202r.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.f1201q;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.mo2892k();
        }
        this.f1204t = -1;
    }

    /* renamed from: H */
    public C0441a.C0447f mo1251H() {
        return new C0474e();
    }

    /* renamed from: H0 */
    public void mo1431H0() {
        C0535b.C0536a aVar = this.f1208x;
        if (aVar != null) {
            aVar.mo1209a(this.f1207w);
            this.f1207w = null;
            this.f1208x = null;
        }
    }

    /* renamed from: I */
    public void mo1252I(Configuration configuration) {
        mo1441R0(C0534a.m2478b(this.f1193i).mo1751g());
    }

    /* renamed from: I0 */
    public final void mo1432I0(C0441a.C0447f fVar, int i) {
        C0474e eVar = (C0474e) fVar;
        if (eVar.mo1470r() != null) {
            eVar.mo1471s(i);
            this.f1202r.add(i, eVar);
            int size = this.f1202r.size();
            while (true) {
                i++;
                if (i < size) {
                    this.f1202r.get(i).mo1471s(i);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
    }

    /* renamed from: J0 */
    public void mo1433J0(boolean z) {
        View view;
        C0546h hVar = this.f1187H;
        if (hVar != null) {
            hVar.mo1806a();
        }
        if (this.f1181B != 0 || (!this.f1188I && !z)) {
            this.f1190K.mo1198b((View) null);
            return;
        }
        this.f1197m.setAlpha(1.0f);
        this.f1197m.setTransitioning(true);
        C0546h hVar2 = new C0546h();
        float f = (float) (-this.f1197m.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f1197m.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C18402w3 B = C18196h2.m82580g(this.f1197m).mo53045B(f);
        B.mo53079x(this.f1192M);
        hVar2.mo1808c(B);
        if (this.f1182C && (view = this.f1200p) != null) {
            hVar2.mo1808c(C18196h2.m82580g(view).mo53045B(f));
        }
        hVar2.mo1811f(f1175O);
        hVar2.mo1810e(250);
        hVar2.mo1812g(this.f1190K);
        this.f1187H = hVar2;
        hVar2.mo1813h();
    }

    /* renamed from: K */
    public boolean mo1254K(int i, KeyEvent keyEvent) {
        Menu e;
        int i2;
        C0473d dVar = this.f1206v;
        if (dVar == null || (e = dVar.mo1454e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: K0 */
    public void mo1434K0(boolean z) {
        View view;
        View view2;
        C0546h hVar = this.f1187H;
        if (hVar != null) {
            hVar.mo1806a();
        }
        this.f1197m.setVisibility(0);
        if (this.f1181B != 0 || (!this.f1188I && !z)) {
            this.f1197m.setAlpha(1.0f);
            this.f1197m.setTranslationY(0.0f);
            if (this.f1182C && (view = this.f1200p) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1191L.mo1198b((View) null);
        } else {
            this.f1197m.setTranslationY(0.0f);
            float f = (float) (-this.f1197m.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f1197m.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f1197m.setTranslationY(f);
            C0546h hVar2 = new C0546h();
            C18402w3 B = C18196h2.m82580g(this.f1197m).mo53045B(0.0f);
            B.mo53079x(this.f1192M);
            hVar2.mo1808c(B);
            if (this.f1182C && (view2 = this.f1200p) != null) {
                view2.setTranslationY(f);
                hVar2.mo1808c(C18196h2.m82580g(this.f1200p).mo53045B(0.0f));
            }
            hVar2.mo1811f(f1176P);
            hVar2.mo1810e(250);
            hVar2.mo1812g(this.f1191L);
            this.f1187H = hVar2;
            hVar2.mo1813h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1196l;
        if (actionBarOverlayLayout != null) {
            C18196h2.m82642v1(actionBarOverlayLayout);
        }
    }

    /* renamed from: L0 */
    public final void mo1435L0() {
        if (this.f1201q == null) {
            ScrollingTabContainerView scrollingTabContainerView = new ScrollingTabContainerView(this.f1193i);
            if (this.f1180A) {
                scrollingTabContainerView.setVisibility(0);
                this.f1198n.mo3347C(scrollingTabContainerView);
            } else {
                if (mo1304u() == 2) {
                    scrollingTabContainerView.setVisibility(0);
                    ActionBarOverlayLayout actionBarOverlayLayout = this.f1196l;
                    if (actionBarOverlayLayout != null) {
                        C18196h2.m82642v1(actionBarOverlayLayout);
                    }
                } else {
                    scrollingTabContainerView.setVisibility(8);
                }
                this.f1197m.setTabContainer(scrollingTabContainerView);
            }
            this.f1201q = scrollingTabContainerView;
        }
    }

    /* renamed from: M0 */
    public final C0707d0 mo1436M0(View view) {
        String str;
        if (view instanceof C0707d0) {
            return (C0707d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: N */
    public void mo1257N() {
        mo1430G0();
    }

    /* renamed from: N0 */
    public boolean mo1437N0() {
        return this.f1198n.mo3364c();
    }

    /* renamed from: O */
    public void mo1258O(C0441a.C0445d dVar) {
        this.f1210z.remove(dVar);
    }

    /* renamed from: O0 */
    public boolean mo1438O0() {
        return this.f1198n.mo3374h();
    }

    /* renamed from: P */
    public void mo1259P(C0441a.C0447f fVar) {
        mo1260Q(fVar.mo1321d());
    }

    /* renamed from: P0 */
    public final void mo1439P0() {
        if (this.f1185F) {
            this.f1185F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1196l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            mo1444U0(false);
        }
    }

    /* renamed from: Q */
    public void mo1260Q(int i) {
        int i2;
        C0441a.C0447f fVar;
        if (this.f1201q != null) {
            C0474e eVar = this.f1203s;
            if (eVar != null) {
                i2 = eVar.mo1321d();
            } else {
                i2 = this.f1204t;
            }
            this.f1201q.mo2893l(i);
            C0474e remove = this.f1202r.remove(i);
            if (remove != null) {
                remove.mo1471s(-1);
            }
            int size = this.f1202r.size();
            for (int i3 = i; i3 < size; i3++) {
                this.f1202r.get(i3).mo1471s(i3);
            }
            if (i2 == i) {
                if (this.f1202r.isEmpty()) {
                    fVar = null;
                } else {
                    fVar = this.f1202r.get(Math.max(0, i - 1));
                }
                mo1262S(fVar);
            }
        }
    }

    /* renamed from: Q0 */
    public final void mo1440Q0(View view) {
        boolean z;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0387a.C0394g.decor_content_parent);
        this.f1196l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1198n = mo1436M0(view.findViewById(C0387a.C0394g.action_bar));
        this.f1199o = (ActionBarContextView) view.findViewById(C0387a.C0394g.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0387a.C0394g.action_bar_container);
        this.f1197m = actionBarContainer;
        C0707d0 d0Var = this.f1198n;
        if (d0Var == null || this.f1199o == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1193i = d0Var.getContext();
        if ((this.f1198n.mo3358N() & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1205u = true;
        }
        C0534a b = C0534a.m2478b(this.f1193i);
        if (b.mo1746a() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo1289m0(z2);
        mo1441R0(b.mo1751g());
        TypedArray obtainStyledAttributes = this.f1193i.obtainStyledAttributes((AttributeSet) null, C0387a.C0400m.ActionBar, C0387a.C0389b.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0387a.C0400m.ActionBar_hideOnContentScroll, false)) {
            mo1279h0(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0387a.C0400m.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo1275f0((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: R */
    public boolean mo1261R() {
        ViewGroup s = this.f1198n.mo3385s();
        if (s == null || s.hasFocus()) {
            return false;
        }
        s.requestFocus();
        return true;
    }

    /* renamed from: R0 */
    public final void mo1441R0(boolean z) {
        boolean z2;
        boolean z3;
        this.f1180A = z;
        if (!z) {
            this.f1198n.mo3347C((ScrollingTabContainerView) null);
            this.f1197m.setTabContainer(this.f1201q);
        } else {
            this.f1197m.setTabContainer((ScrollingTabContainerView) null);
            this.f1198n.mo3347C(this.f1201q);
        }
        boolean z4 = true;
        if (mo1304u() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        ScrollingTabContainerView scrollingTabContainerView = this.f1201q;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1196l;
                if (actionBarOverlayLayout != null) {
                    C18196h2.m82642v1(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        C0707d0 d0Var = this.f1198n;
        if (this.f1180A || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        d0Var.mo3400y(z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1196l;
        if (this.f1180A || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z4);
    }

    /* renamed from: S */
    public void mo1262S(C0441a.C0447f fVar) {
        C19234h0 h0Var;
        int i = -1;
        if (mo1304u() != 2) {
            if (fVar != null) {
                i = fVar.mo1321d();
            }
            this.f1204t = i;
            return;
        }
        if (!(this.f1195k instanceof C19232h) || this.f1198n.mo3385s().isInEditMode()) {
            h0Var = null;
        } else {
            h0Var = ((C19232h) this.f1195k).mo57175g0().mo56909u().mo57228w();
        }
        C0474e eVar = this.f1203s;
        if (eVar != fVar) {
            ScrollingTabContainerView scrollingTabContainerView = this.f1201q;
            if (fVar != null) {
                i = fVar.mo1321d();
            }
            scrollingTabContainerView.setTabSelected(i);
            C0474e eVar2 = this.f1203s;
            if (eVar2 != null) {
                eVar2.mo1470r().mo1336b(this.f1203s, h0Var);
            }
            C0474e eVar3 = (C0474e) fVar;
            this.f1203s = eVar3;
            if (eVar3 != null) {
                eVar3.mo1470r().mo1335a(this.f1203s, h0Var);
            }
        } else if (eVar != null) {
            eVar.mo1470r().mo1337c(this.f1203s, h0Var);
            this.f1201q.mo2884c(fVar.mo1321d());
        }
        if (h0Var != null && !h0Var.mo57037A()) {
            h0Var.mo57052q();
        }
    }

    /* renamed from: S0 */
    public final boolean mo1442S0() {
        return C18196h2.m82539U0(this.f1197m);
    }

    /* renamed from: T */
    public void mo1263T(Drawable drawable) {
        this.f1197m.setPrimaryBackground(drawable);
    }

    /* renamed from: T0 */
    public final void mo1443T0() {
        if (!this.f1185F) {
            this.f1185F = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1196l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            mo1444U0(false);
        }
    }

    /* renamed from: U */
    public void mo1264U(int i) {
        mo1265V(LayoutInflater.from(mo1240A()).inflate(i, this.f1198n.mo3385s(), false));
    }

    /* renamed from: U0 */
    public final void mo1444U0(boolean z) {
        if (m2055F0(this.f1183D, this.f1184E, this.f1185F)) {
            if (!this.f1186G) {
                this.f1186G = true;
                mo1434K0(z);
            }
        } else if (this.f1186G) {
            this.f1186G = false;
            mo1433J0(z);
        }
    }

    /* renamed from: V */
    public void mo1265V(View view) {
        this.f1198n.mo3359O(view);
    }

    /* renamed from: W */
    public void mo1266W(View view, C0441a.C0443b bVar) {
        view.setLayoutParams(bVar);
        this.f1198n.mo3359O(view);
    }

    /* renamed from: X */
    public void mo1267X(boolean z) {
        if (!this.f1205u) {
            mo1268Y(z);
        }
    }

    /* renamed from: Y */
    public void mo1268Y(boolean z) {
        mo1270a0(z ? 4 : 0, 4);
    }

    /* renamed from: Z */
    public void mo1269Z(int i) {
        if ((i & 4) != 0) {
            this.f1205u = true;
        }
        this.f1198n.mo3378l(i);
    }

    /* renamed from: a */
    public void mo1445a() {
        if (this.f1184E) {
            this.f1184E = false;
            mo1444U0(true);
        }
    }

    /* renamed from: a0 */
    public void mo1270a0(int i, int i2) {
        int N = this.f1198n.mo3358N();
        if ((i2 & 4) != 0) {
            this.f1205u = true;
        }
        this.f1198n.mo3378l((i & i2) | ((~i2) & N));
    }

    /* renamed from: b */
    public void mo1446b(int i) {
        this.f1181B = i;
    }

    /* renamed from: b0 */
    public void mo1271b0(boolean z) {
        mo1270a0(z ? 16 : 0, 16);
    }

    /* renamed from: c */
    public void mo1447c() {
    }

    /* renamed from: c0 */
    public void mo1272c0(boolean z) {
        mo1270a0(z ? 2 : 0, 2);
    }

    /* renamed from: d */
    public void mo1448d(boolean z) {
        this.f1182C = z;
    }

    /* renamed from: d0 */
    public void mo1273d0(boolean z) {
        mo1270a0(z ? 8 : 0, 8);
    }

    /* renamed from: e */
    public void mo1449e() {
        if (!this.f1184E) {
            this.f1184E = true;
            mo1444U0(true);
        }
    }

    /* renamed from: e0 */
    public void mo1274e0(boolean z) {
        mo1270a0(z ? 1 : 0, 1);
    }

    /* renamed from: f */
    public void mo1450f() {
        C0546h hVar = this.f1187H;
        if (hVar != null) {
            hVar.mo1806a();
            this.f1187H = null;
        }
    }

    /* renamed from: f0 */
    public void mo1275f0(float f) {
        C18196h2.m82519N1(this.f1197m, f);
    }

    /* renamed from: g */
    public void mo1276g(C0441a.C0445d dVar) {
        this.f1210z.add(dVar);
    }

    /* renamed from: g0 */
    public void mo1277g0(int i) {
        if (i == 0 || this.f1196l.mo2431z()) {
            this.f1196l.setActionBarHideOffset(i);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
    }

    /* renamed from: h */
    public void mo1278h(C0441a.C0447f fVar) {
        mo1284k(fVar, this.f1202r.isEmpty());
    }

    /* renamed from: h0 */
    public void mo1279h0(boolean z) {
        if (!z || this.f1196l.mo2431z()) {
            this.f1189J = z;
            this.f1196l.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: i */
    public void mo1280i(C0441a.C0447f fVar, int i) {
        mo1282j(fVar, i, this.f1202r.isEmpty());
    }

    /* renamed from: i0 */
    public void mo1281i0(int i) {
        this.f1198n.mo3397v(i);
    }

    /* renamed from: j */
    public void mo1282j(C0441a.C0447f fVar, int i, boolean z) {
        mo1435L0();
        this.f1201q.mo2882a(fVar, i, z);
        mo1432I0(fVar, i);
        if (z) {
            mo1262S(fVar);
        }
    }

    /* renamed from: j0 */
    public void mo1283j0(CharSequence charSequence) {
        this.f1198n.mo3379m(charSequence);
    }

    /* renamed from: k */
    public void mo1284k(C0441a.C0447f fVar, boolean z) {
        mo1435L0();
        this.f1201q.mo2883b(fVar, z);
        mo1432I0(fVar, this.f1202r.size());
        if (z) {
            mo1262S(fVar);
        }
    }

    /* renamed from: k0 */
    public void mo1285k0(int i) {
        this.f1198n.mo3353I(i);
    }

    /* renamed from: l0 */
    public void mo1287l0(Drawable drawable) {
        this.f1198n.mo3361Q(drawable);
    }

    /* renamed from: m */
    public boolean mo1288m() {
        C0707d0 d0Var = this.f1198n;
        if (d0Var == null || !d0Var.mo3376j()) {
            return false;
        }
        this.f1198n.collapseActionView();
        return true;
    }

    /* renamed from: m0 */
    public void mo1289m0(boolean z) {
        this.f1198n.mo3395t(z);
    }

    /* renamed from: n */
    public void mo1290n(boolean z) {
        if (z != this.f1209y) {
            this.f1209y = z;
            int size = this.f1210z.size();
            for (int i = 0; i < size; i++) {
                this.f1210z.get(i).mo1316a(z);
            }
        }
    }

    /* renamed from: n0 */
    public void mo1291n0(int i) {
        this.f1198n.setIcon(i);
    }

    /* renamed from: o */
    public View mo1292o() {
        return this.f1198n.mo3346B();
    }

    /* renamed from: o0 */
    public void mo1293o0(Drawable drawable) {
        this.f1198n.setIcon(drawable);
    }

    /* renamed from: p */
    public int mo1294p() {
        return this.f1198n.mo3358N();
    }

    /* renamed from: p0 */
    public void mo1295p0(SpinnerAdapter spinnerAdapter, C0441a.C0446e eVar) {
        this.f1198n.mo3355K(spinnerAdapter, new C0504y(eVar));
    }

    /* renamed from: q */
    public float mo1296q() {
        return C18196h2.m82529R(this.f1197m);
    }

    /* renamed from: q0 */
    public void mo1297q0(int i) {
        this.f1198n.setLogo(i);
    }

    /* renamed from: r */
    public int mo1298r() {
        return this.f1197m.getHeight();
    }

    /* renamed from: r0 */
    public void mo1299r0(Drawable drawable) {
        this.f1198n.mo3348D(drawable);
    }

    /* renamed from: s */
    public int mo1300s() {
        return this.f1196l.getActionBarHideOffset();
    }

    /* renamed from: s0 */
    public void mo1301s0(int i) {
        boolean z;
        ActionBarOverlayLayout actionBarOverlayLayout;
        int p = this.f1198n.mo3382p();
        if (p == 2) {
            this.f1204t = mo1306v();
            mo1262S((C0441a.C0447f) null);
            this.f1201q.setVisibility(8);
        }
        if (!(p == i || this.f1180A || (actionBarOverlayLayout = this.f1196l) == null)) {
            C18196h2.m82642v1(actionBarOverlayLayout);
        }
        this.f1198n.mo3384r(i);
        boolean z2 = false;
        if (i == 2) {
            mo1435L0();
            this.f1201q.setVisibility(0);
            int i2 = this.f1204t;
            if (i2 != -1) {
                mo1303t0(i2);
                this.f1204t = -1;
            }
        }
        C0707d0 d0Var = this.f1198n;
        if (i != 2 || this.f1180A) {
            z = false;
        } else {
            z = true;
        }
        d0Var.mo3400y(z);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1196l;
        if (i == 2 && !this.f1180A) {
            z2 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: t */
    public int mo1302t() {
        int p = this.f1198n.mo3382p();
        if (p == 1) {
            return this.f1198n.mo3399x();
        }
        if (p != 2) {
            return 0;
        }
        return this.f1202r.size();
    }

    /* renamed from: t0 */
    public void mo1303t0(int i) {
        int p = this.f1198n.mo3382p();
        if (p == 1) {
            this.f1198n.mo3381o(i);
        } else if (p == 2) {
            mo1262S(this.f1202r.get(i));
        } else {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    /* renamed from: u */
    public int mo1304u() {
        return this.f1198n.mo3382p();
    }

    /* renamed from: u0 */
    public void mo1305u0(boolean z) {
        C0546h hVar;
        this.f1188I = z;
        if (!z && (hVar = this.f1187H) != null) {
            hVar.mo1806a();
        }
    }

    /* renamed from: v */
    public int mo1306v() {
        C0474e eVar;
        int p = this.f1198n.mo3382p();
        if (p == 1) {
            return this.f1198n.mo3396u();
        }
        if (p == 2 && (eVar = this.f1203s) != null) {
            return eVar.mo1321d();
        }
        return -1;
    }

    /* renamed from: v0 */
    public void mo1307v0(Drawable drawable) {
    }

    /* renamed from: w */
    public C0441a.C0447f mo1308w() {
        return this.f1203s;
    }

    /* renamed from: w0 */
    public void mo1309w0(Drawable drawable) {
        this.f1197m.setStackedBackground(drawable);
    }

    /* renamed from: x */
    public CharSequence mo1310x() {
        return this.f1198n.mo3357M();
    }

    /* renamed from: x0 */
    public void mo1311x0(int i) {
        mo1313y0(this.f1193i.getString(i));
    }

    /* renamed from: y */
    public C0441a.C0447f mo1312y(int i) {
        return this.f1202r.get(i);
    }

    /* renamed from: y0 */
    public void mo1313y0(CharSequence charSequence) {
        this.f1198n.mo3380n(charSequence);
    }

    /* renamed from: z */
    public int mo1314z() {
        return this.f1202r.size();
    }

    /* renamed from: z0 */
    public void mo1315z0(int i) {
        mo1241A0(this.f1193i.getString(i));
    }

    public C0469d0(Dialog dialog) {
        mo1440Q0(dialog.getWindow().getDecorView());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C0469d0(View view) {
        mo1440Q0(view);
    }
}
