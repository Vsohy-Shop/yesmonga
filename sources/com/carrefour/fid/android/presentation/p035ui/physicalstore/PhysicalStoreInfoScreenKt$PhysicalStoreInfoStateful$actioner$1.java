package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.appcompat.app.C0475e;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27136a;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$actioner$1 */
public final class PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$actioner$1 extends Lambda implements C11300l<C27136a, C11079d2> {
    final /* synthetic */ C0475e $activity;
    final /* synthetic */ C29018a $analytics;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11300l<String, C11079d2> $onRedirectToPhoneClicked;
    final /* synthetic */ C11289a<C11079d2> $onSeeAllServicesClicked;
    final /* synthetic */ C11289a<C11079d2> $onSeeOpeningClicked;
    final /* synthetic */ PhysicalStoreInfoViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$actioner$1(C11289a<C11079d2> aVar, C29018a aVar2, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, PhysicalStoreInfoViewModel physicalStoreInfoViewModel, C0475e eVar) {
        super(1);
        this.$onBackPressed = aVar;
        this.$analytics = aVar2;
        this.$onRedirectToPhoneClicked = lVar;
        this.$onSeeAllServicesClicked = aVar3;
        this.$onSeeOpeningClicked = aVar4;
        this.$viewModel = physicalStoreInfoViewModel;
        this.$activity = eVar;
    }

    /* renamed from: a */
    public final void mo73808a(@C12579k C27136a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        if (Intrinsics.areEqual((Object) aVar, (Object) C27136a.C27137a.f65996a)) {
            this.$onBackPressed.invoke();
        } else if (aVar instanceof C27136a.C27139c) {
            this.$analytics.mo84445e(((C27136a.C27139c) aVar).mo78903d());
        } else if (aVar instanceof C27136a.C27140d) {
            C27136a.C27140d dVar = (C27136a.C27140d) aVar;
            this.$analytics.mo84441a(dVar.mo78912f());
            this.$onRedirectToPhoneClicked.invoke(dVar.mo78910e());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27136a.C27142f.f66007a)) {
            this.$onSeeAllServicesClicked.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27136a.C27143g.f66009a)) {
            this.$onSeeOpeningClicked.invoke();
        } else if (aVar instanceof C27136a.C27141e) {
            C27136a.C27141e eVar = (C27136a.C27141e) aVar;
            this.$analytics.mo84448h(eVar.mo78917d());
            this.$viewModel.mo78890l0(this.$activity, eVar.mo78917d());
        } else if (aVar instanceof C27136a.C27138b) {
            C27136a.C27138b bVar = (C27136a.C27138b) aVar;
            this.$analytics.mo84448h(bVar.mo78897d());
            this.$viewModel.mo78890l0(this.$activity, bVar.mo78897d());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo73808a((C27136a) obj);
        return C11079d2.f28267a;
    }
}
