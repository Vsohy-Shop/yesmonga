package androidx.camera.view.video;

import android.net.Uri;
import androidx.annotation.C0363p0;

/* renamed from: androidx.camera.view.video.c */
public final class C1831c extends C1839h {

    /* renamed from: a */
    public final Uri f5029a;

    public C1831c(@C0363p0 Uri uri) {
        this.f5029a = uri;
    }

    @C0363p0
    /* renamed from: b */
    public Uri mo6023b() {
        return this.f5029a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1839h)) {
            return false;
        }
        Uri uri = this.f5029a;
        Uri b = ((C1839h) obj).mo6023b();
        if (uri != null) {
            return uri.equals(b);
        }
        if (b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Uri uri = this.f5029a;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "OutputFileResults{savedUri=" + this.f5029a + "}";
    }
}
