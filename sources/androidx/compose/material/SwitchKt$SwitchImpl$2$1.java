package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwitchKt$SwitchImpl$2$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ C8578k2<C15240j2> $trackColor$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$2$1(C8578k2<C15240j2> k2Var) {
        super(1);
        this.$trackColor$delegate = k2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        SwitchKt.m14065h(eVar, SwitchKt.m14060c(this.$trackColor$delegate), eVar.mo7425g5(SwitchKt.m14068k()), eVar.mo7425g5(SwitchKt.m14067j()));
    }
}
