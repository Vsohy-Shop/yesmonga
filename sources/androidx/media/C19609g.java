package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import androidx.annotation.C0376v0;
import androidx.media.C19604f;

@C0376v0(23)
/* renamed from: androidx.media.g */
public class C19609g {

    /* renamed from: androidx.media.g$a */
    public static class C19610a extends C19604f.C19606b {
        public C19610a(Context context, C19611b bVar) {
            super(context, bVar);
        }

        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((C19611b) this.f50235a).mo57938a(str, new C19604f.C19607c(result));
        }
    }

    /* renamed from: androidx.media.g$b */
    public interface C19611b extends C19604f.C19608d {
        /* renamed from: a */
        void mo57938a(String str, C19604f.C19607c<Parcel> cVar);
    }

    /* renamed from: a */
    public static Object m91220a(Context context, C19611b bVar) {
        return new C19610a(context, bVar);
    }
}
