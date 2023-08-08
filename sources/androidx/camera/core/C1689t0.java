package androidx.camera.core;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C1437b0;
import androidx.camera.core.impl.C1441c1;
import androidx.camera.core.impl.C1471k0;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1491p0;
import androidx.camera.core.impl.C1503s0;
import androidx.camera.core.impl.C1582x0;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.C1566j;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.internal.C1611e;
import androidx.camera.core.internal.C1613f;
import androidx.camera.core.internal.C1615g;
import androidx.core.util.C18001r;
import com.contentsquare.android.api.C14092c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.t0 */
public final class C1689t0 extends UseCase {

    /* renamed from: p */
    public static final int f4686p = 0;

    /* renamed from: q */
    public static final int f4687q = 1;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: r */
    public static final C1693d f4688r = new C1693d();

    /* renamed from: s */
    public static final String f4689s = "ImageAnalysis";

    /* renamed from: t */
    public static final int f4690t = 4;

    /* renamed from: u */
    public static final int f4691u = 0;

    /* renamed from: v */
    public static final int f4692v = 6;

    /* renamed from: l */
    public final C1711w0 f4693l;

    /* renamed from: m */
    public final Object f4694m = new Object();
    @C0323b0("mAnalysisLock")

    /* renamed from: n */
    public C1690a f4695n;
    @C0363p0

    /* renamed from: o */
    public DeferrableSurface f4696o;

    /* renamed from: androidx.camera.core.t0$a */
    public interface C1690a {
        /* renamed from: a */
        void mo5700a(@C0359n0 C1353a2 a2Var);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.t0$b */
    public @interface C1691b {
    }

    /* renamed from: androidx.camera.core.t0$c */
    public static final class C1692c implements C1491p0.C1492a<C1692c>, C1613f.C1614a<C1692c>, C1488o1.C1489a<C1689t0, C1471k0, C1692c> {

        /* renamed from: a */
        public final C1586y0 f4697a;

