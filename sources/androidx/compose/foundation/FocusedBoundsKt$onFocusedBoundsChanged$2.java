package androidx.compose.foundation;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt$onFocusedBoundsChanged$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,123:1\n36#2:124\n1114#3,6:125\n*S KotlinDebug\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt$onFocusedBoundsChanged$2\n*L\n55#1:124\n55#1:125,6\n*E\n"})
public final class FocusedBoundsKt$onFocusedBoundsChanged$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C11300l<C15588o, C11079d2> $onPositioned;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusedBoundsKt$onFocusedBoundsChanged$2(C11300l<? super C15588o, C11079d2> lVar) {
        super(3);
        this.$onPositioned = lVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo7186a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(1176407768);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1176407768, i, -1, "androidx.compose.foundation.onFocusedBoundsChanged.<anonymous> (FocusedBounds.kt:53)");
        }
        C11300l<C15588o, C11079d2> lVar = this.$onPositioned;
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(lVar);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2862y(lVar);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2862y yVar = (C2862y) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return yVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7186a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
