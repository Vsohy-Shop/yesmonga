package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15531a $alignmentLine;
    final /* synthetic */ float $before;
    final /* synthetic */ int $height;
    final /* synthetic */ int $paddingAfter;
    final /* synthetic */ int $paddingBefore;
    final /* synthetic */ C15611w0 $placeable;
    final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$alignmentLineOffsetMeasure$1(C15531a aVar, float f, int i, int i2, int i3, C15611w0 w0Var, int i4) {
        super(1);
        this.$alignmentLine = aVar;
        this.$before = f;
        this.$paddingBefore = i;
        this.$width = i2;
        this.$paddingAfter = i3;
        this.$placeable = w0Var;
        this.$height = i4;
    }

    /* renamed from: a */
    public final void mo7618a(@C12579k C15611w0.C15612a aVar) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        int i3 = 0;
        if (AlignmentLineKt.m9711d(this.$alignmentLine)) {
            i = 0;
        } else {
            if (!C16483g.m74440e0(this.$before, C16483g.f40871b.mo47828e())) {
                i2 = this.$paddingBefore;
            } else {
                i2 = (this.$width - this.$paddingAfter) - this.$placeable.mo44471K0();
            }
            i = i2;
        }
        if (AlignmentLineKt.m9711d(this.$alignmentLine)) {
            if (!C16483g.m74440e0(this.$before, C16483g.f40871b.mo47828e())) {
                i3 = this.$paddingBefore;
            } else {
                i3 = (this.$height - this.$paddingAfter) - this.$placeable.mo44468G0();
            }
        }
        C15611w0.C15612a.m69414v(aVar, this.$placeable, i, i3, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7618a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
