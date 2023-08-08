package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.common.C32723r;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.settings.g */
public class C32938g {

    /* renamed from: a */
    public final C32723r f80051a;

    public C32938g(C32723r rVar) {
        this.f80051a = rVar;
    }

    /* renamed from: a */
    public static C32939h m133127a(int i) {
        if (i == 3) {
            return new C32943l();
        }
        C32741f f = C32741f.m132248f();
        f.mo95054d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new C32930b();
    }

    /* renamed from: b */
    public C32932d mo95615b(JSONObject jSONObject) throws JSONException {
        return m133127a(jSONObject.getInt(C32937f.f80029c)).mo95595a(this.f80051a, jSONObject);
    }
}
