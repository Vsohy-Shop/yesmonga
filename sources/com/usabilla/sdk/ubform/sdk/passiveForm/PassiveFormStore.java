package com.usabilla.sdk.ubform.sdk.passiveForm;

import com.usabilla.sdk.ubform.p007db.form.C9781a;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public class PassiveFormStore {
    @C12579k

    /* renamed from: a */
    public final PassiveFormService f27715a;
    @C12579k

    /* renamed from: b */
    public final C9781a f27716b;

    public PassiveFormStore(@C12579k PassiveFormService passiveFormService, @C12579k C9781a aVar) {
        Intrinsics.checkNotNullParameter(passiveFormService, "service");
        Intrinsics.checkNotNullParameter(aVar, "dao");
        this.f27715a = passiveFormService;
        this.f27716b = aVar;
    }

    @C12579k
    /* renamed from: c */
    public final C11907e<FormModel> mo21485c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "formId");
        return C11909g.m47494u(C11909g.m47352B0(this.f27715a.mo21477e(str), new PassiveFormStore$getForm$1(this, str, (C11045c<? super PassiveFormStore$getForm$1>) null)), new PassiveFormStore$getForm$2(this, str, (C11045c<? super PassiveFormStore$getForm$2>) null));
    }

    /* renamed from: d */
    public final C11907e<FormModel> mo21486d(String str) {
        return new PassiveFormStore$getFormFromCache$$inlined$map$1(this.f27716b.get(str));
    }

    @C12579k
    /* renamed from: e */
    public final C11907e<Integer> mo21487e() {
        return this.f27716b.mo20039a();
    }
}
