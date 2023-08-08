package kotlinx.coroutines.internal;

import kotlin.C11076d0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11726c3;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "countOrElement", "Lkotlin/coroutines/CoroutineContext$a;", "element", "a", "(Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ThreadContextKt$countAll$1 extends Lambda implements C11304p<Object, CoroutineContext.C11040a, Object> {

    /* renamed from: f */
    public static final ThreadContextKt$countAll$1 f29567f = new ThreadContextKt$countAll$1();

    public ThreadContextKt$countAll$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final Object invoke(@C12580l Object obj, @C12579k CoroutineContext.C11040a aVar) {
        Integer num;
        int i;
        if (!(aVar instanceof C11726c3)) {
            return obj;
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        if (i == 0) {
            return aVar;
        }
        return Integer.valueOf(i + 1);
    }
}
