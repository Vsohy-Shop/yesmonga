package androidx.constraintlayout.compose;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15611w0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
/* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1 */
public final class C16571x78640815 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ List<C15557e0> $measurables;
    final /* synthetic */ Measurer $measurer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16571x78640815(Measurer measurer, List<? extends C15557e0> list) {
        super(1);
        this.$measurer = measurer;
        this.$measurables = list;
    }

    /* renamed from: a */
    public final void mo48328a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        this.$measurer.mo48409y(aVar, this.$measurables);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48328a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
