package androidx.compose.material3;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$DatePickerContent$1$3$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $yearPickerVisible$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$3$1(C8700z0<Boolean> z0Var) {
        super(0);
        this.$yearPickerVisible$delegate = z0Var;
    }

    public final void invoke() {
        C8700z0<Boolean> z0Var = this.$yearPickerVisible$delegate;
        DatePickerKt.m25599e(z0Var, !DatePickerKt.m25598d(z0Var));
    }
}
