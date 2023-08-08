package androidx.compose.p004ui.graphics.vector;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8598p;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter$RenderVector$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,420:1\n62#2,5:421\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter$RenderVector$2\n*L\n239#1:421,5\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2 */
public final class VectorPainter$RenderVector$2 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C8598p $composition;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter$RenderVector$2\n*L\n1#1,484:1\n240#2,2:485\n*E\n"})
    /* renamed from: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2$a */
    public static final class C15335a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C8598p f37803a;

        public C15335a(C8598p pVar) {
            this.f37803a = pVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f37803a.mo16284g();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainter$RenderVector$2(C8598p pVar) {
        super(1);
        this.$composition = pVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C15335a(this.$composition);
    }
}
