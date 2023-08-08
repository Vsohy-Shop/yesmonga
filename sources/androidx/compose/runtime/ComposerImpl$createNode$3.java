package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, mo22516d2 = {"T", "Landroidx/compose/runtime/d;", "applier", "Landroidx/compose/runtime/z1;", "slots", "Landroidx/compose/runtime/r1;", "<anonymous parameter 2>", "Lkotlin/d2;", "a", "(Landroidx/compose/runtime/d;Landroidx/compose/runtime/z1;Landroidx/compose/runtime/r1;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ComposerImpl$createNode$3 extends Lambda implements C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2> {
    final /* synthetic */ C8412c $groupAnchor;
    final /* synthetic */ int $insertIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$createNode$3(C8412c cVar, int i) {
        super(3);
        this.$groupAnchor = cVar;
        this.$insertIndex = i;
    }

    /* renamed from: a */
    public final void mo15073a(@C12579k C8428d<?> dVar, @C12579k C8701z1 z1Var, @C12579k C8608r1 r1Var) {
        Intrinsics.checkNotNullParameter(dVar, "applier");
        Intrinsics.checkNotNullParameter(z1Var, "slots");
        Intrinsics.checkNotNullParameter(r1Var, "<anonymous parameter 2>");
        Object G0 = z1Var.mo16905G0(this.$groupAnchor);
        dVar.mo15324k();
        dVar.mo15559h(this.$insertIndex, G0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo15073a((C8428d) obj, (C8701z1) obj2, (C8608r1) obj3);
        return C11079d2.f28267a;
    }
}
