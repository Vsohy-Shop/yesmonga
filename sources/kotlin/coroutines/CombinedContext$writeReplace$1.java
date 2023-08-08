package kotlin.coroutines;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Lkotlin/d2;", "<anonymous parameter 0>", "Lkotlin/coroutines/CoroutineContext$a;", "element", "a", "(Lkotlin/d2;Lkotlin/coroutines/CoroutineContext$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CombinedContext$writeReplace$1 extends Lambda implements C11304p<C11079d2, CoroutineContext.C11040a, C11079d2> {
    final /* synthetic */ CoroutineContext[] $elements;
    final /* synthetic */ Ref.IntRef $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedContext$writeReplace$1(CoroutineContext[] coroutineContextArr, Ref.IntRef intRef) {
        super(2);
        this.$elements = coroutineContextArr;
        this.$index = intRef;
    }

    /* renamed from: a */
    public final void mo22482a(@C12579k C11079d2 d2Var, @C12579k CoroutineContext.C11040a aVar) {
        Intrinsics.checkNotNullParameter(d2Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(aVar, "element");
        CoroutineContext[] coroutineContextArr = this.$elements;
        Ref.IntRef intRef = this.$index;
        int i = intRef.element;
        intRef.element = i + 1;
        coroutineContextArr[i] = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo22482a((C11079d2) obj, (CoroutineContext.C11040a) obj2);
        return C11079d2.f28267a;
    }
}
