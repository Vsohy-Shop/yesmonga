package com.usabilla.sdk.ubform.sdk.form.contract;

import com.usabilla.sdk.ubform.sdk.C9912b;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.form.presenter.C10058c;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import com.usabilla.sdk.ubform.sdk.page.presenter.PagePresenter;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.form.contract.a */
public interface C10053a {

    /* renamed from: com.usabilla.sdk.ubform.sdk.form.contract.a$a */
    public interface C10054a extends C9912b<C10055b> {
        /* renamed from: E */
        void mo21172E(@C12579k String str);

        /* renamed from: Q */
        int mo21173Q();

        /* renamed from: a */
        void mo21174a(@C12580l UbScreenshot ubScreenshot);

        /* renamed from: b */
        int mo21175b();

        @C12579k
        /* renamed from: c */
        FormModel mo21176c();

        /* renamed from: e */
        void mo21177e();

        /* renamed from: i */
        void mo21178i();

        @C12579k
        /* renamed from: m */
        ArrayList<PagePresenter> mo21179m();

        @C12580l
        /* renamed from: y */
        PageModel mo21180y(int i);
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.form.contract.a$b */
    public interface C10055b {
        /* renamed from: a */
        void mo21181a(@C12579k List<PagePresenter> list);

        /* renamed from: b */
        void mo21182b(int i);

        /* renamed from: c */
        void mo21183c();

        /* renamed from: d */
        void mo21184d(int i);

        int getCurrentItem();

        @C12580l
        C10058c getFormPresenter();

        void setFormPresenter(@C12580l C10058c cVar);

        void setTheme(@C12579k UbInternalTheme ubInternalTheme);

        void setupProgressBar(int i, int i2, int i3);
    }
}
