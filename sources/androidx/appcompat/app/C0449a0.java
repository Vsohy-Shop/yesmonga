package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.C0441a;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.widget.C0707d0;
import androidx.appcompat.widget.C0747m1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.util.C18001r;
import androidx.core.view.C18196h2;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.app.a0 */
public class C0449a0 extends C0441a {

    /* renamed from: i */
    public final C0707d0 f1109i;

    /* renamed from: j */
    public final Window.Callback f1110j;

    /* renamed from: k */
    public final AppCompatDelegateImpl.C0424i f1111k;

    /* renamed from: l */
    public boolean f1112l;

    /* renamed from: m */
    public boolean f1113m;

    /* renamed from: n */
    public boolean f1114n;

    /* renamed from: o */
    public ArrayList<C0441a.C0445d> f1115o = new ArrayList<>();

    /* renamed from: p */
    public final Runnable f1116p = new C0450a();

    /* renamed from: q */
    public final Toolbar.C0681h f1117q;

    /* renamed from: androidx.appcompat.app.a0$a */
    public class C0450a implements Runnable {
        public C0450a() {
        }

        public void run() {
            C0449a0.this.mo1339F0();
        }
    }

    /* renamed from: androidx.appcompat.app.a0$b */
    public class C0451b implements Toolbar.C0681h {
        public C0451b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0449a0.this.f1110j.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.a0$c */
    public final class C0452c implements C0585n.C0586a {

        /* renamed from: a */
        public boolean f1120a;

        public C0452c() {
        }

        /* renamed from: b */
        public void mo1207b(@C0359n0 C0568g gVar, boolean z) {
            if (!this.f1120a) {
                this.f1120a = true;
                C0449a0.this.f1109i.mo3345A();
                C0449a0.this.f1110j.onPanelClosed(108, gVar);
                this.f1120a = false;
            }
        }

