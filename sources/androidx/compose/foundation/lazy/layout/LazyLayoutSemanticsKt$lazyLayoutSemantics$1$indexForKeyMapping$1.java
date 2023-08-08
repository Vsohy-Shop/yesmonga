package androidx.compose.foundation.lazy.layout;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 extends Lambda implements C11300l<Object, Integer> {
    final /* synthetic */ C2549h $itemProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1(C2549h hVar) {
        super(1);
        this.$itemProvider = hVar;
    }

    @C12579k
    /* renamed from: a */
    public final Integer invoke(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "needle");
        int a = this.$itemProvider.mo8288a();
        int i = 0;
        while (true) {
            if (i >= a) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(this.$itemProvider.mo8293g(i), obj)) {
                break;
            } else {
                i++;
            }
        }
        return Integer.valueOf(i);
    }
}
