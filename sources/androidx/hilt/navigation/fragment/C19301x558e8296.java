package androidx.hilt.navigation.fragment;

import androidx.lifecycle.C19392a1;
import androidx.navigation.NavBackStackEntry;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/a1;", "invoke", "()Landroidx/lifecycle/a1;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 4, 2})
/* renamed from: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$storeProducer$1 */
public final class C19301x558e8296 extends Lambda implements C11289a<C19392a1> {
    final /* synthetic */ C11677z $backStackEntry;
    final /* synthetic */ C11510n $backStackEntry$metadata;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19301x558e8296(C11677z zVar, C11510n nVar) {
        super(0);
        this.$backStackEntry = zVar;
        this.$backStackEntry$metadata = nVar;
    }

    @C12579k
    public final C19392a1 invoke() {
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.$backStackEntry.getValue();
        Intrinsics.checkNotNullExpressionValue(navBackStackEntry, "backStackEntry");
        C19392a1 viewModelStore = navBackStackEntry.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "backStackEntry.viewModelStore");
        return viewModelStore;
    }
}
