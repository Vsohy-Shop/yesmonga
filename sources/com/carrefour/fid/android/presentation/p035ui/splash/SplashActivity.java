package com.carrefour.fid.android.presentation.p035ui.splash;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19501x;
import androidx.lifecycle.ViewModelLazy;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.databinding.C36668d;
import com.carrefour.fid.android.databinding.C36867w8;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils;
import com.carrefour.fid.android.presentation.models.C38525q;
import com.carrefour.fid.android.presentation.viewmodels.privacy.PrivacyViewModel;
import com.carrefour.fid.android.presentation.viewmodels.splash.C27420a;
import com.carrefour.fid.android.presentation.viewmodels.splash.C27422c;
import com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel;
import com.carrefour.fid.android.shared.base.C28502s;
import com.carrefour.fid.android.shared.base.ObserverWhileResumedImpl;
import com.carrefour.fid.android.shared.extension.ConnectivityKt;
import com.carrefour.fid.android.shared.util.environment.C28912a;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"CustomSplashScreen"})
@C10164b
@C11076d0(mo22515d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\bC\u0010DJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010!\u001a\u00020\u0004H\u0002J\b\u0010\"\u001a\u00020\u0004H\u0002J\b\u0010#\u001a\u00020\u0004H\u0002J\u0019\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b%\u0010&R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8BX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006G"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/splash/SplashActivity;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "onDestroy", "p1", "Lcom/carrefour/fid/android/presentation/models/q;", "privacyModel", "", "isConnected", "j1", "Lcom/carrefour/fid/android/presentation/viewmodels/splash/c$b;", "state", "u1", "Lcom/carrefour/fid/android/presentation/viewmodels/splash/c$a;", "event", "k1", "q1", "Lcom/carrefour/fid/android/shared/util/environment/a;", "type", "", "version", "o1", "firstLaunch", "", "launchCount", "n1", "w1", "cardNumber", "userFullName", "m1", "s1", "t1", "l1", "loading", "i1", "(Ljava/lang/Boolean;)V", "Lcom/carrefour/fid/android/presentation/viewmodels/splash/a;", "X0", "Lcom/carrefour/fid/android/presentation/viewmodels/splash/a;", "g1", "()Lcom/carrefour/fid/android/presentation/viewmodels/splash/a;", "v1", "(Lcom/carrefour/fid/android/presentation/viewmodels/splash/a;)V", "splashAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/splash/SplashViewModel;", "Y0", "Lkotlin/z;", "h1", "()Lcom/carrefour/fid/android/presentation/viewmodels/splash/SplashViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/privacy/PrivacyViewModel;", "Z0", "f1", "()Lcom/carrefour/fid/android/presentation/viewmodels/privacy/PrivacyViewModel;", "privacyViewModel", "Lcom/carrefour/fid/android/databinding/d;", "a1", "d1", "()Lcom/carrefour/fid/android/databinding/d;", "binding", "Lcom/carrefour/fid/android/databinding/w8;", "e1", "()Lcom/carrefour/fid/android/databinding/w8;", "bindingViewSplashContent", "<init>", "()V", "b1", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nSplashActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashActivity.kt\ncom/carrefour/fid/android/presentation/ui/splash/SplashActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 FragmentViewBindingDelegate.kt\ncom/carrefour/fid/android/shared/util/FragmentViewBindingDelegateKt\n+ 4 Activity.kt\ncom/carrefour/fid/android/shared/extension/ActivityKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 8 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,233:1\n75#2,13:234\n75#2,13:247\n113#3,3:260\n201#4:263\n202#4:269\n203#4:272\n212#4:273\n213#4:279\n214#4:282\n53#5:264\n55#5:268\n53#5:274\n55#5:278\n50#6:265\n55#6:267\n50#6:275\n55#6:277\n106#7:266\n106#7:276\n47#8,2:270\n47#8,2:280\n1#9:283\n262#10,2:284\n*S KotlinDebug\n*F\n+ 1 SplashActivity.kt\ncom/carrefour/fid/android/presentation/ui/splash/SplashActivity\n*L\n60#1:234,13\n62#1:247,13\n64#1:260,3\n72#1:263\n72#1:269\n72#1:272\n73#1:273\n73#1:279\n73#1:282\n72#1:264\n72#1:268\n73#1:274\n73#1:278\n72#1:265\n72#1:267\n73#1:275\n73#1:277\n72#1:266\n73#1:276\n72#1:270,2\n73#1:280,2\n230#1:284,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.splash.SplashActivity */
public final class SplashActivity extends C25742a {
    @C12579k

    /* renamed from: b1 */
    public static final C25732a f63052b1 = new C25732a((DefaultConstructorMarker) null);

    /* renamed from: c1 */
    public static final int f63053c1 = 8;

    /* renamed from: d1 */
    public static final long f63054d1 = 2000;

    /* renamed from: e1 */
    public static final long f63055e1 = 500;
    @Inject

    /* renamed from: X0 */
    public C27420a f63056X0;
    @C12579k

    /* renamed from: Y0 */
    public final C11677z f63057Y0 = new ViewModelLazy(C11342l0.m43547d(SplashViewModel.class), new SplashActivity$special$$inlined$viewModels$default$2(this), new SplashActivity$special$$inlined$viewModels$default$1(this), new SplashActivity$special$$inlined$viewModels$default$3((C11289a) null, this));
    @C12579k

    /* renamed from: Z0 */
    public final C11677z f63058Z0 = new ViewModelLazy(C11342l0.m43547d(PrivacyViewModel.class), new SplashActivity$special$$inlined$viewModels$default$5(this), new SplashActivity$special$$inlined$viewModels$default$4(this), new SplashActivity$special$$inlined$viewModels$default$6((C11289a) null, this));
    @C12579k

    /* renamed from: a1 */
    public final C11677z f63059a1 = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new SplashActivity$special$$inlined$viewBinding$1(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.splash.SplashActivity$a */
    public static final class C25732a {
        public /* synthetic */ C25732a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25732a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.splash.SplashActivity$b */
    public static final class C25733b implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f63060a;

        public C25733b(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f63060a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f63060a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f63060a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: r1 */
    public static final void m110450r1(SplashActivity splashActivity, View view) {
        Intrinsics.checkNotNullParameter(splashActivity, "this$0");
        view.setEnabled(false);
        splashActivity.mo74725h1().sendIntent(C27422c.C27434c.C27436b.f66548a);
    }

    /* renamed from: d1 */
    public final C36668d mo74721d1() {
        return (C36668d) this.f63059a1.getValue();
    }

    /* renamed from: e1 */
    public final C36867w8 mo74722e1() {
        C36867w8 w8Var = mo74721d1().f90700d;
        Intrinsics.checkNotNullExpressionValue(w8Var, "binding.viewSplashContent");
        return w8Var;
    }

    /* renamed from: f1 */
    public final PrivacyViewModel mo74723f1() {
        return (PrivacyViewModel) this.f63058Z0.getValue();
    }

    @C12579k
    /* renamed from: g1 */
    public final C27420a mo74724g1() {
        C27420a aVar = this.f63056X0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("splashAnalyticsViewModel");
        return null;
    }

    /* renamed from: h1 */
    public final SplashViewModel mo74725h1() {
        return (SplashViewModel) this.f63057Y0.getValue();
    }

    /* renamed from: i1 */
    public final void mo74726i1(Boolean bool) {
        int i;
        ProgressBar progressBar = mo74722e1().f91876d;
        Intrinsics.checkNotNullExpressionValue(progressBar, "bindingViewSplashContent.progressBarRemoteConfig");
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: j1 */
    public final void mo74727j1(C38525q qVar, boolean z) {
        boolean z2 = false;
        if (qVar != null && qVar.mo122143d()) {
            z2 = true;
        }
        if (z2) {
            mo74723f1().mo78966r0(this, new SplashActivity$handlePrivacyResult$1(this, z));
        } else {
            mo74739w1(z);
        }
    }

    /* renamed from: k1 */
    public final void mo74728k1(C27422c.C27423a aVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) C27422c.C27423a.C27429f.f66539a)) {
            mo74729l1();
        } else if (aVar instanceof C27422c.C27423a.C27425b) {
            C27422c.C27423a.C27425b bVar = (C27422c.C27423a.C27425b) aVar;
            mo74732o1(bVar.mo79762e(), bVar.mo79764f());
        } else if (aVar instanceof C27422c.C27423a.C27426c) {
            C27422c.C27423a.C27426c cVar = (C27422c.C27423a.C27426c) aVar;
            mo74731n1(cVar.mo79772f(), cVar.mo79770e());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27422c.C27423a.C27427d.f66535a)) {
            mo74735s1();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27422c.C27423a.C27428e.f66537a)) {
            mo74736t1();
        } else if (aVar instanceof C27422c.C27423a.C27424a) {
            mo74724g1().mo79742a(((C27422c.C27423a.C27424a) aVar).mo79755d());
        }
    }

    /* renamed from: l1 */
    public final void mo74729l1() {
        MaterialButton materialButton = mo74722e1().f91874b;
        materialButton.setVisibility(0);
        materialButton.setEnabled(true);
        mo74724g1().mo79744c();
    }

    /* renamed from: m1 */
    public final void mo74730m1(String str, String str2) {
        boolean z;
        LoyaltyCardType a = LoyaltyCardType.f89888a.mo108568a(LoyaltyUtils.INSTANCE.getTypeCard(str));
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ComposeView composeView = mo74721d1().f90698b;
            Intrinsics.checkNotNullExpressionValue(composeView, "binding.bottomSheetComponent");
            ViewKt.m152126h(composeView, (Integer) null, 0, false, (C11289a) null, 15, (Object) null);
            return;
        }
        mo74721d1().f90698b.setContent(C8553b.m31049c(83352168, true, new SplashActivity$handlerLoyaltyCardFid$1(str, str2, a, this)));
    }

    /* renamed from: n1 */
    public final void mo74731n1(boolean z, int i) {
        C27420a g1 = mo74724g1();
        g1.mo79750i(i);
        g1.mo79746e();
    }

    /* renamed from: o1 */
    public final void mo74732o1(C28912a aVar, String str) {
        String str2;
        mo74722e1().f91878f.setText(str);
        TextView textView = mo74722e1().f91877e;
        if (Intrinsics.areEqual((Object) aVar, (Object) C28912a.C28914b.f70835f)) {
            str2 = null;
        } else {
            str2 = getString(aVar.mo84189b());
        }
        textView.setText(str2);
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo74721d1().getRoot());
        mo74733p1();
        mo74734q1();
        new ObserverWhileResumedImpl(this, new SplashActivity$onCreate$$inlined$processState$1(mo74725h1().getUiState(), this), new SplashActivity$onCreate$$inlined$processState$2((C11045c) null));
        new ObserverWhileResumedImpl(this, new SplashActivity$onCreate$$inlined$processEvent$1(mo74725h1().getUiEvent(), this), new SplashActivity$onCreate$$inlined$processEvent$2((C11045c) null));
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(ConnectivityKt.m118750b(this), C11768d1.m46781c()), new SplashActivity$onCreate$3(this, (C11045c<? super SplashActivity$onCreate$3>) null)), C19501x.m90847a(this));
    }

    public void onDestroy() {
        C28502s.C28503a.m118425a(mo74723f1(), this, (Boolean) null, 2, (Object) null);
        super.onDestroy();
    }

    /* renamed from: p1 */
    public final void mo74733p1() {
        ComposeView composeView = mo74722e1().f91875c;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f39397b);
        composeView.setContent(ComposableSingletons$SplashActivityKt.f63044a.mo74716b());
    }

    /* renamed from: q1 */
    public final void mo74734q1() {
        MaterialButton materialButton = mo74722e1().f91874b;
        materialButton.setVisibility(4);
        materialButton.setOnClickListener(new C25744b(this));
    }

    /* renamed from: s1 */
    public final void mo74735s1() {
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(ConnectivityKt.m118750b(this), C11768d1.m46781c()), new SplashActivity$navigateToHome$1(this, (C11045c<? super SplashActivity$navigateToHome$1>) null)), C19501x.m90847a(this));
    }

    /* renamed from: t1 */
    public final void mo74736t1() {
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new SplashActivity$navigateToOnBoarding$1(this, (C11045c<? super SplashActivity$navigateToOnBoarding$1>) null), 3, (Object) null);
    }

    /* renamed from: u1 */
    public final void mo74737u1(C27422c.C27430b bVar) {
        if (bVar instanceof C27422c.C27430b.C27432b) {
            mo74726i1(Boolean.FALSE);
            C27422c.C27430b.C27432b bVar2 = (C27422c.C27430b.C27432b) bVar;
            String i = bVar2.mo79780i();
            if (i != null) {
                mo74730m1(i, bVar2.mo79781j());
            }
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C27422c.C27430b.C27433c.f66544b)) {
            mo74726i1(Boolean.TRUE);
        }
    }

    /* renamed from: v1 */
    public final void mo74738v1(@C12579k C27420a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f63056X0 = aVar;
    }

    /* renamed from: w1 */
    public final void mo74739w1(boolean z) {
        mo74725h1().sendIntent(C27422c.C27434c.C27437c.f66550a);
        if (z) {
            ComposeView composeView = mo74721d1().f90698b;
            Intrinsics.checkNotNullExpressionValue(composeView, "binding.bottomSheetComponent");
            ViewKt.m152126h(composeView, (Integer) null, 0, false, (C11289a) null, 15, (Object) null);
            mo74725h1().sendIntent(C27422c.C27434c.C27438d.f66552a);
            return;
        }
        mo74724g1().mo79743b();
        mo74725h1().sendIntent(C27422c.C27434c.C27435a.f66546a);
        ComposeView composeView2 = mo74721d1().f90698b;
        Intrinsics.checkNotNullExpressionValue(composeView2, "binding.bottomSheetComponent");
        ViewKt.m152123e(composeView2, (Integer) null, false, (C11289a) null, 7, (Object) null);
    }
}
