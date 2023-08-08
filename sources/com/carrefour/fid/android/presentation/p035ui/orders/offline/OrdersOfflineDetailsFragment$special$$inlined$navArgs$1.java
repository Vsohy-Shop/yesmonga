package com.carrefour.fid.android.presentation.p035ui.orders.offline;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Landroidx/navigation/l;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "androidx/navigation/fragment/FragmentNavArgsLazyKt$navArgs$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragmentNavArgsLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt$navArgs$1\n*L\n1#1,45:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineDetailsFragment$special$$inlined$navArgs$1 */
public final class OrdersOfflineDetailsFragment$special$$inlined$navArgs$1 extends Lambda implements C11289a<Bundle> {
    final /* synthetic */ Fragment $this_navArgs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrdersOfflineDetailsFragment$special$$inlined$navArgs$1(Fragment fragment) {
        super(0);
        this.$this_navArgs = fragment;
    }

    @C12579k
    public final Bundle invoke() {
        Bundle arguments = this.$this_navArgs.getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this.$this_navArgs + " has null arguments");
    }
}
