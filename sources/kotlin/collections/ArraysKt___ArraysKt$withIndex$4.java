package kotlin.collections;

import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11335i;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "", "a", "()Ljava/util/Iterator;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ArraysKt___ArraysKt$withIndex$4 extends Lambda implements C11289a<Iterator<? extends Integer>> {
    final /* synthetic */ int[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$4(int[] iArr) {
        super(0);
        this.$this_withIndex = iArr;
    }

    @C12579k
    /* renamed from: a */
    public final Iterator<Integer> invoke() {
        return C11335i.m43510f(this.$this_withIndex);
    }
}
