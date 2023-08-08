package androidx.camera.view.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.C1363b4;
import androidx.camera.view.video.C1828b;
import androidx.core.util.C18001r;
import com.google.auto.value.C32455c;
import java.io.File;

@C1832d
@C32455c
/* renamed from: androidx.camera.view.video.g */
public abstract class C1837g {

    /* renamed from: a */
    public static final C1833e f5036a = C1833e.m7294a().mo6005a();

    @C32455c.C32456a
    /* renamed from: androidx.camera.view.video.g$a */
    public static abstract class C1838a {
        @C0359n0
        /* renamed from: a */
        public abstract C1837g mo6016a();

        /* renamed from: b */
        public abstract C1838a mo6017b(@C0363p0 ContentResolver contentResolver);

        /* renamed from: c */
        public abstract C1838a mo6018c(@C0363p0 ContentValues contentValues);

        /* renamed from: d */
        public abstract C1838a mo6019d(@C0363p0 File file);

        /* renamed from: e */
        public abstract C1838a mo6020e(@C0363p0 ParcelFileDescriptor parcelFileDescriptor);

        @C0359n0
        /* renamed from: f */
        public abstract C1838a mo6021f(@C0359n0 C1833e eVar);

        /* renamed from: g */
        public abstract C1838a mo6022g(@C0363p0 Uri uri);
    }

    @C0359n0
    /* renamed from: a */
    public static C1838a m7300a(@C0359n0 ContentResolver contentResolver, @C0359n0 Uri uri, @C0359n0 ContentValues contentValues) {
        return new C1828b.C1830b().mo6021f(f5036a).mo6017b(contentResolver).mo6022g(uri).mo6018c(contentValues);
    }

    @C0359n0
    /* renamed from: b */
    public static C1838a m7301b(@C0359n0 ParcelFileDescriptor parcelFileDescriptor) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81765b(z, "Using a ParcelFileDescriptor to record a video is only supported for Android 8.0 or above.");
        return new C1828b.C1830b().mo6021f(f5036a).mo6020e(parcelFileDescriptor);
    }

    @C0359n0
    /* renamed from: c */
    public static C1838a m7302c(@C0359n0 File file) {
        return new C1828b.C1830b().mo6021f(f5036a).mo6019d(file);
    }

    @C0363p0
    /* renamed from: d */
    public abstract ContentResolver mo6007d();

    @C0363p0
    /* renamed from: e */
    public abstract ContentValues mo6008e();

    @C0363p0
    /* renamed from: f */
    public abstract File mo6010f();

    @C0363p0
    /* renamed from: g */
    public abstract ParcelFileDescriptor mo6011g();

    @C0359n0
    /* renamed from: h */
    public abstract C1833e mo6012h();

    @C0363p0
    /* renamed from: i */
    public abstract Uri mo6014i();

    /* renamed from: j */
    public final boolean mo6029j() {
        return mo6010f() != null;
    }

    /* renamed from: k */
    public final boolean mo6030k() {
        return mo6011g() != null;
    }

    /* renamed from: l */
    public final boolean mo6031l() {
        if (mo6014i() == null || mo6007d() == null || mo6008e() == null) {
            return false;
        }
        return true;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: m */
    public C1363b4.C1369f mo6032m() {
        C1363b4.C1369f.C1370a aVar;
        if (mo6029j()) {
            aVar = new C1363b4.C1369f.C1370a((File) C18001r.m81775l(mo6010f()));
        } else if (mo6030k()) {
            aVar = new C1363b4.C1369f.C1370a(((ParcelFileDescriptor) C18001r.m81775l(mo6011g())).getFileDescriptor());
        } else {
            C18001r.m81777n(mo6031l());
            aVar = new C1363b4.C1369f.C1370a((ContentResolver) C18001r.m81775l(mo6007d()), (Uri) C18001r.m81775l(mo6014i()), (ContentValues) C18001r.m81775l(mo6008e()));
        }
        C1363b4.C1367d dVar = new C1363b4.C1367d();
        dVar.f3985a = mo6012h().mo6001b();
        aVar.mo5071b(dVar);
        return aVar.mo5070a();
    }
}
