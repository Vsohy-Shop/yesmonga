package com.carrefour.fid.android.navigation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v4.media.RatingCompat;
import android.view.View;
import androidx.activity.result.C0302g;
import androidx.annotation.C0329d0;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.graphics.C17616m0;
import androidx.core.p027os.C17779d;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19441m0;
import androidx.lifecycle.C19501x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelLazy;
import androidx.localbroadcastmanager.content.C19552a;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.preference.C19965r;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.account.presentation.p018ui.C13318a;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.databinding.C36648b;
import com.carrefour.fid.android.design.components.widgets.BottomNavigationComponent;
import com.carrefour.fid.android.design.components.widgets.C37189a1;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductReference;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.models.CurrentCampaignsModel;
import com.carrefour.fid.android.presentation.p035ui.gazStation.C24018a;
import com.carrefour.fid.android.presentation.viewmodels.criteo.CriteoTrackingViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.C26380a;
import com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel;
import com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel;
import com.carrefour.fid.android.product.C27455c;
import com.carrefour.fid.android.product.C27457d;
import com.carrefour.fid.android.product.presentation.p039ui.details.C27808i;
import com.carrefour.fid.android.shared.base.C28502s;
import com.carrefour.fid.android.shared.base.C28504t;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.ConnectivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28794a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.presentation.p047ui.webview.C28863a;
import com.carrefour.fid.android.shared.util.C28904b;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener;
import com.carrefour.fid.android.various.core.utils.C22755a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.badge.C31132a;
import com.google.android.play.core.review.C32121c;
import com.google.android.play.core.tasks.C32227d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.C10164b;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002Û\u0001B\t¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u0017\u0010\t\u001a\u00020\b*\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\f\u0010\f\u001a\u00020\b*\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\bH\u0002J\u0012\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001d\u001a\u00020\bH\u0002J\u0012\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002J\u0012\u0010$\u001a\u00020\b2\b\b\u0001\u0010#\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020\bH\u0002J\u001a\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002J\u0010\u0010*\u001a\u00020\b2\u0006\u0010&\u001a\u00020 H\u0002J\u001a\u0010+\u001a\u00020\b2\u0006\u0010&\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002J\u001a\u0010,\u001a\u00020\b2\u0006\u0010&\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002J\u001a\u0010-\u001a\u00020\b2\u0006\u0010&\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002J\u001a\u0010.\u001a\u00020\b2\u0006\u0010&\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002J\u0010\u0010/\u001a\u00020\b2\u0006\u0010&\u001a\u00020 H\u0002J\u0012\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010'H\u0002J\b\u00103\u001a\u00020\bH\u0002J\b\u00104\u001a\u00020\bH\u0002J\b\u00105\u001a\u000201H\u0002J\"\u00107\u001a\u00020\b2\u0006\u0010&\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u00106\u001a\u00020 H\u0002J\u0010\u00108\u001a\u00020\b2\u0006\u0010&\u001a\u00020 H\u0002J\u0010\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u000201H\u0002J\u0010\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H\u0002J\u0012\u0010@\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010>H\u0014J\b\u0010A\u001a\u00020\bH\u0014J\b\u0010B\u001a\u00020\bH\u0014J\b\u0010C\u001a\u00020\bH\u0014J\b\u0010D\u001a\u00020\bH\u0014J\b\u0010E\u001a\u00020\bH\u0014J\b\u0010F\u001a\u00020\bH\u0016J\u0010\u0010G\u001a\u00020\b2\u0006\u00100\u001a\u00020'H\u0014J\b\u0010I\u001a\u00020HH\u0016J\u0010\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u000201H\u0016J\b\u0010L\u001a\u00020\bH\u0016J \u0010M\u001a\u00020\b2\u0006\u00106\u001a\u00020 2\u0006\u0010&\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010'J\u0006\u0010O\u001a\u00020NJ\u0006\u0010P\u001a\u00020\bJ\u000e\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020QJ\u0006\u0010T\u001a\u00020\bJ\u0006\u0010U\u001a\u00020\bJ\u0006\u0010V\u001a\u00020\bJ\u0006\u0010W\u001a\u00020\bJ\u0006\u0010X\u001a\u00020\bJ\u0006\u0010Y\u001a\u00020\bJ\u000e\u0010[\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\u0007J\b\u0010\\\u001a\u00020\bH\u0016J\b\u0010]\u001a\u00020\bH\u0016J\b\u0010^\u001a\u00020 H\u0016R\u0016\u0010a\u001a\u00020H8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010d\u001a\u00020>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010t\u001a\u00020m8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0001\u001a\u00020}8\u0006@\u0006X.¢\u0006\u0016\n\u0004\b~\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010¤\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R*\u0010¬\u0001\u001a\u00030¥\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R!\u0010²\u0001\u001a\u00030­\u00018BX\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R!\u0010·\u0001\u001a\u00030³\u00018BX\u0002¢\u0006\u0010\n\u0006\b´\u0001\u0010¯\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010»\u0001\u001a\u00030¸\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001a\u0010¿\u0001\u001a\u00030¼\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R*\u0010Å\u0001\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\bÀ\u0001\u0010c\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R#\u0010Ë\u0001\u001a\t\u0012\u0004\u0012\u00020'0Æ\u00018\u0006¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0017\u0010Î\u0001\u001a\u00030Ì\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b3\u0010Í\u0001R*\u0010Õ\u0001\u001a\u00030Ï\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R\u0014\u0010Ø\u0001\u001a\u00020 8F¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006Ü\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/navigation/BottomNavActivity;", "Lcom/carrefour/fid/android/app/ui/BaseActivity;", "Lcom/carrefour/fid/android/databinding/b;", "Lcom/carrefour/fid/android/shared/navigation/a;", "Lcom/carrefour/fid/android/design/components/widgets/a1$a;", "Lcom/carrefour/fid/android/shared/util/b;", "Lcom/carrefour/fid/android/shared/base/t;", "", "Lkotlin/d2;", "l2", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroid/net/Uri;", "m2", "url", "o2", "j2", "g2", "O1", "S1", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "catalog", "Q1", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "product", "R1", "N1", "Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "productCategory", "T1", "c2", "ean", "a2", "", "count", "e2", "itemId", "H2", "V1", "resultCode", "Landroid/content/Intent;", "data", "O2", "J2", "N2", "M2", "I2", "L2", "K2", "intent", "", "h2", "w1", "F2", "i2", "requestCode", "E2", "y2", "usabillaEnabled", "f2", "Lcom/carrefour/fid/android/presentation/viewmodels/rating/RatingViewModel$a;", "state", "p2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", "onBackPressed", "onNewIntent", "Landroidx/navigation/NavController;", "k", "isVisible", "t", "j", "d2", "Lcom/carrefour/fid/android/presentation/components/toolbar/ToolBarDefaultView;", "M1", "G2", "Lcom/carrefour/fid/android/presentation/models/CurrentCampaignsModel;", "currentCampaignsModel", "w2", "X1", "W1", "U1", "P1", "Y1", "Z1", "queryId", "b2", "B", "m", "o", "f1", "Landroidx/navigation/NavController;", "_navController", "g1", "Landroid/os/Bundle;", "stationServicesBundle", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "h1", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "G1", "()Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "z2", "(Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;)V", "loginRepository", "Lcom/carrefour/fid/android/presentation/viewmodels/criteo/CriteoTrackingViewModel;", "i1", "Lcom/carrefour/fid/android/presentation/viewmodels/criteo/CriteoTrackingViewModel;", "C1", "()Lcom/carrefour/fid/android/presentation/viewmodels/criteo/CriteoTrackingViewModel;", "u2", "(Lcom/carrefour/fid/android/presentation/viewmodels/criteo/CriteoTrackingViewModel;)V", "criteoViewModel", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "j1", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "H1", "()Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "A2", "(Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;)V", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "k1", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "E1", "()Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "x2", "(Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;)V", "homeAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/home/a;", "l1", "Lcom/carrefour/fid/android/presentation/viewmodels/home/a;", "B1", "()Lcom/carrefour/fid/android/presentation/viewmodels/home/a;", "t2", "(Lcom/carrefour/fid/android/presentation/viewmodels/home/a;)V", "bottomNavAnalyticsViewModel", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "m1", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "y1", "()Lcom/carrefour/fid/android/analytics/data/analytics/a;", "r2", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "analyticManager", "Lcom/carrefour/fid/android/utils/ForegroundBackgroundApplicationListener;", "n1", "Lcom/carrefour/fid/android/utils/ForegroundBackgroundApplicationListener;", "D1", "()Lcom/carrefour/fid/android/utils/ForegroundBackgroundApplicationListener;", "v2", "(Lcom/carrefour/fid/android/utils/ForegroundBackgroundApplicationListener;)V", "foregroundBackgroundApplicationListener", "Lcom/google/android/play/core/review/c;", "o1", "Lcom/google/android/play/core/review/c;", "K1", "()Lcom/google/android/play/core/review/c;", "C2", "(Lcom/google/android/play/core/review/c;)V", "reviewManager", "Lcom/carrefour/fid/android/analytics/data/appflyer/a;", "p1", "Lcom/carrefour/fid/android/analytics/data/appflyer/a;", "z1", "()Lcom/carrefour/fid/android/analytics/data/appflyer/a;", "s2", "(Lcom/carrefour/fid/android/analytics/data/appflyer/a;)V", "appsFlyerTrackingManager", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeViewModel;", "q1", "Lkotlin/z;", "F1", "()Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeViewModel;", "homeViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/rating/RatingViewModel;", "r1", "J1", "()Lcom/carrefour/fid/android/presentation/viewmodels/rating/RatingViewModel;", "ratingViewModel", "Landroid/net/ConnectivityManager$NetworkCallback;", "s1", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Lcom/carrefour/fid/android/design/components/widgets/a1;", "t1", "Lcom/carrefour/fid/android/design/components/widgets/a1;", "ratingDialog", "u1", "L1", "()Landroid/os/Bundle;", "D2", "(Landroid/os/Bundle;)V", "savedStateBundle", "Landroidx/activity/result/g;", "v1", "Landroidx/activity/result/g;", "x1", "()Landroidx/activity/result/g;", "activityResultLauncher", "Landroid/content/BroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "usabillaReceiver", "Lcom/carrefour/fid/android/shared/navigation/c;", "Lcom/carrefour/fid/android/shared/navigation/c;", "I1", "()Lcom/carrefour/fid/android/shared/navigation/c;", "B2", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "A1", "()I", "backStackEntryCount", "<init>", "()V", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBottomNavActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavActivity.kt\ncom/carrefour/fid/android/navigation/BottomNavActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Activity.kt\ncom/carrefour/fid/android/shared/extension/ActivityKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,935:1\n75#2,13:936\n75#2,13:949\n220#3,10:962\n224#3,6:972\n224#3,6:978\n1747#4,3:984\n262#5,2:987\n162#5,8:989\n162#5,8:997\n*S KotlinDebug\n*F\n+ 1 BottomNavActivity.kt\ncom/carrefour/fid/android/navigation/BottomNavActivity\n*L\n155#1:936,13\n157#1:949,13\n201#1:962,10\n209#1:972,6\n233#1:978,6\n550#1:984,3\n583#1:987,2\n587#1:989,8\n612#1:997,8\n*E\n"})
public final class BottomNavActivity extends C38323f<C36648b> implements C28794a, C37189a1.C37190a, C28904b, C28504t {
    @C12579k

