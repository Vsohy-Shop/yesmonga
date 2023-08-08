package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14466k4;

/* renamed from: com.contentsquare.android.sdk.z7 */
public class C14922z7 {

    /* renamed from: a */
    public final C14453jf f36990a = new C14453jf("ConfigurationProjectChooser");

    /* renamed from: a */
    public C14466k4.C14471e mo36945a(C14466k4 k4Var, boolean z) {
        C14453jf jfVar;
        C14466k4.C14471e eVar;
        String str;
        if (z) {
            eVar = k4Var.mo35710d();
            jfVar = this.f36990a;
            str = "God mode configuration being used";
        } else {
            eVar = k4Var.mo35711e();
            jfVar = this.f36990a;
            str = "Production project configuration being used";
        }
        jfVar.mo35676e(str);
        return eVar;
    }
}
