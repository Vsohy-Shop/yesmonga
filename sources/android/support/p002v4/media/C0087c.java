package android.support.p002v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.p002v4.media.C0078a;
import android.support.p002v4.media.session.MediaSessionCompat;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import java.util.List;

@C0376v0(26)
/* renamed from: android.support.v4.media.c */
public class C0087c {

    /* renamed from: android.support.v4.media.c$a */
    public interface C0088a extends C0078a.C0082d {
        /* renamed from: b */
        void mo173b(@C0359n0 String str, @C0359n0 Bundle bundle);

        /* renamed from: c */
        void mo174c(@C0359n0 String str, List<?> list, @C0359n0 Bundle bundle);
    }

    /* renamed from: android.support.v4.media.c$b */
    public static class C0089b<T extends C0088a> extends C0078a.C0083e<T> {
        public C0089b(T t) {
            super(t);
        }

        public void onChildrenLoaded(@C0359n0 String str, List<MediaBrowser.MediaItem> list, @C0359n0 Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            ((C0088a) this.f250a).mo174c(str, list, bundle);
        }

        public void onError(@C0359n0 String str, @C0359n0 Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            ((C0088a) this.f250a).mo173b(str, bundle);
        }
    }

    /* renamed from: a */
    public static Object m327a(C0088a aVar) {
        return new C0089b(aVar);
    }

    /* renamed from: b */
    public static void m328b(Object obj, String str, Bundle bundle, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, bundle, (MediaBrowser.SubscriptionCallback) obj2);
    }

    /* renamed from: c */
    public static void m329c(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).unsubscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }
}
