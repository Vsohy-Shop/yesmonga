package androidx.compose.material3;

import androidx.compose.p004ui.semantics.C16027e;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerDefaults$DatePickerHeadline$1$1$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ String $headlineDescription;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerDefaults$DatePickerHeadline$1$1$1(String str) {
        super(1);
        this.$headlineDescription = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertiesKt.m71971M0(qVar, C16027e.f39783b.mo46109b());
        SemanticsPropertiesKt.m71959G0(qVar, this.$headlineDescription);
    }
}
