package androidx.compose.p004ui.layout;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,774:1\n62#2,5:775\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5$1\n*L\n133#1:775,5\n*E\n"})
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5$1 */
public final class SubcomposeLayoutKt$SubcomposeLayout$5$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C8578k2<SubcomposeLayoutState> $stateHolder;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5$1\n*L\n1#1,484:1\n134#2,2:485\n*E\n"})
    /* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5$1$a */
    public static final class C15527a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C8578k2 f38675a;

        public C15527a(C8578k2 k2Var) {
            this.f38675a = k2Var;
        }

        /* renamed from: g */
        public void mo791g() {
            ((SubcomposeLayoutState) this.f38675a.getValue()).mo44343d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$5$1(C8578k2<SubcomposeLayoutState> k2Var) {
        super(1);
        this.$stateHolder = k2Var;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C15527a(this.$stateHolder);
    }
}
