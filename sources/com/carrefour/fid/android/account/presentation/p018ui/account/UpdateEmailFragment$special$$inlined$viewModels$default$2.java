package com.carrefour.fid.android.account.presentation.p018ui.account;

import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19395b1;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/a1;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$2", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$2\n*L\n1#1,105:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.UpdateEmailFragment$special$$inlined$viewModels$default$2 */
public final class UpdateEmailFragment$special$$inlined$viewModels$default$2 extends Lambda implements C11289a<C19392a1> {
    final /* synthetic */ C11289a $ownerProducer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateEmailFragment$special$$inlined$viewModels$default$2(C11289a aVar) {
        super(0);
        this.$ownerProducer = aVar;
    }

    @C12579k
    public final C19392a1 invoke() {
        C19392a1 viewModelStore = ((C19395b1) this.$ownerProducer.invoke()).getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }
}
