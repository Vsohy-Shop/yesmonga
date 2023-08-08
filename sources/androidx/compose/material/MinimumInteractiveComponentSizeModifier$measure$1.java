package androidx.compose.material;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MinimumInteractiveComponentSizeModifier$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ int $height;
    final /* synthetic */ C15611w0 $placeable;
    final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MinimumInteractiveComponentSizeModifier$measure$1(int i, C15611w0 w0Var, int i2) {
        super(1);
        this.$width = i;
        this.$placeable = w0Var;
        this.$height = i2;
    }

    /* renamed from: a */
    public final void mo10254a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0.C15612a aVar2 = aVar;
        C15611w0.C15612a.m69412p(aVar2, this.$placeable, C11409d.m43851L0(((float) (this.$width - this.$placeable.mo44471K0())) / 2.0f), C11409d.m43851L0(((float) (this.$height - this.$placeable.mo44468G0())) / 2.0f), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10254a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
