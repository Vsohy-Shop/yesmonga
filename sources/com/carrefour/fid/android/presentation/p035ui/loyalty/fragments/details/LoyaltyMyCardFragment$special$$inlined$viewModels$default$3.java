package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19392a1;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/a1;", "invoke", "()Landroidx/lifecycle/a1;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$6", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$6\n*L\n1#1,222:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyMyCardFragment$special$$inlined$viewModels$default$3 */
public final class LoyaltyMyCardFragment$special$$inlined$viewModels$default$3 extends Lambda implements C11289a<C19392a1> {
    final /* synthetic */ C11677z $owner$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyMyCardFragment$special$$inlined$viewModels$default$3(C11677z zVar) {
        super(0);
        this.$owner$delegate = zVar;
    }

    @C12579k
    public final C19392a1 invoke() {
        C19392a1 viewModelStore = FragmentViewModelLazyKt.m89931p(this.$owner$delegate).getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner.viewModelStore");
        return viewModelStore;
    }
}
