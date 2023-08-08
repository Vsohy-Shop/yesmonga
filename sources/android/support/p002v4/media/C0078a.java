package android.support.p002v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import java.util.List;

@C0376v0(21)
/* renamed from: android.support.v4.media.a */
public class C0078a {

    /* renamed from: a */
    public static final String f248a = "android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM";

    /* renamed from: android.support.v4.media.a$a */
    public interface C0079a {
        /* renamed from: b */
        void mo100b();

        /* renamed from: c */
        void mo101c();

        /* renamed from: d */
        void mo102d();
    }

    /* renamed from: android.support.v4.media.a$b */
    public static class C0080b<T extends C0079a> extends MediaBrowser.ConnectionCallback {

        /* renamed from: a */
        public final T f249a;

        public C0080b(T t) {
            this.f249a = t;
        }

        public void onConnected() {
            this.f249a.mo100b();
        }

        public void onConnectionFailed() {
            this.f249a.mo101c();
        }

        public void onConnectionSuspended() {
            this.f249a.mo102d();
        }
    }

    /* renamed from: android.support.v4.media.a$c */
    public static class C0081c {
        /* renamed from: a */
        public static Object m319a(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }

        /* renamed from: b */
        public static int m320b(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }
    }

    /* renamed from: android.support.v4.media.a$d */
    public interface C0082d {
        /* renamed from: a */
        void mo170a(@C0359n0 String str);

        /* renamed from: d */
        void mo171d(@C0359n0 String str, List<?> list);
    }

    /* renamed from: android.support.v4.media.a$e */
    public static class C0083e<T extends C0082d> extends MediaBrowser.SubscriptionCallback {

        /* renamed from: a */
        public final T f250a;

        public C0083e(T t) {
            this.f250a = t;
        }

        public void onChildrenLoaded(@C0359n0 String str, List<MediaBrowser.MediaItem> list) {
            this.f250a.mo171d(str, list);
        }

        public void onError(@C0359n0 String str) {
            this.f250a.mo170a(str);
        }
    }

    /* renamed from: a */
    public static void m304a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: b */
    public static Object m305b(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    /* renamed from: c */
    public static Object m306c(C0079a aVar) {
        return new C0080b(aVar);
    }

    /* renamed from: d */
    public static Object m307d(C0082d dVar) {
        return new C0083e(dVar);
    }

    /* renamed from: e */
    public static void m308e(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: f */
    public static Bundle m309f(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: g */
    public static String m310g(Object obj) {
        return ((MediaBrowser) obj).getRoot();
    }

    /* renamed from: h */
    public static ComponentName m311h(Object obj) {
        return ((MediaBrowser) obj).getServiceComponent();
    }

    /* renamed from: i */
    public static Object m312i(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    /* renamed from: j */
    public static boolean m313j(Object obj) {
        return ((MediaBrowser) obj).isConnected();
    }

    /* renamed from: k */
    public static void m314k(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }

    /* renamed from: l */
    public static void m315l(Object obj, String str) {
        ((MediaBrowser) obj).unsubscribe(str);
    }
}
