package androidx.camera.core.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C1455g1;
import androidx.camera.core.impl.Config;

/* renamed from: androidx.camera.core.internal.g */
public interface C1615g extends C1455g1 {

    /* renamed from: u */
    public static final Config.C1421a<UseCase.C1345b> f4540u = Config.C1421a.m5980a("camerax.core.useCaseEventCallback", UseCase.C1345b.class);

    /* renamed from: androidx.camera.core.internal.g$a */
    public interface C1616a<B> {
        @C0359n0
        /* renamed from: b */
        B mo4851b(@C0359n0 UseCase.C1345b bVar);
    }

    @C0359n0
    /* renamed from: G */
    UseCase.C1345b mo5605G() {
        return (UseCase.C1345b) mo5125b(f4540u);
    }

    @C0363p0
    /* renamed from: W */
    UseCase.C1345b mo5606W(@C0363p0 UseCase.C1345b bVar) {
        return (UseCase.C1345b) mo5131h(f4540u, bVar);
    }
}
