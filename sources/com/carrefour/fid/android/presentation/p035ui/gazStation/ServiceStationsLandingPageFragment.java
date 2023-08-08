package com.carrefour.fid.android.presentation.p035ui.gazStation;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0302g;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36185p;
import com.carrefour.fid.android.databinding.C36792p3;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.gazStation.C24044t;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.C26350a;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.C28947q;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\u0019\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/gazStation/ServiceStationsLandingPageFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/p3;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "n1", "", "visibility", "o1", "q1", "optinTitleVisibility", "p1", "layoutId", "X0", "initListeners", "j1", "h1", "c1", "f1", "l1", "initUi", "e1", "", "hasLoyaltyCard", "b1", "(Ljava/lang/Boolean;)V", "Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;", "Z0", "()Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;", "r1", "(Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;)V", "serviceStationsAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/ui/gazStation/s;", "g", "Landroidx/navigation/m;", "Y0", "()Lcom/carrefour/fid/android/presentation/ui/gazStation/s;", "args", "Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/ServiceStationsLandingPageViewModel;", "v", "Lkotlin/z;", "a1", "()Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/ServiceStationsLandingPageViewModel;", "serviceStationsLandingPageViewModel", "Landroidx/activity/result/g;", "", "w", "Landroidx/activity/result/g;", "requestPermission", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nServiceStationsLandingPageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceStationsLandingPageFragment.kt\ncom/carrefour/fid/android/presentation/ui/gazStation/ServiceStationsLandingPageFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,164:1\n42#2,3:165\n106#3,15:168\n*S KotlinDebug\n*F\n+ 1 ServiceStationsLandingPageFragment.kt\ncom/carrefour/fid/android/presentation/ui/gazStation/ServiceStationsLandingPageFragment\n*L\n32#1:165,3\n33#1:168,15\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsLandingPageFragment */
public final class ServiceStationsLandingPageFragment extends C24027f<C36792p3> {

    /* renamed from: x */
    public static final int f60218x = 8;
    @Inject

    /* renamed from: f */
    public C26350a f60219f;
    @C12579k

