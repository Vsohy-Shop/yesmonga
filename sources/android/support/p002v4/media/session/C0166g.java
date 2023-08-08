package android.support.p002v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.C0376v0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C0376v0(21)
/* renamed from: android.support.v4.media.session.g */
public class C0166g {

    /* renamed from: a */
    public static final String f616a = "MediaSessionCompatApi21";

    /* renamed from: android.support.v4.media.session.g$a */
    public interface C0167a {
        /* renamed from: A */
        void mo460A(Object obj, Bundle bundle);

        /* renamed from: B */
        void mo461B(String str, Bundle bundle);

        /* renamed from: C */
        void mo462C(String str, Bundle bundle);

        /* renamed from: D */
        void mo463D();

        /* renamed from: E */
        void mo464E(long j);

        /* renamed from: F */
        void mo465F(Object obj);

        /* renamed from: G */
        void mo466G();

        /* renamed from: H */
        void mo467H(String str, Bundle bundle);

        /* renamed from: I */
        void mo468I();

        /* renamed from: J */
        void mo469J(long j);

        /* renamed from: a */
        void mo470a();

        /* renamed from: v */
        void mo471v();

        /* renamed from: w */
        void mo472w();

        /* renamed from: x */
        void mo473x(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: y */
        void mo474y();

        /* renamed from: z */
        boolean mo475z(Intent intent);
    }

    /* renamed from: android.support.v4.media.session.g$b */
    public static class C0168b<T extends C0167a> extends MediaSession.Callback {

        /* renamed from: a */
        public final T f617a;

        public C0168b(T t) {
            this.f617a = t;
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.m591b(bundle);
            this.f617a.mo473x(str, bundle, resultReceiver);
        }

        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            this.f617a.mo462C(str, bundle);
        }

        public void onFastForward() {
            this.f617a.mo468I();
        }

        public boolean onMediaButtonEvent(Intent intent) {
            if (this.f617a.mo475z(intent) || super.onMediaButtonEvent(intent)) {
                return true;
            }
            return false;
        }

        public void onPause() {
            this.f617a.mo471v();
        }

        public void onPlay() {
            this.f617a.mo466G();
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            this.f617a.mo467H(str, bundle);
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            this.f617a.mo461B(str, bundle);
        }

        public void onRewind() {
            this.f617a.mo463D();
        }

        public void onSeekTo(long j) {
            this.f617a.mo469J(j);
        }

        public void onSetRating(Rating rating) {
            this.f617a.mo465F(rating);
        }

        public void onSkipToNext() {
            this.f617a.mo472w();
        }

        public void onSkipToPrevious() {
            this.f617a.mo474y();
        }

        public void onSkipToQueueItem(long j) {
            this.f617a.mo464E(j);
        }

        public void onStop() {
            this.f617a.mo470a();
        }
    }

    /* renamed from: android.support.v4.media.session.g$c */
    public static class C0169c {
        /* renamed from: a */
        public static Object m1139a(Object obj, long j) {
            return new MediaSession.QueueItem((MediaDescription) obj, j);
        }

        /* renamed from: b */
        public static Object m1140b(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        /* renamed from: c */
        public static long m1141c(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }

    /* renamed from: a */
    public static Object m1102a(C0167a aVar) {
        return new C0168b(aVar);
    }

    /* renamed from: b */
    public static Object m1103b(Context context, String str) {
        return new MediaSession(context, str);
    }

    /* renamed from: c */
    public static Parcelable m1104c(Object obj) {
        return ((MediaSession) obj).getSessionToken();
    }

    /* renamed from: d */
    public static boolean m1105d(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mCallback");
            if (declaredField == null) {
                return false;
            }
            declaredField.setAccessible(true);
            if (declaredField.get(obj) != null) {
                return true;
            }
            return false;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m1106e(Object obj) {
        return ((MediaSession) obj).isActive();
    }

    /* renamed from: f */
    public static void m1107f(Object obj) {
        ((MediaSession) obj).release();
    }

    /* renamed from: g */
    public static void m1108g(Object obj, String str, Bundle bundle) {
        ((MediaSession) obj).sendSessionEvent(str, bundle);
    }

    /* renamed from: h */
    public static void m1109h(Object obj, boolean z) {
        ((MediaSession) obj).setActive(z);
    }

    /* renamed from: i */
    public static void m1110i(Object obj, Object obj2, Handler handler) {
        ((MediaSession) obj).setCallback((MediaSession.Callback) obj2, handler);
    }

    /* renamed from: j */
    public static void m1111j(Object obj, Bundle bundle) {
        ((MediaSession) obj).setExtras(bundle);
    }

    /* renamed from: k */
    public static void m1112k(Object obj, int i) {
        ((MediaSession) obj).setFlags(i);
    }

    /* renamed from: l */
    public static void m1113l(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
    }

    /* renamed from: m */
    public static void m1114m(Object obj, Object obj2) {
        ((MediaSession) obj).setMetadata((MediaMetadata) obj2);
    }

    /* renamed from: n */
    public static void m1115n(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackState((PlaybackState) obj2);
    }

    /* renamed from: o */
    public static void m1116o(Object obj, int i) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        ((MediaSession) obj).setPlaybackToLocal(builder.build());
    }

    /* renamed from: p */
    public static void m1117p(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackToRemote((VolumeProvider) obj2);
    }

    /* renamed from: q */
    public static void m1118q(Object obj, List<Object> list) {
        if (list == null) {
            ((MediaSession) obj).setQueue((List) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MediaSession.QueueItem) it.next());
        }
        ((MediaSession) obj).setQueue(arrayList);
    }

    /* renamed from: r */
    public static void m1119r(Object obj, CharSequence charSequence) {
        ((MediaSession) obj).setQueueTitle(charSequence);
    }

    /* renamed from: s */
    public static void m1120s(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setSessionActivity(pendingIntent);
    }

    /* renamed from: t */
    public static Object m1121t(Object obj) {
        if (obj instanceof MediaSession) {
            return obj;
        }
        throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
    }

    /* renamed from: u */
    public static Object m1122u(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
