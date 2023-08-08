package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2193f;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C3044g0
@C11363r0({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n20#2:891\n22#2:895\n50#3:892\n55#3:894\n106#4:893\n76#5:896\n102#5,2:897\n76#5:899\n102#5,2:900\n76#5:902\n102#5,2:903\n76#5:933\n102#5,2:934\n76#5:936\n102#5,2:937\n76#5:939\n102#5,2:940\n2333#6,14:905\n2333#6,14:919\n1#7:942\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n128#1:891\n128#1:895\n128#1:892\n128#1:894\n128#1:893\n91#1:896\n91#1:897,2\n97#1:899\n97#1:900,2\n124#1:902\n124#1:903,2\n195#1:933\n195#1:934,2\n197#1:936\n197#1:937,2\n199#1:939\n199#1:940,2\n174#1:905,14\n180#1:919,14\n*E\n"})
public class SwipeableState<T> {
    @C12579k

    /* renamed from: q */
    public static final Companion f7873q = new Companion((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final int f7874r = 0;
    @C12579k

    /* renamed from: a */
    public final C1968g<Float> f7875a;
    @C12579k

    /* renamed from: b */
    public final C11300l<T, Boolean> f7876b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f7877c;
    @C12579k

    /* renamed from: d */
    public final C8700z0 f7878d;
    @C12579k

    /* renamed from: e */
    public final C8700z0<Float> f7879e;
    @C12579k

    /* renamed from: f */
    public final C8700z0<Float> f7880f;
    @C12579k

    /* renamed from: g */
    public final C8700z0<Float> f7881g;
    @C12579k

    /* renamed from: h */
    public final C8700z0<Float> f7882h;
    @C12579k

    /* renamed from: i */
    public final C8700z0 f7883i;
    @C12579k

    /* renamed from: j */
    public final C11907e<Map<Float, T>> f7884j;

    /* renamed from: k */
    public float f7885k;

    /* renamed from: l */
    public float f7886l;
    @C12579k

    /* renamed from: m */
    public final C8700z0 f7887m;
    @C12579k

    /* renamed from: n */
    public final C8700z0 f7888n;
    @C12579k

    /* renamed from: o */
    public final C8700z0 f7889o;
    @C12579k

    /* renamed from: p */
    public final C2193f f7890p;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final <T> C8628e<SwipeableState<T>, T> mo10523a(@C12579k C1968g<Float> gVar, @C12579k C11300l<? super T, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(gVar, "animationSpec");
            Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
            return SaverKt.m31375a(SwipeableState$Companion$Saver$1.f7896f, new SwipeableState$Companion$Saver$2(gVar, lVar));
        }

        public Companion() {
        }
    }

    /* renamed from: androidx.compose.material.SwipeableState$a */
    public static final class C3008a implements C11908f<Map<Float, ? extends T>> {

        /* renamed from: a */
        public final /* synthetic */ SwipeableState<T> f7892a;

        /* renamed from: b */
        public final /* synthetic */ float f7893b;

        public C3008a(SwipeableState<T> swipeableState, float f) {
            this.f7892a = swipeableState;
            this.f7893b = f;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k Map<Float, ? extends T> map, @C12579k C11045c<? super C11079d2> cVar) {
            Float c = SwipeableKt.m13907f(map, this.f7892a.mo10513p());
            Intrinsics.checkNotNull(c);
            float floatValue = c.floatValue();
            Object obj = map.get(C11064a.m42619e(SwipeableKt.m13905d(this.f7892a.mo10518v().getValue().floatValue(), floatValue, map.keySet(), this.f7892a.mo10491C(), this.f7893b, this.f7892a.mo10492D())));
            if (obj == null || !this.f7892a.mo10512o().invoke(obj).booleanValue()) {
                SwipeableState<T> swipeableState = this.f7892a;
                Object a = swipeableState.mo10507i(floatValue, swipeableState.mo10511n(), cVar);
                if (a == C11063b.m42612h()) {
                    return a;
                }
                return C11079d2.f28267a;
            }
            Object k = SwipeableState.m13939k(this.f7892a, obj, (C1968g) null, cVar, 2, (Object) null);
            if (k == C11063b.m42612h()) {
                return k;
            }
            return C11079d2.f28267a;
        }
    }

    public SwipeableState(T t, @C12579k C1968g<Float> gVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(gVar, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
        this.f7875a = gVar;
        this.f7876b = lVar;
        this.f7877c = C8539f2.m30981g(t, (C8410b2) null, 2, (Object) null);
        this.f7878d = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
        Float valueOf = Float.valueOf(0.0f);
        this.f7879e = C8539f2.m30981g(valueOf, (C8410b2) null, 2, (Object) null);
        this.f7880f = C8539f2.m30981g(valueOf, (C8410b2) null, 2, (Object) null);
        this.f7881g = C8539f2.m30981g(valueOf, (C8410b2) null, 2, (Object) null);
        this.f7882h = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f7883i = C8539f2.m30981g(C10977s0.m41492z(), (C8410b2) null, 2, (Object) null);
        this.f7884j = C11909g.m47410U1(new SwipeableState$special$$inlined$filter$1(C8415c2.m30253v(new SwipeableState$latestNonEmptyAnchorsFlow$1(this))), 1);
        this.f7885k = Float.NEGATIVE_INFINITY;
        this.f7886l = Float.POSITIVE_INFINITY;
        this.f7887m = C8539f2.m30981g(SwipeableState$thresholds$2.f7902f, (C8410b2) null, 2, (Object) null);
        this.f7888n = C8539f2.m30981g(valueOf, (C8410b2) null, 2, (Object) null);
        this.f7889o = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f7890p = DraggableKt.m9297a(new SwipeableState$draggableState$1(this));
    }

    @C3044g0
    /* renamed from: B */
    public static /* synthetic */ void m13930B() {
    }

    /* renamed from: k */
    public static /* synthetic */ Object m13939k(SwipeableState swipeableState, Object obj, C1968g<Float> gVar, C11045c cVar, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                gVar = swipeableState.f7875a;
            }
            return swipeableState.mo10508j(obj, gVar, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    @C3044g0
    /* renamed from: r */
    public static /* synthetic */ void m13940r() {
    }

    @C3044g0
    /* renamed from: y */
    public static /* synthetic */ void m13941y() {
    }

    /* renamed from: A */
    public final T mo10490A() {
        float f;
        float f2;
        Float value = this.f7882h.getValue();
        if (value != null) {
            f = value.floatValue();
        } else {
            float floatValue = mo10518v().getValue().floatValue();
            Float c = SwipeableKt.m13907f(mo10510m(), mo10513p());
            if (c != null) {
                f2 = c.floatValue();
            } else {
                f2 = mo10518v().getValue().floatValue();
            }
            f = SwipeableKt.m13905d(floatValue, f2, mo10510m().keySet(), mo10491C(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = mo10510m().get(Float.valueOf(f));
        if (t == null) {
            return mo10513p();
        }
        return t;
    }

    @C12579k
    /* renamed from: C */
    public final C11304p<Float, Float, Float> mo10491C() {
        return (C11304p) this.f7887m.getValue();
    }

    /* renamed from: D */
    public final float mo10492D() {
        return ((Number) this.f7888n.getValue()).floatValue();
    }

    /* renamed from: E */
    public final boolean mo10493E() {
        return ((Boolean) this.f7878d.getValue()).booleanValue();
    }

    /* renamed from: F */
    public final float mo10494F(float f) {
        float H = C11479u.m44331H(this.f7881g.getValue().floatValue() + f, this.f7885k, this.f7886l) - this.f7881g.getValue().floatValue();
        if (Math.abs(H) > 0.0f) {
            this.f7890p.mo7349b(H);
        }
        return H;
    }

    @C12580l
    /* renamed from: G */
    public final Object mo10495G(float f, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = this.f7884j.collect(new C3008a(this, f), cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|19|79|80|(1:82)(4:83|84|87|88)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x020c */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x021a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo10496H(@org.jetbrains.annotations.C12579k java.util.Map<java.lang.Float, ? extends T> r10, @org.jetbrains.annotations.C12579k java.util.Map<java.lang.Float, ? extends T> r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.material.SwipeableState$processNewAnchors$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material.SwipeableState$processNewAnchors$1 r0 = (androidx.compose.material.SwipeableState$processNewAnchors$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableState$processNewAnchors$1 r0 = new androidx.compose.material.SwipeableState$processNewAnchors$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r5) goto L_0x0058
            if (r2 == r4) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            float r10 = r0.F$0
            java.lang.Object r11 = r0.L$1
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r0 = r0.L$0
            androidx.compose.material.SwipeableState r0 = (androidx.compose.material.SwipeableState) r0
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x003a }
            goto L_0x021c
        L_0x003a:
            r12 = move-exception
            goto L_0x024e
        L_0x003d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0045:
            float r10 = r0.F$0
            java.lang.Object r11 = r0.L$1
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.SwipeableState r2 = (androidx.compose.material.SwipeableState) r2
            kotlin.C11661u0.m45747n(r12)     // Catch:{ CancellationException -> 0x020c }
            goto L_0x01d5
        L_0x0054:
            r12 = move-exception
            r0 = r2
            goto L_0x024e
        L_0x0058:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00a2
        L_0x005c:
            kotlin.C11661u0.m45747n(r12)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x00b1
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40625e4(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r9.f7885k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40535M3(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r9.f7886l = r10
            java.lang.Object r10 = r9.mo10513p()
            java.lang.Float r10 = androidx.compose.material.SwipeableKt.m13907f(r11, r10)
            if (r10 == 0) goto L_0x00a5
            float r10 = r10.floatValue()
            r0.label = r5
            java.lang.Object r10 = r9.mo10505Q(r10, r0)
            if (r10 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x00a5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "The initial value must have an associated anchor."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00b1:
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r10)
            if (r12 != 0) goto L_0x0280
            r12 = -8388608(0xffffffffff800000, float:-Infinity)
            r9.f7885k = r12
            r12 = 2139095040(0x7f800000, float:Infinity)
            r9.f7886l = r12
            androidx.compose.runtime.z0<java.lang.Float> r12 = r9.f7882h
            java.lang.Object r12 = r12.getValue()
            java.lang.Float r12 = (java.lang.Float) r12
            r2 = 0
            if (r12 == 0) goto L_0x0133
            java.lang.Object r10 = r10.get(r12)
            java.lang.Float r10 = androidx.compose.material.SwipeableKt.m13907f(r11, r10)
            if (r10 == 0) goto L_0x00da
            float r10 = r10.floatValue()
            goto L_0x01c3
        L_0x00da:
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r5 = r10.iterator()
            boolean r10 = r5.hasNext()
            if (r10 != 0) goto L_0x00eb
            goto L_0x0128
        L_0x00eb:
            java.lang.Object r2 = r5.next()
            boolean r10 = r5.hasNext()
            if (r10 != 0) goto L_0x00f6
            goto L_0x0128
        L_0x00f6:
            r10 = r2
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r6 = r12.floatValue()
            float r10 = r10 - r6
            float r10 = java.lang.Math.abs(r10)
        L_0x0106:
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r8 = r12.floatValue()
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            int r8 = java.lang.Float.compare(r10, r7)
            if (r8 <= 0) goto L_0x0122
            r2 = r6
            r10 = r7
        L_0x0122:
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x0106
        L_0x0128:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
            goto L_0x01c3
        L_0x0133:
            androidx.compose.runtime.k2 r12 = r9.mo10518v()
            java.lang.Object r12 = r12.getValue()
            java.lang.Object r10 = r10.get(r12)
            java.lang.Object r12 = r9.mo10513p()
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x014d
            java.lang.Object r10 = r9.mo10513p()
        L_0x014d:
            java.lang.Float r10 = androidx.compose.material.SwipeableKt.m13907f(r11, r10)
            if (r10 == 0) goto L_0x0158
            float r10 = r10.floatValue()
            goto L_0x01c3
        L_0x0158:
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto L_0x0169
            goto L_0x01ba
        L_0x0169:
            java.lang.Object r2 = r10.next()
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto L_0x0174
            goto L_0x01ba
        L_0x0174:
            r12 = r2
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            androidx.compose.runtime.k2 r5 = r9.mo10518v()
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r12 = r12 - r5
            float r12 = java.lang.Math.abs(r12)
        L_0x018e:
            java.lang.Object r5 = r10.next()
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            androidx.compose.runtime.k2 r7 = r9.mo10518v()
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            int r7 = java.lang.Float.compare(r12, r6)
            if (r7 <= 0) goto L_0x01b4
            r2 = r5
            r12 = r6
        L_0x01b4:
            boolean r5 = r10.hasNext()
            if (r5 != 0) goto L_0x018e
        L_0x01ba:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
        L_0x01c3:
            androidx.compose.animation.core.g<java.lang.Float> r12 = r9.f7875a     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            r0.L$1 = r11     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            r0.F$0 = r10     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            r0.label = r4     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            java.lang.Object r12 = r9.mo10507i(r10, r12, r0)     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            if (r12 != r1) goto L_0x01d4
            return r1
        L_0x01d4:
            r2 = r9
        L_0x01d5:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r10)
            java.lang.Object r10 = kotlin.collections.C10977s0.m41443K(r11, r10)
            r2.mo10499K(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40625e4(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r2.f7885k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40535M3(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r2.f7886l = r10
            goto L_0x0280
        L_0x0208:
            r12 = move-exception
            r0 = r9
            goto L_0x024e
        L_0x020b:
            r2 = r9
        L_0x020c:
            r0.L$0 = r2     // Catch:{ all -> 0x0054 }
            r0.L$1 = r11     // Catch:{ all -> 0x0054 }
            r0.F$0 = r10     // Catch:{ all -> 0x0054 }
            r0.label = r3     // Catch:{ all -> 0x0054 }
            java.lang.Object r12 = r2.mo10505Q(r10, r0)     // Catch:{ all -> 0x0054 }
            if (r12 != r1) goto L_0x021b
            return r1
        L_0x021b:
            r0 = r2
        L_0x021c:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r10)
            java.lang.Object r10 = kotlin.collections.C10977s0.m41443K(r11, r10)
            r0.mo10499K(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40625e4(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r0.f7885k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40535M3(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r0.f7886l = r10
            goto L_0x0280
        L_0x024e:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r10)
            java.lang.Object r10 = kotlin.collections.C10977s0.m41443K(r11, r10)
            r0.mo10499K(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40625e4(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r0.f7885k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40535M3(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r0.f7886l = r10
            throw r12
        L_0x0280:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.mo10496H(java.util.Map, java.util.Map, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: I */
    public final void mo10497I(@C12579k Map<Float, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f7883i.setValue(map);
    }

    /* renamed from: J */
    public final void mo10498J(boolean z) {
        this.f7878d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: K */
    public final void mo10499K(T t) {
        this.f7877c.setValue(t);
    }

    /* renamed from: L */
    public final void mo10500L(float f) {
        this.f7886l = f;
    }

    /* renamed from: M */
    public final void mo10501M(float f) {
        this.f7885k = f;
    }

    /* renamed from: N */
    public final void mo10502N(@C12580l C3033c1 c1Var) {
        this.f7889o.setValue(c1Var);
    }

    /* renamed from: O */
    public final void mo10503O(@C12579k C11304p<? super Float, ? super Float, Float> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.f7887m.setValue(pVar);
    }

    /* renamed from: P */
    public final void mo10504P(float f) {
        this.f7888n.setValue(Float.valueOf(f));
    }

    /* renamed from: Q */
    public final Object mo10505Q(float f, C11045c<? super C11079d2> cVar) {
        Object c = C2193f.m9521c(this.f7890p, (MutatePriority) null, new SwipeableState$snapInternalToOffset$2(f, this, (C11045c<? super SwipeableState$snapInternalToOffset$2>) null), cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    @C12580l
    @C3044g0
    /* renamed from: R */
    public final Object mo10506R(T t, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = this.f7884j.collect(new SwipeableState$snapTo$2(t, this), cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }

    /* renamed from: i */
    public final Object mo10507i(float f, C1968g<Float> gVar, C11045c<? super C11079d2> cVar) {
        Object c = C2193f.m9521c(this.f7890p, (MutatePriority) null, new SwipeableState$animateInternalToOffset$2(this, f, gVar, (C11045c<? super SwipeableState$animateInternalToOffset$2>) null), cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    @C12580l
    @C3044g0
    /* renamed from: j */
    public final Object mo10508j(T t, @C12579k C1968g<Float> gVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = this.f7884j.collect(new SwipeableState$animateTo$2(t, this, gVar), cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }

    /* renamed from: l */
    public final void mo10509l(@C12579k Map<Float, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "newAnchors");
        if (mo10510m().isEmpty()) {
            Float c = SwipeableKt.m13907f(map, mo10513p());
            if (c != null) {
                this.f7879e.setValue(c);
                this.f7881g.setValue(c);
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    @C12579k
    /* renamed from: m */
    public final Map<Float, T> mo10510m() {
        return (Map) this.f7883i.getValue();
    }

    @C12579k
    /* renamed from: n */
    public final C1968g<Float> mo10511n() {
        return this.f7875a;
    }

    @C12579k
    /* renamed from: o */
    public final C11300l<T, Boolean> mo10512o() {
        return this.f7876b;
    }

    /* renamed from: p */
    public final T mo10513p() {
        return this.f7877c.getValue();
    }

    /* renamed from: q */
    public final float mo10514q() {
        Float c = SwipeableKt.m13907f(mo10510m(), mo10513p());
        if (c == null) {
            return 0.0f;
        }
        return Math.signum(mo10518v().getValue().floatValue() - c.floatValue());
    }

    @C12579k
    /* renamed from: s */
    public final C2193f mo10515s() {
        return this.f7890p;
    }

    /* renamed from: t */
    public final float mo10516t() {
        return this.f7886l;
    }

    /* renamed from: u */
    public final float mo10517u() {
        return this.f7885k;
    }

    @C12579k
    /* renamed from: v */
    public final C8578k2<Float> mo10518v() {
        return this.f7879e;
    }

    @C12579k
    /* renamed from: w */
    public final C8578k2<Float> mo10519w() {
        return this.f7880f;
    }

    @C12579k
    /* renamed from: x */
    public final C7882m1<T> mo10520x() {
        Object obj;
        Object obj2;
        float f;
        Pair pair;
        List b = SwipeableKt.m13906e(mo10518v().getValue().floatValue(), mo10510m().keySet());
        int size = b.size();
        if (size == 0) {
            Object p = mo10513p();
            obj = mo10513p();
            obj2 = p;
            f = 1.0f;
        } else if (size != 1) {
            if (mo10514q() > 0.0f) {
                pair = C11078d1.m42659a(b.get(0), b.get(1));
            } else {
                pair = C11078d1.m42659a(b.get(1), b.get(0));
            }
            float floatValue = ((Number) pair.mo21846a()).floatValue();
            float floatValue2 = ((Number) pair.mo21847b()).floatValue();
            obj2 = C10977s0.m41443K(mo10510m(), Float.valueOf(floatValue));
            obj = C10977s0.m41443K(mo10510m(), Float.valueOf(floatValue2));
            f = (mo10518v().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
        } else {
            Object K = C10977s0.m41443K(mo10510m(), b.get(0));
            obj = C10977s0.m41443K(mo10510m(), b.get(0));
            f = 1.0f;
            obj2 = K;
        }
        return new C7882m1<>(obj2, obj, f);
    }

    @C12580l
    /* renamed from: z */
    public final C3033c1 mo10521z() {
        return (C3033c1) this.f7889o.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwipeableState(Object obj, C1968g gVar, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? C7885n1.f18885a.mo10889a() : gVar, (i & 4) != 0 ? C30071.f7891f : lVar);
    }
}
