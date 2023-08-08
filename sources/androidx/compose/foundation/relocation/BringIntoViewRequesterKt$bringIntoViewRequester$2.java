package androidx.compose.foundation.relocation;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt$bringIntoViewRequester$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,154:1\n36#2:155\n1114#3,6:156\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt$bringIntoViewRequester$2\n*L\n108#1:155\n108#1:156,6\n*E\n"})
public final class BringIntoViewRequesterKt$bringIntoViewRequester$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C2672d $bringIntoViewRequester;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterKt$bringIntoViewRequester$2(C2672d dVar) {
        super(3);
        this.$bringIntoViewRequester = dVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo9128a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(-992853993);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-992853993, i, -1, "androidx.compose.foundation.relocation.bringIntoViewRequester.<anonymous> (BringIntoViewRequester.kt:105)");
        }
        C2671c b = C2674f.m12053b(oVar, 0);
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(b);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new BringIntoViewRequesterModifier(b);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        final BringIntoViewRequesterModifier bringIntoViewRequesterModifier = (BringIntoViewRequesterModifier) N;
        final C2672d dVar = this.$bringIntoViewRequester;
        if (dVar instanceof BringIntoViewRequesterImpl) {
            EffectsKt.m29891c(dVar, new C11300l<C8434e0, C8430d0>() {

                @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt$bringIntoViewRequester$2$1\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,484:1\n114#2:485\n735#3,2:486\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt$bringIntoViewRequester$2$1\n*L\n114#1:486,2\n*E\n"})
                /* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1$a */
                public static final class C2664a implements C8430d0 {

                    /* renamed from: a */
                    public final /* synthetic */ C2672d f7034a;

                    /* renamed from: b */
                    public final /* synthetic */ BringIntoViewRequesterModifier f7035b;

                    public C2664a(C2672d dVar, BringIntoViewRequesterModifier bringIntoViewRequesterModifier) {
                        this.f7034a = dVar;
                        this.f7035b = bringIntoViewRequesterModifier;
                    }

                    /* renamed from: g */
                    public void mo791g() {
                        ((BringIntoViewRequesterImpl) this.f7034a).mo9126c().mo15495z0(this.f7035b);
                    }
                }

                @C12579k
                /* renamed from: a */
                public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
                    Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
                    ((BringIntoViewRequesterImpl) dVar).mo9126c().mo15463e(bringIntoViewRequesterModifier);
                    return new C2664a(dVar, bringIntoViewRequesterModifier);
                }
            }, oVar, 0);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return bringIntoViewRequesterModifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo9128a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
