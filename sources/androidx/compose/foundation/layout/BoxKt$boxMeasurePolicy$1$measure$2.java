package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BoxKt$boxMeasurePolicy$1$measure$2 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C8734c $alignment;
    final /* synthetic */ int $boxHeight;
    final /* synthetic */ int $boxWidth;
    final /* synthetic */ C15557e0 $measurable;
    final /* synthetic */ C15611w0 $placeable;
    final /* synthetic */ C15568h0 $this_MeasurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxKt$boxMeasurePolicy$1$measure$2(C15611w0 w0Var, C15557e0 e0Var, C15568h0 h0Var, int i, int i2, C8734c cVar) {
        super(1);
        this.$placeable = w0Var;
        this.$measurable = e0Var;
        this.$this_MeasurePolicy = h0Var;
        this.$boxWidth = i;
        this.$boxHeight = i2;
        this.$alignment = cVar;
    }

    /* renamed from: a */
    public final void mo7699a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        BoxKt.m9848j(aVar, this.$placeable, this.$measurable, this.$this_MeasurePolicy.getLayoutDirection(), this.$boxWidth, this.$boxHeight, this.$alignment);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7699a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
