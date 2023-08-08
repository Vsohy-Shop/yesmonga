package android.support.p002v4.media.session;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.C0376v0;

@C0376v0(24)
/* renamed from: android.support.v4.media.session.e */
public class C0163e {

    /* renamed from: android.support.v4.media.session.e$a */
    public static class C0164a {
        /* renamed from: a */
        public static void m1097a(Object obj) {
            ((MediaController.TransportControls) obj).prepare();
        }

        /* renamed from: b */
        public static void m1098b(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromMediaId(str, bundle);
        }

        /* renamed from: c */
        public static void m1099c(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromSearch(str, bundle);
        }

        /* renamed from: d */
        public static void m1100d(Object obj, Uri uri, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromUri(uri, bundle);
        }
    }
}
