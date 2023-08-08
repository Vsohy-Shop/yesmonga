package androidx.camera.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.C0341g1;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.annotation.experimental.C0335b;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C1430a0;
import androidx.camera.core.impl.C1437b0;
import androidx.camera.core.impl.C1441c1;
import androidx.camera.core.impl.C1444d1;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1456h;
import androidx.camera.core.impl.C1482n0;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1491p0;
import androidx.camera.core.impl.C1582x0;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.C1587z;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.C1566j;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.internal.C1592b;
import androidx.camera.core.internal.C1611e;
import androidx.camera.core.internal.C1613f;
import androidx.camera.core.internal.C1615g;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.r2 */
public final class C1677r2 extends UseCase {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: r */
    public static final C1680c f4663r = new C1680c();

    /* renamed from: s */
    public static final String f4664s = "Preview";

    /* renamed from: t */
    public static final Executor f4665t = C1525a.m6441e();
    @C0363p0

    /* renamed from: l */
    public C1681d f4666l;
    @C0359n0

    /* renamed from: m */
    public Executor f4667m = f4665t;

    /* renamed from: n */
    public DeferrableSurface f4668n;
    @C0363p0
    @C0344h1

    /* renamed from: o */
    public SurfaceRequest f4669o;

    /* renamed from: p */
    public boolean f4670p = false;
    @C0363p0

    /* renamed from: q */
    public Size f4671q;

    /* renamed from: androidx.camera.core.r2$a */
    public class C1678a extends C1448f {

        /* renamed from: a */
        public final /* synthetic */ C1482n0 f4672a;

        public C1678a(C1482n0 n0Var) {
            this.f4672a = n0Var;
        }

        /* renamed from: b */
        public void mo4263b(@C0359n0 C1456h hVar) {
            super.mo4263b(hVar);
            if (this.f4672a.mo5258a(new C1592b(hVar))) {
                C1677r2.this.mo4968u();
            }
        }
    }

    /* renamed from: androidx.camera.core.r2$b */
    public static final class C1679b implements C1488o1.C1489a<C1677r2, C1444d1, C1679b>, C1491p0.C1492a<C1679b>, C1613f.C1614a<C1679b> {

        /* renamed from: a */
        public final C1586y0 f4674a;

