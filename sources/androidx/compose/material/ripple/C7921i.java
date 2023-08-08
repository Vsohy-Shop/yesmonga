package androidx.compose.material.ripple;

import androidx.compose.foundation.C2107b0;
import androidx.compose.foundation.interaction.C2240d;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.runtime.C8578k2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.material.ripple.i */
public abstract class C7921i implements C2107b0 {
    @C12579k

    /* renamed from: a */
    public final StateLayer f19045a;

    public C7921i(boolean z, @C12579k C8578k2<C7917e> k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "rippleAlpha");
        this.f19045a = new StateLayer(z, k2Var);
    }

    /* renamed from: b */
    public abstract void mo11002b(@C12579k C2245i.C2247b bVar, @C12579k C12074o0 o0Var);

    /* renamed from: c */
    public final void mo11063c(@C12579k C15187e eVar, float f, long j) {
        Intrinsics.checkNotNullParameter(eVar, "$this$drawStateLayer");
        this.f19045a.mo11046b(eVar, f, j);
    }

    /* renamed from: f */
    public abstract void mo11003f(@C12579k C2245i.C2247b bVar);

    /* renamed from: h */
    public final void mo11064h(@C12579k C2240d dVar, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(dVar, "interaction");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        this.f19045a.mo11047c(dVar, o0Var);
    }
}
