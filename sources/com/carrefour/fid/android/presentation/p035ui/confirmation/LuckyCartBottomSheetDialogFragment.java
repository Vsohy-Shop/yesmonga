package com.carrefour.fid.android.presentation.p035ui.confirmation;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.compose.C19714d;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.engine.C22234h;
import com.carrefour.fid.android.databinding.C36815r6;
import com.carrefour.fid.android.domain.models.LuckyCartTicketDomain;
import com.carrefour.fid.android.presentation.viewmodels.luckycart.C26620a;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001b\u001a\u00060\u0017j\u0002`\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/confirmation/LuckyCartBottomSheetDialogFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/databinding/r6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Y0", "initListeners", "V0", "Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/a;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/a;", "T0", "()Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/a;", "Z0", "(Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/a;)V", "analyticsHandler", "Lcom/carrefour/fid/android/domain/models/LuckyCartTicketDomain;", "Lcom/carrefour/fid/android/presentation/models/LuckCartTicketModel;", "U0", "()Lcom/carrefour/fid/android/domain/models/LuckyCartTicketDomain;", "luckyCartTicket", "<init>", "()V", "g", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLuckyCartBottomSheetDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuckyCartBottomSheetDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/confirmation/LuckyCartBottomSheetDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.LuckyCartBottomSheetDialogFragment */
public final class LuckyCartBottomSheetDialogFragment extends C23771u<C36815r6> {
    @C12579k

    /* renamed from: g */
    public static final C23748a f59812g = new C23748a((DefaultConstructorMarker) null);

    /* renamed from: v */
    public static final int f59813v = 8;
    @C12579k

    /* renamed from: w */
    public static final String f59814w = "onDismissLuckyCart";
    @C12579k

    /* renamed from: x */
    public static final String f59815x = "luckyCartTicket";
    @Inject

    /* renamed from: f */
    public C26620a f59816f;

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.LuckyCartBottomSheetDialogFragment$a */
    public static final class C23748a {
        public /* synthetic */ C23748a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final LuckyCartBottomSheetDialogFragment mo69597a(@C12579k LuckyCartTicketDomain luckyCartTicketDomain) {
            Intrinsics.checkNotNullParameter(luckyCartTicketDomain, LuckyCartBottomSheetDialogFragment.f59815x);
            LuckyCartBottomSheetDialogFragment luckyCartBottomSheetDialogFragment = new LuckyCartBottomSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(LuckyCartBottomSheetDialogFragment.f59815x, luckyCartTicketDomain);
            luckyCartBottomSheetDialogFragment.setArguments(bundle);
            return luckyCartBottomSheetDialogFragment;
        }

        public C23748a() {
        }
    }

    public LuckyCartBottomSheetDialogFragment() {
        super(C237461.f59817a, C237472.f59818a, true);
    }

    /* renamed from: W0 */
    public static final void m105350W0(LuckyCartBottomSheetDialogFragment luckyCartBottomSheetDialogFragment, View view) {
        Intrinsics.checkNotNullParameter(luckyCartBottomSheetDialogFragment, "this$0");
        luckyCartBottomSheetDialogFragment.mo69591V0();
    }

    /* renamed from: X0 */
    public static final void m105351X0(LuckyCartBottomSheetDialogFragment luckyCartBottomSheetDialogFragment, View view) {
        Intrinsics.checkNotNullParameter(luckyCartBottomSheetDialogFragment, "this$0");
        luckyCartBottomSheetDialogFragment.mo69591V0();
    }

    @C12579k
    /* renamed from: T0 */
    public final C26620a mo69589T0() {
        C26620a aVar = this.f59816f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsHandler");
        return null;
    }

    /* renamed from: U0 */
    public final LuckyCartTicketDomain mo69590U0() {
        LuckyCartTicketDomain luckyCartTicketDomain;
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable(f59815x);
            if (parcelable instanceof LuckyCartTicketDomain) {
                luckyCartTicketDomain = (LuckyCartTicketDomain) parcelable;
            } else {
                luckyCartTicketDomain = null;
            }
            if (luckyCartTicketDomain != null) {
                return luckyCartTicketDomain;
            }
        }
        throw new Throwable("LuckCartTicket not found");
    }

    /* renamed from: V0 */
    public final void mo69591V0() {
        mo69589T0().mo77371d();
        FragmentKt.m118812C(this, mo69590U0().getRedirectionUrl());
    }

    /* renamed from: Y0 */
    public final void mo69592Y0() {
        ImageView imageView = ((C36815r6) getBinding()).f91585c;
        ((C22090i) C22038b.m100350E(imageView.getContext()).mo65605u(mo69590U0().getImageUrl()).mo66732A(C22234h.f57123a)).mo65675K1(imageView);
    }

    /* renamed from: Z0 */
    public final void mo69593Z0(@C12579k C26620a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f59816f = aVar;
    }

    public final void initListeners() {
        ((C36815r6) getBinding()).f91585c.setOnClickListener(new C23772v(this));
        ((C36815r6) getBinding()).f91584b.setOnClickListener(new C23773w(this));
    }

    public void onDismiss(@C12579k DialogInterface dialogInterface) {
        FragmentManager childFragmentManager;
        Intrinsics.checkNotNullParameter(dialogInterface, C19714d.f50522e);
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null)) {
            childFragmentManager.mo56857a(f59814w, new Bundle());
        }
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo69589T0().mo77368a();
        mo69592Y0();
        initListeners();
    }
}
