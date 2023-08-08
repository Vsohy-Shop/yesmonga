package com.usabilla.sdk.ubform.sdk.form;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.datatransport.cct.C40045d;
import com.usabilla.sdk.ubform.UsabillaInternal;
import com.usabilla.sdk.ubform.p008di.C9818a;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.presenter.C10057b;
import com.usabilla.sdk.ubform.sdk.form.presenter.C10058c;
import com.usabilla.sdk.ubform.sdk.form.presenter.C10059d;
import com.usabilla.sdk.ubform.sdk.form.view.FormView;
import com.usabilla.sdk.ubform.sdk.passiveForm.PassiveSubmissionManager;
import com.usabilla.sdk.ubform.utils.C10118d;
import com.usabilla.sdk.ubform.utils.ext.ExtensionViewKt;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/PassiveFormFragment;", "Lcom/usabilla/sdk/ubform/sdk/form/BaseForm;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "i", "y0", "Lcom/usabilla/sdk/ubform/sdk/form/presenter/b;", "K0", "onDestroy", "Lcom/usabilla/sdk/ubform/sdk/passiveForm/PassiveSubmissionManager;", "X", "Lkotlin/z;", "X0", "()Lcom/usabilla/sdk/ubform/sdk/passiveForm/PassiveSubmissionManager;", "passiveSubmissionManager", "Y", "Lcom/usabilla/sdk/ubform/sdk/form/PassiveFormFragment;", "W0", "()Lcom/usabilla/sdk/ubform/sdk/form/PassiveFormFragment;", "fragment", "<init>", "()V", "Z", "a", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class PassiveFormFragment extends BaseForm {
    @C12579k

    /* renamed from: Z */
    public static final C10047a f27640Z = new C10047a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: X */
    public final C11677z f27641X = C10864b0.m38748c(PassiveFormFragment$passiveSubmissionManager$2.f27643f);
    @C12579k

    /* renamed from: Y */
    public final PassiveFormFragment f27642Y = this;

    /* renamed from: com.usabilla.sdk.ubform.sdk.form.PassiveFormFragment$a */
    public static final class C10047a {
        public /* synthetic */ C10047a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final PassiveFormFragment mo21169a(@C12579k FormModel formModel, boolean z) {
            Intrinsics.checkNotNullParameter(formModel, C40045d.f102104u);
            PassiveFormFragment passiveFormFragment = new PassiveFormFragment();
            passiveFormFragment.setArguments(BaseForm.f27615g.mo21152a(formModel, z));
            return passiveFormFragment;
        }

        public C10047a() {
        }
    }

    @C12579k
    /* renamed from: K0 */
    public C10057b mo21139K0() {
        return new C10059d(mo21143O0().getPages(), mo21168X0());
    }

    @C12579k
    /* renamed from: W0 */
    public PassiveFormFragment mo21160u() {
        return this.f27642Y;
    }

    /* renamed from: X0 */
    public final PassiveSubmissionManager mo21168X0() {
        return (PassiveSubmissionManager) this.f27641X.getValue();
    }

    /* renamed from: i */
    public void mo21159i() {
        View view = getView();
        if (view != null) {
            ExtensionViewKt.m38318b(view);
        }
        C10058c P0 = mo21144P0();
        if (P0 != null) {
            P0.mo21178i();
        }
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getWindow().setSoftInputMode(19);
        UsabillaInternal.C9721a aVar = UsabillaInternal.f26661z;
        if (UsabillaInternal.C9721a.m36482b(aVar, (C9818a) null, (C10118d) null, 3, (Object) null).mo19847c() == null) {
            UsabillaInternal.C9721a.m36482b(aVar, (C9818a) null, (C10118d) null, 3, (Object) null).mo19838C(mo21143O0());
        }
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        if (bundle != null && bundle.containsKey(BaseForm.f27619y)) {
            Parcelable parcelable = bundle.getParcelable(BaseForm.f27619y);
            Intrinsics.checkNotNull(parcelable);
            Intrinsics.checkNotNullExpressionValue(parcelable, "savedInstanceState.getParcelable(SAVED_MODEL)!!");
            mo21149U0((FormModel) parcelable);
        }
        if (bundle != null && mo21142N0() == null) {
            mo21148T0(bundle.getString(BaseForm.f27618x));
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        return new FormView(requireContext, mo21141M0());
    }

    public void onDestroy() {
        super.onDestroy();
        UsabillaInternal.C9721a aVar = UsabillaInternal.f26661z;
        if (UsabillaInternal.C9721a.m36482b(aVar, (C9818a) null, (C10118d) null, 3, (Object) null).mo19847c() != null) {
            UsabillaInternal.C9721a.m36482b(aVar, (C9818a) null, (C10118d) null, 3, (Object) null).mo19838C((FormModel) null);
        }
    }

    /* renamed from: y0 */
    public void mo20561y0() {
    }
}
