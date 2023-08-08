package com.usabilla.sdk.ubform.sdk.featurebilla;

import com.squareup.moshi.C35384h;
import com.usabilla.sdk.ubform.net.http.C9873j;
import com.usabilla.sdk.ubform.sdk.form.model.SettingsModel;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/net/http/j;", "it", "Lcom/usabilla/sdk/ubform/sdk/form/model/SettingsModel;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class FeaturebillaServiceImpl$getSettings$1 extends Lambda implements C11300l<C9873j, SettingsModel> {
    final /* synthetic */ FeaturebillaServiceImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeaturebillaServiceImpl$getSettings$1(FeaturebillaServiceImpl featurebillaServiceImpl) {
        super(1);
        this.this$0 = featurebillaServiceImpl;
    }

    @C12579k
    /* renamed from: a */
    public final SettingsModel invoke(@C12579k C9873j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "it");
        C35384h<SettingsModel> c = this.this$0.f27430c.mo106085c(SettingsModel.class);
        String body = jVar.getBody();
        Intrinsics.checkNotNull(body);
        SettingsModel fromJson = c.fromJson(body);
        Intrinsics.checkNotNull(fromJson);
        return fromJson;
    }
}
