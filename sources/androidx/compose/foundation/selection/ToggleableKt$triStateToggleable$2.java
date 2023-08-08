package androidx.compose.foundation.selection;

import androidx.compose.foundation.C2104a0;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.C2242f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.state.ToggleableState;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$triStateToggleable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,228:1\n25#2:229\n1114#3,6:230\n76#4:236\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$triStateToggleable$2\n*L\n166#1:229\n166#1:230,6\n167#1:236\n*E\n"})
public final class ToggleableKt$triStateToggleable$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ C16031g $role;
    final /* synthetic */ ToggleableState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$triStateToggleable$2(ToggleableState toggleableState, boolean z, C16031g gVar, C11289a<C11079d2> aVar) {
        super(3);
        this.$state = toggleableState;
        this.$enabled = z;
        this.$role = gVar;
        this.$onClick = aVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo9155a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(-1808118329);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1808118329, i, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:162)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        ToggleableState toggleableState = this.$state;
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = C2242f.m9684a();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8767m e = ToggleableKt.m12069e(aVar, toggleableState, (C2243g) N, (C2104a0) oVar.mo15032w(IndicationKt.m8972a()), this.$enabled, this.$role, this.$onClick);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return e;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo9155a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
