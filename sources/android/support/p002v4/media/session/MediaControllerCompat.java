package android.support.p002v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p002v4.media.MediaDescriptionCompat;
import android.support.p002v4.media.MediaMetadataCompat;
import android.support.p002v4.media.RatingCompat;
import android.support.p002v4.media.session.C0150a;
import android.support.p002v4.media.session.C0153b;
import android.support.p002v4.media.session.C0156c;
import android.support.p002v4.media.session.C0161d;
import android.support.p002v4.media.session.C0163e;
import android.support.p002v4.media.session.MediaSessionCompat;
import android.support.p002v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17195p;
import androidx.core.app.C17204q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: d */
    public static final String f253d = "MediaControllerCompat";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: e */
    public static final String f254e = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: f */
    public static final String f255f = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: g */
    public static final String f256g = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: h */
    public static final String f257h = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: i */
    public static final String f258i = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: j */
    public static final String f259j = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: k */
    public static final String f260k = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    /* renamed from: a */
    public final C0103c f261a;

    /* renamed from: b */
    public final MediaSessionCompat.Token f262b;

    /* renamed from: c */
    public final HashSet<C0098a> f263c = new HashSet<>();

    @C0376v0(21)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    public static class MediaControllerImplApi21 implements C0103c {

        /* renamed from: a */
        public final Object f264a;

        /* renamed from: b */
        public final Object f265b = new Object();
        @C0323b0("mLock")

        /* renamed from: c */
        public final List<C0098a> f266c = new ArrayList();

        /* renamed from: d */
        public HashMap<C0098a, C0097a> f267d = new HashMap<>();

        /* renamed from: e */
        public final MediaSessionCompat.Token f268e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            public WeakReference<MediaControllerImplApi21> f269a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f269a = new WeakReference<>(mediaControllerImplApi21);
            }

            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f269a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f265b) {
                        mediaControllerImplApi21.f268e.mo420g(C0153b.C0154a.m1001m0(C17195p.m79486a(bundle, MediaSessionCompat.f310I)));
                        mediaControllerImplApi21.f268e.mo421h(bundle.getBundle(MediaSessionCompat.f311J));
                        mediaControllerImplApi21.mo298m();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        public static class C0097a extends C0098a.C0101c {
            public C0097a(C0098a aVar) {
                super(aVar);
            }

            /* renamed from: C0 */
            public void mo304C0(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: Y */
            public void mo305Y(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: Y4 */
            public void mo306Y4(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: d0 */
            public void mo307d0() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: m3 */
            public void mo308m3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: s0 */
            public void mo309s0(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.f268e = token;
            Object d = C0156c.m1049d(context, token.mo419f());
            this.f264a = d;
            if (d == null) {
                throw new RemoteException();
            } else if (token.mo415d() == null) {
                mo299n();
            }
        }

        /* renamed from: C */
        public long mo276C() {
            return C0156c.m1051f(this.f264a);
        }

        /* renamed from: L0 */
        public List<MediaSessionCompat.QueueItem> mo277L0() {
            List<Object> l = C0156c.m1057l(this.f264a);
            if (l != null) {
                return MediaSessionCompat.QueueItem.m623b(l);
            }
            return null;
        }

        /* renamed from: P0 */
        public int mo278P0() {
            if (this.f268e.mo415d() == null) {
                return -1;
            }
            try {
                return this.f268e.mo415d().mo528P0();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        /* renamed from: Q */
        public PlaybackStateCompat mo279Q() {
            if (this.f268e.mo415d() != null) {
                try {
                    return this.f268e.mo415d().mo529Q();
                } catch (RemoteException unused) {
                }
            }
            Object k = C0156c.m1056k(this.f264a);
            if (k != null) {
                return PlaybackStateCompat.m892a(k);
            }
            return null;
        }

        /* renamed from: W */
        public int mo280W() {
            return C0156c.m1059n(this.f264a);
        }

        /* renamed from: a */
        public C0107g mo281a() {
            Object j = C0156c.m1055j(this.f264a);
            if (j != null) {
                return new C0107g(C0156c.C0159c.m1080e(j), C0156c.C0159c.m1078c(j), C0156c.C0159c.m1081f(j), C0156c.C0159c.m1079d(j), C0156c.C0159c.m1077b(j));
            }
            return null;
        }

        /* renamed from: b */
        public final void mo282b(C0098a aVar) {
            C0156c.m1067v(this.f264a, aVar.f270a);
            synchronized (this.f265b) {
                if (this.f268e.mo415d() != null) {
                    try {
                        C0097a remove = this.f267d.remove(aVar);
                        if (remove != null) {
                            aVar.f272c = null;
                            this.f268e.mo415d().mo558r6(remove);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.f266c.remove(aVar);
                }
            }
        }

        /* renamed from: c */
        public void mo283c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if ((mo276C() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f259j, mediaDescriptionCompat);
                bundle.putInt(MediaControllerCompat.f260k, i);
                mo284d(MediaControllerCompat.f256g, bundle, (ResultReceiver) null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        /* renamed from: d */
        public void mo284d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            C0156c.m1064s(this.f264a, str, bundle, resultReceiver);
        }

        /* renamed from: e */
        public PendingIntent mo285e() {
            return C0156c.m1060o(this.f264a);
        }

        /* renamed from: f */
        public C0108h mo286f() {
            Object q = C0156c.m1062q(this.f264a);
            if (q != null) {
                return new C0109i(q);
            }
            return null;
        }

        /* renamed from: g */
        public void mo287g(int i, int i2) {
            C0156c.m1046a(this.f264a, i, i2);
        }

        public Bundle getExtras() {
            return C0156c.m1050e(this.f264a);
        }

        public MediaMetadataCompat getMetadata() {
            Object h = C0156c.m1053h(this.f264a);
            if (h != null) {
                return MediaMetadataCompat.m268b(h);
            }
            return null;
        }

        public String getPackageName() {
            return C0156c.m1054i(this.f264a);
        }

        /* renamed from: h */
        public boolean mo291h(KeyEvent keyEvent) {
            return C0156c.m1048c(this.f264a, keyEvent);
        }

        /* renamed from: h0 */
        public int mo292h0() {
            if (this.f268e.mo415d() == null) {
                return -1;
            }
            try {
                return this.f268e.mo415d().mo542h0();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        /* renamed from: i */
        public void mo293i(int i, int i2) {
            C0156c.m1066u(this.f264a, i, i2);
        }

        /* renamed from: i0 */
        public boolean mo294i0() {
            if (this.f268e.mo415d() == null) {
                return false;
            }
            try {
                return this.f268e.mo415d().mo543i0();
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* renamed from: j */
        public boolean mo295j() {
            return this.f268e.mo415d() != null;
        }

        /* renamed from: k */
        public Object mo296k() {
            return this.f264a;
        }

        /* renamed from: l */
        public final void mo297l(C0098a aVar, Handler handler) {
            C0156c.m1063r(this.f264a, aVar.f270a, handler);
            synchronized (this.f265b) {
                if (this.f268e.mo415d() != null) {
                    C0097a aVar2 = new C0097a(aVar);
                    this.f267d.put(aVar, aVar2);
                    aVar.f272c = aVar2;
                    try {
                        this.f268e.mo415d().mo534b5(aVar2);
                        aVar.mo324n(13, (Object) null, (Bundle) null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    aVar.f272c = null;
                    this.f266c.add(aVar);
                }
            }
        }

        @C0323b0("mLock")
        /* renamed from: m */
        public void mo298m() {
            if (this.f268e.mo415d() != null) {
                for (C0098a next : this.f266c) {
                    C0097a aVar = new C0097a(next);
                    this.f267d.put(next, aVar);
                    next.f272c = aVar;
                    try {
                        this.f268e.mo415d().mo534b5(aVar);
                        next.mo324n(13, (Object) null, (Bundle) null);
                    } catch (RemoteException unused) {
                    }
                }
                this.f266c.clear();
            }
        }

        /* renamed from: n */
        public final void mo299n() {
            mo284d(MediaControllerCompat.f254e, (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: o0 */
        public void mo300o0(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((mo276C() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f259j, mediaDescriptionCompat);
                mo284d(MediaControllerCompat.f257h, bundle, (ResultReceiver) null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        /* renamed from: p0 */
        public void mo301p0(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((mo276C() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f259j, mediaDescriptionCompat);
                mo284d(MediaControllerCompat.f255f, bundle, (ResultReceiver) null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        /* renamed from: w0 */
        public CharSequence mo302w0() {
            return C0156c.m1058m(this.f264a);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0098a implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final Object f270a = C0156c.m1047b(new C0100b(this));

        /* renamed from: b */
        public C0099a f271b;

        /* renamed from: c */
        public C0150a f272c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        public class C0099a extends Handler {

            /* renamed from: c */
            public static final int f273c = 1;

            /* renamed from: d */
            public static final int f274d = 2;

            /* renamed from: e */
            public static final int f275e = 3;

            /* renamed from: f */
            public static final int f276f = 4;

            /* renamed from: g */
            public static final int f277g = 5;

            /* renamed from: h */
            public static final int f278h = 6;

            /* renamed from: i */
            public static final int f279i = 7;

            /* renamed from: j */
            public static final int f280j = 8;

            /* renamed from: k */
            public static final int f281k = 9;

            /* renamed from: l */
            public static final int f282l = 11;

            /* renamed from: m */
            public static final int f283m = 12;

            /* renamed from: n */
            public static final int f284n = 13;

            /* renamed from: a */
            public boolean f285a = false;

            public C0099a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.f285a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m591b(data);
                            C0098a.this.mo321k((String) message.obj, data);
                            return;
                        case 2:
                            C0098a.this.mo316f((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            C0098a.this.mo315e((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            C0098a.this.mo311b((C0107g) message.obj);
                            return;
                        case 5:
                            C0098a.this.mo317g((List) message.obj);
                            return;
                        case 6:
                            C0098a.this.mo318h((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m591b(bundle);
                            C0098a.this.mo314d(bundle);
                            return;
                        case 8:
                            C0098a.this.mo320j();
                            return;
                        case 9:
                            C0098a.this.mo319i(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            C0098a.this.mo313c(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            C0098a.this.mo323m(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            C0098a.this.mo322l();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        public static class C0100b implements C0156c.C0157a {

            /* renamed from: a */
            public final WeakReference<C0098a> f287a;

            public C0100b(C0098a aVar) {
                this.f287a = new WeakReference<>(aVar);
            }

            /* renamed from: C0 */
            public void mo327C0(CharSequence charSequence) {
                C0098a aVar = this.f287a.get();
                if (aVar != null) {
                    aVar.mo318h(charSequence);
                }
            }

            /* renamed from: Y */
            public void mo328Y(List<?> list) {
                C0098a aVar = this.f287a.get();
                if (aVar != null) {
                    aVar.mo317g(MediaSessionCompat.QueueItem.m623b(list));
                }
            }

            /* renamed from: a */
            public void mo329a(Object obj) {
                C0098a aVar = this.f287a.get();
                if (aVar != null) {
                    aVar.mo315e(MediaMetadataCompat.m268b(obj));
                }
            }

            /* renamed from: b */
            public void mo330b(Object obj) {
                C0098a aVar = this.f287a.get();
                if (aVar != null && aVar.f272c == null) {
                    aVar.mo316f(PlaybackStateCompat.m892a(obj));
                }
            }

            /* renamed from: c */
            public void mo331c(String str, Bundle bundle) {
                C0098a aVar = this.f287a.get();
                if (aVar != null) {
                    C0150a aVar2 = aVar.f272c;
                    aVar.mo321k(str, bundle);
                }
            }

            /* renamed from: d */
            public void mo332d(int i, int i2, int i3, int i4, int i5) {
                C0098a aVar = this.f287a.get();
                if (aVar != null) {
                    aVar.mo311b(new C0107g(i, i2, i3, i4, i5));
                }
            }

            /* renamed from: d0 */
            public void mo333d0() {
                C0098a aVar = this.f287a.get();
                if (aVar != null) {
                    aVar.mo320j();
                }
            }

            /* renamed from: s0 */
            public void mo334s0(Bundle bundle) {
                C0098a aVar = this.f287a.get();
                if (aVar != null) {
                    aVar.mo314d(bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        public static class C0101c extends C0150a.C0151a {

            /* renamed from: B */
            public final WeakReference<C0098a> f288B;

            public C0101c(C0098a aVar) {
                this.f288B = new WeakReference<>(aVar);
            }

            /* renamed from: A8 */
            public void mo335A8(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    aVar.mo324n(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: C0 */
            public void mo304C0(CharSequence charSequence) throws RemoteException {
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    aVar.mo324n(6, charSequence, (Bundle) null);
                }
            }

            /* renamed from: D7 */
            public void mo336D7(int i) throws RemoteException {
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    aVar.mo324n(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: J6 */
            public void mo337J6(boolean z) throws RemoteException {
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    aVar.mo324n(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            /* renamed from: P1 */
            public void mo338P1() throws RemoteException {
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    aVar.mo324n(13, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: U0 */
            public void mo339U0(String str, Bundle bundle) throws RemoteException {
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    aVar.mo324n(1, str, bundle);
                }
            }

            /* renamed from: U3 */
            public void mo340U3(int i) throws RemoteException {
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    aVar.mo324n(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: Y */
            public void mo305Y(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    aVar.mo324n(5, list, (Bundle) null);
                }
            }

            /* renamed from: Y4 */
            public void mo306Y4(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0107g gVar;
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    if (parcelableVolumeInfo != null) {
                        gVar = new C0107g(parcelableVolumeInfo.f451a, parcelableVolumeInfo.f452b, parcelableVolumeInfo.f453c, parcelableVolumeInfo.f454d, parcelableVolumeInfo.f455e);
                    } else {
                        gVar = null;
                    }
                    aVar.mo324n(4, gVar, (Bundle) null);
                }
            }

            /* renamed from: d0 */
            public void mo307d0() throws RemoteException {
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    aVar.mo324n(8, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: d7 */
            public void mo341d7(boolean z) throws RemoteException {
            }

            /* renamed from: m3 */
            public void mo308m3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    aVar.mo324n(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            /* renamed from: s0 */
            public void mo309s0(Bundle bundle) throws RemoteException {
                C0098a aVar = this.f288B.get();
                if (aVar != null) {
                    aVar.mo324n(7, bundle, (Bundle) null);
                }
            }
        }

        @RestrictTo({RestrictTo.Scope.f842a})
        /* renamed from: a */
        public C0150a mo310a() {
            return this.f272c;
        }

        /* renamed from: b */
        public void mo311b(C0107g gVar) {
        }

        public void binderDied() {
            mo324n(8, (Object) null, (Bundle) null);
        }

        /* renamed from: c */
        public void mo313c(boolean z) {
        }

        /* renamed from: d */
        public void mo314d(Bundle bundle) {
        }

        /* renamed from: e */
        public void mo315e(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: f */
        public void mo316f(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: g */
        public void mo317g(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: h */
        public void mo318h(CharSequence charSequence) {
        }

        /* renamed from: i */
        public void mo319i(int i) {
        }

        /* renamed from: j */
        public void mo320j() {
        }

        /* renamed from: k */
        public void mo321k(String str, Bundle bundle) {
        }

        /* renamed from: l */
        public void mo322l() {
        }

        /* renamed from: m */
        public void mo323m(int i) {
        }

        /* renamed from: n */
        public void mo324n(int i, Object obj, Bundle bundle) {
            C0099a aVar = this.f271b;
            if (aVar != null) {
                Message obtainMessage = aVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* renamed from: o */
        public void mo325o(Handler handler) {
            if (handler == null) {
                C0099a aVar = this.f271b;
                if (aVar != null) {
                    aVar.f285a = false;
                    aVar.removeCallbacksAndMessages((Object) null);
                    this.f271b = null;
                    return;
                }
                return;
            }
            C0099a aVar2 = new C0099a(handler.getLooper());
            this.f271b = aVar2;
            aVar2.f285a = true;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public static class C0102b extends C17204q.C17205a {

        /* renamed from: a */
        public final MediaControllerCompat f289a;

        public C0102b(MediaControllerCompat mediaControllerCompat) {
            this.f289a = mediaControllerCompat;
        }

        /* renamed from: a */
        public MediaControllerCompat mo342a() {
            return this.f289a;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    public interface C0103c {
        /* renamed from: C */
        long mo276C();

        /* renamed from: L0 */
        List<MediaSessionCompat.QueueItem> mo277L0();

        /* renamed from: P0 */
        int mo278P0();

        /* renamed from: Q */
        PlaybackStateCompat mo279Q();

        /* renamed from: W */
        int mo280W();

        /* renamed from: a */
        C0107g mo281a();

        /* renamed from: b */
        void mo282b(C0098a aVar);

        /* renamed from: c */
        void mo283c(MediaDescriptionCompat mediaDescriptionCompat, int i);

        /* renamed from: d */
        void mo284d(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: e */
        PendingIntent mo285e();

        /* renamed from: f */
        C0108h mo286f();

        /* renamed from: g */
        void mo287g(int i, int i2);

        Bundle getExtras();

        MediaMetadataCompat getMetadata();

        String getPackageName();

        /* renamed from: h */
        boolean mo291h(KeyEvent keyEvent);

        /* renamed from: h0 */
        int mo292h0();

        /* renamed from: i */
        void mo293i(int i, int i2);

        /* renamed from: i0 */
        boolean mo294i0();

        /* renamed from: j */
        boolean mo295j();

        /* renamed from: k */
        Object mo296k();

        /* renamed from: l */
        void mo297l(C0098a aVar, Handler handler);

        /* renamed from: o0 */
        void mo300o0(MediaDescriptionCompat mediaDescriptionCompat);

        /* renamed from: p0 */
        void mo301p0(MediaDescriptionCompat mediaDescriptionCompat);

        /* renamed from: w0 */
        CharSequence mo302w0();
    }

    @C0376v0(23)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    public static class C0104d extends MediaControllerImplApi21 {
        public C0104d(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        /* renamed from: f */
        public C0108h mo286f() {
            Object q = C0156c.m1062q(this.f264a);
            if (q != null) {
                return new C0110j(q);
            }
            return null;
        }
    }

    @C0376v0(24)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    public static class C0105e extends C0104d {
        public C0105e(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        /* renamed from: f */
        public C0108h mo286f() {
            Object q = C0156c.m1062q(this.f264a);
            if (q != null) {
                return new C0111k(q);
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static class C0106f implements C0103c {

        /* renamed from: a */
        public C0153b f290a;

        /* renamed from: b */
        public C0108h f291b;

        public C0106f(MediaSessionCompat.Token token) {
            this.f290a = C0153b.C0154a.m1001m0((IBinder) token.mo419f());
        }

        /* renamed from: C */
        public long mo276C() {
            try {
                return this.f290a.mo518C();
            } catch (RemoteException unused) {
                return 0;
            }
        }

        /* renamed from: L0 */
        public List<MediaSessionCompat.QueueItem> mo277L0() {
            try {
                return this.f290a.mo523L0();
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: P0 */
        public int mo278P0() {
            try {
                return this.f290a.mo528P0();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        /* renamed from: Q */
        public PlaybackStateCompat mo279Q() {
            try {
                return this.f290a.mo529Q();
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: W */
        public int mo280W() {
            try {
                return this.f290a.mo530W();
            } catch (RemoteException unused) {
                return 0;
            }
        }

        /* renamed from: a */
        public C0107g mo281a() {
            try {
                ParcelableVolumeInfo e8 = this.f290a.mo536e8();
                return new C0107g(e8.f451a, e8.f452b, e8.f453c, e8.f454d, e8.f455e);
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: b */
        public void mo282b(C0098a aVar) {
            if (aVar != null) {
                try {
                    this.f290a.mo558r6((C0150a) aVar.f270a);
                    this.f290a.asBinder().unlinkToDeath(aVar, 0);
                } catch (RemoteException unused) {
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        /* renamed from: c */
        public void mo283c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            try {
                if ((this.f290a.mo518C() & 4) != 0) {
                    this.f290a.mo550l3(mediaDescriptionCompat, i);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: d */
        public void mo284d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            try {
                this.f290a.mo535e4(str, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultReceiver));
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: e */
        public PendingIntent mo285e() {
            try {
                return this.f290a.mo515B1();
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: f */
        public C0108h mo286f() {
            if (this.f291b == null) {
                this.f291b = new C0112l(this.f290a);
            }
            return this.f291b;
        }

        /* renamed from: g */
        public void mo287g(int i, int i2) {
            try {
                this.f290a.mo547j7(i, i2, (String) null);
            } catch (RemoteException unused) {
            }
        }

        public Bundle getExtras() {
            try {
                return this.f290a.getExtras();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public MediaMetadataCompat getMetadata() {
            try {
                return this.f290a.getMetadata();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public String getPackageName() {
            try {
                return this.f290a.getPackageName();
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: h */
        public boolean mo291h(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f290a.mo531X2(keyEvent);
                    return false;
                } catch (RemoteException unused) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }

        /* renamed from: h0 */
        public int mo292h0() {
            try {
                return this.f290a.mo542h0();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        /* renamed from: i */
        public void mo293i(int i, int i2) {
            try {
                this.f290a.mo552n5(i, i2, (String) null);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: i0 */
        public boolean mo294i0() {
            try {
                return this.f290a.mo543i0();
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* renamed from: j */
        public boolean mo295j() {
            return true;
        }

        /* renamed from: k */
        public Object mo296k() {
            return null;
        }

        /* renamed from: l */
        public void mo297l(C0098a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.f290a.asBinder().linkToDeath(aVar, 0);
                    this.f290a.mo534b5((C0150a) aVar.f270a);
                    aVar.mo324n(13, (Object) null, (Bundle) null);
                } catch (RemoteException unused) {
                    aVar.mo324n(8, (Object) null, (Bundle) null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        /* renamed from: o0 */
        public void mo300o0(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f290a.mo518C() & 4) != 0) {
                    this.f290a.mo554o0(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: p0 */
        public void mo301p0(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f290a.mo518C() & 4) != 0) {
                    this.f290a.mo555p0(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: w0 */
        public CharSequence mo302w0() {
            try {
                return this.f290a.mo560w0();
            } catch (RemoteException unused) {
                return null;
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$g */
    public static final class C0107g {

        /* renamed from: f */
        public static final int f292f = 1;

        /* renamed from: g */
        public static final int f293g = 2;

        /* renamed from: a */
        public final int f294a;

        /* renamed from: b */
        public final int f295b;

        /* renamed from: c */
        public final int f296c;

        /* renamed from: d */
        public final int f297d;

        /* renamed from: e */
        public final int f298e;

        public C0107g(int i, int i2, int i3, int i4, int i5) {
            this.f294a = i;
            this.f295b = i2;
            this.f296c = i3;
            this.f297d = i4;
            this.f298e = i5;
        }

        /* renamed from: a */
        public int mo343a() {
            return this.f295b;
        }

        /* renamed from: b */
        public int mo344b() {
            return this.f298e;
        }

        /* renamed from: c */
        public int mo345c() {
            return this.f297d;
        }

        /* renamed from: d */
        public int mo346d() {
            return this.f294a;
        }

        /* renamed from: e */
        public int mo347e() {
            return this.f296c;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$h */
    public static abstract class C0108h {

        /* renamed from: a */
        public static final String f299a = "android.media.session.extra.LEGACY_STREAM_TYPE";

        /* renamed from: a */
        public abstract void mo348a();

        /* renamed from: b */
        public abstract void mo349b();

        /* renamed from: c */
        public abstract void mo350c();

        /* renamed from: d */
        public abstract void mo351d(String str, Bundle bundle);

        /* renamed from: e */
        public abstract void mo352e(String str, Bundle bundle);

        /* renamed from: f */
        public abstract void mo353f(Uri uri, Bundle bundle);

        /* renamed from: g */
        public abstract void mo354g();

        /* renamed from: h */
        public abstract void mo355h(String str, Bundle bundle);

        /* renamed from: i */
        public abstract void mo356i(String str, Bundle bundle);

        /* renamed from: j */
        public abstract void mo357j(Uri uri, Bundle bundle);

        /* renamed from: k */
        public abstract void mo358k();

        /* renamed from: l */
        public abstract void mo359l(long j);

        /* renamed from: m */
        public abstract void mo360m(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

        /* renamed from: n */
        public abstract void mo361n(String str, Bundle bundle);

        /* renamed from: o */
        public abstract void mo362o(boolean z);

        /* renamed from: p */
        public abstract void mo363p(RatingCompat ratingCompat);

        /* renamed from: q */
        public abstract void mo364q(RatingCompat ratingCompat, Bundle bundle);

        /* renamed from: r */
        public abstract void mo365r(int i);

        /* renamed from: s */
        public abstract void mo366s(int i);

        /* renamed from: t */
        public abstract void mo367t();

        /* renamed from: u */
        public abstract void mo368u();

        /* renamed from: v */
        public abstract void mo369v(long j);

        /* renamed from: w */
        public abstract void mo370w();
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$i */
    public static class C0109i extends C0108h {

        /* renamed from: b */
        public final Object f300b;

        public C0109i(Object obj) {
            this.f300b = obj;
        }

        /* renamed from: a */
        public void mo348a() {
            C0156c.C0160d.m1083a(this.f300b);
        }

        /* renamed from: b */
        public void mo349b() {
            C0156c.C0160d.m1084b(this.f300b);
        }

        /* renamed from: c */
        public void mo350c() {
            C0156c.C0160d.m1085c(this.f300b);
        }

        /* renamed from: d */
        public void mo351d(String str, Bundle bundle) {
            C0156c.C0160d.m1086d(this.f300b, str, bundle);
        }

        /* renamed from: e */
        public void mo352e(String str, Bundle bundle) {
            C0156c.C0160d.m1087e(this.f300b, str, bundle);
        }

        /* renamed from: f */
        public void mo353f(Uri uri, Bundle bundle) {
            if (uri == null || Uri.EMPTY.equals(uri)) {
                throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.f303B, uri);
            bundle2.putBundle(MediaSessionCompat.f305D, bundle);
            mo361n(MediaSessionCompat.f331q, bundle2);
        }

        /* renamed from: g */
        public void mo354g() {
            mo361n(MediaSessionCompat.f332r, (Bundle) null);
        }

        /* renamed from: h */
        public void mo355h(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.f340z, str);
            bundle2.putBundle(MediaSessionCompat.f305D, bundle);
            mo361n(MediaSessionCompat.f333s, bundle2);
        }

        /* renamed from: i */
        public void mo356i(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.f302A, str);
            bundle2.putBundle(MediaSessionCompat.f305D, bundle);
            mo361n(MediaSessionCompat.f334t, bundle2);
        }

        /* renamed from: j */
        public void mo357j(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.f303B, uri);
            bundle2.putBundle(MediaSessionCompat.f305D, bundle);
            mo361n(MediaSessionCompat.f335u, bundle2);
        }

        /* renamed from: k */
        public void mo358k() {
            C0156c.C0160d.m1088f(this.f300b);
        }

        /* renamed from: l */
        public void mo359l(long j) {
            C0156c.C0160d.m1089g(this.f300b, j);
        }

        /* renamed from: m */
        public void mo360m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            MediaControllerCompat.m368F(customAction.mo610b(), bundle);
            C0156c.C0160d.m1090h(this.f300b, customAction.mo610b(), bundle);
        }

        /* renamed from: n */
        public void mo361n(String str, Bundle bundle) {
            MediaControllerCompat.m368F(str, bundle);
            C0156c.C0160d.m1090h(this.f300b, str, bundle);
        }

        /* renamed from: o */
        public void mo362o(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.f306E, z);
            mo361n(MediaSessionCompat.f336v, bundle);
        }

        /* renamed from: p */
        public void mo363p(RatingCompat ratingCompat) {
            Object obj;
            Object obj2 = this.f300b;
            if (ratingCompat != null) {
                obj = ratingCompat.mo225c();
            } else {
                obj = null;
            }
            C0156c.C0160d.m1091i(obj2, obj);
        }

        /* renamed from: q */
        public void mo364q(RatingCompat ratingCompat, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.f304C, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.f305D, bundle);
            mo361n(MediaSessionCompat.f339y, bundle2);
        }

        /* renamed from: r */
        public void mo365r(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.f307F, i);
            mo361n(MediaSessionCompat.f337w, bundle);
        }

        /* renamed from: s */
        public void mo366s(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.f308G, i);
            mo361n(MediaSessionCompat.f338x, bundle);
        }

        /* renamed from: t */
        public void mo367t() {
            C0156c.C0160d.m1092j(this.f300b);
        }

        /* renamed from: u */
        public void mo368u() {
            C0156c.C0160d.m1093k(this.f300b);
        }

        /* renamed from: v */
        public void mo369v(long j) {
            C0156c.C0160d.m1094l(this.f300b, j);
        }

        /* renamed from: w */
        public void mo370w() {
            C0156c.C0160d.m1095m(this.f300b);
        }
    }

    @C0376v0(23)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$j */
    public static class C0110j extends C0109i {
        public C0110j(Object obj) {
            super(obj);
        }

        /* renamed from: f */
        public void mo353f(Uri uri, Bundle bundle) {
            C0161d.C0162a.m1096a(this.f300b, uri, bundle);
        }
    }

    @C0376v0(24)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$k */
    public static class C0111k extends C0110j {
        public C0111k(Object obj) {
            super(obj);
        }

        /* renamed from: g */
        public void mo354g() {
            C0163e.C0164a.m1097a(this.f300b);
        }

        /* renamed from: h */
        public void mo355h(String str, Bundle bundle) {
            C0163e.C0164a.m1098b(this.f300b, str, bundle);
        }

        /* renamed from: i */
        public void mo356i(String str, Bundle bundle) {
            C0163e.C0164a.m1099c(this.f300b, str, bundle);
        }

        /* renamed from: j */
        public void mo357j(Uri uri, Bundle bundle) {
            C0163e.C0164a.m1100d(this.f300b, uri, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$l */
    public static class C0112l extends C0108h {

        /* renamed from: b */
        public C0153b f301b;

        public C0112l(C0153b bVar) {
            this.f301b = bVar;
        }

        /* renamed from: a */
        public void mo348a() {
            try {
                this.f301b.mo517B6();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: b */
        public void mo349b() {
            try {
                this.f301b.mo532Z();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: c */
        public void mo350c() {
            try {
                this.f301b.mo527O7();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: d */
        public void mo351d(String str, Bundle bundle) {
            try {
                this.f301b.mo551m2(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: e */
        public void mo352e(String str, Bundle bundle) {
            try {
                this.f301b.mo557r2(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: f */
        public void mo353f(Uri uri, Bundle bundle) {
            try {
                this.f301b.mo516B2(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: g */
        public void mo354g() {
            try {
                this.f301b.mo526O5();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: h */
        public void mo355h(String str, Bundle bundle) {
            try {
                this.f301b.mo545i2(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: i */
        public void mo356i(String str, Bundle bundle) {
            try {
                this.f301b.mo522J5(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: j */
        public void mo357j(Uri uri, Bundle bundle) {
            try {
                this.f301b.mo544i1(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: k */
        public void mo358k() {
            try {
                this.f301b.mo546i4();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: l */
        public void mo359l(long j) {
            try {
                this.f301b.mo521I6(j);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: m */
        public void mo360m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            mo361n(customAction.mo610b(), bundle);
        }

        /* renamed from: n */
        public void mo361n(String str, Bundle bundle) {
            MediaControllerCompat.m368F(str, bundle);
            try {
                this.f301b.mo533Z0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: o */
        public void mo362o(boolean z) {
            try {
                this.f301b.mo520E0(z);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: p */
        public void mo363p(RatingCompat ratingCompat) {
            try {
                this.f301b.mo548k5(ratingCompat);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: q */
        public void mo364q(RatingCompat ratingCompat, Bundle bundle) {
            try {
                this.f301b.mo538g3(ratingCompat, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: r */
        public void mo365r(int i) {
            try {
                this.f301b.mo525M0(i);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: s */
        public void mo366s(int i) {
            try {
                this.f301b.mo549l0(i);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: t */
        public void mo367t() {
            try {
                this.f301b.next();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: u */
        public void mo368u() {
            try {
                this.f301b.previous();
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: v */
        public void mo369v(long j) {
            try {
                this.f301b.mo561w4(j);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: w */
        public void mo370w() {
            try {
                this.f301b.stop();
            } catch (RemoteException unused) {
            }
        }
    }

    public MediaControllerCompat(Context context, @C0359n0 MediaSessionCompat mediaSessionCompat) {
        C0105e eVar;
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token i = mediaSessionCompat.mo382i();
            this.f262b = i;
            try {
                eVar = new C0105e(context, i);
            } catch (RemoteException unused) {
                eVar = null;
            }
            this.f261a = eVar;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    /* renamed from: C */
    public static void m367C(@C0359n0 Activity activity, MediaControllerCompat mediaControllerCompat) {
        Object obj;
        if (activity instanceof C17204q) {
            ((C17204q) activity).mo51642K(new C0102b(mediaControllerCompat));
        }
        if (mediaControllerCompat != null) {
            obj = C0156c.m1049d(activity, mediaControllerCompat.mo267r().mo419f());
        } else {
            obj = null;
        }
        C0156c.m1065t(activity, obj);
    }

    /* renamed from: F */
    public static void m368F(String str, Bundle bundle) {
        if (str != null) {
            if (!str.equals(MediaSessionCompat.f324j) && !str.equals(MediaSessionCompat.f325k)) {
                return;
            }
            if (bundle == null || !bundle.containsKey(MediaSessionCompat.f326l)) {
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
            }
        }
    }

    /* renamed from: g */
    public static MediaControllerCompat m369g(@C0359n0 Activity activity) {
        if (activity instanceof C17204q) {
            C0102b bVar = (C0102b) ((C17204q) activity).mo51641J(C0102b.class);
            if (bVar != null) {
                return bVar.mo342a();
            }
            return null;
        }
        Object g = C0156c.m1052g(activity);
        if (g == null) {
            return null;
        }
        try {
            return new MediaControllerCompat((Context) activity, MediaSessionCompat.Token.m632b(C0156c.m1061p(g)));
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: A */
    public void mo247A(int i) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> m = mo262m();
        if (m != null && i >= 0 && i < m.size() && (queueItem = m.get(i)) != null) {
            mo275z(queueItem.mo399c());
        }
    }

    /* renamed from: B */
    public void mo248B(@C0359n0 String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (!TextUtils.isEmpty(str)) {
            this.f261a.mo284d(str, bundle, resultReceiver);
            return;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }

    /* renamed from: D */
    public void mo249D(int i, int i2) {
        this.f261a.mo293i(i, i2);
    }

    /* renamed from: E */
    public void mo250E(@C0359n0 C0098a aVar) {
        if (aVar != null) {
            try {
                this.f263c.remove(aVar);
                this.f261a.mo282b(aVar);
            } finally {
                aVar.mo325o((Handler) null);
            }
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    /* renamed from: a */
    public void mo251a(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f261a.mo301p0(mediaDescriptionCompat);
    }

    /* renamed from: b */
    public void mo252b(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        this.f261a.mo283c(mediaDescriptionCompat, i);
    }

    /* renamed from: c */
    public void mo253c(int i, int i2) {
        this.f261a.mo287g(i, i2);
    }

    /* renamed from: d */
    public boolean mo254d(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f261a.mo291h(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: e */
    public Bundle mo255e() {
        return this.f261a.getExtras();
    }

    /* renamed from: f */
    public long mo256f() {
        return this.f261a.mo276C();
    }

    /* renamed from: h */
    public Object mo257h() {
        return this.f261a.mo296k();
    }

    /* renamed from: i */
    public MediaMetadataCompat mo258i() {
        return this.f261a.getMetadata();
    }

    /* renamed from: j */
    public String mo259j() {
        return this.f261a.getPackageName();
    }

    /* renamed from: k */
    public C0107g mo260k() {
        return this.f261a.mo281a();
    }

    /* renamed from: l */
    public PlaybackStateCompat mo261l() {
        return this.f261a.mo279Q();
    }

    /* renamed from: m */
    public List<MediaSessionCompat.QueueItem> mo262m() {
        return this.f261a.mo277L0();
    }

    /* renamed from: n */
    public CharSequence mo263n() {
        return this.f261a.mo302w0();
    }

    /* renamed from: o */
    public int mo264o() {
        return this.f261a.mo280W();
    }

    /* renamed from: p */
    public int mo265p() {
        return this.f261a.mo278P0();
    }

    /* renamed from: q */
    public PendingIntent mo266q() {
        return this.f261a.mo285e();
    }

    /* renamed from: r */
    public MediaSessionCompat.Token mo267r() {
        return this.f262b;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.f843b})
    /* renamed from: s */
    public Bundle mo268s() {
        return this.f262b.mo417e();
    }

    /* renamed from: t */
    public int mo269t() {
        return this.f261a.mo292h0();
    }

    /* renamed from: u */
    public C0108h mo270u() {
        return this.f261a.mo286f();
    }

    /* renamed from: v */
    public boolean mo271v() {
        return this.f261a.mo294i0();
    }

    /* renamed from: w */
    public boolean mo272w() {
        return this.f261a.mo295j();
    }

    /* renamed from: x */
    public void mo273x(@C0359n0 C0098a aVar) {
        mo274y(aVar, (Handler) null);
    }

    /* renamed from: y */
    public void mo274y(@C0359n0 C0098a aVar, Handler handler) {
        if (aVar != null) {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.mo325o(handler);
            this.f261a.mo297l(aVar, handler);
            this.f263c.add(aVar);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    /* renamed from: z */
    public void mo275z(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f261a.mo300o0(mediaDescriptionCompat);
    }

    public MediaControllerCompat(Context context, @C0359n0 MediaSessionCompat.Token token) throws RemoteException {
        if (token != null) {
            this.f262b = token;
            this.f261a = new C0105e(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
