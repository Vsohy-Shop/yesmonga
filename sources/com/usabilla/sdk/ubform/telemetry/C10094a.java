package com.usabilla.sdk.ubform.telemetry;

import com.usabilla.sdk.ubform.AppInfo;
import com.usabilla.sdk.ubform.p007db.telemetry.C9783a;
import com.usabilla.sdk.ubform.sdk.featurebilla.C9950a;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.telemetry.a */
public interface C10094a {

    /* renamed from: com.usabilla.sdk.ubform.telemetry.a$a */
    public static final class C10095a {
        /* renamed from: a */
        public static /* synthetic */ C10110e m38252a(C10094a aVar, JSONObject jSONObject, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    jSONObject = new JSONObject();
                }
                return aVar.mo21529g(jSONObject);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecorder");
        }
    }

    @C12580l
    /* renamed from: a */
    C9783a mo21523a();

    @C12580l
    /* renamed from: b */
    AppInfo mo21524b();

    /* renamed from: c */
    void mo21525c(@C12580l AppInfo appInfo);

    /* renamed from: d */
    void mo21526d(@C12580l C9783a aVar);

    @C12579k
    /* renamed from: e */
    C11907e<String> mo21527e();

    @C12580l
    /* renamed from: f */
    C9950a mo21528f();

    @C12579k
    /* renamed from: g */
    C10110e mo21529g(@C12579k JSONObject jSONObject);

    /* renamed from: h */
    void mo21530h(@C12580l C9950a aVar);
}
