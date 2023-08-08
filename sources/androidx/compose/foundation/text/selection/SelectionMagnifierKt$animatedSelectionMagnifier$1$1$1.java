package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1 extends Lambda implements C11289a<C15094f> {
    final /* synthetic */ C8578k2<C15094f> $animatedCenter$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(C8578k2<C15094f> k2Var) {
        super(0);
        this.$animatedCenter$delegate = k2Var;
    }

    /* renamed from: a */
    public final long mo9619a() {
        return SelectionMagnifierKt$animatedSelectionMagnifier$1.m12717c(this.$animatedCenter$delegate);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return C15094f.m64868d(mo9619a());
    }
}
