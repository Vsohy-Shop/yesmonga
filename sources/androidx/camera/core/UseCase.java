package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.C0323b0;
import androidx.annotation.C0337f0;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1491p0;
import androidx.camera.core.impl.C1496q;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.C1611e;
import androidx.camera.core.internal.utils.C1621a;
import androidx.core.util.C18001r;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class UseCase {

    /* renamed from: a */
    public final Set<C1346c> f3886a = new HashSet();

    /* renamed from: b */
    public final Object f3887b = new Object();

    /* renamed from: c */
    public State f3888c = State.INACTIVE;
    @C0363p0

    /* renamed from: d */
    public C1488o1<?> f3889d;
    @C0359n0

    /* renamed from: e */
    public C1488o1<?> f3890e;
    @C0359n0

    /* renamed from: f */
    public C1488o1<?> f3891f;

    /* renamed from: g */
    public Size f3892g;
    @C0363p0

    /* renamed from: h */
    public C1488o1<?> f3893h;
    @C0363p0

    /* renamed from: i */
    public Rect f3894i;
    @C0323b0("mCameraLock")

    /* renamed from: j */
    public CameraInternal f3895j;

    /* renamed from: k */
    public SessionConfig f3896k = SessionConfig.m5999a();

    public enum State {
        ACTIVE,
        INACTIVE
    }

    /* renamed from: androidx.camera.core.UseCase$a */
    public static /* synthetic */ class C1344a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3900a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.camera.core.UseCase$State[] r0 = androidx.camera.core.UseCase.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3900a = r0
                androidx.camera.core.UseCase$State r1 = androidx.camera.core.UseCase.State.INACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3900a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.UseCase$State r1 = androidx.camera.core.UseCase.State.ACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.UseCase.C1344a.<clinit>():void");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.camera.core.UseCase$b */
    public interface C1345b {
        /* renamed from: a */
        void mo4971a(@C0359n0 C1641m mVar);

        /* renamed from: b */
        void mo4972b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.camera.core.UseCase$c */
    public interface C1346c {
        /* renamed from: f */
        void mo4131f(@C0359n0 UseCase useCase);

        /* renamed from: g */
        void mo4132g(@C0359n0 UseCase useCase);

        /* renamed from: i */
        void mo4134i(@C0359n0 UseCase useCase);

        /* renamed from: n */
        void mo4143n(@C0359n0 UseCase useCase);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCase(@C0359n0 C1488o1<?> o1Var) {
        this.f3890e = o1Var;
        this.f3891f = o1Var;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.impl.o1$a<?, ?, ?>, androidx.camera.core.impl.o1$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.C0359n0
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.C1488o1<?> mo4780A(@androidx.annotation.C0359n0 androidx.camera.core.impl.C1496q r1, @androidx.annotation.C0359n0 androidx.camera.core.impl.C1488o1.C1489a<?, ?, ?> r2) {
        /*
            r0 = this;
            androidx.camera.core.impl.o1 r1 = r2.mo4862o()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.UseCase.mo4780A(androidx.camera.core.impl.q, androidx.camera.core.impl.o1$a):androidx.camera.core.impl.o1");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0346i
    /* renamed from: B */
    public void mo4944B() {
        mo4818x();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: C */
    public void mo4781C() {
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: D */
    public abstract Size mo4782D(@C0359n0 Size size);

    /* renamed from: E */
    public final void mo4945E(@C0359n0 C1346c cVar) {
        this.f3886a.remove(cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: F */
    public boolean mo4946F(int i) {
        int F = ((C1491p0) mo4955f()).mo5293F(-1);
        if (F != -1 && F == i) {
            return false;
        }
        C1488o1.C1489a m = mo4807m(this.f3890e);
        C1621a.m6677a(m, i);
        this.f3890e = m.mo4862o();
        CameraInternal c = mo4952c();
        if (c == null) {
            this.f3891f = this.f3890e;
            return true;
        }
        this.f3891f = mo4963p(c.mo4139l(), this.f3889d, this.f3893h);
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: G */
    public void mo4947G(@C0359n0 Rect rect) {
        this.f3894i = rect;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: H */
    public void mo4948H(@C0359n0 SessionConfig sessionConfig) {
        this.f3896k = sessionConfig;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: I */
    public void mo4949I(@C0359n0 Size size) {
        this.f3892g = mo4782D(size);
    }

    /* renamed from: a */
    public final void mo4950a(@C0359n0 C1346c cVar) {
        this.f3886a.add(cVar);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public Size mo4951b() {
        return this.f3892g;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public CameraInternal mo4952c() {
        CameraInternal cameraInternal;
        synchronized (this.f3887b) {
            cameraInternal = this.f3895j;
        }
        return cameraInternal;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public CameraControlInternal mo4953d() {
        synchronized (this.f3887b) {
            CameraInternal cameraInternal = this.f3895j;
            if (cameraInternal == null) {
                CameraControlInternal cameraControlInternal = CameraControlInternal.f4120a;
                return cameraControlInternal;
            }
            CameraControlInternal h = cameraInternal.mo4133h();
            return h;
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public String mo4954e() {
        CameraInternal c = mo4952c();
        return ((CameraInternal) C18001r.m81776m(c, "No camera attached to use case: " + this)).mo4139l().mo4592b();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public C1488o1<?> mo4955f() {
        return this.f3891f;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public abstract C1488o1<?> mo4801g(boolean z, @C0359n0 UseCaseConfigFactory useCaseConfigFactory);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public int mo4956h() {
        return this.f3891f.mo5210o();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: i */
    public String mo4957i() {
        C1488o1<?> o1Var = this.f3891f;
        return o1Var.mo5602v("<UnknownUseCase-" + hashCode() + ">");
    }

    @C0337f0(from = 0, mo995to = 359)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: j */
    public int mo4958j(@C0359n0 CameraInternal cameraInternal) {
        return cameraInternal.mo4139l().mo4601k(mo4960l());
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public SessionConfig mo4959k() {
        return this.f3896k;
    }

    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public int mo4960l() {
        return ((C1491p0) this.f3891f).mo5293F(0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: m */
    public abstract C1488o1.C1489a<?, ?, ?> mo4807m(@C0359n0 Config config);

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: n */
    public Rect mo4961n() {
        return this.f3894i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: o */
    public boolean mo4962o(@C0359n0 String str) {
        if (mo4952c() == null) {
            return false;
        }
        return Objects.equals(str, mo4954e());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: p */
    public C1488o1<?> mo4963p(@C0359n0 C1496q qVar, @C0363p0 C1488o1<?> o1Var, @C0363p0 C1488o1<?> o1Var2) {
        C1586y0 y0Var;
        if (o1Var2 != null) {
            y0Var = C1586y0.m6574e0(o1Var2);
            y0Var.mo5546z(C1611e.f4537r);
        } else {
            y0Var = C1586y0.m6573d0();
        }
        for (Config.C1421a next : this.f3890e.mo5129f()) {
            y0Var.mo5544q(next, this.f3890e.mo5132i(next), this.f3890e.mo5125b(next));
        }
        if (o1Var != null) {
            for (Config.C1421a next2 : o1Var.mo5129f()) {
                if (!next2.mo5133c().equals(C1611e.f4537r.mo5133c())) {
                    y0Var.mo5544q(next2, o1Var.mo5132i(next2), o1Var.mo5125b(next2));
                }
            }
        }
        if (y0Var.mo5126c(C1491p0.f4261g)) {
            Config.C1421a<Integer> aVar = C1491p0.f4259e;
            if (y0Var.mo5126c(aVar)) {
                y0Var.mo5546z(aVar);
            }
        }
        return mo4780A(qVar, mo4807m(y0Var));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: q */
    public final void mo4964q() {
        this.f3888c = State.ACTIVE;
        mo4967t();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public final void mo4965r() {
        this.f3888c = State.INACTIVE;
        mo4967t();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: s */
    public final void mo4966s() {
        for (C1346c i : this.f3886a) {
            i.mo4134i(this);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: t */
    public final void mo4967t() {
        int i = C1344a.f3900a[this.f3888c.ordinal()];
        if (i == 1) {
            for (C1346c n : this.f3886a) {
                n.mo4143n(this);
            }
        } else if (i == 2) {
            for (C1346c f : this.f3886a) {
                f.mo4131f(this);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: u */
    public final void mo4968u() {
        for (C1346c g : this.f3886a) {
            g.mo4132g(this);
        }
    }

    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: v */
    public void mo4969v(@C0359n0 CameraInternal cameraInternal, @C0363p0 C1488o1<?> o1Var, @C0363p0 C1488o1<?> o1Var2) {
        synchronized (this.f3887b) {
            this.f3895j = cameraInternal;
            mo4950a(cameraInternal);
        }
        this.f3889d = o1Var;
        this.f3893h = o1Var2;
        C1488o1<?> p = mo4963p(cameraInternal.mo4139l(), this.f3889d, this.f3893h);
        this.f3891f = p;
        C1345b W = p.mo5606W((C1345b) null);
        if (W != null) {
            W.mo4971a(cameraInternal.mo4139l());
        }
        mo4817w();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: w */
    public void mo4817w() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: x */
    public void mo4818x() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: y */
    public void mo4970y(@C0359n0 CameraInternal cameraInternal) {
        boolean z;
        mo4819z();
        C1345b W = this.f3891f.mo5606W((C1345b) null);
        if (W != null) {
            W.mo4972b();
        }
        synchronized (this.f3887b) {
            if (cameraInternal == this.f3895j) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81764a(z);
            mo4945E(this.f3895j);
            this.f3895j = null;
        }
        this.f3892g = null;
        this.f3894i = null;
        this.f3891f = this.f3890e;
        this.f3889d = null;
        this.f3893h = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: z */
    public void mo4819z() {
    }
}
