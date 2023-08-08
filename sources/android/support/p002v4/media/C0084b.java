package android.support.p002v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(23)
/* renamed from: android.support.v4.media.b */
public class C0084b {

    /* renamed from: android.support.v4.media.b$a */
    public interface C0085a {
        /* renamed from: a */
        void mo108a(@C0359n0 String str);

        /* renamed from: b */
        void mo109b(Parcel parcel);
    }

    /* renamed from: android.support.v4.media.b$b */
    public static class C0086b<T extends C0085a> extends MediaBrowser.ItemCallback {

        /* renamed from: a */
        public final T f251a;

        public C0086b(T t) {
            this.f251a = t;
        }

        public void onError(@C0359n0 String str) {
            this.f251a.mo108a(str);
        }

        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.f251a.mo109b((Parcel) null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.f251a.mo109b(obtain);
        }
    }

    /* renamed from: a */
    public static Object m323a(C0085a aVar) {
        return new C0086b(aVar);
    }

    /* renamed from: b */
    public static void m324b(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, (MediaBrowser.ItemCallback) obj2);
    }
}
