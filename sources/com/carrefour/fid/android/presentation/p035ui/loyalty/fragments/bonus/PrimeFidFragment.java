package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.cms.data.entities.PictoPrimeCmsResponse;
import com.carrefour.fid.android.cms.data.entities.UrlPrimeCmsResponse;
import com.carrefour.fid.android.cms.data.mappers.C40022a;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.databinding.C36656b7;
import com.carrefour.fid.android.databinding.C36662c3;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.loyalty.adapters.C24229f;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p009io.github.aakira.napier.C10848c;

@C10164b
@C11076d0(mo22515d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0019\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0004H\u0002J\u0016\u0010\u001f\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0019\u0010 \u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b \u0010\u001aJ\b\u0010!\u001a\u00020\u0004H\u0002J\b\u0010\"\u001a\u00020\u0004H\u0002J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001dH\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001dH\u0016R\u001b\u00101\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;¨\u0006?"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/PrimeFidFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/c3;", "Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/f$a;", "Lkotlin/d2;", "h1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/mvi/a$c;", "state", "n1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/mvi/a$b;", "event", "m1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/mvi/a$a;", "error", "Z0", "c1", "", "selectionChanged", "i1", "g1", "initListeners", "enabled", "d1", "o1", "isLoading", "b1", "(Ljava/lang/Boolean;)V", "j1", "", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "itemsPrimes", "a1", "e1", "k1", "l1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "h0", "prime", "sendTagPrimeAdded", "sendTagPrimeRemoved", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/i;", "f", "Landroidx/navigation/m;", "X0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/i;", "args", "Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/f;", "g", "Lkotlin/z;", "W0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/f;", "adapter", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/PrimeFidListViewModel;", "v", "Y0", "()Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/PrimeFidListViewModel;", "viewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPrimeFidFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimeFidFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/PrimeFidFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,212:1\n42#2,3:213\n106#3,15:216\n168#4,7:231\n183#4,6:238\n11335#5:244\n11670#5,3:245\n1549#6:248\n1620#6,3:249\n262#7,2:252\n*S KotlinDebug\n*F\n+ 1 PrimeFidFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/bonus/PrimeFidFragment\n*L\n37#1:213,3\n41#1:216,15\n51#1:231,7\n52#1:238,6\n126#1:244\n126#1:245,3\n190#1:248\n190#1:249,3\n201#1:252,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.PrimeFidFragment */
public final class PrimeFidFragment extends C24307b<C36662c3> implements C24229f.C24230a {

    /* renamed from: w */
    public static final int f60717w = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f60718f = new C19766m(C11342l0.m43547d(C24317i.class), new PrimeFidFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: g */
    public final C11677z f60719g = C10864b0.m38748c(new PrimeFidFragment$adapter$2(this));
    @C12579k

    /* renamed from: v */
    public final C11677z f60720v;

    public PrimeFidFragment() {
        super(C242971.f60721a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new PrimeFidFragment$special$$inlined$viewModels$default$2(new PrimeFidFragment$special$$inlined$viewModels$default$1(this)));
        this.f60720v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(PrimeFidListViewModel.class), new PrimeFidFragment$special$$inlined$viewModels$default$3(b), new PrimeFidFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new PrimeFidFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: f1 */
    public static final void m106832f1(PrimeFidFragment primeFidFragment, View view) {
        Intrinsics.checkNotNullParameter(primeFidFragment, "this$0");
        primeFidFragment.mo71081Y0().sendIntent(new C26522a.C26533d.C26541h(primeFidFragment.mo71079W0().mo70911k()));
    }

    /* renamed from: W0 */
    public final C24229f mo71079W0() {
        return (C24229f) this.f60719g.getValue();
    }

    /* renamed from: X0 */
    public final C24317i mo71080X0() {
        return (C24317i) this.f60718f.getValue();
    }

    /* renamed from: Y0 */
    public final PrimeFidListViewModel mo71081Y0() {
        return (PrimeFidListViewModel) this.f60720v.getValue();
    }

    /* renamed from: Z0 */
    public final void mo71082Z0(C26522a.C26523a aVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) C26522a.C26523a.C26526c.f64826a)) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_error_parameters_server_not_responding_01);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_01)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            mo71094l1();
            return;
        }
        C28935i.m119705e(C28935i.f70940a, aVar.toString(), (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: a1 */
    public final void mo71083a1(List<DataPrimeCmsResponse> list) {
        TextView textView;
        C24229f W0 = mo71079W0();
        Iterable<DataPrimeCmsResponse> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (DataPrimeCmsResponse copy$default : iterable) {
            arrayList.add(DataPrimeCmsResponse.copy$default(copy$default, (String) null, (String) null, (PictoPrimeCmsResponse) null, (PictoPrimeCmsResponse) null, (UrlPrimeCmsResponse) null, (String) null, (String) null, false, 255, (Object) null));
        }
        W0.mo70915o(arrayList);
        ((C36662c3) getBinding()).f90645i.setHasFixedSize(true);
        ((C36662c3) getBinding()).f90645i.setAdapter(mo71079W0());
        ((C36662c3) getBinding()).f90643g.f90686c.setText(Html.fromHtml(getString(R.string.primes_fid_header), 63));
        C36656b7 b7Var = ((C36662c3) getBinding()).f90640d;
        if (b7Var != null) {
            textView = b7Var.f90616b;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(Html.fromHtml(getString(R.string.primes_fid_cgu), 63));
        }
        initListeners();
    }

    /* renamed from: b1 */
    public final void mo71084b1(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            ((C36662c3) getBinding()).f90642f.setVisibility(0);
            ((C36662c3) getBinding()).f90641e.setVisibility(8);
            return;
        }
        ((C36662c3) getBinding()).f90642f.setVisibility(8);
        ((C36662c3) getBinding()).f90641e.setVisibility(0);
    }

    /* renamed from: c1 */
    public final void mo71085c1() {
        mo71081Y0().sendIntent(new C26522a.C26533d.C26534a(mo71079W0().mo70911k()));
    }

    /* renamed from: d1 */
    public final void mo71086d1(boolean z) {
        ((C36662c3) getBinding()).f90639c.setEnabled(z);
    }

    /* renamed from: e1 */
    public final void mo71087e1(Boolean bool) {
        int i;
        ProgressBar progressBar = ((C36662c3) getBinding()).f90644h;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBar");
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: g1 */
    public final void mo71088g1() {
        ArrayList arrayList;
        LoyaltyBonus[] f = mo71080X0().mo71140f();
        if (f != null) {
            arrayList = new ArrayList(f.length);
            for (LoyaltyBonus a : f) {
                arrayList.add(C40022a.m162997a(a));
            }
        } else {
            arrayList = null;
        }
        if (mo71080X0().mo71141g() || arrayList == null) {
            mo71081Y0().sendIntent(new C26522a.C26533d.C26536c(true));
        } else {
            mo71081Y0().sendIntent(new C26522a.C26533d.C26538e(arrayList));
        }
    }

    /* renamed from: h0 */
    public void mo70916h0() {
        mo71081Y0().sendIntent(new C26522a.C26533d.C26539f(mo71079W0().mo70911k()));
    }

    /* renamed from: h1 */
    public final void mo71089h1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.primes_title_bar);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, PrimeFidFragment$initToolbar$1$1.f60730f, 1, (Object) null);
        }
    }

    /* renamed from: i1 */
    public final void mo71090i1(boolean z) {
        if (z) {
            String string = getString(R.string.primes_fid_dialog_confirm_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.prime…fid_dialog_confirm_title)");
            String string2 = getString(R.string.primes_fid_dialog_confirm_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.prime…d_dialog_confirm_message)");
            FragmentKt.m118838z(this, string, string2, getString(R.string.yes), new PrimeFidFragment$onBackPressedEvent$1(this), getString(R.string.no), false, PrimeFidFragment$onBackPressedEvent$2.f60731f, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
            return;
        }
        mo71094l1();
    }

    public final void initListeners() {
        ((C36662c3) getBinding()).f90639c.setOnClickListener(new C24316h(this));
    }

    /* renamed from: j1 */
    public final void mo71092j1() {
        mo71097o1();
    }

    /* renamed from: k1 */
    public final void mo71093k1() {
        mo71094l1();
    }

    /* renamed from: l1 */
    public final void mo71094l1() {
        C19736g.m91827a(this).mo58156s0();
    }

    /* renamed from: m1 */
    public final void mo71095m1(C26522a.C26527b bVar) {
        if (bVar instanceof C26522a.C26527b.C26528a) {
            mo71082Z0(((C26522a.C26527b.C26528a) bVar).mo77130d());
        } else if (bVar instanceof C26522a.C26527b.C26531d) {
            mo71093k1();
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C26522a.C26527b.C26529b.f64830a)) {
            mo71092j1();
        } else if (bVar instanceof C26522a.C26527b.C26530c) {
            mo71090i1(((C26522a.C26527b.C26530c) bVar).mo77136d());
        }
    }

    /* renamed from: n1 */
    public final void mo71096n1(C26522a.C26532c cVar) {
        mo71084b1(Boolean.valueOf(cVar.isLoading()));
        mo71083a1(cVar.mo77156k());
        mo71087e1(Boolean.valueOf(cVar.mo77158m()));
        mo71086d1(cVar.mo77157l());
    }

    /* renamed from: o1 */
    public final void mo71097o1() {
        String string = getString(R.string.primes_fid_dialog_first_launch_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.prime…ialog_first_launch_title)");
        String string2 = getString(R.string.primes_fid_dialog_first_launch_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.prime…log_first_launch_message)");
        FragmentKt.m118838z(this, string, string2, (String) null, (C11289a) null, getString(R.string.primes_fid_dialog_first_launch_more_information), false, new PrimeFidFragment$showDialogInfo$1(this), getString(R.string.ok_uppercase), new PrimeFidFragment$showDialogInfo$2(this), (C11289a) null, (Drawable) null, 0, 3628, (Object) null);
        mo71081Y0().sendTagDisplayPopinPrimesFid();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new PrimeFidFragment$onViewCreated$1(this));
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo71089h1();
        mo71081Y0().sendScreenViewBonus();
        PrimeFidListViewModel Y0 = mo71081Y0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new PrimeFidFragment$onViewCreated$$inlined$processState$1(this, Y0, (C11045c) null, this), 3, (Object) null);
        PrimeFidListViewModel Y02 = mo71081Y0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new PrimeFidFragment$onViewCreated$$inlined$processEvent$1(this, Y02, (C11045c) null, this), 3, (Object) null);
        mo71088g1();
        C19501x.m90847a(this).mo57477c(new PrimeFidFragment$onViewCreated$4(this, (C11045c<? super PrimeFidFragment$onViewCreated$4>) null));
    }

    public void sendTagPrimeAdded(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "prime");
        mo71081Y0().sendTagPrimeAdded(dataPrimeCmsResponse);
    }

    public void sendTagPrimeRemoved(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "prime");
        mo71081Y0().sendTagPrimeRemoved(dataPrimeCmsResponse);
    }
}
