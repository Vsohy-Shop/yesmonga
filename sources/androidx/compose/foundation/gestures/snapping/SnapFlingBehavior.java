package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1980j;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C2013v;
import androidx.compose.animation.core.C2017x;
import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.p004ui.C8773n;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
@C8567o(parameters = 0)
@C11363r0({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n1#1,546:1\n1#2:547\n543#3,4:548\n543#3,4:552\n543#3,4:556\n543#3,4:560\n543#3,4:564\n543#3,4:568\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n*L\n120#1:548,4\n148#1:552,4\n168#1:556,4\n185#1:560,4\n208#1:564,4\n211#1:568,4\n*E\n"})
public final class SnapFlingBehavior implements C2195g {

    /* renamed from: i */
    public static final int f5948i = 0;
    @C12579k

    /* renamed from: a */
    public final C2218e f5949a;
    @C12579k

    /* renamed from: b */
    public final C1968g<Float> f5950b;
    @C12579k

    /* renamed from: c */
    public final C2013v<Float> f5951c;
    @C12579k

    /* renamed from: d */
    public final C1968g<Float> f5952d;
    @C12579k

    /* renamed from: e */
    public final C16479d f5953e;

    /* renamed from: f */
    public final float f5954f;

    /* renamed from: g */
    public final float f5955g;
    @C12579k

    /* renamed from: h */
    public C8773n f5956h;

    public /* synthetic */ SnapFlingBehavior(C2218e eVar, C1968g gVar, C2013v vVar, C1968g gVar2, C16479d dVar, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, gVar, vVar, gVar2, dVar, f);
    }

    @C12580l
    /* renamed from: a */
    public Object mo7354a(@C12579k C2201l lVar, float f, @C12579k C11045c<? super Float> cVar) {
        return mo7557k(lVar, f, SnapFlingBehavior$performFling$2.f5957f, cVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (!Intrinsics.areEqual((Object) snapFlingBehavior.f5952d, (Object) this.f5952d) || !Intrinsics.areEqual((Object) snapFlingBehavior.f5951c, (Object) this.f5951c) || !Intrinsics.areEqual((Object) snapFlingBehavior.f5950b, (Object) this.f5950b) || !Intrinsics.areEqual((Object) snapFlingBehavior.f5949a, (Object) this.f5949a) || !Intrinsics.areEqual((Object) snapFlingBehavior.f5953e, (Object) this.f5953e) || !C16483g.m74440e0(snapFlingBehavior.f5954f, this.f5954f)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: kotlin.jvm.functions.l<? super java.lang.Float, kotlin.d2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7552g(androidx.compose.foundation.gestures.C2201l r11, float r12, kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r13, kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.snapping.C2214a<java.lang.Float, androidx.compose.animation.core.C1983k>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r11 = r0.L$0
            r13 = r11
            kotlin.jvm.functions.l r13 = (kotlin.jvm.functions.C11300l) r13
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0051
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            kotlin.C11661u0.m45747n(r14)
            androidx.compose.ui.n r14 = r10.f5956h
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r9 = 0
            r4 = r2
            r5 = r12
            r6 = r10
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = kotlinx.coroutines.C11965h.m47673h(r14, r2, r0)
            if (r14 != r1) goto L_0x0051
            return r1
        L_0x0051:
            androidx.compose.foundation.gestures.snapping.a r14 = (androidx.compose.foundation.gestures.snapping.C2214a) r14
            r11 = 0
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.mo7552g(androidx.compose.foundation.gestures.l, float, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: h */
    public final C8773n mo7553h() {
        return this.f5956h;
    }

    public int hashCode() {
        return ((((((((((0 + this.f5952d.hashCode()) * 31) + this.f5951c.hashCode()) * 31) + this.f5950b.hashCode()) * 31) + this.f5949a.hashCode()) * 31) + this.f5953e.hashCode()) * 31) + C16483g.m74442h0(this.f5954f);
    }

    /* renamed from: i */
    public final boolean mo7555i(float f, float f2) {
        if (Math.abs(C2017x.m8654a(this.f5951c, 0.0f, f2)) >= Math.abs(f) + this.f5949a.mo7546a(this.f5953e)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d7 A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v6 java.lang.Object), (r0v1 java.lang.Object) binds: [B:19:0x00d4, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7556j(androidx.compose.foundation.gestures.C2201l r26, float r27, kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r28, kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.snapping.C2214a<java.lang.Float, androidx.compose.animation.core.C1983k>> r29) {
        /*
            r25 = this;
            r6 = r25
            r7 = r28
            r0 = r29
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$1
            if (r1 == 0) goto L_0x0019
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0019
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001e
        L_0x0019:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$1
            r1.<init>(r6, r0)
        L_0x001e:
            r13 = r1
            java.lang.Object r0 = r13.result
            java.lang.Object r14 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r13.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0051
            if (r1 == r2) goto L_0x003c
            if (r1 != r8) goto L_0x0034
            kotlin.C11661u0.m45747n(r0)
            goto L_0x00d7
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            java.lang.Object r1 = r13.L$3
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r2 = r13.L$2
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            java.lang.Object r3 = r13.L$1
            androidx.compose.foundation.gestures.l r3 = (androidx.compose.foundation.gestures.C2201l) r3
            java.lang.Object r4 = r13.L$0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r4 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior) r4
            kotlin.C11661u0.m45747n(r0)
            r7 = r3
            goto L_0x0099
        L_0x0051:
            kotlin.C11661u0.m45747n(r0)
            androidx.compose.foundation.gestures.snapping.e r0 = r6.f5949a
            androidx.compose.ui.unit.d r1 = r6.f5953e
            r3 = r27
            float r0 = r0.mo7548c(r1, r3)
            float r0 = java.lang.Math.abs(r0)
            float r1 = java.lang.Math.signum(r27)
            float r4 = r0 * r1
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            r9.element = r4
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r4)
            r7.invoke(r0)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$3 r5 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$3
            r5.<init>(r9, r7)
            r13.L$0 = r6
            r10 = r26
            r13.L$1 = r10
            r13.L$2 = r7
            r13.L$3 = r9
            r13.label = r2
            r0 = r25
            r1 = r26
            r2 = r4
            r4 = r5
            r5 = r13
            java.lang.Object r0 = r0.mo7558l(r1, r2, r3, r4, r5)
            if (r0 != r14) goto L_0x0095
            return r14
        L_0x0095:
            r4 = r6
            r2 = r7
            r1 = r9
            r7 = r10
        L_0x0099:
            androidx.compose.foundation.gestures.snapping.a r0 = (androidx.compose.foundation.gestures.snapping.C2214a) r0
            java.lang.Object r3 = r0.mo7568a()
            java.lang.Number r3 = (java.lang.Number) r3
            float r9 = r3.floatValue()
            androidx.compose.animation.core.i r15 = r0.mo7569b()
            r1.element = r9
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 30
            r24 = 0
            androidx.compose.animation.core.i r10 = androidx.compose.animation.core.C1980j.m8432g(r15, r16, r17, r18, r20, r22, r23, r24)
            androidx.compose.animation.core.g<java.lang.Float> r11 = r4.f5952d
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$5 r12 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$5
            r12.<init>(r1, r2)
            r0 = 0
            r13.L$0 = r0
            r13.L$1 = r0
            r13.L$2 = r0
            r13.L$3 = r0
            r13.label = r8
            r8 = r9
            java.lang.Object r0 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m9619h(r7, r8, r9, r10, r11, r12, r13)
            if (r0 != r14) goto L_0x00d7
            return r14
        L_0x00d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.mo7556j(androidx.compose.foundation.gestures.l, float, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7557k(@org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2201l r5, float r6, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Float> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r8)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r8)
            r0.label = r3
            java.lang.Object r8 = r4.mo7552g(r5, r6, r7, r0)
            if (r8 != r1) goto L_0x003d
            return r1
        L_0x003d:
            androidx.compose.foundation.gestures.snapping.a r8 = (androidx.compose.foundation.gestures.snapping.C2214a) r8
            java.lang.Object r5 = r8.mo7568a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.i r6 = r8.mo7569b()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            if (r3 == 0) goto L_0x0057
            goto L_0x0061
        L_0x0057:
            java.lang.Object r5 = r6.mo6848i()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L_0x0061:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.mo7557k(androidx.compose.foundation.gestures.l, float, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: l */
    public final Object mo7558l(C2201l lVar, float f, float f2, C11300l<? super Float, C11079d2> lVar2, C11045c<? super C2214a<Float, C1983k>> cVar) {
        C2215b bVar;
        if (mo7555i(f, f2)) {
            bVar = new C2216c(this.f5951c);
        } else {
            bVar = new C2217d(this.f5950b, this.f5949a, this.f5953e);
        }
        return SnapFlingBehaviorKt.m9620i(lVar, f, f2, bVar, this.f5949a, this.f5953e, lVar2, cVar);
    }

    /* renamed from: m */
    public final void mo7559m(@C12579k C8773n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.f5956h = nVar;
    }

    /* renamed from: n */
    public final Object mo7560n(C2201l lVar, float f, C11300l<? super Float, C11079d2> lVar2, C11045c<? super C2214a<Float, C1983k>> cVar) {
        float n = SnapFlingBehaviorKt.m9625n(0.0f, this.f5949a, this.f5953e);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = n;
        return SnapFlingBehaviorKt.m9619h(lVar, n, n, C1980j.m8428c(0.0f, f, 0, 0, false, 28, (Object) null), this.f5952d, new SnapFlingBehavior$shortSnap$3(floatRef, lVar2), cVar);
    }

    public SnapFlingBehavior(C2218e eVar, C1968g<Float> gVar, C2013v<Float> vVar, C1968g<Float> gVar2, C16479d dVar, float f) {
        this.f5949a = eVar;
        this.f5950b = gVar;
        this.f5951c = vVar;
        this.f5952d = gVar2;
        this.f5953e = dVar;
        this.f5954f = f;
        this.f5955g = dVar.mo7425g5(f);
        this.f5956h = ScrollableKt.m9381f();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnapFlingBehavior(C2218e eVar, C1968g gVar, C2013v vVar, C1968g gVar2, C16479d dVar, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, gVar, vVar, gVar2, dVar, (i & 32) != 0 ? SnapFlingBehaviorKt.m9627p() : f, (DefaultConstructorMarker) null);
    }
}
