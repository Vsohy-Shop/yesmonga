package kotlinx.coroutines.flow.internal;

import kotlin.C11076d0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"T", "", "count", "Lkotlin/coroutines/CoroutineContext$a;", "<anonymous parameter 1>", "a", "(ILkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SafeCollector$collectContextSize$1 extends Lambda implements C11304p<Integer, CoroutineContext.C11040a, Integer> {

    /* renamed from: f */
    public static final SafeCollector$collectContextSize$1 f29499f = new SafeCollector$collectContextSize$1();

    public SafeCollector$collectContextSize$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final Integer mo24254a(int i, @C12579k CoroutineContext.C11040a aVar) {
        return Integer.valueOf(i + 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo24254a(((Number) obj).intValue(), (CoroutineContext.C11040a) obj2);
    }
}
