package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.C32723r;
import com.google.firebase.crashlytics.internal.settings.C32932d;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.settings.b */
public class C32930b implements C32939h {
    /* renamed from: b */
    public static C32932d m133096b(C32723r rVar) {
        return new C32932d(rVar.mo94989a() + ((long) 3600000), new C32932d.C32934b(8, 4), new C32932d.C32933a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    /* renamed from: a */
    public C32932d mo95595a(C32723r rVar, JSONObject jSONObject) {
        return m133096b(rVar);
    }
}
