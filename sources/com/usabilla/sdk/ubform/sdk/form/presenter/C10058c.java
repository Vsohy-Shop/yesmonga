package com.usabilla.sdk.ubform.sdk.form.presenter;

import com.google.android.gms.analytics.ecommerce.C40383c;
import com.usabilla.sdk.ubform.C9826e;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.entity.FeedbackResult;
import com.usabilla.sdk.ubform.sdk.field.model.common.ClientModel;
import com.usabilla.sdk.ubform.sdk.form.BaseForm;
import com.usabilla.sdk.ubform.sdk.form.C10049b;
import com.usabilla.sdk.ubform.sdk.form.contract.C10053a;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.page.PageType;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import com.usabilla.sdk.ubform.sdk.page.presenter.PagePresenter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.form.presenter.c */
public final class C10058c implements C10053a.C10054a {
    @C12579k

    /* renamed from: a */
    public final C10049b f27647a;
    @C12579k

    /* renamed from: b */
    public final FormModel f27648b;
    @C12579k

    /* renamed from: c */
    public final C10057b f27649c;
    @C12579k

    /* renamed from: d */
    public final ClientModel f27650d;

    /* renamed from: e */
    public final boolean f27651e;
    @C12580l

    /* renamed from: f */
    public C10053a.C10055b f27652f;

    /* renamed from: g */
    public final int f27653g = 2;
    @C12579k

    /* renamed from: v */
    public final ArrayList<PagePresenter> f27654v = new ArrayList<>();

    public C10058c(@C12579k C10049b bVar, @C12579k FormModel formModel, @C12579k C10057b bVar2, @C12579k ClientModel clientModel, boolean z) {
        Intrinsics.checkNotNullParameter(bVar, "formFragment");
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        Intrinsics.checkNotNullParameter(bVar2, "pageHandler");
        Intrinsics.checkNotNullParameter(clientModel, "clientModel");
        this.f27647a = bVar;
        this.f27648b = formModel;
        this.f27649c = bVar2;
        this.f27650d = clientModel;
        this.f27651e = z;
    }

    /* renamed from: C */
    public final void mo21356C(FeedbackResult feedbackResult, String str) {
        if (!this.f27651e || !mo21176c().shouldInviteForPlayStoreReview()) {
            mo21358F(feedbackResult, mo21176c().generateEntriesString());
        } else {
            this.f27647a.mo20558L(feedbackResult, str);
        }
    }

    /* renamed from: D */
    public final void mo21357D() {
        C9826e eVar;
        String buttonTextForIndex = mo21176c().getButtonTextForIndex(mo21176c().getCurrentPageIndex());
        WeakReference<C9826e> sdkCallbackReference = mo21176c().getSdkCallbackReference();
        if ((!C11622t.isBlank(buttonTextForIndex)) && sdkCallbackReference != null && (eVar = sdkCallbackReference.get()) != null) {
            eVar.mo20165c(buttonTextForIndex);
        }
    }

