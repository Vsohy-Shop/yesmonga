package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.attach;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.C0302g;
import androidx.appcompat.app.C0467d;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19259o;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.lifecycle.Lifecycle;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36789p0;
import com.carrefour.fid.android.design.components.extension.EditTextKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22925d;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.attach.C24269j;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.scan.core.constants.C28255a;
import com.carrefour.fid.android.scan.core.constants.ScanType;
import com.carrefour.fid.android.scan.presentation.p042ui.ScannerFragment;
import com.carrefour.fid.android.shared.base.ObserverWhileResumedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.util.C28944n;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0018H\u0002J\u001a\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u0003H\u0002J\b\u0010#\u001a\u00020\u0003H\u0002J\b\u0010$\u001a\u00020\u0003H\u0002J\u001a\u0010)\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\b\u0010*\u001a\u00020\u0003H\u0016J\u0006\u0010+\u001a\u00020\u0003J\u0016\u0010.\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0018R\u001b\u00104\u001a\u00020/8BX\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0018058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006="}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/attach/AttachCardFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/p0;", "Lkotlin/d2;", "l1", "y1", "x1", "Landroidx/fragment/app/FragmentContainerView;", "p1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent;", "event", "B1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState;", "state", "C1", "", "show", "H1", "d1", "h1", "m1", "A1", "E1", "s1", "", "value", "w1", "cardNumber", "r1", "isEnabled", "wording", "n1", "enabled", "o1", "initListeners", "t1", "F1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "D1", "isError", "message", "G1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/AttachCardViewModel;", "f", "Lkotlin/z;", "q1", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/AttachCardViewModel;", "viewModel", "Landroidx/activity/result/g;", "g", "Landroidx/activity/result/g;", "requestPermission", "<init>", "()V", "v", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAttachCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachCardFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/attach/AttachCardFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,381:1\n106#2,15:382\n168#3,7:397\n183#3,6:404\n154#3,6:410\n83#4,2:416\n83#4,2:418\n83#4,2:430\n21#5:420\n23#5:424\n21#5:425\n23#5:429\n50#6:421\n55#6:423\n50#6:426\n55#6:428\n106#7:422\n106#7:427\n*S KotlinDebug\n*F\n+ 1 AttachCardFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/attach/AttachCardFragment\n*L\n61#1:382,15\n76#1:397,7\n77#1:404,6\n94#1:410,6\n325#1:416,2\n329#1:418,2\n340#1:430,2\n335#1:420\n335#1:424\n337#1:425\n337#1:429\n335#1:421\n335#1:423\n337#1:426\n337#1:428\n335#1:422\n337#1:427\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.attach.AttachCardFragment */
public class AttachCardFragment extends C24274l<C36789p0> {
    @C12579k

    /* renamed from: v */
    public static final C24240a f60629v = new C24240a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f60630w = 8;
    @C12579k

    /* renamed from: x */
    public static final String f60631x = "AttachCardFragment";
    @C12579k

    /* renamed from: f */
    public final C11677z f60632f;
    @C12579k

