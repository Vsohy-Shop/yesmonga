package androidx.compose.material;

import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TextFieldMeasurePolicy$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ int $effectiveLabelBaseline;
    final /* synthetic */ int $height;
    final /* synthetic */ C15611w0 $labelPlaceable;
    final /* synthetic */ int $lastBaseline;
    final /* synthetic */ C15611w0 $leadingPlaceable;
    final /* synthetic */ C15611w0 $placeholderPlaceable;
    final /* synthetic */ C15611w0 $textFieldPlaceable;
    final /* synthetic */ C15568h0 $this_measure;
    final /* synthetic */ int $topPadding;
    final /* synthetic */ int $topPaddingValue;
    final /* synthetic */ C15611w0 $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ TextFieldMeasurePolicy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldMeasurePolicy$measure$1(C15611w0 w0Var, int i, int i2, int i3, int i4, C15611w0 w0Var2, C15611w0 w0Var3, C15611w0 w0Var4, C15611w0 w0Var5, TextFieldMeasurePolicy textFieldMeasurePolicy, int i5, int i6, C15568h0 h0Var) {
        super(1);
        this.$labelPlaceable = w0Var;
        this.$topPaddingValue = i;
        this.$lastBaseline = i2;
        this.$width = i3;
        this.$height = i4;
        this.$textFieldPlaceable = w0Var2;
        this.$placeholderPlaceable = w0Var3;
        this.$leadingPlaceable = w0Var4;
        this.$trailingPlaceable = w0Var5;
        this.this$0 = textFieldMeasurePolicy;
        this.$effectiveLabelBaseline = i5;
        this.$topPadding = i6;
        this.$this_measure = h0Var;
    }

    /* renamed from: a */
    public final void mo10674a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        if (this.$labelPlaceable != null) {
            int u = C11479u.m44447u(this.$topPaddingValue - this.$lastBaseline, 0);
            C15611w0.C15612a aVar2 = aVar;
            TextFieldKt.m14164p(aVar2, this.$width, this.$height, this.$textFieldPlaceable, this.$labelPlaceable, this.$placeholderPlaceable, this.$leadingPlaceable, this.$trailingPlaceable, this.this$0.f7985a, u, this.$topPadding + this.$effectiveLabelBaseline, this.this$0.f7986b, this.$this_measure.getDensity());
            return;
        }
        TextFieldKt.m14165q(aVar, this.$width, this.$height, this.$textFieldPlaceable, this.$placeholderPlaceable, this.$leadingPlaceable, this.$trailingPlaceable, this.this$0.f7985a, this.$this_measure.getDensity(), this.this$0.f7987c);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10674a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
