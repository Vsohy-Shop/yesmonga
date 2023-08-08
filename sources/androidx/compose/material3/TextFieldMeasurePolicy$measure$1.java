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
public final class TextFieldMeasurePolicy$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $containerPlaceable;
    final /* synthetic */ C15611w0 $labelPlaceable;
    final /* synthetic */ C15611w0 $leadingPlaceable;
    final /* synthetic */ C15611w0 $placeholderPlaceable;
    final /* synthetic */ C15611w0 $prefixPlaceable;
    final /* synthetic */ C15611w0 $suffixPlaceable;
    final /* synthetic */ C15611w0 $supportingPlaceable;
    final /* synthetic */ C15611w0 $textFieldPlaceable;
    final /* synthetic */ C15568h0 $this_measure;
    final /* synthetic */ int $topPaddingValue;
    final /* synthetic */ int $totalHeight;
    final /* synthetic */ C15611w0 $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ TextFieldMeasurePolicy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldMeasurePolicy$measure$1(C15611w0 w0Var, int i, int i2, C15611w0 w0Var2, C15611w0 w0Var3, C15611w0 w0Var4, C15611w0 w0Var5, C15611w0 w0Var6, C15611w0 w0Var7, C15611w0 w0Var8, C15611w0 w0Var9, TextFieldMeasurePolicy textFieldMeasurePolicy, int i3, C15568h0 h0Var) {
        super(1);
        this.$labelPlaceable = w0Var;
        this.$width = i;
        this.$totalHeight = i2;
        this.$textFieldPlaceable = w0Var2;
        this.$placeholderPlaceable = w0Var3;
        this.$leadingPlaceable = w0Var4;
        this.$trailingPlaceable = w0Var5;
        this.$prefixPlaceable = w0Var6;
        this.$suffixPlaceable = w0Var7;
        this.$containerPlaceable = w0Var8;
        this.$supportingPlaceable = w0Var9;
        this.this$0 = textFieldMeasurePolicy;
        this.$topPaddingValue = i3;
        this.$this_measure = h0Var;
    }

    /* renamed from: a */
    public final void mo12246a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0 w0Var = this.$labelPlaceable;
        if (w0Var != null) {
            int i = this.$width;
            int i2 = this.$totalHeight;
            C15611w0 w0Var2 = this.$textFieldPlaceable;
            C15611w0 w0Var3 = this.$placeholderPlaceable;
            C15611w0 w0Var4 = this.$leadingPlaceable;
            C15611w0 w0Var5 = this.$trailingPlaceable;
            C15611w0 w0Var6 = this.$prefixPlaceable;
            C15611w0 w0Var7 = this.$suffixPlaceable;
            C15611w0 w0Var8 = this.$containerPlaceable;
            C15611w0 w0Var9 = this.$supportingPlaceable;
            boolean l = this.this$0.f19869a;
            int i3 = this.$topPaddingValue;
            TextFieldKt.m26665n(aVar, i, i2, w0Var2, w0Var, w0Var3, w0Var4, w0Var5, w0Var6, w0Var7, w0Var8, w0Var9, l, i3, i3 + this.$labelPlaceable.mo44468G0(), this.this$0.f19870b, this.$this_measure.getDensity());
            return;
        }
        TextFieldKt.m26666o(aVar, this.$width, this.$totalHeight, this.$textFieldPlaceable, this.$placeholderPlaceable, this.$leadingPlaceable, this.$trailingPlaceable, this.$prefixPlaceable, this.$suffixPlaceable, this.$containerPlaceable, this.$supportingPlaceable, this.this$0.f19869a, this.$this_measure.getDensity(), this.this$0.f19871c);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12246a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
