package androidx.compose.runtime;

import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/DynamicProvidableCompositionLocal\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,255:1\n25#2:256\n1114#3,6:257\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/DynamicProvidableCompositionLocal\n*L\n126#1:256\n126#1:257,6\n*E\n"})
/* renamed from: androidx.compose.runtime.f0 */
public final class C8537f0<T> extends C8550i1<T> {
    @C12579k

    /* renamed from: d */
    public final C8410b2<T> f22974d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8537f0(@C12579k C8410b2<T> b2Var, @C12579k C11289a<? extends T> aVar) {
        super(aVar);
        Intrinsics.checkNotNullParameter(b2Var, "policy");
        Intrinsics.checkNotNullParameter(aVar, "defaultFactory");
        this.f22974d = b2Var;
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public C8578k2<T> mo16121e(T t, @C12580l C8592o oVar, int i) {
        oVar.mo14918M(-84026900);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-84026900, i, -1, "androidx.compose.runtime.DynamicProvidableCompositionLocal.provided (CompositionLocal.kt:125)");
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = C8415c2.m30241j(t, this.f22974d);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8700z0 z0Var = (C8700z0) N;
        z0Var.setValue(t);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return z0Var;
    }
}
