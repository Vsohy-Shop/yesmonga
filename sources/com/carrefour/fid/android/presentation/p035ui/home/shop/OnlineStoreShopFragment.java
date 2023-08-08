package com.carrefour.fid.android.presentation.p035ui.home.shop;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36775n6;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.models.extension.C38481p;
import com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel;
import com.carrefour.fid.android.storelocator.utils.C28993b;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.firebase.installations.C33124s;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/home/shop/OnlineStoreShopFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/n6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Landroid/content/Context;", "context", "onAttach", "onDetach", "Lcom/carrefour/fid/android/navigation/BottomNavActivity;", "f", "Lcom/carrefour/fid/android/navigation/BottomNavActivity;", "callback", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "S0", "()Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "V0", "(Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;)V", "homeAnalyticsViewModel", "<init>", "()V", "v", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.shop.OnlineStoreShopFragment */
public final class OnlineStoreShopFragment extends C24205b<C36775n6> {
    @C12579k

    /* renamed from: X */
    public static final String f60514X = "store_address";
    @C12579k

    /* renamed from: Y */
    public static final String f60515Y = "store_id";
    @C12579k

    /* renamed from: Z */
    public static final String f60516Z = "slot";
    @C12579k

    /* renamed from: v */
    public static final C24201a f60517v = new C24201a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f60518w = 8;
    @C12579k

    /* renamed from: x */
    public static final String f60519x = "OnlineStoreShopFragment";
    @C12579k

    /* renamed from: y */
    public static final String f60520y = "is_clcv";
    @C12579k

    /* renamed from: z */
    public static final String f60521z = "address";
    @C12580l

    /* renamed from: f */
    public BottomNavActivity f60522f;
    @Inject

    /* renamed from: g */
    public HomeAnalyticsViewModel f60523g;

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.shop.OnlineStoreShopFragment$a */
    public static final class C24201a {
        public /* synthetic */ C24201a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ OnlineStoreShopFragment m106567b(C24201a aVar, boolean z, String str, C38163l lVar, Slot slot, int i, Object obj) {
            if ((i & 4) != 0) {
                lVar = null;
            }
            if ((i & 8) != 0) {
                slot = null;
            }
            return aVar.mo70818a(z, str, lVar, slot);
        }

        @C12579k
        /* renamed from: a */
        public final OnlineStoreShopFragment mo70818a(boolean z, @C12579k String str, @C12580l C38163l lVar, @C12580l Slot slot) {
            StoreAddress storeAddress;
            Intrinsics.checkNotNullParameter(str, "address");
            OnlineStoreShopFragment onlineStoreShopFragment = new OnlineStoreShopFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(OnlineStoreShopFragment.f60520y, z);
            String str2 = null;
            if (lVar != null) {
                storeAddress = lVar.mo119392v();
            } else {
                storeAddress = null;
            }
            bundle.putParcelable(OnlineStoreShopFragment.f60514X, storeAddress);
            bundle.putParcelable(OnlineStoreShopFragment.f60516Z, slot);
            bundle.putString("address", str);
            if (lVar != null) {
                str2 = lVar.mo119359C();
            }
            bundle.putString("store_id", str2);
            onlineStoreShopFragment.setArguments(bundle);
            return onlineStoreShopFragment;
        }

        public C24201a() {
        }
    }

    public OnlineStoreShopFragment() {
        super(C242001.f60524a);
    }

