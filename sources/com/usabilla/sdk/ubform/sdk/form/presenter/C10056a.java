package com.usabilla.sdk.ubform.sdk.form.presenter;

import com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager;
import com.usabilla.sdk.ubform.sdk.field.model.common.ClientModel;
import com.usabilla.sdk.ubform.sdk.form.BaseForm;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.page.PageType;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.form.presenter.a */
public final class C10056a implements C10057b {
    @C12579k

    /* renamed from: a */
    public final List<PageModel> f27645a;
    @C12579k

    /* renamed from: b */
    public final CampaignSubmissionManager f27646b;

    public C10056a(@C12579k List<PageModel> list, @C12579k CampaignSubmissionManager campaignSubmissionManager) {
        Intrinsics.checkNotNullParameter(list, "pages");
        Intrinsics.checkNotNullParameter(campaignSubmissionManager, "campaignSubmissionManager");
        this.f27645a = list;
        this.f27646b = campaignSubmissionManager;
    }

    /* renamed from: a */
    public boolean mo21352a(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "currentPageType");
        Intrinsics.checkNotNullParameter(str2, "nextPageType");
        return !Intrinsics.areEqual((Object) str2, (Object) PageType.TOAST.mo21378q());
    }

    /* renamed from: b */
    public int mo21353b() {
        int i;
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f27645a) {
            if (!Intrinsics.areEqual((Object) ((PageModel) next).mo21418t(), (Object) PageType.BANNER.mo21378q())) {
                arrayList.add(next);
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (Intrinsics.areEqual((Object) ((PageModel) listIterator.previous()).mo21418t(), (Object) PageType.FORM.mo21378q())) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        return i + 1;
    }

    /* renamed from: c */
    public void mo21354c(@C12579k String str, @C12579k String str2, @C12579k FormModel formModel, @C12579k ClientModel clientModel) {
        Intrinsics.checkNotNullParameter(str, "currentPageType");
        Intrinsics.checkNotNullParameter(str2, "nextPageType");
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        Intrinsics.checkNotNullParameter(clientModel, "clientModel");
        if (Intrinsics.areEqual((Object) str2, (Object) PageType.TOAST.mo21378q())) {
            this.f27646b.mo20789k(formModel);
        } else if (Intrinsics.areEqual((Object) str, (Object) PageType.BANNER.mo21378q())) {
            this.f27646b.mo20791m(formModel);
        } else if (Intrinsics.areEqual((Object) str, (Object) PageType.FORM.mo21378q())) {
            this.f27646b.mo20790l(formModel);
        }
    }

    /* renamed from: d */
    public int mo21355d(int i) {
        return i;
    }
}
