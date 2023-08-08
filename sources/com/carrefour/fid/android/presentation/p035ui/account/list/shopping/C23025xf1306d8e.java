package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19455p;
import androidx.lifecycle.C19502x0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/x0$b;", "invoke", "()Landroidx/lifecycle/x0$b;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$8", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8\n*L\n1#1,222:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$special$$inlined$viewModels$default$5 */
public final class C23025xf1306d8e extends Lambda implements C11289a<C19502x0.C19506b> {
    final /* synthetic */ C11677z $owner$delegate;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23025xf1306d8e(Fragment fragment, C11677z zVar) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = zVar;
    }

    @C12579k
    public final C19502x0.C19506b invoke() {
        C19502x0.C19506b bVar;
        C19395b1 b = FragmentViewModelLazyKt.m89931p(this.$owner$delegate);
        C19455p pVar = b instanceof C19455p ? (C19455p) b : null;
        if (pVar == null || (bVar = pVar.getDefaultViewModelProviderFactory()) == null) {
            bVar = this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
        Intrinsics.checkNotNullExpressionValue(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
        return bVar;
    }
}
