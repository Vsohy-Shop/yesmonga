package com.usabilla.sdk.ubform.sdk.passiveForm;

import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PassiveFormStore$getFormFromCache$$inlined$map$1 implements C11907e<FormModel> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f27717a;

    public PassiveFormStore$getFormFromCache$$inlined$map$1(C11907e eVar) {
        this.f27717a = eVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f27717a.collect(new C11908f<String>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormStore$getFormFromCache$$inlined$map$1.C100792.C100801
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormStore$getFormFromCache$$inlined$map$1$2$1 r0 = (com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormStore$getFormFromCache$$inlined$map$1.C100792.C100801) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormStore$getFormFromCache$$inlined$map$1$2$1 r0 = new com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormStore$getFormFromCache$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r7)
                    goto L_0x0074
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    kotlin.C11661u0.m45747n(r7)
                    kotlinx.coroutines.flow.f r7 = r3
                    java.lang.String r6 = (java.lang.String) r6
                    int r2 = r6.length()
                    if (r2 <= 0) goto L_0x0040
                    r2 = r3
                    goto L_0x0041
                L_0x0040:
                    r2 = 0
                L_0x0041:
                    if (r2 == 0) goto L_0x007f
                    org.json.JSONObject r2 = new org.json.JSONObject
                    r2.<init>(r6)
                    java.util.Map r6 = com.usabilla.sdk.ubform.utils.ext.ExtensionJsonKt.m38313b()
                    java.lang.Class<com.usabilla.sdk.ubform.sdk.form.model.FormModel> r4 = com.usabilla.sdk.ubform.sdk.form.model.FormModel.class
                    kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
                    java.lang.Object r6 = r6.get(r4)
                    com.usabilla.sdk.ubform.net.parser.b r6 = (com.usabilla.sdk.ubform.net.parser.C9875b) r6
                    r4 = 0
                    if (r6 != 0) goto L_0x005d
                    r6 = r4
                    goto L_0x0061
                L_0x005d:
                    java.lang.Object r6 = r6.mo20320a(r2)
                L_0x0061:
                    boolean r2 = r6 instanceof com.usabilla.sdk.ubform.sdk.form.model.FormModel
                    if (r2 != 0) goto L_0x0066
                    goto L_0x0067
                L_0x0066:
                    r4 = r6
                L_0x0067:
                    com.usabilla.sdk.ubform.sdk.form.model.FormModel r4 = (com.usabilla.sdk.ubform.sdk.form.model.FormModel) r4
                    if (r4 == 0) goto L_0x0077
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r4, r0)
                    if (r6 != r1) goto L_0x0074
                    return r1
                L_0x0074:
                    kotlin.d2 r6 = kotlin.C11079d2.f28267a
                    return r6
                L_0x0077:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "Parser not found"
                    r6.<init>(r7)
                    throw r6
                L_0x007f:
                    com.usabilla.sdk.ubform.response.UbError$UbDbError r6 = new com.usabilla.sdk.ubform.response.UbError$UbDbError
                    java.lang.String r7 = "Form not found"
                    r6.<init>(r7)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormStore$getFormFromCache$$inlined$map$1.C100792.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
