package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19455p;
import androidx.lifecycle.viewmodel.C19477a;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/viewmodel/a;", "a", "()Landroidx/lifecycle/viewmodel/a;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$7"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7\n*L\n1#1,222:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutPaymentFragment$special$$inlined$viewModels$default$4 */
public final class CheckoutPaymentFragment$special$$inlined$viewModels$default$4 extends Lambda implements C11289a<C19477a> {
    final /* synthetic */ C11289a $extrasProducer;
    final /* synthetic */ C11677z $owner$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutPaymentFragment$special$$inlined$viewModels$default$4(C11289a aVar, C11677z zVar) {
        super(0);
        this.$extrasProducer = aVar;
        this.$owner$delegate = zVar;
    }

    @C12579k
    /* renamed from: a */
    public final C19477a invoke() {
        C19455p pVar;
        C19477a aVar;
        C19477a aVar2;
        C11289a aVar3 = this.$extrasProducer;
        if (aVar3 != null && (aVar2 = (C19477a) aVar3.invoke()) != null) {
            return aVar2;
        }
        C19395b1 b = FragmentViewModelLazyKt.m89931p(this.$owner$delegate);
        if (b instanceof C19455p) {
            pVar = (C19455p) b;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            aVar = pVar.getDefaultViewModelCreationExtras();
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return C19477a.C19478a.f49866b;
        }
        return aVar;
    }
}
