package android.support.p002v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import androidx.annotation.C0376v0;
import java.util.ArrayList;
import java.util.List;

@C0376v0(21)
/* renamed from: android.support.v4.media.session.c */
public class C0156c {

    /* renamed from: android.support.v4.media.session.c$a */
    public interface C0157a {
        /* renamed from: C0 */
        void mo327C0(CharSequence charSequence);

        /* renamed from: Y */
        void mo328Y(List<?> list);

        /* renamed from: a */
        void mo329a(Object obj);

        /* renamed from: b */
        void mo330b(Object obj);

        /* renamed from: c */
        void mo331c(String str, Bundle bundle);

        /* renamed from: d */
        void mo332d(int i, int i2, int i3, int i4, int i5);

        /* renamed from: d0 */
        void mo333d0();

        /* renamed from: s0 */
        void mo334s0(Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.c$b */
    public static class C0158b<T extends C0157a> extends MediaController.Callback {

        /* renamed from: a */
        public final T f612a;

        public C0158b(T t) {
            this.f612a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f612a.mo332d(playbackInfo.getPlaybackType(), C0159c.m1078c(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            this.f612a.mo334s0(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f612a.mo329a(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f612a.mo330b(playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f612a.mo328Y(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f612a.mo327C0(charSequence);
        }

        public void onSessionDestroyed() {
            this.f612a.mo333d0();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            this.f612a.mo331c(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    public static class C0159c {

        /* renamed from: a */
        public static final int f613a = 4;

        /* renamed from: b */
        public static final int f614b = 6;

        /* renamed from: c */
        public static final int f615c = 7;

        /* renamed from: a */
        public static AudioAttributes m1076a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m1077b(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getCurrentVolume();
        }

        /* renamed from: c */
        public static int m1078c(Object obj) {
            return m1082g(m1076a(obj));
        }

        /* renamed from: d */
        public static int m1079d(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getMaxVolume();
        }

        /* renamed from: e */
        public static int m1080e(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getPlaybackType();
        }

        /* renamed from: f */
        public static int m1081f(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getVolumeControl();
        }

        /* renamed from: g */
        public static int m1082g(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$d */
    public static class C0160d {
        /* renamed from: a */
        public static void m1083a(Object obj) {
            ((MediaController.TransportControls) obj).fastForward();
        }

        /* renamed from: b */
        public static void m1084b(Object obj) {
            ((MediaController.TransportControls) obj).pause();
        }

        /* renamed from: c */
        public static void m1085c(Object obj) {
            ((MediaController.TransportControls) obj).play();
        }

        /* renamed from: d */
        public static void m1086d(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromMediaId(str, bundle);
        }

        /* renamed from: e */
        public static void m1087e(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromSearch(str, bundle);
        }

        /* renamed from: f */
        public static void m1088f(Object obj) {
            ((MediaController.TransportControls) obj).rewind();
        }

        /* renamed from: g */
        public static void m1089g(Object obj, long j) {
            ((MediaController.TransportControls) obj).seekTo(j);
        }

        /* renamed from: h */
        public static void m1090h(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).sendCustomAction(str, bundle);
        }

        /* renamed from: i */
        public static void m1091i(Object obj, Object obj2) {
            ((MediaController.TransportControls) obj).setRating((Rating) obj2);
        }

        /* renamed from: j */
        public static void m1092j(Object obj) {
            ((MediaController.TransportControls) obj).skipToNext();
        }

        /* renamed from: k */
        public static void m1093k(Object obj) {
            ((MediaController.TransportControls) obj).skipToPrevious();
        }

        /* renamed from: l */
        public static void m1094l(Object obj, long j) {
            ((MediaController.TransportControls) obj).skipToQueueItem(j);
        }

        /* renamed from: m */
        public static void m1095m(Object obj) {
            ((MediaController.TransportControls) obj).stop();
        }
    }

    /* renamed from: a */
    public static void m1046a(Object obj, int i, int i2) {
        ((MediaController) obj).adjustVolume(i, i2);
    }

    /* renamed from: b */
    public static Object m1047b(C0157a aVar) {
        return new C0158b(aVar);
    }

    /* renamed from: c */
    public static boolean m1048c(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: d */
    public static Object m1049d(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    /* renamed from: e */
    public static Bundle m1050e(Object obj) {
        return ((MediaController) obj).getExtras();
    }

    /* renamed from: f */
    public static long m1051f(Object obj) {
        return ((MediaController) obj).getFlags();
    }

    /* renamed from: g */
    public static Object m1052g(Activity activity) {
        return activity.getMediaController();
    }

    /* renamed from: h */
    public static Object m1053h(Object obj) {
        return ((MediaController) obj).getMetadata();
    }

    /* renamed from: i */
    public static String m1054i(Object obj) {
        return ((MediaController) obj).getPackageName();
    }

    /* renamed from: j */
    public static Object m1055j(Object obj) {
        return ((MediaController) obj).getPlaybackInfo();
    }

    /* renamed from: k */
    public static Object m1056k(Object obj) {
        return ((MediaController) obj).getPlaybackState();
    }

    /* renamed from: l */
    public static List<Object> m1057l(Object obj) {
        List<MediaSession.QueueItem> queue = ((MediaController) obj).getQueue();
        if (queue == null) {
            return null;
        }
        return new ArrayList(queue);
    }

    /* renamed from: m */
    public static CharSequence m1058m(Object obj) {
        return ((MediaController) obj).getQueueTitle();
    }

    /* renamed from: n */
    public static int m1059n(Object obj) {
        return ((MediaController) obj).getRatingType();
    }

    /* renamed from: o */
    public static PendingIntent m1060o(Object obj) {
        return ((MediaController) obj).getSessionActivity();
    }

    /* renamed from: p */
    public static Object m1061p(Object obj) {
        return ((MediaController) obj).getSessionToken();
    }

    /* renamed from: q */
    public static Object m1062q(Object obj) {
        return ((MediaController) obj).getTransportControls();
    }

    /* renamed from: r */
    public static void m1063r(Object obj, Object obj2, Handler handler) {
        ((MediaController) obj).registerCallback((MediaController.Callback) obj2, handler);
    }

    /* renamed from: s */
    public static void m1064s(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }

    /* renamed from: t */
    public static void m1065t(Activity activity, Object obj) {
        activity.setMediaController((MediaController) obj);
    }

    /* renamed from: u */
    public static void m1066u(Object obj, int i, int i2) {
        ((MediaController) obj).setVolumeTo(i, i2);
    }

    /* renamed from: v */
    public static void m1067v(Object obj, Object obj2) {
        ((MediaController) obj).unregisterCallback((MediaController.Callback) obj2);
    }
}
