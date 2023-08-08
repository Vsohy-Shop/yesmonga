package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "Landroidx/compose/runtime/u;", "", "Landroidx/compose/runtime/k2;", "Landroidx/compose/runtime/CompositionLocalMap;", "a", "(Landroidx/compose/runtime/o;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ComposerImpl$startProviders$currentProviders$1 extends Lambda implements C11304p<C8592o, Integer, C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>>> {
    final /* synthetic */ C8452h<C8682u<Object>, C8578k2<Object>> $parentScope;
    final /* synthetic */ C8572j1<?>[] $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$startProviders$currentProviders$1(C8572j1<?>[] j1VarArr, C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar) {
        super(2);
        this.$values = j1VarArr;
        this.$parentScope = hVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8452h<C8682u<Object>, C8578k2<Object>> mo15099a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(935231726);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(935231726, i, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:2002)");
        }
        C8452h<C8682u<Object>, C8578k2<Object>> d = ComposerKt.m29775B(this.$values, this.$parentScope, oVar, 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo15099a((C8592o) obj, ((Number) obj2).intValue());
    }
}
