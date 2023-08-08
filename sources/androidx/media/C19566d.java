package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p002v4.media.MediaBrowserCompat;
import android.support.p002v4.media.session.C0153b;
import android.support.p002v4.media.session.MediaSessionCompat;
import android.support.p002v4.p003os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1866a;
import androidx.core.app.C17195p;
import androidx.core.util.C17994n;
import androidx.media.C19604f;
import androidx.media.C19609g;
import androidx.media.C19612h;
import androidx.media.C19616i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.media.d */
public abstract class C19566d extends Service {
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: E0 */
    public static final int f50107E0 = 0;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: F0 */
    public static final int f50108F0 = 1;

    /* renamed from: X */
    public static final int f50109X = 2;

    /* renamed from: Y */
    public static final int f50110Y = 4;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: Z */
    public static final int f50111Z = -1;

    /* renamed from: f */
    public static final String f50112f = "MBServiceCompat";

    /* renamed from: g */
    public static final boolean f50113g = Log.isLoggable(f50112f, 3);

    /* renamed from: v */
    public static final float f50114v = 1.0E-5f;

    /* renamed from: w */
    public static final String f50115w = "android.media.browse.MediaBrowserService";
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: x */
    public static final String f50116x = "media_item";
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: y */
    public static final String f50117y = "search_results";

    /* renamed from: z */
    public static final int f50118z = 1;

    /* renamed from: a */
    public C19574g f50119a;

    /* renamed from: b */
    public final C1866a<IBinder, C19572f> f50120b = new C1866a<>();

    /* renamed from: c */
    public C19572f f50121c;

    /* renamed from: d */
    public final C19602q f50122d = new C19602q();

    /* renamed from: e */
    public MediaSessionCompat.Token f50123e;

    /* renamed from: androidx.media.d$a */
    public class C19567a extends C19589m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: g */
        public final /* synthetic */ C19572f f50124g;

        /* renamed from: h */
        public final /* synthetic */ String f50125h;

        /* renamed from: i */
        public final /* synthetic */ Bundle f50126i;

        /* renamed from: j */
        public final /* synthetic */ Bundle f50127j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19567a(Object obj, C19572f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f50124g = fVar;
            this.f50125h = str;
            this.f50126i = bundle;
            this.f50127j = bundle2;
        }

