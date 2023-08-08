package kotlinx.coroutines;

import kotlin.C11076d0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "result", "Lkotlin/coroutines/CoroutineContext$a;", "it", "a", "(ZLkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CoroutineContextKt$hasCopyableElements$1 extends Lambda implements C11304p<Boolean, CoroutineContext.C11040a, Boolean> {

    /* renamed from: f */
    public static final CoroutineContextKt$hasCopyableElements$1 f29000f = new CoroutineContextKt$hasCopyableElements$1();

    public CoroutineContextKt$hasCopyableElements$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final Boolean mo23562a(boolean z, @C12579k CoroutineContext.C11040a aVar) {
        return Boolean.valueOf(z || (aVar instanceof C11971i0));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo23562a(((Boolean) obj).booleanValue(), (CoroutineContext.C11040a) obj2);
    }
}
