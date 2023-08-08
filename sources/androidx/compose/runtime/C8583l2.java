package androidx.compose.runtime;

import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.l2 */
public final class C8583l2<T> extends C8550i1<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8583l2(@C12579k C11289a<? extends T> aVar) {
        super(aVar);
        Intrinsics.checkNotNullParameter(aVar, "defaultFactory");
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public C8578k2<T> mo16121e(T t, @C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1121811719);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1121811719, i, -1, "androidx.compose.runtime.StaticProvidableCompositionLocal.provided (CompositionLocal.kt:139)");
        }
        C8587m2 m2Var = new C8587m2(t);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return m2Var;
    }
}
