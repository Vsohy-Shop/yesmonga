package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$MonthsNavigation$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ boolean $nextAvailable;
    final /* synthetic */ C11289a<C11079d2> $onNextClicked;
    final /* synthetic */ C11289a<C11079d2> $onPreviousClicked;
    final /* synthetic */ C11289a<C11079d2> $onYearPickerButtonClicked;
    final /* synthetic */ boolean $previousAvailable;
    final /* synthetic */ String $yearPickerText;
    final /* synthetic */ boolean $yearPickerVisible;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$MonthsNavigation$2(C8767m mVar, boolean z, boolean z2, boolean z3, String str, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, int i) {
        super(2);
        this.$modifier = mVar;
        this.$nextAvailable = z;
        this.$previousAvailable = z2;
        this.$yearPickerVisible = z3;
        this.$yearPickerText = str;
        this.$onNextClicked = aVar;
        this.$onPreviousClicked = aVar2;
        this.$onYearPickerButtonClicked = aVar3;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DatePickerKt.m25605k(this.$modifier, this.$nextAvailable, this.$previousAvailable, this.$yearPickerVisible, this.$yearPickerText, this.$onNextClicked, this.$onPreviousClicked, this.$onYearPickerButtonClicked, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
