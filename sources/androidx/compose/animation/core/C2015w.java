package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.w */
public final class C2015w<T> implements C2013v<T> {
    @C12579k

    /* renamed from: a */
    public final C1965f0 f5637a;

    public C2015w(@C12579k C1965f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "floatDecaySpec");
        this.f5637a = f0Var;
    }

    @C12579k
    /* renamed from: a */
    public <V extends C1997o> C1963e1<V> mo6990a(@C12579k C1945a1<T, V> a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        return new C1978i1(this.f5637a);
    }
}
