package androidx.hilt.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.C19736g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/navigation/NavBackStackEntry;", "invoke", "()Landroidx/navigation/NavBackStackEntry;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 4, 2})
/* renamed from: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$backStackEntry$2 */
public final class C19300xd37b66e9 extends Lambda implements C11289a<NavBackStackEntry> {
    final /* synthetic */ int $navGraphId;
    final /* synthetic */ Fragment $this_hiltNavGraphViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19300xd37b66e9(Fragment fragment, int i) {
        super(0);
        this.$this_hiltNavGraphViewModels = fragment;
        this.$navGraphId = i;
    }

    @C12579k
    public final NavBackStackEntry invoke() {
        return C19736g.m91827a(this.$this_hiltNavGraphViewModels).mo58094D(this.$navGraphId);
    }
}