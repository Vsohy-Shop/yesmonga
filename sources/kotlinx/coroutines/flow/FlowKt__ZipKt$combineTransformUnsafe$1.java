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
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", mo22502f = "Zip.kt", mo22503i = {}, mo22504l = {273}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, mo22516d2 = {"T", "R", "Lkotlinx/coroutines/flow/f;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
public final class FlowKt__ZipKt$combineTransformUnsafe$1 extends SuspendLambda implements C11304p<C11908f<? super R>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11907e<T>[] $flows;
    final /* synthetic */ C11305q<C11908f<? super R>, T[], C11045c<? super C11079d2>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", mo22502f = "Zip.kt", mo22503i = {}, mo22504l = {273}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@"}, mo22516d2 = {"T", "R", "Lkotlinx/coroutines/flow/f;", "", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n*L\n1#1,332:1\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1 */
    public static final class C118991 extends SuspendLambda implements C11305q<C11908f<? super R>, T[], C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C11908f<? super R> fVar, @C12579k T[] tArr, @C12580l C11045c<? super C11079d2> cVar) {
            Intrinsics.needClassReification();
            C118991 r0 = new C118991(r5, cVar);
            r0.L$0 = fVar;
            r0.L$1 = tArr;
            return r0.invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        /* renamed from: h */
        public final Object mo24171h(@C12579k Object obj) {
            r5.invoke((C11908f) this.L$0, (Object[]) this.L$1, this);
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11305q<C11908f<? super R>, T[], C11045c<? super C11079d2>, Object> qVar = r5;
                this.L$0 = null;
                this.label = 1;
                if (qVar.invoke((C11908f) this.L$0, (Object[]) this.L$1, this) == h) {
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
    public FlowKt__ZipKt$combineTransformUnsafe$1(C11907e<? extends T>[] eVarArr, C11305q<? super C11908f<? super R>, ? super T[], ? super C11045c<? super C11079d2>, ? extends Object> qVar, C11045c<? super FlowKt__ZipKt$combineTransformUnsafe$1> cVar) {
        super(2, cVar);
        this.$flows = eVarArr;
        this.$transform = qVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FlowKt__ZipKt$combineTransformUnsafe$1 flowKt__ZipKt$combineTransformUnsafe$1 = new FlowKt__ZipKt$combineTransformUnsafe$1(this.$flows, this.$transform, cVar);
        flowKt__ZipKt$combineTransformUnsafe$1.L$0 = obj;
        return flowKt__ZipKt$combineTransformUnsafe$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super R> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FlowKt__ZipKt$combineTransformUnsafe$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    /* renamed from: h */
    public final Object mo24169h(@C12579k Object obj) {
        C11907e<T>[] eVarArr = this.$flows;
        C11289a a = FlowKt__ZipKt.m47208r();
        Intrinsics.needClassReification();
        final C11305q<C11908f<? super R>, T[], C11045c<? super C11079d2>, Object> qVar = this.$transform;
        C118991 r2 = new C118991((C11045c<? super C118991>) null);
        C11322b0.m43482e(0);
        CombineKt.m47551a((C11908f) this.L$0, eVarArr, a, r2, this);
        C11322b0.m43482e(1);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e<T>[] eVarArr = this.$flows;
            C11289a a = FlowKt__ZipKt.m47208r();
            Intrinsics.needClassReification();
            final C11305q<C11908f<? super R>, T[], C11045c<? super C11079d2>, Object> qVar = this.$transform;
            C118991 r4 = new C118991((C11045c<? super C118991>) null);
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
