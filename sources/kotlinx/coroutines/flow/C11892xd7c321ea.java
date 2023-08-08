package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11309u;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", mo22502f = "Zip.kt", mo22503i = {}, mo22504l = {273}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¨\u0006\u0004"}, mo22516d2 = {"T", "R", "Lkotlinx/coroutines/flow/f;", "Lkotlin/d2;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5 */
public final class C11892xd7c321ea extends SuspendLambda implements C11304p<C11908f<? super R>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11907e[] $flows;
    final /* synthetic */ C11309u $transform$inlined;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", mo22502f = "Zip.kt", mo22503i = {}, mo22504l = {333}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¨\u0006\u0006"}, mo22516d2 = {"T", "R", "Lkotlinx/coroutines/flow/f;", "", "it", "Lkotlin/d2;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n221#2,8:333\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1 */
    public static final class C118931 extends SuspendLambda implements C11305q<C11908f<? super R>, Object[], C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C11908f<? super R> fVar, @C12579k Object[] objArr, @C12580l C11045c<? super C11079d2> cVar) {
            C118931 r0 = new C118931(cVar, uVar);
            r0.L$0 = fVar;
            r0.L$1 = objArr;
            return r0.invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                Object[] objArr = (Object[]) this.L$1;
                C11309u uVar = uVar;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                Object obj6 = objArr[4];
                this.label = 1;
                C11322b0.m43482e(6);
                Object q2 = uVar.mo12216q2((C11908f) this.L$0, obj2, obj3, obj4, obj5, obj6, this);
                C11322b0.m43482e(7);
                if (q2 == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11892xd7c321ea(C11907e[] eVarArr, C11045c cVar, C11309u uVar) {
        super(2, cVar);
        this.$flows = eVarArr;
        this.$transform$inlined = uVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        C11892xd7c321ea flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5 = new C11892xd7c321ea(this.$flows, cVar, this.$transform$inlined);
        flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5.L$0 = obj;
        return flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super R> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((C11892xd7c321ea) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e[] eVarArr = this.$flows;
            C11289a a = FlowKt__ZipKt.m47208r();
            final C11309u uVar = this.$transform$inlined;
            C118931 r4 = new C118931((C11045c) null);
            this.label = 1;
            if (CombineKt.m47551a((C11908f) this.L$0, eVarArr, a, r4, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
