package androidx.compose.p004ui;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/ui/m;", "acc", "Landroidx/compose/ui/m$c;", "element", "a", "(Landroidx/compose/ui/m;Landroidx/compose/ui/m$c;)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.ComposedModifierKt$materialize$result$1 */
public final class ComposedModifierKt$materialize$result$1 extends Lambda implements C11304p<C8767m, C8767m.C8770c, C8767m> {
    final /* synthetic */ C8592o $this_materialize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$materialize$result$1(C8592o oVar) {
        super(2);
        this.$this_materialize = oVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8767m invoke(@C12579k C8767m mVar, @C12579k C8767m.C8770c cVar) {
        Intrinsics.checkNotNullParameter(mVar, "acc");
        Intrinsics.checkNotNullParameter(cVar, "element");
        boolean z = cVar instanceof C8760f;
        C8767m mVar2 = cVar;
        if (z) {
            C11305q<C8767m, C8592o, Integer, C8767m> r = ((C8760f) cVar).mo17204r();
            Intrinsics.checkNotNull(r, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            mVar2 = ComposedModifierKt.m32288k(this.$this_materialize, (C8767m) ((C11305q) C11370u0.m43701q(r, 3)).invoke(C8767m.f23478j, this.$this_materialize, 0));
        }
        return mVar.mo17224k3(mVar2);
    }
}
