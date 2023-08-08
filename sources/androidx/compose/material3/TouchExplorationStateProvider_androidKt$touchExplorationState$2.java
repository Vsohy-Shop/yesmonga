package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TouchExplorationStateProvider_androidKt$touchExplorationState$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ C8204g1 $listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchExplorationStateProvider_androidKt$touchExplorationState$2(C8204g1 g1Var, AccessibilityManager accessibilityManager) {
        super(0);
        this.$listener = g1Var;
        this.$accessibilityManager = accessibilityManager;
    }

    public final void invoke() {
        this.$listener.mo12609g(this.$accessibilityManager);
    }
}
