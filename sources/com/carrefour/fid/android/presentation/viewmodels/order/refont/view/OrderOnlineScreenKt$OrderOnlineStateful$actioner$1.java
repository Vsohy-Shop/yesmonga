package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import android.content.ActivityNotFoundException;
import androidx.compose.p004ui.platform.C16007z3;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27028a;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27052b;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOnlineScreenKt$OrderOnlineStateful$actioner$1 extends Lambda implements C11300l<C27028a, C11079d2> {
    final /* synthetic */ C27052b $analytics;
    final /* synthetic */ C8700z0<C27092a> $displayCancelDialog$delegate;
    final /* synthetic */ C8700z0<C27093b> $displayExitDialog;
    final /* synthetic */ C11305q<String, OrderType, Boolean, C11079d2> $onDisplayOrder;
    final /* synthetic */ C11300l<String, C11079d2> $onNavigateToAccountListFragment;
    final /* synthetic */ C11300l<String, C11079d2> $onNavigateToAdditionalOrder;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToDepartment;
    final /* synthetic */ C11305q<String, OrderType, String, C11079d2> $onNavigateToServiceSlot;
    final /* synthetic */ C11300l<String, C11079d2> $onNavigateToWithdrawalOrderDriveFragment;
    final /* synthetic */ C16007z3 $uriHandler;
    final /* synthetic */ OrderOnlineViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineScreenKt$OrderOnlineStateful$actioner$1(OrderOnlineViewModel orderOnlineViewModel, C27052b bVar, C8700z0<C27093b> z0Var, C11305q<? super String, ? super OrderType, ? super Boolean, C11079d2> qVar, C11289a<C11079d2> aVar, C11300l<? super String, C11079d2> lVar, C11305q<? super String, ? super OrderType, ? super String, C11079d2> qVar2, C11300l<? super String, C11079d2> lVar2, C11300l<? super String, C11079d2> lVar3, C8700z0<C27092a> z0Var2, C16007z3 z3Var) {
        super(1);
        this.$viewModel = orderOnlineViewModel;
        this.$analytics = bVar;
        this.$displayExitDialog = z0Var;
        this.$onDisplayOrder = qVar;
        this.$onNavigateToDepartment = aVar;
        this.$onNavigateToAdditionalOrder = lVar;
        this.$onNavigateToServiceSlot = qVar2;
        this.$onNavigateToAccountListFragment = lVar2;
        this.$onNavigateToWithdrawalOrderDriveFragment = lVar3;
        this.$displayCancelDialog$delegate = z0Var2;
        this.$uriHandler = z3Var;
    }

    /* renamed from: a */
    public final void mo78754a(@C12579k C27028a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        if (Intrinsics.areEqual((Object) aVar, (Object) C27028a.C27037i.f65747a)) {
            this.$viewModel.mo78785g0();
            this.$analytics.mo78563b();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27028a.C27030b.f65730a)) {
            this.$displayExitDialog.setValue(null);
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27028a.C27029a.f65728a)) {
            OrderOnlineScreenKt.m114525n(this.$displayCancelDialog$delegate, (C27092a) null);
        } else if (aVar instanceof C27028a.C27034f) {
            this.$analytics.mo78573l();
            C27028a.C27034f fVar = (C27028a.C27034f) aVar;
            if (Intrinsics.areEqual((Object) fVar.mo78490g(), (Object) OrderType.R2h.f70292e)) {
                this.$displayExitDialog.setValue(new C27093b(0, 0, 0, 0, "https://www.carrefour.fr/mon-compte/mes-achats/en-ligne/", 15, (DefaultConstructorMarker) null));
            } else {
                this.$onDisplayOrder.invoke(fVar.mo78489f(), fVar.mo78490g(), Boolean.valueOf(fVar.mo78491h()));
            }
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27028a.C27033e.f65737a)) {
            this.$displayExitDialog.setValue(new C27093b(0, R.string.customer_dialog_text, R.string.general_see, 0, C28547h2.f69334v, 9, (DefaultConstructorMarker) null));
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27028a.C27035g.f65743a)) {
            this.$onNavigateToDepartment.invoke();
        } else if (aVar instanceof C27028a.C27039k.C27040a.C27041a) {
            this.$analytics.mo78569h();
            this.$onNavigateToAdditionalOrder.invoke(((C27028a.C27039k.C27040a.C27041a) aVar).mo78502d());
        } else if (aVar instanceof C27028a.C27039k.C27040a.C27042b) {
            this.$analytics.mo78568g();
            this.$displayExitDialog.setValue(new C27093b(R.string.general_information, R.string.demande_remboursement_popup_message, R.string.general_see, 0, ((C27028a.C27039k.C27040a.C27042b) aVar).mo78511f(), 8, (DefaultConstructorMarker) null));
        } else if (aVar instanceof C27028a.C27039k.C27040a.C27044d) {
            this.$analytics.mo78564c();
            C27028a.C27039k.C27040a.C27044d dVar = (C27028a.C27039k.C27040a.C27044d) aVar;
            this.$onNavigateToServiceSlot.invoke(dVar.mo78528g(), dVar.mo78529h(), dVar.mo78527f());
        } else if (aVar instanceof C27028a.C27039k.C27040a.C27045e) {
            this.$analytics.mo78565d();
            this.$onNavigateToAccountListFragment.invoke(((C27028a.C27039k.C27040a.C27045e) aVar).mo78534d());
        } else if (aVar instanceof C27028a.C27039k.C27040a.C27043c) {
            C27028a.C27039k.C27040a.C27043c cVar = (C27028a.C27039k.C27040a.C27043c) aVar;
            this.$analytics.mo78570i(cVar.mo78519f());
            OrderOnlineScreenKt.m114525n(this.$displayCancelDialog$delegate, new C27092a(cVar.mo78517e(), cVar.mo78519f()));
        } else if (aVar instanceof C27028a.C27039k.C27047b.C27048a) {
            this.$analytics.mo78568g();
            this.$displayExitDialog.setValue(new C27093b(0, 0, 0, 0, C28547h2.f69332t, 15, (DefaultConstructorMarker) null));
        } else if (aVar instanceof C27028a.C27039k.C27047b.C27050c) {
            this.$analytics.mo78566e();
            this.$displayExitDialog.setValue(new C27093b(0, 0, 0, 0, ((C27028a.C27039k.C27047b.C27050c) aVar).mo78558d(), 15, (DefaultConstructorMarker) null));
        } else if (aVar instanceof C27028a.C27039k.C27047b.C27049b) {
            this.$analytics.mo78570i(((C27028a.C27039k.C27047b.C27049b) aVar).mo78552d());
            this.$displayExitDialog.setValue(new C27093b(0, 0, 0, 0, C28547h2.f69332t, 15, (DefaultConstructorMarker) null));
        } else if (aVar instanceof C27028a.C27038j) {
            this.$displayExitDialog.setValue(new C27093b(0, 0, 0, 0, ((C27028a.C27038j) aVar).mo78496d(), 15, (DefaultConstructorMarker) null));
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27028a.C27036h.f65745a)) {
            this.$viewModel.mo78789j0();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27028a.C27039k.C27051c.f65773a)) {
        } else {
            if (aVar instanceof C27028a.C27031c) {
                OrderOnlineScreenKt.m114525n(this.$displayCancelDialog$delegate, (C27092a) null);
                C27028a.C27031c cVar2 = (C27028a.C27031c) aVar;
                this.$viewModel.mo78784f0(cVar2.mo78479e(), cVar2.mo78481f());
            } else if (Intrinsics.areEqual((Object) aVar, (Object) C27028a.C27032d.f65735a)) {
                this.$analytics.mo78574m();
                C27093b value = this.$displayExitDialog.getValue();
                if (value != null) {
                    C16007z3 z3Var = this.$uriHandler;
                    C8700z0<C27093b> z0Var = this.$displayExitDialog;
                    try {
                        z3Var.mo45708a(value.mo78782l());
                    } catch (ActivityNotFoundException unused) {
                        String l = value.mo78782l();
                        StringBuilder sb = new StringBuilder();
                        sb.append("link not valid : ");
                        sb.append(l);
                    }
                    z0Var.setValue(null);
                }
            } else if (aVar instanceof C27028a.C27039k.C27040a.C27046f) {
                this.$analytics.mo78571j();
                this.$onNavigateToWithdrawalOrderDriveFragment.invoke(((C27028a.C27039k.C27040a.C27046f) aVar).mo78540d());
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo78754a((C27028a) obj);
        return C11079d2.f28267a;
    }
}
