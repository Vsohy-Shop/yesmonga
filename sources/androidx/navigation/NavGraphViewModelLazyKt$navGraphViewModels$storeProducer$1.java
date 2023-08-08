package androidx.navigation;

import androidx.lifecycle.C19392a1;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/a1;", "invoke", "()Landroidx/lifecycle/a1;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 extends Lambda implements C11289a<C19392a1> {
    final /* synthetic */ C11677z<NavBackStackEntry> $backStackEntry$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(C11677z<NavBackStackEntry> zVar) {
        super(0);
        this.$backStackEntry$delegate = zVar;
    }

    @C12579k
    public final C19392a1 invoke() {
        return NavGraphViewModelLazyKt.m91619g(this.$backStackEntry$delegate).getViewModelStore();
    }
}
