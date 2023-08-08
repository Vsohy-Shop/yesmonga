package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ClickableTextKt$ClickableText$5$1 extends Lambda implements C11300l<C16260h0, C11079d2> {
    final /* synthetic */ C8700z0<C16260h0> $layoutResult;
    final /* synthetic */ C11300l<C16260h0, C11079d2> $onTextLayout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$5$1(C8700z0<C16260h0> z0Var, C11300l<? super C16260h0, C11079d2> lVar) {
        super(1);
        this.$layoutResult = z0Var;
        this.$onTextLayout = lVar;
    }

    /* renamed from: a */
    public final void mo9246a(@C12579k C16260h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "it");
        this.$layoutResult.setValue(h0Var);
        this.$onTextLayout.invoke(h0Var);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9246a((C16260h0) obj);
        return C11079d2.f28267a;
    }
}
