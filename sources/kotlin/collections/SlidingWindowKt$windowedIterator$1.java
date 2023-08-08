package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.sequences.C11561o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", mo22502f = "SlidingWindow.kt", mo22503i = {0, 0, 0, 2, 2, 3, 3}, mo22504l = {34, 40, 49, 55, 58}, mo22505m = "invokeSuspend", mo22506n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, mo22507s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlin/sequences/o;", "", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super List<? extends T>>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Iterator<T> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, C11045c<? super SlidingWindowKt$windowedIterator$1> cVar) {
        super(2, cVar);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, cVar);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super List<? extends T>> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SlidingWindowKt$windowedIterator$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0126 A[SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x005a
            if (r1 == r6) goto L_0x0046
            if (r1 == r5) goto L_0x0041
            if (r1 == r4) goto L_0x002f
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            goto L_0x0041
        L_0x0019:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0021:
            java.lang.Object r1 = r11.L$1
            kotlin.collections.a1 r1 = (kotlin.collections.C10902a1) r1
            java.lang.Object r4 = r11.L$0
            kotlin.sequences.o r4 = (kotlin.sequences.C11561o) r4
            kotlin.C11661u0.m45747n(r12)
            r12 = r11
            goto L_0x014e
        L_0x002f:
            java.lang.Object r1 = r11.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r5 = r11.L$1
            kotlin.collections.a1 r5 = (kotlin.collections.C10902a1) r5
            java.lang.Object r8 = r11.L$0
            kotlin.sequences.o r8 = (kotlin.sequences.C11561o) r8
            kotlin.C11661u0.m45747n(r12)
            r12 = r11
            goto L_0x0120
        L_0x0041:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x016a
        L_0x0046:
            int r1 = r11.I$0
            java.lang.Object r2 = r11.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r11.L$1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r11.L$0
            kotlin.sequences.o r4 = (kotlin.sequences.C11561o) r4
            kotlin.C11661u0.m45747n(r12)
            r8 = r11
        L_0x0058:
            r12 = r1
            goto L_0x00a9
        L_0x005a:
            kotlin.C11661u0.m45747n(r12)
            java.lang.Object r12 = r11.L$0
            kotlin.sequences.o r12 = (kotlin.sequences.C11561o) r12
            int r1 = r11.$size
            r8 = 1024(0x400, float:1.435E-42)
            int r1 = kotlin.ranges.C11479u.m44313B(r1, r8)
            int r8 = r11.$step
            int r9 = r11.$size
            int r8 = r8 - r9
            if (r8 < 0) goto L_0x00dd
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator<T> r1 = r11.$iterator
            r3 = 0
            r4 = r12
            r12 = r3
            r3 = r2
            r2 = r1
            r1 = r8
            r8 = r11
        L_0x007e:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00bb
            java.lang.Object r9 = r2.next()
            if (r12 <= 0) goto L_0x008d
            int r12 = r12 + -1
            goto L_0x007e
        L_0x008d:
            r3.add(r9)
            int r9 = r3.size()
            int r10 = r8.$size
            if (r9 != r10) goto L_0x007e
            r8.L$0 = r4
            r8.L$1 = r3
            r8.L$2 = r2
            r8.I$0 = r1
            r8.label = r6
            java.lang.Object r12 = r4.mo23250b(r3, r8)
            if (r12 != r0) goto L_0x0058
            return r0
        L_0x00a9:
            boolean r1 = r8.$reuseBuffer
            if (r1 == 0) goto L_0x00b1
            r3.clear()
            goto L_0x00b9
        L_0x00b1:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r8.$size
            r1.<init>(r3)
            r3 = r1
        L_0x00b9:
            r1 = r12
            goto L_0x007e
        L_0x00bb:
            boolean r12 = r3.isEmpty()
            r12 = r12 ^ r6
            if (r12 == 0) goto L_0x016a
            boolean r12 = r8.$partialWindows
            if (r12 != 0) goto L_0x00ce
            int r12 = r3.size()
            int r1 = r8.$size
            if (r12 != r1) goto L_0x016a
        L_0x00ce:
            r8.L$0 = r7
            r8.L$1 = r7
            r8.L$2 = r7
            r8.label = r5
            java.lang.Object r12 = r4.mo23250b(r3, r8)
            if (r12 != r0) goto L_0x016a
            return r0
        L_0x00dd:
            kotlin.collections.a1 r5 = new kotlin.collections.a1
            r5.<init>(r1)
            java.util.Iterator<T> r1 = r11.$iterator
            r8 = r12
            r12 = r11
        L_0x00e6:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0126
            java.lang.Object r9 = r1.next()
            r5.mo22049r(r9)
            boolean r9 = r5.mo22047H()
            if (r9 == 0) goto L_0x00e6
            int r9 = r5.size()
            int r10 = r12.$size
            if (r9 >= r10) goto L_0x0106
            kotlin.collections.a1 r5 = r5.mo22050w(r10)
            goto L_0x00e6
        L_0x0106:
            boolean r9 = r12.$reuseBuffer
            if (r9 == 0) goto L_0x010c
            r9 = r5
            goto L_0x0111
        L_0x010c:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
        L_0x0111:
            r12.L$0 = r8
            r12.L$1 = r5
            r12.L$2 = r1
            r12.label = r4
            java.lang.Object r9 = r8.mo23250b(r9, r12)
            if (r9 != r0) goto L_0x0120
            return r0
        L_0x0120:
            int r9 = r12.$step
            r5.mo22048M(r9)
            goto L_0x00e6
        L_0x0126:
            boolean r1 = r12.$partialWindows
            if (r1 == 0) goto L_0x016a
            r1 = r5
            r4 = r8
        L_0x012c:
            int r5 = r1.size()
            int r8 = r12.$step
            if (r5 <= r8) goto L_0x0154
            boolean r5 = r12.$reuseBuffer
            if (r5 == 0) goto L_0x013a
            r5 = r1
            goto L_0x013f
        L_0x013a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
        L_0x013f:
            r12.L$0 = r4
            r12.L$1 = r1
            r12.L$2 = r7
            r12.label = r3
            java.lang.Object r5 = r4.mo23250b(r5, r12)
            if (r5 != r0) goto L_0x014e
            return r0
        L_0x014e:
            int r5 = r12.$step
            r1.mo22048M(r5)
            goto L_0x012c
        L_0x0154:
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x016a
            r12.L$0 = r7
            r12.L$1 = r7
            r12.L$2 = r7
            r12.label = r2
            java.lang.Object r12 = r4.mo23250b(r1, r12)
            if (r12 != r0) goto L_0x016a
            return r0
        L_0x016a:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
