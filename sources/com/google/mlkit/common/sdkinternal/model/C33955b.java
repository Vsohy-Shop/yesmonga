package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.mlkit.common.sdkinternal.C33943h;
import java.io.File;
import java.util.concurrent.Executor;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.model.b */
public abstract class C33955b {
    @RecentlyNonNull
    @C40473a

    /* renamed from: a */
    public final C33957d f82407a;

    /* renamed from: b */
    public final C31049l<Void> f82408b = new C31049l<>();

    /* renamed from: c */
    public final Context f82409c;

    /* renamed from: d */
    public final Executor f82410d;

    @C40473a
    public C33955b(@RecentlyNonNull Context context, @RecentlyNonNull C33957d dVar) {
        this.f82409c = context;
        this.f82407a = dVar;
        this.f82410d = C33943h.m136577g();
    }

    @C40473a
    /* renamed from: a */
    public static void m136629a(@RecentlyNonNull File file) {
        File[] listFiles = file.listFiles();
        if ((listFiles == null || listFiles.length == 0) && !file.delete()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(valueOf.length() + 31);
            sb.append("Error deleting model directory ");
            sb.append(valueOf);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @com.google.android.gms.common.annotation.C40473a
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m136630e(@androidx.annotation.RecentlyNonNull java.lang.String r3) {
        /*
            java.lang.String r0 = "\\+"
            r1 = -1
            java.lang.String[] r3 = r3.split(r0, r1)
            int r0 = r3.length
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r3[r2]     // Catch:{ IllegalArgumentException -> 0x0019 }
            com.google.android.gms.common.util.C40967c.m166595c(r0)     // Catch:{ IllegalArgumentException -> 0x0019 }
            r0 = 1
            r3 = r3[r0]     // Catch:{  }
            com.google.android.gms.common.util.C40967c.m166595c(r3)     // Catch:{  }
            return r0
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.C33955b.m136630e(java.lang.String):boolean");
    }

    @C40473a
    @C40974d0
    /* renamed from: g */
    public static void m136631g(@RecentlyNonNull File file, @RecentlyNonNull File file2) {
        if (file.exists()) {
            if (!file2.exists() && !file.renameTo(file2)) {
                String valueOf = String.valueOf(file);
                String valueOf2 = String.valueOf(file2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 28 + valueOf2.length());
                sb.append("Error moving model file ");
                sb.append(valueOf);
                sb.append(" to ");
                sb.append(valueOf2);
            }
            if (file.exists() && !file.delete()) {
                String valueOf3 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(valueOf3.length() + 26);
                sb2.append("Error deleting model file ");
                sb2.append(valueOf3);
            }
        }
    }

    @RecentlyNonNull
    @C40473a
    @C40974d0
    /* renamed from: b */
    public abstract String mo98754b();

    @RecentlyNonNull
    @C40473a
    @C40974d0
    /* renamed from: c */
    public File mo98755c() {
        return new File(this.f82409c.getNoBackupFilesDir(), mo98754b());
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: d */
    public C31047k<Void> mo98756d() {
        return this.f82408b.mo87741a();
    }

    @C40473a
    /* renamed from: f */
    public abstract void mo98757f(@RecentlyNonNull File file);

    @C40473a
    /* renamed from: h */
    public void mo98758h() {
        this.f82410d.execute(new C33966m(this));
    }

    /* renamed from: i */
    public final /* synthetic */ void mo98759i() {
        File c = mo98755c();
        File[] listFiles = c.listFiles();
        if (listFiles != null) {
            for (File f : listFiles) {
                mo98757f(f);
            }
            m136629a(c);
        }
        this.f82408b.mo87743c(null);
    }
}
