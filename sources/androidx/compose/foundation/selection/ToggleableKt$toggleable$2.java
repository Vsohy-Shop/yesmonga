package androidx.compose.foundation.selection;

import androidx.compose.foundation.C2104a0;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.C2242f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.semantics.C16031g;
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
@C11363r0({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,228:1\n25#2:229\n1114#3,6:230\n76#4:236\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n*L\n69#1:229\n69#1:230,6\n70#1:236\n*E\n"})
public final class ToggleableKt$toggleable$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onValueChange;
    final /* synthetic */ C16031g $role;
    final /* synthetic */ boolean $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleable$2(boolean z, boolean z2, C16031g gVar, C11300l<? super Boolean, C11079d2> lVar) {
        super(3);
        this.$value = z;
        this.$enabled = z2;
        this.$role = gVar;
        this.$onValueChange = lVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo9154a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(290332169);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(290332169, i, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:65)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        boolean z = this.$value;
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = C2242f.m9684a();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8767m a = ToggleableKt.m12065a(aVar, z, (C2243g) N, (C2104a0) oVar.mo15032w(IndicationKt.m8972a()), this.$enabled, this.$role, this.$onValueChange);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo9154a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