        public C1692c() {
            this(C1586y0.m6573d0());
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: u */
        public static C1692c m6859u(@C0359n0 Config config) {
            return new C1692c(C1586y0.m6574e0(config));
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: v */
        public static C1692c m6860v(@C0359n0 C1471k0 k0Var) {
            return new C1692c(C1586y0.m6574e0(k0Var));
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: A */
        public C1692c mo4852c(@C0359n0 C1583y.C1585b bVar) {
            mo4099h().mo5545t(C1488o1.f4253n, bVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: B */
        public C1692c mo4865r(@C0359n0 C1583y yVar) {
            mo4099h().mo5545t(C1488o1.f4251l, yVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: C */
        public C1692c mo4856i(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4262h, size);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: D */
        public C1692c mo4857j(@C0359n0 SessionConfig sessionConfig) {
            mo4099h().mo5545t(C1488o1.f4250k, sessionConfig);
            return this;
        }

        @C0359n0
        /* renamed from: E */
        public C1692c mo5716E(int i) {
            mo4099h().mo5545t(C1471k0.f4227x, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: F */
        public C1692c mo5717F(@C0359n0 C1378c2 c2Var) {
            mo4099h().mo5545t(C1471k0.f4228y, c2Var);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: G */
        public C1692c mo4858k(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4263i, size);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: H */
        public C1692c mo4863p(@C0359n0 SessionConfig.C1426d dVar) {
            mo4099h().mo5545t(C1488o1.f4252m, dVar);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: I */
        public C1692c mo4864q(@C0359n0 List<Pair<Integer, Size[]>> list) {
            mo4099h().mo5545t(C1491p0.f4264j, list);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: J */
        public C1692c mo4866s(int i) {
            mo4099h().mo5545t(C1488o1.f4254o, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        /* renamed from: K */
        public C1692c mo4861n(int i) {
            mo4099h().mo5545t(C1491p0.f4259e, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: L */
        public C1692c mo4859l(@C0359n0 Class<C1689t0> cls) {
            mo4099h().mo5545t(C1611e.f4538s, cls);
            if (mo4099h().mo5131h(C1611e.f4537r, null) == null) {
                mo4855f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @C0359n0
        /* renamed from: M */
        public C1692c mo4855f(@C0359n0 String str) {
            mo4099h().mo5545t(C1611e.f4537r, str);
            return this;
        }

        @C0359n0
        /* renamed from: N */
        public C1692c mo4860m(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4261g, size);
            return this;
        }

        @C0359n0
        /* renamed from: O */
        public C1692c mo4853d(int i) {
            mo4099h().mo5545t(C1491p0.f4260f, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: P */
        public C1692c mo4851b(@C0359n0 UseCase.C1345b bVar) {
            mo4099h().mo5545t(C1615g.f4540u, bVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: h */
        public C1582x0 mo4099h() {
            return this.f4697a;
        }

        @C0359n0
        /* renamed from: t */
        public C1689t0 mo4098g() {
            if (mo4099h().mo5131h(C1491p0.f4259e, null) == null || mo4099h().mo5131h(C1491p0.f4261g, null) == null) {
                return new C1689t0(mo4862o());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: w */
        public C1471k0 mo4862o() {
            return new C1471k0(C1441c1.m6059b0(this.f4697a));
        }

        @C0359n0
        /* renamed from: x */
        public C1692c mo5052e(@C0359n0 Executor executor) {
            mo4099h().mo5545t(C1613f.f4539t, executor);
            return this;
        }

        @C0359n0
        /* renamed from: y */
        public C1692c mo5731y(int i) {
            mo4099h().mo5545t(C1471k0.f4226w, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: z */
        public C1692c mo4850a(@C0359n0 C1647n nVar) {
            mo4099h().mo5545t(C1488o1.f4255p, nVar);
            return this;
        }

        public C1692c(C1586y0 y0Var) {
            this.f4697a = y0Var;
            Class cls = (Class) y0Var.mo5131h(C1611e.f4538s, null);
            Class<C1689t0> cls2 = C1689t0.class;
            if (cls == null || cls.equals(cls2)) {
                mo4859l(cls2);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.camera.core.t0$d */
    public static final class C1693d implements C1437b0<C1471k0> {

        /* renamed from: a */
        public static final Size f4698a;

        /* renamed from: b */
        public static final Size f4699b;

        /* renamed from: c */
        public static final int f4700c = 1;

        /* renamed from: d */
        public static final int f4701d = 0;

        /* renamed from: e */
        public static final C1471k0 f4702e;

        static {
            Size size = new Size(640, C14092c.f34573Y0);
            f4698a = size;
            Size size2 = new Size(1920, 1080);
            f4699b = size2;
            f4702e = new C1692c().mo4856i(size).mo4858k(size2).mo4866s(1).mo4861n(0).mo4862o();
        }

        @C0359n0
        /* renamed from: b */
        public C1471k0 mo4877a() {
            return f4702e;
        }
    }

    public C1689t0(@C0359n0 C1471k0 k0Var) {
        super(k0Var);
        if (((C1471k0) mo4955f()).mo5235a0(0) == 1) {
            this.f4693l = new C1716x0();
        } else {
            this.f4693l = new C1723y0(k0Var.mo5603U(C1525a.m6438b()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m6842R(String str, C1471k0 k0Var, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        mo5703M();
        this.f4693l.mo5751g();
        if (mo4962o(str)) {
            mo4948H(mo5704N(str, k0Var, size).mo5166n());
            mo4966s();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m6843S(C1690a aVar, C1353a2 a2Var) {
        if (mo4961n() != null) {
            a2Var.mo4978y1(mo4961n());
        }
        aVar.mo5700a(a2Var);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: D */
    public Size mo4782D(@C0359n0 Size size) {
        mo4948H(mo5704N(mo4954e(), (C1471k0) mo4955f(), size).mo5166n());
        return size;
    }

    /* renamed from: L */
    public void mo5702L() {
        synchronized (this.f4694m) {
            this.f4693l.mo5754l((Executor) null, (C1690a) null);
            if (this.f4695n != null) {
                mo4965r();
            }
            this.f4695n = null;
        }
    }

    /* renamed from: M */
    public void mo5703M() {
        C1566j.m6506b();
        DeferrableSurface deferrableSurface = this.f4696o;
        if (deferrableSurface != null) {
            deferrableSurface.mo5136c();
            this.f4696o = null;
        }
    }

    /* renamed from: N */
    public SessionConfig.C1424b mo5704N(@C0359n0 String str, @C0359n0 C1471k0 k0Var, @C0359n0 Size size) {
        int i;
        C1362b3 b3Var;
        C1566j.m6506b();
        Executor executor = (Executor) C18001r.m81775l(k0Var.mo5603U(C1525a.m6438b()));
        if (mo5705O() == 1) {
            i = mo5706P();
        } else {
            i = 4;
        }
        int i2 = i;
        if (k0Var.mo5238d0() != null) {
            b3Var = new C1362b3(k0Var.mo5238d0().mo5075a(size.getWidth(), size.getHeight(), mo4956h(), i2, 0));
        } else {
            b3Var = new C1362b3(C1384d2.m5876a(size.getWidth(), size.getHeight(), mo4956h(), i2));
        }
        mo5710V();
        b3Var.mo5007f(this.f4693l, executor);
        SessionConfig.C1424b p = SessionConfig.C1424b.m6009p(k0Var);
        DeferrableSurface deferrableSurface = this.f4696o;
        if (deferrableSurface != null) {
            deferrableSurface.mo5136c();
        }
        C1503s0 s0Var = new C1503s0(b3Var.mo5002a());
        this.f4696o = s0Var;
        s0Var.mo5139f().mo5489q(new C1670q0(b3Var), C1525a.m6441e());
        p.mo5164l(this.f4696o);
        p.mo5159g(new C1675r0(this, str, k0Var, size));
        return p;
    }

    /* renamed from: O */
    public int mo5705O() {
        return ((C1471k0) mo4955f()).mo5235a0(0);
    }

    /* renamed from: P */
    public int mo5706P() {
        return ((C1471k0) mo4955f()).mo5237c0(6);
    }

    /* renamed from: Q */
    public int mo5707Q() {
        return mo4960l();
    }

    /* renamed from: T */
    public void mo5708T(@C0359n0 Executor executor, @C0359n0 C1690a aVar) {
        synchronized (this.f4694m) {
            this.f4693l.mo5754l(executor, new C1684s0(this, aVar));
            if (this.f4695n == null) {
                mo4964q();
            }
            this.f4695n = aVar;
        }
    }

    /* renamed from: U */
    public void mo5709U(int i) {
        if (mo4946F(i)) {
            mo5710V();
        }
    }

    /* renamed from: V */
    public final void mo5710V() {
        CameraInternal c = mo4952c();
        if (c != null) {
            this.f4693l.mo5755m(mo4958j(c));
        }
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public C1488o1<?> mo4801g(boolean z, @C0359n0 UseCaseConfigFactory useCaseConfigFactory) {
        Config a = useCaseConfigFactory.mo4721a(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
        if (z) {
            a = Config.m5971R(a, f4688r.mo4877a());
        }
        if (a == null) {
            return null;
        }
        return mo4807m(a).mo4862o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: m */
    public C1488o1.C1489a<?, ?, ?> mo4807m(@C0359n0 Config config) {
        return C1692c.m6859u(config);
    }

    @C0359n0
    public String toString() {
        return "ImageAnalysis:" + mo4957i();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: w */
    public void mo4817w() {
        this.f4693l.mo5750f();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: z */
    public void mo4819z() {
        mo5703M();
        this.f4693l.mo5752h();
    }
}
