package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OutlinedTextFieldMeasurePolicy$measure$2 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $containerPlaceable;
    final /* synthetic */ C15611w0 $labelPlaceable;
    final /* synthetic */ C15611w0 $leadingPlaceable;
    final /* synthetic */ C15611w0 $placeholderPlaceable;
    final /* synthetic */ C15611w0 $prefixPlaceable;
    final /* synthetic */ C15611w0 $suffixPlaceable;
    final /* synthetic */ C15611w0 $supportingPlaceable;
    final /* synthetic */ C15611w0 $textFieldPlaceable;
    final /* synthetic */ C15568h0 $this_measure;
    final /* synthetic */ int $totalHeight;
    final /* synthetic */ C15611w0 $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ OutlinedTextFieldMeasurePolicy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldMeasurePolicy$measure$2(int i, int i2, C15611w0 w0Var, C15611w0 w0Var2, C15611w0 w0Var3, C15611w0 w0Var4, C15611w0 w0Var5, C15611w0 w0Var6, C15611w0 w0Var7, C15611w0 w0Var8, C15611w0 w0Var9, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, C15568h0 h0Var) {
        super(1);
        this.$totalHeight = i;
        this.$width = i2;
        this.$leadingPlaceable = w0Var;
        this.$trailingPlaceable = w0Var2;
        this.$prefixPlaceable = w0Var3;
        this.$suffixPlaceable = w0Var4;
        this.$textFieldPlaceable = w0Var5;
        this.$labelPlaceable = w0Var6;
        this.$placeholderPlaceable = w0Var7;
        this.$containerPlaceable = w0Var8;
        this.$supportingPlaceable = w0Var9;
        this.this$0 = outlinedTextFieldMeasurePolicy;
        this.$this_measure = h0Var;
    }

    /* renamed from: a */
    public final void mo11774a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0.C15612a aVar2 = aVar;
        OutlinedTextFieldKt.m26006n(aVar2, this.$totalHeight, this.$width, this.$leadingPlaceable, this.$trailingPlaceable, this.$prefixPlaceable, this.$suffixPlaceable, this.$textFieldPlaceable, this.$labelPlaceable, this.$placeholderPlaceable, this.$containerPlaceable, this.$supportingPlaceable, this.this$0.f19542c, this.this$0.f19541b, this.$this_measure.getDensity(), this.$this_measure.getLayoutDirection(), this.this$0.f19543d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11774a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
