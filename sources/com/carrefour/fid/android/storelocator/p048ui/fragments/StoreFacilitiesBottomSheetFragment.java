package com.carrefour.fid.android.storelocator.p048ui.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.content.res.C0507a;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C19232h;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.airship.data.datasource.C13747e;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.databinding.C36875x6;
import com.carrefour.fid.android.domain.models.service.models.C38147b;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.ServiceUtil;
import com.carrefour.fid.android.storelocator.configurations.C28958a;
import com.carrefour.fid.android.storelocator.p048ui.contracts.C28969b;
import com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter;
import com.carrefour.fid.android.storelocator.utils.C28993b;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import dagger.hilt.android.C10164b;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0001IB\u0007¢\u0006\u0004\bF\u0010GJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0003J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0016J$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\u001a\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\u0016\u0010+\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\u001e\u0010/\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010.\u001a\u00020-H\u0017R\"\u00106\u001a\u0002008\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u00107R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u0002088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006J"}, mo22516d2 = {"Lcom/carrefour/fid/android/storelocator/ui/fragments/StoreFacilitiesBottomSheetFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/carrefour/fid/android/storelocator/ui/contracts/b;", "Landroid/location/Location;", "lastLocation", "Lkotlin/d2;", "d1", "a1", "W0", "X0", "V0", "U0", "initListener", "", "facilitieFormat", "", "P0", "Y0", "Q0", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "c1", "", "Z0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onStart", "view", "onViewCreated", "storePojo", "g0", "N", "g", "f", "", "Lcom/carrefour/fid/android/domain/models/service/models/b;", "hourRange", "l", "H", "Ljava/util/Calendar;", "calendar", "h", "Lcom/carrefour/fid/android/airship/data/datasource/e;", "Lcom/carrefour/fid/android/airship/data/datasource/e;", "O0", "()Lcom/carrefour/fid/android/airship/data/datasource/e;", "b1", "(Lcom/carrefour/fid/android/airship/data/datasource/e;)V", "audienceTrackingManager", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "", "v", "D", "userLatitude", "w", "userLongitude", "Lcom/carrefour/fid/android/storelocator/presentation/presenters/BottomSheetPresenter;", "x", "Lcom/carrefour/fid/android/storelocator/presentation/presenters/BottomSheetPresenter;", "presenter", "Lcom/carrefour/fid/android/databinding/x6;", "y", "Lcom/carrefour/fid/android/databinding/x6;", "binding", "<init>", "()V", "z", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.storelocator.ui.fragments.StoreFacilitiesBottomSheetFragment */
public final class StoreFacilitiesBottomSheetFragment extends C28986e implements C28969b {
    @C12579k

    /* renamed from: E0 */
    public static final String f71056E0 = "user_longitude_key";

    /* renamed from: X */
    public static final int f71057X = 8;
    @C12580l

    /* renamed from: Y */
    public static final String f71058Y = C11342l0.m43547d(StoreFacilitiesBottomSheetFragment.class).mo22848s();
    @C12579k

    /* renamed from: Z */
    public static final String f71059Z = "user_latitude";
    @C12579k

    /* renamed from: z */
    public static final C28980a f71060z = new C28980a((DefaultConstructorMarker) null);
    @Inject

    /* renamed from: f */
    public C13747e f71061f;
    @C12579k

    /* renamed from: g */
    public C38163l f71062g;

    /* renamed from: v */
    public double f71063v;

    /* renamed from: w */
    public double f71064w;

    /* renamed from: x */
    public BottomSheetPresenter f71065x;

    /* renamed from: y */
    public C36875x6 f71066y;

    /* renamed from: com.carrefour.fid.android.storelocator.ui.fragments.StoreFacilitiesBottomSheetFragment$a */
    public static final class C28980a {
        public /* synthetic */ C28980a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final String mo84405a() {
            return StoreFacilitiesBottomSheetFragment.f71058Y;
        }

        @C12579k
        /* renamed from: b */
        public final StoreFacilitiesBottomSheetFragment mo84406b(@C12580l Location location) {
            StoreFacilitiesBottomSheetFragment storeFacilitiesBottomSheetFragment = new StoreFacilitiesBottomSheetFragment();
            Bundle bundle = new Bundle();
            if (location != null) {
                bundle.putDouble(StoreFacilitiesBottomSheetFragment.f71056E0, location.getLongitude());
                bundle.putDouble(StoreFacilitiesBottomSheetFragment.f71059Z, location.getLatitude());
            }
            storeFacilitiesBottomSheetFragment.setArguments(bundle);
            return storeFacilitiesBottomSheetFragment;
        }

        public C28980a() {
        }
    }

    public StoreFacilitiesBottomSheetFragment() {
        C38163l lVar = r0;
        C38163l lVar2 = new C38163l((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (StoreAddress) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, false, false, (List) null, (int) C16476b.f40862n, (DefaultConstructorMarker) null);
        this.f71062g = lVar;
    }

    /* renamed from: R0 */
    public static final void m119909R0(StoreFacilitiesBottomSheetFragment storeFacilitiesBottomSheetFragment, View view) {
        Intrinsics.checkNotNullParameter(storeFacilitiesBottomSheetFragment, "this$0");
        BottomSheetPresenter bottomSheetPresenter = storeFacilitiesBottomSheetFragment.f71065x;
        PackageManager packageManager = null;
        if (bottomSheetPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            bottomSheetPresenter = null;
        }
        bottomSheetPresenter.mo84293e(storeFacilitiesBottomSheetFragment.f71062g.mo119359C());
        Intent b = C28993b.f71084a.mo84429b(storeFacilitiesBottomSheetFragment.f71062g);
        if (b != null) {
            C19232h activity = storeFacilitiesBottomSheetFragment.getActivity();
            if (activity != null) {
                packageManager = activity.getPackageManager();
            }
            Intrinsics.checkNotNull(packageManager, "null cannot be cast to non-null type android.content.pm.PackageManager");
            if (b.resolveActivity(packageManager) != null) {
                storeFacilitiesBottomSheetFragment.startActivity(b);
            }
        }
    }

    /* renamed from: S0 */
    public static final void m119910S0(StoreFacilitiesBottomSheetFragment storeFacilitiesBottomSheetFragment, View view) {
        Intrinsics.checkNotNullParameter(storeFacilitiesBottomSheetFragment, "this$0");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(storeFacilitiesBottomSheetFragment), (CoroutineContext) null, (CoroutineStart) null, new StoreFacilitiesBottomSheetFragment$initListener$2$1$1(storeFacilitiesBottomSheetFragment, (C11045c<? super StoreFacilitiesBottomSheetFragment$initListener$2$1$1>) null), 3, (Object) null);
    }

    /* renamed from: T0 */
    public static final void m119911T0(StoreFacilitiesBottomSheetFragment storeFacilitiesBottomSheetFragment, View view) {
        Intrinsics.checkNotNullParameter(storeFacilitiesBottomSheetFragment, "this$0");
        Intent intent = new Intent("android.intent.action.DIAL");
        String J = storeFacilitiesBottomSheetFragment.f71062g.mo119366J();
        intent.setData(Uri.parse("tel:" + J));
        C19232h activity = storeFacilitiesBottomSheetFragment.getActivity();
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    /* renamed from: H */
    public void mo84353H() {
        FacilitiesSearchFragment facilitiesSearchFragment = (FacilitiesSearchFragment) FragmentKt.m148916b(this, FacilitiesSearchFragment.class);
        if (facilitiesSearchFragment != null) {
            facilitiesSearchFragment.mo84378H();
        }
    }

    /* renamed from: N */
    public void mo84354N() {
        C36875x6 x6Var = this.f71066y;
        C36875x6 x6Var2 = null;
        if (x6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var = null;
        }
        x6Var.f91920j.mo84366b();
        C36875x6 x6Var3 = this.f71066y;
        if (x6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var3 = null;
        }
        x6Var3.f91920j.setVisibility(0);
        C36875x6 x6Var4 = this.f71066y;
        if (x6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            x6Var2 = x6Var4;
        }
        x6Var2.f91920j.mo84367c(ServiceUtil.f70805a.mo84126h(this.f71062g));
    }

    @C12579k
    /* renamed from: O0 */
    public final C13747e mo84391O0() {
        C13747e eVar = this.f71061f;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audienceTrackingManager");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        return com.carrefour.fid.android.R.drawable.ic_crf_market_logo;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo84392P0(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 2131231416(0x7f0802b8, float:1.8078912E38)
            switch(r0) {
                case -2027976644: goto L_0x006a;
                case -1162676091: goto L_0x0061;
                case -1033870472: goto L_0x0058;
                case -734094995: goto L_0x004f;
                case -117562718: goto L_0x0042;
                case 65768: goto L_0x0035;
                case 780456706: goto L_0x0028;
                case 1300366525: goto L_0x001f;
                case 1673062174: goto L_0x0016;
                case 1773813039: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0077
        L_0x000c:
            java.lang.String r0 = "CARREFOUR MARKET"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0073
            goto L_0x0077
        L_0x0016:
            java.lang.String r0 = "CARREFOUR CITY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x007a
            goto L_0x0077
        L_0x001f:
            java.lang.String r0 = "CARREFOUR EXPRESS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x007a
            goto L_0x0077
        L_0x0028:
            java.lang.String r0 = "BON APP"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0031
            goto L_0x0077
        L_0x0031:
            r1 = 2131231436(0x7f0802cc, float:1.8078953E38)
            goto L_0x007a
        L_0x0035:
            java.lang.String r0 = "BIO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x003e
            goto L_0x0077
        L_0x003e:
            r1 = 2131231435(0x7f0802cb, float:1.807895E38)
            goto L_0x007a
        L_0x0042:
            java.lang.String r0 = "CONTACT MARCHE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x004b
            goto L_0x0077
        L_0x004b:
            r1 = 2131231438(0x7f0802ce, float:1.8078957E38)
            goto L_0x007a
        L_0x004f:
            java.lang.String r0 = "CARREFOUR CONTACT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x007a
            goto L_0x0077
        L_0x0058:
            java.lang.String r0 = "CARREFOUR MONTAGNE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x007a
            goto L_0x0077
        L_0x0061:
            java.lang.String r0 = "CORNER EXPRESS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x007a
            goto L_0x0077
        L_0x006a:
            java.lang.String r0 = "MARKET"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            r1 = 2131231442(0x7f0802d2, float:1.8078965E38)
            goto L_0x007a
        L_0x0077:
            r1 = 2131231487(0x7f0802ff, float:1.8079056E38)
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.storelocator.p048ui.fragments.StoreFacilitiesBottomSheetFragment.mo84392P0(java.lang.String):int");
    }

    /* renamed from: Q0 */
    public final void mo84393Q0() {
        C36875x6 x6Var = this.f71066y;
        if (x6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var = null;
        }
        BottomSheetBehavior i0 = BottomSheetBehavior.m125237i0(x6Var.f91913c);
        Intrinsics.checkNotNullExpressionValue(i0, "from(binding.bottomSheet)");
        i0.mo88418W0(5);
    }

    /* renamed from: U0 */
    public final void mo84394U0() {
        boolean z;
        boolean z2 = true;
        if (this.f71063v == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.f71064w != 0.0d) {
                z2 = false;
            }
            if (!z2) {
                Location location = new Location(new String());
                location.setLatitude(this.f71063v);
                location.setLongitude(this.f71064w);
                C36875x6 x6Var = this.f71066y;
                if (x6Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x6Var = null;
                }
                x6Var.f91914d.setText(C28993b.f71084a.mo84428a(location, this.f71062g));
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: V0 */
    public final void mo84395V0() {
        C36875x6 x6Var = this.f71066y;
        C36875x6 x6Var2 = null;
        if (x6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var = null;
        }
        x6Var.f91922l.setText(this.f71062g.mo119361E());
        C36875x6 x6Var3 = this.f71066y;
        if (x6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var3 = null;
        }
        TextView textView = x6Var3.f91919i;
        StoreAddress v = this.f71062g.mo119392v();
        String h = v != null ? v.mo119126h() : null;
        StoreAddress v2 = this.f71062g.mo119392v();
        String l = v2 != null ? v2.mo119131l() : null;
        StoreAddress v3 = this.f71062g.mo119392v();
        textView.setText(h + ", " + l + " " + (v3 != null ? v3.mo119129j() : null));
        String J = this.f71062g.mo119366J();
        if (Intrinsics.areEqual((Object) J, (Object) C28958a.f70988c)) {
            C36875x6 x6Var4 = this.f71066y;
            if (x6Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x6Var4 = null;
            }
            x6Var4.f91918h.setVisibility(8);
            C36875x6 x6Var5 = this.f71066y;
            if (x6Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x6Var5 = null;
            }
            x6Var5.f91915e.setVisibility(0);
        } else if (Intrinsics.areEqual((Object) J, (Object) "")) {
            C36875x6 x6Var6 = this.f71066y;
            if (x6Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x6Var6 = null;
            }
            x6Var6.f91917g.setVisibility(8);
        } else {
            C36875x6 x6Var7 = this.f71066y;
            if (x6Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x6Var7 = null;
            }
            x6Var7.f91915e.setVisibility(8);
            C36875x6 x6Var8 = this.f71066y;
            if (x6Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x6Var8 = null;
            }
            x6Var8.f91918h.setVisibility(0);
            C36875x6 x6Var9 = this.f71066y;
            if (x6Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x6Var9 = null;
            }
            x6Var9.f91918h.setText(this.f71062g.mo119366J());
        }
        C36875x6 x6Var10 = this.f71066y;
        if (x6Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            x6Var2 = x6Var10;
        }
        x6Var2.f91923m.mo84371a(this.f71062g);
    }

    /* renamed from: W0 */
    public final void mo84396W0() {
        Context context = getContext();
        if (context != null) {
            C36875x6 x6Var = this.f71066y;
            if (x6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x6Var = null;
            }
            x6Var.f91922l.setCompoundDrawablesWithIntrinsicBounds(C0507a.m2346b(context, mo84392P0(this.f71062g.mo119394x())), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: X0 */
    public final void mo84397X0() {
        mo84396W0();
        mo84395V0();
        mo84394U0();
        mo84398Y0();
        mo84354N();
        BottomSheetPresenter bottomSheetPresenter = this.f71065x;
        if (bottomSheetPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            bottomSheetPresenter = null;
        }
        bottomSheetPresenter.sendScreenView();
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [kotlin.d2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84398Y0() {
        /*
            r3 = this;
            com.carrefour.fid.android.shared.util.ServiceUtil r0 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            com.carrefour.fid.android.domain.models.service.models.l r1 = r3.f71062g
            boolean r1 = r0.mo84131m(r1)
            if (r1 == 0) goto L_0x000e
            r3.mo84355f()
            goto L_0x002c
        L_0x000e:
            com.carrefour.fid.android.domain.models.service.models.l r1 = r3.f71062g
            com.carrefour.fid.android.domain.models.service.models.h r0 = r0.mo84130l(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0027
            com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter r2 = r3.f71065x
            if (r2 != 0) goto L_0x0021
            java.lang.String r2 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            r1.mo84291c(r0)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
        L_0x0027:
            if (r1 != 0) goto L_0x002c
            r3.mo84356g()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.storelocator.p048ui.fragments.StoreFacilitiesBottomSheetFragment.mo84398Y0():void");
    }

    /* renamed from: Z0 */
    public final boolean mo84399Z0() {
        C36875x6 x6Var = this.f71066y;
        if (x6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var = null;
        }
        return BottomSheetBehavior.m125237i0(x6Var.f91913c).mo88454u0() == 5;
    }

    /* renamed from: a1 */
    public final void mo84400a1() {
        C36875x6 x6Var = this.f71066y;
        C36875x6 x6Var2 = null;
        if (x6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var = null;
        }
        x6Var.f91920j.mo84366b();
        C36875x6 x6Var3 = this.f71066y;
        if (x6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            x6Var2 = x6Var3;
        }
        x6Var2.f91920j.setVisibility(8);
    }

    /* renamed from: b1 */
    public final void mo84401b1(@C12579k C13747e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f71061f = eVar;
    }

    /* renamed from: c1 */
    public final void mo84402c1(@C12579k C38163l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "store");
        this.f71062g = lVar;
    }

    /* renamed from: d1 */
    public final void mo84403d1(Location location) {
        if (location != null) {
            this.f71063v = location.getLatitude();
            this.f71064w = location.getLongitude();
        }
    }

    /* renamed from: f */
    public void mo84355f() {
        C36875x6 x6Var = this.f71066y;
        if (x6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var = null;
        }
        x6Var.f91921k.setText(getString(R.string.store_exceptional_closed));
        Context context = getContext();
        if (context != null) {
            C36875x6 x6Var2 = this.f71066y;
            if (x6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x6Var2 = null;
            }
            x6Var2.f91921k.setCompoundDrawablesWithIntrinsicBounds(C0507a.m2346b(context, R.drawable.ic_red_oval), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: g */
    public void mo84356g() {
        C36875x6 x6Var = this.f71066y;
        if (x6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var = null;
        }
        x6Var.f91921k.setText(getString(R.string.store_hour_unavailable));
        Context context = getContext();
        if (context != null) {
            C36875x6 x6Var2 = this.f71066y;
            if (x6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x6Var2 = null;
            }
            x6Var2.f91921k.setCompoundDrawablesWithIntrinsicBounds(C0507a.m2346b(context, R.drawable.ic_grey_oval), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: g0 */
    public void mo84357g0(@C12579k C38163l lVar, @C12580l Location location) {
        Intrinsics.checkNotNullParameter(lVar, "storePojo");
        this.f71062g = lVar;
        mo84403d1(location);
        mo84400a1();
        mo84397X0();
        C36875x6 x6Var = this.f71066y;
        if (x6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var = null;
        }
        BottomSheetBehavior i0 = BottomSheetBehavior.m125237i0(x6Var.getRoot());
        Intrinsics.checkNotNullExpressionValue(i0, "from(binding.root)");
        i0.mo88418W0(4);
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: h */
    public void mo84358h(@C12579k List<C38147b> list, @C12579k Calendar calendar) {
        String e;
        Intrinsics.checkNotNullParameter(list, "hourRange");
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        if ((!list.isEmpty()) && (e = list.get(0).mo119254e()) != null) {
            String format = new SimpleDateFormat("EEEE dd MMMM").format(calendar.getTime());
            C36875x6 x6Var = this.f71066y;
            if (x6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x6Var = null;
            }
            x6Var.f91921k.setText(getString(R.string.store_open_date, format, C28932h.f70914a.mo84221L(e)));
            Context context = getContext();
            if (context != null) {
                C36875x6 x6Var2 = this.f71066y;
                if (x6Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x6Var2 = null;
                }
                x6Var2.f91921k.setCompoundDrawablesWithIntrinsicBounds(C0507a.m2346b(context, R.drawable.ic_grey_oval), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    public final void initListener() {
        C36875x6 x6Var = this.f71066y;
        C36875x6 x6Var2 = null;
        if (x6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var = null;
        }
        x6Var.f91914d.setOnClickListener(new C28987f(this));
        C36875x6 x6Var3 = this.f71066y;
        if (x6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x6Var3 = null;
        }
        x6Var3.f91912b.setOnClickListener(new C28988g(this));
        C36875x6 x6Var4 = this.f71066y;
        if (x6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            x6Var2 = x6Var4;
        }
        x6Var2.f91917g.setOnClickListener(new C28989h(this));
    }

    /* renamed from: l */
    public void mo84359l(@C12579k List<C38147b> list) {
        String f;
        Intrinsics.checkNotNullParameter(list, "hourRange");
        if ((!list.isEmpty()) && (f = list.get(list.size() - 1).mo119256f()) != null) {
            C36875x6 x6Var = this.f71066y;
            if (x6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x6Var = null;
            }
            TextView textView = x6Var.f91921k;
            C11368t0 t0Var = C11368t0.f28504a;
            String string = getString(R.string.store_opened);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.store_opened)");
            String format = String.format(string, Arrays.copyOf(new Object[]{C28932h.f70914a.mo84221L(f)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            textView.setText(format);
            Context context = getContext();
            if (context != null) {
                C36875x6 x6Var2 = this.f71066y;
                if (x6Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x6Var2 = null;
                }
                x6Var2.f91921k.setCompoundDrawablesWithIntrinsicBounds(C0507a.m2346b(context, R.drawable.ic_green_oval), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        C36875x6 d = C36875x6.m151217d(getLayoutInflater(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(layoutInflater, container, false)");
        this.f71066y = d;
        C36875x6 x6Var = null;
        this.f71065x = new BottomSheetPresenter((C13783a) null, 1, (DefaultConstructorMarker) null);
        C36875x6 x6Var2 = this.f71066y;
        if (x6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            x6Var = x6Var2;
        }
        NestedScrollView b = x6Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onStart() {
        super.onStart();
        mo84397X0();
        initListener();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f71064w = arguments.getDouble(f71056E0);
            this.f71063v = arguments.getDouble(f71059Z);
        }
        BottomSheetPresenter bottomSheetPresenter = this.f71065x;
        C36875x6 x6Var = null;
        if (bottomSheetPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            bottomSheetPresenter = null;
        }
        bottomSheetPresenter.mo84289a(this);
        C36875x6 x6Var2 = this.f71066y;
        if (x6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            x6Var = x6Var2;
        }
        BottomSheetBehavior i0 = BottomSheetBehavior.m125237i0(x6Var.getRoot());
        Intrinsics.checkNotNullExpressionValue(i0, "from(binding.root)");
        i0.mo88418W0(4);
    }
}
