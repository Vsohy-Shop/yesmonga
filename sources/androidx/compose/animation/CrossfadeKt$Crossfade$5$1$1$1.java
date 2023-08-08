package androidx.compose.animation;

import androidx.compose.p004ui.graphics.C15327u2;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CrossfadeKt$Crossfade$5$1$1$1 extends Lambda implements C11300l<C15327u2, C11079d2> {
    final /* synthetic */ C8578k2<Float> $alpha$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1$1$1(C8578k2<Float> k2Var) {
        super(1);
        this.$alpha$delegate = k2Var;
    }

    /* renamed from: a */
    public final void mo6512a(@C12579k C15327u2 u2Var) {
        Intrinsics.checkNotNullParameter(u2Var, "$this$graphicsLayer");
        u2Var.mo42473g(CrossfadeKt$Crossfade$5$1.m7793b(this.$alpha$delegate));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo6512a((C15327u2) obj);
        return C11079d2.f28267a;
    }
}
