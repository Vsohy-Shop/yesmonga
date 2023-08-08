package androidx.camera.view.video;

import android.location.Location;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.view.video.C1825a;
import com.google.auto.value.C32455c;

@C1832d
@C32455c
/* renamed from: androidx.camera.view.video.e */
public abstract class C1833e {

    @C32455c.C32456a
    /* renamed from: androidx.camera.view.video.e$a */
    public static abstract class C1834a {
        @C0359n0
        /* renamed from: a */
        public abstract C1833e mo6005a();

        @C0359n0
        /* renamed from: b */
        public abstract C1834a mo6006b(@C0363p0 Location location);
    }

    @C0359n0
    /* renamed from: a */
    public static C1834a m7294a() {
        return new C1825a.C1827b();
    }

    @C0363p0
    /* renamed from: b */
    public abstract Location mo6001b();
}
