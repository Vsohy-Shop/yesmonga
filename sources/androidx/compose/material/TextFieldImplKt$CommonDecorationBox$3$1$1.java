package androidx.compose.material;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends Lambda implements C11300l<C15104m, C11079d2> {
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ C8700z0<C15104m> $labelSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(float f, C8700z0<C15104m> z0Var) {
        super(1);
        this.$labelProgress = f;
        this.$labelSize = z0Var;
    }

    /* renamed from: a */
    public final void mo10650a(long j) {
        boolean z;
        float t = C15104m.m65023t(j) * this.$labelProgress;
        float m = C15104m.m65016m(j) * this.$labelProgress;
        boolean z2 = true;
        if (C15104m.m65023t(this.$labelSize.getValue().mo42315y()) == t) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C15104m.m65016m(this.$labelSize.getValue().mo42315y()) != m) {
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
        this.$labelSize.setValue(C15104m.m65006c(C15106n.m65033a(t, m)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10650a(((C15104m) obj).mo42315y());
        return C11079d2.f28267a;
    }
}
