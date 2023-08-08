package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,186:1\n36#2:187\n1114#3,6:188\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n*L\n111#1:187\n111#1:188,6\n*E\n"})
public final class IndicationKt$indication$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C2104a0 $indication;
    final /* synthetic */ C2241e $interactionSource;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$2(C2104a0 a0Var, C2241e eVar) {
        super(3);
        this.$indication = a0Var;
        this.$interactionSource = eVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo7200a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(-353972293);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-353972293, i, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:107)");
        }
        C2104a0 a0Var = this.$indication;
        if (a0Var == null) {
            a0Var = C2220h0.f5972a;
        }
        C2107b0 a = a0Var.mo7284a(this.$interactionSource, oVar, 0);
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(a);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2110c0(a);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2110c0 c0Var = (C2110c0) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7200a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
