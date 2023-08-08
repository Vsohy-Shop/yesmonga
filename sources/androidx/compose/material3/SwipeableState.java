package androidx.compose.material3;

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
@C8251n0
@C11363r0({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,886:1\n20#2:887\n22#2:891\n50#3:888\n55#3:890\n106#4:889\n76#5:892\n102#5,2:893\n76#5:895\n102#5,2:896\n76#5:898\n102#5,2:899\n76#5:929\n102#5,2:930\n76#5:932\n102#5,2:933\n76#5:935\n102#5,2:936\n2333#6,14:901\n2333#6,14:915\n1#7:938\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableState\n*L\n128#1:887\n128#1:891\n128#1:888\n128#1:890\n128#1:889\n91#1:892\n91#1:893,2\n97#1:895\n97#1:896,2\n124#1:898\n124#1:899,2\n195#1:929\n195#1:930,2\n197#1:932\n197#1:933,2\n199#1:935\n199#1:936,2\n174#1:901,14\n180#1:915,14\n*E\n"})
public class SwipeableState<T> {
    @C12579k

    /* renamed from: q */
    public static final Companion f19758q = new Companion((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final C1968g<Float> f19759a;
    @C12579k

    /* renamed from: b */
    public final C11300l<T, Boolean> f19760b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f19761c;
    @C12579k

    /* renamed from: d */
    public final C8700z0 f19762d;
    @C12579k

    /* renamed from: e */
    public final C8700z0<Float> f19763e;
    @C12579k

    /* renamed from: f */
    public final C8700z0<Float> f19764f;
    @C12579k

    /* renamed from: g */
    public final C8700z0<Float> f19765g;
    @C12579k

    /* renamed from: h */
    public final C8700z0<Float> f19766h;
    @C12579k

    /* renamed from: i */
    public final C8700z0 f19767i;
    @C12579k

    /* renamed from: j */
    public final C11907e<Map<Float, T>> f19768j;

    /* renamed from: k */
    public float f19769k;

    /* renamed from: l */
    public float f19770l;
    @C12579k

    /* renamed from: m */
    public final C8700z0 f19771m;
    @C12579k

    /* renamed from: n */
    public final C8700z0 f19772n;
    @C12579k

    /* renamed from: o */
    public final C8700z0 f19773o;
    @C12579k

    /* renamed from: p */
    public final C2193f f19774p;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final <T> C8628e<SwipeableState<T>, T> mo12068a(@C12579k C1968g<Float> gVar, @C12579k C11300l<? super T, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(gVar, "animationSpec");
            Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
            return SaverKt.m31375a(SwipeableState$Companion$Saver$1.f19780f, new SwipeableState$Companion$Saver$2(gVar, lVar));
        }

        public Companion() {
        }
    }

    /* renamed from: androidx.compose.material3.SwipeableState$a */
    public static final class C8120a implements C11908f<Map<Float, ? extends T>> {

        /* renamed from: a */
        public final /* synthetic */ SwipeableState<T> f19776a;

        /* renamed from: b */
        public final /* synthetic */ float f19777b;

        public C8120a(SwipeableState<T> swipeableState, float f) {
            this.f19776a = swipeableState;
            this.f19777b = f;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k Map<Float, ? extends T> map, @C12579k C11045c<? super C11079d2> cVar) {
            Float c = SwipeableKt.m26380f(map, this.f19776a.mo12058p());
            Intrinsics.checkNotNull(c);
            float floatValue = c.floatValue();
            Object obj = map.get(C11064a.m42619e(SwipeableKt.m26378d(this.f19776a.mo12063v().getValue().floatValue(), floatValue, map.keySet(), this.f19776a.mo12036C(), this.f19777b, this.f19776a.mo12037D())));
            if (obj == null || !this.f19776a.mo12057o().invoke(obj).booleanValue()) {
                SwipeableState<T> swipeableState = this.f19776a;
                Object a = swipeableState.mo12052i(floatValue, swipeableState.mo12056n(), cVar);
                if (a == C11063b.m42612h()) {
                    return a;
                }
                return C11079d2.f28267a;
            }
            Object k = SwipeableState.m26412k(this.f19776a, obj, (C1968g) null, cVar, 2, (Object) null);
            if (k == C11063b.m42612h()) {
                return k;
            }
            return C11079d2.f28267a;
        }
    }

    public SwipeableState(T t, @C12579k C1968g<Float> gVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(gVar, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
        this.f19759a = gVar;
        this.f19760b = lVar;
        this.f19761c = C8539f2.m30981g(t, (C8410b2) null, 2, (Object) null);
        this.f19762d = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
        Float valueOf = Float.valueOf(0.0f);
        this.f19763e = C8539f2.m30981g(valueOf, (C8410b2) null, 2, (Object) null);
        this.f19764f = C8539f2.m30981g(valueOf, (C8410b2) null, 2, (Object) null);
        this.f19765g = C8539f2.m30981g(valueOf, (C8410b2) null, 2, (Object) null);
        this.f19766h = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f19767i = C8539f2.m30981g(C10977s0.m41492z(), (C8410b2) null, 2, (Object) null);
        this.f19768j = C11909g.m47410U1(new SwipeableState$special$$inlined$filter$1(C8415c2.m30253v(new SwipeableState$latestNonEmptyAnchorsFlow$1(this))), 1);
        this.f19769k = Float.NEGATIVE_INFINITY;
        this.f19770l = Float.POSITIVE_INFINITY;
        this.f19771m = C8539f2.m30981g(SwipeableState$thresholds$2.f19786f, (C8410b2) null, 2, (Object) null);
        this.f19772n = C8539f2.m30981g(valueOf, (C8410b2) null, 2, (Object) null);
        this.f19773o = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f19774p = DraggableKt.m9297a(new SwipeableState$draggableState$1(this));
    }

    @C8251n0
    /* renamed from: B */
    public static /* synthetic */ void m26403B() {
    }

    /* renamed from: k */
    public static /* synthetic */ Object m26412k(SwipeableState swipeableState, Object obj, C1968g<Float> gVar, C11045c cVar, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                gVar = swipeableState.f19759a;
            }
            return swipeableState.mo12053j(obj, gVar, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    @C8251n0
    /* renamed from: r */
    public static /* synthetic */ void m26413r() {
    }

    @C8251n0
    /* renamed from: y */
    public static /* synthetic */ void m26414y() {
    }

    /* renamed from: A */
    public final T mo12035A() {
        float f;
        float f2;
        Float value = this.f19766h.getValue();
        if (value != null) {
            f = value.floatValue();
        } else {
            float floatValue = mo12063v().getValue().floatValue();
            Float c = SwipeableKt.m26380f(mo12055m(), mo12058p());
            if (c != null) {
                f2 = c.floatValue();
            } else {
                f2 = mo12063v().getValue().floatValue();
            }
            f = SwipeableKt.m26378d(floatValue, f2, mo12055m().keySet(), mo12036C(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = mo12055m().get(Float.valueOf(f));
        if (t == null) {
            return mo12058p();
        }
        return t;
    }

    @C12579k
    /* renamed from: C */
    public final C11304p<Float, Float, Float> mo12036C() {
        return (C11304p) this.f19771m.getValue();
    }

    /* renamed from: D */
    public final float mo12037D() {
        return ((Number) this.f19772n.getValue()).floatValue();
    }

    /* renamed from: E */
    public final boolean mo12038E() {
        return ((Boolean) this.f19762d.getValue()).booleanValue();
    }

    /* renamed from: F */
    public final float mo12039F(float f) {
        float H = C11479u.m44331H(this.f19765g.getValue().floatValue() + f, this.f19769k, this.f19770l) - this.f19765g.getValue().floatValue();
        if (Math.abs(H) > 0.0f) {
            this.f19774p.mo7349b(H);
        }
        return H;
    }

    @C12580l
    /* renamed from: G */
    public final Object mo12040G(float f, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = this.f19768j.collect(new C8120a(this, f), cVar);
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
    public final java.lang.Object mo12041H(@org.jetbrains.annotations.C12579k java.util.Map<java.lang.Float, ? extends T> r10, @org.jetbrains.annotations.C12579k java.util.Map<java.lang.Float, ? extends T> r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.material3.SwipeableState$processNewAnchors$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material3.SwipeableState$processNewAnchors$1 r0 = (androidx.compose.material3.SwipeableState$processNewAnchors$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SwipeableState$processNewAnchors$1 r0 = new androidx.compose.material3.SwipeableState$processNewAnchors$1
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
            androidx.compose.material3.SwipeableState r0 = (androidx.compose.material3.SwipeableState) r0
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
            androidx.compose.material3.SwipeableState r2 = (androidx.compose.material3.SwipeableState) r2
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
            r9.f19769k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40535M3(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r9.f19770l = r10
            java.lang.Object r10 = r9.mo12058p()
            java.lang.Float r10 = androidx.compose.material3.SwipeableKt.m26380f(r11, r10)
            if (r10 == 0) goto L_0x00a5
            float r10 = r10.floatValue()
            r0.label = r5
            java.lang.Object r10 = r9.mo12050Q(r10, r0)
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
            r9.f19769k = r12
            r12 = 2139095040(0x7f800000, float:Infinity)
            r9.f19770l = r12
            androidx.compose.runtime.z0<java.lang.Float> r12 = r9.f19766h
            java.lang.Object r12 = r12.getValue()
            java.lang.Float r12 = (java.lang.Float) r12
            r2 = 0
            if (r12 == 0) goto L_0x0133
            java.lang.Object r10 = r10.get(r12)
            java.lang.Float r10 = androidx.compose.material3.SwipeableKt.m26380f(r11, r10)
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
            androidx.compose.runtime.k2 r12 = r9.mo12063v()
            java.lang.Object r12 = r12.getValue()
            java.lang.Object r10 = r10.get(r12)
            java.lang.Object r12 = r9.mo12058p()
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x014d
            java.lang.Object r10 = r9.mo12058p()
        L_0x014d:
            java.lang.Float r10 = androidx.compose.material3.SwipeableKt.m26380f(r11, r10)
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
            androidx.compose.runtime.k2 r5 = r9.mo12063v()
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
            androidx.compose.runtime.k2 r7 = r9.mo12063v()
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
            androidx.compose.animation.core.g<java.lang.Float> r12 = r9.f19759a     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            r0.L$1 = r11     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            r0.F$0 = r10     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            r0.label = r4     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            java.lang.Object r12 = r9.mo12052i(r10, r12, r0)     // Catch:{ CancellationException -> 0x020b, all -> 0x0208 }
            if (r12 != r1) goto L_0x01d4
            return r1
        L_0x01d4:
            r2 = r9
        L_0x01d5:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r10)
            java.lang.Object r10 = kotlin.collections.C10977s0.m41443K(r11, r10)
            r2.mo12044K(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40625e4(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r2.f19769k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40535M3(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r2.f19770l = r10
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
            java.lang.Object r12 = r2.mo12050Q(r10, r0)     // Catch:{ all -> 0x0054 }
            if (r12 != r1) goto L_0x021b
            return r1
        L_0x021b:
            r0 = r2
        L_0x021c:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r10)
            java.lang.Object r10 = kotlin.collections.C10977s0.m41443K(r11, r10)
            r0.mo12044K(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40625e4(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r0.f19769k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40535M3(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r0.f19770l = r10
            goto L_0x0280
        L_0x024e:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r10)
            java.lang.Object r10 = kotlin.collections.C10977s0.m41443K(r11, r10)
            r0.mo12044K(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40625e4(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r0.f19769k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40535M3(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            float r10 = r10.floatValue()
            r0.f19770l = r10
            throw r12
        L_0x0280:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState.mo12041H(java.util.Map, java.util.Map, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: I */
    public final void mo12042I(@C12579k Map<Float, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f19767i.setValue(map);
    }

    /* renamed from: J */
    public final void mo12043J(boolean z) {
        this.f19762d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: K */
    public final void mo12044K(T t) {
        this.f19761c.setValue(t);
    }

    /* renamed from: L */
    public final void mo12045L(float f) {
        this.f19770l = f;
    }

    /* renamed from: M */
    public final void mo12046M(float f) {
        this.f19769k = f;
    }

    /* renamed from: N */
    public final void mo12047N(@C12580l C8177b2 b2Var) {
        this.f19773o.setValue(b2Var);
    }

    /* renamed from: O */
    public final void mo12048O(@C12579k C11304p<? super Float, ? super Float, Float> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.f19771m.setValue(pVar);
    }

    /* renamed from: P */
    public final void mo12049P(float f) {
        this.f19772n.setValue(Float.valueOf(f));
    }

    /* renamed from: Q */
    public final Object mo12050Q(float f, C11045c<? super C11079d2> cVar) {
        Object c = C2193f.m9521c(this.f19774p, (MutatePriority) null, new SwipeableState$snapInternalToOffset$2(f, this, (C11045c<? super SwipeableState$snapInternalToOffset$2>) null), cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    @C12580l
    @C8251n0
    /* renamed from: R */
    public final Object mo12051R(T t, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = this.f19768j.collect(new SwipeableState$snapTo$2(t, this), cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }

    /* renamed from: i */
    public final Object mo12052i(float f, C1968g<Float> gVar, C11045c<? super C11079d2> cVar) {
        Object c = C2193f.m9521c(this.f19774p, (MutatePriority) null, new SwipeableState$animateInternalToOffset$2(this, f, gVar, (C11045c<? super SwipeableState$animateInternalToOffset$2>) null), cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    @C12580l
    @C8251n0
    /* renamed from: j */
    public final Object mo12053j(T t, @C12579k C1968g<Float> gVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = this.f19768j.collect(new SwipeableState$animateTo$2(t, this, gVar), cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }

    /* renamed from: l */
    public final void mo12054l(@C12579k Map<Float, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "newAnchors");
        if (mo12055m().isEmpty()) {
            Float c = SwipeableKt.m26380f(map, mo12058p());
            if (c != null) {
                this.f19763e.setValue(c);
                this.f19765g.setValue(c);
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    @C12579k
    /* renamed from: m */
    public final Map<Float, T> mo12055m() {
        return (Map) this.f19767i.getValue();
    }

    @C12579k
    /* renamed from: n */
    public final C1968g<Float> mo12056n() {
        return this.f19759a;
    }

    @C12579k
    /* renamed from: o */
    public final C11300l<T, Boolean> mo12057o() {
        return this.f19760b;
    }

    /* renamed from: p */
    public final T mo12058p() {
        return this.f19761c.getValue();
    }

    /* renamed from: q */
    public final float mo12059q() {
        Float c = SwipeableKt.m26380f(mo12055m(), mo12058p());
        if (c == null) {
            return 0.0f;
        }
        return Math.signum(mo12063v().getValue().floatValue() - c.floatValue());
    }

    @C12579k
    /* renamed from: s */
    public final C2193f mo12060s() {
        return this.f19774p;
    }

    /* renamed from: t */
    public final float mo12061t() {
        return this.f19770l;
    }

    /* renamed from: u */
    public final float mo12062u() {
        return this.f19769k;
    }

    @C12579k
    /* renamed from: v */
    public final C8578k2<Float> mo12063v() {
        return this.f19763e;
    }

    @C12579k
    /* renamed from: w */
    public final C8578k2<Float> mo12064w() {
        return this.f19764f;
    }

    @C12579k
    /* renamed from: x */
    public final C8365w2<T> mo12065x() {
        Object obj;
        Object obj2;
        float f;
        Pair pair;
        List b = SwipeableKt.m26379e(mo12063v().getValue().floatValue(), mo12055m().keySet());
        int size = b.size();
        if (size == 0) {
            Object p = mo12058p();
            obj = mo12058p();
            obj2 = p;
            f = 1.0f;
        } else if (size != 1) {
            if (mo12059q() > 0.0f) {
                pair = C11078d1.m42659a(b.get(0), b.get(1));
            } else {
                pair = C11078d1.m42659a(b.get(1), b.get(0));
            }
            float floatValue = ((Number) pair.mo21846a()).floatValue();
            float floatValue2 = ((Number) pair.mo21847b()).floatValue();
            obj2 = C10977s0.m41443K(mo12055m(), Float.valueOf(floatValue));
            obj = C10977s0.m41443K(mo12055m(), Float.valueOf(floatValue2));
            f = (mo12063v().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
        } else {
            Object K = C10977s0.m41443K(mo12055m(), b.get(0));
            obj = C10977s0.m41443K(mo12055m(), b.get(0));
            f = 1.0f;
            obj2 = K;
        }
        return new C8365w2<>(obj2, obj, f);
    }

    @C12580l
    /* renamed from: z */
    public final C8177b2 mo12066z() {
        return (C8177b2) this.f19773o.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwipeableState(Object obj, C1968g gVar, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? C8369x2.f22476a.mo14790a() : gVar, (i & 4) != 0 ? C81191.f19775f : lVar);
    }
}
