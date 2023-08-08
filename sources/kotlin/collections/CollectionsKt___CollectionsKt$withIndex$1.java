package kotlin.collections;

import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"T", "", "a", "()Ljava/util/Iterator;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CollectionsKt___CollectionsKt$withIndex$1 extends Lambda implements C11289a<Iterator<? extends T>> {
    final /* synthetic */ Iterable<T> $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionsKt___CollectionsKt$withIndex$1(Iterable<? extends T> iterable) {
        super(0);
        this.$this_withIndex = iterable;
    }

    @C12579k
    /* renamed from: a */
    public final Iterator<T> invoke() {
        return this.$this_withIndex.iterator();
    }
}
