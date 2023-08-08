package com.carrefour.fid.android.presentation.p035ui.environment;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.C8698y1;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.listeners.C13830b;
import com.carrefour.fid.android.databinding.C36779o0;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.presentation.p035ui.environment.adapter.C23987a;
import com.carrefour.fid.android.presentation.viewmodels.environment.AppEnvironmentSelectionViewModel;
import com.carrefour.fid.android.shared.base.C28502s;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.carrefour.fid.android.shared.util.environment.C28912a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.firebase.installations.C33124s;
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
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b8\u00109J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0002R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006<"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/environment/AppEnvironmentSelectionFragment;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "onDestroy", "", "throwable", "Y0", "", "isLoading", "Z0", "(Ljava/lang/Boolean;)V", "Lcom/carrefour/fid/android/shared/util/environment/a;", "type", "W0", "S0", "Lcom/carrefour/fid/android/databinding/o0;", "f", "Lkotlin/z;", "V0", "()Lcom/carrefour/fid/android/databinding/o0;", "binding", "Lcom/carrefour/fid/android/presentation/viewmodels/environment/AppEnvironmentSelectionViewModel;", "g", "U0", "()Lcom/carrefour/fid/android/presentation/viewmodels/environment/AppEnvironmentSelectionViewModel;", "appEnvironmentSelectionViewModel", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "v", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "T0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "a1", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "appEnvironment", "Lcom/carrefour/fid/android/app/listeners/b;", "w", "Lcom/carrefour/fid/android/app/listeners/b;", "listener", "x", "Z", "restartOnDismiss", "Lcom/carrefour/fid/android/app/listeners/b$a;", "y", "Lcom/carrefour/fid/android/app/listeners/b$a;", "selectionListener", "<init>", "()V", "z", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAppEnvironmentSelectionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEnvironmentSelectionFragment.kt\ncom/carrefour/fid/android/presentation/ui/environment/AppEnvironmentSelectionFragment\n+ 2 FragmentViewBindingDelegate.kt\ncom/carrefour/fid/android/shared/util/FragmentViewBindingDelegateKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,176:1\n120#2,3:177\n106#3,15:180\n*S KotlinDebug\n*F\n+ 1 AppEnvironmentSelectionFragment.kt\ncom/carrefour/fid/android/presentation/ui/environment/AppEnvironmentSelectionFragment\n*L\n50#1:177,3\n51#1:180,15\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.environment.AppEnvironmentSelectionFragment */
public final class AppEnvironmentSelectionFragment extends C23991d {

    /* renamed from: E0 */
    public static final long f60176E0 = 2500;

    /* renamed from: X */
    public static final int f60177X = 8;
    @C12579k

    /* renamed from: Y */
    public static final String f60178Y = "AppEnvironmentSelectionFragment";

    /* renamed from: Z */
    public static final long f60179Z = 1000;
    @C12579k

    /* renamed from: z */
    public static final C23976a f60180z = new C23976a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public final C11677z f60181f;
    @C12579k

    /* renamed from: g */
    public final C11677z f60182g;
    @Inject

    /* renamed from: v */
    public AppEnvironment f60183v;
    @C12580l

    /* renamed from: w */
    public C13830b f60184w;

    /* renamed from: x */
    public boolean f60185x;
    @C12579k

    /* renamed from: y */
    public final C13830b.C13831a f60186y = new C23980e(this);

    /* renamed from: com.carrefour.fid.android.presentation.ui.environment.AppEnvironmentSelectionFragment$a */
    public static final class C23976a {
        public /* synthetic */ C23976a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo70157a(@C12579k FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            new AppEnvironmentSelectionFragment().show(fragmentManager, AppEnvironmentSelectionFragment.f60178Y);
        }

        public C23976a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.environment.AppEnvironmentSelectionFragment$b */
    public /* synthetic */ class C23977b implements C19426h0, C11379z {
        public C23977b() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Throwable th) {
            AppEnvironmentSelectionFragment.this.mo70154Y0(th);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, AppEnvironmentSelectionFragment.this, AppEnvironmentSelectionFragment.class, "handleAppEnvironmentError", "handleAppEnvironmentError(Ljava/lang/Throwable;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.environment.AppEnvironmentSelectionFragment$c */
    public /* synthetic */ class C23978c implements C19426h0, C11379z {
        public C23978c() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Boolean bool) {
            AppEnvironmentSelectionFragment.this.mo70155Z0(bool);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, AppEnvironmentSelectionFragment.this, AppEnvironmentSelectionFragment.class, "handleAppEnvironmentLoading", "handleAppEnvironmentLoading(Ljava/lang/Boolean;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.environment.AppEnvironmentSelectionFragment$d */
    public /* synthetic */ class C23979d implements C19426h0, C11379z {
        public C23979d() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l C28912a aVar) {
            AppEnvironmentSelectionFragment.this.mo70153W0(aVar);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, AppEnvironmentSelectionFragment.this, AppEnvironmentSelectionFragment.class, "handleAppEnvironmentChange", "handleAppEnvironmentChange(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironmentType;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.environment.AppEnvironmentSelectionFragment$e */
    public static final class C23980e implements C13830b.C13831a {

        /* renamed from: a */
        public final /* synthetic */ AppEnvironmentSelectionFragment f60190a;

        public C23980e(AppEnvironmentSelectionFragment appEnvironmentSelectionFragment) {
            this.f60190a = appEnvironmentSelectionFragment;
        }

        /* renamed from: a */
        public final void mo32762a(int i, @C12579k View view) {
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
            this.f60190a.mo70151U0().mo76621l0(i);
        }
    }

    public AppEnvironmentSelectionFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f60181f = C10864b0.m38747b(lazyThreadSafetyMode, new AppEnvironmentSelectionFragment$special$$inlined$viewBinding$1(this));
        C11677z b = C10864b0.m38747b(lazyThreadSafetyMode, new C23982x4a31b6d2(new C23981x4a31b6d1(this)));
        this.f60182g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AppEnvironmentSelectionViewModel.class), new C23983x4a31b6d3(b), new C23984x4a31b6d4((C11289a) null, b), new C23985x4a31b6d5(this, b));
    }

