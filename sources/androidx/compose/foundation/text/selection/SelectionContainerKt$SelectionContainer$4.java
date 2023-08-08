package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,144:1\n62#2,5:145\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4\n*L\n139#1:145,5\n*E\n"})
public final class SelectionContainerKt$SelectionContainer$4 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ SelectionManager $manager;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4\n*L\n1#1,484:1\n140#2,2:485\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$a */
    public static final class C2794a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ SelectionManager f7350a;

        public C2794a(SelectionManager selectionManager) {
            this.f7350a = selectionManager;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f7350a.mo9635L();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$4(SelectionManager selectionManager) {
        super(1);
        this.$manager = selectionManager;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C2794a(this.$manager);
    }
}
