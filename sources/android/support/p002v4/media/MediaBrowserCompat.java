package android.support.p002v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
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
import android.support.p002v4.media.C0078a;
import android.support.p002v4.media.C0084b;
import android.support.p002v4.media.C0087c;
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
import androidx.media.C19564b;
import androidx.media.C19565c;
import androidx.media.C19566d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    public static final String f48b = "MediaBrowserCompat";

    /* renamed from: c */
    public static final boolean f49c = Log.isLoggable(f48b, 3);

    /* renamed from: d */
    public static final String f50d = "android.media.browse.extra.PAGE";

    /* renamed from: e */
    public static final String f51e = "android.media.browse.extra.PAGE_SIZE";

    /* renamed from: f */
    public static final String f52f = "android.media.browse.extra.MEDIA_ID";

    /* renamed from: g */
    public static final String f53g = "android.media.browse.extra.DOWNLOAD_PROGRESS";

    /* renamed from: h */
    public static final String f54h = "android.support.v4.media.action.DOWNLOAD";

    /* renamed from: i */
    public static final String f55i = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";

    /* renamed from: a */
    public final C0039e f56a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    public static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: d */
        public final String f57d;

        /* renamed from: e */
        public final Bundle f58e;

        /* renamed from: f */
        public final C0036c f59f;

        public CustomActionResultReceiver(String str, Bundle bundle, C0036c cVar, Handler handler) {
            super(handler);
            this.f57d = str;
            this.f58e = bundle;
            this.f59f = cVar;
        }

        /* renamed from: a */
        public void mo78a(int i, Bundle bundle) {
            if (this.f59f != null) {
                MediaSessionCompat.m591b(bundle);
                if (i == -1) {
                    this.f59f.mo103a(this.f57d, this.f58e, bundle);
                } else if (i == 0) {
                    this.f59f.mo105c(this.f57d, this.f58e, bundle);
                } else if (i != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown result code: ");
                    sb.append(i);
                    sb.append(" (extras=");
                    sb.append(this.f58e);
                    sb.append(", resultData=");
                    sb.append(bundle);
                    sb.append(")");
                } else {
                    this.f59f.mo104b(this.f57d, this.f58e, bundle);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    public static class ItemReceiver extends ResultReceiver {

        /* renamed from: d */
        public final String f60d;

        /* renamed from: e */
        public final C0037d f61e;

        public ItemReceiver(String str, C0037d dVar, Handler handler) {
            super(handler);
            this.f60d = str;
            this.f61e = dVar;
        }

        /* renamed from: a */
        public void mo78a(int i, Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(C19566d.f50116x)) {
                this.f61e.mo106a(this.f60d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(C19566d.f50116x);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f61e.mo107b((MediaItem) parcelable);
            } else {
                this.f61e.mo106a(this.f60d);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    public static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: d */
        public final String f66d;

        /* renamed from: e */
        public final Bundle f67e;

        /* renamed from: f */
        public final C0061k f68f;

        public SearchResultReceiver(String str, Bundle bundle, C0061k kVar, Handler handler) {
            super(handler);
            this.f66d = str;
            this.f67e = bundle;
            this.f68f = kVar;
        }

        /* renamed from: a */
        public void mo78a(int i, Bundle bundle) {
            ArrayList arrayList;
            MediaSessionCompat.m591b(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(C19566d.f50117y)) {
                this.f68f.mo148a(this.f66d, this.f67e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(C19566d.f50117y);
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            } else {
                arrayList = null;
            }
            this.f68f.mo149b(this.f66d, this.f67e, arrayList);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static class C0032a extends Handler {

        /* renamed from: a */
        public final WeakReference<C0060j> f69a;

        /* renamed from: b */
        public WeakReference<Messenger> f70b;

        public C0032a(C0060j jVar) {
            this.f69a = new WeakReference<>(jVar);
        }

        /* renamed from: a */
        public void mo91a(Messenger messenger) {
            this.f70b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f70b;
            if (weakReference != null && weakReference.get() != null && this.f69a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m591b(data);
                C0060j jVar = this.f69a.get();
                Messenger messenger = this.f70b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle(C19565c.f50091k);
                        MediaSessionCompat.m591b(bundle);
                        jVar.mo124k(messenger, data.getString(C19565c.f50084d), (MediaSessionCompat.Token) data.getParcelable(C19565c.f50086f), bundle);
                    } else if (i == 2) {
                        jVar.mo125o(messenger);
                    } else if (i != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unhandled message: ");
                        sb.append(message);
                        sb.append("\n  Client version: ");
                        sb.append(1);
                        sb.append("\n  Service version: ");
                        sb.append(message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle(C19565c.f50087g);
                        MediaSessionCompat.m591b(bundle2);
                        Bundle bundle3 = data.getBundle(C19565c.f50088h);
                        MediaSessionCompat.m591b(bundle3);
                        jVar.mo123h(messenger, data.getString(C19565c.f50084d), data.getParcelableArrayList(C19565c.f50085e), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        jVar.mo125o(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0033b {

        /* renamed from: a */
        public final Object f71a = C0078a.m306c(new C0035b());

        /* renamed from: b */
        public C0034a f72b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        public interface C0034a {
            /* renamed from: b */
            void mo97b();

            /* renamed from: c */
            void mo98c();

            /* renamed from: d */
            void mo99d();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        public class C0035b implements C0078a.C0079a {
            public C0035b() {
            }

            /* renamed from: b */
            public void mo100b() {
                C0034a aVar = C0033b.this.f72b;
                if (aVar != null) {
                    aVar.mo97b();
                }
                C0033b.this.mo93a();
            }

            /* renamed from: c */
            public void mo101c() {
                C0034a aVar = C0033b.this.f72b;
                if (aVar != null) {
                    aVar.mo98c();
                }
                C0033b.this.mo94b();
            }

            /* renamed from: d */
            public void mo102d() {
                C0034a aVar = C0033b.this.f72b;
                if (aVar != null) {
                    aVar.mo99d();
                }
                C0033b.this.mo95c();
            }
        }

        /* renamed from: a */
        public void mo93a() {
        }

        /* renamed from: b */
        public void mo94b() {
        }

        /* renamed from: c */
        public void mo95c() {
        }

        /* renamed from: d */
        public void mo96d(C0034a aVar) {
            this.f72b = aVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0036c {
        /* renamed from: a */
        public void mo103a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void mo104b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void mo105c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class C0037d {

        /* renamed from: a */
        public final Object f74a = C0084b.m323a(new C0038a());

        /* renamed from: android.support.v4.media.MediaBrowserCompat$d$a */
        public class C0038a implements C0084b.C0085a {
            public C0038a() {
            }

            /* renamed from: a */
            public void mo108a(@C0359n0 String str) {
                C0037d.this.mo106a(str);
            }

            /* renamed from: b */
            public void mo109b(Parcel parcel) {
                if (parcel == null) {
                    C0037d.this.mo107b((MediaItem) null);
                    return;
                }
                parcel.setDataPosition(0);
                parcel.recycle();
                C0037d.this.mo107b(MediaItem.CREATOR.createFromParcel(parcel));
            }
        }

        /* renamed from: a */
        public void mo106a(@C0359n0 String str) {
        }

        /* renamed from: b */
        public void mo107b(MediaItem mediaItem) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public interface C0039e {
        /* renamed from: a */
        boolean mo110a();

        @C0359n0
        /* renamed from: e */
        MediaSessionCompat.Token mo111e();

        /* renamed from: f */
        void mo112f();

        /* renamed from: g */
        void mo113g(@C0359n0 String str, Bundle bundle, @C0363p0 C0036c cVar);

        @C0363p0
        Bundle getExtras();

        @C0359n0
        String getRoot();

        /* renamed from: i */
        void mo116i();

        /* renamed from: j */
        void mo117j(@C0359n0 String str, Bundle bundle, @C0359n0 C0061k kVar);

        /* renamed from: l */
        ComponentName mo118l();

        /* renamed from: m */
        void mo119m(@C0359n0 String str, @C0359n0 C0037d dVar);

        /* renamed from: n */
        void mo120n(@C0359n0 String str, @C0363p0 Bundle bundle, @C0359n0 C0064n nVar);

        /* renamed from: p */
        void mo121p(@C0359n0 String str, C0064n nVar);

        @C0363p0
        /* renamed from: q */
        Bundle mo122q();
    }

    @C0376v0(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    public static class C0040f implements C0039e, C0060j, C0033b.C0034a {

        /* renamed from: a */
        public final Context f76a;

        /* renamed from: b */
        public final Object f77b;

        /* renamed from: c */
        public final Bundle f78c;

        /* renamed from: d */
        public final C0032a f79d = new C0032a(this);

        /* renamed from: e */
        public final C1866a<String, C0063m> f80e = new C1866a<>();

        /* renamed from: f */
        public int f81f;

        /* renamed from: g */
        public C0062l f82g;

        /* renamed from: h */
        public Messenger f83h;

        /* renamed from: i */
        public MediaSessionCompat.Token f84i;

        /* renamed from: j */
        public Bundle f85j;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$a */
        public class C0041a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0037d f86a;

            /* renamed from: b */
            public final /* synthetic */ String f87b;

            public C0041a(C0037d dVar, String str) {
                this.f86a = dVar;
                this.f87b = str;
            }

            public void run() {
                this.f86a.mo106a(this.f87b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$b */
        public class C0042b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0037d f89a;

            /* renamed from: b */
            public final /* synthetic */ String f90b;

            public C0042b(C0037d dVar, String str) {
                this.f89a = dVar;
                this.f90b = str;
            }

            public void run() {
                this.f89a.mo106a(this.f90b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$c */
        public class C0043c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0037d f92a;

            /* renamed from: b */
            public final /* synthetic */ String f93b;

            public C0043c(C0037d dVar, String str) {
                this.f92a = dVar;
                this.f93b = str;
            }

            public void run() {
                this.f92a.mo106a(this.f93b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$d */
        public class C0044d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0061k f95a;

            /* renamed from: b */
            public final /* synthetic */ String f96b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f97c;

            public C0044d(C0061k kVar, String str, Bundle bundle) {
                this.f95a = kVar;
                this.f96b = str;
                this.f97c = bundle;
            }

            public void run() {
                this.f95a.mo148a(this.f96b, this.f97c);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$e */
        public class C0045e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0061k f99a;

            /* renamed from: b */
            public final /* synthetic */ String f100b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f101c;

            public C0045e(C0061k kVar, String str, Bundle bundle) {
                this.f99a = kVar;
                this.f100b = str;
                this.f101c = bundle;
            }

            public void run() {
                this.f99a.mo148a(this.f100b, this.f101c);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$f */
        public class C0046f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0036c f103a;

            /* renamed from: b */
            public final /* synthetic */ String f104b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f105c;

            public C0046f(C0036c cVar, String str, Bundle bundle) {
                this.f103a = cVar;
                this.f104b = str;
                this.f105c = bundle;
            }

            public void run() {
                this.f103a.mo103a(this.f104b, this.f105c, (Bundle) null);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$g */
        public class C0047g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0036c f107a;

            /* renamed from: b */
            public final /* synthetic */ String f108b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f109c;

            public C0047g(C0036c cVar, String str, Bundle bundle) {
                this.f107a = cVar;
                this.f108b = str;
                this.f109c = bundle;
            }

            public void run() {
                this.f107a.mo103a(this.f108b, this.f109c, (Bundle) null);
            }
        }

        public C0040f(Context context, ComponentName componentName, C0033b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f76a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f78c = bundle2;
            bundle2.putInt(C19565c.f50096p, 1);
            bVar.mo96d(this);
            this.f77b = C0078a.m305b(context, componentName, bVar.f71a, bundle2);
        }

        /* renamed from: a */
        public boolean mo110a() {
            return C0078a.m313j(this.f77b);
        }

        /* renamed from: b */
        public void mo97b() {
            Bundle f = C0078a.m309f(this.f77b);
            if (f != null) {
                this.f81f = f.getInt(C19565c.f50097q, 0);
                IBinder a = C17195p.m79486a(f, C19565c.f50098r);
                if (a != null) {
                    this.f82g = new C0062l(a, this.f78c);
                    Messenger messenger = new Messenger(this.f79d);
                    this.f83h = messenger;
                    this.f79d.mo91a(messenger);
                    try {
                        this.f82g.mo154e(this.f76a, this.f83h);
                    } catch (RemoteException unused) {
                    }
                }
                C0153b m0 = C0153b.C0154a.m1001m0(C17195p.m79486a(f, C19565c.f50099s));
                if (m0 != null) {
                    this.f84i = MediaSessionCompat.Token.m633c(C0078a.m312i(this.f77b), m0);
                }
            }
        }

        /* renamed from: c */
        public void mo98c() {
        }

        /* renamed from: d */
        public void mo99d() {
            this.f82g = null;
            this.f83h = null;
            this.f84i = null;
            this.f79d.mo91a((Messenger) null);
        }

        @C0359n0
        /* renamed from: e */
        public MediaSessionCompat.Token mo111e() {
            if (this.f84i == null) {
                this.f84i = MediaSessionCompat.Token.m632b(C0078a.m312i(this.f77b));
            }
            return this.f84i;
        }

        /* renamed from: f */
        public void mo112f() {
            Messenger messenger;
            C0062l lVar = this.f82g;
            if (!(lVar == null || (messenger = this.f83h) == null)) {
                try {
                    lVar.mo159j(messenger);
                } catch (RemoteException unused) {
                }
            }
            C0078a.m308e(this.f77b);
        }

        /* renamed from: g */
        public void mo113g(@C0359n0 String str, Bundle bundle, @C0363p0 C0036c cVar) {
            if (mo110a()) {
                if (this.f82g == null && cVar != null) {
                    this.f79d.post(new C0046f(cVar, str, bundle));
                }
                try {
                    this.f82g.mo157h(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f79d), this.f83h);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error sending a custom action: action=");
                    sb.append(str);
                    sb.append(", extras=");
                    sb.append(bundle);
                    if (cVar != null) {
                        this.f79d.post(new C0047g(cVar, str, bundle));
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with " + "extras " + bundle + " because the browser is not connected to the " + "service.");
            }
        }

        @C0363p0
        public Bundle getExtras() {
            return C0078a.m309f(this.f77b);
        }

        @C0359n0
        public String getRoot() {
            return C0078a.m310g(this.f77b);
        }

        /* renamed from: h */
        public void mo123h(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f83h == messenger) {
                C0063m mVar = this.f80e.get(str);
                if (mVar != null) {
                    C0064n a = mVar.mo160a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo167c(str);
                            return;
                        }
                        this.f85j = bundle2;
                        a.mo165a(str, list);
                        this.f85j = null;
                    } else if (list == null) {
                        a.mo168d(str, bundle);
                    } else {
                        this.f85j = bundle2;
                        a.mo166b(str, list, bundle);
                        this.f85j = null;
                    }
                } else if (MediaBrowserCompat.f49c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for id that isn't subscribed id=");
                    sb.append(str);
                }
            }
        }

        /* renamed from: i */
        public void mo116i() {
            C0078a.m304a(this.f77b);
        }

        /* renamed from: j */
        public void mo117j(@C0359n0 String str, Bundle bundle, @C0359n0 C0061k kVar) {
            if (!mo110a()) {
                throw new IllegalStateException("search() called while not connected");
            } else if (this.f82g == null) {
                this.f79d.post(new C0044d(kVar, str, bundle));
            } else {
                try {
                    this.f82g.mo156g(str, bundle, new SearchResultReceiver(str, bundle, kVar, this.f79d), this.f83h);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error searching items with query: ");
                    sb.append(str);
                    this.f79d.post(new C0045e(kVar, str, bundle));
                }
            }
        }

        /* renamed from: k */
        public void mo124k(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        /* renamed from: l */
        public ComponentName mo118l() {
            return C0078a.m311h(this.f77b);
        }

        /* renamed from: m */
        public void mo119m(@C0359n0 String str, @C0359n0 C0037d dVar) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (dVar == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!C0078a.m313j(this.f77b)) {
                this.f79d.post(new C0041a(dVar, str));
            } else if (this.f82g == null) {
                this.f79d.post(new C0042b(dVar, str));
            } else {
                try {
                    this.f82g.mo153d(str, new ItemReceiver(str, dVar, this.f79d), this.f83h);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error getting media item: ");
                    sb.append(str);
                    this.f79d.post(new C0043c(dVar, str));
                }
            }
        }

        /* renamed from: n */
        public void mo120n(@C0359n0 String str, Bundle bundle, @C0359n0 C0064n nVar) {
            Bundle bundle2;
            C0063m mVar = this.f80e.get(str);
            if (mVar == null) {
                mVar = new C0063m();
                this.f80e.put(str, mVar);
            }
            nVar.mo169e(mVar);
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            mVar.mo164e(bundle2, nVar);
            C0062l lVar = this.f82g;
            if (lVar == null) {
                C0078a.m314k(this.f77b, str, nVar.f156a);
                return;
            }
            try {
                lVar.mo150a(str, nVar.f157b, bundle2, this.f83h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error subscribing media item: ");
                sb.append(str);
            }
        }

        /* renamed from: o */
        public void mo125o(Messenger messenger) {
        }

        /* renamed from: p */
        public void mo121p(@C0359n0 String str, C0064n nVar) {
            C0063m mVar = this.f80e.get(str);
            if (mVar != null) {
                C0062l lVar = this.f82g;
                if (lVar == null) {
                    if (nVar == null) {
                        C0078a.m315l(this.f77b, str);
                    } else {
                        List<C0064n> b = mVar.mo161b();
                        List<Bundle> c = mVar.mo162c();
                        for (int size = b.size() - 1; size >= 0; size--) {
                            if (b.get(size) == nVar) {
                                b.remove(size);
                                c.remove(size);
                            }
                        }
                        if (b.size() == 0) {
                            C0078a.m315l(this.f77b, str);
                        }
                    }
                } else if (nVar == null) {
                    try {
                        lVar.mo155f(str, (IBinder) null, this.f83h);
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("removeSubscription failed with RemoteException parentId=");
                        sb.append(str);
                    }
                } else {
                    List<C0064n> b2 = mVar.mo161b();
                    List<Bundle> c2 = mVar.mo162c();
                    for (int size2 = b2.size() - 1; size2 >= 0; size2--) {
                        if (b2.get(size2) == nVar) {
                            this.f82g.mo155f(str, nVar.f157b, this.f83h);
                            b2.remove(size2);
                            c2.remove(size2);
                        }
                    }
                }
                if (mVar.mo163d() || nVar == null) {
                    this.f80e.remove(str);
                }
            }
        }

        /* renamed from: q */
        public Bundle mo122q() {
            return this.f85j;
        }
    }

    @C0376v0(23)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    public static class C0048g extends C0040f {
        public C0048g(Context context, ComponentName componentName, C0033b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        /* renamed from: m */
        public void mo119m(@C0359n0 String str, @C0359n0 C0037d dVar) {
            if (this.f82g == null) {
                C0084b.m324b(this.f77b, str, dVar.f74a);
            } else {
                super.mo119m(str, dVar);
            }
        }
    }

    @C0376v0(26)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    public static class C0049h extends C0048g {
        public C0049h(Context context, ComponentName componentName, C0033b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        /* renamed from: n */
        public void mo120n(@C0359n0 String str, @C0363p0 Bundle bundle, @C0359n0 C0064n nVar) {
            if (this.f82g != null && this.f81f >= 2) {
                super.mo120n(str, bundle, nVar);
            } else if (bundle == null) {
                C0078a.m314k(this.f77b, str, nVar.f156a);
            } else {
                C0087c.m328b(this.f77b, str, bundle, nVar.f156a);
            }
        }

        /* renamed from: p */
        public void mo121p(@C0359n0 String str, C0064n nVar) {
            if (this.f82g != null && this.f81f >= 2) {
                super.mo121p(str, nVar);
            } else if (nVar == null) {
                C0078a.m315l(this.f77b, str);
            } else {
                C0087c.m329c(this.f77b, str, nVar.f156a);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    public static class C0050i implements C0039e, C0060j {

        /* renamed from: o */
        public static final int f111o = 0;

        /* renamed from: p */
        public static final int f112p = 1;

        /* renamed from: q */
        public static final int f113q = 2;

        /* renamed from: r */
        public static final int f114r = 3;

        /* renamed from: s */
        public static final int f115s = 4;

        /* renamed from: a */
        public final Context f116a;

        /* renamed from: b */
        public final ComponentName f117b;

        /* renamed from: c */
        public final C0033b f118c;

        /* renamed from: d */
        public final Bundle f119d;

        /* renamed from: e */
        public final C0032a f120e = new C0032a(this);

        /* renamed from: f */
        public final C1866a<String, C0063m> f121f = new C1866a<>();

        /* renamed from: g */
        public int f122g = 1;

        /* renamed from: h */
        public C0057g f123h;

        /* renamed from: i */
        public C0062l f124i;

        /* renamed from: j */
        public Messenger f125j;

        /* renamed from: k */
        public String f126k;

        /* renamed from: l */
        public MediaSessionCompat.Token f127l;

        /* renamed from: m */
        public Bundle f128m;

        /* renamed from: n */
        public Bundle f129n;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$a */
        public class C0051a implements Runnable {
            public C0051a() {
            }

            public void run() {
                boolean z;
                C0050i iVar = C0050i.this;
                if (iVar.f122g != 0) {
                    iVar.f122g = 2;
                    if (MediaBrowserCompat.f49c && iVar.f123h != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + C0050i.this.f123h);
                    } else if (iVar.f124i != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + C0050i.this.f124i);
                    } else if (iVar.f125j == null) {
                        Intent intent = new Intent(C19566d.f50115w);
                        intent.setComponent(C0050i.this.f117b);
                        C0050i iVar2 = C0050i.this;
                        iVar2.f123h = new C0057g();
                        try {
                            C0050i iVar3 = C0050i.this;
                            z = iVar3.f116a.bindService(intent, iVar3.f123h, 1);
                        } catch (Exception unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed binding to service ");
                            sb.append(C0050i.this.f117b);
                            z = false;
                        }
                        if (!z) {
                            C0050i.this.mo134c();
                            C0050i.this.f118c.mo94b();
                        }
                        if (MediaBrowserCompat.f49c) {
                            C0050i.this.mo133b();
                        }
                    } else {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + C0050i.this.f125j);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$b */
        public class C0052b implements Runnable {
            public C0052b() {
            }

            public void run() {
                C0050i iVar = C0050i.this;
                Messenger messenger = iVar.f125j;
                if (messenger != null) {
                    try {
                        iVar.f124i.mo152c(messenger);
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("RemoteException during connect for ");
                        sb.append(C0050i.this.f117b);
                    }
                }
                C0050i iVar2 = C0050i.this;
                int i = iVar2.f122g;
                iVar2.mo134c();
                if (i != 0) {
                    C0050i.this.f122g = i;
                }
                if (MediaBrowserCompat.f49c) {
                    C0050i.this.mo133b();
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$c */
        public class C0053c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0037d f132a;

            /* renamed from: b */
            public final /* synthetic */ String f133b;

            public C0053c(C0037d dVar, String str) {
                this.f132a = dVar;
                this.f133b = str;
            }

            public void run() {
                this.f132a.mo106a(this.f133b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$d */
        public class C0054d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0037d f135a;

            /* renamed from: b */
            public final /* synthetic */ String f136b;

            public C0054d(C0037d dVar, String str) {
                this.f135a = dVar;
                this.f136b = str;
            }

            public void run() {
                this.f135a.mo106a(this.f136b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$e */
        public class C0055e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0061k f138a;

            /* renamed from: b */
            public final /* synthetic */ String f139b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f140c;

            public C0055e(C0061k kVar, String str, Bundle bundle) {
                this.f138a = kVar;
                this.f139b = str;
                this.f140c = bundle;
            }

            public void run() {
                this.f138a.mo148a(this.f139b, this.f140c);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$f */
        public class C0056f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0036c f142a;

            /* renamed from: b */
            public final /* synthetic */ String f143b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f144c;

            public C0056f(C0036c cVar, String str, Bundle bundle) {
                this.f142a = cVar;
                this.f143b = str;
                this.f144c = bundle;
            }

            public void run() {
                this.f142a.mo103a(this.f143b, this.f144c, (Bundle) null);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$g */
        public class C0057g implements ServiceConnection {

            /* renamed from: android.support.v4.media.MediaBrowserCompat$i$g$a */
            public class C0058a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ ComponentName f147a;

                /* renamed from: b */
                public final /* synthetic */ IBinder f148b;

                public C0058a(ComponentName componentName, IBinder iBinder) {
                    this.f147a = componentName;
                    this.f148b = iBinder;
                }

                public void run() {
                    boolean z = MediaBrowserCompat.f49c;
                    if (z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MediaServiceConnection.onServiceConnected name=");
                        sb.append(this.f147a);
                        sb.append(" binder=");
                        sb.append(this.f148b);
                        C0050i.this.mo133b();
                    }
                    if (C0057g.this.mo142a("onServiceConnected")) {
                        C0050i iVar = C0050i.this;
                        iVar.f124i = new C0062l(this.f148b, iVar.f119d);
                        C0050i.this.f125j = new Messenger(C0050i.this.f120e);
                        C0050i iVar2 = C0050i.this;
                        iVar2.f120e.mo91a(iVar2.f125j);
                        C0050i.this.f122g = 2;
                        if (z) {
                            try {
                                C0050i.this.mo133b();
                            } catch (RemoteException unused) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("RemoteException during connect for ");
                                sb2.append(C0050i.this.f117b);
                                if (MediaBrowserCompat.f49c) {
                                    C0050i.this.mo133b();
                                    return;
                                }
                                return;
                            }
                        }
                        C0050i iVar3 = C0050i.this;
                        iVar3.f124i.mo151b(iVar3.f116a, iVar3.f125j);
                    }
                }
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$i$g$b */
            public class C0059b implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ ComponentName f150a;

                public C0059b(ComponentName componentName) {
                    this.f150a = componentName;
                }

                public void run() {
                    if (MediaBrowserCompat.f49c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MediaServiceConnection.onServiceDisconnected name=");
                        sb.append(this.f150a);
                        sb.append(" this=");
                        sb.append(this);
                        sb.append(" mServiceConnection=");
                        sb.append(C0050i.this.f123h);
                        C0050i.this.mo133b();
                    }
                    if (C0057g.this.mo142a("onServiceDisconnected")) {
                        C0050i iVar = C0050i.this;
                        iVar.f124i = null;
                        iVar.f125j = null;
                        iVar.f120e.mo91a((Messenger) null);
                        C0050i iVar2 = C0050i.this;
                        iVar2.f122g = 4;
                        iVar2.f118c.mo95c();
                    }
                }
            }

            public C0057g() {
            }

            /* renamed from: a */
            public boolean mo142a(String str) {
                int i;
                C0050i iVar = C0050i.this;
                if (iVar.f123h == this && (i = iVar.f122g) != 0 && i != 1) {
                    return true;
                }
                int i2 = iVar.f122g;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" for ");
                sb.append(C0050i.this.f117b);
                sb.append(" with mServiceConnection=");
                sb.append(C0050i.this.f123h);
                sb.append(" this=");
                sb.append(this);
                return false;
            }

            /* renamed from: b */
            public final void mo143b(Runnable runnable) {
                if (Thread.currentThread() == C0050i.this.f120e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0050i.this.f120e.post(runnable);
                }
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                mo143b(new C0058a(componentName, iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                mo143b(new C0059b(componentName));
            }
        }

        public C0050i(Context context, ComponentName componentName, C0033b bVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f116a = context;
                this.f117b = componentName;
                this.f118c = bVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f119d = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        /* renamed from: d */
        public static String m197d(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i;
        }

        /* renamed from: a */
        public boolean mo110a() {
            return this.f122g == 3;
        }

        /* renamed from: b */
        public void mo133b() {
            StringBuilder sb = new StringBuilder();
            sb.append("  mServiceComponent=");
            sb.append(this.f117b);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  mCallback=");
            sb2.append(this.f118c);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  mRootHints=");
            sb3.append(this.f119d);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("  mState=");
            sb4.append(m197d(this.f122g));
            StringBuilder sb5 = new StringBuilder();
            sb5.append("  mServiceConnection=");
            sb5.append(this.f123h);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("  mServiceBinderWrapper=");
            sb6.append(this.f124i);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("  mCallbacksMessenger=");
            sb7.append(this.f125j);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("  mRootId=");
            sb8.append(this.f126k);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("  mMediaSessionToken=");
            sb9.append(this.f127l);
        }

        /* renamed from: c */
        public void mo134c() {
            C0057g gVar = this.f123h;
            if (gVar != null) {
                this.f116a.unbindService(gVar);
            }
            this.f122g = 1;
            this.f123h = null;
            this.f124i = null;
            this.f125j = null;
            this.f120e.mo91a((Messenger) null);
            this.f126k = null;
            this.f127l = null;
        }

        @C0359n0
        /* renamed from: e */
        public MediaSessionCompat.Token mo111e() {
            if (mo110a()) {
                return this.f127l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f122g + ")");
        }

        /* renamed from: f */
        public void mo112f() {
            this.f122g = 0;
            this.f120e.post(new C0052b());
        }

        /* renamed from: g */
        public void mo113g(@C0359n0 String str, Bundle bundle, @C0363p0 C0036c cVar) {
            if (mo110a()) {
                try {
                    this.f124i.mo157h(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f120e), this.f125j);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error sending a custom action: action=");
                    sb.append(str);
                    sb.append(", extras=");
                    sb.append(bundle);
                    if (cVar != null) {
                        this.f120e.post(new C0056f(cVar, str, bundle));
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with " + "extras " + bundle + " because the browser is not connected to the " + "service.");
            }
        }

        @C0363p0
        public Bundle getExtras() {
            if (mo110a()) {
                return this.f128m;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + m197d(this.f122g) + ")");
        }

        @C0359n0
        public String getRoot() {
            if (mo110a()) {
                return this.f126k;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + m197d(this.f122g) + ")");
        }

        /* renamed from: h */
        public void mo123h(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (mo135r(messenger, "onLoadChildren")) {
                boolean z = MediaBrowserCompat.f49c;
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for ");
                    sb.append(this.f117b);
                    sb.append(" id=");
                    sb.append(str);
                }
                C0063m mVar = this.f121f.get(str);
                if (mVar != null) {
                    C0064n a = mVar.mo160a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo167c(str);
                            return;
                        }
                        this.f129n = bundle2;
                        a.mo165a(str, list);
                        this.f129n = null;
                    } else if (list == null) {
                        a.mo168d(str, bundle);
                    } else {
                        this.f129n = bundle2;
                        a.mo166b(str, list, bundle);
                        this.f129n = null;
                    }
                } else if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onLoadChildren for id that isn't subscribed id=");
                    sb2.append(str);
                }
            }
        }

        /* renamed from: i */
        public void mo116i() {
            int i = this.f122g;
            if (i == 0 || i == 1) {
                this.f122g = 2;
                this.f120e.post(new C0051a());
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + m197d(this.f122g) + ")");
        }

        /* renamed from: j */
        public void mo117j(@C0359n0 String str, Bundle bundle, @C0359n0 C0061k kVar) {
            if (mo110a()) {
                try {
                    this.f124i.mo156g(str, bundle, new SearchResultReceiver(str, bundle, kVar, this.f120e), this.f125j);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error searching items with query: ");
                    sb.append(str);
                    this.f120e.post(new C0055e(kVar, str, bundle));
                }
            } else {
                throw new IllegalStateException("search() called while not connected (state=" + m197d(this.f122g) + ")");
            }
        }

        /* renamed from: k */
        public void mo124k(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (mo135r(messenger, "onConnect")) {
                if (this.f122g != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onConnect from service while mState=");
                    sb.append(m197d(this.f122g));
                    sb.append("... ignoring");
                    return;
                }
                this.f126k = str;
                this.f127l = token;
                this.f128m = bundle;
                this.f122g = 3;
                if (MediaBrowserCompat.f49c) {
                    mo133b();
                }
                this.f118c.mo93a();
                try {
                    for (Map.Entry next : this.f121f.entrySet()) {
                        String str2 = (String) next.getKey();
                        C0063m mVar = (C0063m) next.getValue();
                        List<C0064n> b = mVar.mo161b();
                        List<Bundle> c = mVar.mo162c();
                        for (int i = 0; i < b.size(); i++) {
                            this.f124i.mo150a(str2, b.get(i).f157b, c.get(i), this.f125j);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        @C0359n0
        /* renamed from: l */
        public ComponentName mo118l() {
            if (mo110a()) {
                return this.f117b;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.f122g + ")");
        }

        /* renamed from: m */
        public void mo119m(@C0359n0 String str, @C0359n0 C0037d dVar) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (dVar == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!mo110a()) {
                this.f120e.post(new C0053c(dVar, str));
            } else {
                try {
                    this.f124i.mo153d(str, new ItemReceiver(str, dVar, this.f120e), this.f125j);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Remote error getting media item: ");
                    sb.append(str);
                    this.f120e.post(new C0054d(dVar, str));
                }
            }
        }

        /* renamed from: n */
        public void mo120n(@C0359n0 String str, Bundle bundle, @C0359n0 C0064n nVar) {
            Bundle bundle2;
            C0063m mVar = this.f121f.get(str);
            if (mVar == null) {
                mVar = new C0063m();
                this.f121f.put(str, mVar);
            }
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            mVar.mo164e(bundle2, nVar);
            if (mo110a()) {
                try {
                    this.f124i.mo150a(str, nVar.f157b, bundle2, this.f125j);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("addSubscription failed with RemoteException parentId=");
                    sb.append(str);
                }
            }
        }

        /* renamed from: o */
        public void mo125o(Messenger messenger) {
            StringBuilder sb = new StringBuilder();
            sb.append("onConnectFailed for ");
            sb.append(this.f117b);
            if (mo135r(messenger, "onConnectFailed")) {
                if (this.f122g != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onConnect from service while mState=");
                    sb2.append(m197d(this.f122g));
                    sb2.append("... ignoring");
                    return;
                }
                mo134c();
                this.f118c.mo94b();
            }
        }

        /* renamed from: p */
        public void mo121p(@C0359n0 String str, C0064n nVar) {
            C0063m mVar = this.f121f.get(str);
            if (mVar != null) {
                if (nVar == null) {
                    try {
                        if (mo110a()) {
                            this.f124i.mo155f(str, (IBinder) null, this.f125j);
                        }
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("removeSubscription failed with RemoteException parentId=");
                        sb.append(str);
                    }
                } else {
                    List<C0064n> b = mVar.mo161b();
                    List<Bundle> c = mVar.mo162c();
                    for (int size = b.size() - 1; size >= 0; size--) {
                        if (b.get(size) == nVar) {
                            if (mo110a()) {
                                this.f124i.mo155f(str, nVar.f157b, this.f125j);
                            }
                            b.remove(size);
                            c.remove(size);
                        }
                    }
                }
                if (mVar.mo163d() || nVar == null) {
                    this.f121f.remove(str);
                }
            }
        }

        /* renamed from: q */
        public Bundle mo122q() {
            return this.f129n;
        }

        /* renamed from: r */
        public final boolean mo135r(Messenger messenger, String str) {
            int i;
            if (this.f125j == messenger && (i = this.f122g) != 0 && i != 1) {
                return true;
            }
            int i2 = this.f122g;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" for ");
            sb.append(this.f117b);
            sb.append(" with mCallbacksMessenger=");
            sb.append(this.f125j);
            sb.append(" this=");
            sb.append(this);
            return false;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    public interface C0060j {
        /* renamed from: h */
        void mo123h(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        /* renamed from: k */
        void mo124k(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: o */
        void mo125o(Messenger messenger);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0061k {
        /* renamed from: a */
        public void mo148a(@C0359n0 String str, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo149b(@C0359n0 String str, Bundle bundle, @C0359n0 List<MediaItem> list) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    public static class C0062l {

        /* renamed from: a */
        public Messenger f152a;

        /* renamed from: b */
        public Bundle f153b;

        public C0062l(IBinder iBinder, Bundle bundle) {
            this.f152a = new Messenger(iBinder);
            this.f153b = bundle;
        }

        /* renamed from: a */
        public void mo150a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C19565c.f50084d, str);
            C17195p.m79487b(bundle2, C19565c.f50081a, iBinder);
            bundle2.putBundle(C19565c.f50087g, bundle);
            mo158i(3, bundle2, messenger);
        }

        /* renamed from: b */
        public void mo151b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C19565c.f50089i, context.getPackageName());
            bundle.putBundle(C19565c.f50091k, this.f153b);
            mo158i(1, bundle, messenger);
        }

        /* renamed from: c */
        public void mo152c(Messenger messenger) throws RemoteException {
            mo158i(2, (Bundle) null, messenger);
        }

        /* renamed from: d */
        public void mo153d(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C19565c.f50084d, str);
            bundle.putParcelable(C19565c.f50090j, resultReceiver);
            mo158i(5, bundle, messenger);
        }

        /* renamed from: e */
        public void mo154e(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C19565c.f50089i, context.getPackageName());
            bundle.putBundle(C19565c.f50091k, this.f153b);
            mo158i(6, bundle, messenger);
        }

        /* renamed from: f */
        public void mo155f(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C19565c.f50084d, str);
            C17195p.m79487b(bundle, C19565c.f50081a, iBinder);
            mo158i(4, bundle, messenger);
        }

        /* renamed from: g */
        public void mo156g(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C19565c.f50093m, str);
            bundle2.putBundle(C19565c.f50092l, bundle);
            bundle2.putParcelable(C19565c.f50090j, resultReceiver);
            mo158i(8, bundle2, messenger);
        }

        /* renamed from: h */
        public void mo157h(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C19565c.f50094n, str);
            bundle2.putBundle(C19565c.f50095o, bundle);
            bundle2.putParcelable(C19565c.f50090j, resultReceiver);
            mo158i(9, bundle2, messenger);
        }

        /* renamed from: i */
        public final void mo158i(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f152a.send(obtain);
        }

        /* renamed from: j */
        public void mo159j(Messenger messenger) throws RemoteException {
            mo158i(7, (Bundle) null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$m */
    public static class C0063m {

        /* renamed from: a */
        public final List<C0064n> f154a = new ArrayList();

        /* renamed from: b */
        public final List<Bundle> f155b = new ArrayList();

        /* renamed from: a */
        public C0064n mo160a(Bundle bundle) {
            for (int i = 0; i < this.f155b.size(); i++) {
                if (C19564b.m91104a(this.f155b.get(i), bundle)) {
                    return this.f154a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List<C0064n> mo161b() {
            return this.f154a;
        }

        /* renamed from: c */
        public List<Bundle> mo162c() {
            return this.f155b;
        }

        /* renamed from: d */
        public boolean mo163d() {
            return this.f154a.isEmpty();
        }

        /* renamed from: e */
        public void mo164e(Bundle bundle, C0064n nVar) {
            for (int i = 0; i < this.f155b.size(); i++) {
                if (C19564b.m91104a(this.f155b.get(i), bundle)) {
                    this.f154a.set(i, nVar);
                    return;
                }
            }
            this.f154a.add(nVar);
            this.f155b.add(bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class C0064n {

        /* renamed from: a */
        public final Object f156a;

        /* renamed from: b */
        public final IBinder f157b = new Binder();

        /* renamed from: c */
        public WeakReference<C0063m> f158c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        public class C0065a implements C0078a.C0082d {
            public C0065a() {
            }

            /* renamed from: a */
            public void mo170a(@C0359n0 String str) {
                C0064n.this.mo167c(str);
            }

            /* renamed from: d */
            public void mo171d(@C0359n0 String str, List<?> list) {
                C0063m mVar;
                WeakReference<C0063m> weakReference = C0064n.this.f158c;
                if (weakReference == null) {
                    mVar = null;
                } else {
                    mVar = weakReference.get();
                }
                if (mVar == null) {
                    C0064n.this.mo165a(str, MediaItem.m139b(list));
                    return;
                }
                List<MediaItem> b = MediaItem.m139b(list);
                List<C0064n> b2 = mVar.mo161b();
                List<Bundle> c = mVar.mo162c();
                for (int i = 0; i < b2.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        C0064n.this.mo165a(str, b);
                    } else {
                        C0064n.this.mo166b(str, mo172e(b, bundle), bundle);
                    }
                }
            }

            /* renamed from: e */
            public List<MediaItem> mo172e(List<MediaItem> list, Bundle bundle) {
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
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        public class C0066b extends C0065a implements C0087c.C0088a {
            public C0066b() {
                super();
            }

            /* renamed from: b */
            public void mo173b(@C0359n0 String str, @C0359n0 Bundle bundle) {
                C0064n.this.mo168d(str, bundle);
            }

            /* renamed from: c */
            public void mo174c(@C0359n0 String str, List<?> list, @C0359n0 Bundle bundle) {
                C0064n.this.mo166b(str, MediaItem.m139b(list), bundle);
            }
        }

        public C0064n() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f156a = C0087c.m327a(new C0066b());
            } else {
                this.f156a = C0078a.m307d(new C0065a());
            }
        }

        /* renamed from: a */
        public void mo165a(@C0359n0 String str, @C0359n0 List<MediaItem> list) {
        }

        /* renamed from: b */
        public void mo166b(@C0359n0 String str, @C0359n0 List<MediaItem> list, @C0359n0 Bundle bundle) {
        }

        /* renamed from: c */
        public void mo167c(@C0359n0 String str) {
        }

        /* renamed from: d */
        public void mo168d(@C0359n0 String str, @C0359n0 Bundle bundle) {
        }

        /* renamed from: e */
        public void mo169e(C0063m mVar) {
            this.f158c = new WeakReference<>(mVar);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0033b bVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f56a = new C0049h(context, componentName, bVar, bundle);
        } else {
            this.f56a = new C0048g(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: a */
    public void mo63a() {
        this.f56a.mo116i();
    }

    /* renamed from: b */
    public void mo64b() {
        this.f56a.mo112f();
    }

    @C0363p0
    /* renamed from: c */
    public Bundle mo65c() {
        return this.f56a.getExtras();
    }

    /* renamed from: d */
    public void mo66d(@C0359n0 String str, @C0359n0 C0037d dVar) {
        this.f56a.mo119m(str, dVar);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.f842a})
    /* renamed from: e */
    public Bundle mo67e() {
        return this.f56a.mo122q();
    }

    @C0359n0
    /* renamed from: f */
    public String mo68f() {
        return this.f56a.getRoot();
    }

    @C0359n0
    /* renamed from: g */
    public ComponentName mo69g() {
        return this.f56a.mo118l();
    }

    @C0359n0
    /* renamed from: h */
    public MediaSessionCompat.Token mo70h() {
        return this.f56a.mo111e();
    }

    /* renamed from: i */
    public boolean mo71i() {
        return this.f56a.mo110a();
    }

    /* renamed from: j */
    public void mo72j(@C0359n0 String str, Bundle bundle, @C0359n0 C0061k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        } else if (kVar != null) {
            this.f56a.mo117j(str, bundle, kVar);
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    /* renamed from: k */
    public void mo73k(@C0359n0 String str, Bundle bundle, @C0363p0 C0036c cVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f56a.mo113g(str, bundle, cVar);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }

    /* renamed from: l */
    public void mo74l(@C0359n0 String str, @C0359n0 Bundle bundle, @C0359n0 C0064n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar == null) {
            throw new IllegalArgumentException("callback is null");
        } else if (bundle != null) {
            this.f56a.mo120n(str, bundle, nVar);
        } else {
            throw new IllegalArgumentException("options are null");
        }
    }

    /* renamed from: m */
    public void mo75m(@C0359n0 String str, @C0359n0 C0064n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar != null) {
            this.f56a.mo120n(str, (Bundle) null, nVar);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    /* renamed from: n */
    public void mo76n(@C0359n0 String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f56a.mo121p(str, (C0064n) null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    /* renamed from: o */
    public void mo77o(@C0359n0 String str, @C0359n0 C0064n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar != null) {
            this.f56a.mo121p(str, nVar);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0030a();

        /* renamed from: c */
        public static final int f62c = 1;

        /* renamed from: d */
        public static final int f63d = 2;

        /* renamed from: a */
        public final int f64a;

        /* renamed from: b */
        public final MediaDescriptionCompat f65b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        public static class C0030a implements Parcelable.Creator<MediaItem> {
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        @RestrictTo({RestrictTo.Scope.f843b})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$b */
        public @interface C0031b {
        }

        public MediaItem(@C0359n0 MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.mo181g())) {
                this.f64a = i;
                this.f65b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static MediaItem m138a(Object obj) {
            if (obj == null) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.m247a(C0078a.C0081c.m319a(obj)), C0078a.C0081c.m320b(obj));
        }

        /* renamed from: b */
        public static List<MediaItem> m139b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m138a(a));
            }
            return arrayList;
        }

        @C0359n0
        /* renamed from: c */
        public MediaDescriptionCompat mo79c() {
            return this.f65b;
        }

        /* renamed from: d */
        public int mo80d() {
            return this.f64a;
        }

        public int describeContents() {
            return 0;
        }

        @C0363p0
        /* renamed from: e */
        public String mo82e() {
            return this.f65b.mo181g();
        }

        /* renamed from: f */
        public boolean mo83f() {
            return (this.f64a & 1) != 0;
        }

        /* renamed from: g */
        public boolean mo84g() {
            return (this.f64a & 2) != 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f64a + ", mDescription=" + this.f65b + C12361b.f30259j;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f64a);
            this.f65b.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.f64a = parcel.readInt();
            this.f65b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
