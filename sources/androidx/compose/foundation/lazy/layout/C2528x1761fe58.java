package androidx.compose.foundation.lazy.layout;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$2 */
public final class C2528x1761fe58 extends Lambda implements C11289a<Float> {
    final /* synthetic */ C2549h $itemProvider;
    final /* synthetic */ C2563q $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2528x1761fe58(C2563q qVar, C2549h hVar) {
        super(0);
        this.$state = qVar;
        this.$itemProvider = hVar;
    }

    @C12579k
    /* renamed from: a */
    public final Float invoke() {
        float f;
        if (this.$state.mo8633a()) {
            f = ((float) this.$itemProvider.mo8288a()) + 1.0f;
        } else {
            f = this.$state.mo8637e();
        }
        return Float.valueOf(f);
    }
}