    /* renamed from: E */
    public void mo21172E(@C12579k String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "nameNextPage");
        int currentPageIndex = mo21176c().getCurrentPageIndex();
        int t = mo21366t(str);
        if (t == -1) {
            t = currentPageIndex + 1;
        }
        PageModel pageModel = mo21176c().getPages().get(currentPageIndex);
        if (t < mo21176c().getPages().size()) {
            str2 = mo21176c().getPages().get(t).mo21418t();
        } else {
            str2 = "";
        }
        this.f27649c.mo21354c(pageModel.mo21418t(), str2, mo21176c(), this.f27650d);
        if (this.f27649c.mo21352a(pageModel.mo21418t(), str2)) {
            mo21367v(t);
            mo21357D();
        } else if (Intrinsics.areEqual((Object) str2, (Object) PageType.TOAST.mo21378q())) {
            mo21364l(mo21176c().getPages().get(t).mo21417s());
        } else {
            mo21365q();
        }
    }

    /* renamed from: F */
    public final void mo21358F(FeedbackResult feedbackResult, String str) {
        this.f27647a.mo20560m0(str);
        this.f27647a.mo20559T(feedbackResult);
    }

    /* renamed from: G */
    public final void mo21359G() {
        C10053a.C10055b bVar = this.f27652f;
        if (bVar != null) {
            bVar.setTheme(mo21176c().getTheme());
        }
    }

    /* renamed from: H */
    public final void mo21360H() {
        C10053a.C10055b bVar;
        if ((mo21176c().getPages().size() <= mo21173Q() || !mo21176c().isProgressBarVisible()) && (bVar = this.f27652f) != null) {
            bVar.mo21183c();
        }
    }

    /* renamed from: O */
    public void mo20466O() {
        this.f27652f = null;
        this.f27650d.mo20965k();
    }

    /* renamed from: Q */
    public int mo21173Q() {
        return this.f27653g;
    }

    /* renamed from: a */
    public void mo21174a(@C12580l UbScreenshot ubScreenshot) {
        this.f27647a.mo21151W(mo21176c().getTheme(), ubScreenshot);
    }

    /* renamed from: b */
    public int mo21175b() {
        return this.f27649c.mo21353b();
    }

    @C12579k
    /* renamed from: c */
    public FormModel mo21176c() {
        return this.f27648b;
    }

    /* renamed from: d */
    public void mo20465L(@C12579k C10053a.C10055b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40383c.f102945c);
        this.f27652f = bVar;
        this.f27650d.mo20964j();
    }

    /* renamed from: e */
    public void mo21177e() {
        mo21363g();
    }

    /* renamed from: f */
    public final void mo21362f() {
        C10053a.C10055b bVar = this.f27652f;
        if (bVar != null) {
            for (PageModel pagePresenter : mo21176c().getPages()) {
                mo21179m().add(new PagePresenter(this, pagePresenter));
            }
            bVar.mo21181a(mo21179m());
        }
    }

    /* renamed from: g */
    public final void mo21363g() {
        this.f27647a.mo20561y0();
        FeedbackResult generateFeedbackResultFromPage = mo21176c().generateFeedbackResultFromPage();
        if (Intrinsics.areEqual((Object) mo21176c().getPages().get(mo21176c().getCurrentPageIndex()).mo21418t(), (Object) PageType.END.mo21378q())) {
            mo21356C(generateFeedbackResultFromPage, mo21176c().generateEntriesString());
        } else {
            mo21358F(generateFeedbackResultFromPage, mo21176c().generateEntriesString());
        }
    }

    /* renamed from: i */
    public void mo21178i() {
        C10053a.C10055b bVar = this.f27652f;
        if (bVar != null) {
            mo21179m().get(bVar.getCurrentItem()).mo20725h();
        }
    }

    /* renamed from: l */
    public final void mo21364l(String str) {
        FeedbackResult generateFeedbackResultFromToast = mo21176c().generateFeedbackResultFromToast();
        this.f27647a.mo20561y0();
        mo21356C(generateFeedbackResultFromToast, mo21176c().generateEntriesString());
        this.f27647a.mo20557C(str);
    }

    @C12579k
    /* renamed from: m */
    public ArrayList<PagePresenter> mo21179m() {
        return this.f27654v;
    }

    /* renamed from: q */
    public final void mo21365q() {
        FeedbackResult generateFeedbackResultFromPage = mo21176c().generateFeedbackResultFromPage();
        this.f27647a.mo20561y0();
        mo21356C(generateFeedbackResultFromPage, mo21176c().generateEntriesString());
    }

    /* renamed from: t */
    public final int mo21366t(String str) {
        int i = 0;
        for (PageModel p : mo21176c().getPages()) {
            if (Intrinsics.areEqual((Object) p.mo21414p(), (Object) str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: u */
    public void mo20469u() {
        C10053a.C10055b bVar = this.f27652f;
        if (bVar != null) {
            bVar.setupProgressBar(mo21176c().getTheme().getColors().getBackground(), mo21176c().getTheme().getColors().getAccent(), mo21175b());
        }
        mo21359G();
        mo21362f();
        mo21360H();
        mo21367v(mo21176c().getCurrentPageIndex());
        mo21357D();
    }

    /* renamed from: v */
    public final void mo21367v(int i) {
        mo21176c().setCurrentPageIndex(i);
        C10053a.C10055b bVar = this.f27652f;
        if (bVar != null) {
            bVar.mo21184d(i);
        }
        C10053a.C10055b bVar2 = this.f27652f;
        if (bVar2 != null) {
            bVar2.mo21182b(this.f27649c.mo21355d(i));
        }
    }

    @C12580l
    /* renamed from: y */
    public PageModel mo21180y(int i) {
        List<PageModel> pages = mo21176c().getPages();
        if (pages.size() <= i) {
            return null;
        }
        return pages.get(i);
    }
}
