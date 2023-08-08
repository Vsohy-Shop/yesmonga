package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.C2046v;
import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1964f;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C2013v;
import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,546:1\n543#1,4:558\n543#1,4:562\n76#2:547\n67#3,3:548\n66#3:551\n1114#4,6:552\n154#5:566\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n356#1:558,4\n423#1:562,4\n272#1:547\n274#1:548,3\n274#1:551\n274#1:552,6\n537#1:566\n*E\n"})
public final class SnapFlingBehaviorKt {

    /* renamed from: a */
    public static final float f5958a = C16483g.m74435M((float) 400);

    /* renamed from: b */
    public static final float f5959b = 0.0f;

    /* renamed from: c */
    public static final float f5960c = 0.0f;

    /* renamed from: d */
    public static final boolean f5961d = false;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9617f(androidx.compose.foundation.gestures.C2201l r5, float r6, androidx.compose.animation.core.C1976i<java.lang.Float, androidx.compose.animation.core.C1983k> r7, androidx.compose.animation.core.C2013v<java.lang.Float> r8, kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r9, kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.snapping.C2214a<java.lang.Float, androidx.compose.animation.core.C1983k>> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.Ref$FloatRef r5 = (kotlin.jvm.internal.Ref.FloatRef) r5
            java.lang.Object r7 = r0.L$0
            androidx.compose.animation.core.i r7 = (androidx.compose.animation.core.C1976i) r7
            kotlin.C11661u0.m45747n(r10)
            goto L_0x006b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            java.lang.Object r2 = r7.mo6848i()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0054
            r2 = r3
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r4.<init>(r6, r10, r5, r9)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.m8083j(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r5 = r10
        L_0x006b:
            androidx.compose.foundation.gestures.snapping.a r8 = new androidx.compose.foundation.gestures.snapping.a
            float r5 = r5.element
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m9617f(androidx.compose.foundation.gestures.l, float, androidx.compose.animation.core.i, androidx.compose.animation.core.v, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: g */
    public static final void m9618g(C1964f<Float, C1983k> fVar, C2201l lVar, C11300l<? super Float, C11079d2> lVar2, float f) {
        float a = lVar.mo7360a(f);
        lVar2.invoke(Float.valueOf(a));
        if (Math.abs(f - a) > 0.5f) {
            fVar.mo6822a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9619h(androidx.compose.foundation.gestures.C2201l r12, float r13, float r14, androidx.compose.animation.core.C1976i<java.lang.Float, androidx.compose.animation.core.C1983k> r15, androidx.compose.animation.core.C1968g<java.lang.Float> r16, kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r17, kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.snapping.C2214a<java.lang.Float, androidx.compose.animation.core.C1983k>> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1
            r1.<init>(r0)
        L_0x001a:
            r7 = r1
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r7.label
            r3 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            float r1 = r7.F$1
            float r2 = r7.F$0
            java.lang.Object r3 = r7.L$1
            kotlin.jvm.internal.Ref$FloatRef r3 = (kotlin.jvm.internal.Ref.FloatRef) r3
            java.lang.Object r4 = r7.L$0
            androidx.compose.animation.core.i r4 = (androidx.compose.animation.core.C1976i) r4
            kotlin.C11661u0.m45747n(r0)
            r10 = r2
            r0 = r4
            goto L_0x008f
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            kotlin.C11661u0.m45747n(r0)
            kotlin.jvm.internal.Ref$FloatRef r0 = new kotlin.jvm.internal.Ref$FloatRef
            r0.<init>()
            java.lang.Object r2 = r15.mo6848i()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r13)
            java.lang.Object r2 = r15.mo6848i()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0069
            r2 = r3
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            r5 = r2 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2 r6 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2
            r2 = r12
            r9 = r14
            r10 = r17
            r6.<init>(r14, r0, r12, r10)
            r9 = r15
            r7.L$0 = r9
            r7.L$1 = r0
            r10 = r13
            r7.F$0 = r10
            r7.F$1 = r8
            r7.label = r3
            r2 = r15
            r3 = r4
            r4 = r16
            java.lang.Object r2 = androidx.compose.animation.core.SuspendAnimationKt.m8085l(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r3 = r0
            r1 = r8
            r0 = r9
        L_0x008f:
            java.lang.Object r2 = r0.mo6848i()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = m9621j(r2, r1)
            androidx.compose.foundation.gestures.snapping.a r11 = new androidx.compose.foundation.gestures.snapping.a
            float r1 = r3.element
            float r10 = r10 - r1
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r10)
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 29
            r9 = 0
            androidx.compose.animation.core.i r0 = androidx.compose.animation.core.C1980j.m8432g(r0, r1, r2, r3, r5, r7, r8, r9)
            r11.<init>(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m9619h(androidx.compose.foundation.gestures.l, float, float, androidx.compose.animation.core.i, androidx.compose.animation.core.g, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: androidx.compose.ui.unit.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.foundation.gestures.snapping.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9620i(androidx.compose.foundation.gestures.C2201l r7, float r8, float r9, androidx.compose.foundation.gestures.snapping.C2215b<java.lang.Float, androidx.compose.animation.core.C1983k> r10, androidx.compose.foundation.gestures.snapping.C2218e r11, androidx.compose.p004ui.unit.C16479d r12, kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r13, kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.snapping.C2214a<java.lang.Float, androidx.compose.animation.core.C1983k>> r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1
            r0.<init>(r14)
        L_0x0018:
            r6 = r0
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            java.lang.Object r7 = r6.L$1
            r12 = r7
            androidx.compose.ui.unit.d r12 = (androidx.compose.p004ui.unit.C16479d) r12
            java.lang.Object r7 = r6.L$0
            r11 = r7
            androidx.compose.foundation.gestures.snapping.e r11 = (androidx.compose.foundation.gestures.snapping.C2218e) r11
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0057
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            kotlin.C11661u0.m45747n(r14)
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r8)
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r9)
            r6.L$0 = r11
            r6.L$1 = r12
            r6.label = r2
            r1 = r10
            r2 = r7
            r5 = r13
            java.lang.Object r14 = r1.mo7572a(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L_0x0057
            return r0
        L_0x0057:
            androidx.compose.foundation.gestures.snapping.a r14 = (androidx.compose.foundation.gestures.snapping.C2214a) r14
            androidx.compose.animation.core.i r7 = r14.mo7569b()
            java.lang.Object r8 = r7.mo6848i()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = m9625n(r8, r11, r12)
            androidx.compose.foundation.gestures.snapping.a r9 = new androidx.compose.foundation.gestures.snapping.a
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r8)
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m9620i(androidx.compose.foundation.gestures.l, float, float, androidx.compose.foundation.gestures.snapping.b, androidx.compose.foundation.gestures.snapping.e, androidx.compose.ui.unit.d, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: j */
    public static final float m9621j(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? C11479u.m44310A(f, f2) : C11479u.m44444t(f, f2);
    }

    /* renamed from: k */
    public static final <T extends Comparable<? super T>> T m9622k(C11457f<T> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.getStart();
    }

    /* renamed from: l */
    public static final <T extends Comparable<? super T>> T m9623l(C11457f<T> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.mo23013q();
    }

    /* renamed from: m */
    public static final void m9624m(C11289a<String> aVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (java.lang.Math.abs(r5) <= java.lang.Math.abs(r6)) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float m9625n(float r4, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.snapping.C2218e r5, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.C16479d r6) {
        /*
            java.lang.String r0 = "snapLayoutInfoProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.ranges.f r5 = r5.mo7547b(r6)
            java.lang.Comparable r6 = m9622k(r5)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            java.lang.Comparable r5 = m9623l(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r4 = java.lang.Math.signum(r4)
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x002f
            r1 = r2
            goto L_0x0030
        L_0x002f:
            r1 = r3
        L_0x0030:
            if (r1 == 0) goto L_0x003f
            float r4 = java.lang.Math.abs(r5)
            float r1 = java.lang.Math.abs(r6)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 > 0) goto L_0x0058
            goto L_0x004a
        L_0x003f:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0047
            r1 = r2
            goto L_0x0048
        L_0x0047:
            r1 = r3
        L_0x0048:
            if (r1 == 0) goto L_0x004c
        L_0x004a:
            r6 = r5
            goto L_0x0058
        L_0x004c:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            if (r2 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r6 = r0
        L_0x0058:
            boolean r4 = m9626o(r6)
            if (r4 == 0) goto L_0x005f
            r0 = r6
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m9625n(float, androidx.compose.foundation.gestures.snapping.e, androidx.compose.ui.unit.d):float");
    }

    /* renamed from: o */
    public static final boolean m9626o(float f) {
        if (!(f == Float.POSITIVE_INFINITY)) {
            if (!(f == Float.NEGATIVE_INFINITY)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public static final float m9627p() {
        return f5958a;
    }

    @C8540g
    @C2855v
    @C12579k
    /* renamed from: q */
    public static final SnapFlingBehavior m9628q(@C12579k C2218e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "snapLayoutInfoProvider");
        oVar.mo14918M(-473984552);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-473984552, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:268)");
        }
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        C2013v b = C2046v.m8765b(oVar, 0);
        oVar.mo14918M(1618982084);
        boolean n0 = oVar.mo15006n0(eVar) | oVar.mo15006n0(b) | oVar.mo15006n0(dVar);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            SnapFlingBehavior snapFlingBehavior = new SnapFlingBehavior(eVar, C1972h.m8392q(0, 0, C1947b0.m8291c(), 3, (Object) null), b, C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null), dVar, 0.0f, 32, (DefaultConstructorMarker) null);
            oVar.mo14893C(snapFlingBehavior);
            N = snapFlingBehavior;
        }
        oVar.mo15002m0();
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return snapFlingBehavior2;
    }
}