    /* renamed from: T0 */
    public static final void m106562T0(OnlineStoreShopFragment onlineStoreShopFragment, View view) {
        String str;
        boolean z;
        StoreAddress storeAddress;
        Object obj;
        Intrinsics.checkNotNullParameter(onlineStoreShopFragment, "this$0");
        Bundle arguments = onlineStoreShopFragment.getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("store_id");
        } else {
            str = null;
        }
        if (str == null || C11622t.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Bundle arguments2 = onlineStoreShopFragment.getArguments();
            if (arguments2 != null) {
                obj = arguments2.getSerializable("address");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            }
            if (str2 != null) {
                onlineStoreShopFragment.mo70815S0().mo76718z(str);
            }
        }
        Bundle arguments3 = onlineStoreShopFragment.getArguments();
        if (arguments3 != null && (storeAddress = (StoreAddress) arguments3.getParcelable(f60514X)) != null) {
            onlineStoreShopFragment.startActivity(C28993b.f71084a.mo84430c(storeAddress));
        }
    }

    /* renamed from: U0 */
    public static final void m106563U0(OnlineStoreShopFragment onlineStoreShopFragment, View view) {
        Intrinsics.checkNotNullParameter(onlineStoreShopFragment, "this$0");
        BottomNavActivity bottomNavActivity = onlineStoreShopFragment.f60522f;
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121118U1();
        }
    }

    @C12579k
    /* renamed from: S0 */
    public final HomeAnalyticsViewModel mo70815S0() {
        HomeAnalyticsViewModel homeAnalyticsViewModel = this.f60523g;
        if (homeAnalyticsViewModel != null) {
            return homeAnalyticsViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeAnalyticsViewModel");
        return null;
    }

    /* renamed from: V0 */
    public final void mo70816V0(@C12579k HomeAnalyticsViewModel homeAnalyticsViewModel) {
        Intrinsics.checkNotNullParameter(homeAnalyticsViewModel, "<set-?>");
        this.f60523g = homeAnalyticsViewModel;
    }

    public void onAttach(@C12579k Context context) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        super.onAttach(context);
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        this.f60522f = bottomNavActivity;
    }

    public void onDetach() {
        this.f60522f = null;
        super.onDetach();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        boolean z;
        Slot slot;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean(f60520y)) {
            z = false;
        } else {
            z = true;
        }
        String str3 = null;
        if (z) {
            ((C36775n6) getBinding()).f91375e.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_livraison, 0, R.drawable.ic_arrow_blue, 0);
            TextView textView = ((C36775n6) getBinding()).f91376f;
            Context context = getContext();
            if (context != null) {
                str2 = context.getString(R.string.nhp_label_clcv);
            } else {
                str2 = null;
            }
            textView.setText(str2);
            ((C36775n6) getBinding()).f91372b.setVisibility(8);
        } else {
            ((C36775n6) getBinding()).f91375e.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_drive, 0, R.drawable.ic_arrow_blue, 0);
            TextView textView2 = ((C36775n6) getBinding()).f91376f;
            Context context2 = getContext();
            if (context2 != null) {
                str = context2.getString(R.string.nhp_label_drive);
            } else {
                str = null;
            }
            textView2.setText(str);
            ((C36775n6) getBinding()).f91372b.setVisibility(0);
        }
        TextView textView3 = ((C36775n6) getBinding()).f91374d;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            slot = (Slot) arguments2.getParcelable(f60516Z);
        } else {
            slot = null;
        }
        if (slot == null) {
            textView3.setVisibility(8);
        } else if (!C38481p.m159658a(slot)) {
            textView3.setVisibility(0);
            textView3.setText(getString(R.string.soon_slot));
        } else {
            textView3.setVisibility(0);
            Context context3 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, C9175a.f24932Y);
            SpannableString spannableString = new SpannableString(getString(R.string.next_available_slot, C38481p.m159661d(slot, context3)));
            spannableString.setSpan(new RelativeSizeSpan(0.75f), 0, StringsKt__StringsKt.indexOf$default((CharSequence) spannableString, C33124s.f80355c, 0, false, 6, (Object) null), 33);
            spannableString.setSpan(new ForegroundColorSpan(C17318d.m79723f(textView3.getContext(), R.color.ds_primary_dark)), StringsKt__StringsKt.indexOf$default((CharSequence) spannableString, C33124s.f80355c, 0, false, 6, (Object) null) + 1, spannableString.length(), 33);
            textView3.setText(spannableString);
        }
        TextView textView4 = ((C36775n6) getBinding()).f91373c;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("address");
        }
        textView4.setText(str3);
        ((C36775n6) getBinding()).f91372b.setOnClickListener(new C24210g(this));
        view.setOnClickListener(new C24211h(this));
    }
}
