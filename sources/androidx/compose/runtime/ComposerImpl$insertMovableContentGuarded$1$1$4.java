package androidx.compose.runtime;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo22516d2 = {"Landroidx/compose/runtime/d;", "<anonymous parameter 0>", "Landroidx/compose/runtime/z1;", "slots", "Landroidx/compose/runtime/r1;", "<anonymous parameter 2>", "Lkotlin/d2;", "a", "(Landroidx/compose/runtime/d;Landroidx/compose/runtime/z1;Landroidx/compose/runtime/r1;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$4\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4528:1\n33#2,6:4529\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$4\n*L\n3156#1:4529,6\n*E\n"})
public final class ComposerImpl$insertMovableContentGuarded$1$1$4 extends Lambda implements C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2> {
    final /* synthetic */ C8697y0 $from;
    final /* synthetic */ C8694x0 $resolvedState;
    final /* synthetic */ C8697y0 $to;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$4(C8694x0 x0Var, ComposerImpl composerImpl, C8697y0 y0Var, C8697y0 y0Var2) {
        super(3);
        this.$resolvedState = x0Var;
        this.this$0 = composerImpl;
        this.$from = y0Var;
        this.$to = y0Var2;
    }

    /* renamed from: a */
    public final void mo15084a(@C12579k C8428d<?> dVar, @C12579k C8701z1 z1Var, @C12579k C8608r1 r1Var) {
        RecomposeScopeImpl recomposeScopeImpl;
        Intrinsics.checkNotNullParameter(dVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(z1Var, "slots");
        Intrinsics.checkNotNullParameter(r1Var, "<anonymous parameter 2>");
        C8694x0 x0Var = this.$resolvedState;
        if (x0Var == null && (x0Var = this.this$0.f22597c.mo15057m(this.$from)) == null) {
            ComposerKt.m29774A("Could not resolve state for movable content");
            throw new KotlinNothingValueException();
        }
        List<C8412c> C0 = z1Var.mo16897C0(1, x0Var.mo16870a(), 2);
        if (!C0.isEmpty()) {
            C8696y b = this.$to.mo16877b();
            Intrinsics.checkNotNull(b, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            C8613s sVar = (C8613s) b;
            int size = C0.size();
            for (int i = 0; i < size; i++) {
                Object d1 = z1Var.mo16950d1(C0.get(i), 0);
                if (d1 instanceof RecomposeScopeImpl) {
                    recomposeScopeImpl = (RecomposeScopeImpl) d1;
                } else {
                    recomposeScopeImpl = null;
                }
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.mo15203g(sVar);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo15084a((C8428d) obj, (C8701z1) obj2, (C8608r1) obj3);
        return C11079d2.f28267a;
    }
}
