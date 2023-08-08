package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, mo22516d2 = {"V", "T", "Landroidx/compose/runtime/d;", "applier", "Landroidx/compose/runtime/z1;", "<anonymous parameter 1>", "Landroidx/compose/runtime/r1;", "<anonymous parameter 2>", "Lkotlin/d2;", "a", "(Landroidx/compose/runtime/d;Landroidx/compose/runtime/z1;Landroidx/compose/runtime/r1;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ComposerImpl$apply$operation$1 extends Lambda implements C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2> {
    final /* synthetic */ C11304p<T, V, C11079d2> $block;
    final /* synthetic */ V $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$apply$operation$1(C11304p<? super T, ? super V, C11079d2> pVar, V v) {
        super(3);
        this.$block = pVar;
        this.$value = v;
    }

    /* renamed from: a */
    public final void mo15071a(@C12579k C8428d<?> dVar, @C12579k C8701z1 z1Var, @C12579k C8608r1 r1Var) {
        Intrinsics.checkNotNullParameter(dVar, "applier");
        Intrinsics.checkNotNullParameter(z1Var, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(r1Var, "<anonymous parameter 2>");
        this.$block.invoke(dVar.mo15321a(), this.$value);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo15071a((C8428d) obj, (C8701z1) obj2, (C8608r1) obj3);
        return C11079d2.f28267a;
    }
}
