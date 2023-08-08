package androidx.compose.material3;

import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$TimeInputImpl$1$1$5$1 extends Lambda implements C11300l<TextFieldValue, C11079d2> {
    final /* synthetic */ C8700z0<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$5$1(TimePickerState timePickerState, C8700z0<TextFieldValue> z0Var) {
        super(1);
        this.$state = timePickerState;
        this.$minuteValue$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo12298a(@C12579k TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "newValue");
        int b = C8241l2.f20286b.mo12785b();
        TimePickerState timePickerState = this.$state;
        TextFieldValue L = TimePickerKt.m26765p(this.$minuteValue$delegate);
        final C8700z0<TextFieldValue> z0Var = this.$minuteValue$delegate;
        TimePickerKt.m26760m0(b, timePickerState, textFieldValue, L, 59, new C11300l<TextFieldValue, C11079d2>() {
            /* renamed from: a */
            public final void mo12299a(@C12579k TextFieldValue textFieldValue) {
                Intrinsics.checkNotNullParameter(textFieldValue, "it");
                TimePickerKt.m26767q(z0Var, textFieldValue);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12299a((TextFieldValue) obj);
                return C11079d2.f28267a;
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12298a((TextFieldValue) obj);
        return C11079d2.f28267a;
    }
}
