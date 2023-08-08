package kotlinx.coroutines;

import kotlin.C11076d0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$a;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$a;)Lkotlin/coroutines/CoroutineContext;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CoroutineContextKt$foldCopies$folded$1 extends Lambda implements C11304p<CoroutineContext, CoroutineContext.C11040a, CoroutineContext> {
    final /* synthetic */ boolean $isNewCoroutine;
    final /* synthetic */ Ref.ObjectRef<CoroutineContext> $leftoverContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineContextKt$foldCopies$folded$1(Ref.ObjectRef<CoroutineContext> objectRef, boolean z) {
        super(2);
        this.$leftoverContext = objectRef;
        this.$isNewCoroutine = z;
    }

    @C12579k
    /* renamed from: a */
    public final CoroutineContext invoke(@C12579k CoroutineContext coroutineContext, @C12579k CoroutineContext.C11040a aVar) {
        if (!(aVar instanceof C11971i0)) {
            return coroutineContext.mo7443Q(aVar);
        }
        CoroutineContext.C11040a b = ((CoroutineContext) this.$leftoverContext.element).mo7444b(aVar.getKey());
        if (b == null) {
            C11971i0 i0Var = (C11971i0) aVar;
            if (this.$isNewCoroutine) {
                i0Var = i0Var.mo24294E();
            }
            return coroutineContext.mo7443Q(i0Var);
        }
        Ref.ObjectRef<CoroutineContext> objectRef = this.$leftoverContext;
        objectRef.element = ((CoroutineContext) objectRef.element).mo7445f(aVar.getKey());
        return coroutineContext.mo7443Q(((C11971i0) aVar).mo24295q(b));
    }
}
