package androidx.compose.material3;

import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15327u2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ChipKt$InputChip$2$1$1 extends Lambda implements C11300l<C15327u2, C11079d2> {
    final /* synthetic */ float $avatarOpacity;
    final /* synthetic */ C15218g4 $avatarShape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$InputChip$2$1$1(float f, C15218g4 g4Var) {
        super(1);
        this.$avatarOpacity = f;
        this.$avatarShape = g4Var;
    }

    /* renamed from: a */
    public final void mo11267a(@C12579k C15327u2 u2Var) {
        Intrinsics.checkNotNullParameter(u2Var, "$this$graphicsLayer");
        u2Var.mo42473g(this.$avatarOpacity);
        u2Var.mo42460Q4(this.$avatarShape);
        u2Var.mo42471e2(true);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11267a((C15327u2) obj);
        return C11079d2.f28267a;
    }
}
