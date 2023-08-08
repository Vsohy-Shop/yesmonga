package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19502x0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/x0$b;", "androidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2\n*L\n1#1,105:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.list.CatalogProductListFragment$special$$inlined$activityViewModels$default$2 */
public final class C39509x1b608d1b extends Lambda implements C11289a<C19502x0.C19506b> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39509x1b608d1b(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    @C12579k
    public final C19502x0.C19506b invoke() {
        C19502x0.C19506b defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
