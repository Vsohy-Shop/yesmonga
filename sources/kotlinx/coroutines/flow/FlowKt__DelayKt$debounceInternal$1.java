package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", mo22502f = "Delay.kt", mo22503i = {0, 0, 0, 0, 1, 1, 1}, mo22504l = {221, 416}, mo22505m = "invokeSuspend", mo22506n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "Lkotlinx/coroutines/flow/f;", "downstream", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,405:1\n18#2:406\n18#2:408\n1#3:407\n55#4,8:409\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n218#1:406\n221#1:408\n228#1:409,8\n*E\n"})
public final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements C11305q<C12074o0, C11908f<? super T>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11907e<T> $this_debounceInternal;
    final /* synthetic */ C11300l<T, Long> $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(C11300l<? super T, Long> lVar, C11907e<? extends T> eVar, C11045c<? super FlowKt__DelayKt$debounceInternal$1> cVar) {
        super(3, cVar);
        this.$timeoutMillisSelector = lVar;
        this.$this_debounceInternal = eVar;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C12074o0 o0Var, @C12579k C11908f<? super T> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, cVar);
        flowKt__DelayKt$debounceInternal$1.L$0 = o0Var;
        flowKt__DelayKt$debounceInternal$1.L$1 = fVar;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x002d
            if (r2 != r3) goto L_0x0025
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.C11908f) r7
            kotlin.C11661u0.m45747n(r18)
            r8 = r7
            r7 = r6
            r6 = r2
            r2 = r0
            goto L_0x006b
        L_0x0025:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002d:
            java.lang.Object r2 = r0.L$3
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref.LongRef) r2
            java.lang.Object r6 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.f r8 = (kotlinx.coroutines.flow.C11908f) r8
            kotlin.C11661u0.m45747n(r18)
            r9 = r2
            r2 = r0
            goto L_0x00b2
        L_0x0044:
            kotlin.C11661u0.m45747n(r18)
            java.lang.Object r2 = r0.L$0
            r6 = r2
            kotlinx.coroutines.o0 r6 = (kotlinx.coroutines.C12074o0) r6
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.C11908f) r2
            r7 = 0
            r8 = 0
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 r9 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1
            kotlinx.coroutines.flow.e<T> r10 = r0.$this_debounceInternal
            r9.<init>(r10, r5)
            r10 = 3
            r11 = 0
            kotlinx.coroutines.channels.ReceiveChannel r6 = kotlinx.coroutines.channels.ProduceKt.m46530f(r6, r7, r8, r9, r10, r11)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r8 = r2
            r2 = r0
            r16 = r7
            r7 = r6
            r6 = r16
        L_0x006b:
            T r9 = r6.element
            kotlinx.coroutines.internal.o0 r10 = kotlinx.coroutines.flow.internal.C11936l.f29518c
            if (r9 == r10) goto L_0x0101
            kotlin.jvm.internal.Ref$LongRef r9 = new kotlin.jvm.internal.Ref$LongRef
            r9.<init>()
            T r10 = r6.element
            if (r10 == 0) goto L_0x00b4
            kotlin.jvm.functions.l<T, java.lang.Long> r11 = r2.$timeoutMillisSelector
            kotlinx.coroutines.internal.o0 r12 = kotlinx.coroutines.flow.internal.C11936l.f29516a
            if (r10 != r12) goto L_0x0081
            r10 = r5
        L_0x0081:
            java.lang.Object r10 = r11.invoke(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            r9.element = r10
            r13 = 0
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x0095
            r15 = r4
            goto L_0x0096
        L_0x0095:
            r15 = 0
        L_0x0096:
            if (r15 == 0) goto L_0x00ba
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x00b4
            T r10 = r6.element
            if (r10 != r12) goto L_0x00a1
            r10 = r5
        L_0x00a1:
            r2.L$0 = r8
            r2.L$1 = r7
            r2.L$2 = r6
            r2.L$3 = r9
            r2.label = r4
            java.lang.Object r10 = r8.emit(r10, r2)
            if (r10 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            r6.element = r5
        L_0x00b4:
            r16 = r6
            r6 = r2
            r2 = r16
            goto L_0x00c6
        L_0x00ba:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Debounce timeout should not be negative"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00c6:
            kotlinx.coroutines.selects.SelectImplementation r10 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r11 = r6.getContext()
            r10.<init>(r11)
            T r11 = r2.element
            if (r11 == 0) goto L_0x00dd
            long r11 = r9.element
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r9 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1
            r9.<init>(r8, r2, r5)
            kotlinx.coroutines.selects.C12121a.m48521a(r10, r11, r9)
        L_0x00dd:
            kotlinx.coroutines.selects.e r9 = r7.mo23807U()
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r11 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2
            r11.<init>(r2, r8, r5)
            r10.mo24712i(r9, r11)
            r6.L$0 = r8
            r6.L$1 = r7
            r6.L$2 = r2
            r6.L$3 = r5
            r6.label = r3
            java.lang.Object r9 = r10.mo24716w(r6)
            if (r9 != r1) goto L_0x00fa
            return r1
        L_0x00fa:
            r16 = r6
            r6 = r2
            r2 = r16
            goto L_0x006b
        L_0x0101:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
