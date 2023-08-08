package androidx.compose.material3;

import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$TimeInputImpl$hourValue$2$1 extends Lambda implements C11289a<C8700z0<TextFieldValue>> {
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$hourValue$2$1(TimePickerState timePickerState) {
        super(0);
        this.$state = timePickerState;
    }

    @C12579k
    /* renamed from: a */
    public final C8700z0<TextFieldValue> invoke() {
        return C8539f2.m30981g(new TextFieldValue(TimePickerKt.m26762n0(this.$state.mo12348i(), 2), 0, (C16356n0) null, 6, (DefaultConstructorMarker) null), (C8410b2) null, 2, (Object) null);
    }
}
