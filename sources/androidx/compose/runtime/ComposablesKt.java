package androidx.compose.runtime;

import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.various.presentation.analytics.notification.C22799a;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.NotImplementedError;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n1114#2,6:485\n1114#2,6:491\n1114#2,6:497\n1114#2,6:503\n1114#2,6:509\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:485,6\n36#1:491,6\n49#1:497,6\n66#1:503,6\n85#1:509,6\n*E\n"})
public final class ComposablesKt {
    @C8540g
    /* renamed from: a */
    public static final /* synthetic */ <T, E extends C8428d<?>> void m29506a(C11289a<? extends T> aVar, C11300l<? super Updater<T>, C11079d2> lVar, C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "factory");
        Intrinsics.checkNotNullParameter(lVar, C22799a.f58362e);
        oVar.mo14918M(1886828752);
        C8428d<?> r = oVar.mo15017r();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(r instanceof C8428d)) {
            m29519n();
        }
        oVar.mo15026u();
        if (oVar.mo14997l()) {
            oVar.mo14947W(new ComposablesKt$ComposeNode$1(aVar));
        } else {
            oVar.mo14888A();
        }
        lVar.invoke(Updater.m30179a(Updater.m30180b(oVar)));
        oVar.mo14896D();
        oVar.mo15002m0();
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: b */
    public static final /* synthetic */ <T, E extends C8428d<?>> void m29507b(C11289a<? extends T> aVar, C11300l<? super Updater<T>, C11079d2> lVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "factory");
        Intrinsics.checkNotNullParameter(lVar, C22799a.f58362e);
        Intrinsics.checkNotNullParameter(pVar, "content");
        oVar.mo14918M(-548224868);
        C8428d<?> r = oVar.mo15017r();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(r instanceof C8428d)) {
            m29519n();
        }
        oVar.mo15026u();
        if (oVar.mo14997l()) {
            oVar.mo14947W(aVar);
        } else {
            oVar.mo14888A();
        }
        lVar.invoke(Updater.m30179a(Updater.m30180b(oVar)));
        pVar.invoke(oVar, Integer.valueOf((i >> 6) & 14));
        oVar.mo14896D();
        oVar.mo15002m0();
    }

    @C8540g
    @C8544h(scheme = "[0[0][0]]")
    /* renamed from: c */
    public static final /* synthetic */ <T, E extends C8428d<?>> void m29508c(C11289a<? extends T> aVar, C11300l<? super Updater<T>, C11079d2> lVar, C11305q<? super C8684u1<T>, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "factory");
        Intrinsics.checkNotNullParameter(lVar, C22799a.f58362e);
        Intrinsics.checkNotNullParameter(qVar, "skippableUpdate");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8428d<?> r = oVar.mo15017r();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(r instanceof C8428d)) {
            m29519n();
        }
        oVar.mo15026u();
        if (oVar.mo14997l()) {
            oVar.mo14947W(aVar);
        } else {
            oVar.mo14888A();
        }
        lVar.invoke(Updater.m30179a(Updater.m30180b(oVar)));
        qVar.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, Integer.valueOf((i >> 3) & 112));
        oVar.mo14918M(2058660585);
        pVar.invoke(oVar, Integer.valueOf((i >> 9) & 14));
        oVar.mo15002m0();
        oVar.mo14896D();
    }

    @C8540g
    /* renamed from: d */
    public static final /* synthetic */ <T, E extends C8428d<?>> void m29509d(C11289a<? extends T> aVar, C11300l<? super Updater<T>, C11079d2> lVar, C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "factory");
        Intrinsics.checkNotNullParameter(lVar, C22799a.f58362e);
        oVar.mo14918M(1405779621);
        C8428d<?> r = oVar.mo15017r();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(r instanceof C8428d)) {
            m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar.mo14947W(new ComposablesKt$ReusableComposeNode$1(aVar));
        } else {
            oVar.mo14888A();
        }
        lVar.invoke(Updater.m30179a(Updater.m30180b(oVar)));
        oVar.mo14896D();
        oVar.mo15002m0();
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: e */
    public static final /* synthetic */ <T, E extends C8428d<?>> void m29510e(C11289a<? extends T> aVar, C11300l<? super Updater<T>, C11079d2> lVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "factory");
        Intrinsics.checkNotNullParameter(lVar, C22799a.f58362e);
        Intrinsics.checkNotNullParameter(pVar, "content");
        oVar.mo14918M(-692256719);
        C8428d<?> r = oVar.mo15017r();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(r instanceof C8428d)) {
            m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar.mo14947W(aVar);
        } else {
            oVar.mo14888A();
        }
        lVar.invoke(Updater.m30179a(Updater.m30180b(oVar)));
        pVar.invoke(oVar, Integer.valueOf((i >> 6) & 14));
        oVar.mo14896D();
        oVar.mo15002m0();
    }

    @C8540g
    @C8544h(scheme = "[0[0][0]]")
    /* renamed from: f */
    public static final /* synthetic */ <T, E extends C8428d<?>> void m29511f(C11289a<? extends T> aVar, C11300l<? super Updater<T>, C11079d2> lVar, C11305q<? super C8684u1<T>, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "factory");
        Intrinsics.checkNotNullParameter(lVar, C22799a.f58362e);
        Intrinsics.checkNotNullParameter(qVar, "skippableUpdate");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8428d<?> r = oVar.mo15017r();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(r instanceof C8428d)) {
            m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar.mo14947W(aVar);
        } else {
            oVar.mo14888A();
        }
        lVar.invoke(Updater.m30179a(Updater.m30180b(oVar)));
        qVar.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, Integer.valueOf((i >> 3) & 112));
        oVar.mo14918M(2058660585);
        pVar.invoke(oVar, Integer.valueOf((i >> 9) & 14));
        oVar.mo15002m0();
        oVar.mo14896D();
    }

    @C8540g
    /* renamed from: g */
    public static final void m29512g(@C12580l Object obj, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(pVar, "content");
        oVar.mo14918M(444418301);
        oVar.mo14944V(ComposerKt.f22652v, obj);
        pVar.invoke(oVar, Integer.valueOf((i >> 3) & 14));
        oVar.mo14915L();
        oVar.mo15002m0();
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: h */
    public static final void m29513h(boolean z, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(pVar, "content");
        oVar.mo14944V(ComposerKt.f22652v, Boolean.valueOf(z));
        boolean b = oVar.mo14961b(z);
        if (z) {
            pVar.invoke(oVar, Integer.valueOf((i >> 3) & 14));
        } else {
            oVar.mo15001m(b);
        }
        oVar.mo14915L();
    }

    @C11314h(name = "getCurrentComposer")
    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: i */
    public static final C8592o m29514i(@C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-554250212, i, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:183)");
        }
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    @C8540g
    @C11314h(name = "getCurrentCompositeKeyHash")
    /* renamed from: j */
    public static final int m29515j(@C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int i0 = oVar.mo14986i0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return i0;
    }

    @C8540g
    @C11314h(name = "getCurrentCompositionLocalContext")
    @C12579k
    /* renamed from: k */
    public static final C8685v m29516k(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-43352356);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-43352356, i, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:207)");
        }
        C8685v vVar = new C8685v(oVar.mo14990j0().mo15049e());
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return vVar;
    }

    /* renamed from: l */
    public static /* synthetic */ void m29517l() {
    }

    @C11314h(name = "getCurrentRecomposeScope")
    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: m */
    public static final C8586m1 m29518m(@C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        C8586m1 K = oVar.mo14912K();
        if (K != null) {
            oVar.mo14981g0(K);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            return K;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    @C11532s0
    /* renamed from: n */
    public static final void m29519n() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: o */
    public static final <T> T m29520o(@C12579k Object[] objArr, @C12579k C11304p<? super C8592o, ? super Integer, ? extends T> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(objArr, "keys");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        oVar.mo14918M(-11941951);
        T invoke = pVar.invoke(oVar, Integer.valueOf((i >> 3) & 14));
        oVar.mo15002m0();
        return invoke;
    }

    @C8540g
    /* renamed from: p */
    public static final <T> T m29521p(@C12580l Object obj, @C12580l Object obj2, @C12580l Object obj3, @C12579k C11289a<? extends T> aVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "calculation");
        oVar.mo14918M(1618982084);
        boolean n0 = oVar.mo15006n0(obj) | oVar.mo15006n0(obj2) | oVar.mo15006n0(obj3);
        T N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = aVar.invoke();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        return N;
    }

    @C8540g
    /* renamed from: q */
    public static final <T> T m29522q(@C12580l Object obj, @C12580l Object obj2, @C12579k C11289a<? extends T> aVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "calculation");
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(obj) | oVar.mo15006n0(obj2);
        T N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = aVar.invoke();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        return N;
    }

    @C8540g
    /* renamed from: r */
    public static final <T> T m29523r(@C12580l Object obj, @C12579k C11289a<? extends T> aVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "calculation");
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(obj);
        T N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = aVar.invoke();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        return N;
    }

    @C8540g
    /* renamed from: s */
    public static final <T> T m29524s(@C12579k C11289a<? extends T> aVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "calculation");
        oVar.mo14918M(-492369756);
        T N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = aVar.invoke();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        return N;
    }

    @C8540g
    /* renamed from: t */
    public static final <T> T m29525t(@C12579k Object[] objArr, @C12579k C11289a<? extends T> aVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(objArr, "keys");
        Intrinsics.checkNotNullParameter(aVar, "calculation");
        oVar.mo14918M(-568225417);
        boolean z = false;
        for (Object n0 : objArr) {
            z |= oVar.mo15006n0(n0);
        }
        T N = oVar.mo14921N();
        if (z || N == C8592o.f23032a.mo16277a()) {
            N = aVar.invoke();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        return N;
    }

    @C8540g
    @C12579k
    /* renamed from: u */
    public static final C8602q m29526u(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1165786124);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        C8602q j0 = oVar.mo14990j0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return j0;
    }
}
