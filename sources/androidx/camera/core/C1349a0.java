package androidx.camera.core;

import android.os.Handler;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.C1441c1;
import androidx.camera.core.impl.C1473l;
import androidx.camera.core.impl.C1477m;
import androidx.camera.core.impl.C1582x0;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.C1611e;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.a0 */
public final class C1349a0 implements C1611e<CameraX> {

    /* renamed from: A */
    public static final Config.C1421a<Handler> f3905A = Config.C1421a.m5980a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: B */
    public static final Config.C1421a<Integer> f3906B = Config.C1421a.m5980a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: C */
    public static final Config.C1421a<C1647n> f3907C = Config.C1421a.m5980a("camerax.core.appConfig.availableCamerasLimiter", C1647n.class);

    /* renamed from: w */
    public static final Config.C1421a<C1477m.C1478a> f3908w = Config.C1421a.m5980a("camerax.core.appConfig.cameraFactoryProvider", C1477m.C1478a.class);

    /* renamed from: x */
    public static final Config.C1421a<C1473l.C1474a> f3909x = Config.C1421a.m5980a("camerax.core.appConfig.deviceSurfaceManagerProvider", C1473l.C1474a.class);

    /* renamed from: y */
    public static final Config.C1421a<UseCaseConfigFactory.C1428a> f3910y = Config.C1421a.m5980a("camerax.core.appConfig.useCaseConfigFactoryProvider", UseCaseConfigFactory.C1428a.class);

    /* renamed from: z */
    public static final Config.C1421a<Executor> f3911z = Config.C1421a.m5980a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: v */
    public final C1441c1 f3912v;

    /* renamed from: androidx.camera.core.a0$a */
    public static final class C1350a implements C1611e.C1612a<CameraX, C1350a> {

        /* renamed from: a */
        public final C1586y0 f3913a;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public C1350a() {
            this(C1586y0.m6573d0());
        }

        @C0359n0
        /* renamed from: d */
        public static C1350a m5704d(@C0359n0 C1349a0 a0Var) {
            return new C1350a(C1586y0.m6574e0(a0Var));
        }

        @C0359n0
        /* renamed from: b */
        public C1349a0 mo4986b() {
            return new C1349a0(C1441c1.m6059b0(this.f3913a));
        }

        @C0359n0
        /* renamed from: e */
        public final C1582x0 mo4987e() {
            return this.f3913a;
        }

        @C0359n0
        @C1390e0
        /* renamed from: g */
        public C1350a mo4988g(@C0359n0 C1647n nVar) {
            mo4987e().mo5545t(C1349a0.f3907C, nVar);
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C1350a mo4989h(@C0359n0 Executor executor) {
            mo4987e().mo5545t(C1349a0.f3911z, executor);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: i */
        public C1350a mo4990i(@C0359n0 C1477m.C1478a aVar) {
            mo4987e().mo5545t(C1349a0.f3908w, aVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: k */
        public C1350a mo4991k(@C0359n0 C1473l.C1474a aVar) {
            mo4987e().mo5545t(C1349a0.f3909x, aVar);
            return this;
        }

        @C1625j0
        @C0359n0
        /* renamed from: m */
        public C1350a mo4992m(@C0337f0(from = 3, mo995to = 6) int i) {
            mo4987e().mo5545t(C1349a0.f3906B, Integer.valueOf(i));
            return this;
        }

        @C1405g0
        @C0359n0
        /* renamed from: n */
        public C1350a mo4993n(@C0359n0 Handler handler) {
            mo4987e().mo5545t(C1349a0.f3905A, handler);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: q */
        public C1350a mo4859l(@C0359n0 Class<CameraX> cls) {
            mo4987e().mo5545t(C1611e.f4538s, cls);
            if (mo4987e().mo5131h(C1611e.f4537r, null) == null) {
                mo4855f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: t */
        public C1350a mo4855f(@C0359n0 String str) {
            mo4987e().mo5545t(C1611e.f4537r, str);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: u */
        public C1350a mo4996u(@C0359n0 UseCaseConfigFactory.C1428a aVar) {
            mo4987e().mo5545t(C1349a0.f3910y, aVar);
            return this;
        }

        public C1350a(C1586y0 y0Var) {
            this.f3913a = y0Var;
            Class cls = (Class) y0Var.mo5131h(C1611e.f4538s, null);
            Class<CameraX> cls2 = CameraX.class;
            if (cls == null || cls.equals(cls2)) {
                mo4859l(cls2);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* renamed from: androidx.camera.core.a0$b */
    public interface C1351b {
        @C0359n0
        C1349a0 getCameraXConfig();
    }

    public C1349a0(C1441c1 c1Var) {
        this.f3912v = c1Var;
    }

    @C0363p0
    @C1390e0
    /* renamed from: Z */
    public C1647n mo4979Z(@C0363p0 C1647n nVar) {
        return (C1647n) this.f3912v.mo5131h(f3907C, nVar);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public Config mo4458a() {
        return this.f3912v;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a0 */
    public Executor mo4980a0(@C0363p0 Executor executor) {
        return (Executor) this.f3912v.mo5131h(f3911z, executor);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b0 */
    public C1477m.C1478a mo4981b0(@C0363p0 C1477m.C1478a aVar) {
        return (C1477m.C1478a) this.f3912v.mo5131h(f3908w, aVar);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c0 */
    public C1473l.C1474a mo4982c0(@C0363p0 C1473l.C1474a aVar) {
        return (C1473l.C1474a) this.f3912v.mo5131h(f3909x, aVar);
    }

    @C1625j0
    /* renamed from: d0 */
    public int mo4983d0() {
        return ((Integer) this.f3912v.mo5131h(f3906B, 3)).intValue();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e0 */
    public Handler mo4984e0(@C0363p0 Handler handler) {
        return (Handler) this.f3912v.mo5131h(f3905A, handler);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f0 */
    public UseCaseConfigFactory.C1428a mo4985f0(@C0363p0 UseCaseConfigFactory.C1428a aVar) {
        return (UseCaseConfigFactory.C1428a) this.f3912v.mo5131h(f3910y, aVar);
    }
}
