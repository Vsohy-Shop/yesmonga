package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class RowColumnImplKt$rowColumnMeasurePolicy$1$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C2404r0 $measureResult;
    final /* synthetic */ C2407s0 $rowColumnMeasureHelper;
    final /* synthetic */ C15568h0 $this_measure;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RowColumnImplKt$rowColumnMeasurePolicy$1$measure$1(C2407s0 s0Var, C2404r0 r0Var, C15568h0 h0Var) {
        super(1);
        this.$rowColumnMeasureHelper = s0Var;
        this.$measureResult = r0Var;
        this.$this_measure = h0Var;
    }

    /* renamed from: a */
    public final void mo7838a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        this.$rowColumnMeasureHelper.mo8176m(aVar, this.$measureResult, 0, this.$this_measure.getLayoutDirection());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7838a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
