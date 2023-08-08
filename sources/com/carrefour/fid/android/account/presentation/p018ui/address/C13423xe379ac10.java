package com.carrefour.fid.android.account.presentation.p018ui.address;

import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.hilt.navigation.C19284a;
import androidx.lifecycle.C19502x0;
import androidx.navigation.NavBackStackEntry;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/x0$b;", "invoke", "()Landroidx/lifecycle/x0$b;", "androidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nHiltNavGraphViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$1\n*L\n1#1,61:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$special$$inlined$hiltNavGraphViewModels$3 */
public final class C13423xe379ac10 extends Lambda implements C11289a<C19502x0.C19506b> {
    final /* synthetic */ C11677z $backStackEntry;
    final /* synthetic */ C11510n $backStackEntry$metadata;
    final /* synthetic */ Fragment $this_hiltNavGraphViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13423xe379ac10(Fragment fragment, C11677z zVar, C11510n nVar) {
        super(0);
        this.$this_hiltNavGraphViewModels = fragment;
        this.$backStackEntry = zVar;
        this.$backStackEntry$metadata = nVar;
    }

    @C12579k
    public final C19502x0.C19506b invoke() {
        C19232h requireActivity = this.$this_hiltNavGraphViewModels.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.$backStackEntry.getValue();
        Intrinsics.checkNotNullExpressionValue(navBackStackEntry, "backStackEntry");
        return C19284a.m90443a(requireActivity, navBackStackEntry);
    }
}