        /* renamed from: l */
        public void mo57909g(List<MediaBrowserCompat.MediaItem> list) {
            if (C19566d.this.f50120b.get(this.f50124g.f50146f.asBinder()) == this.f50124g) {
                if ((mo57947c() & 1) != 0) {
                    list = C19566d.this.mo57883b(list, this.f50126i);
                }
                try {
                    this.f50124g.f50146f.mo57971a(this.f50125h, list, this.f50126i, this.f50127j);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calling onLoadChildren() failed for id=");
                    sb.append(this.f50125h);
                    sb.append(" package=");
                    sb.append(this.f50124g.f50141a);
                }
            } else if (C19566d.f50113g) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                sb2.append(this.f50124g.f50141a);
                sb2.append(" id=");
                sb2.append(this.f50125h);
            }
        }
    }

    /* renamed from: androidx.media.d$b */
    public class C19568b extends C19589m<MediaBrowserCompat.MediaItem> {

        /* renamed from: g */
        public final /* synthetic */ ResultReceiver f50129g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19568b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f50129g = resultReceiver;
        }

        /* renamed from: l */
        public void mo57909g(MediaBrowserCompat.MediaItem mediaItem) {
            if ((mo57947c() & 2) != 0) {
                this.f50129g.mo675b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(C19566d.f50116x, mediaItem);
            this.f50129g.mo675b(0, bundle);
        }
    }

    /* renamed from: androidx.media.d$c */
    public class C19569c extends C19589m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: g */
        public final /* synthetic */ ResultReceiver f50131g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19569c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f50131g = resultReceiver;
        }

        /* renamed from: l */
        public void mo57909g(List<MediaBrowserCompat.MediaItem> list) {
            if ((mo57947c() & 4) != 0 || list == null) {
                this.f50131g.mo675b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(C19566d.f50117y, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f50131g.mo675b(0, bundle);
        }
    }

    /* renamed from: androidx.media.d$d */
    public class C19570d extends C19589m<Bundle> {

        /* renamed from: g */
        public final /* synthetic */ ResultReceiver f50133g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19570d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f50133g = resultReceiver;
        }

        /* renamed from: e */
        public void mo57913e(Bundle bundle) {
            this.f50133g.mo675b(-1, bundle);
        }

        /* renamed from: f */
        public void mo57914f(Bundle bundle) {
            this.f50133g.mo675b(1, bundle);
        }

        /* renamed from: l */
        public void mo57909g(Bundle bundle) {
            this.f50133g.mo675b(0, bundle);
        }
    }

    /* renamed from: androidx.media.d$e */
    public static final class C19571e {

        /* renamed from: c */
        public static final String f50135c = "android.service.media.extra.RECENT";

        /* renamed from: d */
        public static final String f50136d = "android.service.media.extra.OFFLINE";

        /* renamed from: e */
        public static final String f50137e = "android.service.media.extra.SUGGESTED";
        @Deprecated

        /* renamed from: f */
        public static final String f50138f = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* renamed from: a */
        public final String f50139a;

        /* renamed from: b */
        public final Bundle f50140b;

        public C19571e(@C0359n0 String str, @C0363p0 Bundle bundle) {
            if (str != null) {
                this.f50139a = str;
                this.f50140b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        /* renamed from: a */
        public Bundle mo57916a() {
            return this.f50140b;
        }

        /* renamed from: b */
        public String mo57917b() {
            return this.f50139a;
        }
    }

    /* renamed from: androidx.media.d$f */
    public class C19572f implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f50141a;

        /* renamed from: b */
        public final int f50142b;

        /* renamed from: c */
        public final int f50143c;

        /* renamed from: d */
        public final C19616i.C19618b f50144d;

        /* renamed from: e */
        public final Bundle f50145e;

        /* renamed from: f */
        public final C19600o f50146f;

        /* renamed from: g */
        public final HashMap<String, List<C17994n<IBinder, Bundle>>> f50147g = new HashMap<>();

        /* renamed from: h */
        public C19571e f50148h;

        /* renamed from: androidx.media.d$f$a */
        public class C19573a implements Runnable {
            public C19573a() {
            }

            public void run() {
                C19572f fVar = C19572f.this;
                C19566d.this.f50120b.remove(fVar.f50146f.asBinder());
            }
        }

        public C19572f(String str, int i, int i2, Bundle bundle, C19600o oVar) {
            this.f50141a = str;
            this.f50142b = i;
            this.f50143c = i2;
            this.f50144d = new C19616i.C19618b(str, i, i2);
            this.f50145e = bundle;
            this.f50146f = oVar;
        }

        public void binderDied() {
            C19566d.this.f50122d.post(new C19573a());
        }
    }

    /* renamed from: androidx.media.d$g */
    public interface C19574g {
        /* renamed from: b */
        C19616i.C19618b mo57920b();

        /* renamed from: e */
        void mo57921e(String str, Bundle bundle);

        /* renamed from: f */
        void mo57922f(MediaSessionCompat.Token token);

        /* renamed from: g */
        Bundle mo57923g();

        /* renamed from: h */
        void mo57924h(C19616i.C19618b bVar, String str, Bundle bundle);

        /* renamed from: j */
        IBinder mo57925j(Intent intent);

        void onCreate();
    }

    @C0376v0(21)
    /* renamed from: androidx.media.d$h */
    public class C19575h implements C19574g, C19604f.C19608d {

        /* renamed from: a */
        public final List<Bundle> f50151a = new ArrayList();

        /* renamed from: b */
        public Object f50152b;

        /* renamed from: c */
        public Messenger f50153c;

        /* renamed from: androidx.media.d$h$a */
        public class C19576a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ MediaSessionCompat.Token f50155a;

            public C19576a(MediaSessionCompat.Token token) {
                this.f50155a = token;
            }

            public void run() {
                if (!C19575h.this.f50151a.isEmpty()) {
                    C0153b d = this.f50155a.mo415d();
                    if (d != null) {
                        for (Bundle b : C19575h.this.f50151a) {
                            C17195p.m79487b(b, C19565c.f50099s, d.asBinder());
                        }
                    }
                    C19575h.this.f50151a.clear();
                }
                C19604f.m91214e(C19575h.this.f50152b, this.f50155a.mo419f());
            }
        }

        /* renamed from: androidx.media.d$h$b */
        public class C19577b extends C19589m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: g */
            public final /* synthetic */ C19604f.C19607c f50157g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19577b(Object obj, C19604f.C19607c cVar) {
                super(obj);
                this.f50157g = cVar;
            }

            /* renamed from: b */
            public void mo57934b() {
                this.f50157g.mo57981a();
            }

            /* renamed from: l */
            public void mo57909g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f50157g.mo57983c(arrayList);
            }
        }

        /* renamed from: androidx.media.d$h$c */
        public class C19578c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f50159a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f50160b;

            public C19578c(String str, Bundle bundle) {
                this.f50159a = str;
                this.f50160b = bundle;
            }

            public void run() {
                for (IBinder iBinder : C19566d.this.f50120b.keySet()) {
                    C1866a<IBinder, C19572f> aVar = C19566d.this.f50120b;
                    C19575h.this.mo57931m(aVar.get(iBinder), this.f50159a, this.f50160b);
                }
            }
        }

        /* renamed from: androidx.media.d$h$d */
        public class C19579d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C19616i.C19618b f50162a;

            /* renamed from: b */
            public final /* synthetic */ String f50163b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f50164c;

            public C19579d(C19616i.C19618b bVar, String str, Bundle bundle) {
                this.f50162a = bVar;
                this.f50163b = str;
                this.f50164c = bundle;
            }

            public void run() {
                for (int i = 0; i < C19566d.this.f50120b.size(); i++) {
                    C19572f o = C19566d.this.f50120b.mo6338o(i);
                    if (o.f50144d.equals(this.f50162a)) {
                        C19575h.this.mo57931m(o, this.f50163b, this.f50164c);
                    }
                }
            }
        }

        public C19575h() {
        }

        /* renamed from: b */
        public C19616i.C19618b mo57920b() {
            C19572f fVar = C19566d.this.f50121c;
            if (fVar != null) {
                return fVar.f50144d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        /* renamed from: d */
        public C19604f.C19605a mo57927d(String str, int i, Bundle bundle) {
            Bundle bundle2;
            IBinder iBinder;
            if (bundle == null || bundle.getInt(C19565c.f50096p, 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove(C19565c.f50096p);
                this.f50153c = new Messenger(C19566d.this.f50122d);
                bundle2 = new Bundle();
                bundle2.putInt(C19565c.f50097q, 2);
                C17195p.m79487b(bundle2, C19565c.f50098r, this.f50153c.getBinder());
                MediaSessionCompat.Token token = C19566d.this.f50123e;
                if (token != null) {
                    C0153b d = token.mo415d();
                    if (d == null) {
                        iBinder = null;
                    } else {
                        iBinder = d.asBinder();
                    }
                    C17195p.m79487b(bundle2, C19565c.f50099s, iBinder);
                } else {
                    this.f50151a.add(bundle2);
                }
            }
            C19566d dVar = C19566d.this;
            dVar.f50121c = new C19572f(str, -1, i, bundle, (C19600o) null);
            C19571e l = C19566d.this.mo57894l(str, i, bundle);
            C19566d.this.f50121c = null;
            if (l == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = l.mo57916a();
            } else if (l.mo57916a() != null) {
                bundle2.putAll(l.mo57916a());
            }
            return new C19604f.C19605a(l.mo57917b(), bundle2);
        }

        /* renamed from: e */
        public void mo57921e(String str, Bundle bundle) {
            mo57932n(str, bundle);
            mo57930l(str, bundle);
        }

        /* renamed from: f */
        public void mo57922f(MediaSessionCompat.Token token) {
            C19566d.this.f50122d.mo57976a(new C19576a(token));
        }

        /* renamed from: g */
        public Bundle mo57923g() {
            if (this.f50153c == null) {
                return null;
            }
            C19572f fVar = C19566d.this.f50121c;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            } else if (fVar.f50145e == null) {
                return null;
            } else {
                return new Bundle(C19566d.this.f50121c.f50145e);
            }
        }

        /* renamed from: h */
        public void mo57924h(C19616i.C19618b bVar, String str, Bundle bundle) {
            mo57929k(bVar, str, bundle);
        }

        /* renamed from: i */
        public void mo57928i(String str, C19604f.C19607c<List<Parcel>> cVar) {
            C19566d.this.mo57895m(str, new C19577b(str, cVar));
        }

        /* renamed from: j */
        public IBinder mo57925j(Intent intent) {
            return C19604f.m91212c(this.f50152b, intent);
        }

        /* renamed from: k */
        public void mo57929k(C19616i.C19618b bVar, String str, Bundle bundle) {
            C19566d.this.f50122d.post(new C19579d(bVar, str, bundle));
        }

        /* renamed from: l */
        public void mo57930l(String str, Bundle bundle) {
            C19566d.this.f50122d.post(new C19578c(str, bundle));
        }

        /* renamed from: m */
        public void mo57931m(C19572f fVar, String str, Bundle bundle) {
            List<C17994n> list = fVar.f50147g.get(str);
            if (list != null) {
                for (C17994n nVar : list) {
                    if (C19564b.m91105b(bundle, (Bundle) nVar.f46483b)) {
                        C19566d.this.mo57904t(str, fVar, (Bundle) nVar.f46483b, bundle);
                    }
                }
            }
        }

        /* renamed from: n */
        public void mo57932n(String str, Bundle bundle) {
            C19604f.m91211b(this.f50152b, str);
        }

        public void onCreate() {
            Object a = C19604f.m91210a(C19566d.this, this);
            this.f50152b = a;
            C19604f.m91213d(a);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.media.d$i */
    public class C19580i extends C19575h implements C19609g.C19611b {

        /* renamed from: androidx.media.d$i$a */
        public class C19581a extends C19589m<MediaBrowserCompat.MediaItem> {

            /* renamed from: g */
            public final /* synthetic */ C19604f.C19607c f50167g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19581a(Object obj, C19604f.C19607c cVar) {
                super(obj);
                this.f50167g = cVar;
            }

            /* renamed from: b */
            public void mo57934b() {
                this.f50167g.mo57981a();
            }

            /* renamed from: l */
            public void mo57909g(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f50167g.mo57983c(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f50167g.mo57983c(obtain);
            }
        }

        public C19580i() {
            super();
        }

        /* renamed from: a */
        public void mo57938a(String str, C19604f.C19607c<Parcel> cVar) {
            C19566d.this.mo57897o(str, new C19581a(str, cVar));
        }

        public void onCreate() {
            Object a = C19609g.m91220a(C19566d.this, this);
            this.f50152b = a;
            C19604f.m91213d(a);
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.media.d$j */
    public class C19582j extends C19580i implements C19612h.C19615c {

        /* renamed from: androidx.media.d$j$a */
        public class C19583a extends C19589m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: g */
            public final /* synthetic */ C19612h.C19614b f50170g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19583a(Object obj, C19612h.C19614b bVar) {
                super(obj);
                this.f50170g = bVar;
            }

            /* renamed from: b */
            public void mo57934b() {
                this.f50170g.mo57986a();
            }

            /* renamed from: l */
            public void mo57909g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f50170g.mo57988c(arrayList, mo57947c());
            }
        }

        public C19582j() {
            super();
        }

        /* renamed from: c */
        public void mo57940c(String str, C19612h.C19614b bVar, Bundle bundle) {
            C19566d.this.mo57896n(str, new C19583a(str, bVar), bundle);
        }

        /* renamed from: g */
        public Bundle mo57923g() {
            C19572f fVar = C19566d.this.f50121c;
            if (fVar == null) {
                return C19612h.m91223b(this.f50152b);
            }
            if (fVar.f50145e == null) {
                return null;
            }
            return new Bundle(C19566d.this.f50121c.f50145e);
        }

        /* renamed from: n */
        public void mo57932n(String str, Bundle bundle) {
            if (bundle != null) {
                C19612h.m91224c(this.f50152b, str, bundle);
            } else {
                super.mo57932n(str, bundle);
            }
        }

        public void onCreate() {
            Object a = C19612h.m91222a(C19566d.this, this);
            this.f50152b = a;
            C19604f.m91213d(a);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.media.d$k */
    public class C19584k extends C19582j {
        public C19584k() {
            super();
        }

        /* renamed from: b */
        public C19616i.C19618b mo57920b() {
            C19572f fVar = C19566d.this.f50121c;
            if (fVar != null) {
                return fVar.f50144d;
            }
            return new C19616i.C19618b(((MediaBrowserService) this.f50152b).getCurrentBrowserInfo());
        }
    }

    /* renamed from: androidx.media.d$l */
    public class C19585l implements C19574g {

        /* renamed from: a */
        public Messenger f50173a;

        /* renamed from: androidx.media.d$l$a */
        public class C19586a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ MediaSessionCompat.Token f50175a;

            public C19586a(MediaSessionCompat.Token token) {
                this.f50175a = token;
            }

            public void run() {
                Iterator<C19572f> it = C19566d.this.f50120b.values().iterator();
                while (it.hasNext()) {
                    C19572f next = it.next();
                    try {
                        next.f50146f.mo57974c(next.f50148h.mo57917b(), this.f50175a, next.f50148h.mo57916a());
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Connection for ");
                        sb.append(next.f50141a);
                        sb.append(" is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: androidx.media.d$l$b */
        public class C19587b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f50177a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f50178b;

            public C19587b(String str, Bundle bundle) {
                this.f50177a = str;
                this.f50178b = bundle;
            }

            public void run() {
                for (IBinder iBinder : C19566d.this.f50120b.keySet()) {
                    C1866a<IBinder, C19572f> aVar = C19566d.this.f50120b;
                    C19585l.this.mo57942a(aVar.get(iBinder), this.f50177a, this.f50178b);
                }
            }
        }

        /* renamed from: androidx.media.d$l$c */
        public class C19588c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C19616i.C19618b f50180a;

            /* renamed from: b */
            public final /* synthetic */ String f50181b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f50182c;

            public C19588c(C19616i.C19618b bVar, String str, Bundle bundle) {
                this.f50180a = bVar;
                this.f50181b = str;
                this.f50182c = bundle;
            }

            public void run() {
                for (int i = 0; i < C19566d.this.f50120b.size(); i++) {
                    C19572f o = C19566d.this.f50120b.mo6338o(i);
                    if (o.f50144d.equals(this.f50180a)) {
                        C19585l.this.mo57942a(o, this.f50181b, this.f50182c);
                        return;
                    }
                }
            }
        }

        public C19585l() {
        }

        /* renamed from: a */
        public void mo57942a(C19572f fVar, String str, Bundle bundle) {
            List<C17994n> list = fVar.f50147g.get(str);
            if (list != null) {
                for (C17994n nVar : list) {
                    if (C19564b.m91105b(bundle, (Bundle) nVar.f46483b)) {
                        C19566d.this.mo57904t(str, fVar, (Bundle) nVar.f46483b, bundle);
                    }
                }
            }
        }

        /* renamed from: b */
        public C19616i.C19618b mo57920b() {
            C19572f fVar = C19566d.this.f50121c;
            if (fVar != null) {
                return fVar.f50144d;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        /* renamed from: e */
        public void mo57921e(@C0359n0 String str, Bundle bundle) {
            C19566d.this.f50122d.post(new C19587b(str, bundle));
        }

        /* renamed from: f */
        public void mo57922f(MediaSessionCompat.Token token) {
            C19566d.this.f50122d.post(new C19586a(token));
        }

        /* renamed from: g */
        public Bundle mo57923g() {
            C19572f fVar = C19566d.this.f50121c;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            } else if (fVar.f50145e == null) {
                return null;
            } else {
                return new Bundle(C19566d.this.f50121c.f50145e);
            }
        }

        /* renamed from: h */
        public void mo57924h(@C0359n0 C19616i.C19618b bVar, @C0359n0 String str, Bundle bundle) {
            C19566d.this.f50122d.post(new C19588c(bVar, str, bundle));
        }

        /* renamed from: j */
        public IBinder mo57925j(Intent intent) {
            if (C19566d.f50115w.equals(intent.getAction())) {
                return this.f50173a.getBinder();
            }
            return null;
        }

        public void onCreate() {
            this.f50173a = new Messenger(C19566d.this.f50122d);
        }
    }

    /* renamed from: androidx.media.d$m */
    public static class C19589m<T> {

        /* renamed from: a */
        public final Object f50184a;

        /* renamed from: b */
        public boolean f50185b;

        /* renamed from: c */
        public boolean f50186c;

        /* renamed from: d */
        public boolean f50187d;

        /* renamed from: e */
        public boolean f50188e;

        /* renamed from: f */
        public int f50189f;

        public C19589m(Object obj) {
            this.f50184a = obj;
        }

        /* renamed from: a */
        public final void mo57946a(Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.f53g)) {
                float f = bundle.getFloat(MediaBrowserCompat.f53g);
                if (f < -1.0E-5f || f > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                }
            }
        }

        /* renamed from: b */
        public void mo57934b() {
            if (this.f50185b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f50184a);
            } else if (this.f50186c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f50184a);
            } else if (!this.f50188e) {
                this.f50185b = true;
            } else {
                throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f50184a);
            }
        }

        /* renamed from: c */
        public int mo57947c() {
            return this.f50189f;
        }

        /* renamed from: d */
        public boolean mo57948d() {
            return this.f50185b || this.f50186c || this.f50188e;
        }

        /* renamed from: e */
        public void mo57913e(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f50184a);
        }

        /* renamed from: f */
        public void mo57914f(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f50184a);
        }

        /* renamed from: g */
        public void mo57909g(T t) {
        }

        /* renamed from: h */
        public void mo57949h(Bundle bundle) {
            if (this.f50186c || this.f50188e) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f50184a);
            }
            this.f50188e = true;
            mo57913e(bundle);
        }

        /* renamed from: i */
        public void mo57950i(Bundle bundle) {
            if (this.f50186c || this.f50188e) {
                throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f50184a);
            }
            mo57946a(bundle);
            this.f50187d = true;
            mo57914f(bundle);
        }

        /* renamed from: j */
        public void mo57951j(T t) {
            if (this.f50186c || this.f50188e) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f50184a);
            }
            this.f50186c = true;
            mo57909g(t);
        }

        /* renamed from: k */
        public void mo57952k(int i) {
            this.f50189f = i;
        }
    }

    /* renamed from: androidx.media.d$n */
    public class C19590n {

        /* renamed from: androidx.media.d$n$a */
        public class C19591a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C19600o f50191a;

            /* renamed from: b */
            public final /* synthetic */ String f50192b;

            /* renamed from: c */
            public final /* synthetic */ int f50193c;

            /* renamed from: d */
            public final /* synthetic */ int f50194d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f50195e;

            public C19591a(C19600o oVar, String str, int i, int i2, Bundle bundle) {
                this.f50191a = oVar;
                this.f50192b = str;
                this.f50193c = i;
                this.f50194d = i2;
                this.f50195e = bundle;
            }

            public void run() {
                IBinder asBinder = this.f50191a.asBinder();
                C19566d.this.f50120b.remove(asBinder);
                C19572f fVar = new C19572f(this.f50192b, this.f50193c, this.f50194d, this.f50195e, this.f50191a);
                C19566d dVar = C19566d.this;
                dVar.f50121c = fVar;
                C19571e l = dVar.mo57894l(this.f50192b, this.f50194d, this.f50195e);
                fVar.f50148h = l;
                C19566d dVar2 = C19566d.this;
                dVar2.f50121c = null;
                if (l == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No root for client ");
                    sb.append(this.f50192b);
                    sb.append(" from service ");
                    sb.append(getClass().getName());
                    try {
                        this.f50191a.mo57973b();
                    } catch (RemoteException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                        sb2.append(this.f50192b);
                    }
                } else {
                    try {
                        dVar2.f50120b.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (C19566d.this.f50123e != null) {
                            this.f50191a.mo57974c(fVar.f50148h.mo57917b(), C19566d.this.f50123e, fVar.f50148h.mo57916a());
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Calling onConnect() failed. Dropping client. pkg=");
                        sb3.append(this.f50192b);
                        C19566d.this.f50120b.remove(asBinder);
                    }
                }
            }
        }

        /* renamed from: androidx.media.d$n$b */
        public class C19592b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C19600o f50197a;

            public C19592b(C19600o oVar) {
                this.f50197a = oVar;
            }

            public void run() {
                C19572f remove = C19566d.this.f50120b.remove(this.f50197a.asBinder());
                if (remove != null) {
                    remove.f50146f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.d$n$c */
        public class C19593c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C19600o f50199a;

            /* renamed from: b */
            public final /* synthetic */ String f50200b;

            /* renamed from: c */
            public final /* synthetic */ IBinder f50201c;

            /* renamed from: d */
            public final /* synthetic */ Bundle f50202d;

            public C19593c(C19600o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.f50199a = oVar;
                this.f50200b = str;
                this.f50201c = iBinder;
                this.f50202d = bundle;
            }

            public void run() {
                C19572f fVar = C19566d.this.f50120b.get(this.f50199a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("addSubscription for callback that isn't registered id=");
                    sb.append(this.f50200b);
                    return;
                }
                C19566d.this.mo57882a(this.f50200b, fVar, this.f50201c, this.f50202d);
            }
        }

        /* renamed from: androidx.media.d$n$d */
        public class C19594d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C19600o f50204a;

            /* renamed from: b */
            public final /* synthetic */ String f50205b;

            /* renamed from: c */
            public final /* synthetic */ IBinder f50206c;

            public C19594d(C19600o oVar, String str, IBinder iBinder) {
                this.f50204a = oVar;
                this.f50205b = str;
                this.f50206c = iBinder;
            }

            public void run() {
                C19572f fVar = C19566d.this.f50120b.get(this.f50204a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeSubscription for callback that isn't registered id=");
                    sb.append(this.f50205b);
                } else if (!C19566d.this.mo57907w(this.f50205b, fVar, this.f50206c)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("removeSubscription called for ");
                    sb2.append(this.f50205b);
                    sb2.append(" which is not subscribed");
                }
            }
        }

        /* renamed from: androidx.media.d$n$e */
        public class C19595e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C19600o f50208a;

            /* renamed from: b */
            public final /* synthetic */ String f50209b;

            /* renamed from: c */
            public final /* synthetic */ ResultReceiver f50210c;

            public C19595e(C19600o oVar, String str, ResultReceiver resultReceiver) {
                this.f50208a = oVar;
                this.f50209b = str;
                this.f50210c = resultReceiver;
            }

            public void run() {
                C19572f fVar = C19566d.this.f50120b.get(this.f50208a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getMediaItem for callback that isn't registered id=");
                    sb.append(this.f50209b);
                    return;
                }
                C19566d.this.mo57905u(this.f50209b, fVar, this.f50210c);
            }
        }

        /* renamed from: androidx.media.d$n$f */
        public class C19596f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C19600o f50212a;

            /* renamed from: b */
            public final /* synthetic */ String f50213b;

            /* renamed from: c */
            public final /* synthetic */ int f50214c;

            /* renamed from: d */
            public final /* synthetic */ int f50215d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f50216e;

            public C19596f(C19600o oVar, String str, int i, int i2, Bundle bundle) {
                this.f50212a = oVar;
                this.f50213b = str;
                this.f50214c = i;
                this.f50215d = i2;
                this.f50216e = bundle;
            }

            public void run() {
                IBinder asBinder = this.f50212a.asBinder();
                C19566d.this.f50120b.remove(asBinder);
                C19572f fVar = new C19572f(this.f50213b, this.f50214c, this.f50215d, this.f50216e, this.f50212a);
                C19566d.this.f50120b.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: androidx.media.d$n$g */
        public class C19597g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C19600o f50218a;

            public C19597g(C19600o oVar) {
                this.f50218a = oVar;
            }

            public void run() {
                IBinder asBinder = this.f50218a.asBinder();
                C19572f remove = C19566d.this.f50120b.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.d$n$h */
        public class C19598h implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C19600o f50220a;

            /* renamed from: b */
            public final /* synthetic */ String f50221b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f50222c;

            /* renamed from: d */
            public final /* synthetic */ ResultReceiver f50223d;

            public C19598h(C19600o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f50220a = oVar;
                this.f50221b = str;
                this.f50222c = bundle;
                this.f50223d = resultReceiver;
            }

            public void run() {
                C19572f fVar = C19566d.this.f50120b.get(this.f50220a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("search for callback that isn't registered query=");
                    sb.append(this.f50221b);
                    return;
                }
                C19566d.this.mo57906v(this.f50221b, this.f50222c, fVar, this.f50223d);
            }
        }

        /* renamed from: androidx.media.d$n$i */
        public class C19599i implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C19600o f50225a;

            /* renamed from: b */
            public final /* synthetic */ String f50226b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f50227c;

            /* renamed from: d */
            public final /* synthetic */ ResultReceiver f50228d;

            public C19599i(C19600o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f50225a = oVar;
                this.f50226b = str;
                this.f50227c = bundle;
                this.f50228d = resultReceiver;
            }

            public void run() {
                C19572f fVar = C19566d.this.f50120b.get(this.f50225a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("sendCustomAction for callback that isn't registered action=");
                    sb.append(this.f50226b);
                    sb.append(", extras=");
                    sb.append(this.f50227c);
                    return;
                }
                C19566d.this.mo57903s(this.f50226b, this.f50227c, fVar, this.f50228d);
            }
        }

        public C19590n() {
        }

        /* renamed from: a */
        public void mo57953a(String str, IBinder iBinder, Bundle bundle, C19600o oVar) {
            C19566d.this.f50122d.mo57976a(new C19593c(oVar, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void mo57954b(String str, int i, int i2, Bundle bundle, C19600o oVar) {
            if (C19566d.this.mo57889g(str, i2)) {
                C19566d.this.f50122d.mo57976a(new C19591a(oVar, str, i, i2, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        /* renamed from: c */
        public void mo57955c(C19600o oVar) {
            C19566d.this.f50122d.mo57976a(new C19592b(oVar));
        }

        /* renamed from: d */
        public void mo57956d(String str, ResultReceiver resultReceiver, C19600o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C19566d.this.f50122d.mo57976a(new C19595e(oVar, str, resultReceiver));
            }
        }

        /* renamed from: e */
        public void mo57957e(C19600o oVar, String str, int i, int i2, Bundle bundle) {
            C19566d.this.f50122d.mo57976a(new C19596f(oVar, str, i, i2, bundle));
        }

        /* renamed from: f */
        public void mo57958f(String str, IBinder iBinder, C19600o oVar) {
            C19566d.this.f50122d.mo57976a(new C19594d(oVar, str, iBinder));
        }

        /* renamed from: g */
        public void mo57959g(String str, Bundle bundle, ResultReceiver resultReceiver, C19600o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C19566d.this.f50122d.mo57976a(new C19598h(oVar, str, bundle, resultReceiver));
            }
        }

        /* renamed from: h */
        public void mo57960h(String str, Bundle bundle, ResultReceiver resultReceiver, C19600o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C19566d.this.f50122d.mo57976a(new C19599i(oVar, str, bundle, resultReceiver));
            }
        }

        /* renamed from: i */
        public void mo57961i(C19600o oVar) {
            C19566d.this.f50122d.mo57976a(new C19597g(oVar));
        }
    }

    /* renamed from: androidx.media.d$o */
    public interface C19600o {
        /* renamed from: a */
        void mo57971a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        /* renamed from: b */
        void mo57973b() throws RemoteException;

        /* renamed from: c */
        void mo57974c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* renamed from: androidx.media.d$p */
    public static class C19601p implements C19600o {

        /* renamed from: a */
        public final Messenger f50230a;

        public C19601p(Messenger messenger) {
            this.f50230a = messenger;
        }

        /* renamed from: a */
        public void mo57971a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            ArrayList arrayList;
            Bundle bundle3 = new Bundle();
            bundle3.putString(C19565c.f50084d, str);
            bundle3.putBundle(C19565c.f50087g, bundle);
            bundle3.putBundle(C19565c.f50088h, bundle2);
            if (list != null) {
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList(list);
                }
                bundle3.putParcelableArrayList(C19565c.f50085e, arrayList);
            }
            mo57975d(3, bundle3);
        }

        public IBinder asBinder() {
            return this.f50230a.getBinder();
        }

        /* renamed from: b */
        public void mo57973b() throws RemoteException {
            mo57975d(2, (Bundle) null);
        }

        /* renamed from: c */
        public void mo57974c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(C19565c.f50097q, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(C19565c.f50084d, str);
            bundle2.putParcelable(C19565c.f50086f, token);
            bundle2.putBundle(C19565c.f50091k, bundle);
            mo57975d(1, bundle2);
        }

        /* renamed from: d */
        public final void mo57975d(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f50230a.send(obtain);
        }
    }

    /* renamed from: androidx.media.d$q */
    public final class C19602q extends Handler {

        /* renamed from: a */
        public final C19590n f50231a;

        public C19602q() {
            this.f50231a = new C19590n();
        }

        /* renamed from: a */
        public void mo57976a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(C19565c.f50091k);
                    MediaSessionCompat.m591b(bundle);
                    this.f50231a.mo57954b(data.getString(C19565c.f50089i), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C19601p(message.replyTo));
                    return;
                case 2:
                    this.f50231a.mo57955c(new C19601p(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle(C19565c.f50087g);
                    MediaSessionCompat.m591b(bundle2);
                    this.f50231a.mo57953a(data.getString(C19565c.f50084d), C17195p.m79486a(data, C19565c.f50081a), bundle2, new C19601p(message.replyTo));
                    return;
                case 4:
                    this.f50231a.mo57958f(data.getString(C19565c.f50084d), C17195p.m79486a(data, C19565c.f50081a), new C19601p(message.replyTo));
                    return;
                case 5:
                    this.f50231a.mo57956d(data.getString(C19565c.f50084d), (ResultReceiver) data.getParcelable(C19565c.f50090j), new C19601p(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(C19565c.f50091k);
                    MediaSessionCompat.m591b(bundle3);
                    C19590n nVar = this.f50231a;
                    C19601p pVar = new C19601p(message.replyTo);
                    nVar.mo57957e(pVar, data.getString(C19565c.f50089i), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f50231a.mo57961i(new C19601p(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle(C19565c.f50092l);
                    MediaSessionCompat.m591b(bundle4);
                    this.f50231a.mo57959g(data.getString(C19565c.f50093m), bundle4, (ResultReceiver) data.getParcelable(C19565c.f50090j), new C19601p(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle(C19565c.f50095o);
                    MediaSessionCompat.m591b(bundle5);
                    this.f50231a.mo57960h(data.getString(C19565c.f50094n), bundle5, (ResultReceiver) data.getParcelable(C19565c.f50090j), new C19601p(message.replyTo));
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message: ");
                    sb.append(message);
                    sb.append("\n  Service version: ");
                    sb.append(2);
                    sb.append("\n  Client version: ");
                    sb.append(message.arg1);
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: a */
    public void mo57882a(String str, C19572f fVar, IBinder iBinder, Bundle bundle) {
        List<C17994n> list = fVar.f50147g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C17994n nVar : list) {
            if (iBinder == nVar.f46482a && C19564b.m91104a(bundle, (Bundle) nVar.f46483b)) {
                return;
            }
        }
        list.add(new C17994n(iBinder, bundle));
        fVar.f50147g.put(str, list);
        mo57904t(str, fVar, bundle, (Bundle) null);
        this.f50121c = fVar;
        mo57901q(str, bundle);
        this.f50121c = null;
    }

    /* renamed from: b */
    public List<MediaBrowserCompat.MediaItem> mo57883b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt(MediaBrowserCompat.f50d, -1);
        int i2 = bundle.getInt(MediaBrowserCompat.f51e, -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public void mo57884c(Context context) {
        attachBaseContext(context);
    }

    /* renamed from: d */
    public final Bundle mo57885d() {
        return this.f50119a.mo57923g();
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @C0359n0
    /* renamed from: e */
    public final C19616i.C19618b mo57887e() {
        return this.f50119a.mo57920b();
    }

    @C0363p0
    /* renamed from: f */
    public MediaSessionCompat.Token mo57888f() {
        return this.f50123e;
    }

    /* renamed from: g */
    public boolean mo57889g(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public void mo57890h(@C0359n0 C19616i.C19618b bVar, @C0359n0 String str, @C0359n0 Bundle bundle) {
        if (bVar == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        } else if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.f50119a.mo57924h(bVar, str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    /* renamed from: i */
    public void mo57891i(@C0359n0 String str) {
        if (str != null) {
            this.f50119a.mo57921e(str, (Bundle) null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    /* renamed from: j */
    public void mo57892j(@C0359n0 String str, @C0359n0 Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.f50119a.mo57921e(str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    /* renamed from: k */
    public void mo57893k(@C0359n0 String str, Bundle bundle, @C0359n0 C19589m<Bundle> mVar) {
        mVar.mo57949h((Bundle) null);
    }

    @C0363p0
    /* renamed from: l */
    public abstract C19571e mo57894l(@C0359n0 String str, int i, @C0363p0 Bundle bundle);

    /* renamed from: m */
    public abstract void mo57895m(@C0359n0 String str, @C0359n0 C19589m<List<MediaBrowserCompat.MediaItem>> mVar);

    /* renamed from: n */
    public void mo57896n(@C0359n0 String str, @C0359n0 C19589m<List<MediaBrowserCompat.MediaItem>> mVar, @C0359n0 Bundle bundle) {
        mVar.mo57952k(1);
        mo57895m(str, mVar);
    }

    /* renamed from: o */
    public void mo57897o(String str, @C0359n0 C19589m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.mo57952k(2);
        mVar.mo57951j(null);
    }

    public IBinder onBind(Intent intent) {
        return this.f50119a.mo57925j(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f50119a = new C19584k();
        } else if (i >= 26) {
            this.f50119a = new C19582j();
        } else {
            this.f50119a = new C19580i();
        }
        this.f50119a.onCreate();
    }

    /* renamed from: p */
    public void mo57900p(@C0359n0 String str, Bundle bundle, @C0359n0 C19589m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.mo57952k(4);
        mVar.mo57951j(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: q */
    public void mo57901q(String str, Bundle bundle) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public void mo57902r(String str) {
    }

    /* renamed from: s */
    public void mo57903s(String str, Bundle bundle, C19572f fVar, ResultReceiver resultReceiver) {
        C19570d dVar = new C19570d(str, resultReceiver);
        this.f50121c = fVar;
        mo57893k(str, bundle, dVar);
        this.f50121c = null;
        if (!dVar.mo57948d()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    /* renamed from: t */
    public void mo57904t(String str, C19572f fVar, Bundle bundle, Bundle bundle2) {
        C19567a aVar = new C19567a(str, fVar, str, bundle, bundle2);
        this.f50121c = fVar;
        if (bundle == null) {
            mo57895m(str, aVar);
        } else {
            mo57896n(str, aVar, bundle);
        }
        this.f50121c = null;
        if (!aVar.mo57948d()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f50141a + " id=" + str);
        }
    }

    /* renamed from: u */
    public void mo57905u(String str, C19572f fVar, ResultReceiver resultReceiver) {
        C19568b bVar = new C19568b(str, resultReceiver);
        this.f50121c = fVar;
        mo57897o(str, bVar);
        this.f50121c = null;
        if (!bVar.mo57948d()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    /* renamed from: v */
    public void mo57906v(String str, Bundle bundle, C19572f fVar, ResultReceiver resultReceiver) {
        C19569c cVar = new C19569c(str, resultReceiver);
        this.f50121c = fVar;
        mo57900p(str, bundle, cVar);
        this.f50121c = null;
        if (!cVar.mo57948d()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    /* renamed from: w */
    public boolean mo57907w(String str, C19572f fVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (fVar.f50147g.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f50121c = fVar;
                mo57902r(str);
                this.f50121c = null;
            }
        } else {
            List list = fVar.f50147g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((C17994n) it.next()).f46482a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f50147g.remove(str);
                }
            }
            this.f50121c = fVar;
            mo57902r(str);
            this.f50121c = null;
            return z2;
        }
    }

    /* renamed from: x */
    public void mo57908x(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.f50123e == null) {
            this.f50123e = token;
            this.f50119a.mo57922f(token);
        } else {
            throw new IllegalStateException("The session token has already been set.");
        }
    }
}
