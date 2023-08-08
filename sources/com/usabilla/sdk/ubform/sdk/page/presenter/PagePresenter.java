package com.usabilla.sdk.ubform.sdk.page.presenter;

import com.google.android.gms.measurement.api.C30638a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.field.model.ButtonModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import com.usabilla.sdk.ubform.sdk.form.FormType;
import com.usabilla.sdk.ubform.sdk.form.contract.C10053a;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import com.usabilla.sdk.ubform.sdk.rule.RulePageModel;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PagePresenter extends C10067a implements C10061a.C10062a {

    /* renamed from: com.usabilla.sdk.ubform.sdk.page.presenter.PagePresenter$a */
    public /* synthetic */ class C10066a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormType.values().length];
            iArr[FormType.CAMPAIGN.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagePresenter(@C12579k C10053a.C10054a aVar, @C12579k PageModel pageModel) {
        super(pageModel, aVar.mo21176c().getTheme());
        Intrinsics.checkNotNullParameter(aVar, "formPresenter");
        Intrinsics.checkNotNullParameter(pageModel, "pageModel");
        mo21441S(aVar);
    }

    /* renamed from: T */
    public void mo20712T() {
        FormModel formModel;
        String str;
        C10053a.C10054a F = mo21434F();
        if (F == null) {
            formModel = null;
        } else {
            formModel = F.mo21176c();
        }
        boolean z = false;
        if (formModel != null && formModel.isFooterLogoClickable()) {
            z = true;
        }
        if (z) {
            if (C10066a.$EnumSwitchMapping$0[formModel.getFormType().ordinal()] == 1) {
                str = C30638a.C30639a.f73205n;
            } else {
                str = "passive";
            }
            C10061a.C10063b H = mo21436H();
            if (H != null) {
                H.mo21391i(str);
            }
        }
    }

    /* renamed from: W */
    public final void mo21427W() {
        FormModel formModel;
        C10061a.C10063b H;
        C10053a.C10054a F = mo21434F();
        if (F == null) {
            formModel = null;
        } else {
            formModel = F.mo21176c();
        }
        boolean z = false;
        if (formModel != null && formModel.getAreNavigationButtonsVisible()) {
            z = true;
        }
        if (z && (H = mo21436H()) != null) {
            H.mo21386e(C9747c.C9756i.ub_page_last_button_cancel, formModel.getTextButtonClose(), mo21437I());
        }
    }

    /* renamed from: X */
    public int mo20714X() {
        return C9747c.C9759l.ub_page;
    }

    /* renamed from: Y */
    public final void mo21428Y() {
        FormModel formModel;
        C10061a.C10063b H;
        C10053a.C10054a F = mo21434F();
        String str = null;
        if (F == null) {
            formModel = null;
        } else {
            formModel = F.mo21176c();
        }
        boolean z = false;
        if (formModel != null && formModel.getAreNavigationButtonsVisible()) {
            z = true;
        }
        if (z && (H = mo21436H()) != null) {
            H.mo21390h(mo21437I().getColors().getAccent());
            H.mo21393k(formModel.getTextButtonClose(), mo21437I());
            if (mo21435G().mo21416r()) {
                H.mo21385d(formModel.getTextButtonSubmit(), mo21437I());
                return;
            }
            ButtonModel buttonModel = (ButtonModel) SequencesKt___SequencesKt.m44641F0(SequencesKt___SequencesKt.m44761k1(SequencesKt___SequencesKt.m44780p0(CollectionsKt___CollectionsKt.m40700v1(mo21435G().mo21412n()), PagePresenter$addNavigationPageButtons$1$textContinueButton$1.f27676f), PagePresenter$addNavigationPageButtons$1$textContinueButton$2.f27677f));
            if (buttonModel != null) {
                str = buttonModel.mo20875y();
            }
            if (str == null) {
                str = formModel.getTextButtonNext();
            }
            Intrinsics.checkNotNullExpressionValue(str, "pageModel.fields.asSequence().filter { field -> field.fieldType == FieldType.CONTINUE }\n                        .map { field -> field as ButtonModel }\n                        .firstOrNull()?.continueText ?: formModel.textButtonNext");
            H.mo21385d(str, mo21437I());
        }
    }

    /* renamed from: Z */
    public final boolean mo21429Z() {
        FieldView<?> fieldView;
        C10061a.C10063b H;
        Iterator<FieldPresenter<?, ?>> it = mo21433D().iterator();
        boolean z = true;
        while (true) {
            if (!it.hasNext()) {
                fieldView = null;
                break;
            }
            FieldPresenter next = it.next();
            boolean validate = next.validate();
            next.mo20830z(!validate);
            if (!validate) {
                fieldView = next.mo20825j();
                z = validate;
                break;
            }
            z = validate;
        }
        if (!(fieldView == null || (H = mo21436H()) == null)) {
            H.mo21387f(fieldView);
        }
        return z;
    }

    /* renamed from: a */
    public void mo20717a(@C12580l UbScreenshot ubScreenshot) {
        C10053a.C10054a F = mo21434F();
        if (F != null) {
            F.mo21174a(ubScreenshot);
        }
    }

    /* renamed from: e */
    public void mo20721e() {
        C10053a.C10054a F = mo21434F();
        if (F != null) {
            F.mo21177e();
        }
    }

    /* renamed from: h */
    public void mo20725h() {
        if (mo21429Z()) {
            String l = mo21435G().mo21410l();
            RulePageModel M = mo21438M();
            if (M != null) {
                l = M.mo21511e();
                Intrinsics.checkNotNullExpressionValue(l, "it.jumpTo");
            }
            C10053a.C10054a F = mo21434F();
            if (F != null) {
                F.mo21172E(l);
            }
        }
    }

    /* renamed from: u */
    public void mo20469u() {
        C10053a.C10054a F;
        FormModel c;
        String errorMessage;
        C10061a.C10063b H;
        C10061a.C10063b H2 = mo21436H();
        if (H2 != null) {
            H2.mo21395m(mo21437I().getColors().getBackground());
        }
        if (mo21435G().mo21420u()) {
            mo21443l(mo21435G().mo21412n());
            mo21427W();
            C10061a.C10063b H3 = mo21436H();
            if (H3 != null) {
                H3.mo21394l(mo21437I(), true);
                return;
            }
            return;
        }
        if (!(!mo21435G().mo21408i() || (F = mo21434F()) == null || (c = F.mo21176c()) == null || (errorMessage = c.getErrorMessage()) == null || (H = mo21436H()) == null)) {
            H.mo21383b(errorMessage, mo21437I());
        }
        mo21432C();
        mo21428Y();
        C10061a.C10063b H4 = mo21436H();
        if (H4 != null) {
            H4.mo21394l(mo21437I(), false);
        }
    }
}
