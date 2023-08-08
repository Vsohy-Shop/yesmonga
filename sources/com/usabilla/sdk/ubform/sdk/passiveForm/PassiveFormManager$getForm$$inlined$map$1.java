package com.usabilla.sdk.ubform.sdk.passiveForm;

import android.graphics.Bitmap;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PassiveFormManager$getForm$$inlined$map$1 implements C11907e<FormModel> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f27702a;

    /* renamed from: b */
    public final /* synthetic */ UbInternalTheme f27703b;

    /* renamed from: c */
    public final /* synthetic */ String f27704c;

    /* renamed from: d */
    public final /* synthetic */ Bitmap f27705d;

    /* renamed from: e */
    public final /* synthetic */ PassiveFormManager f27706e;

    public PassiveFormManager$getForm$$inlined$map$1(C11907e eVar, UbInternalTheme ubInternalTheme, String str, Bitmap bitmap, PassiveFormManager passiveFormManager) {
        this.f27702a = eVar;
        this.f27703b = ubInternalTheme;
        this.f27704c = str;
        this.f27705d = bitmap;
        this.f27706e = passiveFormManager;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f27702a.collect(new C11908f<FormModel>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager$getForm$$inlined$map$1.C100772.C100781
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager$getForm$$inlined$map$1$2$1 r0 = (com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager$getForm$$inlined$map$1.C100772.C100781) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager$getForm$$inlined$map$1$2$1 r0 = new com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager$getForm$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r8)
                    goto L_0x007d
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    kotlin.C11661u0.m45747n(r8)
                    kotlinx.coroutines.flow.f r8 = r3
                    com.usabilla.sdk.ubform.sdk.form.model.FormModel r7 = (com.usabilla.sdk.ubform.sdk.form.model.FormModel) r7
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager$getForm$$inlined$map$1 r2 = r2
                    com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme r2 = r2.f27703b
                    if (r2 == 0) goto L_0x0042
                    com.usabilla.sdk.ubform.sdk.form.model.FormModel r7 = r7.mergeTheme(r2)
                L_0x0042:
                    com.usabilla.sdk.ubform.Logger$Companion r2 = com.usabilla.sdk.ubform.Logger.f26647a
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "Get form with id "
                    r4.append(r5)
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager$getForm$$inlined$map$1 r5 = r2
                    java.lang.String r5 = r5.f27704c
                    r4.append(r5)
                    java.lang.String r5 = " succeeded"
                    r4.append(r5)
                    java.lang.String r4 = r4.toString()
                    r2.logInfo(r4)
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager$getForm$$inlined$map$1 r2 = r2
                    android.graphics.Bitmap r4 = r2.f27705d
                    if (r4 != 0) goto L_0x0068
                    goto L_0x006d
                L_0x0068:
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager r2 = r2.f27706e
                    r2.mo21469c(r7, r4)
                L_0x006d:
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager$getForm$$inlined$map$1 r2 = r2
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager r2 = r2.f27706e
                    r2.f27701c = r7
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x007d
                    return r1
                L_0x007d:
                    kotlin.d2 r7 = kotlin.C11079d2.f28267a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager$getForm$$inlined$map$1.C100772.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
