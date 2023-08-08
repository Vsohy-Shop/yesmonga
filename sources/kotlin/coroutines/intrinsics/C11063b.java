package kotlin.coroutines.intrinsics;

import kotlin.C11665v0;
import kotlin.NotImplementedError;
import kotlin.coroutines.C11045c;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.coroutines.intrinsics.b */
public class C11063b extends IntrinsicsKt__IntrinsicsJvmKt {
    @C12579k
    /* renamed from: h */
    public static final Object m42612h() {
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @C11665v0(version = "1.3")
    /* renamed from: i */
    public static /* synthetic */ void m42613i() {
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: j */
    public static final <T> Object m42614j(C11300l<? super C11045c<? super T>, ? extends Object> lVar, C11045c<? super T> cVar) {
        throw new NotImplementedError("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
    }
}
