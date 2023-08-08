package com.carrefour.fid.android.storelocator.p048ui.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.C14065q0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.databinding.C36822s3;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.shared.base.C28494o;
import com.carrefour.fid.android.storelocator.presentation.contracts.C28960b;
import com.carrefour.fid.android.storelocator.presentation.presenters.C28966a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/storelocator/ui/fragments/FacilitiesFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/s3;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "T0", "initListeners", "Lcom/carrefour/fid/android/storelocator/presentation/contracts/b;", "a", "Lcom/carrefour/fid/android/storelocator/presentation/contracts/b;", "mPresenter", "Lcom/carrefour/fid/android/storelocator/ui/fragments/b;", "b", "Landroidx/navigation/m;", "R0", "()Lcom/carrefour/fid/android/storelocator/ui/fragments/b;", "args", "<init>", "()V", "c", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nFacilitiesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacilitiesFragment.kt\ncom/carrefour/fid/android/storelocator/ui/fragments/FacilitiesFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,48:1\n42#2,3:49\n*S KotlinDebug\n*F\n+ 1 FacilitiesFragment.kt\ncom/carrefour/fid/android/storelocator/ui/fragments/FacilitiesFragment\n*L\n23#1:49,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.storelocator.ui.fragments.FacilitiesFragment */
public final class FacilitiesFragment extends C28494o<C36822s3> {
    @C12579k

    /* renamed from: c */
    public static final C28973a f71035c = new C28973a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f71036d = 8;
    @C12579k

    /* renamed from: e */
    public static final String f71037e = "FacilitiesHomeFragment";

    /* renamed from: a */
    public C28960b f71038a;
    @C12579k

    /* renamed from: b */
    public final C19766m f71039b = new C19766m(C11342l0.m43547d(C28982b.class), new FacilitiesFragment$special$$inlined$navArgs$1(this));

    /* renamed from: com.carrefour.fid.android.storelocator.ui.fragments.FacilitiesFragment$a */
    public static final class C28973a {
        public /* synthetic */ C28973a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28973a() {
        }
    }

    public FacilitiesFragment() {
        super(C289721.f71040a);
    }

    /* renamed from: S0 */
    public static final void m119875S0(FacilitiesFragment facilitiesFragment, View view) {
        Intrinsics.checkNotNullParameter(facilitiesFragment, "this$0");
        C28960b bVar = facilitiesFragment.f71038a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            bVar = null;
        }
        bVar.mo84295a();
        C19736g.m91827a(facilitiesFragment).mo58130W(R.id.store_locator_graph, new C14065q0(facilitiesFragment.mo84373R0().mo84411e()).mo34331f());
    }

    /* renamed from: R0 */
    public final C28982b mo84373R0() {
        return (C28982b) this.f71039b.getValue();
    }

    /* renamed from: T0 */
    public final void mo84374T0() {
        ToolBarDefaultView M1;
        C19232h activity = getActivity();
        BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
        if (bottomNavActivity != null && (M1 = bottomNavActivity.mo121107M1()) != null) {
            ToolBarDefaultView.setup$default(M1, (C11300l) null, FacilitiesFragment$initToolbar$1.f71041f, 1, (Object) null);
        }
    }

    public final void initListeners() {
        ((C36822s3) getBinding()).f91630b.setOnClickListener(new C28981a(this));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C28966a aVar = new C28966a((C13783a) null, 1, (DefaultConstructorMarker) null);
        this.f71038a = aVar;
        aVar.sendScreenView();
        mo84374T0();
        initListeners();
    }
}
