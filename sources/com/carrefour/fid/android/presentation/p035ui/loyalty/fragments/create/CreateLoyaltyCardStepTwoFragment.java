package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.p046io.CreateFidProcessThrowable;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.widget.StepBarView;
import dagger.hilt.android.C10164b;
import java.util.Date;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateLoyaltyCardStepTwoFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/carrefour/fid/android/domain/models/loyalty/LoyaltyMembershipConsentModel;", "loyaltyAddress", "Lkotlin/d2;", "O0", "(Lcom/carrefour/fid/android/domain/models/loyalty/LoyaltyMembershipConsentModel;Lkotlin/coroutines/c;)Ljava/lang/Object;", "N0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/InitLoyaltyCardViewModel;", "f", "Lkotlin/z;", "M0", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/InitLoyaltyCardViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/g;", "g", "Landroidx/navigation/m;", "L0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/g;", "args", "Lcom/carrefour/fid/android/shared/navigation/c;", "v", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCreateLoyaltyCardStepTwoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateLoyaltyCardStepTwoFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateLoyaltyCardStepTwoFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,148:1\n48#2,9:149\n42#3,3:158\n*S KotlinDebug\n*F\n+ 1 CreateLoyaltyCardStepTwoFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateLoyaltyCardStepTwoFragment\n*L\n37#1:149,9\n38#1:158,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment */
public final class CreateLoyaltyCardStepTwoFragment extends C24433u {

    /* renamed from: w */
    public static final int f60776w = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f60777f;
    @C12579k

    /* renamed from: g */
    public final C19766m f60778g = new C19766m(C11342l0.m43547d(C24410g.class), new CreateLoyaltyCardStepTwoFragment$special$$inlined$navArgs$1(this));
    @Inject

    /* renamed from: v */
    public C28796c f60779v;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$a */
    public static final class C24339a implements C11908f<C28892e<? extends C11079d2>> {

        /* renamed from: a */
        public final /* synthetic */ CreateLoyaltyCardStepTwoFragment f60780a;

        public C24339a(CreateLoyaltyCardStepTwoFragment createLoyaltyCardStepTwoFragment) {
            this.f60780a = createLoyaltyCardStepTwoFragment;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C28892e<C11079d2> eVar, @C12579k C11045c<? super C11079d2> cVar) {
            boolean z;
            C28892e<C11079d2> eVar2 = eVar;
            if (eVar2 instanceof C28892e.C28893a) {
                C28892e.C28893a aVar = (C28892e.C28893a) eVar2;
                if (aVar.mo84083d() instanceof CreateFidProcessThrowable) {
                    Throwable d = aVar.mo84083d();
                    Intrinsics.checkNotNull(d, "null cannot be cast to non-null type com.carrefour.fid.android.shared.io.CreateFidProcessThrowable");
                    String a = ((CreateFidProcessThrowable) d).mo83794a();
                    if (Intrinsics.areEqual((Object) a, (Object) LoyaltyConstantsKt.MIDFID_SECRET_CODE_NOT_SECURED_ERROR_CODE)) {
                        z = true;
                    } else {
                        z = Intrinsics.areEqual((Object) a, (Object) LoyaltyConstantsKt.MIDFID_SECRET_CODE_NOT_SECURED_SECOND_ERROR_CODE);
                    }
                    if (z) {
                        C19736g.m91827a(this.f60780a).mo58156s0();
                    }
                }
                CreateLoyaltyCardStepTwoFragment createLoyaltyCardStepTwoFragment = this.f60780a;
                NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
                String string = createLoyaltyCardStepTwoFragment.getString(R.string.loyalty_carrefour_error_text);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loyalty_carrefour_error_text)");
                FragmentKt.m118811B(createLoyaltyCardStepTwoFragment, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            } else if (eVar2 instanceof C28892e.C28895c) {
                CreateLoyaltyCardStepTwoFragment createLoyaltyCardStepTwoFragment2 = this.f60780a;
                FragmentKt.m118823k(createLoyaltyCardStepTwoFragment2, C24412h.f60889a.mo71419a(createLoyaltyCardStepTwoFragment2.mo71180L0().mo71407i()));
            } else if (!Intrinsics.areEqual((Object) eVar2, (Object) C28892e.C28894b.f70781b)) {
                Intrinsics.areEqual((Object) eVar2, (Object) C28892e.C28896d.f70785b);
            }
            return C11079d2.f28267a;
        }
    }

