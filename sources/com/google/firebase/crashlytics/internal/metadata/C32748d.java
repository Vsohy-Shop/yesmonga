package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.C32921f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.metadata.d */
public class C32748d {

    /* renamed from: b */
    public static final Charset f79501b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final String f79502c = "userId";

    /* renamed from: a */
    public final C32921f f79503a;

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.d$a */
    public class C32749a extends JSONObject {

        /* renamed from: a */
        public final /* synthetic */ String f79504a;

        public C32749a(String str) throws JSONException {
            this.f79504a = str;
            put(C32748d.f79502c, str);
        }
    }

    public C32748d(C32921f fVar) {
        this.f79503a = fVar;
    }

    /* renamed from: d */
    public static Map<String, String> m132291d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m132295l(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: f */
    public static String m132292f(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: j */
    public static void m132293j(File file) {
        if (file.exists() && file.delete()) {
            C32741f f = C32741f.m132248f();
            f.mo95056g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: k */
    public static String m132294k(String str) throws JSONException {
        return new C32749a(str).toString();
    }

    /* renamed from: l */
    public static String m132295l(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    @C0359n0
    /* renamed from: a */
    public File mo95080a(String str) {
        return this.f79503a.mo95578p(str, C32760i.f79537i);
    }

    @C0359n0
    /* renamed from: b */
    public File mo95081b(String str) {
        return this.f79503a.mo95578p(str, "keys");
    }

    @C0359n0
    /* renamed from: c */
    public File mo95082c(String str) {
        return this.f79503a.mo95578p(str, C32760i.f79535g);
    }

    @C0363p0
    /* renamed from: e */
    public final String mo95083e(String str) throws JSONException {
        return m132295l(new JSONObject(str), f79502c);
    }

    /* renamed from: g */
    public Map<String, String> mo95084g(String str) {
        return mo95085h(str, false);
    }

    /* renamed from: h */
    public Map<String, String> mo95085h(String str, boolean z) {
        File file;
        Exception e;
        FileInputStream fileInputStream;
        if (z) {
            file = mo95080a(str);
        } else {
            file = mo95081b(str);
        }
        if (!file.exists() || file.length() == 0) {
            m132293j(file);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                Map<String, String> d = m132291d(CommonUtils.m131918H(fileInputStream));
                CommonUtils.m131923e(fileInputStream, "Failed to close user metadata file.");
                return d;
            } catch (Exception e2) {
                e = e2;
                try {
                    C32741f.m132248f().mo95063n("Error deserializing user metadata.", e);
                    m132293j(file);
                    CommonUtils.m131923e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.m131923e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            fileInputStream = null;
            e = exc;
            C32741f.m132248f().mo95063n("Error deserializing user metadata.", e);
            m132293j(file);
            CommonUtils.m131923e(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.m131923e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    @C0363p0
    /* renamed from: i */
    public String mo95086i(String str) {
        FileInputStream fileInputStream;
        File c = mo95082c(str);
        FileInputStream fileInputStream2 = null;
        if (!c.exists() || c.length() == 0) {
            C32741f.m132248f().mo95052b("No userId set for session " + str);
            m132293j(c);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                String e = mo95083e(CommonUtils.m131918H(fileInputStream));
                C32741f.m132248f().mo95052b("Loaded userId " + e + " for session " + str);
                CommonUtils.m131923e(fileInputStream, "Failed to close user metadata file.");
                return e;
            } catch (Exception e2) {
                e = e2;
                try {
                    C32741f.m132248f().mo95063n("Error deserializing user metadata.", e);
                    m132293j(c);
                    CommonUtils.m131923e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.m131923e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            C32741f.m132248f().mo95063n("Error deserializing user metadata.", e);
            m132293j(c);
            CommonUtils.m131923e(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.m131923e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: m */
    public void mo95087m(String str, Map<String, String> map) {
        mo95088n(str, map, false);
    }

    /* renamed from: n */
    public void mo95088n(String str, Map<String, String> map, boolean z) {
        File file;
        if (z) {
            file = mo95080a(str);
        } else {
            file = mo95081b(str);
        }
        BufferedWriter bufferedWriter = null;
        try {
            String f = m132292f(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f79501b));
            try {
                bufferedWriter2.write(f);
                bufferedWriter2.flush();
                CommonUtils.m131923e(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C32741f.m132248f().mo95063n("Error serializing key/value metadata.", e);
                    m132293j(file);
                    CommonUtils.m131923e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.m131923e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.m131923e(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C32741f.m132248f().mo95063n("Error serializing key/value metadata.", e);
            m132293j(file);
            CommonUtils.m131923e(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    /* renamed from: o */
    public void mo95089o(String str, String str2) {
        File c = mo95082c(str);
        BufferedWriter bufferedWriter = null;
        try {
            String k = m132294k(str2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), f79501b));
            try {
                bufferedWriter2.write(k);
                bufferedWriter2.flush();
                CommonUtils.m131923e(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C32741f.m132248f().mo95063n("Error serializing user metadata.", e);
                    CommonUtils.m131923e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.m131923e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.m131923e(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C32741f.m132248f().mo95063n("Error serializing user metadata.", e);
            CommonUtils.m131923e(bufferedWriter, "Failed to close user metadata file.");
        }
    }
}
