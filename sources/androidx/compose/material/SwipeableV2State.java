package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.gestures.C2193f;
import androidx.compose.foundation.gestures.DraggableKt;
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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C3044g0
@C11363r0({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2State\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n76#2:656\n102#2,2:657\n76#2:659\n76#2:660\n102#2,2:661\n76#2:663\n76#2:664\n102#2,2:665\n76#2:667\n76#2:668\n76#2:669\n102#2,2:670\n76#2:672\n102#2,2:673\n288#3,2:675\n1#4:677\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2State\n*L\n169#1:656\n169#1:657,2\n177#1:659\n200#1:660\n200#1:661,2\n223#1:663\n240#1:664\n240#1:665,2\n247#1:667\n253#1:668\n255#1:669\n255#1:670,2\n260#1:672\n260#1:673,2\n354#1:675,2\n*E\n"})
public final class SwipeableV2State<T> {
    @C12579k

    /* renamed from: p */
    public static final Companion f7904p = new Companion((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final C1968g<Float> f7905a;
    @C12579k

    /* renamed from: b */
    public final C11300l<T, Boolean> f7906b;
    @C12579k

    /* renamed from: c */
    public final C11304p<C16479d, Float, Float> f7907c;

    /* renamed from: d */
    public final float f7908d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f7909e;
    @C12579k

    /* renamed from: f */
    public final C8578k2 f7910f;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f7911g;
    @C12579k

    /* renamed from: h */
    public final C8578k2 f7912h;
    @C12579k

    /* renamed from: i */
    public final C8700z0 f7913i;
    @C12579k

    /* renamed from: j */
    public final C8578k2 f7914j;
    @C12579k

    /* renamed from: k */
    public final C8578k2 f7915k;
    @C12579k

    /* renamed from: l */
    public final C8700z0 f7916l;
    @C12579k

    /* renamed from: m */
    public final C2193f f7917m;
    @C12579k

    /* renamed from: n */
    public final C8700z0 f7918n;
    @C12580l

    /* renamed from: o */
    public C16479d f7919o;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C3044g0
        @C12579k
        /* renamed from: a */
        public final <T> C8628e<SwipeableV2State<T>, T> mo10576a(@C12579k C1968g<Float> gVar, @C12579k C11300l<? super T, Boolean> lVar, @C12579k C11304p<? super C16479d, ? super Float, Float> pVar, float f) {
            Intrinsics.checkNotNullParameter(gVar, "animationSpec");
            Intrinsics.checkNotNullParameter(lVar, "confirmValueChange");
            Intrinsics.checkNotNullParameter(pVar, "positionalThreshold");
            return SaverKt.m31375a(SwipeableV2State$Companion$Saver$1.f7921f, new SwipeableV2State$Companion$Saver$2(gVar, lVar, pVar, f));
        }

        public Companion() {
        }
    }

    public /* synthetic */ SwipeableV2State(Object obj, C1968g gVar, C11300l lVar, C11304p pVar, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, gVar, lVar, pVar, f);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m14015g(SwipeableV2State swipeableV2State, Object obj, float f, C11045c cVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = swipeableV2State.mo10565q();
        }
        return swipeableV2State.mo10555f(obj, f, cVar);
    }

    /* renamed from: A */
    public final C16479d mo10544A() {
        C16479d dVar = this.f7919o;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=" + this + " SwipeableState?").toString());
    }

    /* renamed from: B */
    public final float mo10545B() {
        Float t = mo10568t();
        if (t != null) {
            return t.floatValue();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    /* renamed from: C */
    public final void mo10546C(@C12579k Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f7918n.setValue(map);
    }

    /* renamed from: D */
    public final void mo10547D(T t) {
        this.f7916l.setValue(t);
    }

    /* renamed from: E */
    public final void mo10548E(T t) {
        this.f7909e.setValue(t);
    }

    /* renamed from: F */
    public final void mo10549F(@C12580l C16479d dVar) {
        this.f7919o = dVar;
    }

    /* renamed from: G */
    public final void mo10550G(float f) {
        this.f7913i.setValue(Float.valueOf(f));
    }

    /* renamed from: H */
    public final void mo10551H(Float f) {
        this.f7911g.setValue(f);
    }

    @C12580l
    /* renamed from: I */
    public final Object mo10552I(float f, @C12579k C11045c<? super C11079d2> cVar) {
        Object n = mo10562n();
        Object h = mo10556h(mo10545B(), n, f);
        if (this.f7906b.invoke(h).booleanValue()) {
            Object f2 = mo10555f(h, f, cVar);
            if (f2 == C11063b.m42612h()) {
                return f2;
            }
            return C11079d2.f28267a;
        }
        Object f3 = mo10555f(n, f, cVar);
        if (f3 == C11063b.m42612h()) {
            return f3;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo10553J(T r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material.SwipeableV2State$snapTo$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.material.SwipeableV2State$snapTo$1 r0 = (androidx.compose.material.SwipeableV2State$snapTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableV2State$snapTo$1 r0 = new androidx.compose.material.SwipeableV2State$snapTo$1
            r0.<init>(r8, r10)
        L_0x0018:
            r4 = r0
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L_0x003b
            if (r1 != r2) goto L_0x0033
            java.lang.Object r9 = r4.L$1
            java.lang.Object r0 = r4.L$0
            androidx.compose.material.SwipeableV2State r0 = (androidx.compose.material.SwipeableV2State) r0
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x0065
        L_0x0031:
            r9 = move-exception
            goto L_0x006e
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003b:
            kotlin.C11661u0.m45747n(r10)
            java.util.Map r10 = r8.mo10558j()
            java.lang.Object r10 = r10.get(r9)
            java.lang.Float r10 = (java.lang.Float) r10
            if (r10 == 0) goto L_0x0072
            androidx.compose.foundation.gestures.f r1 = r8.f7917m     // Catch:{ all -> 0x006c }
            r3 = 0
            androidx.compose.material.SwipeableV2State$snapTo$2 r5 = new androidx.compose.material.SwipeableV2State$snapTo$2     // Catch:{ all -> 0x006c }
            r5.<init>(r8, r9, r10, r7)     // Catch:{ all -> 0x006c }
            r10 = 1
            r6 = 0
            r4.L$0 = r8     // Catch:{ all -> 0x006c }
            r4.L$1 = r9     // Catch:{ all -> 0x006c }
            r4.label = r2     // Catch:{ all -> 0x006c }
            r2 = r3
            r3 = r5
            r5 = r10
            java.lang.Object r10 = androidx.compose.foundation.gestures.C2193f.m9521c(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x006c }
            if (r10 != r0) goto L_0x0064
            return r0
        L_0x0064:
            r0 = r8
        L_0x0065:
            r0.mo10548E(r9)     // Catch:{ all -> 0x0031 }
            r0.mo10547D(r7)
            goto L_0x0075
        L_0x006c:
            r9 = move-exception
            r0 = r8
        L_0x006e:
            r0.mo10547D(r7)
            throw r9
        L_0x0072:
            r8.mo10548E(r9)
        L_0x0075:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableV2State.mo10553J(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: K */
    public final boolean mo10554K(@C12579k Map<T, Float> map) {
        boolean z;
        Intrinsics.checkNotNullParameter(map, "newAnchors");
        boolean isEmpty = mo10558j().isEmpty();
        mo10546C(map);
        if (isEmpty) {
            Float f = (Float) mo10558j().get(mo10562n());
            if (f != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo10551H(f);
            }
        } else {
            z = true;
        }
        if (!z || !isEmpty) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo10555f(T r18, float r19, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r20) {
        /*
            r17 = this;
            r7 = r17
            r0 = r20
            boolean r1 = r0 instanceof androidx.compose.material.SwipeableV2State$animateTo$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            androidx.compose.material.SwipeableV2State$animateTo$1 r1 = (androidx.compose.material.SwipeableV2State$animateTo$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001c
        L_0x0017:
            androidx.compose.material.SwipeableV2State$animateTo$1 r1 = new androidx.compose.material.SwipeableV2State$animateTo$1
            r1.<init>(r7, r0)
        L_0x001c:
            r11 = r1
            java.lang.Object r0 = r11.result
            java.lang.Object r14 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r15 = 0
            r16 = 1056964608(0x3f000000, float:0.5)
            r13 = 1
            r12 = 0
            if (r1 == 0) goto L_0x0045
            if (r1 != r13) goto L_0x003d
            java.lang.Object r1 = r11.L$0
            androidx.compose.material.SwipeableV2State r1 = (androidx.compose.material.SwipeableV2State) r1
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0038 }
            r2 = r12
            r3 = r13
            goto L_0x0079
        L_0x0038:
            r0 = move-exception
            r2 = r12
            r3 = r13
            goto L_0x00cf
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            kotlin.C11661u0.m45747n(r0)
            java.util.Map r0 = r17.mo10558j()
            r3 = r18
            java.lang.Object r0 = r0.get(r3)
            r4 = r0
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L_0x011f
            androidx.compose.foundation.gestures.f r8 = r7.f7917m     // Catch:{ all -> 0x00cb }
            r9 = 0
            androidx.compose.material.SwipeableV2State$animateTo$2 r10 = new androidx.compose.material.SwipeableV2State$animateTo$2     // Catch:{ all -> 0x00cb }
            r6 = 0
            r1 = r10
            r2 = r17
            r3 = r18
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00cb }
            r0 = 1
            r1 = 0
            r11.L$0 = r7     // Catch:{ all -> 0x00cb }
            r11.label = r13     // Catch:{ all -> 0x00cb }
            r2 = r12
            r12 = r0
            r3 = r13
            r13 = r1
            java.lang.Object r0 = androidx.compose.foundation.gestures.C2193f.m9521c(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00c9 }
            if (r0 != r14) goto L_0x0078
            return r14
        L_0x0078:
            r1 = r7
        L_0x0079:
            r1.mo10547D(r2)
            float r0 = r1.mo10545B()
            java.util.Map r4 = r1.mo10558j()
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x008e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b4
            java.lang.Object r12 = r4.next()
            r5 = r12
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r5 = r5 - r0
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 >= 0) goto L_0x00b0
            r13 = r3
            goto L_0x00b1
        L_0x00b0:
            r13 = r15
        L_0x00b1:
            if (r13 == 0) goto L_0x008e
            goto L_0x00b5
        L_0x00b4:
            r12 = r2
        L_0x00b5:
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            if (r12 == 0) goto L_0x00be
            java.lang.Object r12 = r12.getKey()
            goto L_0x00bf
        L_0x00be:
            r12 = r2
        L_0x00bf:
            if (r12 != 0) goto L_0x00c5
            java.lang.Object r12 = r1.mo10562n()
        L_0x00c5:
            r1.mo10548E(r12)
            goto L_0x0122
        L_0x00c9:
            r0 = move-exception
            goto L_0x00ce
        L_0x00cb:
            r0 = move-exception
            r2 = r12
            r3 = r13
        L_0x00ce:
            r1 = r7
        L_0x00cf:
            r1.mo10547D(r2)
            float r4 = r1.mo10545B()
            java.util.Map r5 = r1.mo10558j()
            java.util.Set r5 = r5.entrySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x00e4:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x010a
            java.lang.Object r12 = r5.next()
            r6 = r12
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r6 = r6 - r4
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 >= 0) goto L_0x0106
            r13 = r3
            goto L_0x0107
        L_0x0106:
            r13 = r15
        L_0x0107:
            if (r13 == 0) goto L_0x00e4
            goto L_0x010b
        L_0x010a:
            r12 = r2
        L_0x010b:
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            if (r12 == 0) goto L_0x0114
            java.lang.Object r12 = r12.getKey()
            goto L_0x0115
        L_0x0114:
            r12 = r2
        L_0x0115:
            if (r12 != 0) goto L_0x011b
            java.lang.Object r12 = r1.mo10562n()
        L_0x011b:
            r1.mo10548E(r12)
            throw r0
        L_0x011f:
            r17.mo10548E(r18)
        L_0x0122:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableV2State.mo10555f(java.lang.Object, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h */
    public final T mo10556h(float f, T t, float f2) {
        T a;
        Map j = mo10558j();
        Float f3 = (Float) j.get(t);
        C16479d A = mo10544A();
        float g5 = A.mo7425g5(this.f7908d);
        if (Intrinsics.areEqual(f3, f) || f3 == null) {
            return t;
        }
        if (f3.floatValue() < f) {
            if (f2 >= g5) {
                return SwipeableV2Kt.m13990d(j, f, true);
            }
            a = SwipeableV2Kt.m13990d(j, f, true);
            if (f < Math.abs(f3.floatValue() + Math.abs(this.f7907c.invoke(A, Float.valueOf(Math.abs(((Number) C10977s0.m41443K(j, a)).floatValue() - f3.floatValue()))).floatValue()))) {
                return t;
            }
        } else if (f2 <= (-g5)) {
            return SwipeableV2Kt.m13990d(j, f, false);
        } else {
            a = SwipeableV2Kt.m13990d(j, f, false);
            float abs = Math.abs(f3.floatValue() - Math.abs(this.f7907c.invoke(A, Float.valueOf(Math.abs(f3.floatValue() - ((Number) C10977s0.m41443K(j, a)).floatValue()))).floatValue()));
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

    /* renamed from: i */
    public final float mo10557i(float f) {
        float f2;
        Float t = mo10568t();
        if (t != null) {
            f2 = t.floatValue();
        } else {
            f2 = 0.0f;
        }
        float H = C11479u.m44331H(f + f2, mo10567s(), mo10566r()) - f2;
        if (Math.abs(H) > 0.0f) {
            this.f7917m.mo7349b(H);
        }
        return H;
    }

    @C12579k
    /* renamed from: j */
    public final Map<T, Float> mo10558j() {
        return (Map) this.f7918n.getValue();
    }

    @C12579k
    /* renamed from: k */
    public final C1968g<Float> mo10559k() {
        return this.f7905a;
    }

    /* renamed from: l */
    public final T mo10560l() {
        return this.f7916l.getValue();
    }

    @C12579k
    /* renamed from: m */
    public final C11300l<T, Boolean> mo10561m() {
        return this.f7906b;
    }

    /* renamed from: n */
    public final T mo10562n() {
        return this.f7909e.getValue();
    }

    @C12580l
    /* renamed from: o */
    public final C16479d mo10563o() {
        return this.f7919o;
    }

    @C12579k
    /* renamed from: p */
    public final C2193f mo10564p() {
        return this.f7917m;
    }

    /* renamed from: q */
    public final float mo10565q() {
        return ((Number) this.f7913i.getValue()).floatValue();
    }

    /* renamed from: r */
    public final float mo10566r() {
        return ((Number) this.f7915k.getValue()).floatValue();
    }

    /* renamed from: s */
    public final float mo10567s() {
        return ((Number) this.f7914j.getValue()).floatValue();
    }

    @C12580l
    /* renamed from: t */
    public final Float mo10568t() {
        return (Float) this.f7911g.getValue();
    }

    @C12579k
    /* renamed from: u */
    public final C11304p<C16479d, Float, Float> mo10569u() {
        return this.f7907c;
    }

    /* renamed from: v */
    public final float mo10570v() {
        return ((Number) this.f7912h.getValue()).floatValue();
    }

    /* renamed from: w */
    public final T mo10571w() {
        return this.f7910f.getValue();
    }

    /* renamed from: x */
    public final float mo10572x() {
        return this.f7908d;
    }

    /* renamed from: y */
    public final boolean mo10573y(T t) {
        return mo10558j().containsKey(t);
    }

    /* renamed from: z */
    public final boolean mo10574z() {
        return mo10560l() != null;
    }

    public SwipeableV2State(T t, C1968g<Float> gVar, C11300l<? super T, Boolean> lVar, C11304p<? super C16479d, ? super Float, Float> pVar, float f) {
        this.f7905a = gVar;
        this.f7906b = lVar;
        this.f7907c = pVar;
        this.f7908d = f;
        this.f7909e = C8539f2.m30981g(t, (C8410b2) null, 2, (Object) null);
        this.f7910f = C8415c2.m30235d(new SwipeableV2State$targetValue$2(this));
        this.f7911g = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f7912h = C8415c2.m30235d(new SwipeableV2State$progress$2(this));
        this.f7913i = C8539f2.m30981g(Float.valueOf(0.0f), (C8410b2) null, 2, (Object) null);
        this.f7914j = C8415c2.m30235d(new SwipeableV2State$minOffset$2(this));
        this.f7915k = C8415c2.m30235d(new SwipeableV2State$maxOffset$2(this));
        this.f7916l = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f7917m = DraggableKt.m9297a(new SwipeableV2State$draggableState$1(this));
        this.f7918n = C8539f2.m30981g(C10977s0.m41492z(), (C8410b2) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwipeableV2State(Object obj, C1968g gVar, C11300l lVar, C11304p<C16479d, Float, Float> pVar, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? C7888o1.f18893a.mo10901b() : gVar, (i & 4) != 0 ? C30131.f7920f : lVar, (i & 8) != 0 ? C7888o1.f18893a.mo10902d() : pVar, (i & 16) != 0 ? C7888o1.f18893a.mo10903f() : f, (DefaultConstructorMarker) null);
    }
}
