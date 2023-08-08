package com.usabilla.sdk.ubform.sdk.featurebilla;

import com.squareup.moshi.C35410s;
import com.usabilla.sdk.ubform.net.C9853d;
import com.usabilla.sdk.ubform.net.http.C9870g;
import com.usabilla.sdk.ubform.net.http.C9872i;
import com.usabilla.sdk.ubform.sdk.form.model.SettingsModel;
import com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

public final class FeaturebillaServiceImpl implements C9952b {
    @C12579k

    /* renamed from: a */
    public final C9870g f27428a;
    @C12579k

    /* renamed from: b */
    public final C9853d f27429b;
    @C12579k

    /* renamed from: c */
    public final C35410s f27430c;

    public FeaturebillaServiceImpl(@C12579k C9870g gVar, @C12579k C9853d dVar, @C12579k C35410s sVar) {
        Intrinsics.checkNotNullParameter(gVar, "client");
        Intrinsics.checkNotNullParameter(dVar, "requestBuilder");
        Intrinsics.checkNotNullParameter(sVar, "moshi");
        this.f27428a = gVar;
        this.f27429b = dVar;
        this.f27430c = sVar;
    }

    @C12579k
    /* renamed from: a */
    public C11907e<SettingsModel> mo20812a() {
        C9872i d = this.f27429b.mo20277d();
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27428a, d), new FeaturebillaServiceImpl$getSettings$1(this), new FeaturebillaServiceImpl$getSettings$2(d));
    }
}