    /* renamed from: A1 */
    public static final String f97025A1 = "navigation_id";
    @C12579k

    /* renamed from: B1 */
    public static final String f97026B1 = "additional_redirection";
    @C12579k

    /* renamed from: C1 */
    public static final String f97027C1 = "cookie_dialog";
    @C12579k

    /* renamed from: y1 */
    public static final C38304a f97028y1 = new C38304a((DefaultConstructorMarker) null);

    /* renamed from: z1 */
    public static final int f97029z1 = 8;

    /* renamed from: f1 */
    public NavController f97030f1;
    @C12579k

    /* renamed from: g1 */
    public Bundle f97031g1 = new Bundle();
    @Inject

    /* renamed from: h1 */
    public LoginRepository f97032h1;
    @Inject

    /* renamed from: i1 */
    public CriteoTrackingViewModel f97033i1;
    @Inject

    /* renamed from: j1 */
    public LoyaltyPreferencesStorage f97034j1;
    @Inject

    /* renamed from: k1 */
    public HomeAnalyticsViewModel f97035k1;
    @Inject

    /* renamed from: l1 */
    public C26380a f97036l1;
    @Inject

    /* renamed from: m1 */
    public C13783a f97037m1;
    @Inject

    /* renamed from: n1 */
    public ForegroundBackgroundApplicationListener f97038n1;
    @Inject

