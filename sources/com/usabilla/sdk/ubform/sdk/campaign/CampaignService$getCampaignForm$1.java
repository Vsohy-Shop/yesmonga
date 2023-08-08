package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.net.http.C9873j;
import com.usabilla.sdk.ubform.net.parser.C9875b;
import com.usabilla.sdk.ubform.sdk.banner.BannerPosition;
import com.usabilla.sdk.ubform.sdk.form.FormType;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.utils.ext.C10131e;
import com.usabilla.sdk.ubform.utils.ext.ExtensionJsonKt;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/net/http/j;", "response", "Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignService$getCampaignForm$1 extends Lambda implements C11300l<C9873j, FormModel> {
    final /* synthetic */ ConcurrentMap<String, String> $customVariables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignService$getCampaignForm$1(ConcurrentMap<String, String> concurrentMap) {
        super(1);
        this.$customVariables = concurrentMap;
    }

    @C12579k
    /* renamed from: a */
    public final FormModel invoke(@C12579k C9873j jVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(jVar, "response");
        JSONObject jSONObject = new JSONObject(jVar.getBody());
        C9875b bVar = ExtensionJsonKt.m38313b().get(C11342l0.m43547d(FormModel.class));
        Object obj2 = null;
        if (bVar == null) {
            obj = null;
        } else {
            obj = bVar.mo20320a(jSONObject);
        }
        if (obj instanceof FormModel) {
            obj2 = obj;
        }
        FormModel formModel = (FormModel) obj2;
        if (formModel != null) {
            return FormModel.copy$default(formModel, (FormType) null, (UbInternalTheme) null, C10131e.m38336a(this.$customVariables), (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, 0, 1048571, (Object) null);
        }
        throw new IllegalStateException("Parser not found");
    }
}
