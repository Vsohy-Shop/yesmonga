package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "old", "new", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowKt__DistinctKt$defaultAreEquivalent$1 extends Lambda implements C11304p<Object, Object, Boolean> {

    /* renamed from: f */
    public static final FlowKt__DistinctKt$defaultAreEquivalent$1 f29306f = new FlowKt__DistinctKt$defaultAreEquivalent$1();

    public FlowKt__DistinctKt$defaultAreEquivalent$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12580l Object obj, @C12580l Object obj2) {
        return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
    }
}
