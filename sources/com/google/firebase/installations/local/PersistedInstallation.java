package com.google.firebase.installations.local;

import androidx.annotation.C0359n0;
import com.google.firebase.C33033f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {

    /* renamed from: c */
    public static final String f80245c = "PersistedInstallation";

    /* renamed from: d */
    public static final String f80246d = "Fid";

    /* renamed from: e */
    public static final String f80247e = "AuthToken";

    /* renamed from: f */
    public static final String f80248f = "RefreshToken";

    /* renamed from: g */
    public static final String f80249g = "TokenCreationEpochInSecs";

    /* renamed from: h */
    public static final String f80250h = "ExpiresInSecs";

    /* renamed from: i */
    public static final String f80251i = "Status";

    /* renamed from: j */
    public static final String f80252j = "FisError";

    /* renamed from: a */
    public File f80253a;
    @C0359n0

    /* renamed from: b */
    public final C33033f f80254b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@C0359n0 C33033f fVar) {
        this.f80254b = fVar;
    }

    /* renamed from: a */
    public void mo95823a() {
        mo95824b().delete();
    }

    /* renamed from: b */
    public final File mo95824b() {
        if (this.f80253a == null) {
            synchronized (this) {
                if (this.f80253a == null) {
                    File filesDir = this.f80254b.mo95721n().getFilesDir();
                    this.f80253a = new File(filesDir, "PersistedInstallation." + this.f80254b.mo95724t() + ".json");
                }
            }
        }
        return this.f80253a;
    }

    @C0359n0
    /* renamed from: c */
    public C33094c mo95825c(@C0359n0 C33094c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f80246d, cVar.mo95830d());
            jSONObject.put(f80251i, cVar.mo95834g().ordinal());
            jSONObject.put(f80247e, cVar.mo95828b());
            jSONObject.put(f80248f, cVar.mo95833f());
            jSONObject.put(f80249g, cVar.mo95835h());
            jSONObject.put(f80250h, cVar.mo95829c());
            jSONObject.put(f80252j, cVar.mo95831e());
            File createTempFile = File.createTempFile(f80245c, "tmp", this.f80254b.mo95721n().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(mo95824b())) {
                return cVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: d */
    public final JSONObject mo95826d() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(mo95824b());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @C0359n0
    /* renamed from: e */
    public C33094c mo95827e() {
        JSONObject d = mo95826d();
        String optString = d.optString(f80246d, (String) null);
        int optInt = d.optInt(f80251i, RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = d.optString(f80247e, (String) null);
        String optString3 = d.optString(f80248f, (String) null);
        long optLong = d.optLong(f80249g, 0);
        long optLong2 = d.optLong(f80250h, 0);
        return C33094c.m133503a().mo95842d(optString).mo95845g(RegistrationStatus.values()[optInt]).mo95840b(optString2).mo95844f(optString3).mo95846h(optLong).mo95841c(optLong2).mo95843e(d.optString(f80252j, (String) null)).mo95839a();
    }
}