    /* renamed from: g */
    public final C19766m f60220g = new C19766m(C11342l0.m43547d(C24042s.class), new ServiceStationsLandingPageFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: v */
    public final C11677z f60221v;
    @C12579k

    /* renamed from: w */
    public final C0302g<String> f60222w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsLandingPageFragment$a */
    public /* synthetic */ class C24002a implements C19426h0, C11379z {
        public C24002a() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Boolean bool) {
            ServiceStationsLandingPageFragment.this.mo70209b1(bool);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ServiceStationsLandingPageFragment.this, ServiceStationsLandingPageFragment.class, "handleUiServiceStation", "handleUiServiceStation(Ljava/lang/Boolean;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public ServiceStationsLandingPageFragment() {
        super(C240011.f60223a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C24004x59f72daa(new C24003x59f72da9(this)));
        this.f60221v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ServiceStationsLandingPageViewModel.class), new C24005x59f72dab(b), new C24006x59f72dac((C11289a) null, b), new C24007x59f72dad(this, b));
        this.f60222w = FragmentKt.m118833u(this, new ServiceStationsLandingPageFragment$requestPermission$1(this), ServiceStationsLandingPageFragment$requestPermission$2.f60226f);
    }

    /* renamed from: d1 */
    public static final void m105965d1(ServiceStationsLandingPageFragment serviceStationsLandingPageFragment, View view) {
        Intrinsics.checkNotNullParameter(serviceStationsLandingPageFragment, "this$0");
        FragmentKt.m118823k(serviceStationsLandingPageFragment, C24044t.C24047c.m106097b(C24044t.f60289a, false, 1, (Object) null));
        serviceStationsLandingPageFragment.mo70207Z0().mo76661d();
    }

    /* renamed from: g1 */
    public static final void m105966g1(ServiceStationsLandingPageFragment serviceStationsLandingPageFragment, View view) {
        Intrinsics.checkNotNullParameter(serviceStationsLandingPageFragment, "this$0");
        serviceStationsLandingPageFragment.mo70207Z0().mo76662e();
        FragmentKt.m118823k(serviceStationsLandingPageFragment, C24044t.C24047c.m106098d(C24044t.f60289a, false, 1, (Object) null));
    }

    /* renamed from: i1 */
    public static final void m105967i1(ServiceStationsLandingPageFragment serviceStationsLandingPageFragment, View view) {
        Intrinsics.checkNotNullParameter(serviceStationsLandingPageFragment, "this$0");
        FragmentExtensionKt.m58766q(serviceStationsLandingPageFragment, (C11289a) null, 1, (Object) null);
    }

    /* renamed from: k1 */
    public static final void m105968k1(ServiceStationsLandingPageFragment serviceStationsLandingPageFragment, View view) {
        Intrinsics.checkNotNullParameter(serviceStationsLandingPageFragment, "this$0");
        FragmentKt.m118812C(serviceStationsLandingPageFragment, C36185p.f89343e);
        serviceStationsLandingPageFragment.mo70207Z0().mo76664g();
    }

    /* renamed from: m1 */
    public static final void m105969m1(ServiceStationsLandingPageFragment serviceStationsLandingPageFragment, View view) {
        Intrinsics.checkNotNullParameter(serviceStationsLandingPageFragment, "this$0");
        C19501x.m90847a(serviceStationsLandingPageFragment).mo57477c(new ServiceStationsLandingPageFragment$initServiceScanCbListener$1$1(serviceStationsLandingPageFragment, (C11045c<? super ServiceStationsLandingPageFragment$initServiceScanCbListener$1$1>) null));
        serviceStationsLandingPageFragment.f60222w.mo960b("android.permission.CAMERA");
        serviceStationsLandingPageFragment.mo70207Z0().mo76663f();
    }

    /* renamed from: X0 */
    public final void mo70205X0(int i) {
        C16934c cVar = new C16934c();
        cVar.mo50824H(((C36792p3) getBinding()).f91486f.f91093o);
        cVar.mo50832L(R.id.customerService, 3, i, 4, 18);
        cVar.mo50900r(((C36792p3) getBinding()).f91486f.f91093o);
    }

    /* renamed from: Y0 */
    public final C24042s mo70206Y0() {
        return (C24042s) this.f60220g.getValue();
    }

    @C12579k
    /* renamed from: Z0 */
    public final C26350a mo70207Z0() {
        C26350a aVar = this.f60219f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("serviceStationsAnalyticsViewModel");
        return null;
    }

    /* renamed from: a1 */
    public final ServiceStationsLandingPageViewModel mo70208a1() {
        return (ServiceStationsLandingPageViewModel) this.f60221v.getValue();
    }

    /* renamed from: b1 */
    public final void mo70209b1(Boolean bool) {
        int i;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.areEqual((Object) bool, (Object) bool2)) {
            i = 8;
        } else {
            i = 0;
        }
        mo70221q1(i);
        mo70219o1(i);
        mo70220p1(i);
        if (!Intrinsics.areEqual((Object) bool, (Object) bool2)) {
            mo70219o1(0);
            mo70205X0(R.id.service_fid_block);
            return;
        }
        mo70219o1(8);
        mo70205X0(R.id.service_scan_block);
    }

    /* renamed from: c1 */
    public final void mo70210c1() {
        ((C36792p3) getBinding()).f91486f.f91084f.f91030b.setOnClickListener(new C24037n(this));
    }

    /* renamed from: e1 */
    public final void mo70211e1() {
        if ((!C11622t.isBlank(mo70206Y0().mo70333g())) && (!C11622t.isBlank(mo70206Y0().mo70332f()))) {
            TextView textView = ((C36792p3) getBinding()).f91486f.f91083e;
            textView.setText(getString(R.string.service_station_date, mo70206Y0().mo70333g(), mo70206Y0().mo70332f()));
            textView.setVisibility(0);
        }
    }

    /* renamed from: f1 */
    public final void mo70212f1() {
        ((C36792p3) getBinding()).f91486f.f91084f.f91031c.setOnClickListener(new C24041r(this));
    }

    /* renamed from: h1 */
    public final void mo70213h1() {
        ((C36792p3) getBinding()).f91486f.f91081c.setOnClickListener(new C24039p(this));
    }

    public final void initListeners() {
        mo70216j1();
        mo70213h1();
        mo70210c1();
        mo70212f1();
        mo70217l1();
    }

    public final void initUi() {
        mo70211e1();
    }

    /* renamed from: j1 */
    public final void mo70216j1() {
        ((C36792p3) getBinding()).f91486f.f91085g.setOnClickListener(new C24040q(this));
    }

    /* renamed from: l1 */
    public final void mo70217l1() {
        ((C36792p3) getBinding()).f91486f.f91088j.f90980b.setOnClickListener(new C24038o(this));
    }

    /* renamed from: n1 */
    public final void mo70218n1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.service_stations_toolbar_title);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, ServiceStationsLandingPageFragment$initToolbar$1$1.f60225f, 1, (Object) null);
        }
    }

    /* renamed from: o1 */
    public final void mo70219o1(int i) {
        ((C36792p3) getBinding()).f91486f.f91084f.getRoot().setVisibility(i);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo70207Z0().mo76658a();
        mo70218n1();
        initListeners();
        initUi();
        ServiceStationsLandingPageViewModel a1 = mo70208a1();
        C19501x.m90847a(this).mo57476b(new ServiceStationsLandingPageFragment$onViewCreated$1$1(a1, (C11045c<? super ServiceStationsLandingPageFragment$onViewCreated$1$1>) null));
        C28947q<Boolean> i0 = a1.mo76637i0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        i0.mo57491k(viewLifecycleOwner, new C24002a());
    }

    /* renamed from: p1 */
    public final void mo70220p1(int i) {
        ((C36792p3) getBinding()).f91486f.f91082d.setVisibility(i);
    }

    /* renamed from: q1 */
    public final void mo70221q1(int i) {
        ((C36792p3) getBinding()).f91486f.f91088j.getRoot().setVisibility(i);
    }

    /* renamed from: r1 */
    public final void mo70222r1(@C12579k C26350a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f60219f = aVar;
    }
}
