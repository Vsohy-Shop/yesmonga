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
public final class TimePickerKt$TimeInputImpl$1$1$1$1 extends Lambda implements C11300l<C15436b, Boolean> {
    final /* synthetic */ C8700z0<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$1$1(TimePickerState timePickerState, C8700z0<TextFieldValue> z0Var) {
        super(1);
        this.$state = timePickerState;
        this.$hourValue$delegate = z0Var;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean mo12293a(@C12579k KeyEvent keyEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        int c = C15439d.m68275c(keyEvent);
        boolean z2 = true;
        if (48 > c || c >= 58) {
            z = false;
        } else {
            z = true;
        }
        if (!(z && C16356n0.m73742n(TimePickerKt.m26761n(this.$hourValue$delegate).mo47113h()) == 2 && TimePickerKt.m26761n(this.$hourValue$delegate).mo47115i().length() == 2)) {
            z2 = false;
        }
        if (z2) {
            this.$state.mo12338E(C8241l2.f20286b.mo12785b());
        }
        return Boolean.FALSE;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo12293a(((C15436b) obj).mo43922h());
    }
}
