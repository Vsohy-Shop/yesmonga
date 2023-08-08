package androidx.compose.material3;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DateInputKt$DateInputTextField$2$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ C8700z0<String> $errorText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$2$1(C8700z0<String> z0Var) {
        super(1);
        this.$errorText = z0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        if (!C11622t.isBlank(this.$errorText.getValue())) {
            SemanticsPropertiesKt.m72026m(qVar, this.$errorText.getValue());
        }
    }
}
