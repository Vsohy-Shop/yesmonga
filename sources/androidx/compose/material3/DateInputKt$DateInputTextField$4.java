package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DateInputKt$DateInputTextField$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C8169a0 $dateInputFormat;
    final /* synthetic */ C8174b0 $dateInputValidator;
    final /* synthetic */ C8238l $initialDate;
    final /* synthetic */ int $inputIdentifier;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<C8238l, C11079d2> $onDateChanged;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$4(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, StateData stateData, C8238l lVar, C11300l<? super C8238l, C11079d2> lVar2, int i, C8174b0 b0Var, C8169a0 a0Var, Locale locale, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$stateData = stateData;
        this.$initialDate = lVar;
        this.$onDateChanged = lVar2;
        this.$inputIdentifier = i;
        this.$dateInputValidator = b0Var;
        this.$dateInputFormat = a0Var;
        this.$locale = locale;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DateInputKt.m25561b(this.$modifier, this.$label, this.$placeholder, this.$stateData, this.$initialDate, this.$onDateChanged, this.$inputIdentifier, this.$dateInputValidator, this.$dateInputFormat, this.$locale, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
