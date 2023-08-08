package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo22516d2 = {"Landroidx/compose/runtime/d;", "<anonymous parameter 0>", "Landroidx/compose/runtime/z1;", "slots", "Landroidx/compose/runtime/r1;", "<anonymous parameter 2>", "Lkotlin/d2;", "a", "(Landroidx/compose/runtime/d;Landroidx/compose/runtime/z1;Landroidx/compose/runtime/r1;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ComposerImpl$reportFreeMovableContent$reportGroup$1 extends Lambda implements C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2> {
    final /* synthetic */ C8697y0 $reference;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$reportFreeMovableContent$reportGroup$1(ComposerImpl composerImpl, C8697y0 y0Var) {
        super(3);
        this.this$0 = composerImpl;
        this.$reference = y0Var;
    }

    /* renamed from: a */
    public final void mo15097a(@C12579k C8428d<?> dVar, @C12579k C8701z1 z1Var, @C12579k C8608r1 r1Var) {
        Intrinsics.checkNotNullParameter(dVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(z1Var, "slots");
        Intrinsics.checkNotNullParameter(r1Var, "<anonymous parameter 2>");
        this.this$0.mo14971d2(this.$reference, z1Var);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo15097a((C8428d) obj, (C8701z1) obj2, (C8608r1) obj3);
        return C11079d2.f28267a;
    }
}
