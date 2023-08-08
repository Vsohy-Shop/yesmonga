package kotlinx.coroutines.flow.internal;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n*L\n1#1,112:1\n*E\n"})
public final class SafeCollector_commonKt$unsafeFlow$1 implements C11907e<T> {

    /* renamed from: a */
    public final /* synthetic */ C11304p<C11908f<? super T>, C11045c<? super C11079d2>, Object> f29502a;

    public SafeCollector_commonKt$unsafeFlow$1(C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        this.f29502a = pVar;
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object invoke = this.f29502a.invoke(fVar, cVar);
        return invoke == C11063b.m42612h() ? invoke : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: g */
    public Object mo24257g(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        C11322b0.m43482e(4);
        new SafeCollector_commonKt$unsafeFlow$1$collect$1(this, cVar);
        C11322b0.m43482e(5);
        this.f29502a.invoke(fVar, cVar);
        return C11079d2.f28267a;
    }
}
