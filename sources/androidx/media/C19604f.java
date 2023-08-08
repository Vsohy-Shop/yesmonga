package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p002v4.media.session.MediaSessionCompat;
import androidx.annotation.C0376v0;
import java.util.ArrayList;
import java.util.List;

@C0376v0(21)
/* renamed from: androidx.media.f */
public class C19604f {

    /* renamed from: androidx.media.f$a */
    public static class C19605a {

        /* renamed from: a */
        public final String f50233a;

        /* renamed from: b */
        public final Bundle f50234b;

        public C19605a(String str, Bundle bundle) {
            this.f50233a = str;
            this.f50234b = bundle;
        }
    }

    /* renamed from: androidx.media.f$b */
    public static class C19606b extends MediaBrowserService {

        /* renamed from: a */
        public final C19608d f50235a;

        public C19606b(Context context, C19608d dVar) {
            attachBaseContext(context);
            this.f50235a = dVar;
        }

        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            Bundle bundle2;
            MediaSessionCompat.m591b(bundle);
            C19608d dVar = this.f50235a;
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            C19605a d = dVar.mo57927d(str, i, bundle2);
            if (d == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(d.f50233a, d.f50234b);
        }

        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.f50235a.mo57928i(str, new C19607c(result));
        }
    }

    /* renamed from: androidx.media.f$c */
    public static class C19607c<T> {

        /* renamed from: a */
        public MediaBrowserService.Result f50236a;

        public C19607c(MediaBrowserService.Result result) {
            this.f50236a = result;
        }

        /* renamed from: a */
        public void mo57981a() {
            this.f50236a.detach();
        }

        /* renamed from: b */
        public List<MediaBrowser.MediaItem> mo57982b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        /* renamed from: c */
        public void mo57983c(T t) {
            if (t instanceof List) {
                this.f50236a.sendResult(mo57982b((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f50236a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f50236a.sendResult((Object) null);
            }
        }
    }

    /* renamed from: androidx.media.f$d */
    public interface C19608d {
        /* renamed from: d */
        C19605a mo57927d(String str, int i, Bundle bundle);

        /* renamed from: i */
        void mo57928i(String str, C19607c<List<Parcel>> cVar);
    }

    /* renamed from: a */
    public static Object m91210a(Context context, C19608d dVar) {
        return new C19606b(context, dVar);
    }

    /* renamed from: b */
    public static void m91211b(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    /* renamed from: c */
    public static IBinder m91212c(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    /* renamed from: d */
    public static void m91213d(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    /* renamed from: e */
    public static void m91214e(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }
}
