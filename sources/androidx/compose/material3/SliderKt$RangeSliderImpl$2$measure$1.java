package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$RangeSliderImpl$2$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ int $endThumbOffsetX;
    final /* synthetic */ int $endThumbOffsetY;
    final /* synthetic */ C15611w0 $endThumbPlaceable;
    final /* synthetic */ int $startThumbOffsetX;
    final /* synthetic */ int $startThumbOffsetY;
    final /* synthetic */ C15611w0 $startThumbPlaceable;
    final /* synthetic */ int $trackOffsetX;
    final /* synthetic */ int $trackOffsetY;
    final /* synthetic */ C15611w0 $trackPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$2$measure$1(C15611w0 w0Var, int i, int i2, C15611w0 w0Var2, int i3, int i4, C15611w0 w0Var3, int i5, int i6) {
        super(1);
        this.$trackPlaceable = w0Var;
        this.$trackOffsetX = i;
        this.$trackOffsetY = i2;
        this.$startThumbPlaceable = w0Var2;
        this.$startThumbOffsetX = i3;
        this.$startThumbOffsetY = i4;
        this.$endThumbPlaceable = w0Var3;
        this.$endThumbOffsetX = i5;
        this.$endThumbOffsetY = i6;
    }

    /* renamed from: a */
    public final void mo11899a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0.C15612a aVar2 = aVar;
        C15611w0.C15612a.m69414v(aVar2, this.$trackPlaceable, this.$trackOffsetX, this.$trackOffsetY, 0.0f, 4, (Object) null);
        C15611w0.C15612a.m69414v(aVar2, this.$startThumbPlaceable, this.$startThumbOffsetX, this.$startThumbOffsetY, 0.0f, 4, (Object) null);
        C15611w0.C15612a.m69414v(aVar2, this.$endThumbPlaceable, this.$endThumbOffsetX, this.$endThumbOffsetY, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11899a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
