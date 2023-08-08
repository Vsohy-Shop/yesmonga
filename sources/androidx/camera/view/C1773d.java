package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.camera.core.C1363b4;
import androidx.camera.core.C1394e4;
import androidx.camera.core.C1403f4;
import androidx.camera.core.C1417i2;
import androidx.camera.core.C1624j;
import androidx.camera.core.C1631k0;
import androidx.camera.core.C1641m;
import androidx.camera.core.C1645m2;
import androidx.camera.core.C1647n;
import androidx.camera.core.C1650n0;
import androidx.camera.core.C1654n2;
import androidx.camera.core.C1657o0;
import androidx.camera.core.C1667p3;
import androidx.camera.core.C1677r2;
import androidx.camera.core.C1689t0;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.C1491p0;
import androidx.camera.core.impl.utils.C1566j;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.camera.lifecycle.C1750f;
import androidx.camera.view.video.C1832d;
import androidx.camera.view.video.C1835f;
import androidx.camera.view.video.C1837g;
import androidx.camera.view.video.C1839h;
import androidx.core.util.C18001r;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.C32487a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.camera.view.d */
public abstract class C1773d {

    /* renamed from: D */
    public static final String f4876D = "CameraController";

    /* renamed from: E */
    public static final String f4877E = "Camera not initialized.";

    /* renamed from: F */
    public static final String f4878F = "PreviewView not attached.";

    /* renamed from: G */
    public static final String f4879G = "Use cases not attached to camera.";

    /* renamed from: H */
    public static final String f4880H = "ImageCapture disabled.";

    /* renamed from: I */
    public static final String f4881I = "VideoCapture disabled.";

    /* renamed from: J */
    public static final float f4882J = 0.16666667f;

    /* renamed from: K */
    public static final float f4883K = 0.25f;

    /* renamed from: L */
    public static final int f4884L = 0;

    /* renamed from: M */
    public static final int f4885M = 1;

    /* renamed from: N */
    public static final int f4886N = 2;

    /* renamed from: O */
    public static final int f4887O = 3;

    /* renamed from: P */
    public static final int f4888P = 4;

    /* renamed from: Q */
    public static final int f4889Q = 1;

    /* renamed from: R */
    public static final int f4890R = 2;
    @C1832d

    /* renamed from: S */
    public static final int f4891S = 4;

    /* renamed from: A */
    public final C19423g0<Integer> f4892A = new C19423g0<>(0);

    /* renamed from: B */
    public final Context f4893B;
    @C0359n0

    /* renamed from: C */
    public final C32487a<Void> f4894C;

    /* renamed from: a */
    public C1647n f4895a = C1647n.f4605e;

    /* renamed from: b */
    public int f4896b = 3;
    @C0359n0

    /* renamed from: c */
    public C1677r2 f4897c;
    @C0363p0

    /* renamed from: d */
    public C1779f f4898d;
    @C0359n0

    /* renamed from: e */
    public ImageCapture f4899e;
    @C0363p0

    /* renamed from: f */
    public C1779f f4900f;
    @C0363p0

    /* renamed from: g */
    public Executor f4901g;
    @C0363p0

    /* renamed from: h */
    public Executor f4902h;
    @C0363p0

    /* renamed from: i */
    public Executor f4903i;
    @C0363p0

    /* renamed from: j */
    public C1689t0.C1690a f4904j;
    @C0359n0

    /* renamed from: k */
    public C1689t0 f4905k;
    @C0363p0

    /* renamed from: l */
    public C1779f f4906l;
    @C0359n0

    /* renamed from: m */
    public C1363b4 f4907m;
    @C0359n0

    /* renamed from: n */
    public final AtomicBoolean f4908n = new AtomicBoolean(false);
    @C0363p0

    /* renamed from: o */
    public C1779f f4909o;
    @C0363p0

    /* renamed from: p */
    public C1624j f4910p;
    @C0363p0

    /* renamed from: q */
    public C1750f f4911q;
    @C0363p0

    /* renamed from: r */
    public C1394e4 f4912r;
    @C0363p0

    /* renamed from: s */
    public C1677r2.C1681d f4913s;
    @C0363p0

    /* renamed from: t */
    public Display f4914t;
    @C0359n0

    /* renamed from: u */
    public final C1844x f4915u;
    @C0363p0

