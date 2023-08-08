package androidx.compose.runtime;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Arrays;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11532s0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11702a0;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11804f2;
import kotlinx.coroutines.C11968h2;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n36#2:485\n50#2:492\n49#2:493\n67#2,3:500\n66#2:503\n83#2,3:510\n36#2:519\n50#2:526\n49#2:527\n67#2,3:534\n66#2:537\n83#2,3:544\n25#2:553\n1114#3,6:486\n1114#3,6:494\n1114#3,6:504\n1114#3,6:513\n1114#3,6:520\n1114#3,6:528\n1114#3,6:538\n1114#3,6:547\n1114#3,6:554\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n155#1:485\n195#1:492\n195#1:493\n236#1:500,3\n236#1:503\n276#1:510,3\n337#1:519\n360#1:526\n360#1:527\n384#1:534,3\n384#1:537\n407#1:544,3\n477#1:553\n155#1:486,6\n195#1:494,6\n236#1:504,6\n276#1:513,6\n337#1:520,6\n360#1:528,6\n384#1:538,6\n407#1:547,6\n477#1:554,6\n*E\n"})
public final class EffectsKt {
    @C12579k

    /* renamed from: a */
    public static final C8434e0 f22672a = new C8434e0();
    @C12579k

    /* renamed from: b */
    public static final String f22673b = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    @C12579k

    /* renamed from: c */
    public static final String f22674c = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @C8540g
    /* renamed from: a */
    public static final void m29889a(@C12580l Object obj, @C12580l Object obj2, @C12580l Object obj3, @C12579k C11300l<? super C8434e0, ? extends C8430d0> lVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lVar, "effect");
        oVar.mo14918M(-1239538271);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:229)");
        }
        oVar.mo14918M(1618982084);
        boolean n0 = oVar.mo15006n0(obj) | oVar.mo15006n0(obj2) | oVar.mo15006n0(obj3);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            oVar.mo14893C(new C8413c0(lVar));
        }
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    /* renamed from: b */
    public static final void m29890b(@C12580l Object obj, @C12580l Object obj2, @C12579k C11300l<? super C8434e0, ? extends C8430d0> lVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lVar, "effect");
        oVar.mo14918M(1429097729);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:189)");
        }
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(obj) | oVar.mo15006n0(obj2);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            oVar.mo14893C(new C8413c0(lVar));
        }
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    /* renamed from: c */
    public static final void m29891c(@C12580l Object obj, @C12579k C11300l<? super C8434e0, ? extends C8430d0> lVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lVar, "effect");
        oVar.mo14918M(-1371986847);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:150)");
        }
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(obj);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            oVar.mo14893C(new C8413c0(lVar));
        }
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28050b, message = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.")
    /* renamed from: d */
    public static final void m29892d(@C12579k C11300l<? super C8434e0, ? extends C8430d0> lVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lVar, "effect");
        oVar.mo14918M(-904483903);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-904483903, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:115)");
        }
        throw new IllegalStateException(f22673b.toString());
    }

    @C8540g
    /* renamed from: e */
    public static final void m29893e(@C12579k Object[] objArr, @C12579k C11300l<? super C8434e0, ? extends C8430d0> lVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(objArr, "keys");
        Intrinsics.checkNotNullParameter(lVar, "effect");
        oVar.mo14918M(-1307627122);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1307627122, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:271)");
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        oVar.mo14918M(-568225417);
        boolean z = false;
        for (Object n0 : copyOf) {
            z |= oVar.mo15006n0(n0);
        }
        Object N = oVar.mo14921N();
        if (z || N == C8592o.f23032a.mo16277a()) {
            oVar.mo14893C(new C8413c0(lVar));
        }
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    /* renamed from: f */
    public static final void m29894f(@C12580l Object obj, @C12580l Object obj2, @C12580l Object obj3, @C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        oVar.mo14918M(-54093371);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:376)");
        }
        CoroutineContext z = oVar.mo15040z();
        oVar.mo14918M(1618982084);
        boolean n0 = oVar.mo15006n0(obj) | oVar.mo15006n0(obj2) | oVar.mo15006n0(obj3);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            oVar.mo14893C(new C8677t0(z, pVar));
        }
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    /* renamed from: g */
    public static final void m29895g(@C12580l Object obj, @C12580l Object obj2, @C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        oVar.mo14918M(590241125);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:353)");
        }
        CoroutineContext z = oVar.mo15040z();
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(obj) | oVar.mo15006n0(obj2);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            oVar.mo14893C(new C8677t0(z, pVar));
        }
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    /* renamed from: h */
    public static final void m29896h(@C12580l Object obj, @C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        oVar.mo14918M(1179185413);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:331)");
        }
        CoroutineContext z = oVar.mo15040z();
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(obj);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            oVar.mo14893C(new C8677t0(z, pVar));
        }
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28050b, message = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.")
    /* renamed from: i */
    public static final void m29897i(@C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        C8592o o = oVar.mo15009o(-805415771);
        if ((i & 1) != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-805415771, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:313)");
            }
            throw new IllegalStateException(f22674c.toString());
        }
        o.mo14958a0();
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EffectsKt$LaunchedEffect$1(pVar, i));
        }
    }

    @C8540g
    /* renamed from: j */
    public static final void m29898j(@C12579k Object[] objArr, @C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(objArr, "keys");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        oVar.mo14918M(-139560008);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:401)");
        }
        CoroutineContext z = oVar.mo15040z();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        oVar.mo14918M(-568225417);
        boolean z2 = false;
        for (Object n0 : copyOf) {
            z2 |= oVar.mo15006n0(n0);
        }
        Object N = oVar.mo14921N();
        if (z2 || N == C8592o.f23032a.mo16277a()) {
            oVar.mo14893C(new C8677t0(z, pVar));
        }
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    /* renamed from: k */
    public static final void m29899k(@C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "effect");
        oVar.mo14918M(-1288466761);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:44)");
        }
        oVar.mo14908I(aVar);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C12579k
    @C11532s0
    /* renamed from: m */
    public static final C12074o0 m29901m(@C12579k CoroutineContext coroutineContext, @C12579k C8592o oVar) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(oVar, "composer");
        C11723c2.C11725b bVar = C11723c2.f29067w0;
        if (coroutineContext.mo7444b(bVar) != null) {
            C11702a0 c = C11968h2.m47683c((C11723c2) null, 1, (Object) null);
            c.mo23696i(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return C12079p0.m48260a(c);
        }
        CoroutineContext z = oVar.mo15040z();
        return C12079p0.m48260a(z.mo7443Q(C11804f2.m46953a((C11723c2) z.mo7444b(bVar))).mo7443Q(coroutineContext));
    }

    @C8540g
    @C12579k
    /* renamed from: n */
    public static final C12074o0 m29902n(@C12580l C11289a<? extends CoroutineContext> aVar, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(773894976);
        if ((i2 & 1) != 0) {
            aVar = EffectsKt$rememberCoroutineScope$1.f22675f;
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = new C8690w(m29901m((CoroutineContext) aVar.invoke(), oVar));
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C12074o0 a = ((C8690w) N).mo16831a();
        oVar.mo15002m0();
        return a;
    }
}
