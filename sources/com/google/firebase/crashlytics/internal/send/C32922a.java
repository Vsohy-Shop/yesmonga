package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.C40085f;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;

/* renamed from: com.google.firebase.crashlytics.internal.send.a */
public final /* synthetic */ class C32922a implements C40085f {
    public final Object apply(Object obj) {
        return C32923b.f79949c.mo95505I((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
    }
}
