package androidx.compose.foundation.lazy.grid;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo22516d2 = {"<anonymous>", "", "it", "", "invoke"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyGridScopeImpl$item$3 extends Lambda implements C11300l<Integer, Object> {
    final /* synthetic */ Object $contentType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridScopeImpl$item$3(Object obj) {
        super(1);
        this.$contentType = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @C12580l
    public final Object invoke(int i) {
        return this.$contentType;
    }
}
