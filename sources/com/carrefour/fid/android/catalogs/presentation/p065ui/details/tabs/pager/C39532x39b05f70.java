package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19392a1;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/a1;", "androidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$1\n*L\n1#1,105:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.CatalogPagerFragment$special$$inlined$activityViewModels$default$1 */
public final class C39532x39b05f70 extends Lambda implements C11289a<C19392a1> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39532x39b05f70(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    @C12579k
    public final C19392a1 invoke() {
        C19392a1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }
}
