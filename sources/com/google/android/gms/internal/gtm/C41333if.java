package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40991q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.gtm.if */
public final class C41333if {

    /* renamed from: a */
    public final Context f104674a;

    /* renamed from: b */
    public final ExecutorService f104675b;

    /* renamed from: c */
    public final C41237ef f104676c;

    public C41333if(Context context) {
        ExecutorService l = C41155b5.m167147a().mo134995l(2);
        C41237ef efVar = new C41237ef(context);
        this.f104674a = context;
        this.f104675b = l;
        this.f104676c = efVar;
    }

    /* renamed from: h */
    public static final byte[] m167710h(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C40991q.m166665c(inputStream, byteArrayOutputStream);
            try {
                inputStream.close();
            } catch (IOException unused) {
                C41493p6.m168153e("Error closing stream for reading resource from disk");
                return null;
            }
        } catch (IOException unused2) {
            C41493p6.m168153e("Failed to read the resource from disk");
            try {
                inputStream.close();
            } catch (IOException unused3) {
                C41493p6.m168153e("Error closing stream for reading resource from disk");
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
                throw th;
            } catch (IOException unused4) {
                C41493p6.m168153e("Error closing stream for reading resource from disk");
                return null;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: i */
    public static final String m167711i(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "resource_".concat(valueOf) : new String("resource_");
    }

    /* renamed from: a */
    public final long mo135491a(String str) {
        File b = mo135492b(str);
        if (b.exists()) {
            return b.lastModified();
        }
        return 0;
    }

    @C40974d0
    /* renamed from: b */
    public final File mo135492b(String str) {
        return new File(this.f104674a.getDir("google_tagmanager", 0), m167711i(str));
    }

    /* renamed from: c */
    public final void mo135493c(String str, String str2, C41573se seVar) {
        this.f104675b.execute(new C41285gf(this, str, str2, seVar));
    }

    @C40974d0
    /* renamed from: d */
    public final void mo135494d(String str, String str2, C41573se seVar) {
        C41493p6.m168152d("Starting to load a default asset file from Disk.");
        if (str2 == null) {
            C41493p6.m168152d("Default asset file is not specified. Not proceeding with the loading");
            seVar.mo135826b(0, 2);
            return;
        }
        try {
            InputStream open = this.f104676c.f104567a.getAssets().open(str2);
            if (open != null) {
                seVar.mo135827c(m167710h(open));
            } else {
                seVar.mo135826b(0, 2);
            }
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42 + str2.length());
            sb.append("Default asset file not found. ");
            sb.append(str);
            sb.append(". Filename: ");
            sb.append(str2);
            C41493p6.m168149a(sb.toString());
            seVar.mo135826b(0, 2);
        }
    }

    /* renamed from: e */
    public final void mo135495e(String str, C41573se seVar) {
        this.f104675b.execute(new C41261ff(this, str, seVar));
    }

    @C40974d0
    /* renamed from: f */
    public final void mo135496f(String str, C41573se seVar) {
        String str2;
        C41493p6.m168152d("Starting to load a saved resource file from Disk.");
        try {
            seVar.mo135827c(m167710h(new FileInputStream(mo135492b(str))));
        } catch (FileNotFoundException unused) {
            String valueOf = String.valueOf(m167711i(str));
            if (valueOf.length() != 0) {
                str2 = "Saved resource not found: ".concat(valueOf);
            } else {
                str2 = new String("Saved resource not found: ");
            }
            C41493p6.m168149a(str2);
            seVar.mo135826b(0, 1);
        }
    }

    /* renamed from: g */
    public final void mo135497g(String str, byte[] bArr) {
        this.f104675b.execute(new C41309hf(this, str, bArr));
    }
}
