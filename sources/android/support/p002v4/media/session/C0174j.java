package android.support.p002v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v4.media.session.C0171i;
import androidx.annotation.C0376v0;
import java.lang.reflect.InvocationTargetException;

@C0376v0(24)
/* renamed from: android.support.v4.media.session.j */
public class C0174j {

    /* renamed from: a */
    public static final String f618a = "MediaSessionCompatApi24";

    /* renamed from: android.support.v4.media.session.j$a */
    public interface C0175a extends C0171i.C0172a {
        /* renamed from: b */
        void mo477b(String str, Bundle bundle);

        /* renamed from: c */
        void mo478c();

        /* renamed from: d */
        void mo479d(String str, Bundle bundle);

        /* renamed from: f */
        void mo480f(Uri uri, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.j$b */
    public static class C0176b<T extends C0175a> extends C0171i.C0173b<T> {
        public C0176b(T t) {
            super(t);
        }

        public void onPrepare() {
            ((C0175a) this.f617a).mo478c();
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            ((C0175a) this.f617a).mo477b(str, bundle);
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            ((C0175a) this.f617a).mo479d(str, bundle);
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            ((C0175a) this.f617a).mo480f(uri, bundle);
        }
    }

    /* renamed from: a */
    public static Object m1145a(C0175a aVar) {
        return new C0176b(aVar);
    }

    /* renamed from: b */
    public static String m1146b(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
