package androidx.lifecycle;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"X", "kotlin.jvm.PlatformType", "value", "Lkotlin/d2;", "a", "(Ljava/lang/Object;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class Transformations$distinctUntilChanged$1 extends Lambda implements C11300l<X, C11079d2> {
    final /* synthetic */ Ref.BooleanRef $firstTime;
    final /* synthetic */ C19406e0<X> $outputLiveData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transformations$distinctUntilChanged$1(C19406e0<X> e0Var, Ref.BooleanRef booleanRef) {
        super(1);
        this.$outputLiveData = e0Var;
        this.$firstTime = booleanRef;
    }

    /* renamed from: a */
    public final void mo57525a(X x) {
        X f = this.$outputLiveData.mo4610f();
        if (this.$firstTime.element || ((f == null && x != null) || (f != null && !Intrinsics.areEqual((Object) f, (Object) x)))) {
            this.$firstTime.element = false;
            this.$outputLiveData.mo57496r(x);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo57525a(obj);
        return C11079d2.f28267a;
    }
}
