package kotlin.sequences;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"R", "", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt___SequencesJvmKt$filterIsInstance$1 extends Lambda implements C11300l<Object, Boolean> {
    final /* synthetic */ Class<R> $klass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesJvmKt$filterIsInstance$1(Class<R> cls) {
        super(1);
        this.$klass = cls;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12580l Object obj) {
        return Boolean.valueOf(this.$klass.isInstance(obj));
    }
}
