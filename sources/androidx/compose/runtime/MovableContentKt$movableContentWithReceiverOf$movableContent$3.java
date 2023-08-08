package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u001e\u0010\u0004\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"R", "P1", "P2", "Lkotlin/Pair;", "it", "Lkotlin/d2;", "a", "(Lkotlin/Pair;Landroidx/compose/runtime/o;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MovableContentKt$movableContentWithReceiverOf$movableContent$3 extends Lambda implements C11305q<Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2>, C8592o, Integer, C11079d2> {
    final /* synthetic */ C11307s<R, P1, P2, C8592o, Integer, C11079d2> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$movableContent$3(C11307s<? super R, ? super P1, ? super P2, ? super C8592o, ? super Integer, C11079d2> sVar) {
        super(3);
        this.$content = sVar;
    }

    @C8540g
    /* renamed from: a */
    public final void mo15160a(@C12579k Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2> pair, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(pair, "it");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1322148760, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:224)");
        }
        this.$content.mo7709v5(((Pair) pair.mo21849e()).mo21849e(), ((Pair) pair.mo21849e()).mo21851f(), pair.mo21851f(), oVar, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo15160a((Pair) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
