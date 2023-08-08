package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19455p;
import androidx.lifecycle.C19502x0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/x0$b;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$3", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3\n*L\n1#1,105:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment$special$$inlined$viewModels$default$3 */
public final class ServiceSlotFragment$special$$inlined$viewModels$default$3 extends Lambda implements C11289a<C19502x0.C19506b> {
    final /* synthetic */ C11289a $ownerProducer;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotFragment$special$$inlined$viewModels$default$3(C11289a aVar, Fragment fragment) {
        super(0);
        this.$ownerProducer = aVar;
        this.$this_viewModels = fragment;
    }

    @C12579k
    public final C19502x0.C19506b invoke() {
        Object invoke = this.$ownerProducer.invoke();
        C19502x0.C19506b bVar = null;
        C19455p pVar = invoke instanceof C19455p ? (C19455p) invoke : null;
        if (pVar != null) {
            bVar = pVar.getDefaultViewModelProviderFactory();
        }
        if (bVar == null) {
            bVar = this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
        Intrinsics.checkNotNullExpressionValue(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
        return bVar;
    }
}
