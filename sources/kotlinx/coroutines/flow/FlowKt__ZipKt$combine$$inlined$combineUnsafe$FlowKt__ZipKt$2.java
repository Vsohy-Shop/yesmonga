package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n262#2,2:113\n*E\n"})
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 implements C11907e<R> {

    /* renamed from: a */
    public final /* synthetic */ C11907e[] f29426a;

    /* renamed from: b */
    public final /* synthetic */ C11307s f29427b;

    @C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", mo22502f = "Zip.kt", mo22503i = {}, mo22504l = {333, 262}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¨\u0006\u0006"}, mo22516d2 = {"T", "R", "Lkotlinx/coroutines/flow/f;", "", "it", "Lkotlin/d2;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n157#2,5:333\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2 */
    public static final class C118802 extends SuspendLambda implements C11305q<C11908f<? super R>, Object[], C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C11908f<? super R> fVar, @C12579k Object[] objArr, @C12580l C11045c<? super C11079d2> cVar) {
            C118802 r0 = new C118802(cVar, sVar);
            r0.L$0 = fVar;
            r0.L$1 = objArr;
            return r0.invokeSuspend(C11079d2.f28267a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.f} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                kotlin.C11661u0.m45747n(r11)
                goto L_0x005a
            L_0x0012:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001a:
                java.lang.Object r1 = r10.L$0
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
                kotlin.C11661u0.m45747n(r11)
                goto L_0x004e
            L_0x0022:
                kotlin.C11661u0.m45747n(r11)
                java.lang.Object r11 = r10.L$0
                r1 = r11
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
                java.lang.Object r11 = r10.L$1
                java.lang.Object[] r11 = (java.lang.Object[]) r11
                kotlin.jvm.functions.s r4 = r4
                r5 = 0
                r5 = r11[r5]
                r6 = r11[r3]
                r7 = r11[r2]
                r8 = 3
                r8 = r11[r8]
                r10.L$0 = r1
                r10.label = r3
                r11 = 6
                kotlin.jvm.internal.C11322b0.m43482e(r11)
                r9 = r10
                java.lang.Object r11 = r4.mo7709v5(r5, r6, r7, r8, r9)
                r3 = 7
                kotlin.jvm.internal.C11322b0.m43482e(r3)
                if (r11 != r0) goto L_0x004e
                return r0
            L_0x004e:
                r3 = 0
                r10.L$0 = r3
                r10.label = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L_0x005a
                return r0
            L_0x005a:
                kotlin.d2 r11 = kotlin.C11079d2.f28267a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.C118802.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2(C11907e[] eVarArr, C11307s sVar) {
        this.f29426a = eVarArr;
        this.f29427b = sVar;
    }

    @C12580l
    public Object collect(@C12579k C11908f fVar, @C12579k C11045c cVar) {
        C11907e[] eVarArr = this.f29426a;
        C11289a a = FlowKt__ZipKt.m47208r();
        final C11307s sVar = this.f29427b;
        Object a2 = CombineKt.m47551a(fVar, eVarArr, a, new C118802((C11045c) null), cVar);
        if (a2 == C11063b.m42612h()) {
            return a2;
        }
        return C11079d2.f28267a;
    }
}
