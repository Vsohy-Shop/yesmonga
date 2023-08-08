package com.urbanairship.android.layout.model;

import android.content.Context;
import android.os.Bundle;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.environment.C35603k;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.environment.LayoutEvent;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.event.ReportingEvent;
import com.urbanairship.android.layout.info.C35693v0;
import com.urbanairship.android.layout.info.C35695w0;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.C35838i;
import com.urbanairship.android.layout.reporting.C35867c;
import com.urbanairship.android.layout.reporting.C35869e;
import com.urbanairship.android.layout.view.WebViewView;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class WebViewModel extends BaseModel<WebViewView, BaseModel.C35725a> {
    @C12579k

    /* renamed from: o */
    public final String f88401o;
    @C12580l

    /* renamed from: p */
    public Bundle f88402p;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewModel(String str, C35835f fVar, C35830c cVar, C35693v0 v0Var, List list, List list2, ModelEnvironment modelEnvironment, C35804j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : fVar, (i & 4) != 0 ? null : cVar, (i & 8) != 0 ? null : v0Var, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, modelEnvironment, jVar);
    }

    @C12580l
    /* renamed from: K */
    public final Bundle mo107183K() {
        return this.f88402p;
    }

    @C12579k
    /* renamed from: L */
    public final String mo107184L() {
        return this.f88401o;
    }

    /* renamed from: M */
    public final void mo107185M() {
        mo106986E(new ReportingEvent.C35617c(mo106997l().mo106629c().mo107378b()), C35603k.m146913i(mo106999n(), (C35867c) null, (C35869e) null, (String) null, 7, (Object) null));
        mo106991f(LayoutEvent.C35585a.f87985a);
    }

    @C12579k
    /* renamed from: N */
    public WebViewView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        WebViewView webViewView = new WebViewView(context, this, pVar);
        webViewView.setId(mo107003r());
        return webViewView;
    }

    /* renamed from: O */
    public void mo106983B(@C12579k WebViewView webViewView) {
        Intrinsics.checkNotNullParameter(webViewView, C40383c.f102945c);
        if (C35838i.m147766b(mo106998m())) {
            C11723c2 unused = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new WebViewModel$onViewAttached$1(webViewView, this, (C11045c<? super WebViewModel$onViewAttached$1>) null), 3, (Object) null);
        }
    }

    /* renamed from: P */
    public final void mo107188P(@C12580l Bundle bundle) {
        this.f88402p = bundle;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WebViewModel(@org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r13, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r14, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r15, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r16, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r17, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r18, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r19) {
        /*
            r11 = this;
            r0 = r12
            java.lang.String r1 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "environment"
            r9 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "properties"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            com.urbanairship.android.layout.property.ViewType r3 = com.urbanairship.android.layout.property.ViewType.WEB_VIEW
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r11
            r1.f88401o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.WebViewModel.<init>(java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebViewModel(@C12579k C35695w0 w0Var, @C12579k ModelEnvironment modelEnvironment, @C12579k C35804j jVar) {
        this(w0Var.mo106849k(), w0Var.getBackgroundColor(), w0Var.mo106778h(), w0Var.getVisibility(), w0Var.mo106779i(), w0Var.mo106774d(), modelEnvironment, jVar);
        Intrinsics.checkNotNullParameter(w0Var, C28531e0.f69094x);
        Intrinsics.checkNotNullParameter(modelEnvironment, "env");
        Intrinsics.checkNotNullParameter(jVar, "props");
    }
}