    /* renamed from: o1 */
    public C32121c f97039o1;
    @Inject

    /* renamed from: p1 */
    public C13814a f97040p1;
    @C12579k

    /* renamed from: q1 */
    public final C11677z f97041q1 = new ViewModelLazy(C11342l0.m43547d(HomeViewModel.class), new BottomNavActivity$special$$inlined$viewModels$default$2(this), new BottomNavActivity$special$$inlined$viewModels$default$1(this), new BottomNavActivity$special$$inlined$viewModels$default$3((C11289a) null, this));
    @C12579k

    /* renamed from: r1 */
    public final C11677z f97042r1 = new ViewModelLazy(C11342l0.m43547d(RatingViewModel.class), new BottomNavActivity$special$$inlined$viewModels$default$5(this), new BottomNavActivity$special$$inlined$viewModels$default$4(this), new BottomNavActivity$special$$inlined$viewModels$default$6((C11289a) null, this));
    @C12579k

    /* renamed from: s1 */
    public final ConnectivityManager.NetworkCallback f97043s1 = ConnectivityKt.m118749a(new BottomNavActivity$networkCallback$1(this));

    /* renamed from: t1 */
    public C37189a1 f97044t1;
    @C12580l

    /* renamed from: u1 */
    public Bundle f97045u1;
    @C12579k

    /* renamed from: v1 */
    public final C0302g<Intent> f97046v1 = C13825a.m58777f(this);
    @C12579k

    /* renamed from: w1 */
    public final BroadcastReceiver f97047w1 = new C38311h(this);
    @Inject

    /* renamed from: x1 */
    public C28796c f97048x1;

