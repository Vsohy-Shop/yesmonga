package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ModalBottomSheet_androidKt$ModalBottomSheet$2$1$3$1 extends Lambda implements C11304p<C12074o0, Float, C11079d2> {
    final /* synthetic */ C11300l<Float, C11079d2> $settleToDismiss;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheet$2$1$3$1(C11300l<? super Float, C11079d2> lVar) {
        super(2);
        this.$settleToDismiss = lVar;
    }

    /* renamed from: a */
    public final void mo11666a(@C12579k C12074o0 o0Var, float f) {
        Intrinsics.checkNotNullParameter(o0Var, "$this$modalBottomSheetSwipeable");
        this.$settleToDismiss.invoke(Float.valueOf(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo11666a((C12074o0) obj, ((Number) obj2).floatValue());
        return C11079d2.f28267a;
    }
}