    public CreateLoyaltyCardStepTwoFragment() {
        C11677z c = C10864b0.m38748c(new C24340x10f60a54(this, R.id.loyalty_create_code_graph));
        this.f60777f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(InitLoyaltyCardViewModel.class), new C24341x10f60a55(c, (C11510n) null), new C24342x10f60a56(this, c, (C11510n) null));
    }

    /* renamed from: L0 */
    public final C24410g mo71180L0() {
        return (C24410g) this.f60778g.getValue();
    }

    @C12579k
    /* renamed from: M0 */
    public final InitLoyaltyCardViewModel mo71181M0() {
        return (InitLoyaltyCardViewModel) this.f60777f.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo71182N0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$loyaltyCardCreated$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$loyaltyCardCreated$1 r0 = (com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$loyaltyCardCreated$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$loyaltyCardCreated$1 r0 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$loyaltyCardCreated$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002d:
            kotlin.C11661u0.m45747n(r5)
            goto L_0x004a
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r5 = r4.mo71181M0()
            kotlinx.coroutines.flow.j r5 = r5.getLoyaltyCardCreatedResult()
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$a r2 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$a
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L_0x004a
            return r1
        L_0x004a:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment.mo71182N0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo71183O0(com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r11, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$1 r0 = (com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$1 r0 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 == r3) goto L_0x0030
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0030:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x008b
        L_0x0034:
            java.lang.Object r11 = r0.L$1
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r11 = (com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel) r11
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment r2 = (com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment) r2
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0060
        L_0x0040:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r12 = r10.mo71181M0()
            r12.setInitialAddress(r11)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r12 = r10.mo71181M0()
            com.carrefour.fid.android.domain.models.account.Address r2 = r11.mo117843j()
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r4
            java.lang.Object r12 = r12.validateUserInput(r2, r0)
            if (r12 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r2 = r10
        L_0x0060:
            androidx.lifecycle.LifecycleCoroutineScope r4 = androidx.lifecycle.C19501x.m90847a(r2)
            r5 = 0
            r6 = 0
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$2 r7 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$2
            r12 = 0
            r7.<init>(r2, r12)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r4, r5, r6, r7, r8, r9)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r4 = r2.mo71181M0()
            kotlinx.coroutines.flow.j r4 = r4.getValidUserAddressType()
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$3 r5 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$3
            r5.<init>(r2, r11)
            r0.L$0 = r12
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r11 = r4.collect(r5, r0)
            if (r11 != r1) goto L_0x008b
            return r1
        L_0x008b:
            kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment.mo71183O0(com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f60779v;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        CreateSecretCodeFragment createSecretCodeFragment = (CreateSecretCodeFragment) com.carrefour.fid.android.core.extension.FragmentKt.m148916b(this, CreateSecretCodeFragment.class);
        if (createSecretCodeFragment != null) {
            createSecretCodeFragment.mo71219Y0(true);
            createSecretCodeFragment.mo71220Z0(true);
            createSecretCodeFragment.mo71221a1(true);
            createSecretCodeFragment.mo71222b1(StepBarView.STEP.STEP_TWO);
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(requireContext(), R.style.DatePickerDialogTheme);
        datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(C8553b.m31049c(1036858759, true, new CreateLoyaltyCardStepTwoFragment$onCreateView$2$1(this, datePickerDialog)));
        return composeView;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f60779v = cVar;
    }
}
