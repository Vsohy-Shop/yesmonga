package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.C40085f;
import com.google.android.datatransport.C40087h;
import com.google.android.datatransport.cct.C40042a;
import com.google.android.datatransport.runtime.C40323w;
import com.google.android.gms.tasks.C31047k;
import com.google.firebase.crashlytics.internal.common.C32668a0;
import com.google.firebase.crashlytics.internal.common.C32716p;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.C32896h;
import com.google.firebase.crashlytics.internal.settings.C32940i;

/* renamed from: com.google.firebase.crashlytics.internal.send.b */
public class C32923b {

    /* renamed from: c */
    public static final C32896h f79949c = new C32896h();

    /* renamed from: d */
    public static final String f79950d = m133073e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e */
    public static final String f79951e = m133073e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f */
    public static final String f79952f = "FIREBASE_CRASHLYTICS_REPORT";

    /* renamed from: g */
    public static final C40085f<CrashlyticsReport, byte[]> f79953g = new C32922a();

    /* renamed from: a */
    public final C32926e f79954a;

    /* renamed from: b */
    public final C40085f<CrashlyticsReport, byte[]> f79955b;

    public C32923b(C32926e eVar, C40085f<CrashlyticsReport, byte[]> fVar) {
        this.f79954a = eVar;
        this.f79955b = fVar;
    }

    /* renamed from: b */
    public static C32923b m133071b(Context context, C32940i iVar, C32668a0 a0Var) {
        C40323w.m163831f(context);
        C40087h g = C40323w.m163829c().mo132985g(new C40042a(f79950d, f79951e));
        C40041c b = C40041c.m163048b("json");
        C40085f<CrashlyticsReport, byte[]> fVar = f79953g;
        return new C32923b(new C32926e(g.mo132669b(f79952f, CrashlyticsReport.class, b, fVar), iVar.mo95606b(), a0Var), fVar);
    }

    /* renamed from: e */
    public static String m133073e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    @C0359n0
    /* renamed from: c */
    public C31047k<C32716p> mo95580c(@C0359n0 C32716p pVar, boolean z) {
        return this.f79954a.mo95585i(pVar, z).mo87741a();
    }
}
