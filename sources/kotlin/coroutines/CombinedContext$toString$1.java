package kotlin.coroutines;

import kotlin.C11076d0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "acc", "Lkotlin/coroutines/CoroutineContext$a;", "element", "a", "(Ljava/lang/String;Lkotlin/coroutines/CoroutineContext$a;)Ljava/lang/String;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CombinedContext$toString$1 extends Lambda implements C11304p<String, CoroutineContext.C11040a, String> {

    /* renamed from: f */
    public static final CombinedContext$toString$1 f28241f = new CombinedContext$toString$1();

    public CombinedContext$toString$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final String invoke(@C12579k String str, @C12579k CoroutineContext.C11040a aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "acc");
        Intrinsics.checkNotNullParameter(aVar, "element");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return aVar.toString();
        }
        return str + ", " + aVar;
    }
}
