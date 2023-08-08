package androidx.compose.material3;

import android.view.KeyEvent;
import androidx.compose.p004ui.input.key.C15436b;
import androidx.compose.p004ui.input.key.C15439d;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$TimeInputImpl$1$1$4$1 extends Lambda implements C11300l<C15436b, Boolean> {
    final /* synthetic */ C8700z0<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$4$1(TimePickerState timePickerState, C8700z0<TextFieldValue> z0Var) {
        super(1);
        this.$state = timePickerState;
        this.$minuteValue$delegate = z0Var;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean mo12297a(@C12579k KeyEvent keyEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        if (C15439d.m68275c(keyEvent) == 0 && C16356n0.m73742n(TimePickerKt.m26765p(this.$minuteValue$delegate).mo47113h()) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.$state.mo12338E(C8241l2.f20286b.mo12784a());
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo12297a(((C15436b) obj).mo43922h());
    }
}
