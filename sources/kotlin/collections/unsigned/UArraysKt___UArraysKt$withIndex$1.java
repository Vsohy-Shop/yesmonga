package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11419p1;
import kotlin.C11431q1;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "Lkotlin/p1;", "a", "()Ljava/util/Iterator;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class UArraysKt___UArraysKt$withIndex$1 extends Lambda implements C11289a<Iterator<? extends C11419p1>> {
    final /* synthetic */ int[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UArraysKt___UArraysKt$withIndex$1(int[] iArr) {
        super(0);
        this.$this_withIndex = iArr;
    }

    @C12579k
    /* renamed from: a */
    public final Iterator<C11419p1> invoke() {
        return C11431q1.m44051i0(this.$this_withIndex);
    }
}
