package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0002H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"R", "P1", "P2", "p1", "p2", "Lkotlin/d2;", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/o;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MovableContentKt$movableContentWithReceiverOf$3 extends Lambda implements C11307s<R, P1, P2, C8592o, Integer, C11079d2> {
    final /* synthetic */ C8691w0<Pair<Pair<R, P1>, P2>> $movableContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$3(C8691w0<Pair<Pair<R, P1>, P2>> w0Var) {
        super(5);
        this.$movableContent = w0Var;
    }

    @C8540g
    /* renamed from: a */
    public final void mo15156a(R r, P1 p1, P2 p2, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & 14) == 0) {
            if (oVar.mo15006n0(r)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (oVar.mo15006n0(p1)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (oVar.mo15006n0(p2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(583402949, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:227)");
            }
            oVar.mo14903G(this.$movableContent, C11078d1.m42659a(C11078d1.m42659a(r, p1), p2));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    /* renamed from: v5 */
    public /* bridge */ /* synthetic */ Object mo7709v5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mo15156a(obj, obj2, obj3, (C8592o) obj4, ((Number) obj5).intValue());
        return C11079d2.f28267a;
    }
}
