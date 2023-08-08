package com.usabilla.sdk.ubform.sdk.page.contract;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.usabilla.sdk.ubform.sdk.C9912b;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigNavigation;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.rule.RuleFieldModel;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONException;

/* renamed from: com.usabilla.sdk.ubform.sdk.page.contract.a */
public interface C10061a {

    /* renamed from: com.usabilla.sdk.ubform.sdk.page.contract.a$a */
    public interface C10062a extends C9912b<C10063b> {
        /* renamed from: J */
        void mo21379J(@C12579k FieldPresenter<?, ?> fieldPresenter);

        /* renamed from: T */
        void mo20712T();

        /* renamed from: X */
        int mo20714X();

        /* renamed from: a */
        void mo20717a(@C12580l UbScreenshot ubScreenshot);

        /* renamed from: e */
        void mo20721e();

        /* renamed from: h */
        void mo20725h();

        @C12579k
        /* renamed from: k */
        Map<String, List<String>> mo21380k();

        @C12579k
        /* renamed from: o */
        Map<String, RuleFieldModel> mo21381o();

        /* renamed from: w */
        void mo20735w(@C12579k String str, @C12579k List<String> list);
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.page.contract.a$b */
    public interface C10063b {

        /* renamed from: com.usabilla.sdk.ubform.sdk.page.contract.a$b$a */
        public static final class C10064a {
            /* renamed from: a */
            public static /* synthetic */ void m38064a(C10063b bVar, List list, boolean z, int i, Object obj) throws JSONException {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        z = false;
                    }
                    bVar.mo21382a(list, z);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFields");
            }
        }

        /* renamed from: a */
        void mo21382a(@C12579k List<? extends FieldModel<?>> list, boolean z) throws JSONException;

        /* renamed from: b */
        void mo21383b(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme);

        /* renamed from: c */
        void mo21384c(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme);

        @C12579k
        /* renamed from: d */
        Button mo21385d(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme);

        /* renamed from: e */
        void mo21386e(int i, @C12579k String str, @C12579k UbInternalTheme ubInternalTheme);

        /* renamed from: f */
        void mo21387f(@C12579k View view);

        @C12579k
        /* renamed from: g */
        Button mo21388g(@C12579k BannerConfigNavigation bannerConfigNavigation, @C12579k UbInternalTheme ubInternalTheme);

        @C12579k
        ViewGroup getFieldsContainer();

        /* renamed from: h */
        void mo21390h(int i);

        /* renamed from: i */
        void mo21391i(@C12579k String str);

        /* renamed from: j */
        void mo21392j(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme);

        @C12579k
        /* renamed from: k */
        Button mo21393k(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme);

        /* renamed from: l */
        void mo21394l(@C12579k UbInternalTheme ubInternalTheme, boolean z);

        /* renamed from: m */
        void mo21395m(int i);

        void setComponentVisibility(int i, boolean z);
    }
}
