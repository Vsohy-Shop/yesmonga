package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.play.core.appupdate.u */
public final class C31888u {

    /* renamed from: a */
    public final Context f77766a;

    public C31888u(Context context) {
        this.f77766a = context;
    }

    /* renamed from: b */
    public static long m129353b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File b : listFiles) {
                j += m129353b(b);
            }
        }
        return j;
    }

    /* renamed from: a */
    public final long mo92448a() {
        return m129353b(new File(this.f77766a.getFilesDir(), "assetpacks"));
    }
}
