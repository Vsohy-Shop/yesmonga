package androidx.camera.view.video;

import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.auto.value.C32455c;

@C1832d
@C32455c
/* renamed from: androidx.camera.view.video.h */
public abstract class C1839h {
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public static C1839h m7320a(@C0363p0 Uri uri) {
        return new C1831c(uri);
    }

    @C0363p0
    /* renamed from: b */
    public abstract Uri mo6023b();
}
