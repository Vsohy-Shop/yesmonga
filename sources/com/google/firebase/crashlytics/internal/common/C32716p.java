package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.C0359n0;
import com.google.auto.value.C32455c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

@C32455c
/* renamed from: com.google.firebase.crashlytics.internal.common.p */
public abstract class C32716p {
    @C0359n0
    /* renamed from: a */
    public static C32716p m132159a(CrashlyticsReport crashlyticsReport, String str, File file) {
        return new C32669b(crashlyticsReport, str, file);
    }

    /* renamed from: b */
    public abstract CrashlyticsReport mo94854b();

    /* renamed from: c */
    public abstract File mo94855c();

    /* renamed from: d */
    public abstract String mo94856d();
}
