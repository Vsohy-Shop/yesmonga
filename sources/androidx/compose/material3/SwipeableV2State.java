package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2193f;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C8251n0
@C11363r0({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2State\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,692:1\n76#2:693\n102#2,2:694\n76#2:696\n76#2:697\n102#2,2:698\n76#2:700\n76#2:701\n102#2,2:702\n76#2:704\n76#2:705\n76#2:706\n102#2,2:707\n76#2:709\n102#2,2:710\n288#3,2:712\n1#4:714\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2State\n*L\n199#1:693\n199#1:694,2\n207#1:696\n230#1:697\n230#1:698,2\n253#1:700\n270#1:701\n270#1:702,2\n277#1:704\n283#1:705\n285#1:706\n285#1:707,2\n287#1:709\n287#1:710,2\n369#1:712,2\n*E\n"})
public final class SwipeableV2State<T> {
    @C12579k

    /* renamed from: q */
    public static final Companion f19788q = new Companion((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final C1968g<Float> f19789a;
    @C12579k

    /* renamed from: b */
    public final C11300l<T, Boolean> f19790b;
    @C12579k

    /* renamed from: c */
    public final C11304p<C16479d, Float, Float> f19791c;

    /* renamed from: d */
    public final float f19792d;
    @C12579k

    /* renamed from: e */
    public final InternalMutatorMutex f19793e;
    @C12579k

    /* renamed from: f */
    public final C2193f f19794f;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f19795g;
    @C12579k

    /* renamed from: h */
    public final C8578k2 f19796h;
    @C12579k

    /* renamed from: i */
    public final C8700z0 f19797i;
    @C12579k

    /* renamed from: j */
    public final C8578k2 f19798j;
    @C12579k

    /* renamed from: k */
    public final C8700z0 f19799k;
    @C12579k

    /* renamed from: l */
    public final C8578k2 f19800l;
    @C12579k

    /* renamed from: m */
    public final C8578k2 f19801m;
    @C12579k

    /* renamed from: n */
    public final C8700z0 f19802n;
    @C12579k

    /* renamed from: o */
    public final C8700z0 f19803o;
    @C12580l

    /* renamed from: p */
    public C16479d f19804p;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8251n0
        @C12579k
        /* renamed from: a */
        public final <T> C8628e<SwipeableV2State<T>, T> mo12124a(@C12579k C1968g<Float> gVar, @C12579k C11300l<? super T, Boolean> lVar, @C12579k C11304p<? super C16479d, ? super Float, Float> pVar, float f) {
            Intrinsics.checkNotNullParameter(gVar, "animationSpec");
            Intrinsics.checkNotNullParameter(lVar, "confirmValueChange");
            Intrinsics.checkNotNullParameter(pVar, "positionalThreshold");
            return SaverKt.m31375a(SwipeableV2State$Companion$Saver$1.f19806f, new SwipeableV2State$Companion$Saver$2(gVar, lVar, pVar, f));
        }

        public Companion() {
        }
    }

    public /* synthetic */ SwipeableV2State(Object obj, C1968g gVar, C11300l lVar, C11304p pVar, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, gVar, lVar, pVar, f);
    }

    /* renamed from: P */
    public static /* synthetic */ Object m26482P(SwipeableV2State swipeableV2State, MutatePriority mutatePriority, C11300l lVar, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return swipeableV2State.mo12103O(mutatePriority, lVar, cVar);
    }

    /* renamed from: j */
    public static /* synthetic */ Object m26491j(SwipeableV2State swipeableV2State, Object obj, float f, C11045c cVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = swipeableV2State.mo12115s();
        }
        return swipeableV2State.mo12106i(obj, f, cVar);
    }

    /* renamed from: A */
    public final float mo12089A() {
        return this.f19792d;
    }

    /* renamed from: B */
    public final boolean mo12090B(T t) {
        return mo12109m().containsKey(t);
    }

    /* renamed from: C */
    public final boolean mo12091C() {
        return mo12111o() != null;
    }

    /* renamed from: D */
    public final C16479d mo12092D() {
        C16479d dVar = this.f19804p;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=" + this + " SwipeableState?").toString());
    }

    /* renamed from: E */
    public final float mo12093E() {
        Float v = mo12118v();
        if (v != null) {
            return v.floatValue();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    /* renamed from: F */
    public final void mo12094F(@C12579k Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f19803o.setValue(map);
    }

    /* renamed from: G */
    public final void mo12095G(T t) {
        this.f19802n.setValue(t);
    }

    /* renamed from: H */
    public final void mo12096H(T t) {
        this.f19795g.setValue(t);
    }

    /* renamed from: I */
    public final void mo12097I(@C12580l C16479d dVar) {
        this.f19804p = dVar;
    }

    /* renamed from: J */
    public final void mo12098J(float f) {
        this.f19799k.setValue(Float.valueOf(f));
    }

    /* renamed from: K */
    public final void mo12099K(Float f) {
        this.f19797i.setValue(f);
    }

    @C12580l
    /* renamed from: L */
    public final Object mo12100L(float f, @C12579k C11045c<? super C11079d2> cVar) {
        Object q = mo12113q();
        Object k = mo12107k(mo12093E(), q, f);
        if (this.f19790b.invoke(k).booleanValue()) {
            Object i = mo12106i(k, f, cVar);
            if (i == C11063b.m42612h()) {
                return i;
            }
            return C11079d2.f28267a;
        }
        Object i2 = mo12106i(q, f, cVar);
        if (i2 == C11063b.m42612h()) {
            return i2;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: M */
    public final void mo12101M(T t) {
        float f;
        Float f2 = (Float) mo12109m().get(t);
        if (f2 != null) {
            float floatValue = f2.floatValue();
            Float v = mo12118v();
            if (v != null) {
                f = v.floatValue();
            } else {
                f = 0.0f;
            }
            mo12108l(floatValue - f);
            mo12096H(t);
            mo12095G((Object) null);
            return;
        }
        mo12096H(t);
    }

    @C12580l
    /* renamed from: N */
    public final Object mo12102N(T t, @C12579k C11045c<? super C11079d2> cVar) {
        Object P = m26482P(this, (MutatePriority) null, new SwipeableV2State$snapTo$2(this, t, (C11045c<? super SwipeableV2State$snapTo$2>) null), cVar, 1, (Object) null);
        return P == C11063b.m42612h() ? P : C11079d2.f28267a;
    }

    /* renamed from: O */
    public final Object mo12103O(MutatePriority mutatePriority, C11300l<? super C11045c<? super C11079d2>, ? extends Object> lVar, C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new SwipeableV2State$swipe$2(this, mutatePriority, lVar, (C11045c<? super SwipeableV2State$swipe$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    /* renamed from: Q */
    public final boolean mo12104Q(T t) {
        return this.f19793e.mo11618h(new SwipeableV2State$trySnapTo$1(this, t));
    }

    /* renamed from: R */
    public final boolean mo12105R(@C12579k Map<T, Float> map) {
        boolean z;
        Intrinsics.checkNotNullParameter(map, "newAnchors");
        boolean isEmpty = mo12109m().isEmpty();
        mo12094F(map);
        if (isEmpty) {
            Object q = mo12113q();
            if (((Float) mo12109m().get(q)) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo12104Q(q);
            }
        } else {
            z = true;
        }
        if (!z || !isEmpty) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: androidx.compose.material3.SwipeableV2State} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ad A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo12106i(T r16, float r17, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r18) {
        /*
            r15 = this;
            r7 = r15
            r0 = r18
            boolean r1 = r0 instanceof androidx.compose.material3.SwipeableV2State$animateTo$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            androidx.compose.material3.SwipeableV2State$animateTo$1 r1 = (androidx.compose.material3.SwipeableV2State$animateTo$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001b
        L_0x0016:
            androidx.compose.material3.SwipeableV2State$animateTo$1 r1 = new androidx.compose.material3.SwipeableV2State$animateTo$1
            r1.<init>(r15, r0)
        L_0x001b:
            r0 = r1
            java.lang.Object r1 = r0.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r9 = 0
            r10 = 1056964608(0x3f000000, float:0.5)
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 != r11) goto L_0x0039
            java.lang.Object r0 = r0.L$0
            r2 = r0
            androidx.compose.material3.SwipeableV2State r2 = (androidx.compose.material3.SwipeableV2State) r2
            kotlin.C11661u0.m45747n(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0072
        L_0x0036:
            r0 = move-exception
            goto L_0x00c2
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            kotlin.C11661u0.m45747n(r1)
            java.util.Map r1 = r15.mo12109m()
            r3 = r16
            java.lang.Object r1 = r1.get(r3)
            r4 = r1
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L_0x0110
            r13 = 0
            androidx.compose.material3.SwipeableV2State$animateTo$2 r14 = new androidx.compose.material3.SwipeableV2State$animateTo$2     // Catch:{ all -> 0x00c0 }
            r6 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r17
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00c0 }
            r5 = 1
            r6 = 0
            r0.L$0 = r7     // Catch:{ all -> 0x00c0 }
            r0.label = r11     // Catch:{ all -> 0x00c0 }
            r1 = r15
            r2 = r13
            r3 = r14
            r4 = r0
            java.lang.Object r0 = m26482P(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00c0 }
            if (r0 != r8) goto L_0x0071
            return r8
        L_0x0071:
            r2 = r7
        L_0x0072:
            r2.mo12095G(r12)
            float r0 = r2.mo12093E()
            java.util.Map r1 = r2.mo12109m()
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0087:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ad
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r4 = r4 - r0
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x00a9
            r4 = r11
            goto L_0x00aa
        L_0x00a9:
            r4 = r9
        L_0x00aa:
            if (r4 == 0) goto L_0x0087
            goto L_0x00ae
        L_0x00ad:
            r3 = r12
        L_0x00ae:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L_0x00b6
            java.lang.Object r12 = r3.getKey()
        L_0x00b6:
            if (r12 != 0) goto L_0x00bc
            java.lang.Object r12 = r2.mo12113q()
        L_0x00bc:
            r2.mo12096H(r12)
            goto L_0x0113
        L_0x00c0:
            r0 = move-exception
            r2 = r7
        L_0x00c2:
            r2.mo12095G(r12)
            float r1 = r2.mo12093E()
            java.util.Map r3 = r2.mo12109m()
            java.util.Set r3 = r3.entrySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x00d7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00fd
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r5 = r5 - r1
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f9
            r5 = r11
            goto L_0x00fa
        L_0x00f9:
            r5 = r9
        L_0x00fa:
            if (r5 == 0) goto L_0x00d7
            goto L_0x00fe
        L_0x00fd:
            r4 = r12
        L_0x00fe:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L_0x0106
            java.lang.Object r12 = r4.getKey()
        L_0x0106:
            if (r12 != 0) goto L_0x010c
            java.lang.Object r12 = r2.mo12113q()
        L_0x010c:
            r2.mo12096H(r12)
            throw r0
        L_0x0110:
            r15.mo12096H(r16)
        L_0x0113:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableV2State.mo12106i(java.lang.Object, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: k */
    public final T mo12107k(float f, T t, float f2) {
        T a;
        Map m = mo12109m();
        Float f3 = (Float) m.get(t);
        C16479d D = mo12092D();
        float g5 = D.mo7425g5(this.f19792d);
        if (Intrinsics.areEqual(f3, f) || f3 == null) {
            return t;
        }
        if (f3.floatValue() < f) {
            if (f2 >= g5) {
                return SwipeableV2Kt.m26463d(m, f, true);
            }
            a = SwipeableV2Kt.m26463d(m, f, true);
            if (f < Math.abs(f3.floatValue() + Math.abs(this.f19791c.invoke(D, Float.valueOf(Math.abs(((Number) C10977s0.m41443K(m, a)).floatValue() - f3.floatValue()))).floatValue()))) {
                return t;
            }
        } else if (f2 <= (-g5)) {
            return SwipeableV2Kt.m26463d(m, f, false);
        } else {
            a = SwipeableV2Kt.m26463d(m, f, false);
            float abs = Math.abs(f3.floatValue() - Math.abs(this.f19791c.invoke(D, Float.valueOf(Math.abs(f3.floatValue() - ((Number) C10977s0.m41443K(m, a)).floatValue()))).floatValue()));
            if (f < 0.0f) {
                if (Math.abs(f) < abs) {
                    return t;
                }
            } else if (f > abs) {
                return t;
            }
        }
        return a;
    }

    /* renamed from: l */
    public final float mo12108l(float f) {
        float f2;
        Float v = mo12118v();
        float f3 = 0.0f;
        if (v != null) {
            f2 = v.floatValue();
        } else {
            f2 = 0.0f;
        }
        float H = C11479u.m44331H(f + f2, mo12117u(), mo12116t()) - f2;
        if (Math.abs(H) >= 0.0f) {
            Float v2 = mo12118v();
            if (v2 != null) {
                f3 = v2.floatValue();
            }
            mo12099K(Float.valueOf(C11479u.m44331H(f3 + H, mo12117u(), mo12116t())));
        }
        return H;
    }

    @C12579k
    /* renamed from: m */
    public final Map<T, Float> mo12109m() {
        return (Map) this.f19803o.getValue();
    }

    @C12579k
    /* renamed from: n */
    public final C1968g<Float> mo12110n() {
        return this.f19789a;
    }

    /* renamed from: o */
    public final T mo12111o() {
        return this.f19802n.getValue();
    }

    @C12579k
    /* renamed from: p */
    public final C11300l<T, Boolean> mo12112p() {
        return this.f19790b;
    }

    /* renamed from: q */
    public final T mo12113q() {
        return this.f19795g.getValue();
    }

    @C12580l
    /* renamed from: r */
    public final C16479d mo12114r() {
        return this.f19804p;
    }

    /* renamed from: s */
    public final float mo12115s() {
        return ((Number) this.f19799k.getValue()).floatValue();
    }

    /* renamed from: t */
    public final float mo12116t() {
        return ((Number) this.f19801m.getValue()).floatValue();
    }

    /* renamed from: u */
    public final float mo12117u() {
        return ((Number) this.f19800l.getValue()).floatValue();
    }

    @C12580l
    /* renamed from: v */
    public final Float mo12118v() {
        return (Float) this.f19797i.getValue();
    }

    @C12579k
    /* renamed from: w */
    public final C11304p<C16479d, Float, Float> mo12119w() {
        return this.f19791c;
    }

    /* renamed from: x */
    public final float mo12120x() {
        return ((Number) this.f19798j.getValue()).floatValue();
    }

    @C12579k
    /* renamed from: y */
    public final C2193f mo12121y() {
        return this.f19794f;
    }

    /* renamed from: z */
    public final T mo12122z() {
        return this.f19796h.getValue();
    }

    public SwipeableV2State(T t, C1968g<Float> gVar, C11300l<? super T, Boolean> lVar, C11304p<? super C16479d, ? super Float, Float> pVar, float f) {
        Intrinsics.checkNotNullParameter(gVar, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "confirmValueChange");
        Intrinsics.checkNotNullParameter(pVar, "positionalThreshold");
        this.f19789a = gVar;
        this.f19790b = lVar;
        this.f19791c = pVar;
        this.f19792d = f;
        this.f19793e = new InternalMutatorMutex();
        this.f19794f = new SwipeableV2State$swipeDraggableState$1(this);
        this.f19795g = C8539f2.m30981g(t, (C8410b2) null, 2, (Object) null);
        this.f19796h = C8415c2.m30235d(new SwipeableV2State$targetValue$2(this));
        this.f19797i = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f19798j = C8415c2.m30235d(new SwipeableV2State$progress$2(this));
        this.f19799k = C8539f2.m30981g(Float.valueOf(0.0f), (C8410b2) null, 2, (Object) null);
        this.f19800l = C8415c2.m30235d(new SwipeableV2State$minOffset$2(this));
        this.f19801m = C8415c2.m30235d(new SwipeableV2State$maxOffset$2(this));
        this.f19802n = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f19803o = C8539f2.m30981g(C10977s0.m41492z(), (C8410b2) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwipeableV2State(Object obj, C1968g gVar, C11300l lVar, C11304p<C16479d, Float, Float> pVar, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? C8374y2.f22489a.mo14799b() : gVar, (i & 4) != 0 ? C81251.f19805f : lVar, (i & 8) != 0 ? C8374y2.f22489a.mo14800d() : pVar, (i & 16) != 0 ? C8374y2.f22489a.mo14801f() : f, (DefaultConstructorMarker) null);
    }
}
