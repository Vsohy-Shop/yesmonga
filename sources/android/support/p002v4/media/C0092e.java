package android.support.p002v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import androidx.annotation.C0376v0;

@C0376v0(23)
/* renamed from: android.support.v4.media.e */
public class C0092e {

    /* renamed from: android.support.v4.media.e$a */
    public static class C0093a {
        /* renamed from: a */
        public static void m351a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m350a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
