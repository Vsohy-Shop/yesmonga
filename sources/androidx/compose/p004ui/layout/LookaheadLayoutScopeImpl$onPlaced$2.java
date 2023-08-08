package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLookaheadLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl$onPlaced$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,200:1\n25#2:201\n1114#3,6:202\n*S KotlinDebug\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl$onPlaced$2\n*L\n178#1:201\n178#1:202,6\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$onPlaced$2 */
public final class LookaheadLayoutScopeImpl$onPlaced$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C11304p<C15617y, C15617y, C11079d2> $onPlaced;
    final /* synthetic */ LookaheadLayoutScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookaheadLayoutScopeImpl$onPlaced$2(C11304p<? super C15617y, ? super C15617y, C11079d2> pVar, LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl) {
        super(3);
        this.$onPlaced = pVar;
        this.this$0 = lookaheadLayoutScopeImpl;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo44310a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(-814093691);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-814093691, i, -1, "androidx.compose.ui.layout.LookaheadLayoutScopeImpl.onPlaced.<anonymous> (LookaheadLayout.kt:176)");
        }
        C11304p<C15617y, C15617y, C11079d2> pVar = this.$onPlaced;
        LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl = this.this$0;
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = new C15549c0(pVar, new LookaheadLayoutScopeImpl$onPlaced$2$1$1(lookaheadLayoutScopeImpl));
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8767m k3 = mVar.mo17224k3((C8767m) N);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo44310a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