    /* renamed from: com.carrefour.fid.android.navigation.BottomNavActivity$a */
    public static final class C38304a {
        public /* synthetic */ C38304a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C38304a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.navigation.BottomNavActivity$b */
    public /* synthetic */ class C38305b implements C19426h0, C11379z {
        public C38305b() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo4590a(Object obj) {
            mo121152b(((Boolean) obj).booleanValue());
        }

        /* renamed from: b */
        public final void mo121152b(boolean z) {
            BottomNavActivity.this.mo121129f2(z);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, BottomNavActivity.this, BottomNavActivity.class, "handleUsabillaNavigation", "handleUsabillaNavigation(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.navigation.BottomNavActivity$c */
    public static final class C38306c implements C11908f<ProductCategory> {

        /* renamed from: a */
        public final /* synthetic */ BottomNavActivity f97051a;

        public C38306c(BottomNavActivity bottomNavActivity) {
            this.f97051a = bottomNavActivity;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12580l ProductCategory productCategory, @C12579k C11045c<? super C11079d2> cVar) {
            this.f97051a.mo121117T1(productCategory);
            return C11079d2.f28267a;
        }
    }

    /* renamed from: com.carrefour.fid.android.navigation.BottomNavActivity$d */
    public /* synthetic */ class C38307d implements C11908f, C11379z {
        public C38307d() {
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k RatingViewModel.C27377a aVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object u1 = BottomNavActivity.this.mo121137p2(aVar);
            return u1 == C11063b.m42612h() ? u1 : C11079d2.f28267a;
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C11908f) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new AdaptedFunctionReference(2, BottomNavActivity.this, BottomNavActivity.class, "renderState", "renderState(Lcom/carrefour/fid/android/presentation/viewmodels/rating/RatingViewModel$UIState;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.navigation.BottomNavActivity$e */
    public static final class C38308e implements C11908f<Integer> {

        /* renamed from: a */
        public final /* synthetic */ BottomNavActivity f97053a;

        public C38308e(BottomNavActivity bottomNavActivity) {
            this.f97053a = bottomNavActivity;
        }

        @C12580l
        /* renamed from: c */
        public final Object mo121159c(int i, @C12579k C11045c<? super C11079d2> cVar) {
            this.f97053a.mo121128e2(i);
            return C11079d2.f28267a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
            return mo121159c(((Number) obj).intValue(), cVar);
        }
    }

    /* renamed from: com.carrefour.fid.android.navigation.BottomNavActivity$f */
    public static final class C38309f implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f97054a;

        public C38309f(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f97054a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f97054a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f97054a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.navigation.BottomNavActivity$g */
    public static final class C38310g implements NavController.C19676b {

        /* renamed from: a */
        public final /* synthetic */ BottomNavActivity f97055a;

        public C38310g(BottomNavActivity bottomNavActivity) {
            this.f97055a = bottomNavActivity;
        }

        /* renamed from: a */
        public final void mo58177a(@C12579k NavController navController, @C12579k NavDestination navDestination, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(navController, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
            this.f97055a.mo83824t(!C38322e.m158778a().contains(Integer.valueOf(navDestination.mo58238f0())));
        }
    }

    /* renamed from: com.carrefour.fid.android.navigation.BottomNavActivity$h */
    public static final class C38311h extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ BottomNavActivity f97056a;

        public C38311h(BottomNavActivity bottomNavActivity) {
            this.f97056a = bottomNavActivity;
        }

        public void onReceive(@C12579k Context context, @C12579k Intent intent) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
            C22755a.f58271a.mo67149b(this.f97056a, intent.getAction());
        }
    }

    public BottomNavActivity() {
        super(C383031.f97049a);
    }

    /* renamed from: k2 */
    public static final C18436z4 m158660k2(View view, C18436z4 z4Var) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(z4Var, "windowInsets");
        C17616m0 f = z4Var.mo53136f(C18436z4.C18449m.m83510i());
        Intrinsics.checkNotNullExpressionValue(f, "windowInsets.getInsets(W…Compat.Type.systemBars())");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), f.f45998d);
        return C18436z4.f47103c;
    }

    /* renamed from: q2 */
    public static final void m158668q2(C32227d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "it");
        C28935i.m119706i(C28935i.f70940a, "Review in-app rating popup is finished with success", (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: A1 */
    public final int mo121083A1() {
        FragmentManager g0 = mo57175g0();
        Intrinsics.checkNotNullExpressionValue(g0, "supportFragmentManager");
        return FragmentKt.m118817e(g0);
    }

    /* renamed from: A2 */
    public final void mo121084A2(@C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "<set-?>");
        this.f97034j1 = loyaltyPreferencesStorage;
    }

    /* renamed from: B */
    public void mo113268B() {
        C37189a1 a1Var = this.f97044t1;
        C37189a1 a1Var2 = null;
        if (a1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ratingDialog");
            a1Var = null;
        }
        a1Var.dismiss();
        RatingViewModel J1 = mo121101J1();
        C37189a1 a1Var3 = this.f97044t1;
        if (a1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ratingDialog");
        } else {
            a1Var2 = a1Var3;
        }
        J1.sendIntent(new RatingViewModel.C27382b.C27384b(a1Var2.mo113263S0()));
    }

    @C12579k
    /* renamed from: B1 */
    public final C26380a mo121085B1() {
        C26380a aVar = this.f97036l1;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bottomNavAnalyticsViewModel");
        return null;
    }

    /* renamed from: B2 */
    public final void mo121086B2(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f97048x1 = cVar;
    }

    @C12579k
    /* renamed from: C1 */
    public final CriteoTrackingViewModel mo121087C1() {
        CriteoTrackingViewModel criteoTrackingViewModel = this.f97033i1;
        if (criteoTrackingViewModel != null) {
            return criteoTrackingViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("criteoViewModel");
        return null;
    }

    /* renamed from: C2 */
    public final void mo121088C2(@C12579k C32121c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f97039o1 = cVar;
    }

    @C12579k
    /* renamed from: D1 */
    public final ForegroundBackgroundApplicationListener mo121089D1() {
        ForegroundBackgroundApplicationListener foregroundBackgroundApplicationListener = this.f97038n1;
        if (foregroundBackgroundApplicationListener != null) {
            return foregroundBackgroundApplicationListener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("foregroundBackgroundApplicationListener");
        return null;
    }

    /* renamed from: D2 */
    public final void mo121090D2(@C12580l Bundle bundle) {
        this.f97045u1 = bundle;
    }

    @C12579k
    /* renamed from: E1 */
    public final HomeAnalyticsViewModel mo121091E1() {
        HomeAnalyticsViewModel homeAnalyticsViewModel = this.f97035k1;
        if (homeAnalyticsViewModel != null) {
            return homeAnalyticsViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeAnalyticsViewModel");
        return null;
    }

    /* renamed from: E2 */
    public final void mo121092E2(int i, Intent intent, int i2) {
        if (i == -1) {
            HomeViewModel.m112700w0(mo121093F1(), false, 1, (Object) null);
            if (i2 == 689) {
                mo121109N1();
            } else if (i2 == 994) {
                mo121111O1();
            } else if (i2 != 995) {
                mo121118U1();
            } else {
                mo121122Y1();
            }
        }
    }

    /* renamed from: F1 */
    public final HomeViewModel mo121093F1() {
        return (HomeViewModel) this.f97041q1.getValue();
    }

    /* renamed from: F2 */
    public final void mo121094F2() {
        Fragment r0 = mo57175g0().mo56900r0(R.id.nav_host_container);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavController k = ((NavHostFragment) r0).mo58400k();
        this.f97030f1 = k;
        if (k == null) {
            C28935i.m119705e(C28935i.f70940a, "Navigation Controller is not Initialized!", (Throwable) null, 0, 6, (Object) null);
            return;
        }
        BottomNavigationComponent bottomNavigationComponent = ((C36648b) mo32765V0()).f90583b;
        NavController navController = this.f97030f1;
        NavController navController2 = null;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        bottomNavigationComponent.setup(navController, new BottomNavActivity$setupBottomNavigationBar$2(this), new BottomNavActivity$setupBottomNavigationBar$3(this));
        NavController navController3 = this.f97030f1;
        if (navController3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
        } else {
            navController2 = navController3;
        }
        navController2.mo58151q(new C38310g(this));
    }

    @C12579k
    /* renamed from: G1 */
    public final LoginRepository mo121095G1() {
        LoginRepository loginRepository = this.f97032h1;
        if (loginRepository != null) {
            return loginRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginRepository");
        return null;
    }

    /* renamed from: G2 */
    public final void mo121096G2() {
        NavController navController = this.f97030f1;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        navController.mo58130W(R.id.gas_station_graph, this.f97031g1);
    }

    @C12579k
    /* renamed from: H1 */
    public final LoyaltyPreferencesStorage mo121097H1() {
        LoyaltyPreferencesStorage loyaltyPreferencesStorage = this.f97034j1;
        if (loyaltyPreferencesStorage != null) {
            return loyaltyPreferencesStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loyaltyPreferencesStorage");
        return null;
    }

    /* renamed from: H2 */
    public final void mo121098H2(@C0329d0 int i) {
        NavController navController = this.f97030f1;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        navController.mo58153r(i);
        ((C36648b) mo32765V0()).f90583b.setSelectedItemId(i);
    }

    @C12579k
    /* renamed from: I1 */
    public final C28796c mo121099I1() {
        C28796c cVar = this.f97048x1;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: I2 */
    public final void mo121100I2(int i, Intent intent) {
    }

    /* renamed from: J1 */
    public final RatingViewModel mo121101J1() {
        return (RatingViewModel) this.f97042r1.getValue();
    }

    /* renamed from: J2 */
    public final void mo121102J2(int i) {
        if (i == -1) {
            NavController navController = null;
            HomeViewModel.m112700w0(mo121093F1(), false, 1, (Object) null);
            NavController navController2 = this.f97030f1;
            if (navController2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_navController");
            } else {
                navController = navController2;
            }
            navController.mo58128V(R.id.drive_graph);
        }
    }

    @C12579k
    /* renamed from: K1 */
    public final C32121c mo121103K1() {
        C32121c cVar = this.f97039o1;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reviewManager");
        return null;
    }

    /* renamed from: K2 */
    public final void mo121104K2(int i) {
        if (i != 0) {
            HomeViewModel.m112700w0(mo121093F1(), false, 1, (Object) null);
            mo121096G2();
        }
    }

    @C12580l
    /* renamed from: L1 */
    public final Bundle mo121105L1() {
        return this.f97045u1;
    }

    /* renamed from: L2 */
    public final void mo121106L2(int i, Intent intent) {
        Intent intent2 = intent;
        if (i == -1) {
            HomeViewModel.m112700w0(mo121093F1(), false, 1, (Object) null);
            if (intent2 != null) {
                if (intent2.getBooleanExtra(C36168a.f89275c, false)) {
                    NotificationComponent.Variant variant = NotificationComponent.Variant.INFO;
                    String string = getString(R.string.message_store_ecom_changed);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.message_store_ecom_changed)");
                    ActivityKt.m118716z(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                }
                mo121121X1();
                return;
            }
        }
    }

    @C12579k
    /* renamed from: M1 */
    public final ToolBarDefaultView mo121107M1() {
        ToolBarDefaultView toolBarDefaultView = ((C36648b) mo32765V0()).f90585d;
        Intrinsics.checkNotNullExpressionValue(toolBarDefaultView, "binding.toolbarHome");
        return toolBarDefaultView;
    }

    /* renamed from: M2 */
    public final void mo121108M2(int i, Intent intent) {
    }

    /* renamed from: N1 */
    public final void mo121109N1() {
        mo121120W1();
        NavController navController = this.f97030f1;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        navController.mo58128V(R.id.account_graph);
    }

    /* renamed from: N2 */
    public final void mo121110N2(int i, Intent intent) {
        if (i == 22553 || i == 22555 || i == 22556) {
            HomeViewModel.m112700w0(mo121093F1(), false, 1, (Object) null);
            mo121118U1();
        }
    }

    /* renamed from: O1 */
    public final void mo121111O1() {
        mo121120W1();
        NavController navController = this.f97030f1;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        navController.mo58128V(R.id.basket_builder_graph);
    }

    /* renamed from: O2 */
    public final void mo121112O2(int i, Intent intent) {
        Intent intent2 = intent;
        if (i == -1) {
            mo121093F1().mo76831v0(true);
            if (intent2 != null && intent2.getBooleanExtra(C36168a.f89275c, false)) {
                NotificationComponent.Variant variant = NotificationComponent.Variant.INFO;
                String string = getString(R.string.message_store_ecom_changed);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.message_store_ecom_changed)");
                ActivityKt.m118716z(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                return;
            }
        }
    }

    /* renamed from: P1 */
    public final void mo121113P1() {
        mo121098H2(R.id.basket_graph);
    }

    /* renamed from: Q1 */
    public final void mo121114Q1(Catalog catalog) {
        Bundle b = C17779d.m81164b(C11078d1.m42659a("catalog", catalog));
        NavController navController = this.f97030f1;
        NavController navController2 = null;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        navController.mo58152q0();
        NavController navController3 = this.f97030f1;
        if (navController3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
        } else {
            navController2 = navController3;
        }
        navController2.mo58130W(R.id.catalog_details_graph, b);
    }

    /* renamed from: R1 */
    public final void mo121115R1(CatalogProduct catalogProduct) {
        Bundle b = C17779d.m81164b(C11078d1.m42659a("product", catalogProduct));
        NavController navController = this.f97030f1;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        navController.mo58130W(R.id.catalog_product_details_graph, b);
    }

    /* renamed from: S1 */
    public final void mo121116S1() {
        NavController navController = this.f97030f1;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        navController.mo58128V(R.id.catalogs_graph);
    }

    /* renamed from: T1 */
    public final void mo121117T1(ProductCategory productCategory) {
        if (productCategory != null) {
            mo121118U1();
            Bundle h = new C27455c(productCategory, productCategory.mo117297q()).mo79808h();
            NavController navController = this.f97030f1;
            if (navController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_navController");
                navController = null;
            }
            navController.mo58130W(R.id.product_list_department_graph, h);
        }
    }

    /* renamed from: U1 */
    public final void mo121118U1() {
        mo121098H2(R.id.departments_graph);
    }

    /* renamed from: V1 */
    public final void mo121119V1() {
        String string = getString(R.string.customer_services_url);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.customer_services_url)");
        ActivityKt.m118690C(this, string);
    }

    /* renamed from: W1 */
    public final void mo121120W1() {
        ((C36648b) mo32765V0()).f90583b.setSelectedItemId(R.id.home_graph);
        NavController navController = this.f97030f1;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        navController.mo58153r(R.id.home_graph);
    }

    /* renamed from: X1 */
    public final void mo121121X1() {
        NavController navController = this.f97030f1;
        NavController navController2 = null;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        navController.mo58152q0();
        NavController navController3 = this.f97030f1;
        if (navController3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
        } else {
            navController2 = navController3;
        }
        navController2.mo58128V(R.id.loyalty_graph);
    }

    /* renamed from: Y1 */
    public final void mo121122Y1() {
        mo121098H2(R.id.orders_graph);
    }

    /* renamed from: Z1 */
    public final void mo121123Z1() {
        mo121098H2(R.id.physical_store_graph);
    }

    /* renamed from: a2 */
    public final void mo121124a2(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            NavController navController = null;
            C27808i iVar = new C27808i(new OfferIdentifier(Gtin.m157308b(str), ProductReference.m157466b(""), (DefaultConstructorMarker) null), 0, str, 2, (DefaultConstructorMarker) null);
            NavController navController2 = this.f97030f1;
            if (navController2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_navController");
            } else {
                navController = navController2;
            }
            navController.mo58130W(R.id.product_graph, iVar.mo80767j());
        }
    }

    /* renamed from: b2 */
    public final void mo121125b2(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "queryId");
        mo121118U1();
        NavController navController = null;
        Bundle h = new C27457d(str, (String) null, 2, (DefaultConstructorMarker) null).mo79820h();
        NavController navController2 = this.f97030f1;
        if (navController2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
        } else {
            navController = navController2;
        }
        navController.mo58130W(R.id.product_list_query_graph, h);
    }

    /* renamed from: c2 */
    public final void mo121126c2() {
        NavController navController = this.f97030f1;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        navController.mo58128V(R.id.product_list_promo_graph);
    }

    /* renamed from: d2 */
    public final void mo121127d2(int i, int i2, @C12580l Intent intent) {
        if (i == 123) {
            mo121112O2(i2, intent);
        } else if (i != 126) {
            switch (i) {
                case C28539g.f69230F:
                    mo121092E2(i2, intent, i);
                    return;
                case C28539g.f69231G:
                    mo121148y2(i2);
                    return;
                case C28539g.f69232H:
                    mo121100I2(i2, intent);
                    return;
                case 994:
                    mo121092E2(i2, intent, i);
                    return;
                case C28539g.f69234J:
                    mo121092E2(i2, intent, i);
                    return;
                case C28539g.f69235K:
                    mo121102J2(i2);
                    return;
                default:
                    switch (i) {
                        case C28539g.f69226B:
                            mo121106L2(i2, intent);
                            return;
                        case C28539g.f69227C:
                            mo121110N2(i2, intent);
                            return;
                        case C28539g.f69228D:
                            mo121108M2(i2, intent);
                            return;
                        default:
                            return;
                    }
            }
        } else {
            mo121104K2(i2);
        }
    }

    /* renamed from: e2 */
    public final void mo121128e2(int i) {
        ((C36648b) mo32765V0()).f90583b.mo112823s(R.id.basket_graph, i);
    }

    /* renamed from: f2 */
    public final void mo121129f2(boolean z) {
        if (z) {
            C22755a.f58271a.mo67152e(this);
        }
    }

    /* renamed from: g2 */
    public final void mo121130g2() {
        mo121089D1().mo67061k(new BottomNavActivity$initNavigationListener$1(this));
    }

    /* renamed from: h2 */
    public final boolean mo121131h2(Intent intent) {
        int intExtra;
        if (intent == null || (intExtra = intent.getIntExtra(f97025A1, -1)) <= 0 || ((C36648b) mo32765V0()).f90583b.getSelectedItemId() == intExtra) {
            return false;
        }
        mo121098H2(intExtra);
        intent.putExtra(f97025A1, -1);
        return true;
    }

    /* renamed from: i2 */
    public final boolean mo121132i2() {
        return C13181d.m57146e(mo121095G1().mo31354f());
    }

    /* renamed from: j */
    public void mo83423j() {
        BottomNavigationComponent bottomNavigationComponent = ((C36648b) mo32765V0()).f90583b;
        Intrinsics.checkNotNullExpressionValue(bottomNavigationComponent, "binding.mainBottomNavigation");
        bottomNavigationComponent.setPadding(bottomNavigationComponent.getPaddingLeft(), bottomNavigationComponent.getPaddingTop(), bottomNavigationComponent.getPaddingRight(), 0);
    }

    /* renamed from: j2 */
    public final void mo121133j2() {
        C18196h2.m82559a2(((C36648b) mo32765V0()).f90583b, new C38319b());
    }

    @C12579k
    /* renamed from: k */
    public NavController mo83823k() {
        NavController navController = this.f97030f1;
        if (navController != null) {
            return navController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_navController");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if (r7 == true) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo121134l2(java.lang.String r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.navigation.BottomNavActivity$navigateToPdp$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.navigation.BottomNavActivity$navigateToPdp$1 r0 = (com.carrefour.fid.android.navigation.BottomNavActivity$navigateToPdp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.navigation.BottomNavActivity$navigateToPdp$1 r0 = new com.carrefour.fid.android.navigation.BottomNavActivity$navigateToPdp$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.navigation.BottomNavActivity r0 = (com.carrefour.fid.android.navigation.BottomNavActivity) r0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x004e
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r7 = r5.mo121093F1()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.mo76821D0(r6, r0)
            if (r7 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r0 = r5
        L_0x004e:
            java.util.List r7 = (java.util.List) r7
            r1 = 0
            if (r7 == 0) goto L_0x0081
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0064
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0064
        L_0x0062:
            r7 = r1
            goto L_0x007e
        L_0x0064:
            java.util.Iterator r7 = r7.iterator()
        L_0x0068:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r7.next()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r2 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType) r2
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r4 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.HOME_DELIVERY_NAL
            if (r2 != r4) goto L_0x007a
            r2 = r3
            goto L_0x007b
        L_0x007a:
            r2 = r1
        L_0x007b:
            if (r2 == 0) goto L_0x0068
            r7 = r3
        L_0x007e:
            if (r7 != r3) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r3 = r1
        L_0x0082:
            com.carrefour.fid.android.shared.navigation.c r7 = r0.mo121099I1()
            androidx.navigation.NavController r0 = r0.f97030f1
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "_navController"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r1
        L_0x0091:
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r2 = new com.carrefour.fid.android.domain.models.offer.OfferIdentifier
            java.lang.String r6 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r6)
            java.lang.String r4 = ""
            java.lang.String r4 = com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r4)
            r2.<init>(r6, r4, r1)
            r7.mo83838n(r0, r2, r3)
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.navigation.BottomNavActivity.mo121134l2(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: m */
    public void mo113269m() {
        C28935i.m119706i(C28935i.f70940a, "Internal rating popup was closed", (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: m2 */
    public final void mo121135m2(Uri uri) {
        String queryParameter;
        String replace$default;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "queryParameterNames");
        String str = (String) CollectionsKt___CollectionsKt.m40721z2(queryParameterNames);
        if (str != null && (queryParameter = uri.getQueryParameter(str)) != null && (replace$default = C11622t.replace$default(queryParameter, " ", (String) C31132a.f74628J0, false, 4, (Object) null)) != null) {
            C28796c I1 = mo121099I1();
            NavController navController = this.f97030f1;
            if (navController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_navController");
                navController = null;
            }
            I1.mo83842r(navController, replace$default);
        }
    }

    /* renamed from: o */
    public int mo84136o() {
        return ((C36648b) mo32765V0()).f90583b.getHeight();
    }

    /* renamed from: o2 */
    public final void mo121136o2(String str) {
        NavController navController = this.f97030f1;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            navController = null;
        }
        navController.mo58130W(R.id.catalog_webview_graph, new C28863a(str, (String) null, (String) null, 6, (DefaultConstructorMarker) null).mo84018j());
    }

    public void onBackPressed() {
        boolean z;
        C28935i.m119704b(C28935i.f70940a, "supportFragmentManager.backStackEntryCount is " + mo121083A1(), (Throwable) null, 0, 6, (Object) null);
        ToolBarDefaultView toolBarDefaultView = ((C36648b) mo32765V0()).f90585d;
        Intrinsics.checkNotNullExpressionValue(toolBarDefaultView, "binding.toolbarHome");
        if (mo121083A1() > 1) {
            z = true;
        } else {
            z = false;
        }
        ToolBarDefaultView.m158944r0(toolBarDefaultView, z, (C11300l) null, false, 6, (Object) null);
        super.onBackPressed();
        ((C36648b) mo32765V0()).f90585d.setEnabled(true);
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        C19441m0.f49815w.mo57609a().getLifecycle().mo57464a(mo121089D1());
        mo121094F2();
        mo121133j2();
        mo121130g2();
        mo121091E1().mo76697e();
        HomeViewModel F1 = mo121093F1();
        F1.mo76822E0().mo57491k(this, new C38305b());
        F1.mo76833y0().mo57491k(this, new C38309f(new BottomNavActivity$onCreate$1$2(this)));
        F1.mo76819B0().mo57491k(this, new C38309f(new BottomNavActivity$onCreate$1$3(this)));
        F1.mo76818A0().mo57491k(this, new C38309f(new BottomNavActivity$onCreate$1$4(this)));
        F1.mo76834z0().mo57491k(this, new C38309f(new BottomNavActivity$onCreate$1$5(this)));
        Lifecycle.State state = Lifecycle.State.STARTED;
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new C38312xb38b91c3(this, state, (C11045c) null, F1, this), 3, (Object) null);
        RatingViewModel J1 = mo121101J1();
        Lifecycle.State state2 = Lifecycle.State.RESUMED;
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new C38314x91f2cd68(this, state2, (C11045c) null, J1, this), 3, (Object) null);
        J1.sendIntent(RatingViewModel.C27382b.C27385c.f66454b);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, C19965r.f51092g);
        onNewIntent(intent);
        mo121143w1();
        C22755a.f58271a.mo67153f(this);
    }

    public void onDestroy() {
        C19441m0.f49815w.mo57609a().getLifecycle().mo57467d(mo121089D1());
        C28502s.C28503a.m118425a(mo121093F1(), this, (Boolean) null, 2, (Object) null);
        super.onDestroy();
    }

    public void onNewIntent(@C12579k Intent intent) {
        Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
        super.onNewIntent(intent);
        C19501x.m90847a(this).mo57476b(new BottomNavActivity$onNewIntent$1(this, intent, (C11045c<? super BottomNavActivity$onNewIntent$1>) null));
    }

    public void onPause() {
        super.onPause();
        ConnectivityKt.m118752d(this, this.f97043s1);
    }

    public void onResume() {
        super.onResume();
        C13825a.m58782k(this, (String) null, 1, (Object) null);
        mo121131h2(getIntent());
        ((C36648b) mo32765V0()).f90585d.setEnabled(true);
        ConnectivityKt.m118751c(this, this.f97043s1);
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new C38316x88fcbbcf(this, Lifecycle.State.RESUMED, (C11045c) null, this), 3, (Object) null);
    }

    public void onStart() {
        super.onStart();
        C19552a.m91036b(this).mo57834c(this.f97047w1, C22755a.f58271a.mo67148a());
    }

    public void onStop() {
        super.onStop();
        mo121093F1().mo76825H0();
        C19552a.m91036b(this).mo57837f(this.f97047w1);
    }

    /* renamed from: p2 */
    public final void mo121137p2(RatingViewModel.C27377a aVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) RatingViewModel.C27377a.C27381d.f66447c)) {
            C37189a1 a1Var = new C37189a1();
            this.f97044t1 = a1Var;
            a1Var.show(mo57175g0(), RatingCompat.f236d);
        } else if (aVar instanceof RatingViewModel.C27377a.C27378a) {
            C32227d<Void> b = mo121103K1().mo92879b(this, ((RatingViewModel.C27377a.C27378a) aVar).mo79673h());
            Intrinsics.checkNotNullExpressionValue(b, "reviewManager.launchRevi…w(this, state.reviewInfo)");
            b.mo93013a(new C38318a());
        } else {
            C28935i.m119706i(C28935i.f70940a, "Nothing to render", (Throwable) null, 0, 6, (Object) null);
        }
    }

