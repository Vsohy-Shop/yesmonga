package androidx.compose.material3;

import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$Month$rangeSelectionDrawModifier$1$1 extends Lambda implements C11300l<C15184c, C11079d2> {
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C8578k2<C8235k2> $rangeSelectionInfo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$rangeSelectionDrawModifier$1$1(C8578k2<C8235k2> k2Var, C8180c0 c0Var) {
        super(1);
        this.$rangeSelectionInfo = k2Var;
        this.$colors = c0Var;
    }

    /* renamed from: a */
    public final void mo11400a(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "$this$drawWithContent");
        C8235k2 value = this.$rangeSelectionInfo.getValue();
        if (value != null) {
            DateRangePickerKt.m25666m(cVar, value, this.$colors.mo12475d());
        }
        cVar.mo42716g6();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11400a((C15184c) obj);
        return C11079d2.f28267a;
    }
}
