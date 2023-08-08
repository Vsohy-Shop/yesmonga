package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "b", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,111:1\n36#2:112\n1114#3,6:113\n76#4:119\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n*L\n69#1:112\n69#1:113,6\n68#1:119\n*E\n"})
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C11289a<C15094f> $magnifierCenter;
    final /* synthetic */ C11300l<C11289a<C15094f>, C8767m> $platformMagnifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1(C11289a<C15094f> aVar, C11300l<? super C11289a<C15094f>, ? extends C8767m> lVar) {
        super(3);
        this.$magnifierCenter = aVar;
        this.$platformMagnifier = lVar;
    }

    /* renamed from: c */
    public static final long m12717c(C8578k2<C15094f> k2Var) {
        return k2Var.getValue().mo42242A();
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public final C8767m mo9618b(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(759876635);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(759876635, i, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:66)");
        }
        C8578k2 e = SelectionMagnifierKt.m12712h(this.$magnifierCenter, oVar, 0);
        C11300l<C11289a<C15094f>, C8767m> lVar = this.$platformMagnifier;
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(e);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(e);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8767m invoke = lVar.invoke(N);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return invoke;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo9618b((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
