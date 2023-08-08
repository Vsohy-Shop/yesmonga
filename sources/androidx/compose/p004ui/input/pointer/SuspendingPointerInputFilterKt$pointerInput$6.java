package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11366s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt$pointerInput$6\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,643:1\n76#2:644\n76#2:645\n36#3:646\n1114#4,6:647\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt$pointerInput$6\n*L\n332#1:644\n333#1:645\n334#1:646\n334#1:647,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6 */
public final class SuspendingPointerInputFilterKt$pointerInput$6 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C11304p<C15472e0, C11045c<? super C11079d2>, Object> $block;
    final /* synthetic */ Object[] $keys;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilterKt$pointerInput$6(Object[] objArr, C11304p<? super C15472e0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        super(3);
        this.$keys = objArr;
        this.$block = pVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo44018a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(664422852);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(664422852, i, -1, "androidx.compose.ui.input.pointer.pointerInput.<anonymous> (SuspendingPointerInputFilter.kt:330)");
        }
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(dVar);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new SuspendingPointerInputFilter(c4Var, dVar);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        Object[] objArr = this.$keys;
        C11304p<C15472e0, C11045c<? super C11079d2>, Object> pVar = this.$block;
        SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) N;
        C11366s0 s0Var = new C11366s0(2);
        s0Var.mo22855a(suspendingPointerInputFilter);
        s0Var.mo22856b(objArr);
        EffectsKt.m29898j(s0Var.mo22858d(new Object[s0Var.mo22857c()]), new SuspendingPointerInputFilterKt$pointerInput$6$2$1(suspendingPointerInputFilter, pVar, (C11045c<? super SuspendingPointerInputFilterKt$pointerInput$6$2$1>) null), oVar, 72);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return suspendingPointerInputFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo44018a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