    /* renamed from: X0 */
    public static final void m105898X0(AppEnvironmentSelectionFragment appEnvironmentSelectionFragment) {
        Intrinsics.checkNotNullParameter(appEnvironmentSelectionFragment, "this$0");
        appEnvironmentSelectionFragment.dismiss();
    }

    /* renamed from: S0 */
    public final void mo70149S0() {
        Context requireContext = requireContext();
        AlarmManager alarmManager = (AlarmManager) C17318d.m79732o(requireContext, AlarmManager.class);
        if (alarmManager != null) {
            alarmManager.set(1, System.currentTimeMillis() + 2500 + 1000, PendingIntent.getActivity(requireContext, 0, requireContext.getPackageManager().getLaunchIntentForPackage(requireContext.getPackageName()), C8698y1.f23302n));
        }
    }

    @C12579k
    /* renamed from: T0 */
    public final AppEnvironment mo70150T0() {
        AppEnvironment appEnvironment = this.f60183v;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appEnvironment");
        return null;
    }

    /* renamed from: U0 */
    public final AppEnvironmentSelectionViewModel mo70151U0() {
        return (AppEnvironmentSelectionViewModel) this.f60182g.getValue();
    }

    /* renamed from: V0 */
    public final C36779o0 mo70152V0() {
        return (C36779o0) this.f60181f.getValue();
    }

    /* renamed from: W0 */
    public final void mo70153W0(C28912a aVar) {
        if (aVar != null) {
            TextView textView = mo70152V0().f91402d;
            SpannableString spannableString = new SpannableString(getString(R.string.environment_selection_confirmation, getString(aVar.mo84189b())));
            spannableString.setSpan(new StyleSpan(3), StringsKt__StringsKt.indexOf$default((CharSequence) spannableString, C33124s.f80355c, 0, false, 6, (Object) null) + 1, spannableString.length(), 33);
            textView.setText(spannableString);
            Intrinsics.checkNotNullExpressionValue(textView, "handleAppEnvironmentChange$lambda$6");
            ViewKt.m152123e(textView, (Integer) null, false, (C11289a) null, 7, (Object) null);
            C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new AppEnvironmentSelectionFragment$handleAppEnvironmentChange$2(this, (C11045c<? super AppEnvironmentSelectionFragment$handleAppEnvironmentChange$2>) null), 3, (Object) null);
            mo70149S0();
            this.f60185x = true;
            View view = getView();
            if (view != null) {
                view.postDelayed(new C23986a(this), 2500);
            } else {
                dismiss();
            }
        }
    }

    /* renamed from: Y0 */
    public final void mo70154Y0(Throwable th) {
        if (th != null) {
            dismiss();
        }
    }

    /* renamed from: Z0 */
    public final void mo70155Z0(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            C36779o0 V0 = mo70152V0();
            ProgressBar progressBar = V0.f91401c;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressAppEnvironment");
            ViewKt.m152123e(progressBar, (Integer) null, false, (C11289a) null, 7, (Object) null);
            RecyclerView recyclerView = V0.f91400b;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "listAppEnvironment");
            ViewKt.m152126h(recyclerView, (Integer) null, 4, false, (C11289a) null, 13, (Object) null);
        } else if (bool == null) {
            mo70152V0().f91401c.setVisibility(8);
        }
    }

    /* renamed from: a1 */
    public final void mo70156a1(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f60183v = appEnvironment;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ConstraintLayout b = mo70152V0().getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f60185x) {
            Process.killProcess(Process.myPid());
        }
    }

    public void onDestroyView() {
        AppEnvironmentSelectionViewModel U0 = mo70151U0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C28502s.C28503a.m118425a(U0, viewLifecycleOwner, (Boolean) null, 2, (Object) null);
        if (this.f60184w != null) {
            RecyclerView recyclerView = mo70152V0().f91400b;
            C13830b bVar = this.f60184w;
            Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type com.carrefour.fid.android.app.listeners.RecyclerItemClickListener");
            recyclerView.mo59651u1(bVar);
        }
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C36779o0 V0 = mo70152V0();
        RecyclerView recyclerView = V0.f91400b;
        recyclerView.setAdapter(new C23987a(Integer.valueOf(mo70150T0().mo84161H().mo84188a())));
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        Intrinsics.checkNotNullExpressionValue(recyclerView, "this");
        C13830b bVar = new C13830b(recyclerView, this.f60186y, (C13830b.C13832b) null, 4, (DefaultConstructorMarker) null);
        recyclerView.mo59607p(bVar);
        this.f60184w = bVar;
        V0.f91402d.setVisibility(8);
        V0.f91401c.setVisibility(8);
        AppEnvironmentSelectionViewModel U0 = mo70151U0();
        U0.mo83418c0().mo57491k(getViewLifecycleOwner(), new C23977b());
        U0.mo83419d0().mo57491k(getViewLifecycleOwner(), new C23978c());
        U0.mo76620k0().mo57491k(getViewLifecycleOwner(), new C23979d());
    }
}