    /* renamed from: r2 */
    public final void mo121138r2(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f97037m1 = aVar;
    }

    /* renamed from: s2 */
    public final void mo121139s2(@C12579k C13814a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f97040p1 = aVar;
    }

    /* renamed from: t */
    public void mo83824t(boolean z) {
        int i;
        BottomNavigationComponent bottomNavigationComponent = ((C36648b) mo32765V0()).f90583b;
        Intrinsics.checkNotNullExpressionValue(bottomNavigationComponent, "binding.mainBottomNavigation");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        bottomNavigationComponent.setVisibility(i);
    }

    /* renamed from: t2 */
    public final void mo121140t2(@C12579k C26380a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f97036l1 = aVar;
    }

    /* renamed from: u2 */
    public final void mo121141u2(@C12579k CriteoTrackingViewModel criteoTrackingViewModel) {
        Intrinsics.checkNotNullParameter(criteoTrackingViewModel, "<set-?>");
        this.f97033i1 = criteoTrackingViewModel;
    }

    /* renamed from: v2 */
    public final void mo121142v2(@C12579k ForegroundBackgroundApplicationListener foregroundBackgroundApplicationListener) {
        Intrinsics.checkNotNullParameter(foregroundBackgroundApplicationListener, "<set-?>");
        this.f97038n1 = foregroundBackgroundApplicationListener;
    }

