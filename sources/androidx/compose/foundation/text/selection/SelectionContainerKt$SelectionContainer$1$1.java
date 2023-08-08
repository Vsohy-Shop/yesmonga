package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SelectionContainerKt$SelectionContainer$1$1 extends Lambda implements C11300l<C2830i, C11079d2> {
    final /* synthetic */ C8700z0<C2830i> $selection$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$1$1(C8700z0<C2830i> z0Var) {
        super(1);
        this.$selection$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo9608a(@C12580l C2830i iVar) {
        SelectionContainerKt.m12699e(this.$selection$delegate, iVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9608a((C2830i) obj);
        return C11079d2.f28267a;
    }
}
