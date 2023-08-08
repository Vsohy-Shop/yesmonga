package androidx.compose.foundation;

import androidx.compose.p004ui.semantics.C16029f;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/semantics/q;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/ui/semantics/q;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProgressSemanticsKt$progressSemantics$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ int $steps;
    final /* synthetic */ float $value;
    final /* synthetic */ C11457f<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressSemanticsKt$progressSemantics$1(float f, C11457f<Float> fVar, int i) {
        super(1);
        this.$value = f;
        this.$valueRange = fVar;
        this.$steps = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertiesKt.m71979Q0(qVar, new C16029f(((Number) C11479u.m44349N(Float.valueOf(this.$value), this.$valueRange)).floatValue(), this.$valueRange, this.$steps));
    }
}