    /* renamed from: v */
    public final C1778e f4916v;

    /* renamed from: w */
    public boolean f4917w = true;

    /* renamed from: x */
    public boolean f4918x = true;

    /* renamed from: y */
    public final C1792i<C1403f4> f4919y = new C1792i<>();

    /* renamed from: z */
    public final C1792i<Integer> f4920z = new C1792i<>();

    /* renamed from: androidx.camera.view.d$a */
    public class C1774a extends C1844x {
        public C1774a(Context context) {
            super(context);
        }

        /* renamed from: d */
        public void mo5931d(int i) {
            C1773d.this.f4905k.mo5709U(i);
            C1773d.this.f4899e.mo4790X0(i);
            C1773d.this.f4907m.mo5023j0(i);
        }
    }

    /* renamed from: androidx.camera.view.d$b */
    public class C1775b implements C1363b4.C1368e {

        /* renamed from: a */
        public final /* synthetic */ C1835f f4922a;

        public C1775b(C1835f fVar) {
            this.f4922a = fVar;
        }

        /* renamed from: a */
        public void mo5059a(int i, @C0359n0 String str, @C0363p0 Throwable th) {
            C1773d.this.f4908n.set(false);
            this.f4922a.mo6027a(i, str, th);
        }

        /* renamed from: b */
        public void mo5060b(@C0359n0 C1363b4.C1371g gVar) {
            C1773d.this.f4908n.set(false);
            this.f4922a.mo6028b(C1839h.m7320a(gVar.mo5072a()));
        }
    }

