package androidx.compose.foundation.layout;

import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SizeKt$createFillWidthModifier$1 extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ float $fraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$createFillWidthModifier$1(float f) {
        super(1);
        this.$fraction = f;
    }

    /* renamed from: a */
    public final void mo7867a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$$receiver");
        v0Var.mo45973d("fillMaxWidth");
        v0Var.mo45971b().mo45707c("fraction", Float.valueOf(this.$fraction));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7867a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
