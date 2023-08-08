package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n238#2,2:113\n*E\n"})
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2 implements C11907e<R> {

    /* renamed from: a */
    public final /* synthetic */ C11907e[] f29430a;

    /* renamed from: b */
    public final /* synthetic */ C11304p f29431b;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(C11907e[] eVarArr, C11304p pVar) {
        this.f29430a = eVarArr;
        this.f29431b = pVar;
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super R> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        C11907e[] eVarArr = this.f29430a;
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.f29430a);
        Intrinsics.needClassReification();
        Object a = CombineKt.m47551a(fVar, eVarArr, flowKt__ZipKt$combine$5$1, new FlowKt__ZipKt$combine$5$2(this.f29431b, (C11045c<? super FlowKt__ZipKt$combine$5$2>) null), cVar);
        if (a == C11063b.m42612h()) {
            return a;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: g */
    public Object mo24138g(@C12579k C11908f fVar, @C12579k C11045c cVar) {
        C11322b0.m43482e(4);
        new ContinuationImpl(this, cVar) {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ FlowKt__ZipKt$combine$$inlined$unsafeFlow$2 this$0;

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
        C11907e[] eVarArr = this.f29430a;
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.f29430a);
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combine$5$2 flowKt__ZipKt$combine$5$2 = new FlowKt__ZipKt$combine$5$2(this.f29431b, (C11045c<? super FlowKt__ZipKt$combine$5$2>) null);
        C11322b0.m43482e(0);
        CombineKt.m47551a(fVar, eVarArr, flowKt__ZipKt$combine$5$1, flowKt__ZipKt$combine$5$2, cVar);
        C11322b0.m43482e(1);
        return C11079d2.f28267a;
    }
}
