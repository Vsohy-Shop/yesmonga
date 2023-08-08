package androidx.compose.foundation.lazy.grid;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LazyGridState$scrollableState$1 extends Lambda implements C11300l<Float, Float> {
    final /* synthetic */ LazyGridState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridState$scrollableState$1(LazyGridState lazyGridState) {
        super(1);
        this.this$0 = lazyGridState;
    }

    @C12579k
    /* renamed from: a */
    public final Float mo8534a(float f) {
        return Float.valueOf(-this.this$0.mo8501H(-f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo8534a(((Number) obj).floatValue());
    }
}