        public C1679b() {
            this(C1586y0.m6573d0());
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: u */
        public static C1679b m6792u(@C0359n0 Config config) {
            return new C1679b(C1586y0.m6574e0(config));
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: v */
        public static C1679b m6793v(@C0359n0 C1444d1 d1Var) {
            return new C1679b(C1586y0.m6574e0(d1Var));
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: A */
        public C1679b mo5678A(@C0359n0 C1587z zVar) {
            mo4099h().mo5545t(C1444d1.f4195x, zVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: B */
        public C1679b mo4865r(@C0359n0 C1583y yVar) {
            mo4099h().mo5545t(C1488o1.f4251l, yVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: C */
        public C1679b mo4856i(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4262h, size);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: D */
        public C1679b mo4857j(@C0359n0 SessionConfig sessionConfig) {
            mo4099h().mo5545t(C1488o1.f4250k, sessionConfig);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: E */
        public C1679b mo5682E(@C0359n0 C1482n0 n0Var) {
            mo4099h().mo5545t(C1444d1.f4194w, n0Var);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: F */
        public C1679b mo4858k(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4263i, size);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: G */
        public C1679b mo4863p(@C0359n0 SessionConfig.C1426d dVar) {
            mo4099h().mo5545t(C1488o1.f4252m, dVar);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: H */
        public C1679b mo4864q(@C0359n0 List<Pair<Integer, Size[]>> list) {
            mo4099h().mo5545t(C1491p0.f4264j, list);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: I */
        public C1679b mo4866s(int i) {
            mo4099h().mo5545t(C1488o1.f4254o, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        /* renamed from: J */
        public C1679b mo4861n(int i) {
            mo4099h().mo5545t(C1491p0.f4259e, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: K */
        public C1679b mo4859l(@C0359n0 Class<C1677r2> cls) {
            mo4099h().mo5545t(C1611e.f4538s, cls);
            if (mo4099h().mo5131h(C1611e.f4537r, null) == null) {
                mo4855f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @C0359n0
        /* renamed from: L */
        public C1679b mo4855f(@C0359n0 String str) {
            mo4099h().mo5545t(C1611e.f4537r, str);
            return this;
        }

        @C0359n0
        /* renamed from: M */
        public C1679b mo4860m(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4261g, size);
            return this;
        }

        @C0359n0
        /* renamed from: N */
        public C1679b mo4853d(int i) {
            mo4099h().mo5545t(C1491p0.f4260f, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: O */
        public C1679b mo4851b(@C0359n0 UseCase.C1345b bVar) {
            mo4099h().mo5545t(C1615g.f4540u, bVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: h */
        public C1582x0 mo4099h() {
            return this.f4674a;
        }

        @C0359n0
        /* renamed from: t */
        public C1677r2 mo4098g() {
            if (mo4099h().mo5131h(C1491p0.f4259e, null) == null || mo4099h().mo5131h(C1491p0.f4261g, null) == null) {
                return new C1677r2(mo4862o());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: w */
        public C1444d1 mo4862o() {
            return new C1444d1(C1441c1.m6059b0(this.f4674a));
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: x */
        public C1679b mo5052e(@C0359n0 Executor executor) {
            mo4099h().mo5545t(C1613f.f4539t, executor);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: y */
        public C1679b mo4850a(@C0359n0 C1647n nVar) {
            mo4099h().mo5545t(C1488o1.f4255p, nVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: z */
        public C1679b mo4852c(@C0359n0 C1583y.C1585b bVar) {
            mo4099h().mo5545t(C1488o1.f4253n, bVar);
            return this;
        }

        public C1679b(C1586y0 y0Var) {
            this.f4674a = y0Var;
            Class cls = (Class) y0Var.mo5131h(C1611e.f4538s, null);
            Class<C1677r2> cls2 = C1677r2.class;
            if (cls == null || cls.equals(cls2)) {
                mo4859l(cls2);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.camera.core.r2$c */
    public static final class C1680c implements C1437b0<C1444d1> {

        /* renamed from: a */
        public static final int f4675a = 2;

        /* renamed from: b */
        public static final int f4676b = 0;

        /* renamed from: c */
        public static final C1444d1 f4677c = new C1679b().mo4866s(2).mo4861n(0).mo4862o();

        @C0359n0
        /* renamed from: b */
        public C1444d1 mo4877a() {
            return f4677c;
        }
    }

    /* renamed from: androidx.camera.core.r2$d */
    public interface C1681d {
        /* renamed from: a */
        void mo5699a(@C0359n0 SurfaceRequest surfaceRequest);
    }

    @C0353k0
    public C1677r2(@C0359n0 C1444d1 d1Var) {
        super(d1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m6774O(String str, C1444d1 d1Var, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        if (mo4962o(str)) {
            mo4948H(mo5668L(str, d1Var, size).mo5166n());
            mo4966s();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.camera.core.m0, androidx.camera.core.impl.o1$a<?, ?, ?>, androidx.camera.core.impl.o1$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.C0359n0
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.C1488o1<?> mo4780A(@androidx.annotation.C0359n0 androidx.camera.core.impl.C1496q r3, @androidx.annotation.C0359n0 androidx.camera.core.impl.C1488o1.C1489a<?, ?, ?> r4) {
        /*
            r2 = this;
            androidx.camera.core.impl.x0 r3 = r4.mo4099h()
            androidx.camera.core.impl.Config$a<androidx.camera.core.impl.z> r0 = androidx.camera.core.impl.C1444d1.f4195x
            r1 = 0
            java.lang.Object r3 = r3.mo5131h(r0, r1)
            if (r3 == 0) goto L_0x001d
            androidx.camera.core.impl.x0 r3 = r4.mo4099h()
            androidx.camera.core.impl.Config$a<java.lang.Integer> r0 = androidx.camera.core.impl.C1487o0.f4249c
            r1 = 35
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.mo5545t(r0, r1)
            goto L_0x002c
        L_0x001d:
            androidx.camera.core.impl.x0 r3 = r4.mo4099h()
            androidx.camera.core.impl.Config$a<java.lang.Integer> r0 = androidx.camera.core.impl.C1487o0.f4249c
            r1 = 34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.mo5545t(r0, r1)
        L_0x002c:
            androidx.camera.core.impl.o1 r3 = r4.mo4862o()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1677r2.mo4780A(androidx.camera.core.impl.q, androidx.camera.core.impl.o1$a):androidx.camera.core.impl.o1");
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: D */
    public Size mo4782D(@C0359n0 Size size) {
        this.f4671q = size;
        mo5676V(mo4954e(), (C1444d1) mo4955f(), this.f4671q);
        return size;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C0335b(markerClass = C1631k0.class)
    /* renamed from: G */
    public void mo4947G(@C0359n0 Rect rect) {
        super.mo4947G(rect);
        mo5672R();
    }

    @C0335b(markerClass = C1631k0.class)
    /* renamed from: L */
    public SessionConfig.C1424b mo5668L(@C0359n0 String str, @C0359n0 C1444d1 d1Var, @C0359n0 Size size) {
        boolean z;
        C1444d1 d1Var2 = d1Var;
        Size size2 = size;
        C1566j.m6506b();
        SessionConfig.C1424b p = SessionConfig.C1424b.m6009p(d1Var);
        C1587z a0 = d1Var2.mo5207a0((C1587z) null);
        DeferrableSurface deferrableSurface = this.f4668n;
        if (deferrableSurface != null) {
            deferrableSurface.mo5136c();
        }
        CameraInternal c = mo4952c();
        if (a0 != null) {
            z = true;
        } else {
            z = false;
        }
        SurfaceRequest surfaceRequest = new SurfaceRequest(size2, c, z);
        this.f4669o = surfaceRequest;
        if (mo5671Q()) {
            mo5672R();
        } else {
            this.f4670p = true;
        }
        if (a0 != null) {
            C1430a0.C1431a aVar = new C1430a0.C1431a();
            HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String num = Integer.toString(aVar.hashCode());
            C1719x2 x2Var = r5;
            C1719x2 x2Var2 = new C1719x2(size.getWidth(), size.getHeight(), d1Var.mo5210o(), new Handler(handlerThread.getLooper()), aVar, a0, surfaceRequest.mo4927l(), num);
            p.mo5157e(x2Var.mo5760o());
            x2Var.mo5139f().mo5489q(new C1659o2(handlerThread), C1525a.m6437a());
            this.f4668n = x2Var;
            p.mo5165m(num, Integer.valueOf(aVar.getId()));
        } else {
            C1482n0 c0 = d1Var2.mo5209c0((C1482n0) null);
            if (c0 != null) {
                p.mo5157e(new C1678a(c0));
            }
            this.f4668n = surfaceRequest.mo4927l();
        }
        p.mo5164l(this.f4668n);
        p.mo5159g(new C1666p2(this, str, d1Var2, size2));
        return p;
    }

    @C0363p0
    /* renamed from: M */
    public final Rect mo5669M(@C0363p0 Size size) {
        if (mo4961n() != null) {
            return mo4961n();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* renamed from: N */
    public int mo5670N() {
        return mo4960l();
    }

    /* renamed from: Q */
    public final boolean mo5671Q() {
        SurfaceRequest surfaceRequest = this.f4669o;
        C1681d dVar = this.f4666l;
        if (dVar == null || surfaceRequest == null) {
            return false;
        }
        this.f4667m.execute(new C1672q2(dVar, surfaceRequest));
        return true;
    }

    @C1631k0
    /* renamed from: R */
    public final void mo5672R() {
        CameraInternal c = mo4952c();
        C1681d dVar = this.f4666l;
        Rect M = mo5669M(this.f4671q);
        SurfaceRequest surfaceRequest = this.f4669o;
        if (c != null && dVar != null && M != null) {
            surfaceRequest.mo4932y(SurfaceRequest.C1342f.m5643d(M, mo4958j(c), mo5670N()));
        }
    }

    @C0341g1
    /* renamed from: S */
    public void mo5673S(@C0363p0 C1681d dVar) {
        mo5674T(f4665t, dVar);
    }

    @C0341g1
    @C0335b(markerClass = C1631k0.class)
    /* renamed from: T */
    public void mo5674T(@C0359n0 Executor executor, @C0363p0 C1681d dVar) {
        C1566j.m6506b();
        if (dVar == null) {
            this.f4666l = null;
            mo4965r();
            return;
        }
        this.f4666l = dVar;
        this.f4667m = executor;
        mo4964q();
        if (this.f4670p) {
            if (mo5671Q()) {
                mo5672R();
                this.f4670p = false;
            }
        } else if (mo4951b() != null) {
            mo5676V(mo4954e(), (C1444d1) mo4955f(), mo4951b());
            mo4966s();
        }
    }

    @C1631k0
    /* renamed from: U */
    public void mo5675U(int i) {
        if (mo4946F(i)) {
            mo5672R();
        }
    }

    /* renamed from: V */
    public final void mo5676V(@C0359n0 String str, @C0359n0 C1444d1 d1Var, @C0359n0 Size size) {
        mo4948H(mo5668L(str, d1Var, size).mo5166n());
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public C1488o1<?> mo4801g(boolean z, @C0359n0 UseCaseConfigFactory useCaseConfigFactory) {
        Config a = useCaseConfigFactory.mo4721a(UseCaseConfigFactory.CaptureType.PREVIEW);
        if (z) {
            a = Config.m5971R(a, f4663r.mo4877a());
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
        return C1679b.m6792u(config);
    }

    @C0359n0
    public String toString() {
        return "Preview:" + mo4957i();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: z */
    public void mo4819z() {
        DeferrableSurface deferrableSurface = this.f4668n;
        if (deferrableSurface != null) {
            deferrableSurface.mo5136c();
        }
        this.f4669o = null;
    }
}
