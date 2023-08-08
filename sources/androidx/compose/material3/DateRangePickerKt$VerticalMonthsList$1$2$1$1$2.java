package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DateRangePickerKt$VerticalMonthsList$1$2$1$1$2 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ String $scrollToNextMonthLabel;
    final /* synthetic */ String $scrollToPreviousMonthLabel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$1$2$1$1$2(LazyListState lazyListState, C12074o0 o0Var, String str, String str2) {
        super(1);
        this.$lazyListState = lazyListState;
        this.$coroutineScope = o0Var;
        this.$scrollToPreviousMonthLabel = str;
        this.$scrollToNextMonthLabel = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertiesKt.m71961H0(qVar, DateRangePickerKt.m25665l(this.$lazyListState, this.$coroutineScope, this.$scrollToPreviousMonthLabel, this.$scrollToNextMonthLabel));
    }
}