    /* renamed from: w1 */
    public final void mo121143w1() {
        String stringExtra;
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra(f97026B1)) != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -1440851803) {
                if (hashCode == 66808473 && stringExtra.equals(C13825a.f33738b)) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(C13318a.f32720a, true);
                    C11079d2 d2Var = C11079d2.f28267a;
                    C13825a.m58795x(this, false, 0, 0, 0, bundle, 14, (Object) null);
                }
            } else if (stringExtra.equals(C13825a.f33737a)) {
                C13825a.m58795x(this, false, 0, 0, 0, (Bundle) null, 30, (Object) null);
            }
            intent.removeExtra(f97026B1);
        }
    }

    /* renamed from: w2 */
    public final void mo121144w2(@C12579k CurrentCampaignsModel currentCampaignsModel) {
        Intrinsics.checkNotNullParameter(currentCampaignsModel, "currentCampaignsModel");
        this.f97031g1 = new C24018a(currentCampaignsModel.mo121538g(), currentCampaignsModel.mo121537f()).mo70278h();
    }

    @C12579k
    /* renamed from: x1 */
    public final C0302g<Intent> mo121145x1() {
        return this.f97046v1;
    }

    /* renamed from: x2 */
    public final void mo121146x2(@C12579k HomeAnalyticsViewModel homeAnalyticsViewModel) {
        Intrinsics.checkNotNullParameter(homeAnalyticsViewModel, "<set-?>");
        this.f97035k1 = homeAnalyticsViewModel;
    }

    @C12579k
    /* renamed from: y1 */
    public final C13783a mo121147y1() {
        C13783a aVar = this.f97037m1;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticManager");
        return null;
    }

    /* renamed from: y2 */
    public final void mo121148y2(int i) {
        if (i == -1) {
            HomeViewModel.m112700w0(mo121093F1(), false, 1, (Object) null);
            C13825a.m58783l(this);
        }
    }

    @C12579k
    /* renamed from: z1 */
    public final C13814a mo121149z1() {
        C13814a aVar = this.f97040p1;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appsFlyerTrackingManager");
        return null;
    }

    /* renamed from: z2 */
    public final void mo121150z2(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "<set-?>");
        this.f97032h1 = loginRepository;
    }
}
