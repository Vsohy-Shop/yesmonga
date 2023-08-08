package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1643m0;
import androidx.camera.core.C1647n;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.internal.C1611e;
import androidx.camera.core.internal.C1615g;

/* renamed from: androidx.camera.core.impl.o1 */
public interface C1488o1<T extends UseCase> extends C1611e<T>, C1615g, C1487o0 {

    /* renamed from: k */
    public static final Config.C1421a<SessionConfig> f4250k = Config.C1421a.m5980a("camerax.core.useCase.defaultSessionConfig", SessionConfig.class);

    /* renamed from: l */
    public static final Config.C1421a<C1583y> f4251l = Config.C1421a.m5980a("camerax.core.useCase.defaultCaptureConfig", C1583y.class);

    /* renamed from: m */
    public static final Config.C1421a<SessionConfig.C1426d> f4252m = Config.C1421a.m5980a("camerax.core.useCase.sessionConfigUnpacker", SessionConfig.C1426d.class);

    /* renamed from: n */
    public static final Config.C1421a<C1583y.C1585b> f4253n = Config.C1421a.m5980a("camerax.core.useCase.captureConfigUnpacker", C1583y.C1585b.class);

    /* renamed from: o */
    public static final Config.C1421a<Integer> f4254o = Config.C1421a.m5980a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    /* renamed from: p */
    public static final Config.C1421a<C1647n> f4255p = Config.C1421a.m5980a("camerax.core.useCase.cameraSelector", C1647n.class);

    /* renamed from: androidx.camera.core.impl.o1$a */
    public interface C1489a<T extends UseCase, C extends C1488o1<T>, B> extends C1611e.C1612a<T, B>, C1643m0<T>, C1615g.C1616a<B> {
        @C0359n0
        /* renamed from: a */
        B mo4850a(@C0359n0 C1647n nVar);

        @C0359n0
        /* renamed from: c */
        B mo4852c(@C0359n0 C1583y.C1585b bVar);

        @C0359n0
        /* renamed from: j */
        B mo4857j(@C0359n0 SessionConfig sessionConfig);

        @C0359n0
        /* renamed from: o */
        C mo4862o();

        @C0359n0
        /* renamed from: p */
        B mo4863p(@C0359n0 SessionConfig.C1426d dVar);

        @C0359n0
        /* renamed from: r */
        B mo4865r(@C0359n0 C1583y yVar);

        @C0359n0
        /* renamed from: s */
        B mo4866s(int i);
    }

    /* renamed from: C */
    int mo5278C(int i) {
        return ((Integer) mo5131h(f4254o, Integer.valueOf(i))).intValue();
    }

    @C0359n0
    /* renamed from: H */
    C1583y.C1585b mo5279H() {
        return (C1583y.C1585b) mo5125b(f4253n);
    }

    @C0359n0
    /* renamed from: K */
    SessionConfig mo5280K() {
        return (SessionConfig) mo5125b(f4250k);
    }

    /* renamed from: L */
    int mo5281L() {
        return ((Integer) mo5125b(f4254o)).intValue();
    }

    @C0359n0
    /* renamed from: M */
    SessionConfig.C1426d mo5282M() {
        return (SessionConfig.C1426d) mo5125b(f4252m);
    }

    @C0359n0
    /* renamed from: Q */
    C1647n mo5283Q() {
        return (C1647n) mo5125b(f4255p);
    }

    @C0359n0
    /* renamed from: S */
    C1583y mo5284S() {
        return (C1583y) mo5125b(f4251l);
    }

    @C0363p0
    /* renamed from: V */
    C1647n mo5285V(@C0363p0 C1647n nVar) {
        return (C1647n) mo5131h(f4255p, nVar);
    }

    @C0363p0
    /* renamed from: X */
    SessionConfig.C1426d mo5286X(@C0363p0 SessionConfig.C1426d dVar) {
        return (SessionConfig.C1426d) mo5131h(f4252m, dVar);
    }

    @C0363p0
    /* renamed from: p */
    SessionConfig mo5287p(@C0363p0 SessionConfig sessionConfig) {
        return (SessionConfig) mo5131h(f4250k, sessionConfig);
    }

    @C0363p0
    /* renamed from: r */
    C1583y.C1585b mo5288r(@C0363p0 C1583y.C1585b bVar) {
        return (C1583y.C1585b) mo5131h(f4253n, bVar);
    }

    @C0363p0
    /* renamed from: u */
    C1583y mo5289u(@C0363p0 C1583y yVar) {
        return (C1583y) mo5131h(f4251l, yVar);
    }
}
