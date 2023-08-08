package com.carrefour.fid.android.presentation.viewmodels.home;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsCarouselsUseCase;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsOffersUseCase;
import com.carrefour.fid.android.consent.domain.interactors.SaveConsentCurrentDateUseCase;
import com.carrefour.fid.android.consent.domain.interactors.ShouldDisplayUserConsentsBackdropUseCase;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.design.components.compose.ActiveState;
import com.carrefour.fid.android.design.components.compose.C37020p;
import com.carrefour.fid.android.design.components.compose.Service;
import com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalBannersUseCase;
import com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase;
import com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.catalog.C37610b;
import com.carrefour.fid.android.domain.interactors.category.C37619a;
import com.carrefour.fid.android.domain.interactors.consent.C37630b;
import com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase;
import com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase;
import com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37824l;
import com.carrefour.fid.android.domain.interactors.service.C37826n;
import com.carrefour.fid.android.domain.interactors.service.C37828p;
import com.carrefour.fid.android.domain.interactors.service.C37835r;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37833d;
import com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase;
import com.carrefour.fid.android.domain.interactors.user.C37874b;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.interactors.utilities.C37888b;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase;
import com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25216a;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25222e;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;
import com.carrefour.fid.android.presentation.viewmodels.home.event.C26385a;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26484b;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26491d;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26494e;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i;
import com.carrefour.fid.android.presentation.viewmodels.luckycart.C26620a;
import com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.util.C28929f;
import com.carrefour.fid.android.utils.tagging.inbox.C22725b;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.collections.C10977s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000À\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bö\u0003\b\u0007\u0012\u0006\u0010k\u001a\u00020h\u0012\u0006\u0010o\u001a\u00020l\u0012\u0006\u0010s\u001a\u00020p\u0012\u0006\u0010w\u001a\u00020t\u0012\u0006\u0010{\u001a\u00020x\u0012\u0006\u0010\u001a\u00020|\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010£\u0001\u001a\u00030 \u0001\u0012\b\u0010§\u0001\u001a\u00030¤\u0001\u0012\b\u0010«\u0001\u001a\u00030¨\u0001\u0012\b\u0010¯\u0001\u001a\u00030¬\u0001\u0012\b\u0010³\u0001\u001a\u00030°\u0001\u0012\b\u0010·\u0001\u001a\u00030´\u0001\u0012\b\u0010»\u0001\u001a\u00030¸\u0001\u0012\b\u0010¿\u0001\u001a\u00030¼\u0001\u0012\b\u0010Ã\u0001\u001a\u00030À\u0001\u0012\b\u0010Ç\u0001\u001a\u00030Ä\u0001\u0012\b\u0010Ë\u0001\u001a\u00030È\u0001\u0012\b\u0010Ï\u0001\u001a\u00030Ì\u0001\u0012\b\u0010Ó\u0001\u001a\u00030Ð\u0001\u0012\b\u0010×\u0001\u001a\u00030Ô\u0001\u0012\b\u0010Û\u0001\u001a\u00030Ø\u0001\u0012\b\u0010ß\u0001\u001a\u00030Ü\u0001\u0012\b\u0010ã\u0001\u001a\u00030à\u0001\u0012\b\u0010ç\u0001\u001a\u00030ä\u0001\u0012\b\u0010ë\u0001\u001a\u00030è\u0001\u0012\b\u0010ï\u0001\u001a\u00030ì\u0001\u0012\b\u0010ó\u0001\u001a\u00030ð\u0001\u0012\b\u0010÷\u0001\u001a\u00030ô\u0001\u0012\b\u0010û\u0001\u001a\u00030ø\u0001\u0012\b\u0010ÿ\u0001\u001a\u00030ü\u0001\u0012\b\u0010\u0002\u001a\u00030\u0002\u0012\b\u0010\u0002\u001a\u00030\u0002\u0012\b\u0010\u0002\u001a\u00030\u0002\u0012\b\u0010\u0002\u001a\u00030\u0002\u0012\b\u0010\u0002\u001a\u00030\u0002\u0012\b\u0010\u0002\u001a\u00030\u0002\u0012\b\u0010\u0002\u001a\u00030\u0002\u0012\b\u0010\u0002\u001a\u00030\u0002\u0012\b\u0010£\u0002\u001a\u00030 \u0002\u0012\b\u0010§\u0002\u001a\u00030¤\u0002\u0012\b\u0010«\u0002\u001a\u00030¨\u0002\u0012\b\u0010¯\u0002\u001a\u00030¬\u0002ø\u0001\u0000¢\u0006\u0006\b\u0003\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0013\u0010\t\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\u0013\u0010\n\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J#\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0013\u0010\u0015\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0013\u0010\u0018\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0006J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\u0013\u0010\u001c\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0006J\u0013\u0010\u001d\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0006J\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0006J\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010\u0006J\u0013\u0010!\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0006J\u0013\u0010\"\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0006J\u0018\u0010'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002J\u0013\u0010(\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0006J\u0013\u0010)\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b)\u0010\u0006J\u0013\u0010*\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0006J\u0013\u0010+\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0006J\u0013\u0010,\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0006J\u0013\u0010-\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b-\u0010\u0006J1\u00103\u001a\u00020\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100H@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001b\u00107\u001a\u00020\u00042\u0006\u00106\u001a\u000205H@ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b9\u0010\u0006J\n\u0010;\u001a\u0004\u0018\u00010:H\u0002J\b\u0010<\u001a\u00020\u0012H\u0002J\b\u0010=\u001a\u00020\u0012H\u0002J\b\u0010>\u001a\u00020\u0012H\u0002J\u0013\u0010?\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0006J\u001b\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@H@ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001b\u0010E\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u001b\u0010I\u001a\u00020\u00042\u0006\u0010H\u001a\u00020GH@ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u001b\u0010M\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH@ø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\b\u0010O\u001a\u00020\u0012H\u0002J\u0013\u0010P\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\bP\u0010\u0006J\u0013\u0010Q\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0006J\u0013\u0010R\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\bR\u0010\u0006J\u0013\u0010S\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\bS\u0010\u0006J\u0012\u0010U\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020T00H\u0002J\u0013\u0010V\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\bV\u0010\u0006J#\u0010Y\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\bY\u0010\u000fJ\u001b\u0010Z\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\bZ\u0010[J\u000e\u0010^\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\\J\u000e\u0010a\u001a\u00020\u00042\u0006\u0010`\u001a\u00020_J\u0006\u0010c\u001a\u00020bJ\u0017\u0010f\u001a\u00020e2\u0006\u0010d\u001a\u00020\u000bH\u0000¢\u0006\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020h8\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u001a\u00020|8\u0002X\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018\u0002X\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010«\u0001\u001a\u00030¨\u00018\u0002X\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010¯\u0001\u001a\u00030¬\u00018\u0002X\u0004¢\u0006\b\n\u0006\b­\u0001\u0010®\u0001R\u001b\u0010³\u0001\u001a\u00030°\u00018\u0002X\u0004ø\u0001\u0000¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0018\u0010·\u0001\u001a\u00030´\u00018\u0002X\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010»\u0001\u001a\u00030¸\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010¿\u0001\u001a\u00030¼\u00018\u0002X\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0018\u0010Ã\u0001\u001a\u00030À\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Ç\u0001\u001a\u00030Ä\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0018\u0010Ë\u0001\u001a\u00030È\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ì\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ð\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010×\u0001\u001a\u00030Ô\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u0018\u0010Û\u0001\u001a\u00030Ø\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u0018\u0010ß\u0001\u001a\u00030Ü\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0018\u0010ã\u0001\u001a\u00030à\u00018\u0002X\u0004¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u0018\u0010ç\u0001\u001a\u00030ä\u00018\u0002X\u0004¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u0018\u0010ë\u0001\u001a\u00030è\u00018\u0002X\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010ï\u0001\u001a\u00030ì\u00018\u0002X\u0004¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u0018\u0010ó\u0001\u001a\u00030ð\u00018\u0002X\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0018\u0010÷\u0001\u001a\u00030ô\u00018\u0002X\u0004¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u0018\u0010û\u0001\u001a\u00030ø\u00018\u0002X\u0004¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u0018\u0010ÿ\u0001\u001a\u00030ü\u00018\u0002X\u0004¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0018\u0010£\u0002\u001a\u00030 \u00028\u0002X\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R\u0018\u0010§\u0002\u001a\u00030¤\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u0018\u0010«\u0002\u001a\u00030¨\u00028\u0002X\u0004¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R\u0018\u0010¯\u0002\u001a\u00030¬\u00028\u0002X\u0004¢\u0006\b\n\u0006\b­\u0002\u0010®\u0002R\u001f\u0010´\u0002\u001a\n\u0012\u0005\u0012\u00030±\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R$\u0010º\u0002\u001a\n\u0012\u0005\u0012\u00030±\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\b¶\u0002\u0010·\u0002\u001a\u0006\b¸\u0002\u0010¹\u0002R\u001f\u0010½\u0002\u001a\n\u0012\u0005\u0012\u00030»\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¼\u0002\u0010³\u0002R$\u0010À\u0002\u001a\n\u0012\u0005\u0012\u00030»\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\b¾\u0002\u0010·\u0002\u001a\u0006\b¿\u0002\u0010¹\u0002R\u001f\u0010Ã\u0002\u001a\n\u0012\u0005\u0012\u00030Á\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÂ\u0002\u0010³\u0002R$\u0010Æ\u0002\u001a\n\u0012\u0005\u0012\u00030Á\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\bÄ\u0002\u0010·\u0002\u001a\u0006\bÅ\u0002\u0010¹\u0002R\u001f\u0010É\u0002\u001a\n\u0012\u0005\u0012\u00030Ç\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÈ\u0002\u0010³\u0002R$\u0010Ì\u0002\u001a\n\u0012\u0005\u0012\u00030Ç\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\bÊ\u0002\u0010·\u0002\u001a\u0006\bË\u0002\u0010¹\u0002R\u001f\u0010Ï\u0002\u001a\n\u0012\u0005\u0012\u00030Í\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÎ\u0002\u0010³\u0002R$\u0010Ò\u0002\u001a\n\u0012\u0005\u0012\u00030Í\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\bÐ\u0002\u0010·\u0002\u001a\u0006\bÑ\u0002\u0010¹\u0002R\u001f\u0010Õ\u0002\u001a\n\u0012\u0005\u0012\u00030Ó\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÔ\u0002\u0010³\u0002R$\u0010Ø\u0002\u001a\n\u0012\u0005\u0012\u00030Ó\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\bÖ\u0002\u0010·\u0002\u001a\u0006\b×\u0002\u0010¹\u0002R\u001f\u0010Û\u0002\u001a\n\u0012\u0005\u0012\u00030Ù\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÚ\u0002\u0010³\u0002R$\u0010Þ\u0002\u001a\n\u0012\u0005\u0012\u00030Ù\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\bÜ\u0002\u0010·\u0002\u001a\u0006\bÝ\u0002\u0010¹\u0002R\u001f\u0010á\u0002\u001a\n\u0012\u0005\u0012\u00030ß\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\bà\u0002\u0010³\u0002R$\u0010ä\u0002\u001a\n\u0012\u0005\u0012\u00030ß\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\bâ\u0002\u0010·\u0002\u001a\u0006\bã\u0002\u0010¹\u0002R\u001f\u0010æ\u0002\u001a\n\u0012\u0005\u0012\u00030ß\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\bå\u0002\u0010³\u0002R$\u0010é\u0002\u001a\n\u0012\u0005\u0012\u00030ß\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\bç\u0002\u0010·\u0002\u001a\u0006\bè\u0002\u0010¹\u0002R\u001f\u0010ì\u0002\u001a\n\u0012\u0005\u0012\u00030ê\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\bë\u0002\u0010³\u0002R$\u0010ï\u0002\u001a\n\u0012\u0005\u0012\u00030ê\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\bí\u0002\u0010·\u0002\u001a\u0006\bî\u0002\u0010¹\u0002R&\u0010õ\u0002\u001a\u0011\u0012\u0005\u0012\u00030ñ\u0002\u0012\u0005\u0012\u00030ò\u00020ð\u00028\u0002X\u0004¢\u0006\b\n\u0006\bó\u0002\u0010ô\u0002R-\u0010ø\u0002\u001a\u0018\u0012\u0013\u0012\u0011\u0012\u0005\u0012\u00030ñ\u0002\u0012\u0005\u0012\u00030ö\u00020ð\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\b÷\u0002\u0010³\u0002R2\u0010û\u0002\u001a\u0018\u0012\u0013\u0012\u0011\u0012\u0005\u0012\u00030ñ\u0002\u0012\u0005\u0012\u00030ö\u00020ð\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\bù\u0002\u0010·\u0002\u001a\u0006\bú\u0002\u0010¹\u0002R\u001f\u0010þ\u0002\u001a\n\u0012\u0005\u0012\u00030ü\u00020°\u00028\u0002X\u0004¢\u0006\b\n\u0006\bý\u0002\u0010³\u0002R#\u0010`\u001a\n\u0012\u0005\u0012\u00030ü\u00020µ\u00028\u0006¢\u0006\u0010\n\u0006\bÿ\u0002\u0010·\u0002\u001a\u0006\b\u0003\u0010¹\u0002R\u001f\u0010\u0003\u001a\n\u0012\u0005\u0012\u00030\u00030\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010\u0003R$\u0010\u0003\u001a\n\u0012\u0005\u0012\u00030\u00030\u00038\u0006¢\u0006\u0010\n\u0006\b\u0003\u0010\u0003\u001a\u0006\b\u0003\u0010\u0003R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020#0°\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010³\u0002R#\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020#0µ\u00028\u0006¢\u0006\u0010\n\u0006\b\u0003\u0010·\u0002\u001a\u0006\b\u0003\u0010¹\u0002R!\u0010\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00030°\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010³\u0002\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/home/HomePageViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$c;", "Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$a;", "Lkotlin/d2;", "p1", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "O1", "o1", "c1", "b1", "", "stickersTitle", "stickersUrl", "W1", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "l1", "Y1", "", "isFavoriteStoreSet", "R1", "i2", "Q1", "P1", "a2", "j2", "m2", "t1", "r1", "d1", "Lkotlin/Result;", "f1", "g1", "m1", "Z1", "", "appLaunchCount", "", "stationsStartDate", "h2", "k1", "j1", "Y0", "X1", "h1", "e1", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailsHeaderModel;", "lastOrder", "", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineItemModel;", "validOrderList", "T1", "(Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailsHeaderModel;Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "basketDomain", "S1", "(Lcom/carrefour/fid/android/domain/models/BasketDomain;Lkotlin/coroutines/c;)Ljava/lang/Object;", "q1", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "K1", "c2", "b2", "d2", "v1", "Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "accountInfo", "V1", "(Lcom/carrefour/fid/android/domain/models/account/AccountInfo;Lkotlin/coroutines/c;)Ljava/lang/Object;", "fidCardNumber", "D1", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/account/UserCards;", "loyaltyCard", "n1", "(Lcom/carrefour/fid/android/domain/models/account/UserCards;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$a$i;", "intent", "N1", "(Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$a$i;Lkotlin/coroutines/c;)Ljava/lang/Object;", "n2", "Z0", "i1", "s1", "u1", "Lcom/carrefour/fid/android/domain/models/consent/ConsentOptIn;", "a1", "X0", "secureToken", "url", "e2", "g2", "(Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "topInset", "k2", "Lcom/carrefour/fid/android/design/components/compose/p$a;", "slotState", "l2", "Lkotlinx/coroutines/c2;", "f2", "loyaltyCardNumber", "Lcom/carrefour/fid/android/core/type/LoyaltyCardType;", "G1", "(Ljava/lang/String;)Lcom/carrefour/fid/android/core/type/LoyaltyCardType;", "Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;", "getOfferProductListUseCase", "Lcom/carrefour/fid/android/presentation/models/mapper/OfferListModelDataMapper;", "b", "Lcom/carrefour/fid/android/presentation/models/mapper/OfferListModelDataMapper;", "offerListModelDataMapper", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineListUseCase;", "c", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineListUseCase;", "getOrderOnlineListUseCase", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;", "d", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;", "getOrderOnlineDetailUseCase", "Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/e;", "e", "Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/e;", "ordersOnlineModelDataMapper", "Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/a;", "f", "Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/a;", "ordersOnlineDetailsModelDataMapper", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "g", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "retrieveBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "h", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "checkRemoteConfigUseCase", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsCarouselsUseCase;", "i", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsCarouselsUseCase;", "getCmsCarouselsUseCase", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsOffersUseCase;", "j", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsOffersUseCase;", "getCmsOffersUseCase", "Lcom/carrefour/fid/android/domain/interactors/gazStation/GetGazStationsCampaignUseCase;", "k", "Lcom/carrefour/fid/android/domain/interactors/gazStation/GetGazStationsCampaignUseCase;", "getGazStationsCampaignUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "l", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;", "m", "Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;", "fetchCouponsUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "n", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "getLoyaltyBalanceUseCase", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "o", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Lcom/carrefour/fid/android/utils/tagging/inbox/b;", "p", "Lcom/carrefour/fid/android/utils/tagging/inbox/b;", "inboxAdapter", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "q", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "accountRepository", "Lcom/carrefour/fid/android/domain/interactors/service/l;", "r", "Lcom/carrefour/fid/android/domain/interactors/service/l;", "getStoreRefUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/r;", "s", "Lcom/carrefour/fid/android/domain/interactors/service/r;", "observeServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/p;", "t", "Lcom/carrefour/fid/android/domain/interactors/service/p;", "isSelectedServiceOpenUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "u", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "clearServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/n;", "v", "Lcom/carrefour/fid/android/domain/interactors/service/n;", "isPreviousSelectedServiceDifferentUseCase", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "w", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "x", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "getFavoritePhysicalStoreUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "y", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "fetchFacilityDetailsByAnabelKeyUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/d;", "z", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/d;", "setFavoritePhysicalStoreUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/b;", "A", "Lcom/carrefour/fid/android/domain/interactors/user/b;", "clearUserDataUseCase", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "B", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "appPreferencesStorage", "Lcom/carrefour/fid/android/scan/core/datastore/ScanPreferencesStorage;", "C", "Lcom/carrefour/fid/android/scan/core/datastore/ScanPreferencesStorage;", "scanPreferencesStorage", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "D", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "homeAnalyticsViewModel", "Lcom/carrefour/fid/android/domain/interactors/luckycart/LuckyCartGetLuckyCartBannerDetailsUseCase;", "E", "Lcom/carrefour/fid/android/domain/interactors/luckycart/LuckyCartGetLuckyCartBannerDetailsUseCase;", "getLuckyCartProductsBannerUseCase", "Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalBannersUseCase;", "F", "Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalBannersUseCase;", "getArsenalBannersUseCase", "Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalTopBannersUseCase;", "G", "Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalTopBannersUseCase;", "getArsenalTopBannersUseCase", "Lcom/carrefour/fid/android/domain/interactors/luckycart/GetLuckyCartGameBannerUseCase;", "H", "Lcom/carrefour/fid/android/domain/interactors/luckycart/GetLuckyCartGameBannerUseCase;", "getLuckyCartGameBannerUseCase", "Lcom/carrefour/fid/android/domain/interactors/stickers/GetStickersContentUseCase;", "I", "Lcom/carrefour/fid/android/domain/interactors/stickers/GetStickersContentUseCase;", "getStickersContentUseCase", "Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/a;", "J", "Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/a;", "luckyCartAnalyticsHandler", "Lcom/carrefour/fid/android/domain/interactors/criteo/GetCriteoBannerUseCase;", "K", "Lcom/carrefour/fid/android/domain/interactors/criteo/GetCriteoBannerUseCase;", "criteoBannerUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/e0;", "L", "Lcom/carrefour/fid/android/domain/interactors/basket/e0;", "retrieveBasketFromCacheUseCase", "Lcom/carrefour/fid/android/domain/interactors/category/a;", "M", "Lcom/carrefour/fid/android/domain/interactors/category/a;", "getCategoriesUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "N", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getServiceSelectionUseCase", "Lcom/carrefour/fid/android/consent/domain/interactors/ShouldDisplayUserConsentsBackdropUseCase;", "O", "Lcom/carrefour/fid/android/consent/domain/interactors/ShouldDisplayUserConsentsBackdropUseCase;", "shouldDisplayUserConsentsBackdropUseCase", "Lcom/carrefour/fid/android/domain/interactors/consent/b;", "P", "Lcom/carrefour/fid/android/domain/interactors/consent/b;", "getRefusedAndMissingConsentsUseCase", "Lcom/carrefour/fid/android/consent/domain/interactors/SaveConsentCurrentDateUseCase;", "Q", "Lcom/carrefour/fid/android/consent/domain/interactors/SaveConsentCurrentDateUseCase;", "saveConsentCurrentDateUseCase", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "R", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "criteoTrackingUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/recommended/LoadBasketBuilderUseCase;", "S", "Lcom/carrefour/fid/android/domain/interactors/product/recommended/LoadBasketBuilderUseCase;", "loadBasketBuilderUseCase", "Lcom/carrefour/fid/android/domain/interactors/utilities/b;", "T", "Lcom/carrefour/fid/android/domain/interactors/utilities/b;", "getSecureTokenUseCase", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsMiniHubBlocksUseCase;", "U", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsMiniHubBlocksUseCase;", "getCmsMiniHubBlocksUseCase", "Lcom/carrefour/fid/android/domain/interactors/logm/a;", "V", "Lcom/carrefour/fid/android/domain/interactors/logm/a;", "remoteLogUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/b;", "W", "Lcom/carrefour/fid/android/domain/interactors/catalog/b;", "getCatalogActionUseCase", "Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalJOBannerUseCase;", "X", "Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalJOBannerUseCase;", "getArsenalJOBannerUseCase", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/g;", "Y", "Lkotlinx/coroutines/flow/j;", "_loyaltyCardStateFlow", "Lkotlinx/coroutines/flow/u;", "Z", "Lkotlinx/coroutines/flow/u;", "F1", "()Lkotlinx/coroutines/flow/u;", "loyaltyCardStateFlow", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/f;", "a0", "_loyaltyBalanceStateFlow", "b0", "E1", "loyaltyBalanceStateFlow", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/c;", "c0", "_couponsInfoStateFlow", "d0", "z1", "couponsInfoStateFlow", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/h;", "e0", "_stickersInfoStateFlow", "f0", "J1", "stickersInfoStateFlow", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/d;", "g0", "_gazStationsCampaignStateFlow", "h0", "B1", "gazStationsCampaignStateFlow", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/e;", "i0", "_insetsState", "j0", "C1", "insetsState", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/i;", "k0", "_userStatus", "l0", "M1", "userStatus", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/a;", "m0", "_topArsenalBannerStatus", "n0", "L1", "topArsenalBannerStatus", "o0", "_bottomArsenalBannerStatus", "p0", "y1", "bottomArsenalBannerStatus", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/b;", "q0", "_arsenalJOBannerState", "r0", "w1", "arsenalJOBannerState", "", "Lcom/carrefour/fid/android/design/components/compose/Service;", "Lcom/carrefour/fid/android/design/components/compose/ActiveState$Steady;", "s0", "Ljava/util/Map;", "serviceStateInitValue", "Lcom/carrefour/fid/android/design/components/compose/ActiveState;", "t0", "_serviceAndActiveState", "u0", "H1", "serviceAndActiveState", "Lcom/carrefour/fid/android/design/components/compose/p;", "v0", "_slotState", "w0", "I1", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/presentation/viewmodels/home/event/a;", "x0", "Lkotlinx/coroutines/channels/g;", "_eventChannel", "Lkotlinx/coroutines/flow/e;", "y0", "Lkotlinx/coroutines/flow/e;", "A1", "()Lkotlinx/coroutines/flow/e;", "eventFlow", "z0", "_basketProductCount", "A0", "x1", "basketProductCount", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "B0", "serviceSelection", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;Lcom/carrefour/fid/android/presentation/models/mapper/OfferListModelDataMapper;Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineListUseCase;Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/e;Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/a;Lcom/carrefour/fid/android/domain/interactors/basket/f0;Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsCarouselsUseCase;Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsOffersUseCase;Lcom/carrefour/fid/android/domain/interactors/gazStation/GetGazStationsCampaignUseCase;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;Lcom/carrefour/fid/android/utils/tagging/inbox/b;Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;Lcom/carrefour/fid/android/domain/interactors/service/l;Lcom/carrefour/fid/android/domain/interactors/service/r;Lcom/carrefour/fid/android/domain/interactors/service/p;Lcom/carrefour/fid/android/domain/interactors/service/a;Lcom/carrefour/fid/android/domain/interactors/service/n;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;Lcom/carrefour/fid/android/domain/interactors/service/e;Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/d;Lcom/carrefour/fid/android/domain/interactors/user/b;Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;Lcom/carrefour/fid/android/scan/core/datastore/ScanPreferencesStorage;Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;Lcom/carrefour/fid/android/domain/interactors/luckycart/LuckyCartGetLuckyCartBannerDetailsUseCase;Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalBannersUseCase;Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalTopBannersUseCase;Lcom/carrefour/fid/android/domain/interactors/luckycart/GetLuckyCartGameBannerUseCase;Lcom/carrefour/fid/android/domain/interactors/stickers/GetStickersContentUseCase;Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/a;Lcom/carrefour/fid/android/domain/interactors/criteo/GetCriteoBannerUseCase;Lcom/carrefour/fid/android/domain/interactors/basket/e0;Lcom/carrefour/fid/android/domain/interactors/category/a;Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/consent/domain/interactors/ShouldDisplayUserConsentsBackdropUseCase;Lcom/carrefour/fid/android/domain/interactors/consent/b;Lcom/carrefour/fid/android/consent/domain/interactors/SaveConsentCurrentDateUseCase;Lcom/carrefour/fid/android/domain/interactors/criteo/j;Lcom/carrefour/fid/android/domain/interactors/product/recommended/LoadBasketBuilderUseCase;Lcom/carrefour/fid/android/domain/interactors/utilities/b;Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsMiniHubBlocksUseCase;Lcom/carrefour/fid/android/domain/interactors/logm/a;Lcom/carrefour/fid/android/domain/interactors/catalog/b;Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalJOBannerUseCase;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nHomePageViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePageViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/home/HomePageViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1362:1\n1855#2,2:1363\n1855#2,2:1380\n1603#2,9:1397\n1855#2:1406\n1856#2:1408\n1612#2:1409\n800#2,11:1410\n1549#2:1421\n1620#2,3:1422\n1549#2:1425\n1620#2,3:1426\n1549#2:1429\n1620#2,3:1430\n1603#2,9:1454\n1855#2:1463\n1856#2:1465\n1612#2:1466\n1603#2,9:1478\n1855#2:1487\n1856#2:1489\n1612#2:1490\n1855#2,2:1491\n1549#2:1493\n1620#2,3:1494\n1747#2,3:1497\n1747#2,3:1500\n230#3,5:1365\n230#3,5:1370\n230#3,5:1375\n230#3,5:1382\n230#3,5:1387\n230#3,5:1392\n230#3,5:1433\n230#3,5:1438\n230#3,5:1443\n230#3,5:1448\n230#3,5:1468\n230#3,5:1473\n1#4:1407\n1#4:1453\n1#4:1464\n1#4:1467\n1#4:1488\n1#4:1503\n*S KotlinDebug\n*F\n+ 1 HomePageViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/home/HomePageViewModel\n*L\n453#1:1363,2\n479#1:1380,2\n544#1:1397,9\n544#1:1406\n544#1:1408\n544#1:1409\n714#1:1410,11\n773#1:1421\n773#1:1422,3\n790#1:1425\n790#1:1426,3\n808#1:1429\n808#1:1430,3\n1068#1:1454,9\n1068#1:1463\n1068#1:1465\n1068#1:1466\n1291#1:1478,9\n1291#1:1487\n1291#1:1489\n1291#1:1490\n1293#1:1491,2\n1296#1:1493\n1296#1:1494,3\n1333#1:1497,3\n1334#1:1500,3\n458#1:1365,5\n462#1:1370,5\n468#1:1375,5\n484#1:1382,5\n488#1:1387,5\n494#1:1392,5\n893#1:1433,5\n916#1:1438,5\n929#1:1443,5\n943#1:1448,5\n1132#1:1468,5\n1148#1:1473,5\n544#1:1407\n1068#1:1464\n1291#1:1488\n*E\n"})
public final class HomePageViewModel extends BaseMVIViewModel<C26406a.C26449c, C26406a.C26407a> {

    /* renamed from: C0 */
    public static final int f64411C0 = 8;
    @C12579k

    /* renamed from: A */
    public final C37874b f64412A;
    @C12579k

    /* renamed from: A0 */
    public final C11952u<Integer> f64413A0;
    @C12579k

    /* renamed from: B */
    public final AppPreferencesStorage f64414B;
    @C12579k

    /* renamed from: B0 */
    public final C11940j<C38162k> f64415B0 = C11953v.m47628a(null);
    @C12579k

    /* renamed from: C */
    public final ScanPreferencesStorage f64416C;
    @C12579k

    /* renamed from: D */
    public final HomeAnalyticsViewModel f64417D;
    @C12579k

    /* renamed from: E */
    public final LuckyCartGetLuckyCartBannerDetailsUseCase f64418E;
    @C12579k

    /* renamed from: F */
    public final GetArsenalBannersUseCase f64419F;
    @C12579k

    /* renamed from: G */
    public final GetArsenalTopBannersUseCase f64420G;
    @C12579k

    /* renamed from: H */
    public final GetLuckyCartGameBannerUseCase f64421H;
    @C12579k

    /* renamed from: I */
    public final GetStickersContentUseCase f64422I;
    @C12579k

    /* renamed from: J */
    public final C26620a f64423J;
    @C12579k

    /* renamed from: K */
    public final GetCriteoBannerUseCase f64424K;
    @C12579k

    /* renamed from: L */
    public final C37566e0 f64425L;
    @C12579k

    /* renamed from: M */
    public final C37619a f64426M;
    @C12579k

    /* renamed from: N */
    public final C37823k f64427N;
    @C12579k

    /* renamed from: O */
    public final ShouldDisplayUserConsentsBackdropUseCase f64428O;
    @C12579k

    /* renamed from: P */
    public final C37630b f64429P;
    @C12579k

    /* renamed from: Q */
    public final SaveConsentCurrentDateUseCase f64430Q;
    @C12579k

    /* renamed from: R */
    public final C37672j f64431R;
    @C12579k

    /* renamed from: S */
    public final LoadBasketBuilderUseCase f64432S;
    @C12579k

    /* renamed from: T */
    public final C37888b f64433T;
    @C12579k

    /* renamed from: U */
    public final GetCmsMiniHubBlocksUseCase f64434U;
    @C12579k

    /* renamed from: V */
    public final C37694a f64435V;
    @C12579k

    /* renamed from: W */
    public final C37610b f64436W;
    @C12579k

    /* renamed from: X */
    public final GetArsenalJOBannerUseCase f64437X;
    @C12579k

    /* renamed from: Y */
    public final C11940j<C26501g> f64438Y;
    @C12579k

    /* renamed from: Z */
    public final C11952u<C26501g> f64439Z;
    @C12579k

    /* renamed from: a */
    public final GetOfferProductListUseCase f64440a;
    @C12579k

    /* renamed from: a0 */
    public final C11940j<C26497f> f64441a0;
    @C12579k

    /* renamed from: b */
    public final OfferListModelDataMapper f64442b;
    @C12579k

    /* renamed from: b0 */
    public final C11952u<C26497f> f64443b0;
    @C12579k

    /* renamed from: c */
    public final GetOrderOnlineListUseCase f64444c;
    @C12579k

    /* renamed from: c0 */
    public final C11940j<C26487c> f64445c0;
    @C12579k

    /* renamed from: d */
    public final GetOrderOnlineDetailUseCase f64446d;
    @C12579k

    /* renamed from: d0 */
    public final C11952u<C26487c> f64447d0;
    @C12579k

    /* renamed from: e */
    public final C25222e f64448e;
    @C12579k

    /* renamed from: e0 */
    public final C11940j<C26505h> f64449e0;
    @C12579k

    /* renamed from: f */
    public final C25216a f64450f;
    @C12579k

    /* renamed from: f0 */
    public final C11952u<C26505h> f64451f0;
    @C12579k

    /* renamed from: g */
    public final C37569f0 f64452g;
    @C12579k

    /* renamed from: g0 */
    public final C11940j<C26491d> f64453g0;
    @C12579k

    /* renamed from: h */
    public final C37807b f64454h;
    @C12579k

    /* renamed from: h0 */
    public final C11952u<C26491d> f64455h0;
    @C12579k

    /* renamed from: i */
    public final GetCmsCarouselsUseCase f64456i;
    @C12579k

    /* renamed from: i0 */
    public final C11940j<C26494e> f64457i0;
    @C12579k

    /* renamed from: j */
    public final GetCmsOffersUseCase f64458j;
    @C12579k

    /* renamed from: j0 */
    public final C11952u<C26494e> f64459j0;
    @C12579k

    /* renamed from: k */
    public final GetGazStationsCampaignUseCase f64460k;
    @C12579k

    /* renamed from: k0 */
    public final C11940j<C26509i> f64461k0;
    @C12579k

    /* renamed from: l */
    public final C37878e f64462l;
    @C12579k

    /* renamed from: l0 */
    public final C11952u<C26509i> f64463l0;
    @C12579k

    /* renamed from: m */
    public final FetchCouponsUseCase f64464m;
    @C12579k

    /* renamed from: m0 */
    public final C11940j<C26481a> f64465m0;
    @C12579k

    /* renamed from: n */
    public final GetLoyaltyBalanceUseCase f64466n;
    @C12579k

    /* renamed from: n0 */
    public final C11952u<C26481a> f64467n0;
    @C12579k

    /* renamed from: o */
    public final LoginRepository f64468o;
    @C12579k

    /* renamed from: o0 */
    public final C11940j<C26481a> f64469o0;
    @C12579k

    /* renamed from: p */
    public final C22725b f64470p;
    @C12579k

    /* renamed from: p0 */
    public final C11952u<C26481a> f64471p0;
    @C12579k

    /* renamed from: q */
    public final AccountRepository f64472q;
    @C12579k

    /* renamed from: q0 */
    public final C11940j<C26484b> f64473q0;
    @C12579k

    /* renamed from: r */
    public final C37824l f64474r;
    @C12579k

    /* renamed from: r0 */
    public final C11952u<C26484b> f64475r0;
    @C12579k

    /* renamed from: s */
    public final C37835r f64476s;
    @C12579k

    /* renamed from: s0 */
    public final Map<Service, ActiveState.Steady> f64477s0;
    @C12579k

    /* renamed from: t */
    public final C37828p f64478t;
    @C12579k

    /* renamed from: t0 */
    public final C11940j<Map<Service, ActiveState>> f64479t0;
    @C12579k

    /* renamed from: u */
    public final C37811a f64480u;
    @C12579k

    /* renamed from: u0 */
    public final C11952u<Map<Service, ActiveState>> f64481u0;
    @C12579k

    /* renamed from: v */
    public final C37826n f64482v;
    @C12579k

    /* renamed from: v0 */
    public final C11940j<C37020p> f64483v0;
    @C12579k

    /* renamed from: w */
    public final LoyaltyPreferencesStorage f64484w;
    @C12579k

    /* renamed from: w0 */
    public final C11952u<C37020p> f64485w0;
    @C12579k

    /* renamed from: x */
    public final C37832c f64486x;
    @C12579k

    /* renamed from: x0 */
    public final C11744g<C26385a> f64487x0;
    @C12579k

    /* renamed from: y */
    public final C37816e f64488y;
    @C12579k

    /* renamed from: y0 */
    public final C11907e<C26385a> f64489y0;
    @C12579k

    /* renamed from: z */
    public final C37833d f64490z;
    @C12579k

    /* renamed from: z0 */
    public final C11940j<Integer> f64491z0;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$1", mo22502f = "HomePageViewModel.kt", mo22503i = {}, mo22504l = {262, 262}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$1 */
    public static final class C263751 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;
        final /* synthetic */ HomePageViewModel this$0;

        @C11363r0({"SMAP\nHomePageViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePageViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/home/HomePageViewModel$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1362:1\n230#2,5:1363\n*S KotlinDebug\n*F\n+ 1 HomePageViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/home/HomePageViewModel$1$1\n*L\n266#1:1363,5\n*E\n"})
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$1$a */
        public static final class C26376a implements C11908f<C38162k> {

            /* renamed from: a */
            public final /* synthetic */ HomePageViewModel f64492a;

            public C26376a(HomePageViewModel homePageViewModel) {
                this.f64492a = homePageViewModel;
            }

            @C12580l
            /* renamed from: c */
            public final Object emit(@C12580l C38162k kVar, @C12579k C11045c<? super C11079d2> cVar) {
                StoreService storeService;
                Object value;
                this.f64492a.f64415B0.setValue(kVar);
                if (kVar != null) {
                    storeService = kVar.mo119354f();
                } else {
                    storeService = null;
                }
                if (storeService == null) {
                    C11940j K0 = this.f64492a.f64479t0;
                    HomePageViewModel homePageViewModel = this.f64492a;
                    do {
                        value = K0.getValue();
                        Map map = (Map) value;
                    } while (!K0.mo24216e(value, homePageViewModel.f64477s0));
                }
                this.f64492a.f64483v0.setValue(C37020p.C37022b.f92538a);
                return C11079d2.f28267a;
            }
        }

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C263751(this.this$0, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C37835r F0 = this.this$0.f64476s;
                this.label = 1;
                obj = F0.invoke(this);
                if (obj == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else if (i == 2) {
                C11661u0.m45747n(obj);
                return C11079d2.f28267a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C26376a aVar = new C26376a(this.this$0);
            this.label = 2;
            if (((C11907e) obj).collect(aVar, this) == h) {
                return h;
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C263751) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public HomePageViewModel(@C12579k GetOfferProductListUseCase getOfferProductListUseCase, @C12579k OfferListModelDataMapper offerListModelDataMapper, @C12579k GetOrderOnlineListUseCase getOrderOnlineListUseCase, @C12579k GetOrderOnlineDetailUseCase getOrderOnlineDetailUseCase, @C12579k C25222e eVar, @C12579k C25216a aVar, @C12579k C37569f0 f0Var, @C12579k C37807b bVar, @C12579k GetCmsCarouselsUseCase getCmsCarouselsUseCase, @C12579k GetCmsOffersUseCase getCmsOffersUseCase, @C12579k GetGazStationsCampaignUseCase getGazStationsCampaignUseCase, @C12579k C37878e eVar2, @C12579k FetchCouponsUseCase fetchCouponsUseCase, @C12579k GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase, @C12579k LoginRepository loginRepository, @C12579k C22725b bVar2, @C12579k AccountRepository accountRepository, @C12579k C37824l lVar, @C12579k C37835r rVar, @C12579k C37828p pVar, @C12579k C37811a aVar2, @C12579k C37826n nVar, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k C37832c cVar, @C12579k C37816e eVar3, @C12579k C37833d dVar, @C12579k C37874b bVar3, @C12579k AppPreferencesStorage appPreferencesStorage, @C12579k ScanPreferencesStorage scanPreferencesStorage, @C12579k HomeAnalyticsViewModel homeAnalyticsViewModel, @C12579k LuckyCartGetLuckyCartBannerDetailsUseCase luckyCartGetLuckyCartBannerDetailsUseCase, @C12579k GetArsenalBannersUseCase getArsenalBannersUseCase, @C12579k GetArsenalTopBannersUseCase getArsenalTopBannersUseCase, @C12579k GetLuckyCartGameBannerUseCase getLuckyCartGameBannerUseCase, @C12579k GetStickersContentUseCase getStickersContentUseCase, @C12579k C26620a aVar3, @C12579k GetCriteoBannerUseCase getCriteoBannerUseCase, @C12579k C37566e0 e0Var, @C12579k C37619a aVar4, @C12579k C37823k kVar, @C12579k ShouldDisplayUserConsentsBackdropUseCase shouldDisplayUserConsentsBackdropUseCase, @C12579k C37630b bVar4, @C12579k SaveConsentCurrentDateUseCase saveConsentCurrentDateUseCase, @C12579k C37672j jVar, @C12579k LoadBasketBuilderUseCase loadBasketBuilderUseCase, @C12579k C37888b bVar5, @C12579k GetCmsMiniHubBlocksUseCase getCmsMiniHubBlocksUseCase, @C12579k C37694a aVar5, @C12579k C37610b bVar6, @C12579k GetArsenalJOBannerUseCase getArsenalJOBannerUseCase) {
        super(new C26406a.C26449c((C26406a.C26449c.C26476i) null, (StoreServiceType) null, false, (C26406a.C26449c.C26456c) null, (List) null, (List) null, (List) null, (C26406a.C26449c.C26469g) null, (C26406a.C26449c.C26472h) null, (C26406a.C26449c.C26460d) null, (C26406a.C26449c.C26453b) null, (C26406a.C26449c.C26466f) null, (C26406a.C26449c.C26463e) null, (List) null, (List) null, (List) null, 65535, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        GetOfferProductListUseCase getOfferProductListUseCase2 = getOfferProductListUseCase;
        OfferListModelDataMapper offerListModelDataMapper2 = offerListModelDataMapper;
        GetOrderOnlineListUseCase getOrderOnlineListUseCase2 = getOrderOnlineListUseCase;
        GetOrderOnlineDetailUseCase getOrderOnlineDetailUseCase2 = getOrderOnlineDetailUseCase;
        C25222e eVar4 = eVar;
        C25216a aVar6 = aVar;
        C37569f0 f0Var2 = f0Var;
        C37807b bVar7 = bVar;
        GetCmsCarouselsUseCase getCmsCarouselsUseCase2 = getCmsCarouselsUseCase;
        FetchCouponsUseCase fetchCouponsUseCase2 = fetchCouponsUseCase;
        C22725b bVar8 = bVar2;
        Intrinsics.checkNotNullParameter(getOfferProductListUseCase2, "getOfferProductListUseCase");
        Intrinsics.checkNotNullParameter(offerListModelDataMapper2, "offerListModelDataMapper");
        Intrinsics.checkNotNullParameter(getOrderOnlineListUseCase2, "getOrderOnlineListUseCase");
        Intrinsics.checkNotNullParameter(getOrderOnlineDetailUseCase2, "getOrderOnlineDetailUseCase");
        Intrinsics.checkNotNullParameter(eVar4, "ordersOnlineModelDataMapper");
        Intrinsics.checkNotNullParameter(aVar6, "ordersOnlineDetailsModelDataMapper");
        Intrinsics.checkNotNullParameter(f0Var2, "retrieveBasketUseCase");
        Intrinsics.checkNotNullParameter(bVar7, "checkRemoteConfigUseCase");
        Intrinsics.checkNotNullParameter(getCmsCarouselsUseCase2, "getCmsCarouselsUseCase");
        Intrinsics.checkNotNullParameter(getCmsOffersUseCase, "getCmsOffersUseCase");
        Intrinsics.checkNotNullParameter(getGazStationsCampaignUseCase, "getGazStationsCampaignUseCase");
        Intrinsics.checkNotNullParameter(eVar2, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(fetchCouponsUseCase2, "fetchCouponsUseCase");
        Intrinsics.checkNotNullParameter(getLoyaltyBalanceUseCase, "getLoyaltyBalanceUseCase");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(bVar2, "inboxAdapter");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(lVar, "getStoreRefUseCase");
        Intrinsics.checkNotNullParameter(rVar, "observeServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(pVar, "isSelectedServiceOpenUseCase");
        Intrinsics.checkNotNullParameter(aVar2, "clearServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(nVar, "isPreviousSelectedServiceDifferentUseCase");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(cVar, "getFavoritePhysicalStoreUseCase");
        Intrinsics.checkNotNullParameter(eVar3, "fetchFacilityDetailsByAnabelKeyUseCase");
        Intrinsics.checkNotNullParameter(dVar, "setFavoritePhysicalStoreUseCase");
        Intrinsics.checkNotNullParameter(bVar3, "clearUserDataUseCase");
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "appPreferencesStorage");
        Intrinsics.checkNotNullParameter(scanPreferencesStorage, "scanPreferencesStorage");
        Intrinsics.checkNotNullParameter(homeAnalyticsViewModel, "homeAnalyticsViewModel");
        Intrinsics.checkNotNullParameter(luckyCartGetLuckyCartBannerDetailsUseCase, "getLuckyCartProductsBannerUseCase");
        Intrinsics.checkNotNullParameter(getArsenalBannersUseCase, "getArsenalBannersUseCase");
        Intrinsics.checkNotNullParameter(getArsenalTopBannersUseCase, "getArsenalTopBannersUseCase");
        Intrinsics.checkNotNullParameter(getLuckyCartGameBannerUseCase, "getLuckyCartGameBannerUseCase");
        Intrinsics.checkNotNullParameter(getStickersContentUseCase, "getStickersContentUseCase");
        Intrinsics.checkNotNullParameter(aVar3, "luckyCartAnalyticsHandler");
        Intrinsics.checkNotNullParameter(getCriteoBannerUseCase, "criteoBannerUseCase");
        Intrinsics.checkNotNullParameter(e0Var, "retrieveBasketFromCacheUseCase");
        Intrinsics.checkNotNullParameter(aVar4, "getCategoriesUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(shouldDisplayUserConsentsBackdropUseCase, "shouldDisplayUserConsentsBackdropUseCase");
        Intrinsics.checkNotNullParameter(bVar4, "getRefusedAndMissingConsentsUseCase");
        Intrinsics.checkNotNullParameter(saveConsentCurrentDateUseCase, "saveConsentCurrentDateUseCase");
        Intrinsics.checkNotNullParameter(jVar, "criteoTrackingUseCase");
        Intrinsics.checkNotNullParameter(loadBasketBuilderUseCase, "loadBasketBuilderUseCase");
        Intrinsics.checkNotNullParameter(bVar5, "getSecureTokenUseCase");
        Intrinsics.checkNotNullParameter(getCmsMiniHubBlocksUseCase, "getCmsMiniHubBlocksUseCase");
        Intrinsics.checkNotNullParameter(aVar5, "remoteLogUseCase");
        Intrinsics.checkNotNullParameter(bVar6, "getCatalogActionUseCase");
        Intrinsics.checkNotNullParameter(getArsenalJOBannerUseCase, "getArsenalJOBannerUseCase");
        FetchCouponsUseCase fetchCouponsUseCase3 = fetchCouponsUseCase2;
        this.f64440a = getOfferProductListUseCase2;
        this.f64442b = offerListModelDataMapper2;
        this.f64444c = getOrderOnlineListUseCase2;
        this.f64446d = getOrderOnlineDetailUseCase2;
        this.f64448e = eVar4;
        this.f64450f = aVar6;
        this.f64452g = f0Var2;
        this.f64454h = bVar7;
        this.f64456i = getCmsCarouselsUseCase2;
        this.f64458j = getCmsOffersUseCase;
        this.f64460k = getGazStationsCampaignUseCase;
        this.f64462l = eVar2;
        this.f64464m = fetchCouponsUseCase;
        this.f64466n = getLoyaltyBalanceUseCase;
        this.f64468o = loginRepository;
        this.f64470p = bVar2;
        this.f64472q = accountRepository;
        this.f64474r = lVar;
        this.f64476s = rVar;
        this.f64478t = pVar;
        this.f64480u = aVar2;
        this.f64482v = nVar;
        this.f64484w = loyaltyPreferencesStorage;
        this.f64486x = cVar;
        this.f64488y = eVar3;
        this.f64490z = dVar;
        this.f64412A = bVar3;
        this.f64414B = appPreferencesStorage;
        this.f64416C = scanPreferencesStorage;
        this.f64417D = homeAnalyticsViewModel;
        this.f64418E = luckyCartGetLuckyCartBannerDetailsUseCase;
        this.f64419F = getArsenalBannersUseCase;
        this.f64420G = getArsenalTopBannersUseCase;
        this.f64421H = getLuckyCartGameBannerUseCase;
        this.f64422I = getStickersContentUseCase;
        this.f64423J = aVar3;
        this.f64424K = getCriteoBannerUseCase;
        this.f64425L = e0Var;
        this.f64426M = aVar4;
        this.f64427N = kVar;
        this.f64428O = shouldDisplayUserConsentsBackdropUseCase;
        this.f64429P = bVar4;
        this.f64430Q = saveConsentCurrentDateUseCase;
        this.f64431R = jVar;
        this.f64432S = loadBasketBuilderUseCase;
        this.f64433T = bVar5;
        this.f64434U = getCmsMiniHubBlocksUseCase;
        this.f64435V = aVar5;
        this.f64436W = bVar6;
        this.f64437X = getArsenalJOBannerUseCase;
        C11940j<C26501g> a = C11953v.m47628a(C26501g.C26504c.f64777a);
        this.f64438Y = a;
        this.f64439Z = C11909g.m47470m(a);
        C11940j<C26497f> a2 = C11953v.m47628a(C26497f.C26500c.f64771a);
        this.f64441a0 = a2;
        this.f64443b0 = C11909g.m47470m(a2);
        C11940j<C26487c> a3 = C11953v.m47628a(C26487c.C26490c.f64756a);
        this.f64445c0 = a3;
        this.f64447d0 = C11909g.m47470m(a3);
        C11940j<C26505h> a4 = C11953v.m47628a(C26505h.C26508c.f64785a);
        this.f64449e0 = a4;
        this.f64451f0 = C11909g.m47470m(a4);
        C11940j<C26491d> a5 = C11953v.m47628a(C26491d.C26493b.f64760a);
        this.f64453g0 = a5;
        this.f64455h0 = C11909g.m47470m(a5);
        C11940j<C26494e> a6 = C11953v.m47628a(C26494e.C26496b.f64765a);
        this.f64457i0 = a6;
        this.f64459j0 = C11909g.m47470m(a6);
        C11940j<C26509i> a7 = C11953v.m47628a(C26509i.C26511b.f64789a);
        this.f64461k0 = a7;
        this.f64463l0 = C11909g.m47470m(a7);
        C26481a.C26483b bVar9 = C26481a.C26483b.f64746a;
        C11940j<C26481a> a8 = C11953v.m47628a(bVar9);
        this.f64465m0 = a8;
        this.f64467n0 = C11909g.m47470m(a8);
        C11940j<C26481a> a9 = C11953v.m47628a(bVar9);
        this.f64469o0 = a9;
        this.f64471p0 = C11909g.m47470m(a9);
        C11940j<C26484b> a10 = C11953v.m47628a(C26484b.C26486b.f64750a);
        this.f64473q0 = a10;
        this.f64475r0 = C11909g.m47470m(a10);
        Service.Drive drive = Service.Drive.f92319a;
        ActiveState.Steady steady = ActiveState.Steady.f92086a;
        Map<Service, ActiveState.Steady> W = C10977s0.m41456W(C11078d1.m42659a(drive, steady), C11078d1.m42659a(Service.Clcv.f92317a, steady), C11078d1.m42659a(Service.H1h3.f92321a, steady), C11078d1.m42659a(Service.PhysicalStore.f92323a, steady));
        this.f64477s0 = W;
        C11940j<Map<Service, ActiveState>> a11 = C11953v.m47628a(W);
        this.f64479t0 = a11;
        this.f64481u0 = C11909g.m47470m(a11);
        C11940j<C37020p> a12 = C11953v.m47628a(C37020p.C37022b.f92538a);
        this.f64483v0 = a12;
        this.f64485w0 = C11909g.m47470m(a12);
        C11744g<C26385a> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f64487x0 = d;
        this.f64489y0 = C11909g.m47490s1(d);
        C11940j<Integer> a13 = C11953v.m47628a(0);
        this.f64491z0 = a13;
        this.f64413A0 = C11909g.m47470m(a13);
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new C263751(this, (C11045c<? super C263751>) null), 3, (Object) null);
    }

    /* renamed from: U1 */
    public static /* synthetic */ Object m112594U1(HomePageViewModel homePageViewModel, OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel, List list, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            ordersOnlineDetailsHeaderModel = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return homePageViewModel.mo76749T1(ordersOnlineDetailsHeaderModel, list, cVar);
    }

    @C12579k
    /* renamed from: A1 */
    public final C11907e<C26385a> mo76730A1() {
        return this.f64489y0;
    }

    @C12579k
    /* renamed from: B1 */
    public final C11952u<C26491d> mo76731B1() {
        return this.f64455h0;
    }

    @C12579k
    /* renamed from: C1 */
    public final C11952u<C26494e> mo76732C1() {
        return this.f64459j0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: D1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76733D1(java.lang.String r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$getJOBannerData$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$getJOBannerData$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$getJOBannerData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$getJOBannerData$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$getJOBannerData$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0051
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase r6 = r4.f64437X
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$a
            r2.<init>(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m172940invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r5 = r4
        L_0x0051:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r6)
            if (r0 != 0) goto L_0x006d
            com.carrefour.fid.android.domain.models.ArsenalJOBanner r6 = (com.carrefour.fid.android.domain.models.ArsenalJOBanner) r6
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r0 = r5.f64417D
            java.lang.String r1 = r6.getOpCode()
            r0.mo76685F(r1)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.b> r5 = r5.f64473q0
            com.carrefour.fid.android.presentation.viewmodels.home.state.b$a r0 = new com.carrefour.fid.android.presentation.viewmodels.home.state.b$a
            r0.<init>(r6)
            r5.setValue(r0)
            goto L_0x0087
        L_0x006d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "error is: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Banner"
            int r5 = android.util.Log.e(r6, r5)
            kotlin.coroutines.jvm.internal.C11064a.m42620f(r5)
        L_0x0087:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76733D1(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: E1 */
    public final C11952u<C26497f> mo76734E1() {
        return this.f64443b0;
    }

    @C12579k
    /* renamed from: F1 */
    public final C11952u<C26501g> mo76735F1() {
        return this.f64439Z;
    }

    @C12579k
    /* renamed from: G1 */
    public final LoyaltyCardType mo76736G1(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        return LoyaltyCardType.f89888a.mo108568a(LoyaltyUtils.INSTANCE.getTypeCard(str));
    }

    @C12579k
    /* renamed from: H1 */
    public final C11952u<Map<Service, ActiveState>> mo76737H1() {
        return this.f64481u0;
    }

    @C12579k
    /* renamed from: I1 */
    public final C11952u<C37020p> mo76738I1() {
        return this.f64485w0;
    }

    @C12579k
    /* renamed from: J1 */
    public final C11952u<C26505h> mo76739J1() {
        return this.f64451f0;
    }

    /* renamed from: K1 */
    public final C38163l mo76740K1() {
        C38162k value = this.f64415B0.getValue();
        if (value != null) {
            return value.mo119352e();
        }
        return null;
    }

    @C12579k
    /* renamed from: L1 */
    public final C11952u<C26481a> mo76741L1() {
        return this.f64467n0;
    }

    @C12579k
    /* renamed from: M1 */
    public final C11952u<C26509i> mo76742M1() {
        return this.f64463l0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: N1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76743N1(com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26421i r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleArsenalClick$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleArsenalClick$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleArsenalClick$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleArsenalClick$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleArsenalClick$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r8 = r0.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r0.L$2
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$i r2 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26421i) r2
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x009f
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0042:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$i r8 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26421i) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x007d
        L_0x0054:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r9 = r7.f64417D
            java.lang.String r2 = r8.mo76874g()
            r9.mo76684E(r2)
            com.carrefour.fid.android.domain.interactors.utilities.b r9 = r7.f64433T
            com.carrefour.fid.android.domain.interactors.utilities.b$a r2 = new com.carrefour.fid.android.domain.interactors.utilities.b$a
            com.carrefour.fid.android.account.data.repositories.LoginRepository r5 = r7.f64468o
            java.lang.String r5 = r5.mo31350b()
            java.lang.String r6 = "ARSENAL"
            r2.<init>(r5, r6)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m172966invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x007c
            return r1
        L_0x007c:
            r2 = r7
        L_0x007d:
            boolean r4 = kotlin.Result.m38710j(r9)
            if (r4 == 0) goto L_0x00b1
            r4 = r9
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r8.mo76873f()
            r0.L$0 = r2
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r4
            r0.label = r3
            java.lang.Object r0 = r2.mo76767e2(r4, r5, r0)
            if (r0 != r1) goto L_0x009b
            return r1
        L_0x009b:
            r1 = r9
            r0 = r2
            r2 = r8
            r8 = r4
        L_0x009f:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$c r9 = new com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$c
            java.lang.String r3 = r2.mo76873f()
            java.lang.String r2 = r2.mo76875h()
            r9.<init>(r3, r2, r8)
            r0.emitEvent(r9)
            r2 = r0
            r9 = r1
        L_0x00b1:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r9)
            if (r8 == 0) goto L_0x00bc
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$f r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26439b.C26445f.f64678a
            r2.emitEvent(r8)
        L_0x00bc:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76743N1(com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$i, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: O1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76744O1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleCatalogClick$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleCatalogClick$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleCatalogClick$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleCatalogClick$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleCatalogClick$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0051
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r5 = r4.f64417D
            r5.mo76702j()
            com.carrefour.fid.android.domain.interactors.catalog.b r5 = r4.f64436W
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r4
        L_0x0051:
            boolean r1 = kotlin.Result.m38710j(r5)
            if (r1 == 0) goto L_0x0075
            com.carrefour.fid.android.domain.models.catalog.a r5 = (com.carrefour.fid.android.domain.models.catalog.C37976a) r5
            boolean r1 = r5 instanceof com.carrefour.fid.android.domain.models.catalog.C37979d
            if (r1 == 0) goto L_0x0063
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$d r5 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26439b.C26443d.f64674a
            r0.emitEvent(r5)
            goto L_0x0075
        L_0x0063:
            boolean r1 = r5 instanceof com.carrefour.fid.android.domain.models.catalog.C37986e
            if (r1 == 0) goto L_0x0075
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$e r1 = new com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$e
            com.carrefour.fid.android.domain.models.catalog.e r5 = (com.carrefour.fid.android.domain.models.catalog.C37986e) r5
            java.lang.String r5 = r5.mo117204d()
            r1.<init>(r5)
            r0.emitEvent(r1)
        L_0x0075:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76744O1(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: P1 */
    public final void mo76745P1() {
        this.f64417D.mo76704l();
    }

    /* renamed from: Q1 */
    public final void mo76746Q1() {
        this.f64417D.mo76705m();
        emitEvent(new C26406a.C26439b.C26441b(mo76765d2()));
    }

    /* renamed from: R1 */
    public final void mo76747R1(boolean z) {
        if (z) {
            this.f64417D.mo76713u();
        } else {
            this.f64417D.mo76703k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: S1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76748S1(com.carrefour.fid.android.domain.models.BasketDomain r24, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleFetchBasketSuccess$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleFetchBasketSuccess$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleFetchBasketSuccess$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleFetchBasketSuccess$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleFetchBasketSuccess$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 0
            r6 = 2
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x0057
            if (r4 == r8) goto L_0x0045
            if (r4 != r6) goto L_0x003d
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00f6
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            java.lang.Object r4 = r2.L$2
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r9 = r2.L$1
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r9 = (com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase) r9
            java.lang.Object r10 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r10 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r10
            kotlin.C11661u0.m45747n(r1)
        L_0x0054:
            r12 = r4
            goto L_0x00d6
        L_0x0057:
            kotlin.C11661u0.m45747n(r1)
            java.util.List r1 = r24.mo115459B()
            if (r1 == 0) goto L_0x0089
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x006b:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x008a
            java.lang.Object r9 = r1.next()
            com.carrefour.fid.android.domain.models.BasketOfferDomain r9 = (com.carrefour.fid.android.domain.models.BasketOfferDomain) r9
            com.carrefour.fid.android.domain.models.ProductDomain r9 = r9.mo115540A()
            if (r9 == 0) goto L_0x0082
            java.lang.String r9 = r9.mo116544s()
            goto L_0x0083
        L_0x0082:
            r9 = r7
        L_0x0083:
            if (r9 == 0) goto L_0x006b
            r4.add(r9)
            goto L_0x006b
        L_0x0089:
            r4 = r7
        L_0x008a:
            if (r4 == 0) goto L_0x0095
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r1 = r5
            goto L_0x0096
        L_0x0095:
            r1 = r8
        L_0x0096:
            if (r1 == 0) goto L_0x00c2
            com.carrefour.fid.android.shared.base.u$d r1 = r23.getCurrentState()
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r2 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r2
            r3 = 0
            r4 = 0
            r5 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c$b r6 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26456c.C26458b.f64713a
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 65527(0xfff7, float:9.1823E-41)
            r20 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.publishState(r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00c2:
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r9 = r0.f64440a
            r2.L$0 = r0
            r2.L$1 = r9
            r2.L$2 = r4
            r2.label = r8
            java.lang.Object r1 = r0.mo76756Z0(r2)
            if (r1 != r3) goto L_0x00d3
            return r3
        L_0x00d3:
            r10 = r0
            goto L_0x0054
        L_0x00d6:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r13 = r1.booleanValue()
            r14 = 0
            r15 = 4
            r16 = 0
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a r1 = new com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r2.L$0 = r10
            r2.L$1 = r7
            r2.L$2 = r7
            r2.label = r6
            java.lang.Object r1 = r9.m172988invokegIAlus(r1, r2)
            if (r1 != r3) goto L_0x00f5
            return r3
        L_0x00f5:
            r2 = r10
        L_0x00f6:
            boolean r3 = kotlin.Result.m38710j(r1)
            if (r3 == 0) goto L_0x0169
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper r4 = r2.f64442b
            com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper$AvailableType r6 = com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper.AvailableType.DEFAULT
            com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper$UnavailableType r7 = com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper.UnavailableType.DEFAULT
            java.util.List r3 = r4.mo122117a(r3, r6, r7)
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x0113
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0114
        L_0x0113:
            r5 = r8
        L_0x0114:
            if (r5 == 0) goto L_0x0140
            com.carrefour.fid.android.shared.base.u$d r3 = r2.getCurrentState()
            r4 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r4 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r4
            r5 = 0
            r6 = 0
            r7 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c$b r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26456c.C26458b.f64713a
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 65527(0xfff7, float:9.1823E-41)
            r22 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.publishState(r3)
            goto L_0x0169
        L_0x0140:
            com.carrefour.fid.android.shared.base.u$d r3 = r2.getCurrentState()
            r4 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r4 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r4
            r5 = 0
            r6 = 0
            r7 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c$b r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26456c.C26458b.f64713a
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 65527(0xfff7, float:9.1823E-41)
            r22 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.publishState(r3)
        L_0x0169:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x01a6
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x0179
            java.lang.String r1 = ""
        L_0x0179:
            r4 = r1
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r3, r4, r5, r6, r7, r8)
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r3 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r3
            r4 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c$b r7 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26456c.C26458b.f64713a
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 65527(0xfff7, float:9.1823E-41)
            r21 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.publishState(r1)
        L_0x01a6:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76748S1(com.carrefour.fid.android.domain.models.BasketDomain, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [com.carrefour.fid.android.shared.base.u$d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: T1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76749T1(com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel r37, java.util.List<com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel> r38, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r39) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            boolean r4 = r3 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleFetchOrderListSuccess$1
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleFetchOrderListSuccess$1 r4 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleFetchOrderListSuccess$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleFetchOrderListSuccess$1 r4 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleFetchOrderListSuccess$1
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r6 = r4.label
            r7 = 0
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L_0x006e
            if (r6 != r8) goto L_0x0066
            boolean r1 = r4.Z$0
            int r2 = r4.I$0
            java.lang.Object r5 = r4.L$7
            com.carrefour.fid.android.domain.models.service.models.l r5 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r5
            java.lang.Object r6 = r4.L$6
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r10 = r4.L$5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r4.L$4
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r11 = (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r11
            java.lang.Object r12 = r4.L$3
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r4.L$2
            com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel r13 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel) r13
            java.lang.Object r14 = r4.L$1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r14 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r14
            java.lang.Object r4 = r4.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r4
            kotlin.C11661u0.m45747n(r3)
            r19 = r1
            r22 = r5
            r21 = r6
            r20 = r10
            r18 = r11
            r17 = r12
            r16 = r13
            goto L_0x0107
        L_0x0066:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006e:
            kotlin.C11661u0.m45747n(r3)
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r3 = r0.f64417D
            r3.mo76696d(r2)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.service.models.k> r3 = r0.f64415B0
            java.lang.Object r3 = r3.getValue()
            com.carrefour.fid.android.domain.models.service.models.k r3 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r3
            if (r3 == 0) goto L_0x008c
            com.carrefour.fid.android.domain.models.service.models.StoreService r3 = r3.mo119354f()
            if (r3 == 0) goto L_0x008c
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r3 = r3.mo119176T()
            r11 = r3
            goto L_0x008d
        L_0x008c:
            r11 = r9
        L_0x008d:
            com.carrefour.fid.android.shared.base.u$d r3 = r36.getCurrentState()
            r14 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r14 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r14
            if (r1 == 0) goto L_0x009b
            com.carrefour.fid.android.shared.domain.models.order.OrderType r3 = r37.mo73378f()
            goto L_0x009c
        L_0x009b:
            r3 = r9
        L_0x009c:
            com.carrefour.fid.android.shared.domain.models.order.OrderType$Clcv r6 = com.carrefour.fid.android.shared.domain.models.order.OrderType.Clcv.f70280e
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r6)
            if (r1 == 0) goto L_0x00a9
            java.lang.String r6 = r37.mo73362V()
            goto L_0x00aa
        L_0x00a9:
            r6 = r9
        L_0x00aa:
            if (r6 != 0) goto L_0x00ae
            java.lang.String r6 = ""
        L_0x00ae:
            r10 = r6
            if (r1 == 0) goto L_0x00b6
            java.lang.String r6 = r37.mo73362V()
            goto L_0x00b7
        L_0x00b6:
            r6 = r9
        L_0x00b7:
            if (r1 == 0) goto L_0x00be
            java.lang.String r12 = r37.mo73370b0()
            goto L_0x00bf
        L_0x00be:
            r12 = r9
        L_0x00bf:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            java.lang.String r6 = " "
            r13.append(r6)
            r13.append(r12)
            java.lang.String r6 = r13.toString()
            com.carrefour.fid.android.domain.models.service.models.l r12 = r36.mo76740K1()
            com.carrefour.fid.android.account.data.repositories.AccountRepository r13 = r0.f64472q
            r4.L$0 = r0
            r4.L$1 = r14
            r4.L$2 = r1
            r4.L$3 = r2
            r4.L$4 = r11
            r4.L$5 = r10
            r4.L$6 = r6
            r4.L$7 = r12
            r4.I$0 = r7
            r4.Z$0 = r3
            r4.label = r8
            java.lang.Object r4 = r13.mo31329n(r4)
            if (r4 != r5) goto L_0x00f6
            return r5
        L_0x00f6:
            r16 = r1
            r17 = r2
            r19 = r3
            r3 = r4
            r21 = r6
            r2 = r7
            r20 = r10
            r18 = r11
            r22 = r12
            r4 = r0
        L_0x0107:
            r23 = 0
            r1 = 0
            r5 = 0
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            if (r2 == 0) goto L_0x0112
            r7 = r8
        L_0x0112:
            com.carrefour.fid.android.domain.models.account.AccountInfo r3 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r3
            if (r3 == 0) goto L_0x0120
            com.carrefour.fid.android.domain.models.account.Address r2 = com.carrefour.fid.android.account.presentation.models.extension.C13315a.m57643b(r3)
            if (r2 == 0) goto L_0x0120
            java.lang.String r9 = r2.mo116694S()
        L_0x0120:
            r24 = r9
            r26 = 640(0x280, float:8.97E-43)
            r27 = 0
            com.carrefour.fid.android.presentation.models.i r2 = new com.carrefour.fid.android.presentation.models.i
            r25 = 0
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$g$b r3 = new com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$g$b
            r25 = r3
            r3.<init>(r2)
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 65407(0xff7f, float:9.1655E-41)
            r35 = 0
            r17 = r14
            r18 = r12
            r19 = r11
            r20 = r7
            r21 = r10
            r22 = r6
            r23 = r5
            r24 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r4.publishState(r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76749T1(com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: V1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76750V1(com.carrefour.fid.android.domain.models.account.AccountInfo r10, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleLoyaltyCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleLoyaltyCard$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleLoyaltyCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleLoyaltyCard$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleLoyaltyCard$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0060
            if (r2 == r6) goto L_0x0054
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00f2
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.models.account.UserCards r10 = (com.carrefour.fid.android.domain.models.account.UserCards) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00e0
        L_0x0048:
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.models.account.UserCards r10 = (com.carrefour.fid.android.domain.models.account.UserCards) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00b3
        L_0x0054:
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.models.account.AccountInfo r10 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0080
        L_0x0060:
            kotlin.C11661u0.m45747n(r11)
            java.util.List r11 = r10.mo116669w()
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r6
            if (r11 == 0) goto L_0x00fd
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r11 = r9.f64484w
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r6
            java.lang.Object r11 = r11.hasLoyaltyCard(r0)
            if (r11 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r2 = r9
        L_0x0080:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00fe
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r11 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            java.util.List r10 = r10.mo116669w()
            com.carrefour.fid.android.domain.models.account.UserCards r10 = r11.getMostRecentAndSecuredLoyaltyCard(r10)
            if (r10 == 0) goto L_0x00f5
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r6 = r2.f64484w
            java.lang.String r7 = r10.mo116763k()
            java.lang.String r8 = r10.mo116763k()
            int r8 = r11.getTypeCard(r8)
            java.lang.String r11 = r11.buildCardNumberWithPrefix(r7, r8)
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r11 = r6.setLoyaltyCardNumber(r11, r0)
            if (r11 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            java.lang.String r11 = r10.mo116763k()
            java.lang.String r5 = r10.mo116763k()
            com.carrefour.fid.android.core.type.LoyaltyCardType r5 = r2.mo76736G1(r5)
            com.carrefour.fid.android.presentation.models.UserCardModel r6 = new com.carrefour.fid.android.presentation.models.UserCardModel
            r6.<init>(r5, r11)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.g> r11 = r2.f64438Y
            com.carrefour.fid.android.presentation.viewmodels.home.state.g$a r5 = new com.carrefour.fid.android.presentation.viewmodels.home.state.g$a
            r5.<init>(r6)
            r11.setValue(r5)
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r11 = r2.f64417D
            r11.mo76686G()
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r11 = r2.mo76784n1(r10, r0)
            if (r11 != r1) goto L_0x00e0
            return r1
        L_0x00e0:
            java.lang.String r10 = r10.mo116763k()
            r11 = 0
            r0.L$0 = r11
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r10 = r2.mo76733D1(r10, r0)
            if (r10 != r1) goto L_0x00f2
            return r1
        L_0x00f2:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x00f5:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.g> r10 = r2.f64438Y
            com.carrefour.fid.android.presentation.viewmodels.home.state.g$b r11 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g.C26503b.f64775a
            r10.setValue(r11)
            goto L_0x0105
        L_0x00fd:
            r2 = r9
        L_0x00fe:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.g> r10 = r2.f64438Y
            com.carrefour.fid.android.presentation.viewmodels.home.state.g$b r11 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g.C26503b.f64775a
            r10.setValue(r11)
        L_0x0105:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76750V1(com.carrefour.fid.android.domain.models.account.AccountInfo, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: W1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76751W1(java.lang.String r9, java.lang.String r10, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleMyStickersClick$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleMyStickersClick$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleMyStickersClick$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleMyStickersClick$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleMyStickersClick$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r9 = r0.L$4
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.L$3
            java.lang.Object r1 = r0.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r0
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00a2
        L_0x003e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0046:
            java.lang.Object r9 = r0.L$2
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x007f
        L_0x005d:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.domain.interactors.utilities.b r11 = r8.f64433T
            com.carrefour.fid.android.domain.interactors.utilities.b$a r2 = new com.carrefour.fid.android.domain.interactors.utilities.b$a
            com.carrefour.fid.android.account.data.repositories.LoginRepository r5 = r8.f64468o
            java.lang.String r5 = r5.mo31350b()
            java.lang.String r6 = "ARSENAL"
            r2.<init>(r5, r6)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r11 = r11.m172966invokegIAlus(r2, r0)
            if (r11 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r2 = r8
        L_0x007f:
            r7 = r11
            r11 = r10
            r10 = r7
            boolean r4 = kotlin.Result.m38710j(r10)
            if (r4 == 0) goto L_0x00ab
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r11
            r0.L$3 = r10
            r0.L$4 = r4
            r0.label = r3
            java.lang.Object r0 = r2.mo76767e2(r4, r11, r0)
            if (r0 != r1) goto L_0x009e
            return r1
        L_0x009e:
            r1 = r11
            r0 = r2
            r2 = r9
            r9 = r4
        L_0x00a2:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$c r11 = new com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$c
            r11.<init>(r1, r2, r9)
            r0.emitEvent(r11)
            r2 = r0
        L_0x00ab:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r10)
            if (r9 == 0) goto L_0x00b6
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$f r9 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26439b.C26445f.f64678a
            r2.emitEvent(r9)
        L_0x00b6:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76751W1(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76752X0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$checkIfUserConsentsDisplayExpired$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$checkIfUserConsentsDisplayExpired$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$checkIfUserConsentsDisplayExpired$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$checkIfUserConsentsDisplayExpired$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$checkIfUserConsentsDisplayExpired$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0073
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0059
        L_0x0042:
            kotlin.C11661u0.m45747n(r6)
            boolean r6 = r5.mo76785n2()
            if (r6 == 0) goto L_0x0073
            com.carrefour.fid.android.consent.domain.interactors.ShouldDisplayUserConsentsBackdropUseCase r6 = r5.f64428O
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.m172925invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r5
        L_0x0059:
            boolean r4 = kotlin.Result.m38710j(r6)
            if (r4 == 0) goto L_0x0073
            r4 = r6
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0073
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.mo76792u1(r0)
            if (r6 != r1) goto L_0x0073
            return r1
        L_0x0073:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76752X0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: X1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76753X1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handlePreviousSelectedServiceDifferent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handlePreviousSelectedServiceDifferent$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handlePreviousSelectedServiceDifferent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handlePreviousSelectedServiceDifferent$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handlePreviousSelectedServiceDifferent$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003b:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.service.n r7 = r6.f64482v
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m172965invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r6
        L_0x004c:
            boolean r1 = kotlin.Result.m38710j(r7)
            if (r1 == 0) goto L_0x0060
            r1 = r7
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0060
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$g r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26439b.C26446g.f64680a
            r0.emitEvent(r1)
        L_0x0060:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 == 0) goto L_0x0078
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto L_0x0070
            java.lang.String r7 = ""
        L_0x0070:
            r1 = r7
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
        L_0x0078:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76753X1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: Y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76754Y0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$checkSelectedServiceIsOpen$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$checkSelectedServiceIsOpen$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$checkSelectedServiceIsOpen$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$checkSelectedServiceIsOpen$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$checkSelectedServiceIsOpen$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0057
            if (r4 == r6) goto L_0x0049
            if (r4 != r5) goto L_0x0041
            java.lang.Object r3 = r2.L$2
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r3 = (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r3
            java.lang.Object r4 = r2.L$1
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            r1.mo21858l()
            r5 = r3
            r1 = r4
            goto L_0x00a3
        L_0x0041:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0049:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0068
        L_0x0057:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.service.p r1 = r0.f64478t
            r2.L$0 = r0
            r2.label = r6
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x0067
            return r3
        L_0x0067:
            r4 = r0
        L_0x0068:
            boolean r6 = kotlin.Result.m38710j(r1)
            if (r6 == 0) goto L_0x00f6
            r6 = r1
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r7 = r6.mo21846a()
            com.carrefour.fid.android.domain.models.service.models.k r7 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r7
            java.lang.Object r6 = r6.mo21847b()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            com.carrefour.fid.android.domain.models.service.models.StoreService r7 = r7.mo119354f()
            if (r7 == 0) goto L_0x008c
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r7 = r7.mo119176T()
            goto L_0x008d
        L_0x008c:
            r7 = 0
        L_0x008d:
            r10 = r7
            if (r6 != 0) goto L_0x00cb
            com.carrefour.fid.android.domain.interactors.service.a r6 = r4.f64480u
            r2.L$0 = r4
            r2.L$1 = r1
            r2.L$2 = r10
            r2.label = r5
            java.lang.Object r2 = r6.m172965invokeIoAF18A(r2)
            if (r2 != r3) goto L_0x00a1
            return r3
        L_0x00a1:
            r2 = r4
            r5 = r10
        L_0x00a3:
            com.carrefour.fid.android.shared.base.u$d r3 = r2.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r3
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$h$a r12 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26472h.C26473a.f64733a
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 65277(0xfefd, float:9.1473E-41)
            r21 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.publishState(r3)
            r4 = r2
            goto L_0x00f6
        L_0x00cb:
            com.carrefour.fid.android.shared.base.u$d r2 = r4.getCurrentState()
            r8 = r2
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r8 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r8
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$h$c r17 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26472h.C26475c.f64737a
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 65277(0xfefd, float:9.1473E-41)
            r26 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r2 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4.publishState(r2)
        L_0x00f6:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x0126
            com.carrefour.fid.android.shared.base.u$d r1 = r4.getCurrentState()
            r5 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r5 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$h$a r14 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26472h.C26473a.f64733a
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 65279(0xfeff, float:9.1475E-41)
            r23 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.publishState(r1)
        L_0x0126:
            r1 = 0
            r4.mo76779k2(r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76754Y0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: Y1 */
    public final void mo76755Y1() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new HomePageViewModel$handlePullToRefresh$1(this, (C11045c<? super HomePageViewModel$handlePullToRefresh$1>) null), 3, (Object) null);
        C11723c2 unused2 = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new HomePageViewModel$handlePullToRefresh$2(this, (C11045c<? super HomePageViewModel$handlePullToRefresh$2>) null), 3, (Object) null);
        C11723c2 unused3 = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new HomePageViewModel$handlePullToRefresh$3(this, (C11045c<? super HomePageViewModel$handlePullToRefresh$3>) null), 3, (Object) null);
        C11723c2 unused4 = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new HomePageViewModel$handlePullToRefresh$4(this, (C11045c<? super HomePageViewModel$handlePullToRefresh$4>) null), 3, (Object) null);
    }

    /* renamed from: Z0 */
    public final Object mo76756Z0(C11045c<? super Boolean> cVar) {
        return mo76785n2() ? this.f64484w.hasLoyaltyCard(cVar) : C11064a.m42615a(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76757Z1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleSubscribeNewsNotification$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleSubscribeNewsNotification$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleSubscribeNewsNotification$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleSubscribeNewsNotification$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handleSubscribeNewsNotification$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r10)
            goto L_0x008d
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0037:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x007a
        L_0x003f:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0058
        L_0x0047:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r10 = r9.f64414B
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r10 = r10.mo108080c(r0)
            if (r10 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r2 = r9
        L_0x0058:
            com.carrefour.fid.android.core.datastore.a r10 = (com.carrefour.fid.android.core.datastore.C36193a) r10
            int r6 = r10.mo108142u()
            long r7 = r10.mo108118E()
            boolean r6 = r2.mo76773h2(r6, r7)
            if (r6 == 0) goto L_0x0090
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r6 = r2.f64414B
            int r10 = r10.mo108142u()
            int r10 = r10 + r5
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r10 = r6.mo108085h(r10, r0)
            if (r10 != r1) goto L_0x007a
            return r1
        L_0x007a:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$a r10 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26439b.C26440a.f64666a
            r2.emitEvent(r10)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r10 = r2.f64414B
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r10 = r10.mo108082e(r0)
            if (r10 != r1) goto L_0x008d
            return r1
        L_0x008d:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x0090:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76757Z1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo76758a1(java.util.List<com.carrefour.fid.android.domain.models.consent.ConsentOptIn> r7) {
        /*
            r6 = this;
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r0 = r7 instanceof java.util.Collection
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0013
            r3 = r7
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0013
        L_0x0011:
            r3 = r2
            goto L_0x0031
        L_0x0013:
            java.util.Iterator r3 = r7.iterator()
        L_0x0017:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0011
            java.lang.Object r4 = r3.next()
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r4 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r4
            com.carrefour.fid.android.domain.models.consent.ConsentName r4 = r4.mo117326h()
            com.carrefour.fid.android.domain.models.consent.ConsentName r5 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING
            if (r4 != r5) goto L_0x002d
            r4 = r1
            goto L_0x002e
        L_0x002d:
            r4 = r2
        L_0x002e:
            if (r4 == 0) goto L_0x0017
            r3 = r1
        L_0x0031:
            if (r3 != 0) goto L_0x0062
            if (r0 == 0) goto L_0x0040
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0040
        L_0x003e:
            r7 = r2
            goto L_0x005e
        L_0x0040:
            java.util.Iterator r7 = r7.iterator()
        L_0x0044:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r7.next()
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r0 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r0
            com.carrefour.fid.android.domain.models.consent.ConsentName r0 = r0.mo117326h()
            com.carrefour.fid.android.domain.models.consent.ConsentName r3 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING
            if (r0 != r3) goto L_0x005a
            r0 = r1
            goto L_0x005b
        L_0x005a:
            r0 = r2
        L_0x005b:
            if (r0 == 0) goto L_0x0044
            r7 = r1
        L_0x005e:
            if (r7 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76758a1(java.util.List):boolean");
    }

    /* renamed from: a2 */
    public final Object mo76759a2(C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new HomePageViewModel$initialize$2(this, (C11045c<? super HomePageViewModel$initialize$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76760b1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchArsenalGameBottomBanners$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchArsenalGameBottomBanners$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchArsenalGameBottomBanners$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchArsenalGameBottomBanners$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchArsenalGameBottomBanners$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r0
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003b:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalBannersUseCase r9 = r8.f64419F
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.m172939invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r8
        L_0x004c:
            boolean r1 = kotlin.Result.m38710j(r9)
            if (r1 == 0) goto L_0x00b8
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00a7
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0066:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0092
            java.lang.Object r4 = r2.next()
            com.carrefour.fid.android.domain.models.ArsenalGenericBanner r4 = (com.carrefour.fid.android.domain.models.ArsenalGenericBanner) r4
            java.lang.String r5 = r4.getBannerUrl()
            boolean r5 = kotlin.text.C11622t.isBlank(r5)
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x0066
            java.lang.String r5 = r4.getGameUrl()
            boolean r5 = kotlin.text.C11622t.isBlank(r5)
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x0066
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r5 = r0.f64417D
            java.lang.String r4 = r4.getOpCode()
            r5.mo76685F(r4)
            goto L_0x0066
        L_0x0092:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.a> r2 = r0.f64469o0
        L_0x0094:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.state.a r4 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a) r4
            com.carrefour.fid.android.presentation.viewmodels.home.state.a$a r4 = new com.carrefour.fid.android.presentation.viewmodels.home.state.a$a
            r4.<init>(r1)
            boolean r3 = r2.mo24216e(r3, r4)
            if (r3 == 0) goto L_0x0094
            goto L_0x00b8
        L_0x00a7:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.a> r1 = r0.f64469o0
        L_0x00a9:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.carrefour.fid.android.presentation.viewmodels.home.state.a r3 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a) r3
            com.carrefour.fid.android.presentation.viewmodels.home.state.a$b r3 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a.C26483b.f64746a
            boolean r2 = r1.mo24216e(r2, r3)
            if (r2 == 0) goto L_0x00a9
        L_0x00b8:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r9)
            if (r9 == 0) goto L_0x00e1
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.a> r0 = r0.f64469o0
        L_0x00c0:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.state.a r2 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a) r2
            com.carrefour.fid.android.presentation.viewmodels.home.state.a$b r2 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a.C26483b.f64746a
            boolean r1 = r0.mo24216e(r1, r2)
            if (r1 == 0) goto L_0x00c0
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r9 = r9.getMessage()
            if (r9 != 0) goto L_0x00d9
            java.lang.String r9 = ""
        L_0x00d9:
            r3 = r9
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
        L_0x00e1:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76760b1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.mo119354f();
     */
    /* renamed from: b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo76761b2() {
        /*
            r2 = this;
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.service.models.k> r0 = r2.f64415B0
            java.lang.Object r0 = r0.getValue()
            com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0
            if (r0 == 0) goto L_0x0015
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r0.mo119354f()
            if (r0 == 0) goto L_0x0015
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r0 = r0.mo119176T()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Clcv r1 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76761b2():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76762c1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchArsenalGameTopBanners$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchArsenalGameTopBanners$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchArsenalGameTopBanners$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchArsenalGameTopBanners$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchArsenalGameTopBanners$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r0
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003b:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase r9 = r8.f64420G
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.m172941invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r8
        L_0x004c:
            boolean r1 = kotlin.Result.m38710j(r9)
            if (r1 == 0) goto L_0x00b8
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00a7
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0066:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0092
            java.lang.Object r4 = r2.next()
            com.carrefour.fid.android.domain.models.ArsenalGenericBanner r4 = (com.carrefour.fid.android.domain.models.ArsenalGenericBanner) r4
            java.lang.String r5 = r4.getBannerUrl()
            boolean r5 = kotlin.text.C11622t.isBlank(r5)
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x0066
            java.lang.String r5 = r4.getGameUrl()
            boolean r5 = kotlin.text.C11622t.isBlank(r5)
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x0066
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r5 = r0.f64417D
            java.lang.String r4 = r4.getOpCode()
            r5.mo76685F(r4)
            goto L_0x0066
        L_0x0092:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.a> r2 = r0.f64465m0
        L_0x0094:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.state.a r4 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a) r4
            com.carrefour.fid.android.presentation.viewmodels.home.state.a$a r4 = new com.carrefour.fid.android.presentation.viewmodels.home.state.a$a
            r4.<init>(r1)
            boolean r3 = r2.mo24216e(r3, r4)
            if (r3 == 0) goto L_0x0094
            goto L_0x00b8
        L_0x00a7:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.a> r1 = r0.f64465m0
        L_0x00a9:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.carrefour.fid.android.presentation.viewmodels.home.state.a r3 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a) r3
            com.carrefour.fid.android.presentation.viewmodels.home.state.a$b r3 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a.C26483b.f64746a
            boolean r2 = r1.mo24216e(r2, r3)
            if (r2 == 0) goto L_0x00a9
        L_0x00b8:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r9)
            if (r9 == 0) goto L_0x00e1
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.a> r0 = r0.f64465m0
        L_0x00c0:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.state.a r2 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a) r2
            com.carrefour.fid.android.presentation.viewmodels.home.state.a$b r2 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a.C26483b.f64746a
            boolean r1 = r0.mo24216e(r1, r2)
            if (r1 == 0) goto L_0x00c0
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r9 = r9.getMessage()
            if (r9 != 0) goto L_0x00d9
            java.lang.String r9 = ""
        L_0x00d9:
            r3 = r9
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
        L_0x00e1:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76762c1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.mo119354f();
     */
    /* renamed from: c2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo76763c2() {
        /*
            r2 = this;
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.service.models.k> r0 = r2.f64415B0
            java.lang.Object r0 = r0.getValue()
            com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0
            if (r0 == 0) goto L_0x0015
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r0.mo119354f()
            if (r0 == 0) goto L_0x0015
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r0 = r0.mo119176T()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Drive r1 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76763c2():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76764d1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchBasket$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchBasket$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchBasket$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchBasket$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchBasket$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            java.lang.String r5 = ""
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0060
            if (r4 == r8) goto L_0x0051
            if (r4 == r7) goto L_0x0044
            if (r4 != r6) goto L_0x003c
            java.lang.Object r3 = r2.L$1
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0117
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            java.lang.Object r4 = r2.L$1
            java.lang.Object r7 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r7 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r7
            kotlin.C11661u0.m45747n(r1)
            r1 = r4
            r4 = r7
            goto L_0x0108
        L_0x0051:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00e3
        L_0x0060:
            kotlin.C11661u0.m45747n(r1)
            boolean r1 = r28.mo76785n2()
            if (r1 != 0) goto L_0x00a7
            com.carrefour.fid.android.shared.util.i r9 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r1 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r1.<init>()
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x0078
            r10 = r5
            goto L_0x0079
        L_0x0078:
            r10 = r1
        L_0x0079:
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r9, r10, r11, r12, r13, r14)
            com.carrefour.fid.android.shared.base.u$d r1 = r28.getCurrentState()
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r2 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r2
            r3 = 0
            r4 = 0
            r5 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c$a r6 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26456c.C26457a.f64711a
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 65527(0xfff7, float:9.1823E-41)
            r20 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.publishState(r1)
            goto L_0x015a
        L_0x00a7:
            com.carrefour.fid.android.shared.base.u$d r1 = r28.getCurrentState()
            r9 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r9 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r9
            r10 = 0
            r11 = 0
            r12 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c$c r13 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26456c.C26459c.f64715a
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 65527(0xfff7, float:9.1823E-41)
            r27 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.publishState(r1)
            com.carrefour.fid.android.domain.interactors.basket.f0 r1 = r0.f64452g
            r2.L$0 = r0
            r2.label = r8
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x00e2
            return r3
        L_0x00e2:
            r4 = r0
        L_0x00e3:
            boolean r8 = kotlin.Result.m38710j(r1)
            if (r8 == 0) goto L_0x0119
            r8 = r1
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8
            int r9 = r8.mo116819D()
            if (r9 <= 0) goto L_0x00f7
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r9 = r4.f64417D
            r9.mo76716x()
        L_0x00f7:
            com.carrefour.fid.android.domain.models.BasketDomain r8 = com.carrefour.fid.android.domain.extension.C37498a.m153932b(r8)
            r2.L$0 = r4
            r2.L$1 = r1
            r2.label = r7
            java.lang.Object r7 = r4.mo76748S1(r8, r2)
            if (r7 != r3) goto L_0x0108
            return r3
        L_0x0108:
            r2.L$0 = r4
            r2.L$1 = r1
            r2.label = r6
            java.lang.Object r2 = r4.mo76766e1(r2)
            if (r2 != r3) goto L_0x0115
            return r3
        L_0x0115:
            r3 = r1
            r2 = r4
        L_0x0117:
            r4 = r2
            r1 = r3
        L_0x0119:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x015a
            com.carrefour.fid.android.shared.util.i r6 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x0129
            r7 = r5
            goto L_0x012a
        L_0x0129:
            r7 = r1
        L_0x012a:
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r6, r7, r8, r9, r10, r11)
            com.carrefour.fid.android.shared.base.u$d r1 = r4.getCurrentState()
            r5 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r5 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r5
            r6 = 0
            r7 = 0
            r8 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c$a r9 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26456c.C26457a.f64711a
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 65527(0xfff7, float:9.1823E-41)
            r23 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.publishState(r1)
        L_0x015a:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76764d1(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d2 */
    public final boolean mo76765d2() {
        return !mo76763c2() && !mo76761b2();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76766e1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchBasketBuilder$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchBasketBuilder$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchBasketBuilder$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchBasketBuilder$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchBasketBuilder$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003f
            if (r4 != r5) goto L_0x0037
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0057
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r1 = r0.f64454h
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r4 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r6 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.BasketBuilder
            r4.<init>(r6)
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0056
            return r3
        L_0x0056:
            r2 = r0
        L_0x0057:
            boolean r3 = kotlin.Result.m38710j(r1)
            if (r3 == 0) goto L_0x00b9
            r3 = r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0090
            com.carrefour.fid.android.shared.base.u$d r3 = r2.getCurrentState()
            r4 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r4 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$b$a r15 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26453b.C26454a.f64707a
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 64511(0xfbff, float:9.0399E-41)
            r22 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.publishState(r3)
            goto L_0x00b9
        L_0x0090:
            com.carrefour.fid.android.shared.base.u$d r3 = r2.getCurrentState()
            r4 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r4 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$b$b r15 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26453b.C26455b.f64709a
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 64511(0xfbff, float:9.0399E-41)
            r22 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.publishState(r3)
        L_0x00b9:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x00fb
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.shared.io.RemoteConfigThrowable r1 = new com.carrefour.fid.android.shared.io.RemoteConfigThrowable
            r1.<init>()
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x00ce
            java.lang.String r1 = ""
        L_0x00ce:
            r4 = r1
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r3, r4, r5, r6, r7, r8)
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r3 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r3
            r4 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$b$b r14 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26453b.C26455b.f64709a
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 64511(0xfbff, float:9.0399E-41)
            r21 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.publishState(r1)
        L_0x00fb:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76766e1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: e2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76767e2(java.lang.String r27, java.lang.String r28, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r29
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$logSecureTokenForArsenal$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$logSecureTokenForArsenal$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$logSecureTokenForArsenal$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$logSecureTokenForArsenal$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$logSecureTokenForArsenal$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            r1.mo21858l()
            goto L_0x009e
        L_0x0032:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003a:
            kotlin.C11661u0.m45747n(r1)
            r1 = 40
            r4 = r27
            java.lang.String r1 = kotlin.text.StringsKt___StringsKt.takeLast((java.lang.String) r4, (int) r1)
            boolean r4 = kotlin.text.C11622t.isBlank(r1)
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            com.carrefour.fid.android.domain.interactors.logm.a r4 = r0.f64435V
            com.carrefour.fid.android.domain.models.logm.LogMAction r8 = com.carrefour.fid.android.domain.models.logm.LogMAction.ARSENAL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "**"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r21 = r6.toString()
            com.carrefour.fid.android.domain.models.logm.LogMSeverity r16 = com.carrefour.fid.android.domain.models.logm.LogMSeverity.INFO
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "token STS from web service for "
            r1.append(r6)
            r6 = r28
            r1.append(r6)
            java.lang.String r20 = r1.toString()
            com.carrefour.fid.android.domain.models.logm.LogMEntry r1 = new com.carrefour.fid.android.domain.models.logm.LogMEntry
            r6 = r1
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 105981(0x19dfd, float:1.48511E-40)
            r25 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.label = r5
            java.lang.Object r1 = r4.m172966invokegIAlus(r1, r2)
            if (r1 != r3) goto L_0x009e
            return r3
        L_0x009e:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76767e2(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76768f1(kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCmsCarousels$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCmsCarousels$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCmsCarousels$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCmsCarousels$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCmsCarousels$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 10
            r6 = 0
            r7 = 3
            r8 = 2
            java.lang.String r9 = ""
            r10 = 1
            if (r4 == 0) goto L_0x0074
            if (r4 == r10) goto L_0x0066
            if (r4 == r8) goto L_0x004d
            if (r4 != r7) goto L_0x0045
            java.lang.Object r3 = r2.L$1
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x01cc
        L_0x0045:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004d:
            java.lang.Object r4 = r2.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r2.L$1
            java.lang.Object r11 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r11 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r11
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r31 = r11
            r11 = r4
            r4 = r31
            goto L_0x00a9
        L_0x0066:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0085
        L_0x0074:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.service.l r1 = r0.f64474r
            r2.L$0 = r0
            r2.label = r10
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x0084
            return r3
        L_0x0084:
            r4 = r0
        L_0x0085:
            boolean r11 = kotlin.Result.m38710j(r1)
            if (r11 == 0) goto L_0x02a1
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            com.carrefour.fid.android.cms.domain.interactors.GetCmsCarouselsUseCase r12 = r4.f64456i
            com.carrefour.fid.android.cms.domain.interactors.GetCmsCarouselsUseCase$Params r13 = new com.carrefour.fid.android.cms.domain.interactors.GetCmsCarouselsUseCase$Params
            r13.<init>(r11)
            r2.L$0 = r4
            r2.L$1 = r1
            r2.L$2 = r11
            r2.label = r8
            java.lang.Object r8 = r12.m173122invokegIAlus((com.carrefour.fid.android.cms.domain.interactors.GetCmsCarouselsUseCase.Params) r13, (kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.cms.domain.models.SlideFooterCell>>>) r2)
            if (r8 != r3) goto L_0x00a4
            return r3
        L_0x00a4:
            r31 = r8
            r8 = r1
            r1 = r31
        L_0x00a9:
            java.lang.Throwable r12 = kotlin.Result.m38705e(r1)
            if (r12 != 0) goto L_0x016e
            java.util.List r1 = (java.util.List) r1
            r12 = r1
            java.util.Collection r12 = (java.util.Collection) r12
            if (r12 == 0) goto L_0x00bf
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r12 = r6
            goto L_0x00c0
        L_0x00bf:
            r12 = r10
        L_0x00c0:
            if (r12 == 0) goto L_0x0110
            com.carrefour.fid.android.shared.util.i r13 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.shared.io.CarouselsThrowable r1 = new com.carrefour.fid.android.shared.io.CarouselsThrowable
            java.lang.String r12 = "Empty list cms Carousels"
            r1.<init>(r12)
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x00d3
            r14 = r9
            goto L_0x00d4
        L_0x00d3:
            r14 = r1
        L_0x00d4:
            r15 = 0
            r16 = 0
            r17 = 6
            r18 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r13, r14, r15, r16, r17, r18)
            com.carrefour.fid.android.shared.base.u$d r1 = r4.getCurrentState()
            r12 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r12 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r12
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            java.util.List r17 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 65519(0xffef, float:9.1812E-41)
            r30 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4.publishState(r1)
            goto L_0x01b3
        L_0x0110:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r15 = new java.util.ArrayList
            int r12 = kotlin.collections.C10978t.m41495Y(r1, r5)
            r15.<init>(r12)
            java.util.Iterator r1 = r1.iterator()
        L_0x011f:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x0133
            java.lang.Object r12 = r1.next()
            com.carrefour.fid.android.cms.domain.models.SlideFooterCell r12 = (com.carrefour.fid.android.cms.domain.models.SlideFooterCell) r12
            com.carrefour.fid.android.cms.presentation.models.SlideFooterCellModel r12 = com.carrefour.fid.android.cms.presentation.extension.C40027c.m163011a(r12)
            r15.add(r12)
            goto L_0x011f
        L_0x0133:
            com.carrefour.fid.android.shared.base.u$d r1 = r4.getCurrentState()
            r12 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r12 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r12
            r13 = 0
            r14 = 0
            r1 = 0
            r33 = r15
            r15 = r1
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 65519(0xffef, float:9.1812E-41)
            r30 = 0
            r17 = r33
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4.publishState(r1)
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r1 = r4.f64417D
            r12 = r33
            r1.mo76689J(r12)
            goto L_0x01b3
        L_0x016e:
            com.carrefour.fid.android.shared.util.i r13 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r12.getMessage()
            if (r1 != 0) goto L_0x0178
            r14 = r9
            goto L_0x0179
        L_0x0178:
            r14 = r1
        L_0x0179:
            r15 = 0
            r16 = 0
            r17 = 6
            r18 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r13, r14, r15, r16, r17, r18)
            com.carrefour.fid.android.shared.base.u$d r1 = r4.getCurrentState()
            r12 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r12 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r12
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            java.util.List r17 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 65519(0xffef, float:9.1812E-41)
            r30 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4.publishState(r1)
        L_0x01b3:
            com.carrefour.fid.android.cms.domain.interactors.GetCmsOffersUseCase r1 = r4.f64458j
            com.carrefour.fid.android.cms.domain.interactors.GetCmsOffersUseCase$Params r12 = new com.carrefour.fid.android.cms.domain.interactors.GetCmsOffersUseCase$Params
            r12.<init>(r11)
            r2.L$0 = r4
            r2.L$1 = r8
            r11 = 0
            r2.L$2 = r11
            r2.label = r7
            java.lang.Object r1 = r1.m173126invokegIAlus((com.carrefour.fid.android.cms.domain.interactors.GetCmsOffersUseCase.Params) r12, (kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.cms.domain.models.SlideOfferCell>>>) r2)
            if (r1 != r3) goto L_0x01ca
            return r3
        L_0x01ca:
            r2 = r4
            r3 = r8
        L_0x01cc:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r1)
            if (r4 != 0) goto L_0x0265
            java.util.List r1 = (java.util.List) r1
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L_0x01df
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x01e0
        L_0x01df:
            r6 = r10
        L_0x01e0:
            if (r6 == 0) goto L_0x0218
            com.carrefour.fid.android.shared.util.i r7 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r8 = "Empty list cms offers Carousels"
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r7, r8, r9, r10, r11, r12)
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r4 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r4 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 65503(0xffdf, float:9.1789E-41)
            r22 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.publishState(r1)
            goto L_0x02a0
        L_0x0218:
            com.carrefour.fid.android.shared.base.u$d r4 = r2.getCurrentState()
            r6 = r4
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r6 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r6
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r12 = new java.util.ArrayList
            int r4 = kotlin.collections.C10978t.m41495Y(r1, r5)
            r12.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0232:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0246
            java.lang.Object r4 = r1.next()
            com.carrefour.fid.android.cms.domain.models.SlideOfferCell r4 = (com.carrefour.fid.android.cms.domain.models.SlideOfferCell) r4
            com.carrefour.fid.android.cms.presentation.models.SlideOfferCellModel r4 = com.carrefour.fid.android.cms.presentation.extension.C40028d.m163012a(r4)
            r12.add(r4)
            goto L_0x0232
        L_0x0246:
            r9 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 65503(0xffdf, float:9.1789E-41)
            r24 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2.publishState(r1)
            goto L_0x02a0
        L_0x0265:
            com.carrefour.fid.android.shared.util.i r1 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r4 = r4.getMessage()
            if (r4 != 0) goto L_0x026f
            r5 = r9
            goto L_0x0270
        L_0x026f:
            r5 = r4
        L_0x0270:
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r1
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r4, r5, r6, r7, r8, r9)
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r4 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r4 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r4
            r5 = 0
            r8 = 0
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 65503(0xffdf, float:9.1789E-41)
            r22 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.publishState(r1)
        L_0x02a0:
            r1 = r3
        L_0x02a1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76768f1(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: f2 */
    public final C11723c2 mo76769f2() {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new HomePageViewModel$onRequestSlotSelection$1(this, (C11045c<? super HomePageViewModel$onRequestSlotSelection$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76770g1(kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCmsMiniHubBlocks$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCmsMiniHubBlocks$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCmsMiniHubBlocks$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCmsMiniHubBlocks$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCmsMiniHubBlocks$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0052
            if (r4 == r6) goto L_0x0044
            if (r4 != r5) goto L_0x003c
            java.lang.Object r3 = r2.L$1
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0083
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0063
        L_0x0052:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.service.l r1 = r0.f64474r
            r2.L$0 = r0
            r2.label = r6
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x0062
            return r3
        L_0x0062:
            r4 = r0
        L_0x0063:
            boolean r7 = kotlin.Result.m38710j(r1)
            if (r7 == 0) goto L_0x0168
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase r8 = r4.f64434U
            com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase$Params r9 = new com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase$Params
            r9.<init>(r7)
            r2.L$0 = r4
            r2.L$1 = r1
            r2.label = r5
            java.lang.Object r2 = r8.m173124invokegIAlus((com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase.Params) r9, (kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.cms.domain.models.MiniHubBlocks>>>) r2)
            if (r2 != r3) goto L_0x0080
            return r3
        L_0x0080:
            r3 = r1
            r1 = r2
            r2 = r4
        L_0x0083:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r1)
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x012d
            java.util.List r1 = (java.util.List) r1
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L_0x009a
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r6 = 0
        L_0x009a:
            if (r6 == 0) goto L_0x00e0
            com.carrefour.fid.android.shared.util.i r7 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.shared.io.MiniHubBlocksThrowable r1 = new com.carrefour.fid.android.shared.io.MiniHubBlocksThrowable
            java.lang.String r4 = "Empty list cms Mini hub blocks"
            r1.<init>(r4)
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x00ad
            r8 = r5
            goto L_0x00ae
        L_0x00ad:
            r8 = r1
        L_0x00ae:
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r7, r8, r9, r10, r11, r12)
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r4 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r4 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            java.util.List r11 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 65471(0xffbf, float:9.1744E-41)
            r22 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.publishState(r1)
            goto L_0x0167
        L_0x00e0:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r11 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C10978t.m41495Y(r1, r4)
            r11.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x00f1:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0105
            java.lang.Object r4 = r1.next()
            com.carrefour.fid.android.cms.domain.models.MiniHubBlocks r4 = (com.carrefour.fid.android.cms.domain.models.MiniHubBlocks) r4
            com.carrefour.fid.android.cms.presentation.models.MiniHubBlocksModel r4 = com.carrefour.fid.android.cms.presentation.extension.C40026b.m163010a(r4)
            r11.add(r4)
            goto L_0x00f1
        L_0x0105:
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r4 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r4 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 65471(0xffbf, float:9.1744E-41)
            r22 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.publishState(r1)
            goto L_0x0167
        L_0x012d:
            com.carrefour.fid.android.shared.util.i r1 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r4 = r4.getMessage()
            if (r4 != 0) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r5 = r4
        L_0x0137:
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r1
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r4, r5, r6, r7, r8, r9)
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r4 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r4 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r4
            r5 = 0
            r8 = 0
            r10 = 0
            java.util.List r11 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 65471(0xffbf, float:9.1744E-41)
            r22 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.publishState(r1)
        L_0x0167:
            r1 = r3
        L_0x0168:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76770g1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x020c, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0246, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0268, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0288, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02a7, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ef, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0104, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011c, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013e, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0196, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processIntent(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$processIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$processIntent$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$processIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$processIntent$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$processIntent$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x007d;
                case 1: goto L_0x0079;
                case 2: goto L_0x0070;
                case 3: goto L_0x006c;
                case 4: goto L_0x0067;
                case 5: goto L_0x0062;
                case 6: goto L_0x005d;
                case 7: goto L_0x0058;
                case 8: goto L_0x0053;
                case 9: goto L_0x0049;
                case 10: goto L_0x0044;
                case 11: goto L_0x003f;
                case 12: goto L_0x0035;
                case 13: goto L_0x002b;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002b:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            r8.mo21858l()
            goto L_0x02a5
        L_0x0035:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            r8.mo21858l()
            goto L_0x0286
        L_0x003f:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0266
        L_0x0044:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0244
        L_0x0049:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            r8.mo21858l()
            goto L_0x020a
        L_0x0053:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0194
        L_0x0058:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x013c
        L_0x005d:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x011a
        L_0x0062:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0102
        L_0x0067:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x00ed
        L_0x006c:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x00d8
        L_0x0070:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            r8.mo21858l()
            goto L_0x00c3
        L_0x0079:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0092
        L_0x007d:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$d0 r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26415d0.f64615a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0095
            r7 = 1
            r0.label = r7
            java.lang.Object r7 = r6.mo76759a2(r0)
            if (r7 != r1) goto L_0x0092
            return r1
        L_0x0092:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0095:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$p r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26428p.f64643a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x00a2
            r6.mo76746Q1()
            goto L_0x02c3
        L_0x00a2:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$n r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26426n.f64639a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x00af
            r6.mo76745P1()
            goto L_0x02c3
        L_0x00af:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$b r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26410b.f64605a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            r2 = 2
            if (r8 == 0) goto L_0x00c6
            com.carrefour.fid.android.domain.interactors.user.b r7 = r6.f64412A
            r0.label = r2
            java.lang.Object r7 = r7.m172965invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x00c6:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$a r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26408a.f64601a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x00db
            r7 = 3
            r0.label = r7
            java.lang.Object r7 = r6.mo76757Z1(r0)
            if (r7 != r1) goto L_0x00d8
            return r1
        L_0x00d8:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x00db:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$a0 r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26409a0.f64603a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x00f0
            r7 = 4
            r0.label = r7
            java.lang.Object r7 = r6.mo76788q1(r0)
            if (r7 != r1) goto L_0x00ed
            return r1
        L_0x00ed:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x00f0:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$h r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26420h.f64625a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0105
            r7 = 5
            r0.label = r7
            java.lang.Object r7 = r6.mo76789r1(r0)
            if (r7 != r1) goto L_0x0102
            return r1
        L_0x0102:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0105:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$j r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26422j.f64631a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            r3 = 0
            if (r8 == 0) goto L_0x011d
            com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage r7 = r6.f64416C
            r8 = 6
            r0.label = r8
            java.lang.Object r7 = r7.mo82195c(r3, r0)
            if (r7 != r1) goto L_0x011a
            return r1
        L_0x011a:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x011d:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$b0 r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26411b0.f64607a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x012a
            r6.mo76755Y1()
            goto L_0x02c3
        L_0x012a:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$c r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26412c.f64609a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x013f
            r7 = 7
            r0.label = r7
            java.lang.Object r7 = r6.mo76787p1(r0)
            if (r7 != r1) goto L_0x013c
            return r1
        L_0x013c:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x013f:
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26435w
            if (r8 == 0) goto L_0x0154
            com.carrefour.fid.android.presentation.viewmodels.luckycart.a r8 = r6.f64423J
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$w r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26435w) r7
            com.carrefour.fid.android.presentation.models.LuckyCartBannerModel r7 = r7.mo76916d()
            java.lang.String r7 = r7.getQuery()
            r8.mo77369b(r7)
            goto L_0x02c3
        L_0x0154:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$g r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26419g.f64623a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0163
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r7 = r6.f64417D
            r7.mo76698f()
            goto L_0x02c3
        L_0x0163:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$e r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26416e.f64617a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0172
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r7 = r6.f64417D
            r7.mo76691L()
            goto L_0x02c3
        L_0x0172:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$f r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26418f.f64621a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0181
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r7 = r6.f64417D
            r7.mo76692M()
            goto L_0x02c3
        L_0x0181:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$c0 r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26413c0.f64611a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0197
            r7 = 8
            r0.label = r7
            java.lang.Object r7 = r6.mo76744O1(r0)
            if (r7 != r1) goto L_0x0194
            return r1
        L_0x0194:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0197:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$x r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26436x.f64659a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x01a6
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r7 = r6.f64417D
            r7.mo76711s()
            goto L_0x02c3
        L_0x01a6:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$y r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26437y.f64661a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x01b5
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r7 = r6.f64417D
            r7.mo76712t()
            goto L_0x02c3
        L_0x01b5:
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26425m
            if (r8 == 0) goto L_0x01c6
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r8 = r6.f64417D
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$m r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26425m) r7
            int r7 = r7.mo76886d()
            r8.mo76690K(r7)
            goto L_0x02c3
        L_0x01c6:
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26434v
            if (r8 == 0) goto L_0x01d7
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r8 = r6.f64417D
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$v r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26434v) r7
            com.carrefour.fid.android.core.type.LoyaltyCardType r7 = r7.mo76910d()
            r8.mo76706n(r7)
            goto L_0x02c3
        L_0x01d7:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$u r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26433u.f64653a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x01e6
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r7 = r6.f64417D
            r7.mo76709q()
            goto L_0x02c3
        L_0x01e6:
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26431s
            if (r8 == 0) goto L_0x01f5
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$s r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26431s) r7
            boolean r7 = r7.mo76904d()
            r6.mo76747R1(r7)
            goto L_0x02c3
        L_0x01f5:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$o r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26427o.f64641a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x020d
            com.carrefour.fid.android.consent.domain.interactors.SaveConsentCurrentDateUseCase r7 = r6.f64430Q
            r8 = 9
            r0.label = r8
            java.lang.Object r7 = r7.m172924invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x020a
            return r1
        L_0x020a:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x020d:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$t r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26432t.f64651a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x021c
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r7 = r6.f64417D
            r7.mo76714v()
            goto L_0x02c3
        L_0x021c:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$k r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26423k.f64633a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x022b
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r7 = r6.f64417D
            r7.mo76687H()
            goto L_0x02c3
        L_0x022b:
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26438z
            if (r8 == 0) goto L_0x0247
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$z r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26438z) r7
            java.lang.String r8 = r7.mo76923e()
            java.lang.String r7 = r7.mo76925f()
            r2 = 10
            r0.label = r2
            java.lang.Object r7 = r6.mo76751W1(r8, r7, r0)
            if (r7 != r1) goto L_0x0244
            return r1
        L_0x0244:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0247:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$d r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26414d.f64613a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0255
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r7 = r6.f64417D
            r7.mo76701i()
            goto L_0x02c3
        L_0x0255:
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26421i
            if (r8 == 0) goto L_0x0269
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$i r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26421i) r7
            r8 = 11
            r0.label = r8
            java.lang.Object r7 = r6.mo76743N1(r7, r0)
            if (r7 != r1) goto L_0x0266
            return r1
        L_0x0266:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0269:
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26429q
            r4 = 0
            if (r8 == 0) goto L_0x0289
            com.carrefour.fid.android.domain.interactors.criteo.j r8 = r6.f64431R
            com.carrefour.fid.android.domain.interactors.criteo.j$a r5 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$q r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26429q) r7
            java.lang.String r7 = r7.mo76892d()
            r5.<init>(r7, r3, r2, r4)
            r7 = 12
            r0.label = r7
            java.lang.Object r7 = r8.m172966invokegIAlus(r5, r0)
            if (r7 != r1) goto L_0x0286
            return r1
        L_0x0286:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0289:
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26430r
            if (r8 == 0) goto L_0x02a8
            com.carrefour.fid.android.domain.interactors.criteo.j r8 = r6.f64431R
            com.carrefour.fid.android.domain.interactors.criteo.j$a r5 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$r r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26430r) r7
            java.lang.String r7 = r7.mo76898d()
            r5.<init>(r7, r3, r2, r4)
            r7 = 13
            r0.label = r7
            java.lang.Object r7 = r8.m172966invokegIAlus(r5, r0)
            if (r7 != r1) goto L_0x02a5
            return r1
        L_0x02a5:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x02a8:
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26424l
            if (r8 == 0) goto L_0x02b8
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r8 = r6.f64417D
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$l r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26424l) r7
            java.lang.String r7 = r7.mo76880d()
            r8.mo76710r(r7)
            goto L_0x02c3
        L_0x02b8:
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$e0 r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26407a.C26417e0.f64619a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x02c3
            r6.mo76777j2()
        L_0x02c3:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.processIntent(com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76772h1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCouponInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCouponInfo$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCouponInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCouponInfo$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCouponInfo$1
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            java.lang.String r3 = ""
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r6) goto L_0x0054
            if (r2 == r5) goto L_0x0044
            if (r2 != r4) goto L_0x003c
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r0
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x00d6
        L_0x003c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0044:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase r2 = (com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase) r2
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r5
            kotlin.C11661u0.m45747n(r15)
            r13 = r5
            r5 = r2
            r2 = r13
            goto L_0x00c0
        L_0x0054:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0091
        L_0x005c:
            kotlin.C11661u0.m45747n(r15)
            boolean r15 = r14.mo76785n2()
            if (r15 != 0) goto L_0x0085
            com.carrefour.fid.android.shared.util.i r7 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r15 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r15.<init>()
            java.lang.String r15 = r15.getMessage()
            if (r15 != 0) goto L_0x0074
            r8 = r3
            goto L_0x0075
        L_0x0074:
            r8 = r15
        L_0x0075:
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.c> r15 = r14.f64445c0
            com.carrefour.fid.android.presentation.viewmodels.home.state.c$c r0 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c.C26490c.f64756a
            r15.setValue(r0)
            goto L_0x0105
        L_0x0085:
            r0.L$0 = r14
            r0.label = r6
            java.lang.Object r15 = r14.mo76756Z0(r0)
            if (r15 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r2 = r14
        L_0x0091:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x00ac
            com.carrefour.fid.android.shared.util.i r6 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r7 = "Error fetching coupons, No card fid founded"
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.c> r15 = r2.f64445c0
            com.carrefour.fid.android.presentation.viewmodels.home.state.c$c r0 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c.C26490c.f64756a
            r15.setValue(r0)
            goto L_0x0105
        L_0x00ac:
            com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase r15 = r2.f64464m
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r6 = r2.f64484w
            r0.L$0 = r2
            r0.L$1 = r15
            r0.label = r5
            java.lang.Object r5 = r6.getLoyaltyCardNumber(r0)
            if (r5 != r1) goto L_0x00bd
            return r1
        L_0x00bd:
            r13 = r5
            r5 = r15
            r15 = r13
        L_0x00c0:
            java.lang.String r15 = (java.lang.String) r15
            com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase$a r6 = new com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase$a
            r6.<init>(r15)
            r0.L$0 = r2
            r15 = 0
            r0.L$1 = r15
            r0.label = r4
            java.lang.Object r15 = r5.m172950invokegIAlus(r6, r0)
            if (r15 != r1) goto L_0x00d5
            return r1
        L_0x00d5:
            r0 = r2
        L_0x00d6:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r15)
            if (r1 != 0) goto L_0x00e9
            com.carrefour.fid.android.domain.models.c r15 = (com.carrefour.fid.android.domain.models.C37974c) r15
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.c> r0 = r0.f64445c0
            com.carrefour.fid.android.presentation.viewmodels.home.state.c$b r1 = new com.carrefour.fid.android.presentation.viewmodels.home.state.c$b
            r1.<init>(r15)
            r0.setValue(r1)
            goto L_0x0105
        L_0x00e9:
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.core.io.CouponsThrowable r15 = com.carrefour.fid.android.presentation.models.extension.C38469e.m159628a(r1)
            java.lang.String r15 = r15.getMessage()
            if (r15 != 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r3 = r15
        L_0x00f7:
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.c> r15 = r0.f64445c0
            com.carrefour.fid.android.presentation.viewmodels.home.state.c$a r0 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c.C26488a.f64752a
            r15.setValue(r0)
        L_0x0105:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76772h1(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h2 */
    public final boolean mo76773h2(int i, long j) {
        if (!(i == 0)) {
            return i <= 2 && !C28929f.m119636a(Long.valueOf(j), C28539g.f69260r);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011f A[LOOP:2: B:33:0x0119->B:35:0x011f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: i1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76774i1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCriteoBanner$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCriteoBanner$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCriteoBanner$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCriteoBanner$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchCriteoBanner$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            r6 = 2
            if (r4 == 0) goto L_0x005b
            if (r4 == r5) goto L_0x004d
            if (r4 != r6) goto L_0x0045
            java.lang.Object r4 = r2.L$3
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r2.L$2
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r7 = r2.L$1
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r8
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            r1.mo21858l()
            r12 = r6
            goto L_0x00c7
        L_0x0045:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004d:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0095
        L_0x005b:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase r1 = r0.f64424K
            com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$a r4 = new com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$a
            com.carrefour.fid.android.domain.models.criteo.h r15 = new com.carrefour.fid.android.domain.models.criteo.h
            r7 = r15
            com.carrefour.fid.android.domain.models.criteo.CriteoPageType r8 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_HOME
            com.carrefour.fid.android.domain.models.criteo.CriteoEventType r9 = com.carrefour.fid.android.domain.models.criteo.CriteoEventType.EVENT_TYPE_VIEW_HOME
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r6 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 32764(0x7ffc, float:4.5912E-41)
            r24 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.<init>(r6)
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r1.m172963invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0094
            return r3
        L_0x0094:
            r4 = r0
        L_0x0095:
            boolean r5 = kotlin.Result.m38710j(r1)
            if (r5 == 0) goto L_0x0142
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            r6 = r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00aa:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00c0
            java.lang.Object r8 = r6.next()
            com.carrefour.fid.android.domain.models.criteo.a r8 = (com.carrefour.fid.android.domain.models.criteo.C37999a) r8
            java.lang.String r8 = r8.mo117381n()
            if (r8 == 0) goto L_0x00aa
            r7.add(r8)
            goto L_0x00aa
        L_0x00c0:
            java.util.Iterator r6 = r7.iterator()
            r7 = r1
            r8 = r4
            r4 = r6
        L_0x00c7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            com.carrefour.fid.android.domain.interactors.criteo.j r6 = r8.f64431R
            com.carrefour.fid.android.domain.interactors.criteo.j$a r9 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            r10 = 0
            r11 = 0
            r12 = 2
            r9.<init>(r1, r10, r12, r11)
            r2.L$0 = r8
            r2.L$1 = r7
            r2.L$2 = r5
            r2.L$3 = r4
            r2.label = r12
            java.lang.Object r1 = r6.m172966invokegIAlus(r9, r2)
            if (r1 != r3) goto L_0x00c7
            return r3
        L_0x00ee:
            com.carrefour.fid.android.shared.base.u$d r1 = r8.getCurrentState()
            r9 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r9 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r9
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x0119:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x012d
            java.lang.Object r3 = r2.next()
            com.carrefour.fid.android.domain.models.criteo.a r3 = (com.carrefour.fid.android.domain.models.criteo.C37999a) r3
            com.carrefour.fid.android.presentation.models.d r3 = com.carrefour.fid.android.presentation.models.mapper.C38498a.m159741c(r3)
            r1.add(r3)
            goto L_0x0119
        L_0x012d:
            r12 = 0
            r24 = 0
            r25 = 0
            r26 = 57343(0xdfff, float:8.0355E-41)
            r27 = 0
            r23 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r8.publishState(r1)
            r1 = r7
            r4 = r8
        L_0x0142:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x0182
            com.carrefour.fid.android.shared.util.i r5 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x0152
            java.lang.String r1 = ""
        L_0x0152:
            r6 = r1
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r5, r6, r7, r8, r9, r10)
            com.carrefour.fid.android.shared.base.u$d r1 = r4.getCurrentState()
            r5 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r5 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r5
            r6 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.util.List r19 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r20 = 0
            r21 = 0
            r22 = 57343(0xdfff, float:8.0355E-41)
            r23 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.publishState(r1)
        L_0x0182:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76774i1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76775i2(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0035:
            kotlin.C11661u0.m45747n(r14)
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = r13.mo76754Y0(r0)
            if (r14 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r13
        L_0x0044:
            kotlinx.coroutines.o0 r1 = androidx.lifecycle.C19500w0.m90846a(r0)
            r2 = 0
            r3 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$2 r4 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$2
            r14 = 0
            r4.<init>(r0, r14)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.o0 r7 = androidx.lifecycle.C19500w0.m90846a(r0)
            r8 = 0
            r9 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$3 r10 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$3
            r10.<init>(r0, r14)
            r11 = 3
            r12 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.o0 r1 = androidx.lifecycle.C19500w0.m90846a(r0)
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$4 r4 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$4
            r4.<init>(r0, r14)
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.o0 r7 = androidx.lifecycle.C19500w0.m90846a(r0)
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$5 r10 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$5
            r10.<init>(r0, r14)
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.o0 r1 = androidx.lifecycle.C19500w0.m90846a(r0)
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$6 r4 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$6
            r4.<init>(r0, r14)
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.o0 r7 = androidx.lifecycle.C19500w0.m90846a(r0)
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$7 r10 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$7
            r10.<init>(r0, r14)
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.o0 r1 = androidx.lifecycle.C19500w0.m90846a(r0)
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$8 r4 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$8
            r4.<init>(r0, r14)
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.o0 r7 = androidx.lifecycle.C19500w0.m90846a(r0)
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$9 r10 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$9
            r10.<init>(r0, r14)
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.o0 r1 = androidx.lifecycle.C19500w0.m90846a(r0)
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$10 r4 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$10
            r4.<init>(r0, r14)
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r1, r2, r3, r4, r5, r6)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76775i2(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76776j1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchDepartments$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchDepartments$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchDepartments$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchDepartments$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchDepartments$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003f
            if (r4 != r5) goto L_0x0037
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0050
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.category.a r1 = r0.f64426M
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x004f
            return r3
        L_0x004f:
            r2 = r0
        L_0x0050:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r1)
            if (r5 != 0) goto L_0x0083
            r21 = r1
            java.util.List r21 = (java.util.List) r21
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r6 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r6 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r6
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 49151(0xbfff, float:6.8875E-41)
            r24 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2.publishState(r1)
            goto L_0x008d
        L_0x0083:
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r4 = "Cannot fetch Departments"
            r6 = 0
            r7 = 4
            r8 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r3, r4, r5, r6, r7, r8)
        L_0x008d:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76776j1(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: j2 */
    public final void mo76777j2() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new HomePageViewModel$trackScreen$1$1(this, this.f64417D, (C11045c<? super HomePageViewModel$trackScreen$1$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02bc  */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76778k1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r32) {
        /*
            r31 = this;
            r1 = r31
            r0 = r32
            java.lang.String r2 = "null cannot be cast to non-null type java.util.Date"
            boolean r3 = r0 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchFavoriteStore$1
            if (r3 == 0) goto L_0x0019
            r3 = r0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchFavoriteStore$1 r3 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchFavoriteStore$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchFavoriteStore$1 r3 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchFavoriteStore$1
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r5 = r3.label
            r6 = 3
            r7 = 2
            r8 = 1
            java.lang.String r9 = ""
            if (r5 == 0) goto L_0x0076
            if (r5 == r8) goto L_0x0068
            if (r5 == r7) goto L_0x0053
            if (r5 != r6) goto L_0x004b
            java.lang.Object r4 = r3.L$3
            com.carrefour.fid.android.domain.models.service.models.l r4 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r4
            java.lang.Object r5 = r3.L$2
            java.lang.Object r6 = r3.L$1
            java.lang.Object r3 = r3.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r3 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r3
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            r0.mo21858l()
            r10 = r6
            r6 = r5
            goto L_0x00d2
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0053:
            java.lang.Object r5 = r3.L$1
            java.lang.Object r7 = r3.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r7 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r7
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            r30 = r7
            r7 = r5
            r5 = r30
            goto L_0x00b2
        L_0x0068:
            java.lang.Object r5 = r3.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r5
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x0087
        L_0x0076:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.domain.interactors.service.physicalstore.c r0 = r1.f64486x
            r3.L$0 = r1
            r3.label = r8
            java.lang.Object r0 = r0.m172965invokeIoAF18A(r3)
            if (r0 != r4) goto L_0x0086
            return r4
        L_0x0086:
            r5 = r1
        L_0x0087:
            boolean r10 = kotlin.Result.m38710j(r0)
            if (r10 == 0) goto L_0x02b6
            r10 = r0
            com.carrefour.fid.android.domain.models.service.models.l r10 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r10
            if (r10 == 0) goto L_0x026e
            com.carrefour.fid.android.domain.interactors.service.e r11 = r5.f64488y
            java.lang.String r10 = r10.mo119393w()
            java.lang.String r10 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r10)
            com.carrefour.fid.android.domain.models.service.models.a r10 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158071a(r10)
            r3.L$0 = r5
            r3.L$1 = r0
            r3.label = r7
            java.lang.Object r7 = r11.m172966invokegIAlus(r10, r3)
            if (r7 != r4) goto L_0x00ad
            return r4
        L_0x00ad:
            r30 = r7
            r7 = r0
            r0 = r30
        L_0x00b2:
            boolean r10 = kotlin.Result.m38710j(r0)
            if (r10 == 0) goto L_0x020f
            r10 = r0
            com.carrefour.fid.android.domain.models.service.models.l r10 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r10
            com.carrefour.fid.android.domain.interactors.service.physicalstore.d r11 = r5.f64490z
            r3.L$0 = r5
            r3.L$1 = r7
            r3.L$2 = r0
            r3.L$3 = r10
            r3.label = r6
            java.lang.Object r3 = r11.m172966invokegIAlus(r10, r3)
            if (r3 != r4) goto L_0x00ce
            return r4
        L_0x00ce:
            r6 = r0
            r3 = r5
            r4 = r10
            r10 = r7
        L_0x00d2:
            com.carrefour.fid.android.shared.util.ServiceUtil r0 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            com.carrefour.fid.android.domain.models.service.models.b r5 = r0.mo84121c(r4)
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x00f5 }
            com.carrefour.fid.android.shared.util.h$a r0 = com.carrefour.fid.android.shared.util.C28932h.f70914a     // Catch:{ all -> 0x00f5 }
            java.text.SimpleDateFormat r0 = r0.mo84250t()     // Catch:{ all -> 0x00f5 }
            if (r5 == 0) goto L_0x00e8
            java.lang.String r7 = r5.mo119254e()     // Catch:{ all -> 0x00f5 }
            if (r7 != 0) goto L_0x00e9
        L_0x00e8:
            r7 = r9
        L_0x00e9:
            java.util.Date r0 = r0.parse(r7)     // Catch:{ all -> 0x00f5 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x0100
        L_0x00f5:
            r0 = move-exception
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0100:
            boolean r7 = kotlin.Result.m38709i(r0)
            r11 = 0
            if (r7 == 0) goto L_0x0108
            r0 = r11
        L_0x0108:
            r7 = r0
            java.util.Date r7 = (java.util.Date) r7
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0128 }
            com.carrefour.fid.android.shared.util.h$a r0 = com.carrefour.fid.android.shared.util.C28932h.f70914a     // Catch:{ all -> 0x0128 }
            java.text.SimpleDateFormat r0 = r0.mo84250t()     // Catch:{ all -> 0x0128 }
            if (r5 == 0) goto L_0x011b
            java.lang.String r5 = r5.mo119256f()     // Catch:{ all -> 0x0128 }
            if (r5 != 0) goto L_0x011c
        L_0x011b:
            r5 = r9
        L_0x011c:
            java.util.Date r0 = r0.parse(r5)     // Catch:{ all -> 0x0128 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0133
        L_0x0128:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0133:
            boolean r2 = kotlin.Result.m38709i(r0)
            if (r2 == 0) goto L_0x013a
            goto L_0x013b
        L_0x013a:
            r11 = r0
        L_0x013b:
            java.util.Date r11 = (java.util.Date) r11
            com.carrefour.fid.android.design.components.widgets.r1 r2 = new com.carrefour.fid.android.design.components.widgets.r1
            java.lang.String r0 = r4.mo119361E()
            com.carrefour.fid.android.shared.util.ServiceUtil r5 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            boolean r4 = r5.mo84135q(r4)
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            com.carrefour.fid.android.design.components.widgets.s1 r5 = new com.carrefour.fid.android.design.components.widgets.s1
            if (r7 != 0) goto L_0x0156
            java.util.Date r7 = new java.util.Date
            r7.<init>()
        L_0x0156:
            if (r11 != 0) goto L_0x015d
            java.util.Date r11 = new java.util.Date
            r11.<init>()
        L_0x015d:
            r5.<init>(r7, r11)
            r2.<init>(r0, r4, r5)
            com.carrefour.fid.android.design.components.widgets.s1 r0 = r2.mo113984g()
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "HH'h'mm"
            r4.<init>(r5)
            java.lang.Boolean r5 = r2.mo113985h()
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r5 == 0) goto L_0x0191
            if (r0 == 0) goto L_0x0191
            java.util.Date r0 = r0.mo113992e()
            java.lang.String r0 = r4.format(r0)
            com.carrefour.fid.android.design.components.compose.PhysicalStoreInfo$PhysicalStoreOpened r4 = new com.carrefour.fid.android.design.components.compose.PhysicalStoreInfo$PhysicalStoreOpened
            java.lang.String r5 = "closingHour"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r4.<init>(r0)
            goto L_0x01b7
        L_0x0191:
            java.lang.Boolean r5 = r2.mo113985h()
            r7 = 0
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r5 == 0) goto L_0x01b5
            if (r0 == 0) goto L_0x01b5
            java.util.Date r0 = r0.mo113994f()
            java.lang.String r0 = r4.format(r0)
            com.carrefour.fid.android.design.components.compose.PhysicalStoreInfo$PhysicalStoreClosed r4 = new com.carrefour.fid.android.design.components.compose.PhysicalStoreInfo$PhysicalStoreClosed
            java.lang.String r5 = "openingHour"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r4.<init>(r0)
            goto L_0x01b7
        L_0x01b5:
            com.carrefour.fid.android.design.components.compose.PhysicalStoreInfo$NoInfo r4 = com.carrefour.fid.android.design.components.compose.PhysicalStoreInfo.NoInfo.f92304a
        L_0x01b7:
            kotlinx.coroutines.flow.j<java.util.Map<com.carrefour.fid.android.design.components.compose.Service, com.carrefour.fid.android.design.components.compose.ActiveState>> r8 = r3.f64479t0
        L_0x01b9:
            java.lang.Object r0 = r8.getValue()
            r5 = r0
            java.util.Map r5 = (java.util.Map) r5
            java.util.Map r5 = kotlin.collections.C10977s0.m41442J0(r5)
            com.carrefour.fid.android.design.components.compose.Service$PhysicalStore r7 = com.carrefour.fid.android.design.components.compose.Service.PhysicalStore.f92323a
            com.carrefour.fid.android.design.components.compose.ActiveState$ActiveDataStore r11 = new com.carrefour.fid.android.design.components.compose.ActiveState$ActiveDataStore
            java.lang.String r12 = r2.mo113983f()
            r11.<init>(r12, r4)
            r5.put(r7, r11)
            boolean r0 = r8.mo24216e(r0, r5)
            if (r0 == 0) goto L_0x01b9
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$d$b r0 = new com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$d$b
            r21 = r0
            r0.<init>(r2)
            com.carrefour.fid.android.shared.base.u$d r0 = r3.getCurrentState()
            r11 = r0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r11 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r11
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 65023(0xfdff, float:9.1117E-41)
            r29 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r0 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3.publishState(r0)
            r5 = r3
            r0 = r6
            r7 = r10
        L_0x020f:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r0)
            if (r0 == 0) goto L_0x026c
            com.carrefour.fid.android.shared.util.i r10 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x021f
            r11 = r9
            goto L_0x0220
        L_0x021f:
            r11 = r0
        L_0x0220:
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r10, r11, r12, r13, r14, r15)
            com.carrefour.fid.android.shared.base.u$d r0 = r5.getCurrentState()
            r10 = r0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r10 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r10
            r11 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$d$a r20 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26460d.C26461a.f64717a
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 65023(0xfdff, float:9.1117E-41)
            r28 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r0 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r5.publishState(r0)
            kotlinx.coroutines.flow.j<java.util.Map<com.carrefour.fid.android.design.components.compose.Service, com.carrefour.fid.android.design.components.compose.ActiveState>> r0 = r5.f64479t0
        L_0x0254:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            java.util.Map r3 = kotlin.collections.C10977s0.m41442J0(r3)
            com.carrefour.fid.android.design.components.compose.Service$PhysicalStore r4 = com.carrefour.fid.android.design.components.compose.Service.PhysicalStore.f92323a
            com.carrefour.fid.android.design.components.compose.ActiveState$Steady r6 = com.carrefour.fid.android.design.components.compose.ActiveState.Steady.f92086a
            r3.put(r4, r6)
            boolean r2 = r0.mo24216e(r2, r3)
            if (r2 == 0) goto L_0x0254
        L_0x026c:
            r0 = r7
            goto L_0x02b6
        L_0x026e:
            com.carrefour.fid.android.shared.base.u$d r2 = r5.getCurrentState()
            r10 = r2
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r10 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r10
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$d$a r20 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26460d.C26461a.f64717a
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 65023(0xfdff, float:9.1117E-41)
            r28 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r2 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r5.publishState(r2)
            kotlinx.coroutines.flow.j<java.util.Map<com.carrefour.fid.android.design.components.compose.Service, com.carrefour.fid.android.design.components.compose.ActiveState>> r2 = r5.f64479t0
        L_0x029e:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.util.Map r4 = (java.util.Map) r4
            java.util.Map r4 = kotlin.collections.C10977s0.m41442J0(r4)
            com.carrefour.fid.android.design.components.compose.Service$PhysicalStore r6 = com.carrefour.fid.android.design.components.compose.Service.PhysicalStore.f92323a
            com.carrefour.fid.android.design.components.compose.ActiveState$Steady r7 = com.carrefour.fid.android.design.components.compose.ActiveState.Steady.f92086a
            r4.put(r6, r7)
            boolean r3 = r2.mo24216e(r3, r4)
            if (r3 == 0) goto L_0x029e
        L_0x02b6:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r0)
            if (r0 == 0) goto L_0x0310
            com.carrefour.fid.android.shared.util.i r10 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x02c6
            r11 = r9
            goto L_0x02c7
        L_0x02c6:
            r11 = r0
        L_0x02c7:
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r10, r11, r12, r13, r14, r15)
            com.carrefour.fid.android.shared.base.u$d r0 = r5.getCurrentState()
            r6 = r0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r6 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r6
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$d$a r16 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26460d.C26461a.f64717a
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 65023(0xfdff, float:9.1117E-41)
            r24 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r0 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5.publishState(r0)
            kotlinx.coroutines.flow.j<java.util.Map<com.carrefour.fid.android.design.components.compose.Service, com.carrefour.fid.android.design.components.compose.ActiveState>> r0 = r5.f64479t0
        L_0x02f8:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            java.util.Map r3 = kotlin.collections.C10977s0.m41442J0(r3)
            com.carrefour.fid.android.design.components.compose.Service$PhysicalStore r4 = com.carrefour.fid.android.design.components.compose.Service.PhysicalStore.f92323a
            com.carrefour.fid.android.design.components.compose.ActiveState$Steady r5 = com.carrefour.fid.android.design.components.compose.ActiveState.Steady.f92086a
            r3.put(r4, r5)
            boolean r2 = r0.mo24216e(r2, r3)
            if (r2 == 0) goto L_0x02f8
        L_0x0310:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76778k1(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: k2 */
    public final void mo76779k2(float f) {
        this.f64457i0.setValue(new C26494e.C26495a(f, ((C26406a.C26449c) getCurrentState()).mo76959J() instanceof C26406a.C26449c.C26472h.C26475c));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76780l1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchFrequentlyPurchasedProductList$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchFrequentlyPurchasedProductList$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchFrequentlyPurchasedProductList$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchFrequentlyPurchasedProductList$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchFrequentlyPurchasedProductList$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0054
            if (r4 == r6) goto L_0x0043
            if (r4 != r5) goto L_0x003b
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0097
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0043:
            java.lang.Object r4 = r2.L$2
            com.carrefour.fid.android.core.types.RequestType r4 = (com.carrefour.fid.android.core.types.RequestType) r4
            java.lang.Object r6 = r2.L$1
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase r6 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase) r6
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r8
            kotlin.C11661u0.m45747n(r1)
            r11 = r4
            goto L_0x0073
        L_0x0054:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase r1 = r0.f64432S
            com.carrefour.fid.android.core.types.RequestType r4 = com.carrefour.fid.android.core.types.RequestType.ONLINE
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r8 = r0.f64484w
            r2.L$0 = r0
            r2.L$1 = r1
            r2.L$2 = r4
            r2.label = r6
            java.lang.Object r6 = r8.hasLoyaltyCard(r2)
            if (r6 != r3) goto L_0x006c
            return r3
        L_0x006c:
            r8 = r0
            r11 = r4
            r27 = r6
            r6 = r1
            r1 = r27
        L_0x0073:
            r10 = 0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r12 = r1.booleanValue()
            r13 = 1
            r14 = 0
            com.carrefour.fid.android.presentation.models.BasketBuilderParamsModel r1 = new com.carrefour.fid.android.presentation.models.BasketBuilderParamsModel
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$a r4 = new com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$a
            r4.<init>(r1)
            r2.L$0 = r8
            r2.L$1 = r7
            r2.L$2 = r7
            r2.label = r5
            java.lang.Object r1 = r6.m172992invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0096
            return r3
        L_0x0096:
            r2 = r8
        L_0x0097:
            java.lang.Throwable r3 = kotlin.Result.m38705e(r1)
            if (r3 != 0) goto L_0x0133
            com.carrefour.fid.android.domain.models.a r1 = (com.carrefour.fid.android.domain.models.C37940a) r1
            java.util.List r3 = r1.mo116632d()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00d2
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r3 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.util.List r19 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r20 = 32767(0x7fff, float:4.5916E-41)
            r21 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.publishState(r1)
            goto L_0x013e
        L_0x00d2:
            com.carrefour.fid.android.shared.base.u$d r3 = r2.getCurrentState()
            r8 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r8 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r8
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            java.util.List r1 = r1.mo116632d()
            java.util.List r1 = com.carrefour.fid.android.domain.extension.C37507h.m153957i(r1)
            java.util.List r1 = com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159571T(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0106:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0124
            java.lang.Object r4 = r1.next()
            com.carrefour.fid.android.presentation.models.OfferProductModel r4 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r4
            com.carrefour.fid.android.presentation.models.ProductModel r4 = r4.mo121517o0()
            if (r4 == 0) goto L_0x011d
            com.carrefour.fid.android.domain.models.product.Product r4 = com.carrefour.fid.android.presentation.models.extension.C38478n.m159655a(r4)
            goto L_0x011e
        L_0x011d:
            r4 = r7
        L_0x011e:
            if (r4 == 0) goto L_0x0106
            r3.add(r4)
            goto L_0x0106
        L_0x0124:
            r11 = 0
            r25 = 32767(0x7fff, float:4.5916E-41)
            r26 = 0
            r24 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.publishState(r1)
            goto L_0x013e
        L_0x0133:
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r4 = "Cannot fetch frequently purchased products"
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r3, r4, r5, r6, r7, r8)
        L_0x013e:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76780l1(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: l2 */
    public final void mo76781l2(@C12579k C37020p.C37021a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "slotState");
        this.f64483v0.setValue(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76782m1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchGazStationCampaign$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchGazStationCampaign$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchGazStationCampaign$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchGazStationCampaign$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchGazStationCampaign$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r0
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x006b
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003e:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0055
        L_0x0046:
            kotlin.C11661u0.m45747n(r9)
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r8.mo76756Z0(r0)
            if (r9 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r8
        L_0x0055:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x009b
            com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase r9 = r2.f64460k
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r9 = r9.m172969invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r0 = r2
        L_0x006b:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r9)
            if (r1 != 0) goto L_0x0082
            com.carrefour.fid.android.domain.models.CurrentCampaignsDomain r9 = (com.carrefour.fid.android.domain.models.CurrentCampaignsDomain) r9
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.d> r0 = r0.f64453g0
            com.carrefour.fid.android.presentation.viewmodels.home.state.d$a r1 = new com.carrefour.fid.android.presentation.viewmodels.home.state.d$a
            com.carrefour.fid.android.presentation.models.CurrentCampaignsModel r9 = com.carrefour.fid.android.presentation.models.extension.C38471g.m159630a(r9)
            r1.<init>(r9)
            r0.setValue(r1)
            goto L_0x009b
        L_0x0082:
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r9 = r1.getMessage()
            if (r9 != 0) goto L_0x008c
            java.lang.String r9 = ""
        L_0x008c:
            r3 = r9
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.d> r9 = r0.f64453g0
            com.carrefour.fid.android.presentation.viewmodels.home.state.d$b r0 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26491d.C26493b.f64760a
            r9.setValue(r0)
        L_0x009b:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76782m1(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: m2 */
    public final boolean mo76783m2() {
        return mo76785n2() && this.f64470p.mo67144b() > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: n1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76784n1(com.carrefour.fid.android.domain.models.account.UserCards r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLoyaltyBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLoyaltyBalance$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLoyaltyBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLoyaltyBalance$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLoyaltyBalance$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r7 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0055
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase r8 = r6.f64466n
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params r2 = new com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params
            java.lang.String r7 = r7.mo116763k()
            r2.<init>(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r8.m173041invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase.Params) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Double>>) r0)
            if (r8 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r7 = r6
        L_0x0055:
            boolean r0 = kotlin.Result.m38710j(r8)
            if (r0 == 0) goto L_0x006c
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.f> r2 = r7.f64441a0
            com.carrefour.fid.android.presentation.viewmodels.home.state.f$b r3 = new com.carrefour.fid.android.presentation.viewmodels.home.state.f$b
            r3.<init>(r0)
            r2.setValue(r3)
        L_0x006c:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r8)
            if (r8 == 0) goto L_0x009b
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r8.getMessage()
            if (r1 != 0) goto L_0x007c
            java.lang.String r1 = ""
        L_0x007c:
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            boolean r8 = r8 instanceof com.carrefour.fid.android.loyalty.core.p061io.CheckoutNotAcceptedCardFidThrowable
            if (r8 == 0) goto L_0x0094
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.f> r7 = r7.f64441a0
            com.carrefour.fid.android.presentation.viewmodels.home.state.f$b r8 = new com.carrefour.fid.android.presentation.viewmodels.home.state.f$b
            r0 = 0
            r8.<init>(r0)
            r7.setValue(r8)
            goto L_0x009b
        L_0x0094:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.f> r7 = r7.f64441a0
            com.carrefour.fid.android.presentation.viewmodels.home.state.f$a r8 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f.C26498a.f64767a
            r7.setValue(r8)
        L_0x009b:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76784n1(com.carrefour.fid.android.domain.models.account.UserCards, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: n2 */
    public final boolean mo76785n2() {
        return C13181d.m57146e(this.f64468o.mo31354f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76786o1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLuckyCartGameBanner$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLuckyCartGameBanner$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLuckyCartGameBanner$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLuckyCartGameBanner$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLuckyCartGameBanner$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003f
            if (r4 != r5) goto L_0x0037
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0050
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase r1 = r0.f64421H
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r1.m172971invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x004f
            return r3
        L_0x004f:
            r2 = r0
        L_0x0050:
            boolean r3 = kotlin.Result.m38710j(r1)
            if (r3 == 0) goto L_0x008b
            r3 = r1
            com.carrefour.fid.android.domain.models.LuckyCartGameBannerDomain r3 = (com.carrefour.fid.android.domain.models.LuckyCartGameBannerDomain) r3
            com.carrefour.fid.android.shared.base.u$d r4 = r2.getCurrentState()
            r5 = r4
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r5 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$e$a r4 = new com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$e$a
            r18 = r4
            java.lang.String r3 = r3.getGameUrl()
            r4.<init>(r3)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 61439(0xefff, float:8.6094E-41)
            r23 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.publishState(r3)
        L_0x008b:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x00cb
            com.carrefour.fid.android.shared.base.u$d r3 = r2.getCurrentState()
            r4 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r4 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$e$b r17 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26463e.C26465b.f64723a
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 61439(0xefff, float:8.6094E-41)
            r22 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.publishState(r3)
            com.carrefour.fid.android.shared.util.i r4 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x00c3
            java.lang.String r1 = ""
        L_0x00c3:
            r5 = r1
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r4, r5, r6, r7, r8, r9)
        L_0x00cb:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76786o1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76787p1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLuckyCartProductsBanner$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLuckyCartProductsBanner$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLuckyCartProductsBanner$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLuckyCartProductsBanner$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchLuckyCartProductsBanner$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            java.lang.String r5 = ""
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0054
            if (r4 == r7) goto L_0x0046
            if (r4 != r6) goto L_0x003e
            java.lang.Object r3 = r2.L$1
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x009a
        L_0x003e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0065
        L_0x0054:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.service.k r1 = r0.f64427N
            r2.L$0 = r0
            r2.label = r7
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x0064
            return r3
        L_0x0064:
            r4 = r0
        L_0x0065:
            boolean r7 = kotlin.Result.m38710j(r1)
            if (r7 == 0) goto L_0x012a
            r7 = r1
            com.carrefour.fid.android.domain.models.service.models.k r7 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r7
            com.carrefour.fid.android.domain.models.service.models.StoreService r7 = r7.mo119354f()
            if (r7 != 0) goto L_0x0077
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0077:
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase r8 = r4.f64418E
            com.carrefour.fid.android.domain.interactors.luckycart.a$a r9 = new com.carrefour.fid.android.domain.interactors.luckycart.a$a
            com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType r10 = com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType.HOME
            java.lang.String r11 = r7.mo119167K()
            java.lang.String r7 = r7.mo119164H()
            java.lang.String r12 = "banner"
            r9.<init>(r10, r12, r11, r7)
            r2.L$0 = r4
            r2.L$1 = r1
            r2.label = r6
            java.lang.Object r2 = r8.m172973invokegIAlus(r9, r2)
            if (r2 != r3) goto L_0x0097
            return r3
        L_0x0097:
            r3 = r1
            r1 = r2
            r2 = r4
        L_0x009a:
            boolean r4 = kotlin.Result.m38710j(r1)
            if (r4 == 0) goto L_0x00e4
            r4 = r1
            com.carrefour.fid.android.domain.models.luckycart.a r4 = (com.carrefour.fid.android.domain.models.luckycart.C38047a) r4
            com.carrefour.fid.android.presentation.models.LuckyCartBannerModel r6 = com.carrefour.fid.android.presentation.models.mapper.C38502d.m159750a(r4)
            com.carrefour.fid.android.presentation.viewmodels.luckycart.a r7 = r2.f64423J
            java.lang.String r6 = r6.getName()
            r7.mo77370c(r6)
            com.carrefour.fid.android.shared.base.u$d r6 = r2.getCurrentState()
            r7 = r6
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$f$a r6 = new com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$f$a
            r19 = r6
            com.carrefour.fid.android.presentation.models.LuckyCartBannerModel r4 = com.carrefour.fid.android.presentation.models.mapper.C38502d.m159750a(r4)
            r6.<init>(r4)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63487(0xf7ff, float:8.8964E-41)
            r25 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r4 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.publishState(r4)
        L_0x00e4:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r1)
            if (r8 == 0) goto L_0x0128
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r9 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r9 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r9
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$f$b r21 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26466f.C26468b.f64727a
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 63487(0xf7ff, float:8.8964E-41)
            r27 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2.publishState(r1)
            com.carrefour.fid.android.shared.util.i r6 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r8.getMessage()
            if (r1 != 0) goto L_0x0121
            r7 = r5
            goto L_0x0122
        L_0x0121:
            r7 = r1
        L_0x0122:
            r9 = 0
            r10 = 4
            r11 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r6, r7, r8, r9, r10, r11)
        L_0x0128:
            r4 = r2
            r1 = r3
        L_0x012a:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r1)
            if (r8 == 0) goto L_0x016e
            com.carrefour.fid.android.shared.base.u$d r1 = r4.getCurrentState()
            r9 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r9 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r9
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$f$b r21 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26466f.C26468b.f64727a
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 63487(0xf7ff, float:8.8964E-41)
            r27 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r4.publishState(r1)
            com.carrefour.fid.android.shared.util.i r6 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r8.getMessage()
            if (r1 != 0) goto L_0x0167
            r7 = r5
            goto L_0x0168
        L_0x0167:
            r7 = r1
        L_0x0168:
            r9 = 0
            r10 = 4
            r11 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r6, r7, r8, r9, r10, r11)
        L_0x016e:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76787p1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0264, code lost:
        if (r8 != null) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d3, code lost:
        if (r8 != null) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0201 A[LOOP:2: B:101:0x01fb->B:103:0x0201, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0291 A[LOOP:4: B:127:0x028b->B:129:0x0291, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76788q1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchNextAvailableSlot$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchNextAvailableSlot$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchNextAvailableSlot$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchNextAvailableSlot$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchNextAvailableSlot$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            java.lang.String r5 = " - "
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L_0x0075
            if (r4 == r9) goto L_0x0063
            if (r4 == r8) goto L_0x005e
            if (r4 == r7) goto L_0x004d
            if (r4 != r6) goto L_0x0045
            java.lang.Object r3 = r2.L$2
            java.util.Date r3 = (java.util.Date) r3
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.design.components.compose.Service r4 = (com.carrefour.fid.android.design.components.compose.Service) r4
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0240
        L_0x0045:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004d:
            java.lang.Object r3 = r2.L$2
            java.util.Date r3 = (java.util.Date) r3
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.design.components.compose.Service r4 = (com.carrefour.fid.android.design.components.compose.Service) r4
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x01af
        L_0x005e:
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0146
        L_0x0063:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreService r4 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r4
            java.lang.Object r10 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r10 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r10
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x009a
        L_0x0075:
            kotlin.C11661u0.m45747n(r1)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.service.models.k> r1 = r0.f64415B0
            java.lang.Object r1 = r1.getValue()
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r1 == 0) goto L_0x02ac
            com.carrefour.fid.android.domain.models.service.models.StoreService r4 = r1.mo119354f()
            if (r4 != 0) goto L_0x008a
            goto L_0x02ac
        L_0x008a:
            com.carrefour.fid.android.domain.interactors.basket.e0 r1 = r0.f64425L
            r2.L$0 = r0
            r2.L$1 = r4
            r2.label = r9
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x0099
            return r3
        L_0x0099:
            r10 = r0
        L_0x009a:
            boolean r11 = kotlin.Result.m38709i(r1)
            r12 = 0
            if (r11 == 0) goto L_0x00a2
            r1 = r12
        L_0x00a2:
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            if (r1 == 0) goto L_0x00b1
            com.carrefour.fid.android.domain.models.basket.BasketSlot r11 = r1.mo116826K()
            if (r11 == 0) goto L_0x00b1
            com.carrefour.fid.android.domain.models.slot.Slot r11 = com.carrefour.fid.android.domain.models.basket.extension.C37973b.m156174a(r11)
            goto L_0x00b2
        L_0x00b1:
            r11 = r12
        L_0x00b2:
            kotlinx.coroutines.flow.j<java.lang.Integer> r13 = r10.f64491z0
            r14 = 0
            if (r1 == 0) goto L_0x00d8
            java.util.List r15 = r1.mo116817B()
            if (r15 == 0) goto L_0x00d8
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
            r16 = r14
        L_0x00c5:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x00da
            java.lang.Object r17 = r15.next()
            com.carrefour.fid.android.domain.models.offer.Offer r17 = (com.carrefour.fid.android.domain.models.offer.Offer) r17
            int r17 = r17.mo118012U()
            int r16 = r16 + r17
            goto L_0x00c5
        L_0x00d8:
            r16 = r14
        L_0x00da:
            java.lang.Integer r15 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r16)
            r13.setValue(r15)
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r13 = r4.mo119176T()
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Clcv r15 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r15)
            if (r15 == 0) goto L_0x00f0
            com.carrefour.fid.android.design.components.compose.Service$Clcv r13 = com.carrefour.fid.android.design.components.compose.Service.Clcv.f92317a
            goto L_0x010a
        L_0x00f0:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Drive r15 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r15)
            if (r15 == 0) goto L_0x00fb
            com.carrefour.fid.android.design.components.compose.Service$Drive r13 = com.carrefour.fid.android.design.components.compose.Service.Drive.f92319a
            goto L_0x010a
        L_0x00fb:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$H1h3 r15 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.H1h3.INSTANCE
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r15)
            if (r15 == 0) goto L_0x0106
            com.carrefour.fid.android.design.components.compose.Service$H1h3 r13 = com.carrefour.fid.android.design.components.compose.Service.H1h3.f92321a
            goto L_0x010a
        L_0x0106:
            if (r13 != 0) goto L_0x02a6
            com.carrefour.fid.android.design.components.compose.Service$Drive r13 = com.carrefour.fid.android.design.components.compose.Service.Drive.f92319a
        L_0x010a:
            if (r11 == 0) goto L_0x0111
            java.util.Date r15 = com.carrefour.fid.android.presentation.models.extension.C38481p.m159660c(r11)
            goto L_0x0112
        L_0x0111:
            r15 = r12
        L_0x0112:
            if (r1 == 0) goto L_0x0121
            com.carrefour.fid.android.domain.models.basket.BasketSlot r16 = r1.mo116826K()
            if (r16 == 0) goto L_0x0121
            boolean r16 = r16.mo117001l()
            if (r16 != 0) goto L_0x0121
            goto L_0x0122
        L_0x0121:
            r9 = r14
        L_0x0122:
            if (r9 == 0) goto L_0x0149
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.design.components.compose.p> r9 = r10.f64483v0
            java.lang.Object r9 = r9.getValue()
            boolean r9 = r9 instanceof com.carrefour.fid.android.design.components.compose.C37020p.C37021a
            if (r9 == 0) goto L_0x0149
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.design.components.compose.p> r1 = r10.f64483v0
            com.carrefour.fid.android.design.components.compose.p$b r4 = com.carrefour.fid.android.design.components.compose.C37020p.C37022b.f92538a
            r1.setValue(r4)
            kotlinx.coroutines.channels.g<com.carrefour.fid.android.presentation.viewmodels.home.event.a> r1 = r10.f64487x0
            com.carrefour.fid.android.presentation.viewmodels.home.event.a$d r4 = com.carrefour.fid.android.presentation.viewmodels.home.event.C26385a.C26389d.f64533a
            r2.L$0 = r12
            r2.L$1 = r12
            r2.label = r8
            java.lang.Object r1 = r1.mo23757h0(r4, r2)
            if (r1 != r3) goto L_0x0146
            return r3
        L_0x0146:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0149:
            java.lang.String r8 = ""
            if (r15 == 0) goto L_0x0215
            com.carrefour.fid.android.domain.models.basket.BasketSlot r1 = r1.mo116826K()
            boolean r1 = r1.mo117001l()
            if (r1 == 0) goto L_0x0215
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.design.components.compose.p> r1 = r10.f64483v0
            java.lang.Object r1 = r1.getValue()
            boolean r1 = r1 instanceof com.carrefour.fid.android.design.components.compose.C37020p.C37022b
            if (r1 == 0) goto L_0x0215
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r6 = "EEE dd MMM"
            java.util.Locale r9 = java.util.Locale.FRANCE
            r1.<init>(r6, r9)
            java.lang.String r1 = r1.format(r15)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.design.components.compose.p> r6 = r10.f64483v0
            com.carrefour.fid.android.design.components.compose.p$a r9 = new com.carrefour.fid.android.design.components.compose.p$a
            java.lang.String r14 = "dateStart"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r14)
            java.lang.String r11 = com.carrefour.fid.android.presentation.models.extension.C38481p.m159662e(r11)
            r9.<init>(r1, r11)
            r6.setValue(r9)
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r1 = r4.mo119176T()
            boolean r1 = r1 instanceof com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive
            if (r1 == 0) goto L_0x019b
            com.carrefour.fid.android.domain.models.service.models.l r1 = r10.mo76740K1()
            if (r1 == 0) goto L_0x0193
            java.lang.String r12 = r1.mo119361E()
        L_0x0193:
            if (r12 != 0) goto L_0x0197
            r9 = r8
            goto L_0x0198
        L_0x0197:
            r9 = r12
        L_0x0198:
            r7 = r13
            r1 = r15
            goto L_0x01de
        L_0x019b:
            com.carrefour.fid.android.account.data.repositories.AccountRepository r1 = r10.f64472q
            r2.L$0 = r10
            r2.L$1 = r13
            r2.L$2 = r15
            r2.label = r7
            java.lang.Object r1 = r1.mo31329n(r2)
            if (r1 != r3) goto L_0x01ac
            return r3
        L_0x01ac:
            r2 = r10
            r4 = r13
            r3 = r15
        L_0x01af:
            com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
            if (r1 == 0) goto L_0x01d5
            com.carrefour.fid.android.domain.models.account.Address r1 = com.carrefour.fid.android.account.presentation.models.extension.C13315a.m57643b(r1)
            if (r1 == 0) goto L_0x01d5
            java.lang.String r6 = r1.mo116694S()
            java.lang.String r1 = r1.mo116684I()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r5)
            r7.append(r1)
            java.lang.String r8 = r7.toString()
            if (r8 != 0) goto L_0x01da
        L_0x01d5:
            java.lang.String r8 = new java.lang.String
            r8.<init>()
        L_0x01da:
            r10 = r2
            r1 = r3
            r7 = r4
            r9 = r8
        L_0x01de:
            kotlinx.coroutines.flow.j<java.util.Map<com.carrefour.fid.android.design.components.compose.Service, com.carrefour.fid.android.design.components.compose.ActiveState>> r11 = r10.f64479t0
        L_0x01e0:
            java.lang.Object r2 = r11.getValue()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            java.util.Map r3 = kotlin.collections.C10977s0.m41442J0(r3)
            com.carrefour.fid.android.design.components.compose.ActiveState$ActiveData r4 = new com.carrefour.fid.android.design.components.compose.ActiveState$ActiveData
            r4.<init>(r9, r1)
            r3.put(r7, r4)
            java.util.List r4 = com.carrefour.fid.android.design.components.compose.SetServiceComponentKt.m151642r(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x01fb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x020d
            java.lang.Object r5 = r4.next()
            com.carrefour.fid.android.design.components.compose.Service r5 = (com.carrefour.fid.android.design.components.compose.Service) r5
            com.carrefour.fid.android.design.components.compose.ActiveState$Steady r6 = com.carrefour.fid.android.design.components.compose.ActiveState.Steady.f92086a
            r3.put(r5, r6)
            goto L_0x01fb
        L_0x020d:
            boolean r2 = r11.mo24216e(r2, r3)
            if (r2 == 0) goto L_0x01e0
            goto L_0x02a3
        L_0x0215:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r1 = r4.mo119176T()
            boolean r1 = r1 instanceof com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive
            if (r1 == 0) goto L_0x022c
            com.carrefour.fid.android.domain.models.service.models.l r1 = r10.mo76740K1()
            if (r1 == 0) goto L_0x0227
            java.lang.String r12 = r1.mo119361E()
        L_0x0227:
            if (r12 != 0) goto L_0x022a
            goto L_0x026e
        L_0x022a:
            r8 = r12
            goto L_0x026e
        L_0x022c:
            com.carrefour.fid.android.account.data.repositories.AccountRepository r1 = r10.f64472q
            r2.L$0 = r10
            r2.L$1 = r13
            r2.L$2 = r15
            r2.label = r6
            java.lang.Object r1 = r1.mo31329n(r2)
            if (r1 != r3) goto L_0x023d
            return r3
        L_0x023d:
            r2 = r10
            r4 = r13
            r3 = r15
        L_0x0240:
            com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
            if (r1 == 0) goto L_0x0266
            com.carrefour.fid.android.domain.models.account.Address r1 = com.carrefour.fid.android.account.presentation.models.extension.C13315a.m57643b(r1)
            if (r1 == 0) goto L_0x0266
            java.lang.String r6 = r1.mo116694S()
            java.lang.String r1 = r1.mo116684I()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r5)
            r7.append(r1)
            java.lang.String r8 = r7.toString()
            if (r8 != 0) goto L_0x026b
        L_0x0266:
            java.lang.String r8 = new java.lang.String
            r8.<init>()
        L_0x026b:
            r10 = r2
            r15 = r3
            r13 = r4
        L_0x026e:
            kotlinx.coroutines.flow.j<java.util.Map<com.carrefour.fid.android.design.components.compose.Service, com.carrefour.fid.android.design.components.compose.ActiveState>> r1 = r10.f64479t0
        L_0x0270:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            java.util.Map r3 = kotlin.collections.C10977s0.m41442J0(r3)
            com.carrefour.fid.android.design.components.compose.ActiveState$ActiveData r4 = new com.carrefour.fid.android.design.components.compose.ActiveState$ActiveData
            r4.<init>(r8, r15)
            r3.put(r13, r4)
            java.util.List r4 = com.carrefour.fid.android.design.components.compose.SetServiceComponentKt.m151642r(r13)
            java.util.Iterator r4 = r4.iterator()
        L_0x028b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x029d
            java.lang.Object r5 = r4.next()
            com.carrefour.fid.android.design.components.compose.Service r5 = (com.carrefour.fid.android.design.components.compose.Service) r5
            com.carrefour.fid.android.design.components.compose.ActiveState$Steady r6 = com.carrefour.fid.android.design.components.compose.ActiveState.Steady.f92086a
            r3.put(r5, r6)
            goto L_0x028b
        L_0x029d:
            boolean r2 = r1.mo24216e(r2, r3)
            if (r2 == 0) goto L_0x0270
        L_0x02a3:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x02a6:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x02ac:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76788q1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76789r1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchOrderList$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchOrderList$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchOrderList$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchOrderList$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchOrderList$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 0
            r6 = 4
            r7 = 1
            r8 = 3
            r9 = 2
            r10 = 0
            if (r4 == 0) goto L_0x0072
            if (r4 == r7) goto L_0x0064
            if (r4 == r9) goto L_0x0060
            if (r4 == r8) goto L_0x0049
            if (r4 != r6) goto L_0x0041
            java.lang.Object r3 = r2.L$2
            java.lang.Object r4 = r2.L$1
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0139
        L_0x0041:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0049:
            java.lang.Object r4 = r2.L$2
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r7 = r2.L$1
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r8
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r11 = r4
            r4 = r8
            goto L_0x00f4
        L_0x0060:
            kotlin.C11661u0.m45747n(r1)
            goto L_0x00c7
        L_0x0064:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x008e
        L_0x0072:
            kotlin.C11661u0.m45747n(r1)
            boolean r1 = r24.mo76785n2()
            if (r1 == 0) goto L_0x01a0
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase r1 = r0.f64444c
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$a r4 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$a
            r4.<init>(r10, r10, r8, r10)
            r2.L$0 = r0
            r2.label = r7
            java.lang.Object r1 = r1.m172981invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x008d
            return r3
        L_0x008d:
            r4 = r0
        L_0x008e:
            boolean r7 = kotlin.Result.m38710j(r1)
            if (r7 == 0) goto L_0x016f
            r7 = r1
            com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain r7 = (com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain) r7
            com.carrefour.fid.android.presentation.ui.orders.online.mapper.e r11 = r4.f64448e
            java.util.List r12 = r7.getOrders()
            java.util.List r12 = com.carrefour.fid.android.domain.extension.C37511l.m153984b(r12)
            java.util.List r11 = r11.mo83406b(r12)
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r12 = r4.f64417D
            if (r11 == 0) goto L_0x00ae
            int r13 = r11.size()
            goto L_0x00af
        L_0x00ae:
            r13 = r5
        L_0x00af:
            r12.mo76700h(r13)
            java.util.List r7 = r7.getOrders()
            com.carrefour.fid.android.domain.models.OrdersOnlineDomain r7 = com.carrefour.fid.android.domain.extension.C37511l.m153983a(r7)
            if (r7 != 0) goto L_0x00ca
            r2.L$0 = r10
            r2.label = r9
            java.lang.Object r1 = r4.mo76749T1(r10, r11, r2)
            if (r1 != r3) goto L_0x00c7
            return r3
        L_0x00c7:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00ca:
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase r12 = r4.f64446d
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$a r15 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$a
            java.lang.String r14 = r7.getOrderId()
            r7 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 30
            r20 = 0
            r13 = r15
            r6 = r15
            r15 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r2.L$0 = r4
            r2.L$1 = r1
            r2.L$2 = r11
            r2.label = r8
            java.lang.Object r6 = r12.m172980invokegIAlus(r6, r2)
            if (r6 != r3) goto L_0x00f2
            return r3
        L_0x00f2:
            r7 = r1
            r1 = r6
        L_0x00f4:
            boolean r6 = kotlin.Result.m38710j(r1)
            if (r6 == 0) goto L_0x013b
            r6 = r1
            com.carrefour.fid.android.domain.models.r r6 = (com.carrefour.fid.android.domain.models.C38120r) r6
            com.carrefour.fid.android.presentation.ui.orders.online.mapper.a r8 = r4.f64450f
            java.util.List r5 = com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25216a.m108973b(r8, r6, r5, r9, r10)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x010e:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0120
            java.lang.Object r8 = r5.next()
            boolean r9 = r8 instanceof com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel
            if (r9 == 0) goto L_0x010e
            r6.add(r8)
            goto L_0x010e
        L_0x0120:
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r6)
            com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel r5 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel) r5
            r2.L$0 = r4
            r2.L$1 = r7
            r2.L$2 = r1
            r6 = 4
            r2.label = r6
            java.lang.Object r2 = r4.mo76749T1(r5, r11, r2)
            if (r2 != r3) goto L_0x0136
            return r3
        L_0x0136:
            r3 = r1
            r2 = r4
            r4 = r7
        L_0x0139:
            r1 = r3
            goto L_0x013d
        L_0x013b:
            r2 = r4
            r4 = r7
        L_0x013d:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x016d
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r5 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r5 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$g$a r13 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26469g.C26470a.f64729a
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 65407(0xff7f, float:9.1655E-41)
            r23 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.publishState(r1)
        L_0x016d:
            r1 = r4
            r4 = r2
        L_0x016f:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x01c7
            com.carrefour.fid.android.shared.base.u$d r1 = r4.getCurrentState()
            r5 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r5 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$g$a r13 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26469g.C26470a.f64729a
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 65407(0xff7f, float:9.1655E-41)
            r23 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.publishState(r1)
            goto L_0x01c7
        L_0x01a0:
            com.carrefour.fid.android.shared.base.u$d r1 = r24.getCurrentState()
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r2 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$g$a r10 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26469g.C26470a.f64729a
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 65407(0xff7f, float:9.1655E-41)
            r20 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.publishState(r1)
        L_0x01c7:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76789r1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: s1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76790s1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchStickersInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchStickersInfo$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchStickersInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchStickersInfo$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchStickersInfo$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003b:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase r7 = r6.f64422I
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m173010invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r6
        L_0x004c:
            boolean r1 = kotlin.Result.m38710j(r7)
            if (r1 == 0) goto L_0x007d
            r1 = r7
            com.carrefour.fid.android.domain.models.StickersDomain r1 = (com.carrefour.fid.android.domain.models.StickersDomain) r1
            java.lang.String r2 = r1.getStickersUrl()
            boolean r2 = kotlin.text.C11622t.isBlank(r2)
            if (r2 == 0) goto L_0x0067
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.h> r1 = r0.f64449e0
            com.carrefour.fid.android.presentation.viewmodels.home.state.h$b r2 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h.C26507b.f64783a
            r1.setValue(r2)
            goto L_0x007d
        L_0x0067:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.h> r2 = r0.f64449e0
            com.carrefour.fid.android.presentation.viewmodels.home.state.h$a r3 = new com.carrefour.fid.android.presentation.viewmodels.home.state.h$a
            java.lang.String r4 = r1.getTitle()
            java.lang.String r5 = r1.getStickersUrl()
            java.lang.String r1 = r1.getStickersImageUrl()
            r3.<init>(r4, r5, r1)
            r2.setValue(r3)
        L_0x007d:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 == 0) goto L_0x008a
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.h> r7 = r0.f64449e0
            com.carrefour.fid.android.presentation.viewmodels.home.state.h$b r0 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h.C26507b.f64783a
            r7.setValue(r0)
        L_0x008a:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76790s1(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: t1 */
    public final void mo76791t1() {
        publishState(C26406a.C26449c.m112822v((C26406a.C26449c) getCurrentState(), (C26406a.C26449c.C26476i) null, (StoreServiceType) null, mo76783m2(), (C26406a.C26449c.C26456c) null, (List) null, (List) null, (List) null, (C26406a.C26449c.C26469g) null, (C26406a.C26449c.C26472h) null, (C26406a.C26449c.C26460d) null, (C26406a.C26449c.C26453b) null, (C26406a.C26449c.C26466f) null, (C26406a.C26449c.C26463e) null, (List) null, (List) null, (List) null, 65531, (Object) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: u1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76792u1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchUserConsent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchUserConsent$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchUserConsent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchUserConsent$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchUserConsent$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003b:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.consent.b r7 = r6.f64429P
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m172965invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r6
        L_0x004c:
            boolean r1 = kotlin.Result.m38710j(r7)
            if (r1 == 0) goto L_0x0060
            r1 = r7
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r0.mo76758a1(r1)
            if (r1 == 0) goto L_0x0060
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$h r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26439b.C26447h.f64682a
            r0.emitEvent(r1)
        L_0x0060:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 == 0) goto L_0x0078
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto L_0x0070
            java.lang.String r7 = ""
        L_0x0070:
            r1 = r7
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
        L_0x0078:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76792u1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: v1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76793v1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchUserInfo$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchUserInfo$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchUserInfo$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchUserInfo$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$fetchUserInfo$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0047
            if (r4 == r6) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            kotlin.C11661u0.m45747n(r1)
            goto L_0x00f1
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x005a
        L_0x0047:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.user.e r1 = r0.f64462l
            com.carrefour.fid.android.domain.interactors.user.e$a r4 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r2.L$0 = r0
            r2.label = r6
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0059
            return r3
        L_0x0059:
            r4 = r0
        L_0x005a:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r1)
            if (r6 == 0) goto L_0x009a
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.i> r6 = r4.f64461k0
            com.carrefour.fid.android.presentation.viewmodels.home.state.i$b r7 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i.C26511b.f64789a
            r6.setValue(r7)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.g> r6 = r4.f64438Y
            com.carrefour.fid.android.presentation.viewmodels.home.state.g$b r7 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g.C26503b.f64775a
            r6.setValue(r7)
            com.carrefour.fid.android.shared.base.u$d r6 = r4.getCurrentState()
            r7 = r6
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r7
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$i$b r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26476i.C26478b.f64741a
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 65534(0xfffe, float:9.1833E-41)
            r25 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r6 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4.publishState(r6)
        L_0x009a:
            boolean r6 = kotlin.Result.m38710j(r1)
            if (r6 == 0) goto L_0x00f1
            r6 = r1
            com.carrefour.fid.android.domain.models.account.AccountInfo r6 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r6
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.home.state.i> r7 = r4.f64461k0
            com.carrefour.fid.android.presentation.viewmodels.home.state.i$a r8 = new com.carrefour.fid.android.presentation.viewmodels.home.state.i$a
            java.lang.String r9 = r6.mo116664s()
            r8.<init>(r9)
            r7.setValue(r8)
            com.carrefour.fid.android.shared.base.u$d r7 = r4.getCurrentState()
            r8 = r7
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r8 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r8
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$i$a r7 = new com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$i$a
            r9 = r7
            java.lang.String r10 = r6.mo116664s()
            r7.<init>(r10)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 65534(0xfffe, float:9.1833E-41)
            r26 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r7 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.m112822v(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4.publishState(r7)
            r2.L$0 = r1
            r2.label = r5
            java.lang.Object r1 = r4.mo76750V1(r6, r2)
            if (r1 != r3) goto L_0x00f1
            return r3
        L_0x00f1:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel.mo76793v1(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: w1 */
    public final C11952u<C26484b> mo76794w1() {
        return this.f64475r0;
    }

    @C12579k
    /* renamed from: x1 */
    public final C11952u<Integer> mo76795x1() {
        return this.f64413A0;
    }

    @C12579k
    /* renamed from: y1 */
    public final C11952u<C26481a> mo76796y1() {
        return this.f64471p0;
    }

    @C12579k
    /* renamed from: z1 */
    public final C11952u<C26487c> mo76797z1() {
        return this.f64447d0;
    }
}
