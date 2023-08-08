package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.C32921f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.settings.a */
public class C32929a {

    /* renamed from: b */
    public static final String f79981b = "com.crashlytics.settings.json";

    /* renamed from: a */
    public final File f79982a;

    public C32929a(C32921f fVar) {
        this.f79982a = fVar.mo95568f(f79981b);
    }

    /* renamed from: a */
    public final File mo95592a() {
        return this.f79982a;
    }

    /* renamed from: b */
    public JSONObject mo95593b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C32741f.m132248f().mo95052b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a = mo95592a();
            if (a.exists()) {
                fileInputStream = new FileInputStream(a);
                try {
                    jSONObject = new JSONObject(CommonUtils.m131918H(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C32741f.m132248f().mo95055e("Failed to fetch cached settings", e);
                        CommonUtils.m131923e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.m131923e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                C32741f.m132248f().mo95060k("Settings file does not exist.");
                jSONObject = null;
            }
            CommonUtils.m131923e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C32741f.m132248f().mo95055e("Failed to fetch cached settings", e);
            CommonUtils.m131923e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            CommonUtils.m131923e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void mo95594c(long j, JSONObject jSONObject) {
        C32741f.m132248f().mo95060k("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put(C32937f.f80027a, j);
                FileWriter fileWriter2 = new FileWriter(mo95592a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    CommonUtils.m131923e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C32741f.m132248f().mo95055e("Failed to cache settings", e);
                        CommonUtils.m131923e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.m131923e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    CommonUtils.m131923e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C32741f.m132248f().mo95055e("Failed to cache settings", e);
                CommonUtils.m131923e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