    /* renamed from: androidx.camera.view.d$c */
    public class C1776c implements C1544c<C1657o0> {
        public C1776c() {
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            if (th instanceof CameraControl.OperationCanceledException) {
                C1417i2.m5911a(C1773d.f4876D, "Tap-to-focus is canceled by new action.");
                return;
            }
            C1417i2.m5912b(C1773d.f4876D, "Tap to focus failed.", th);
            C1773d.this.f4892A.mo57493o(4);
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 C1657o0 o0Var) {
            int i;
            if (o0Var != null) {
                C1417i2.m5911a(C1773d.f4876D, "Tap to focus onSuccess: " + o0Var.mo5653c());
                C19423g0<Integer> g0Var = C1773d.this.f4892A;
                if (o0Var.mo5653c()) {
                    i = 2;
                } else {
                    i = 3;
                }
                g0Var.mo57493o(Integer.valueOf(i));
            }
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.camera.view.d$d */
    public static class C1777d {
        @C0359n0
        @C0373u
        /* renamed from: a */
        public static Context m7148a(@C0359n0 Context context, @C0363p0 String str) {
            return context.createAttributionContext(str);
        }

        @C0363p0
        @C0373u
        /* renamed from: b */
        public static String m7149b(@C0359n0 Context context) {
            return context.getAttributionTag();
        }
    }

    /* renamed from: androidx.camera.view.d$e */
    public class C1778e implements DisplayManager.DisplayListener {
        public C1778e() {
        }

        public void onDisplayAdded(int i) {
        }

        @SuppressLint({"WrongConstant"})
        @C0368r0(markerClass = {C1631k0.class})
        public void onDisplayChanged(int i) {
            Display display = C1773d.this.f4914t;
            if (display != null && display.getDisplayId() == i) {
                C1773d dVar = C1773d.this;
                dVar.f4897c.mo5675U(dVar.f4914t.getRotation());
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.view.d$g */
    public @interface C1781g {
    }

    @C0368r0(markerClass = {C1832d.class})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.view.d$h */
    public @interface C1782h {
    }

    public C1773d(@C0359n0 Context context) {
        Context i = m7071i(context);
        this.f4893B = i;
        this.f4897c = new C1677r2.C1679b().mo4098g();
        this.f4899e = new ImageCapture.C1311j().mo4098g();
        this.f4905k = new C1689t0.C1692c().mo4098g();
        this.f4907m = new C1363b4.C1365b().mo4098g();
        this.f4894C = C1548f.m6486o(C1750f.m7017j(i), new C1767b(this), C1525a.m6441e());
        this.f4916v = new C1778e();
        this.f4915u = new C1774a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ Void m7065N(C1750f fVar) {
        this.f4911q = fVar;
        mo5905m0();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m7066O(C1647n nVar) {
        this.f4895a = nVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m7067P(int i) {
        this.f4896b = i;
    }

    /* renamed from: i */
    public static Context m7071i(@C0359n0 Context context) {
        String b;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT < 30 || (b = C1777d.m7149b(context)) == null) {
            return applicationContext;
        }
        return C1777d.m7148a(applicationContext, b);
    }

    @C0353k0
    @C0359n0
    /* renamed from: A */
    public LiveData<C1403f4> mo5861A() {
        C1566j.m6506b();
        return this.f4919y;
    }

    @C0353k0
    /* renamed from: B */
    public boolean mo5862B(@C0359n0 C1647n nVar) {
        C1566j.m6506b();
        C18001r.m81775l(nVar);
        C1750f fVar = this.f4911q;
        if (fVar != null) {
            try {
                return fVar.mo5812c(nVar);
            } catch (CameraInfoUnavailableException e) {
                C1417i2.m5925o(f4876D, "Failed to check camera availability", e);
                return false;
            }
        } else {
            throw new IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
        }
    }

    /* renamed from: C */
    public final boolean mo5863C() {
        return this.f4910p != null;
    }

    /* renamed from: D */
    public final boolean mo5864D() {
        return this.f4911q != null;
    }

    @C0353k0
    /* renamed from: E */
    public boolean mo5865E() {
        C1566j.m6506b();
        return mo5872L(2);
    }

    @C0353k0
    /* renamed from: F */
    public boolean mo5866F() {
        C1566j.m6506b();
        return mo5872L(1);
    }

    /* renamed from: G */
    public final boolean mo5867G(@C0363p0 C1779f fVar, @C0363p0 C1779f fVar2) {
        if (fVar == fVar2) {
            return true;
        }
        return fVar != null && fVar.equals(fVar2);
    }

    @C0353k0
    /* renamed from: H */
    public boolean mo5868H() {
        C1566j.m6506b();
        return this.f4917w;
    }

    /* renamed from: I */
    public final boolean mo5869I() {
        return (this.f4913s == null || this.f4912r == null || this.f4914t == null) ? false : true;
    }

    @C0353k0
    @C1832d
    /* renamed from: J */
    public boolean mo5870J() {
        C1566j.m6506b();
        return this.f4908n.get();
    }

    @C0353k0
    /* renamed from: K */
    public boolean mo5871K() {
        C1566j.m6506b();
        return this.f4918x;
    }

    /* renamed from: L */
    public final boolean mo5872L(int i) {
        return (i & this.f4896b) != 0;
    }

    @C0353k0
    @C1832d
    /* renamed from: M */
    public boolean mo5873M() {
        C1566j.m6506b();
        return mo5872L(4);
    }

    /* renamed from: Q */
    public void mo5874Q(float f) {
        if (!mo5863C()) {
            C1417i2.m5924n(f4876D, f4879G);
        } else if (!this.f4917w) {
            C1417i2.m5911a(f4876D, "Pinch to zoom disabled.");
        } else {
            C1417i2.m5911a(f4876D, "Pinch to zoom with scale: " + f);
            C1403f4 f2 = mo5861A().mo4610f();
            if (f2 != null) {
                mo5899j0(Math.min(Math.max(f2.mo4268d() * mo5901k0(f), f2.mo4267c()), f2.mo4265a()));
            }
        }
    }

    /* renamed from: R */
    public void mo5875R(C1654n2 n2Var, float f, float f2) {
        if (!mo5863C()) {
            C1417i2.m5924n(f4876D, f4879G);
        } else if (!this.f4918x) {
            C1417i2.m5911a(f4876D, "Tap to focus disabled. ");
        } else {
            C1417i2.m5911a(f4876D, "Tap to focus started: " + f + ", " + f2);
            this.f4892A.mo57493o(1);
            C1645m2 c = n2Var.mo5651c(f, f2, 0.16666667f);
            C1548f.m6473b(this.f4910p.mo5119a().mo4686j(new C1650n0.C1651a(c, 1).mo5645b(n2Var.mo5651c(f, f2, 0.25f), 2).mo5646c()), new C1776c(), C1525a.m6437a());
        }
    }

    @C0353k0
    /* renamed from: S */
    public void mo5876S(@C0359n0 C1647n nVar) {
        C1566j.m6506b();
        C1647n nVar2 = this.f4895a;
        if (nVar2 != nVar) {
            this.f4895a = nVar;
            C1750f fVar = this.f4911q;
            if (fVar != null) {
                fVar.mo5810a();
                mo5907n0(new C1765a(this, nVar2));
            }
        }
    }

    @C0353k0
    @C0368r0(markerClass = {C1832d.class})
    /* renamed from: T */
    public void mo5877T(int i) {
        C1566j.m6506b();
        int i2 = this.f4896b;
        if (i != i2) {
            this.f4896b = i;
            if (!mo5873M()) {
                mo5915r0();
            }
            mo5907n0(new C1771c(this, i2));
        }
    }

    @C0353k0
    /* renamed from: U */
    public void mo5878U(@C0359n0 Executor executor, @C0359n0 C1689t0.C1690a aVar) {
        C1566j.m6506b();
        if (this.f4904j != aVar || this.f4902h != executor) {
            this.f4902h = executor;
            this.f4904j = aVar;
            this.f4905k.mo5708T(executor, aVar);
        }
    }

    @C0353k0
    /* renamed from: V */
    public void mo5879V(@C0363p0 Executor executor) {
        C1566j.m6506b();
        if (this.f4903i != executor) {
            this.f4903i = executor;
            mo5921u0(this.f4905k.mo5705O(), this.f4905k.mo5706P());
            mo5905m0();
        }
    }

    @C0353k0
    /* renamed from: W */
    public void mo5880W(int i) {
        C1566j.m6506b();
        if (this.f4905k.mo5705O() != i) {
            mo5921u0(i, this.f4905k.mo5706P());
            mo5905m0();
        }
    }

    @C0353k0
    /* renamed from: X */
    public void mo5881X(int i) {
        C1566j.m6506b();
        if (this.f4905k.mo5706P() != i) {
            mo5921u0(this.f4905k.mo5705O(), i);
            mo5905m0();
        }
    }

    @C0353k0
    /* renamed from: Y */
    public void mo5882Y(@C0363p0 C1779f fVar) {
        C1566j.m6506b();
        if (!mo5867G(this.f4906l, fVar)) {
            this.f4906l = fVar;
            mo5921u0(this.f4905k.mo5705O(), this.f4905k.mo5706P());
            mo5905m0();
        }
    }

    @C0353k0
    /* renamed from: Z */
    public void mo5883Z(int i) {
        C1566j.m6506b();
        this.f4899e.mo4789W0(i);
    }

    @C0353k0
    /* renamed from: a0 */
    public void mo5884a0(@C0363p0 Executor executor) {
        C1566j.m6506b();
        if (this.f4901g != executor) {
            this.f4901g = executor;
            mo5923v0(this.f4899e.mo4808m0());
            mo5905m0();
        }
    }

    @C0353k0
    /* renamed from: b0 */
    public void mo5885b0(int i) {
        C1566j.m6506b();
        if (this.f4899e.mo4808m0() != i) {
            mo5923v0(i);
            mo5905m0();
        }
    }

    @C0353k0
    /* renamed from: c0 */
    public void mo5886c0(@C0363p0 C1779f fVar) {
        C1566j.m6506b();
        if (!mo5867G(this.f4900f, fVar)) {
            this.f4900f = fVar;
            mo5923v0(mo5918t());
            mo5905m0();
        }
    }

    @SuppressLint({"MissingPermission", "WrongConstant"})
    @C0368r0(markerClass = {C1631k0.class})
    @C0353k0
    /* renamed from: d */
    public void mo5887d(@C0359n0 C1677r2.C1681d dVar, @C0359n0 C1394e4 e4Var, @C0359n0 Display display) {
        C1566j.m6506b();
        if (this.f4913s != dVar) {
            this.f4913s = dVar;
            this.f4897c.mo5673S(dVar);
        }
        this.f4912r = e4Var;
        this.f4914t = display;
        mo5909o0();
        mo5905m0();
    }

    @C0353k0
    @C0359n0
    /* renamed from: d0 */
    public C32487a<Void> mo5888d0(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        C1566j.m6506b();
        if (mo5863C()) {
            return this.f4910p.mo5119a().mo4677c(f);
        }
        C1417i2.m5924n(f4876D, f4879G);
        return C1548f.m6479h(null);
    }

    @C0353k0
    /* renamed from: e */
    public void mo5889e() {
        C1566j.m6506b();
        this.f4902h = null;
        this.f4904j = null;
        this.f4905k.mo5702L();
    }

    @C0353k0
    /* renamed from: e0 */
    public void mo5890e0(boolean z) {
        C1566j.m6506b();
        this.f4917w = z;
    }

    @C0353k0
    /* renamed from: f */
    public void mo5891f() {
        C1566j.m6506b();
        C1750f fVar = this.f4911q;
        if (fVar != null) {
            fVar.mo5810a();
        }
        this.f4897c.mo5673S((C1677r2.C1681d) null);
        this.f4910p = null;
        this.f4913s = null;
        this.f4912r = null;
        this.f4914t = null;
        mo5913q0();
    }

    @C0353k0
    /* renamed from: f0 */
    public void mo5892f0(@C0363p0 C1779f fVar) {
        C1566j.m6506b();
        if (!mo5867G(this.f4898d, fVar)) {
            this.f4898d = fVar;
            mo5925w0();
            mo5905m0();
        }
    }

    @C0363p0
    @C0368r0(markerClass = {C1631k0.class, C1832d.class})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public C1667p3 mo5893g() {
        if (!mo5864D()) {
            C1417i2.m5911a(f4876D, f4877E);
            return null;
        } else if (!mo5869I()) {
            C1417i2.m5911a(f4876D, f4878F);
            return null;
        } else {
            C1667p3.C1668a a = new C1667p3.C1668a().mo5660a(this.f4897c);
            if (mo5866F()) {
                a.mo5660a(this.f4899e);
            } else {
                this.f4911q.mo5813d(this.f4899e);
            }
            if (mo5865E()) {
                a.mo5660a(this.f4905k);
            } else {
                this.f4911q.mo5813d(this.f4905k);
            }
            if (mo5873M()) {
                a.mo5660a(this.f4907m);
            } else {
                this.f4911q.mo5813d(this.f4907m);
            }
            a.mo5662c(this.f4912r);
            return a.mo5661b();
        }
    }

    @C0353k0
    /* renamed from: g0 */
    public void mo5894g0(boolean z) {
        C1566j.m6506b();
        this.f4918x = z;
    }

    @C0353k0
    @C0359n0
    /* renamed from: h */
    public C32487a<Void> mo5895h(boolean z) {
        C1566j.m6506b();
        if (mo5863C()) {
            return this.f4910p.mo5119a().mo4682h(z);
        }
        C1417i2.m5924n(f4876D, f4879G);
        return C1548f.m6479h(null);
    }

    /* renamed from: h0 */
    public final void mo5896h0(@C0359n0 C1491p0.C1492a<?> aVar, @C0363p0 C1779f fVar) {
        if (fVar != null) {
            if (fVar.mo5937b() != null) {
                aVar.mo4860m(fVar.mo5937b());
            } else if (fVar.mo5936a() != -1) {
                aVar.mo4861n(fVar.mo5936a());
            } else {
                C1417i2.m5913c(f4876D, "Invalid target surface size. " + fVar);
            }
        }
    }

    @C0353k0
    /* renamed from: i0 */
    public void mo5897i0(@C0363p0 C1779f fVar) {
        C1566j.m6506b();
        if (!mo5867G(this.f4909o, fVar)) {
            this.f4909o = fVar;
            mo5927x0();
            mo5905m0();
        }
    }

    @C0363p0
    @C0353k0
    /* renamed from: j */
    public CameraControl mo5898j() {
        C1566j.m6506b();
        C1624j jVar = this.f4910p;
        if (jVar == null) {
            return null;
        }
        return jVar.mo5119a();
    }

    @C0353k0
    @C0359n0
    /* renamed from: j0 */
    public C32487a<Void> mo5899j0(float f) {
        C1566j.m6506b();
        if (mo5863C()) {
            return this.f4910p.mo5119a().mo4679e(f);
        }
        C1417i2.m5924n(f4876D, f4879G);
        return C1548f.m6479h(null);
    }

    @C0363p0
    @C0353k0
    /* renamed from: k */
    public C1641m mo5900k() {
        C1566j.m6506b();
        C1624j jVar = this.f4910p;
        if (jVar == null) {
            return null;
        }
        return jVar.mo5121c();
    }

    /* renamed from: k0 */
    public final float mo5901k0(float f) {
        return f > 1.0f ? ((f - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - f) * 2.0f);
    }

    @C0353k0
    @C0359n0
    /* renamed from: l */
    public C1647n mo5902l() {
        C1566j.m6506b();
        return this.f4895a;
    }

    @C0363p0
    /* renamed from: l0 */
    public abstract C1624j mo5903l0();

    /* renamed from: m */
    public final DisplayManager mo5904m() {
        return (DisplayManager) this.f4893B.getSystemService("display");
    }

    /* renamed from: m0 */
    public void mo5905m0() {
        mo5907n0((Runnable) null);
    }

    @C0363p0
    @C0353k0
    /* renamed from: n */
    public Executor mo5906n() {
        C1566j.m6506b();
        return this.f4903i;
    }

    /* renamed from: n0 */
    public void mo5907n0(@C0363p0 Runnable runnable) {
        try {
            this.f4910p = mo5903l0();
            if (!mo5863C()) {
                C1417i2.m5911a(f4876D, f4879G);
                return;
            }
            this.f4919y.mo5940u(this.f4910p.mo5121c().mo4602l());
            this.f4920z.mo5940u(this.f4910p.mo5121c().mo4598h());
        } catch (IllegalArgumentException e) {
            if (runnable != null) {
                runnable.run();
            }
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
        }
    }

    @C0353k0
    /* renamed from: o */
    public int mo5908o() {
        C1566j.m6506b();
        return this.f4905k.mo5705O();
    }

    /* renamed from: o0 */
    public final void mo5909o0() {
        mo5904m().registerDisplayListener(this.f4916v, new Handler(Looper.getMainLooper()));
        if (this.f4915u.mo6033a()) {
            this.f4915u.mo6035c();
        }
    }

    @C0353k0
    /* renamed from: p */
    public int mo5910p() {
        C1566j.m6506b();
        return this.f4905k.mo5706P();
    }

    @C0353k0
    @C1832d
    /* renamed from: p0 */
    public void mo5911p0(@C0359n0 C1837g gVar, @C0359n0 Executor executor, @C0359n0 C1835f fVar) {
        C1566j.m6506b();
        C18001r.m81778o(mo5864D(), f4877E);
        C18001r.m81778o(mo5873M(), f4881I);
        this.f4907m.m5755a0(gVar.mo6032m(), executor, new C1775b(fVar));
        this.f4908n.set(true);
    }

    @C0363p0
    @C0353k0
    /* renamed from: q */
    public C1779f mo5912q() {
        C1566j.m6506b();
        return this.f4906l;
    }

    /* renamed from: q0 */
    public final void mo5913q0() {
        mo5904m().unregisterDisplayListener(this.f4916v);
        this.f4915u.mo6034b();
    }

    @C0353k0
    /* renamed from: r */
    public int mo5914r() {
        C1566j.m6506b();
        return this.f4899e.mo4809o0();
    }

    @C0353k0
    @C1832d
    /* renamed from: r0 */
    public void mo5915r0() {
        C1566j.m6506b();
        if (this.f4908n.get()) {
            this.f4907m.m5760f0();
        }
    }

    @C0363p0
    @C0353k0
    /* renamed from: s */
    public Executor mo5916s() {
        C1566j.m6506b();
        return this.f4901g;
    }

    @C0353k0
    /* renamed from: s0 */
    public void mo5917s0(@C0359n0 ImageCapture.C1327u uVar, @C0359n0 Executor executor, @C0359n0 ImageCapture.C1326t tVar) {
        C1566j.m6506b();
        C18001r.m81778o(mo5864D(), f4877E);
        C18001r.m81778o(mo5866F(), f4880H);
        mo5929y0(uVar);
        this.f4899e.m5395J0(uVar, executor, tVar);
    }

    @C0353k0
    /* renamed from: t */
    public int mo5918t() {
        C1566j.m6506b();
        return this.f4899e.mo4808m0();
    }

    @C0353k0
    /* renamed from: t0 */
    public void mo5919t0(@C0359n0 Executor executor, @C0359n0 ImageCapture.C1325s sVar) {
        C1566j.m6506b();
        C18001r.m81778o(mo5864D(), f4877E);
        C18001r.m81778o(mo5866F(), f4880H);
        this.f4899e.m5393I0(executor, sVar);
    }

    @C0363p0
    @C0353k0
    /* renamed from: u */
    public C1779f mo5920u() {
        C1566j.m6506b();
        return this.f4900f;
    }

    /* renamed from: u0 */
    public final void mo5921u0(int i, int i2) {
        C1689t0.C1690a aVar;
        if (mo5864D()) {
            this.f4911q.mo5813d(this.f4905k);
        }
        C1689t0.C1692c E = new C1689t0.C1692c().mo5731y(i).mo5716E(i2);
        mo5896h0(E, this.f4906l);
        Executor executor = this.f4903i;
        if (executor != null) {
            E.mo5052e(executor);
        }
        C1689t0 t = E.mo4098g();
        this.f4905k = t;
        Executor executor2 = this.f4902h;
        if (executor2 != null && (aVar = this.f4904j) != null) {
            t.mo5708T(executor2, aVar);
        }
    }

    @C0359n0
    /* renamed from: v */
    public C32487a<Void> mo5922v() {
        return this.f4894C;
    }

    /* renamed from: v0 */
    public final void mo5923v0(int i) {
        if (mo5864D()) {
            this.f4911q.mo5813d(this.f4899e);
        }
        ImageCapture.C1311j A = new ImageCapture.C1311j().mo4829A(i);
        mo5896h0(A, this.f4900f);
        Executor executor = this.f4901g;
        if (executor != null) {
            A.mo4854e(executor);
        }
        this.f4899e = A.mo4098g();
    }

    @C0363p0
    @C0353k0
    /* renamed from: w */
    public C1779f mo5924w() {
        C1566j.m6506b();
        return this.f4898d;
    }

    /* renamed from: w0 */
    public final void mo5925w0() {
        if (mo5864D()) {
            this.f4911q.mo5813d(this.f4897c);
        }
        C1677r2.C1679b bVar = new C1677r2.C1679b();
        mo5896h0(bVar, this.f4898d);
        this.f4897c = bVar.mo4098g();
    }

    @C0353k0
    @C0359n0
    /* renamed from: x */
    public LiveData<Integer> mo5926x() {
        C1566j.m6506b();
        return this.f4892A;
    }

    /* renamed from: x0 */
    public final void mo5927x0() {
        if (mo5864D()) {
            this.f4911q.mo5813d(this.f4907m);
        }
        C1363b4.C1365b bVar = new C1363b4.C1365b();
        mo5896h0(bVar, this.f4909o);
        this.f4907m = bVar.mo4098g();
    }

    @C0353k0
    @C0359n0
    /* renamed from: y */
    public LiveData<Integer> mo5928y() {
        C1566j.m6506b();
        return this.f4920z;
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y0 */
    public void mo5929y0(@C0359n0 ImageCapture.C1327u uVar) {
        boolean z;
        if (this.f4895a.mo5634d() != null && !uVar.mo4899d().mo4889c()) {
            ImageCapture.C1324r d = uVar.mo4899d();
            if (this.f4895a.mo5634d().intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            d.mo4892f(z);
        }
    }

    @C0363p0
    @C0353k0
    /* renamed from: z */
    public C1779f mo5930z() {
        C1566j.m6506b();
        return this.f4909o;
    }

    /* renamed from: androidx.camera.view.d$f */
    public static class C1779f {

        /* renamed from: c */
        public static final int f4926c = -1;

        /* renamed from: a */
        public final int f4927a;
        @C0363p0

        /* renamed from: b */
        public final Size f4928b;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.camera.view.d$f$a */
        public @interface C1780a {
        }

        public C1779f(int i) {
            C18001r.m81764a(i != -1);
            this.f4927a = i;
            this.f4928b = null;
        }

        /* renamed from: a */
        public int mo5936a() {
            return this.f4927a;
        }

        @C0363p0
        /* renamed from: b */
        public Size mo5937b() {
            return this.f4928b;
        }

        public C1779f(@C0359n0 Size size) {
            C18001r.m81775l(size);
            this.f4927a = -1;
            this.f4928b = size;
        }
    }
}
