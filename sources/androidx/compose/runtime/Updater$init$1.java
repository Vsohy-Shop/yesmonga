package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"T", "Lkotlin/d2;", "it", "a", "(Ljava/lang/Object;Lkotlin/d2;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class Updater$init$1 extends Lambda implements C11304p<T, C11079d2, C11079d2> {
    final /* synthetic */ C11300l<T, C11079d2> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Updater$init$1(C11300l<? super T, C11079d2> lVar) {
        super(2);
        this.$block = lVar;
    }

    /* renamed from: a */
    public final void mo15319a(T t, @C12579k C11079d2 d2Var) {
        Intrinsics.checkNotNullParameter(d2Var, "it");
        this.$block.invoke(t);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo15319a(obj, (C11079d2) obj2);
        return C11079d2.f28267a;
    }
}