    /* renamed from: g */
    public final C0302g<String> f60633g = FragmentKt.m118833u(this, new AttachCardFragment$requestPermission$1(this), new AttachCardFragment$requestPermission$2(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.attach.AttachCardFragment$a */
    public static final class C24240a {
        public /* synthetic */ C24240a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24240a() {
        }
    }

    public AttachCardFragment() {
        super(C242391.f60634a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new AttachCardFragment$special$$inlined$viewModels$default$2(new AttachCardFragment$special$$inlined$viewModels$default$1(this)));
        this.f60632f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AttachCardViewModel.class), new AttachCardFragment$special$$inlined$viewModels$default$3(b), new AttachCardFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new AttachCardFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: e1 */
    public static final void m106700e1(AttachCardFragment attachCardFragment, C0467d dVar, View view) {
        Intrinsics.checkNotNullParameter(attachCardFragment, "this$0");
        Intrinsics.checkNotNullParameter(dVar, "$activeFidAlert");
        attachCardFragment.mo70947A1();
        dVar.dismiss();
    }

    /* renamed from: f1 */
    public static final void m106701f1(C0467d dVar, AttachCardFragment attachCardFragment, View view) {
        Intrinsics.checkNotNullParameter(dVar, "$activeFidAlert");
        Intrinsics.checkNotNullParameter(attachCardFragment, "this$0");
        dVar.dismiss();
        attachCardFragment.mo70959m1();
    }

    /* renamed from: g1 */
    public static final void m106702g1(AttachCardFragment attachCardFragment, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(attachCardFragment, "this$0");
        attachCardFragment.mo70947A1();
    }

    /* renamed from: i1 */
    public static final void m106703i1(AttachCardFragment attachCardFragment, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(attachCardFragment, "this$0");
        attachCardFragment.mo70947A1();
    }

    /* renamed from: j1 */
    public static final void m106704j1(C0467d dVar, AttachCardFragment attachCardFragment, View view) {
        Intrinsics.checkNotNullParameter(dVar, "$terminalCardErrorAlert");
        Intrinsics.checkNotNullParameter(attachCardFragment, "this$0");
        dVar.dismiss();
        FragmentExtensionKt.m58765p(attachCardFragment, new AttachCardFragment$buildTerminalErrorAlertDialog$1$1$1(attachCardFragment));
    }

    /* renamed from: k1 */
    public static final void m106705k1(AttachCardFragment attachCardFragment, C0467d dVar, View view) {
        Intrinsics.checkNotNullParameter(attachCardFragment, "this$0");
        Intrinsics.checkNotNullParameter(dVar, "$terminalCardErrorAlert");
        attachCardFragment.mo70963q1().attachLoyaltyCardLater();
        dVar.dismiss();
    }

    /* renamed from: u1 */
    public static final void m106706u1(AttachCardFragment attachCardFragment, View view) {
        Intrinsics.checkNotNullParameter(attachCardFragment, "this$0");
        attachCardFragment.mo70963q1().sendTagClickFindCardNumber();
        FragmentKt.m118823k(attachCardFragment, C24269j.f60667a.mo71023c());
    }

    /* renamed from: v1 */
    public static final void m106707v1(AttachCardFragment attachCardFragment, View view) {
        String str;
        Intrinsics.checkNotNullParameter(attachCardFragment, "this$0");
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        C19232h activity = attachCardFragment.getActivity();
        if (activity != null) {
            str = activity.getPackageName();
        } else {
            str = null;
        }
        intent.setData(Uri.fromParts(C22925d.f58520a, str, (String) null));
        attachCardFragment.startActivity(intent);
    }

    /* renamed from: z1 */
    public static final void m106708z1(AttachCardFragment attachCardFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(attachCardFragment, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        attachCardFragment.mo70963q1().sendIntent(new AttachCard.UserAction.ProcessCardNumber(String.valueOf(bundle.getString(C28255a.f68403c))));
        C19259o.m90348c(attachCardFragment, C28255a.f68402b);
    }

    /* renamed from: A1 */
    public final void mo70947A1() {
        Context context = getContext();
        boolean z = false;
        if (context != null && C28944n.m119739b(context)) {
            z = true;
        }
        if (z) {
            mo70950D1();
        }
    }

    /* renamed from: B1 */
    public final void mo70948B1(AttachCard.UiEvent uiEvent) {
        if (uiEvent instanceof AttachCard.UiEvent.NavigateToSecretCode) {
            AttachCard.UiEvent.NavigateToSecretCode navigateToSecretCode = (AttachCard.UiEvent.NavigateToSecretCode) uiEvent;
            mo70967w1(navigateToSecretCode.getCard());
            mo70960n1(false, (String) null);
            mo70964r1(navigateToSecretCode.getCard());
        } else if (Intrinsics.areEqual((Object) uiEvent, (Object) AttachCard.UiEvent.ActiveFidCardError.INSTANCE)) {
            mo70955d1();
        } else if (Intrinsics.areEqual((Object) uiEvent, (Object) AttachCard.UiEvent.TerminalCardError.INSTANCE)) {
            mo70956h1();
        } else if (Intrinsics.areEqual((Object) uiEvent, (Object) AttachCard.UiEvent.NetworkError.INSTANCE)) {
            mo70950D1();
            String string = getString(R.string.general_error_server_not_responding_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…r_not_responding_message)");
            mo70953G1(true, string);
        } else if (uiEvent instanceof AttachCard.UiEvent.CardDetected) {
            String string2 = getString(R.string.loyalty_message_already_card_fid);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.loyal…message_already_card_fid)");
            mo70953G1(false, string2);
        }
    }

    /* renamed from: C1 */
    public final void mo70949C1(AttachCard.UiState uiState) {
        if (uiState instanceof AttachCard.UiState.Loading) {
            mo70954H1(((AttachCard.UiState.Loading) uiState).isLoading());
        } else if (uiState instanceof AttachCard.UiState.InactivePassCard) {
            mo70960n1(true, getString(R.string.loyalty_attach_inactive_pass_card));
        } else if (uiState instanceof AttachCard.UiState.IsValidCard) {
            mo70960n1(((AttachCard.UiState.IsValidCard) uiState).isCardInvalid(), getString(R.string.loyalty_attach_card_num_incorrect));
        } else if (uiState instanceof AttachCard.UiState.CardInfo) {
            AttachCard.UiState.CardInfo cardInfo = (AttachCard.UiState.CardInfo) uiState;
            if (cardInfo.getUpdateViewWithCardNumber()) {
                EditText editText = ((C36789p0) getBinding()).f91467j;
                Intrinsics.checkNotNullExpressionValue(editText, "binding.numCardEditText");
                EditTextKt.m152107a(editText, cardInfo.getCardNumber());
            }
            mo70961o1(cardInfo.getEnableValidateButton());
            mo70960n1(false, getString(R.string.loyalty_attach_card_num_incorrect));
        }
    }

    /* renamed from: D1 */
    public final void mo70950D1() {
        mo70952F1();
    }

    /* renamed from: E1 */
    public final void mo70951E1() {
        ((C36789p0) getBinding()).f91469l.setVisibility(0);
        ((C36789p0) getBinding()).f91461d.setText(new String());
        ((C36789p0) getBinding()).f91467j.setEnabled(false);
        ((C36789p0) getBinding()).f91462e.setClickable(false);
    }

    /* renamed from: F1 */
    public final void mo70952F1() {
        ImageView imageView = ((C36789p0) getBinding()).f91463f;
        imageView.setVisibility(4);
        Intrinsics.checkNotNullExpressionValue(imageView, "showScannerView$lambda$21");
        C22757a.m102928b(imageView);
        ((C36789p0) getBinding()).f91459b.setVisibility(8);
        FragmentContainerView p1 = mo70962p1();
        p1.setVisibility(0);
        C22757a.m102928b(p1);
    }

    /* renamed from: G1 */
    public final void mo70953G1(boolean z, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        if (z) {
            C19232h activity = getActivity();
            if (activity != null) {
                ActivityKt.m118716z(activity, NotificationComponent.Variant.ERROR, str, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                return;
            }
            return;
        }
        C19232h activity2 = getActivity();
        if (activity2 != null) {
            ActivityKt.m118716z(activity2, NotificationComponent.Variant.INFO, str, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: H1 */
    public final void mo70954H1(boolean z) {
        if (z) {
            mo70951E1();
        } else {
            mo70965s1();
        }
    }

    /* renamed from: d1 */
    public final void mo70955d1() {
        C19232h activity = getActivity();
        if (activity != null) {
            View inflate = activity.getLayoutInflater().inflate(R.layout.active_fid_layout, (ViewGroup) null);
            C0467d.C0468a aVar = new C0467d.C0468a(activity, R.style.DefaultDialogTheme);
            aVar.mo1400M(inflate);
            C0467d a = aVar.mo1403a();
            Intrinsics.checkNotNullExpressionValue(a, "dialogBuilder.create()");
            ((ImageView) inflate.findViewById(R.id.closeActiveFidPopIn)).setOnClickListener(new C24265f(this, a));
            ((Button) inflate.findViewById(R.id.activateCardNowBtn)).setOnClickListener(new C24266g(a, this));
            a.setOnDismissListener(new C24267h(this));
            mo70963q1().trackActiveFidPopIn();
            a.show();
        }
    }

    /* renamed from: h1 */
    public final void mo70956h1() {
        C19232h activity = getActivity();
        if (activity != null) {
            View inflate = activity.getLayoutInflater().inflate(R.layout.terminal_card_error_layout, (ViewGroup) null);
            C0467d.C0468a aVar = new C0467d.C0468a(activity, R.style.DefaultDialogTheme);
            aVar.mo1400M(inflate);
            C0467d a = aVar.mo1403a();
            Intrinsics.checkNotNullExpressionValue(a, "dialogBuilder.create()");
            ((Button) inflate.findViewById(R.id.customerServiceBtn)).setOnClickListener(new C24260a(a, this));
            ((Button) inflate.findViewById(R.id.laterBtn)).setOnClickListener(new C24261b(this, a));
            a.setOnDismissListener(new C24262c(this));
            mo70963q1().trackTerminalCardPopIn();
            a.show();
        }
    }

    public final void initListeners() {
        C36789p0 p0Var = (C36789p0) getBinding();
        EditText editText = p0Var.f91467j;
        Intrinsics.checkNotNullExpressionValue(editText, "numCardEditText");
        C11907e<String> f1 = C11909g.m47448f1(C11909g.m47451g0(com.carrefour.fid.android.shared.extension.EditTextKt.m118806p(editText)), new AttachCardFragment$initListeners$1$1(this, (C11045c<? super AttachCardFragment$initListeners$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileResumedImpl(viewLifecycleOwner, f1, new C24243xeeec9f59((C11045c) null));
        EditText editText2 = p0Var.f91467j;
        Intrinsics.checkNotNullExpressionValue(editText2, "numCardEditText");
        C11907e<C11079d2> f12 = C11909g.m47448f1(ViewKt.m118997j(editText2), new AttachCardFragment$initListeners$1$2(this, (C11045c<? super AttachCardFragment$initListeners$1$2>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileResumedImpl(viewLifecycleOwner2, f12, new C24244xeeec9f5a((C11045c) null));
        Button button = p0Var.f91461d;
        Intrinsics.checkNotNullExpressionValue(button, "btnAttachCardSubmit");
        EditText editText3 = p0Var.f91467j;
        Intrinsics.checkNotNullExpressionValue(editText3, "numCardEditText");
        C11907e f13 = C11909g.m47448f1(C11909g.m47432b1(ViewKt.m118997j(button), new AttachCardFragment$initListeners$lambda$18$$inlined$filter$2(C11909g.m47448f1(new AttachCardFragment$initListeners$lambda$18$$inlined$filter$1(TextViewKt.m118955f(editText3, (C11300l) null, 1, (Object) null)), new AttachCardFragment$initListeners$1$4(this, (C11045c<? super AttachCardFragment$initListeners$1$4>) null)), p0Var)), new AttachCardFragment$initListeners$1$6(this, p0Var, (C11045c<? super AttachCardFragment$initListeners$1$6>) null));
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "fragment.viewLifecycleOwner");
        new ObserverWhileResumedImpl(viewLifecycleOwner3, f13, new C24245xeeec9f5b((C11045c) null));
        p0Var.f91462e.setOnClickListener(new C24263d(this));
        p0Var.f91459b.setOnClickListener(new C24264e(this));
    }

    /* renamed from: l1 */
    public final void mo70958l1() {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24241xebb2886a(this, state, (C11045c) null, this), 3, (Object) null);
    }

    /* renamed from: m1 */
    public final void mo70959m1() {
        FragmentKt.m118823k(this, C24269j.f60667a.mo71022a(true, true, ((C36789p0) getBinding()).f91467j.getText().toString()));
    }

    /* renamed from: n1 */
    public final void mo70960n1(boolean z, String str) {
        int i;
        TextView textView = ((C36789p0) getBinding()).f91468k;
        textView.setText(str);
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        textView.setVisibility(i);
        if (z) {
            ((C36789p0) getBinding()).f91467j.requestFocus();
        }
    }

    /* renamed from: o1 */
    public final void mo70961o1(boolean z) {
        ((C36789p0) getBinding()).f91461d.setEnabled(z);
    }

    public void onResume() {
        super.onResume();
        mo70947A1();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo70968x1();
        AttachCardViewModel q1 = mo70963q1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new AttachCardFragment$onViewCreated$$inlined$processState$1(this, q1, (C11045c) null, this), 3, (Object) null);
        AttachCardViewModel q12 = mo70963q1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new AttachCardFragment$onViewCreated$$inlined$processEvent$1(this, q12, (C11045c) null, this), 3, (Object) null);
        mo70963q1().sendTagScreenView();
        this.f60633g.mo960b("android.permission.CAMERA");
        initListeners();
        mo70969y1();
        mo70958l1();
    }

    /* renamed from: p1 */
    public final FragmentContainerView mo70962p1() {
        FragmentContainerView fragmentContainerView = ((C36789p0) getBinding()).f91460c;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "binding.barcodeScannerView");
        return fragmentContainerView;
    }

    /* renamed from: q1 */
    public final AttachCardViewModel mo70963q1() {
        return (AttachCardViewModel) this.f60632f.getValue();
    }

    /* renamed from: r1 */
    public final void mo70964r1(String str) {
        mo70963q1().sendTagValidationAttachCard(LoyaltyUtils.INSTANCE.getTypeCard(str));
        FragmentKt.m118823k(this, C24269j.C24272c.m106772e(C24269j.f60667a, str, OtpOrigination.MyAccount.f61099d, (String) null, 4, (Object) null));
    }

    /* renamed from: s1 */
    public final void mo70965s1() {
        ((C36789p0) getBinding()).f91469l.setVisibility(8);
        ((C36789p0) getBinding()).f91461d.setText(getString(R.string.general_validate));
        EditText editText = ((C36789p0) getBinding()).f91467j;
        editText.setEnabled(true);
        Intrinsics.checkNotNullExpressionValue(editText, "hideProgressBar$lambda$12");
        C22757a.m102928b(editText);
        ((C36789p0) getBinding()).f91462e.setClickable(true);
    }

    /* renamed from: t1 */
    public final void mo70966t1() {
        ImageView imageView = ((C36789p0) getBinding()).f91463f;
        imageView.setVisibility(0);
        Intrinsics.checkNotNullExpressionValue(imageView, "hideScannerView$lambda$19");
        C22757a.m102928b(imageView);
        ((C36789p0) getBinding()).f91459b.setVisibility(0);
        FragmentContainerView p1 = mo70962p1();
        p1.setVisibility(8);
        C22757a.m102928b(p1);
    }

    /* renamed from: w1 */
    public final void mo70967w1(String str) {
        boolean z;
        EditText editText = ((C36789p0) getBinding()).f91467j;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.numCardEditText");
        EditTextKt.m152107a(editText, str);
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo70961o1(true);
        }
    }

    /* renamed from: x1 */
    public final void mo70968x1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        C19232h activity2 = getActivity();
        if (activity2 instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity2;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.loyalty_btn_attach_card);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, AttachCardFragment$initToolbar$1$1.f60649f, 1, (Object) null);
        }
    }

    /* renamed from: y1 */
    public final void mo70969y1() {
        getChildFragmentManager().mo56909u().mo57201C(((C36789p0) getBinding()).f91460c.getId(), ScannerFragment.f68459v.mo82270a(ScanType.LOYALTY_CARD)).mo57052q();
        getChildFragmentManager().mo56861b(C28255a.f68402b, getViewLifecycleOwner(), new C24268i(this));
        C22757a.m102929c(false);
    }
}
