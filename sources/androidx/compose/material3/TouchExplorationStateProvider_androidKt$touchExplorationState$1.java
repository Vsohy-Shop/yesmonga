package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TouchExplorationStateProvider_androidKt$touchExplorationState$1 extends Lambda implements C11300l<Lifecycle.C19372Event, C11079d2> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ C8204g1 $listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchExplorationStateProvider_androidKt$touchExplorationState$1(C8204g1 g1Var, AccessibilityManager accessibilityManager) {
        super(1);
        this.$listener = g1Var;
        this.$accessibilityManager = accessibilityManager;
    }

    /* renamed from: a */
    public final void mo12425a(@C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.C19372Event.ON_RESUME) {
            this.$listener.mo12606d(this.$accessibilityManager);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12425a((Lifecycle.C19372Event) obj);
        return C11079d2.f28267a;
    }
}
