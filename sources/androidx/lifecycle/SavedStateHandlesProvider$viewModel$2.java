package androidx.lifecycle;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/lifecycle/q0;", "a", "()Landroidx/lifecycle/q0;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SavedStateHandlesProvider$viewModel$2 extends Lambda implements C11289a<C19461q0> {
    final /* synthetic */ C19395b1 $viewModelStoreOwner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedStateHandlesProvider$viewModel$2(C19395b1 b1Var) {
        super(0);
        this.$viewModelStoreOwner = b1Var;
    }

    @C12579k
    /* renamed from: a */
    public final C19461q0 invoke() {
        return SavedStateHandleSupport.m90593e(this.$viewModelStoreOwner);
    }
}
