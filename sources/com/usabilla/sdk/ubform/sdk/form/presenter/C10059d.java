package com.usabilla.sdk.ubform.sdk.form.presenter;

import com.usabilla.sdk.ubform.sdk.field.model.common.ClientModel;
import com.usabilla.sdk.ubform.sdk.form.BaseForm;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.page.PageType;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import com.usabilla.sdk.ubform.sdk.passiveForm.PassiveSubmissionManager;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.form.presenter.d */
public final class C10059d implements C10057b {
    @C12579k

    /* renamed from: a */
    public final List<PageModel> f27655a;
    @C12579k

    /* renamed from: b */
    public final PassiveSubmissionManager f27656b;

    public C10059d(@C12579k List<PageModel> list, @C12579k PassiveSubmissionManager passiveSubmissionManager) {
        Intrinsics.checkNotNullParameter(list, "pages");
        Intrinsics.checkNotNullParameter(passiveSubmissionManager, "passiveSubmissionManager");
        this.f27655a = list;
        this.f27656b = passiveSubmissionManager;
    }

    /* renamed from: a */
    public boolean mo21352a(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "currentPageType");
        Intrinsics.checkNotNullParameter(str2, "nextPageType");
        return !Intrinsics.areEqual((Object) str, (Object) PageType.END.mo21378q());
    }

    /* renamed from: b */
    public int mo21353b() {
        int i;
        List<PageModel> list = this.f27655a;
        ListIterator<PageModel> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (Intrinsics.areEqual((Object) listIterator.previous().mo21418t(), (Object) PageType.FORM.mo21378q())) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        return i + 1 + 1;
    }

    /* renamed from: c */
    public void mo21354c(@C12579k String str, @C12579k String str2, @C12579k FormModel formModel, @C12579k ClientModel clientModel) {
        Intrinsics.checkNotNullParameter(str, "currentPageType");
        Intrinsics.checkNotNullParameter(str2, "nextPageType");
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        Intrinsics.checkNotNullParameter(clientModel, "clientModel");
        if (Intrinsics.areEqual((Object) str2, (Object) PageType.END.mo21378q())) {
            this.f27656b.mo21492e(formModel, clientModel);
        }
    }

    /* renamed from: d */
    public int mo21355d(int i) {
        return i + 1;
    }
}
