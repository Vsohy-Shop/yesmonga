package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.camera.core.C1635l;
import androidx.camera.core.impl.Config;

/* renamed from: androidx.camera.core.impl.j */
public interface C1464j extends C1455g1 {

    /* renamed from: a */
    public static final Config.C1421a<C1635l> f4221a = Config.C1421a.m5980a("camerax.core.camera.cameraFilter", C1635l.class);

    /* renamed from: b */
    public static final Config.C1421a<UseCaseConfigFactory> f4222b = Config.C1421a.m5980a("camerax.core.camera.useCaseConfigFactory", UseCaseConfigFactory.class);

    /* renamed from: androidx.camera.core.impl.j$a */
    public interface C1465a<B> {
        @C0359n0
        /* renamed from: a */
        B mo5232a(@C0359n0 UseCaseConfigFactory useCaseConfigFactory);

        @C0359n0
        /* renamed from: b */
        B mo5233b(@C0359n0 C1635l lVar);
    }

    @C0359n0
    /* renamed from: k */
    UseCaseConfigFactory mo5230k();

    @C0359n0
    /* renamed from: l */
    C1635l mo5231l() {
        return (C1635l) mo5131h(f4221a, C1490p.f4256a);
    }
}
