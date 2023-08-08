package androidx.compose.material3;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$WeekDays$1$1$1$1$1$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ Pair<String, String> $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$WeekDays$1$1$1$1$1$1(Pair<String, String> pair) {
        super(1);
        this.$it = pair;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$clearAndSetSemantics");
        SemanticsPropertiesKt.m71959G0(qVar, this.$it.mo21849e());
    }
}
