package androidx.fragment.app;

import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19455p;
import androidx.lifecycle.C19502x0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/x0$b;", "invoke", "()Landroidx/lifecycle/x0$b;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class FragmentViewModelLazyKt$viewModels$4 extends Lambda implements C11289a<C19502x0.C19506b> {
    final /* synthetic */ C11677z<C19395b1> $owner$delegate;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$4(Fragment fragment, C11677z<? extends C19395b1> zVar) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = zVar;
    }

    @C12579k
    public final C19502x0.C19506b invoke() {
        C19502x0.C19506b bVar;
        C19395b1 a = FragmentViewModelLazyKt.m89930o(this.$owner$delegate);
        C19455p pVar = a instanceof C19455p ? (C19455p) a : null;
        if (pVar == null || (bVar = pVar.getDefaultViewModelProviderFactory()) == null) {
            bVar = this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
        Intrinsics.checkNotNullExpressionValue(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
        return bVar;
    }
}
