package androidx.lifecycle;

import androidx.arch.core.util.C0843a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"X", "Y", "kotlin.jvm.PlatformType", "x", "Lkotlin/d2;", "a", "(Ljava/lang/Object;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class Transformations$map$2 extends Lambda implements C11300l<Object, C11079d2> {
    final /* synthetic */ C0843a<Object, Object> $mapFunction;
    final /* synthetic */ C19406e0<Object> $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transformations$map$2(C19406e0<Object> e0Var, C0843a<Object, Object> aVar) {
        super(1);
        this.$result = e0Var;
        this.$mapFunction = aVar;
    }

    /* renamed from: a */
    public final void mo57527a(Object obj) {
        this.$result.mo57496r(this.$mapFunction.apply(obj));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo57527a(obj);
        return C11079d2.f28267a;
    }
}
