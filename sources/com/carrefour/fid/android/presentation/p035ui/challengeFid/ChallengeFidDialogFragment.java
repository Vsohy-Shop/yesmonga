package com.carrefour.fid.android.presentation.p035ui.challengeFid;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.app.C17018b;
import androidx.core.content.C17318d;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36650b1;
import com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel;
import com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi.C25987a;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006*\u0002%)\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002XD¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/challengeFid/ChallengeFidDialogFragment;", "Lcom/carrefour/fid/android/shared/base/j;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/presentation/viewmodels/challengeFid/mvi/a$a;", "uiState", "U0", "initHeader", "", "loyaltyCardNumber", "T0", "Lcom/carrefour/fid/android/databinding/b1;", "v", "Lkotlin/z;", "R0", "()Lcom/carrefour/fid/android/databinding/b1;", "binding", "Lcom/carrefour/fid/android/presentation/viewmodels/challengeFid/ChallengeFidViewModel;", "w", "S0", "()Lcom/carrefour/fid/android/presentation/viewmodels/challengeFid/ChallengeFidViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/challengeFid/a;", "x", "Landroidx/navigation/m;", "Q0", "()Lcom/carrefour/fid/android/presentation/ui/challengeFid/a;", "args", "com/carrefour/fid/android/presentation/ui/challengeFid/ChallengeFidDialogFragment$b", "y", "Lcom/carrefour/fid/android/presentation/ui/challengeFid/ChallengeFidDialogFragment$b;", "handlerWebViewClient", "com/carrefour/fid/android/presentation/ui/challengeFid/ChallengeFidDialogFragment$a", "z", "Lcom/carrefour/fid/android/presentation/ui/challengeFid/ChallengeFidDialogFragment$a;", "handlerWebChromeClient", "", "X", "I", "REQUEST_CAMERA_PERMISSION", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nChallengeFidDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChallengeFidDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/challengeFid/ChallengeFidDialogFragment\n+ 2 FragmentViewBindingDelegate.kt\ncom/carrefour/fid/android/shared/util/FragmentViewBindingDelegateKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 5 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,123:1\n120#2,3:124\n106#3,15:127\n42#4,3:142\n168#5,7:145\n*S KotlinDebug\n*F\n+ 1 ChallengeFidDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/challengeFid/ChallengeFidDialogFragment\n*L\n34#1:124,3\n35#1:127,15\n36#1:142,3\n73#1:145,7\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.challengeFid.ChallengeFidDialogFragment */
public final class ChallengeFidDialogFragment extends C23242c {

    /* renamed from: Y */
    public static final int f58935Y = 8;

    /* renamed from: X */
    public final int f58936X = 1;
    @C12579k

    /* renamed from: v */
    public final C11677z f58937v;
    @C12579k

    /* renamed from: w */
    public final C11677z f58938w;
    @C12579k

    /* renamed from: x */
    public final C19766m f58939x = new C19766m(C11342l0.m43547d(C23239a.class), new ChallengeFidDialogFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: y */
    public final C23232b f58940y = new C23232b();
    @C12579k

    /* renamed from: z */
    public final C23231a f58941z = new C23231a();

    /* renamed from: com.carrefour.fid.android.presentation.ui.challengeFid.ChallengeFidDialogFragment$a */
    public static final class C23231a extends WebChromeClient {
        public void onPermissionRequest(@C12579k PermissionRequest permissionRequest) {
            Intrinsics.checkNotNullParameter(permissionRequest, "request");
            permissionRequest.grant(permissionRequest.getResources());
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.challengeFid.ChallengeFidDialogFragment$b */
    public static final class C23232b extends WebViewClient {
    }

    public ChallengeFidDialogFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f58937v = C10864b0.m38747b(lazyThreadSafetyMode, new ChallengeFidDialogFragment$special$$inlined$viewBinding$1(this));
        C11677z b = C10864b0.m38747b(lazyThreadSafetyMode, new ChallengeFidDialogFragment$special$$inlined$viewModels$default$2(new ChallengeFidDialogFragment$special$$inlined$viewModels$default$1(this)));
        this.f58938w = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ChallengeFidViewModel.class), new ChallengeFidDialogFragment$special$$inlined$viewModels$default$3(b), new ChallengeFidDialogFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new ChallengeFidDialogFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: Q0 */
    public final C23239a mo68082Q0() {
        return (C23239a) this.f58939x.getValue();
    }

    /* renamed from: R0 */
    public final C36650b1 mo68083R0() {
        return (C36650b1) this.f58937v.getValue();
    }

    /* renamed from: S0 */
    public final ChallengeFidViewModel mo68084S0() {
        return (ChallengeFidViewModel) this.f58938w.getValue();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: T0 */
    public final void mo68085T0(String str) {
        WebView webView = mo68083R0().f90594d;
        webView.setWebViewClient(this.f58940y);
        webView.setWebChromeClient(this.f58941z);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        String string = getString(R.string.challenge_fid_url, str);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chall…d_url, loyaltyCardNumber)");
        webView.loadUrl(string);
    }

    /* renamed from: U0 */
    public final void mo68086U0(C25987a.C25988a aVar) {
        boolean z;
        if (aVar.mo75411h().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo68085T0(aVar.mo75411h());
        }
    }

    public final void initHeader() {
        mo68083R0().f90592b.setContent(C8553b.m31049c(-355427585, true, new ChallengeFidDialogFragment$initHeader$1(this)));
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        LinearLayout b = mo68083R0().getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        try {
            if (C17318d.m79718a(requireContext(), "android.permission.CAMERA") != 0) {
                C17018b.m78743J(requireActivity(), new String[]{"android.permission.CAMERA"}, this.f58936X);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            ActivityKt.m118698h(dialog);
        }
        initHeader();
        ChallengeFidViewModel S0 = mo68084S0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new ChallengeFidDialogFragment$onViewCreated$$inlined$processState$1(this, S0, (C11045c) null, this), 3, (Object) null);
        mo68084S0().sendIntent(C25987a.C25989b.C25990a.f63515a);
    }
}
