package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p002v4.media.session.MediaSessionCompat;
import androidx.annotation.C0376v0;
import androidx.media.C19609g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@C0376v0(26)
/* renamed from: androidx.media.h */
public class C19612h {

    /* renamed from: a */
    public static final String f50237a = "MBSCompatApi26";

    /* renamed from: b */
    public static Field f50238b;

    /* renamed from: androidx.media.h$a */
    public static class C19613a extends C19609g.C19610a {
        public C19613a(Context context, C19615c cVar) {
            super(context, cVar);
        }

        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            ((C19615c) this.f50235a).mo57940c(str, new C19614b(result), bundle);
        }
    }

    /* renamed from: androidx.media.h$b */
    public static class C19614b {

        /* renamed from: a */
        public MediaBrowserService.Result f50239a;

        public C19614b(MediaBrowserService.Result result) {
            this.f50239a = result;
        }

        /* renamed from: a */
        public void mo57986a() {
            this.f50239a.detach();
        }

        /* renamed from: b */
        public List<MediaBrowser.MediaItem> mo57987b(List<Parcel> list) {
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
        public void mo57988c(List<Parcel> list, int i) {
            try {
                C19612h.f50238b.setInt(this.f50239a, i);
            } catch (IllegalAccessException unused) {
            }
            this.f50239a.sendResult(mo57987b(list));
        }
    }

    /* renamed from: androidx.media.h$c */
    public interface C19615c extends C19609g.C19611b {
        /* renamed from: c */
        void mo57940c(String str, C19614b bVar, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f50238b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    /* renamed from: a */
    public static Object m91222a(Context context, C19615c cVar) {
        return new C19613a(context, cVar);
    }

    /* renamed from: b */
    public static Bundle m91223b(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }

    /* renamed from: c */
    public static void m91224c(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }
}
