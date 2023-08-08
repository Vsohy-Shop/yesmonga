package kotlinx.coroutines.flow;

import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.C11931h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,141:1\n1#2:142\n106#3:143\n106#3:144\n106#3:145\n106#3:146\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n22#1:143\n33#1:144\n52#1:145\n83#1:146\n*E\n"})
public final /* synthetic */ class FlowKt__LimitKt {

    @C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,112:1\n23#2,5:113\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$a */
    public static final class C11830a implements C11907e<T> {

        /* renamed from: a */
        public final /* synthetic */ C11907e f29328a;

        /* renamed from: b */
        public final /* synthetic */ int f29329b;

        public C11830a(C11907e eVar, int i) {
            this.f29328a = eVar;
            this.f29329b = i;
        }

        @C12580l
        public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object collect = this.f29328a.collect(new FlowKt__LimitKt$drop$2$1(new Ref.IntRef(), this.f29329b, fVar), cVar);
            if (collect == C11063b.m42612h()) {
                return collect;
            }
            return C11079d2.f28267a;
        }
    }

    @C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,112:1\n34#2,10:113\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$b */
    public static final class C11831b implements C11907e<T> {

        /* renamed from: a */
        public final /* synthetic */ C11907e f29330a;

        /* renamed from: b */
        public final /* synthetic */ C11304p f29331b;

        public C11831b(C11907e eVar, C11304p pVar) {
            this.f29330a = eVar;
            this.f29331b = pVar;
        }

        @C12580l
        public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object collect = this.f29330a.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref.BooleanRef(), fVar, this.f29331b), cVar);
            if (collect == C11063b.m42612h()) {
                return collect;
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m47075b(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11907e<? extends T> r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super T, ? super kotlin.coroutines.C11045c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r4 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r4
            kotlin.C11661u0.m45747n(r6)     // Catch:{ AbortFlowException -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x004c
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r6.<init>(r5)
            r0.L$0 = r6     // Catch:{ AbortFlowException -> 0x004a }
            r0.label = r3     // Catch:{ AbortFlowException -> 0x004a }
            java.lang.Object r4 = r4.collect(r6, r0)     // Catch:{ AbortFlowException -> 0x004a }
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004a:
            r5 = move-exception
            r4 = r6
        L_0x004c:
            kotlinx.coroutines.flow.internal.C11931h.m47597b(r5, r4)
        L_0x004f:
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.m47075b(kotlinx.coroutines.flow.e, kotlin.jvm.functions.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: c */
    public static final <T> Object m47076c(C11907e<? extends T> eVar, C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar, C11045c<? super C11079d2> cVar) {
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1(pVar);
        try {
            C11322b0.m43482e(0);
            eVar.collect(flowKt__LimitKt$collectWhile$collector$1, cVar);
            C11322b0.m43482e(1);
        } catch (AbortFlowException e) {
            C11931h.m47597b(e, flowKt__LimitKt$collectWhile$collector$1);
        }
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: d */
    public static final <T> C11907e<T> m47077d(@C12579k C11907e<? extends T> eVar, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C11830a(eVar, i);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i).toString());
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C11907e<T> m47078e(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        return new C11831b(eVar, pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m47079f(kotlinx.coroutines.flow.C11908f<? super T> r4, T r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.C11908f) r4
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0043
        L_0x0035:
            kotlin.C11661u0.m45747n(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.m47079f(kotlinx.coroutines.flow.f, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C11907e<T> m47080g(@C12579k C11907e<? extends T> eVar, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(eVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
    }

    @C12579k
    /* renamed from: h */
    public static final <T> C11907e<T> m47081h(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(eVar, pVar);
    }

    @C12579k
    /* renamed from: i */
    public static final <T, R> C11907e<R> m47082i(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11305q<? super C11908f<? super R>, ? super T, ? super C11045c<? super Boolean>, ? extends Object> qVar) {
        return C11909g.m47376J0(new FlowKt__LimitKt$transformWhile$1(eVar, qVar, (C11045c<? super FlowKt__LimitKt$transformWhile$1>) null));
    }
}
