package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,261:1\n25#2:262\n1114#3,6:263\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n*L\n119#1:262\n119#1:263,6\n*E\n"})
public final class TransformableStateKt {
    @C12579k
    /* renamed from: a */
    public static final C2211q m9476a(@C12579k C11305q<? super Float, ? super C15094f, ? super Float, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "onTransformation");
        return new DefaultTransformableState(qVar);
    }

    @C12580l
    /* renamed from: b */
    public static final Object m9477b(@C12579k C2211q qVar, long j, @C12579k C1968g<C15094f> gVar, @C12579k C11045c<? super C11079d2> cVar) {
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = C15094f.f37256b.mo42248e();
        Object a = C2211q.m9580a(qVar, (MutatePriority) null, new TransformableStateKt$animatePanBy$2(longRef, j, gVar, (C11045c<? super TransformableStateKt$animatePanBy$2>) null), cVar, 1, (Object) null);
        if (a == C11063b.m42612h()) {
            return a;
        }
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: androidx.compose.animation.core.v0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: androidx.compose.animation.core.v0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.compose.animation.core.v0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m9478c(androidx.compose.foundation.gestures.C2211q r6, long r7, androidx.compose.animation.core.C1968g r9, kotlin.coroutines.C11045c r10, int r11, java.lang.Object r12) {
        /*
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0010
            androidx.compose.animation.core.v0 r9 = new androidx.compose.animation.core.v0
            r1 = 0
            r2 = 1128792064(0x43480000, float:200.0)
            r3 = 0
            r4 = 5
            r5 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0010:
            java.lang.Object r6 = m9477b(r6, r7, r9, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableStateKt.m9478c(androidx.compose.foundation.gestures.q, long, androidx.compose.animation.core.g, kotlin.coroutines.c, int, java.lang.Object):java.lang.Object");
    }

    @C12580l
    /* renamed from: d */
    public static final Object m9479d(@C12579k C2211q qVar, float f, @C12579k C1968g<Float> gVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = C2211q.m9580a(qVar, (MutatePriority) null, new TransformableStateKt$animateRotateBy$2(new Ref.FloatRef(), f, gVar, (C11045c<? super TransformableStateKt$animateRotateBy$2>) null), cVar, 1, (Object) null);
        if (a == C11063b.m42612h()) {
            return a;
        }
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: androidx.compose.animation.core.v0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.animation.core.v0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.compose.animation.core.v0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m9480e(androidx.compose.foundation.gestures.C2211q r6, float r7, androidx.compose.animation.core.C1968g r8, kotlin.coroutines.C11045c r9, int r10, java.lang.Object r11) {
        /*
            r10 = r10 & 2
            if (r10 == 0) goto L_0x0010
            androidx.compose.animation.core.v0 r8 = new androidx.compose.animation.core.v0
            r1 = 0
            r2 = 1128792064(0x43480000, float:200.0)
            r3 = 0
            r4 = 5
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0010:
            java.lang.Object r6 = m9479d(r6, r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableStateKt.m9480e(androidx.compose.foundation.gestures.q, float, androidx.compose.animation.core.g, kotlin.coroutines.c, int, java.lang.Object):java.lang.Object");
    }

    @C12580l
    /* renamed from: f */
    public static final Object m9481f(@C12579k C2211q qVar, float f, @C12579k C1968g<Float> gVar, @C12579k C11045c<? super C11079d2> cVar) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.element = 1.0f;
            Object a = C2211q.m9580a(qVar, (MutatePriority) null, new TransformableStateKt$animateZoomBy$3(floatRef, f, gVar, (C11045c<? super TransformableStateKt$animateZoomBy$3>) null), cVar, 1, (Object) null);
            if (a == C11063b.m42612h()) {
                return a;
            }
            return C11079d2.f28267a;
        }
        throw new IllegalArgumentException("zoom value should be greater than 0".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: androidx.compose.animation.core.v0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.animation.core.v0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.compose.animation.core.v0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m9482g(androidx.compose.foundation.gestures.C2211q r6, float r7, androidx.compose.animation.core.C1968g r8, kotlin.coroutines.C11045c r9, int r10, java.lang.Object r11) {
        /*
            r10 = r10 & 2
            if (r10 == 0) goto L_0x0010
            androidx.compose.animation.core.v0 r8 = new androidx.compose.animation.core.v0
            r1 = 0
            r2 = 1128792064(0x43480000, float:200.0)
            r3 = 0
            r4 = 5
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0010:
            java.lang.Object r6 = m9481f(r6, r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableStateKt.m9482g(androidx.compose.foundation.gestures.q, float, androidx.compose.animation.core.g, kotlin.coroutines.c, int, java.lang.Object):java.lang.Object");
    }

    @C12580l
    /* renamed from: h */
    public static final Object m9483h(@C12579k C2211q qVar, long j, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = C2211q.m9580a(qVar, (MutatePriority) null, new TransformableStateKt$panBy$2(j, (C11045c<? super TransformableStateKt$panBy$2>) null), cVar, 1, (Object) null);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C8540g
    @C12579k
    /* renamed from: i */
    public static final C2211q m9484i(@C12579k C11305q<? super Float, ? super C15094f, ? super Float, C11079d2> qVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(qVar, "onTransformation");
        oVar.mo14918M(1681419281);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1681419281, i, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:114)");
        }
        C8578k2<T> t = C8415c2.m30251t(qVar, oVar, i & 14);
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = m9476a(new TransformableStateKt$rememberTransformableState$1$1(t));
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2211q qVar2 = (C2211q) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return qVar2;
    }

    @C12580l
    /* renamed from: j */
    public static final Object m9485j(@C12579k C2211q qVar, float f, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = C2211q.m9580a(qVar, (MutatePriority) null, new TransformableStateKt$rotateBy$2(f, (C11045c<? super TransformableStateKt$rotateBy$2>) null), cVar, 1, (Object) null);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: k */
    public static final Object m9486k(@C12579k C2211q qVar, @C12579k MutatePriority mutatePriority, @C12579k C11045c<? super C11079d2> cVar) {
        Object c = qVar.mo7364c(mutatePriority, new TransformableStateKt$stopTransformation$2((C11045c<? super TransformableStateKt$stopTransformation$2>) null), cVar);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    /* renamed from: l */
    public static /* synthetic */ Object m9487l(C2211q qVar, MutatePriority mutatePriority, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return m9486k(qVar, mutatePriority, cVar);
    }

    @C12580l
    /* renamed from: m */
    public static final Object m9488m(@C12579k C2211q qVar, float f, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = C2211q.m9580a(qVar, (MutatePriority) null, new TransformableStateKt$zoomBy$2(f, (C11045c<? super TransformableStateKt$zoomBy$2>) null), cVar, 1, (Object) null);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }
}
