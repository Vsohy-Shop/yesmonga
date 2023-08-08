package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1 implements C11907e<R> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f29314a;

    /* renamed from: b */
    public final /* synthetic */ C11305q f29315b;

    public FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(C11907e eVar, C11305q qVar) {
        this.f29314a = eVar;
        this.f29315b = qVar;
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super R> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = this.f29314a.collect(new FlowKt__EmittersKt$unsafeTransform$1$1(this.f29315b, fVar), cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: g */
    public Object mo24102g(@C12579k C11908f fVar, @C12579k C11045c cVar) {
        C11322b0.m43482e(4);
        new ContinuationImpl(this, cVar) {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1 this$0;

            {
                this.this$0 = r1;
            }

            @C12580l
            public final Object invokeSuspend(@C12579k Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.collect((C11908f) null, this);
            }
        };
        C11322b0.m43482e(5);
        C11907e eVar = this.f29314a;
        FlowKt__EmittersKt$unsafeTransform$1$1 flowKt__EmittersKt$unsafeTransform$1$1 = new FlowKt__EmittersKt$unsafeTransform$1$1(this.f29315b, fVar);
        C11322b0.m43482e(0);
        eVar.collect(flowKt__EmittersKt$unsafeTransform$1$1, cVar);
        C11322b0.m43482e(1);
        return C11079d2.f28267a;
    }
}
