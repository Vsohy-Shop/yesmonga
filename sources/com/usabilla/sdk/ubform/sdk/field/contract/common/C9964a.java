package com.usabilla.sdk.ubform.sdk.field.contract.common;

import com.usabilla.sdk.ubform.sdk.C9912b;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import com.usabilla.sdk.ubform.sdk.rule.RuleFieldModel;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.common.a */
public interface C9964a {

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.common.a$a */
    public interface C9965a<M, V> extends C9912b<C9966b> {
        @C12579k
        /* renamed from: A */
        List<RuleFieldModel> mo20822A(@C12579k Map<String, ? extends List<String>> map, @C12579k Map<String, ? extends RuleFieldModel> map2);

        /* renamed from: B */
        void mo20823B(boolean z);

        /* renamed from: R */
        void mo20824R(V v);

        @C12580l
        /* renamed from: j */
        FieldView<?> mo20825j();

        /* renamed from: p */
        M mo20826p();

        /* renamed from: r */
        void mo20827r(@C12580l FieldView<?> fieldView);

        @C12579k
        /* renamed from: s */
        String mo20828s();

        boolean validate();

        /* renamed from: z */
        void mo20830z(boolean z);
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.common.a$b */
    public interface C9966b {
        /* renamed from: c */
        void mo20831c();

        /* renamed from: d */
        void mo20832d();

        /* renamed from: e */
        void mo20833e();

        /* renamed from: g */
        void mo20834g(@C12580l String str);

        /* renamed from: j */
        void mo20835j();

        void setDefaultContentDescription(@C12580l String str, boolean z);

        void setErrorVisible(boolean z);

        void setFieldVisible(boolean z);

        void setTitleText(@C12580l String str, @C12580l String str2);
    }
}
