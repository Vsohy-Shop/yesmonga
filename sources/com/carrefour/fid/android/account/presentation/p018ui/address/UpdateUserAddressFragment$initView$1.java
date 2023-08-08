package com.carrefour.fid.android.account.presentation.p018ui.address;

import androidx.constraintlayout.widget.Group;
import com.carrefour.fid.android.account.presentation.p018ui.address.UpdateUserAddressFragment;
import com.carrefour.fid.android.design.components.widgets.DeliverySwitchComponent;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/DeliverySwitchComponent$SwitchOption;", "selectedOption", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/design/components/widgets/DeliverySwitchComponent$SwitchOption;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nUpdateUserAddressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateUserAddressFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/address/UpdateUserAddressFragment$initView$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,715:1\n262#2,2:716\n*S KotlinDebug\n*F\n+ 1 UpdateUserAddressFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/address/UpdateUserAddressFragment$initView$1\n*L\n294#1:716,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$initView$1 */
public final class UpdateUserAddressFragment$initView$1 extends Lambda implements C11300l<DeliverySwitchComponent.SwitchOption, C11079d2> {
    final /* synthetic */ UpdateUserAddressFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateUserAddressFragment$initView$1(UpdateUserAddressFragment updateUserAddressFragment) {
        super(1);
        this.this$0 = updateUserAddressFragment;
    }

    /* renamed from: a */
    public final void mo31851a(@C12579k DeliverySwitchComponent.SwitchOption switchOption) {
        boolean z;
        Intrinsics.checkNotNullParameter(switchOption, "selectedOption");
        Group group = UpdateUserAddressFragment.m57788V0(this.this$0).f32473q;
        Intrinsics.checkNotNullExpressionValue(group, "binding.deliveryApartmentGroup");
        int i = 0;
        if (switchOption == UpdateUserAddressFragment.f32821H0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        group.setVisibility(i);
        this.this$0.mo31800C1(UpdateUserAddressFragment.Field.FLOOR);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo31851a((DeliverySwitchComponent.SwitchOption) obj);
        return C11079d2.f28267a;
    }
}
