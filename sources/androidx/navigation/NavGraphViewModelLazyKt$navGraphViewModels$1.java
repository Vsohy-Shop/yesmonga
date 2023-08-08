package androidx.navigation;

import androidx.lifecycle.C19502x0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/x0$b;", "invoke", "()Landroidx/lifecycle/x0$b;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavGraphViewModelLazyKt$navGraphViewModels$1 extends Lambda implements C11289a<C19502x0.C19506b> {
    final /* synthetic */ C11677z<NavBackStackEntry> $backStackEntry$delegate;
    final /* synthetic */ C11289a<C19502x0.C19506b> $factoryProducer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$1(C11289a<? extends C19502x0.C19506b> aVar, C11677z<NavBackStackEntry> zVar) {
        super(0);
        this.$factoryProducer = aVar;
        this.$backStackEntry$delegate = zVar;
    }

    @C12579k
    public final C19502x0.C19506b invoke() {
        C11289a<C19502x0.C19506b> aVar = this.$factoryProducer;
        C19502x0.C19506b invoke = aVar == null ? null : aVar.invoke();
        return invoke == null ? NavGraphViewModelLazyKt.m91619g(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory() : invoke;
    }
}