        /* renamed from: c */
        public boolean mo1208c(@C0359n0 C0568g gVar) {
            C0449a0.this.f1110j.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.a0$d */
    public final class C0453d implements C0568g.C0569a {
        public C0453d() {
        }

        /* renamed from: a */
        public boolean mo1111a(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
            return false;
        }

        /* renamed from: b */
        public void mo1114b(@C0359n0 C0568g gVar) {
            if (C0449a0.this.f1109i.mo3369g()) {
                C0449a0.this.f1110j.onPanelClosed(108, gVar);
            } else if (C0449a0.this.f1110j.onPreparePanel(0, (View) null, gVar)) {
                C0449a0.this.f1110j.onMenuOpened(108, gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.a0$e */
    public class C0454e implements AppCompatDelegateImpl.C0424i {
        public C0454e() {
        }

        /* renamed from: a */
        public boolean mo1205a(int i) {
            if (i != 0) {
                return false;
            }
            C0449a0 a0Var = C0449a0.this;
            if (a0Var.f1112l) {
                return false;
            }
            a0Var.f1109i.setMenuPrepared();
            C0449a0.this.f1112l = true;
            return false;
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0449a0.this.f1109i.getContext());
            }
            return null;
        }
    }

    public C0449a0(@C0359n0 Toolbar toolbar, @C0363p0 CharSequence charSequence, @C0359n0 Window.Callback callback) {
        C0451b bVar = new C0451b();
        this.f1117q = bVar;
        C18001r.m81775l(toolbar);
        C0747m1 m1Var = new C0747m1(toolbar, false);
        this.f1109i = m1Var;
        this.f1110j = (Window.Callback) C18001r.m81775l(callback);
        m1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        m1Var.setWindowTitle(charSequence);
        this.f1111k = new C0454e();
    }

    /* renamed from: A */
    public Context mo1240A() {
        return this.f1109i.getContext();
    }

    /* renamed from: A0 */
    public void mo1241A0(CharSequence charSequence) {
        this.f1109i.setTitle(charSequence);
    }

    /* renamed from: B */
    public CharSequence mo1242B() {
        return this.f1109i.getTitle();
    }

    /* renamed from: B0 */
    public void mo1243B0(CharSequence charSequence) {
        this.f1109i.setWindowTitle(charSequence);
    }

    /* renamed from: C */
    public void mo1244C() {
        this.f1109i.setVisibility(8);
    }

    /* renamed from: C0 */
    public void mo1245C0() {
        this.f1109i.setVisibility(0);
    }

    /* renamed from: D */
    public boolean mo1246D() {
        this.f1109i.mo3385s().removeCallbacks(this.f1116p);
        C18196h2.m82618p1(this.f1109i.mo3385s(), this.f1116p);
        return true;
    }

    /* renamed from: E0 */
    public final Menu mo1338E0() {
        if (!this.f1113m) {
            this.f1109i.mo3354J(new C0452c(), new C0453d());
            this.f1113m = true;
        }
        return this.f1109i.mo3362a();
    }

    /* renamed from: F */
    public boolean mo1249F() {
        return this.f1109i.getVisibility() == 0;
    }

    /* renamed from: F0 */
    public void mo1339F0() {
        C0568g gVar;
        Menu E0 = mo1338E0();
        if (E0 instanceof C0568g) {
            gVar = (C0568g) E0;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            gVar.mo2080m0();
        }
        try {
            E0.clear();
            if (!this.f1110j.onCreatePanelMenu(0, E0) || !this.f1110j.onPreparePanel(0, (View) null, E0)) {
                E0.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.mo2078l0();
            }
        }
    }

    /* renamed from: G */
    public boolean mo1250G() {
        return super.mo1250G();
    }

    /* renamed from: H */
    public C0441a.C0447f mo1251H() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: I */
    public void mo1252I(Configuration configuration) {
        super.mo1252I(configuration);
    }

    /* renamed from: J */
    public void mo1253J() {
        this.f1109i.mo3385s().removeCallbacks(this.f1116p);
    }

    /* renamed from: K */
    public boolean mo1254K(int i, KeyEvent keyEvent) {
        int i2;
        Menu E0 = mo1338E0();
        if (E0 == null) {
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
        E0.setQwertyMode(z);
        return E0.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: L */
    public boolean mo1255L(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo1256M();
        }
        return true;
    }

    /* renamed from: M */
    public boolean mo1256M() {
        return this.f1109i.mo3368f();
    }

    /* renamed from: N */
    public void mo1257N() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: O */
    public void mo1258O(C0441a.C0445d dVar) {
        this.f1115o.remove(dVar);
    }

    /* renamed from: P */
    public void mo1259P(C0441a.C0447f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: Q */
    public void mo1260Q(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: R */
    public boolean mo1261R() {
        ViewGroup s = this.f1109i.mo3385s();
        if (s == null || s.hasFocus()) {
            return false;
        }
        s.requestFocus();
        return true;
    }

    /* renamed from: S */
    public void mo1262S(C0441a.C0447f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: T */
    public void mo1263T(@C0363p0 Drawable drawable) {
        this.f1109i.mo3363b(drawable);
    }

    /* renamed from: U */
    public void mo1264U(int i) {
        mo1265V(LayoutInflater.from(this.f1109i.getContext()).inflate(i, this.f1109i.mo3385s(), false));
    }

    /* renamed from: V */
    public void mo1265V(View view) {
        mo1266W(view, new C0441a.C0443b(-2, -2));
    }

    /* renamed from: W */
    public void mo1266W(View view, C0441a.C0443b bVar) {
        if (view != null) {
            view.setLayoutParams(bVar);
        }
        this.f1109i.mo3359O(view);
    }

    /* renamed from: X */
    public void mo1267X(boolean z) {
    }

    /* renamed from: Y */
    public void mo1268Y(boolean z) {
        mo1270a0(z ? 4 : 0, 4);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: Z */
    public void mo1269Z(int i) {
        mo1270a0(i, -1);
    }

    /* renamed from: a0 */
    public void mo1270a0(int i, int i2) {
        this.f1109i.mo3378l((i & i2) | ((~i2) & this.f1109i.mo3358N()));
    }

    /* renamed from: b0 */
    public void mo1271b0(boolean z) {
        mo1270a0(z ? 16 : 0, 16);
    }

    /* renamed from: c0 */
    public void mo1272c0(boolean z) {
        mo1270a0(z ? 2 : 0, 2);
    }

    /* renamed from: d0 */
    public void mo1273d0(boolean z) {
        mo1270a0(z ? 8 : 0, 8);
    }

    /* renamed from: e0 */
    public void mo1274e0(boolean z) {
        mo1270a0(z ? 1 : 0, 1);
    }

    /* renamed from: f0 */
    public void mo1275f0(float f) {
        C18196h2.m82519N1(this.f1109i.mo3385s(), f);
    }

    /* renamed from: g */
    public void mo1276g(C0441a.C0445d dVar) {
        this.f1115o.add(dVar);
    }

    /* renamed from: h */
    public void mo1278h(C0441a.C0447f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: i */
    public void mo1280i(C0441a.C0447f fVar, int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: i0 */
    public void mo1281i0(int i) {
        this.f1109i.mo3397v(i);
    }

    /* renamed from: j */
    public void mo1282j(C0441a.C0447f fVar, int i, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: j0 */
    public void mo1283j0(CharSequence charSequence) {
        this.f1109i.mo3379m(charSequence);
    }

    /* renamed from: k */
    public void mo1284k(C0441a.C0447f fVar, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: k0 */
    public void mo1285k0(int i) {
        this.f1109i.mo3353I(i);
    }

    /* renamed from: l */
    public boolean mo1286l() {
        return this.f1109i.mo3367e();
    }

    /* renamed from: l0 */
    public void mo1287l0(Drawable drawable) {
        this.f1109i.mo3361Q(drawable);
    }

    /* renamed from: m */
    public boolean mo1288m() {
        if (!this.f1109i.mo3376j()) {
            return false;
        }
        this.f1109i.collapseActionView();
        return true;
    }

    /* renamed from: m0 */
    public void mo1289m0(boolean z) {
    }

    /* renamed from: n */
    public void mo1290n(boolean z) {
        if (z != this.f1114n) {
            this.f1114n = z;
            int size = this.f1115o.size();
            for (int i = 0; i < size; i++) {
                this.f1115o.get(i).mo1316a(z);
            }
        }
    }

    /* renamed from: n0 */
    public void mo1291n0(int i) {
        this.f1109i.setIcon(i);
    }

    /* renamed from: o */
    public View mo1292o() {
        return this.f1109i.mo3346B();
    }

    /* renamed from: o0 */
    public void mo1293o0(Drawable drawable) {
        this.f1109i.setIcon(drawable);
    }

    /* renamed from: p */
    public int mo1294p() {
        return this.f1109i.mo3358N();
    }

    /* renamed from: p0 */
    public void mo1295p0(SpinnerAdapter spinnerAdapter, C0441a.C0446e eVar) {
        this.f1109i.mo3355K(spinnerAdapter, new C0504y(eVar));
    }

    /* renamed from: q */
    public float mo1296q() {
        return C18196h2.m82529R(this.f1109i.mo3385s());
    }

    /* renamed from: q0 */
    public void mo1297q0(int i) {
        this.f1109i.setLogo(i);
    }

    /* renamed from: r */
    public int mo1298r() {
        return this.f1109i.getHeight();
    }

    /* renamed from: r0 */
    public void mo1299r0(Drawable drawable) {
        this.f1109i.mo3348D(drawable);
    }

    /* renamed from: s0 */
    public void mo1301s0(int i) {
        if (i != 2) {
            this.f1109i.mo3384r(i);
            return;
        }
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }

    /* renamed from: t */
    public int mo1302t() {
        return 0;
    }

    /* renamed from: t0 */
    public void mo1303t0(int i) {
        if (this.f1109i.mo3382p() == 1) {
            this.f1109i.mo3381o(i);
            return;
        }
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }

    /* renamed from: u */
    public int mo1304u() {
        return 0;
    }

    /* renamed from: u0 */
    public void mo1305u0(boolean z) {
    }

    /* renamed from: v */
    public int mo1306v() {
        return -1;
    }

    /* renamed from: v0 */
    public void mo1307v0(Drawable drawable) {
    }

    /* renamed from: w */
    public C0441a.C0447f mo1308w() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: w0 */
    public void mo1309w0(Drawable drawable) {
    }

    /* renamed from: x */
    public CharSequence mo1310x() {
        return this.f1109i.mo3357M();
    }

    /* renamed from: x0 */
    public void mo1311x0(int i) {
        C0707d0 d0Var = this.f1109i;
        d0Var.mo3380n(i != 0 ? d0Var.getContext().getText(i) : null);
    }

    /* renamed from: y */
    public C0441a.C0447f mo1312y(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: y0 */
    public void mo1313y0(CharSequence charSequence) {
        this.f1109i.mo3380n(charSequence);
    }

    /* renamed from: z */
    public int mo1314z() {
        return 0;
    }

    /* renamed from: z0 */
    public void mo1315z0(int i) {
        C0707d0 d0Var = this.f1109i;
        d0Var.setTitle(i != 0 ? d0Var.getContext().getText(i) : null);
    }
}
