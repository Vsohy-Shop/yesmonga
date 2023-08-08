package com.carrefour.fid.android.loyalty.presentation.viewmodels.create;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.loyalty.C38285R;
import com.carrefour.fid.android.loyalty.presentation.analytics.CreateCardAnalytics;
import com.carrefour.fid.android.loyalty.presentation.analytics.CreateCardAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.models.CardTypeModel;
import com.carrefour.fid.android.loyalty.presentation.models.HomeLoyaltyModel;
import com.carrefour.fid.android.loyalty.presentation.models.LoyaltyBenefitModel;
import com.carrefour.fid.android.loyalty.presentation.models.extension.HomeLoyaltyModelKt;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.mvi.CreateLoyaltyCard;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0011\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\t\u0010\f\u001a\u00020\u0007H\u0001J\t\u0010\r\u001a\u00020\u0007H\u0001J\t\u0010\u000e\u001a\u00020\u0007H\u0001J\t\u0010\u000f\u001a\u00020\u0007H\u0001J\t\u0010\u0010\u001a\u00020\u0007H\u0001J\t\u0010\u0011\u001a\u00020\u0007H\u0001J\t\u0010\u0012\u001a\u00020\u0007H\u0001J\t\u0010\u0013\u001a\u00020\u0007H\u0001J\t\u0010\u0014\u001a\u00020\u0007H\u0001J\u001b\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/CreateOrAttachCardViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UIState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UserAction;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/CreateCardAnalytics;", "", "position", "Lkotlin/d2;", "getCardType", "", "isErrorBalance", "checkAttachCard", "sendScreenView", "sendTagCardCreated", "sendTagClickAcceptCGU", "sendTagClickAttachCardFid", "sendTagClickAttachCardPass", "sendTagClickCreateCardFid", "sendTagClickCreateCardPass", "sendTagClickDenyCGU", "sendTagClickSeeCGU", "intent", "processIntent", "(Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/presentation/models/HomeLoyaltyModel;", "getGetCardPassInformation", "()Lcom/carrefour/fid/android/loyalty/presentation/models/HomeLoyaltyModel;", "getCardPassInformation", "getGetCardFidInformation", "getCardFidInformation", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/CreateCardAnalyticsDelegate;", "analytics", "<init>", "(Lcom/carrefour/fid/android/loyalty/presentation/analytics/CreateCardAnalyticsDelegate;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
public final class CreateOrAttachCardViewModel extends BaseMVIViewModel<CreateLoyaltyCard.UIState, CreateLoyaltyCard.UserAction> implements CreateCardAnalytics {
    private final /* synthetic */ CreateCardAnalyticsDelegate $$delegate_0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public CreateOrAttachCardViewModel(@C12579k CreateCardAnalyticsDelegate createCardAnalyticsDelegate) {
        super(new CreateLoyaltyCard.UIState((List) null, (HomeLoyaltyModel) null, 3, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(createCardAnalyticsDelegate, "analytics");
        this.$$delegate_0 = createCardAnalyticsDelegate;
    }

    private final void checkAttachCard(boolean z) {
        if (z) {
            sendTagClickAttachCardFid();
            emitEvent(CreateLoyaltyCard.AttachCard.INSTANCE);
        }
    }

    private final void getCardType(int i) {
        HomeLoyaltyModel homeLoyaltyModel;
        CreateLoyaltyCard.UIState uIState = (CreateLoyaltyCard.UIState) getCurrentState();
        List<CardTypeModel> getLoyaltyCardList = HomeLoyaltyModelKt.getGetLoyaltyCardList();
        if (i == 0) {
            homeLoyaltyModel = getGetCardFidInformation();
        } else {
            homeLoyaltyModel = getGetCardPassInformation();
        }
        publishState(uIState.copy(getLoyaltyCardList, homeLoyaltyModel));
    }

    private final HomeLoyaltyModel getGetCardFidInformation() {
        List<LoyaltyBenefitModel> getListBenefitForFidCard = HomeLoyaltyModelKt.getGetListBenefitForFidCard();
        int i = C38285R.string.loyalty_btn_attach_card;
        return new HomeLoyaltyModel(getListBenefitForFidCard, new CreateOrAttachCardViewModel$getCardFidInformation$1(this), new CreateOrAttachCardViewModel$getCardFidInformation$2(this), C38285R.string.loyalty_btn_create_card_fid, i);
    }

    private final HomeLoyaltyModel getGetCardPassInformation() {
        List<LoyaltyBenefitModel> getListBenefitForPassCard = HomeLoyaltyModelKt.getGetListBenefitForPassCard();
        int i = C38285R.string.loyalty_btn_attach_card_pass;
        return new HomeLoyaltyModel(getListBenefitForPassCard, new CreateOrAttachCardViewModel$getCardPassInformation$1(this), new CreateOrAttachCardViewModel$getCardPassInformation$2(this), C38285R.string.carte_pass_discover, i);
    }

    public void sendScreenView() {
        this.$$delegate_0.sendScreenView();
    }

    public void sendTagCardCreated() {
        this.$$delegate_0.sendTagCardCreated();
    }

    public void sendTagClickAcceptCGU() {
        this.$$delegate_0.sendTagClickAcceptCGU();
    }

    public void sendTagClickAttachCardFid() {
        this.$$delegate_0.sendTagClickAttachCardFid();
    }

    public void sendTagClickAttachCardPass() {
        this.$$delegate_0.sendTagClickAttachCardPass();
    }

    public void sendTagClickCreateCardFid() {
        this.$$delegate_0.sendTagClickCreateCardFid();
    }

    public void sendTagClickCreateCardPass() {
        this.$$delegate_0.sendTagClickCreateCardPass();
    }

    public void sendTagClickDenyCGU() {
        this.$$delegate_0.sendTagClickDenyCGU();
    }

    public void sendTagClickSeeCGU() {
        this.$$delegate_0.sendTagClickSeeCGU();
    }

    @C12580l
    public Object processIntent(@C12579k CreateLoyaltyCard.UserAction userAction, @C12579k C11045c<? super C11079d2> cVar) {
        if (userAction instanceof CreateLoyaltyCard.GetCardType) {
            getCardType(((CreateLoyaltyCard.GetCardType) userAction).getPosition());
        } else if (userAction instanceof CreateLoyaltyCard.CheckAttachCard) {
            checkAttachCard(((CreateLoyaltyCard.CheckAttachCard) userAction).getErrorBalance());
        }
        return C11079d2.f28267a;
    }
}
