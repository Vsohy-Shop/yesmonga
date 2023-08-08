package android.support.p002v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p002v4.media.MediaDescriptionCompat;
import android.support.p002v4.media.MediaMetadataCompat;
import android.support.p002v4.media.RatingCompat;
import android.support.p002v4.media.session.C0153b;
import android.support.p002v4.media.session.C0166g;
import android.support.p002v4.media.session.C0171i;
import android.support.p002v4.media.session.C0174j;
import android.support.p002v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17195p;
import androidx.media.C19616i;
import androidx.media.C19645u;
import androidx.media.session.C19632a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: A */
    public static final String f302A = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: B */
    public static final String f303B = "android.support.v4.media.session.action.ARGUMENT_URI";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: C */
    public static final String f304C = "android.support.v4.media.session.action.ARGUMENT_RATING";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: D */
    public static final String f305D = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: E */
    public static final String f306E = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: F */
    public static final String f307F = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: G */
    public static final String f308G = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    @RestrictTo({RestrictTo.Scope.f843b})

    /* renamed from: H */
    public static final String f309H = "android.support.v4.media.session.TOKEN";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: I */
    public static final String f310I = "android.support.v4.media.session.EXTRA_BINDER";
    @RestrictTo({RestrictTo.Scope.f843b})

    /* renamed from: J */
    public static final String f311J = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";

    /* renamed from: K */
    public static final int f312K = 320;

    /* renamed from: L */
    public static final String f313L = "data_calling_pkg";

    /* renamed from: M */
    public static final String f314M = "data_calling_pid";

    /* renamed from: N */
    public static final String f315N = "data_calling_uid";

    /* renamed from: O */
    public static final String f316O = "data_extras";

    /* renamed from: P */
    public static int f317P = 0;

    /* renamed from: d */
    public static final String f318d = "MediaSessionCompat";

    /* renamed from: e */
    public static final int f319e = 1;

    /* renamed from: f */
    public static final int f320f = 2;

    /* renamed from: g */
    public static final int f321g = 4;

    /* renamed from: h */
    public static final String f322h = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";

    /* renamed from: i */
    public static final String f323i = "android.support.v4.media.session.action.SKIP_AD";

    /* renamed from: j */
    public static final String f324j = "android.support.v4.media.session.action.FOLLOW";

    /* renamed from: k */
    public static final String f325k = "android.support.v4.media.session.action.UNFOLLOW";

    /* renamed from: l */
    public static final String f326l = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";

    /* renamed from: m */
    public static final String f327m = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";

    /* renamed from: n */
    public static final int f328n = 0;

    /* renamed from: o */
    public static final int f329o = 1;

    /* renamed from: p */
    public static final int f330p = 2;
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: q */
    public static final String f331q = "android.support.v4.media.session.action.PLAY_FROM_URI";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: r */
    public static final String f332r = "android.support.v4.media.session.action.PREPARE";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: s */
    public static final String f333s = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: t */
    public static final String f334t = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: u */
    public static final String f335u = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: v */
    public static final String f336v = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: w */
    public static final String f337w = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: x */
    public static final String f338x = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: y */
    public static final String f339y = "android.support.v4.media.session.action.SET_RATING";
    @RestrictTo({RestrictTo.Scope.f842a})

    /* renamed from: z */
    public static final String f340z = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";

    /* renamed from: a */
    public final C0124e f341a;

    /* renamed from: b */
    public final MediaControllerCompat f342b;

    /* renamed from: c */
    public final ArrayList<C0137k> f343c;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0113a();

        /* renamed from: d */
        public static final int f344d = -1;

        /* renamed from: a */
        public final MediaDescriptionCompat f345a;

        /* renamed from: b */
        public final long f346b;

        /* renamed from: c */
        public Object f347c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public static class C0113a implements Parcelable.Creator<QueueItem> {
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this((Object) null, mediaDescriptionCompat, j);
        }

        /* renamed from: a */
        public static QueueItem m622a(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.m247a(C0166g.C0169c.m1140b(obj)), C0166g.C0169c.m1141c(obj));
            }
            return null;
        }

        /* renamed from: b */
        public static List<QueueItem> m623b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m622a(a));
            }
            return arrayList;
        }

        /* renamed from: c */
        public MediaDescriptionCompat mo399c() {
            return this.f345a;
        }

        /* renamed from: d */
        public long mo400d() {
            return this.f346b;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public Object mo402e() {
            Object obj = this.f347c;
            if (obj != null) {
                return obj;
            }
            Object a = C0166g.C0169c.m1139a(this.f345a.mo180f(), this.f346b);
            this.f347c = a;
            return a;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f345a + ", Id=" + this.f346b + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f345a.writeToParcel(parcel, i);
            parcel.writeLong(this.f346b);
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f345a = mediaDescriptionCompat;
                this.f346b = j;
                this.f347c = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public QueueItem(Parcel parcel) {
            this.f345a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f346b = parcel.readLong();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0115a();

        /* renamed from: a */
        public final Object f349a;

        /* renamed from: b */
        public C0153b f350b;

        /* renamed from: c */
        public Bundle f351c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public static class C0115a implements Parcelable.Creator<Token> {
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this(obj, (C0153b) null, (Bundle) null);
        }

        @RestrictTo({RestrictTo.Scope.f843b})
        /* renamed from: a */
        public static Token m631a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            C0153b m0 = C0153b.C0154a.m1001m0(C17195p.m79486a(bundle, MediaSessionCompat.f310I));
            Bundle bundle2 = bundle.getBundle(MediaSessionCompat.f311J);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.f309H);
            if (token == null) {
                return null;
            }
            return new Token(token.f349a, m0, bundle2);
        }

        /* renamed from: b */
        public static Token m632b(Object obj) {
            return m633c(obj, (C0153b) null);
        }

        @RestrictTo({RestrictTo.Scope.f843b})
        /* renamed from: c */
        public static Token m633c(Object obj, C0153b bVar) {
            if (obj != null) {
                return new Token(C0166g.m1122u(obj), bVar);
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.f843b})
        /* renamed from: d */
        public C0153b mo415d() {
            return this.f350b;
        }

        public int describeContents() {
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.f843b})
        /* renamed from: e */
        public Bundle mo417e() {
            return this.f351c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f349a;
            if (obj2 != null) {
                Object obj3 = token.f349a;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f349a == null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: f */
        public Object mo419f() {
            return this.f349a;
        }

        @RestrictTo({RestrictTo.Scope.f843b})
        /* renamed from: g */
        public void mo420g(C0153b bVar) {
            this.f350b = bVar;
        }

        @RestrictTo({RestrictTo.Scope.f843b})
        /* renamed from: h */
        public void mo421h(Bundle bundle) {
            this.f351c = bundle;
        }

        public int hashCode() {
            Object obj = this.f349a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @RestrictTo({RestrictTo.Scope.f843b})
        /* renamed from: i */
        public Bundle mo423i() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.f309H, this);
            C0153b bVar = this.f350b;
            if (bVar != null) {
                C17195p.m79487b(bundle, MediaSessionCompat.f310I, bVar.asBinder());
            }
            Bundle bundle2 = this.f351c;
            if (bundle2 != null) {
                bundle.putBundle(MediaSessionCompat.f311J, bundle2);
            }
            return bundle;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f349a, i);
        }

        public Token(Object obj, C0153b bVar) {
            this(obj, bVar, (Bundle) null);
        }

        public Token(Object obj, C0153b bVar, Bundle bundle) {
            this.f349a = obj;
            this.f350b = bVar;
            this.f351c = bundle;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    public class C0116a extends C0119d {
        public C0116a() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public class C0117b extends C0119d {
        public C0117b() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    public class C0118c extends C0119d {
        public C0118c() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    public static abstract class C0119d {

        /* renamed from: a */
        public final Object f355a = C0174j.m1145a(new C0123d());

        /* renamed from: b */
        public WeakReference<C0124e> f356b;

        /* renamed from: c */
        public C0120a f357c = null;

        /* renamed from: d */
        public boolean f358d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$a */
        public class C0120a extends Handler {

            /* renamed from: b */
            public static final int f359b = 1;

            public C0120a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    C0119d.this.mo433a((C19616i.C19618b) message.obj);
                }
            }
        }

        @C0376v0(21)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$b */
        public class C0121b implements C0166g.C0167a {
            public C0121b() {
            }

            /* renamed from: A */
            public void mo460A(Object obj, Bundle bundle) {
            }

            /* renamed from: B */
            public void mo461B(String str, Bundle bundle) {
                C0119d.this.mo443k(str, bundle);
            }

            /* renamed from: C */
            public void mo462C(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle(MediaSessionCompat.f305D);
                MediaSessionCompat.m591b(bundle2);
                if (str.equals(MediaSessionCompat.f331q)) {
                    C0119d.this.mo444l((Uri) bundle.getParcelable(MediaSessionCompat.f303B), bundle2);
                } else if (str.equals(MediaSessionCompat.f332r)) {
                    C0119d.this.mo445m();
                } else if (str.equals(MediaSessionCompat.f333s)) {
                    C0119d.this.mo446n(bundle.getString(MediaSessionCompat.f340z), bundle2);
                } else if (str.equals(MediaSessionCompat.f334t)) {
                    C0119d.this.mo447o(bundle.getString(MediaSessionCompat.f302A), bundle2);
                } else if (str.equals(MediaSessionCompat.f335u)) {
                    C0119d.this.mo448p((Uri) bundle.getParcelable(MediaSessionCompat.f303B), bundle2);
                } else if (str.equals(MediaSessionCompat.f336v)) {
                    C0119d.this.mo453u(bundle.getBoolean(MediaSessionCompat.f306E));
                } else if (str.equals(MediaSessionCompat.f337w)) {
                    C0119d.this.mo456x(bundle.getInt(MediaSessionCompat.f307F));
                } else if (str.equals(MediaSessionCompat.f338x)) {
                    C0119d.this.mo457y(bundle.getInt(MediaSessionCompat.f308G));
                } else if (str.equals(MediaSessionCompat.f339y)) {
                    C0119d.this.mo455w((RatingCompat) bundle.getParcelable(MediaSessionCompat.f304C), bundle2);
                } else {
                    C0119d.this.mo437e(str, bundle);
                }
            }

            /* renamed from: D */
            public void mo463D() {
                C0119d.this.mo451s();
            }

            /* renamed from: E */
            public void mo464E(long j) {
                C0119d.this.mo430B(j);
            }

            /* renamed from: F */
            public void mo465F(Object obj) {
                C0119d.this.mo454v(RatingCompat.m289a(obj));
            }

            /* renamed from: G */
            public void mo466G() {
                C0119d.this.mo441i();
            }

            /* renamed from: H */
            public void mo467H(String str, Bundle bundle) {
                C0119d.this.mo442j(str, bundle);
            }

            /* renamed from: I */
            public void mo468I() {
                C0119d.this.mo438f();
            }

            /* renamed from: J */
            public void mo469J(long j) {
                C0119d.this.mo452t(j);
            }

            /* renamed from: a */
            public void mo470a() {
                C0119d.this.mo431C();
            }

            /* renamed from: v */
            public void mo471v() {
                C0119d.this.mo440h();
            }

            /* renamed from: w */
            public void mo472w() {
                C0119d.this.mo458z();
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r1v0 */
            /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r1v6 */
            /* JADX WARNING: type inference failed for: r1v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: x */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo473x(java.lang.String r5, android.os.Bundle r6, android.os.ResultReceiver r7) {
                /*
                    r4 = this;
                    java.lang.String r0 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c3 }
                    r1 = 0
                    if (r0 == 0) goto L_0x003d
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p002v4.media.session.MediaSessionCompat.C0119d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$e> r5 = r5.f356b     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.session.MediaSessionCompat$h r5 = (android.support.p002v4.media.session.MediaSessionCompat.C0129h) r5     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r5 == 0) goto L_0x00c3
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00c3 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.session.MediaSessionCompat$Token r5 = r5.mo485e()     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.session.b r0 = r5.mo415d()     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r0 != 0) goto L_0x0027
                    goto L_0x002b
                L_0x0027:
                    android.os.IBinder r1 = r0.asBinder()     // Catch:{ BadParcelableException -> 0x00c3 }
                L_0x002b:
                    androidx.core.app.C17195p.m79487b(r6, r2, r1)     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.os.Bundle r5 = r5.mo417e()     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.String r0 = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"
                    r6.putBundle(r0, r5)     // Catch:{ BadParcelableException -> 0x00c3 }
                    r5 = 0
                    r7.send(r5, r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    goto L_0x00c3
                L_0x003d:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.String r2 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r0 == 0) goto L_0x0054
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p002v4.media.session.MediaSessionCompat.C0119d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.p002v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00c3 }
                    r5.mo434b(r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    goto L_0x00c3
                L_0x0054:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r0 == 0) goto L_0x006e
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p002v4.media.session.MediaSessionCompat.C0119d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.os.Parcelable r7 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p002v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00c3 }
                    int r6 = r6.getInt(r3)     // Catch:{ BadParcelableException -> 0x00c3 }
                    r5.mo435c(r7, r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    goto L_0x00c3
                L_0x006e:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r0 == 0) goto L_0x0082
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p002v4.media.session.MediaSessionCompat.C0119d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.p002v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00c3 }
                    r5.mo449q(r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    goto L_0x00c3
                L_0x0082:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r0 == 0) goto L_0x00be
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p002v4.media.session.MediaSessionCompat.C0119d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$e> r5 = r5.f356b     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.session.MediaSessionCompat$h r5 = (android.support.p002v4.media.session.MediaSessionCompat.C0129h) r5     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r5 == 0) goto L_0x00c3
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.f372f     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r7 == 0) goto L_0x00c3
                    r7 = -1
                    int r6 = r6.getInt(r3, r7)     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r6 < 0) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.f372f     // Catch:{ BadParcelableException -> 0x00c3 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00c3 }
                    if (r6 >= r7) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = r5.f372f     // Catch:{ BadParcelableException -> 0x00c3 }
                    java.lang.Object r5 = r5.get(r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    r1 = r5
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = (android.support.p002v4.media.session.MediaSessionCompat.QueueItem) r1     // Catch:{ BadParcelableException -> 0x00c3 }
                L_0x00b2:
                    if (r1 == 0) goto L_0x00c3
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p002v4.media.session.MediaSessionCompat.C0119d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    android.support.v4.media.MediaDescriptionCompat r6 = r1.mo399c()     // Catch:{ BadParcelableException -> 0x00c3 }
                    r5.mo449q(r6)     // Catch:{ BadParcelableException -> 0x00c3 }
                    goto L_0x00c3
                L_0x00be:
                    android.support.v4.media.session.MediaSessionCompat$d r0 = android.support.p002v4.media.session.MediaSessionCompat.C0119d.this     // Catch:{ BadParcelableException -> 0x00c3 }
                    r0.mo436d(r5, r6, r7)     // Catch:{ BadParcelableException -> 0x00c3 }
                L_0x00c3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.media.session.MediaSessionCompat.C0119d.C0121b.mo473x(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            /* renamed from: y */
            public void mo474y() {
                C0119d.this.mo429A();
            }

            /* renamed from: z */
            public boolean mo475z(Intent intent) {
                return C0119d.this.mo439g(intent);
            }
        }

        @C0376v0(23)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$c */
        public class C0122c extends C0121b implements C0171i.C0172a {
            public C0122c() {
                super();
            }

            /* renamed from: e */
            public void mo476e(Uri uri, Bundle bundle) {
                C0119d.this.mo444l(uri, bundle);
            }
        }

        @C0376v0(24)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$d */
        public class C0123d extends C0122c implements C0174j.C0175a {
            public C0123d() {
                super();
            }

            /* renamed from: b */
            public void mo477b(String str, Bundle bundle) {
                C0119d.this.mo446n(str, bundle);
            }

            /* renamed from: c */
            public void mo478c() {
                C0119d.this.mo445m();
            }

            /* renamed from: d */
            public void mo479d(String str, Bundle bundle) {
                C0119d.this.mo447o(str, bundle);
            }

            /* renamed from: f */
            public void mo480f(Uri uri, Bundle bundle) {
                C0119d.this.mo448p(uri, bundle);
            }
        }

        /* renamed from: A */
        public void mo429A() {
        }

        /* renamed from: B */
        public void mo430B(long j) {
        }

        /* renamed from: C */
        public void mo431C() {
        }

        /* renamed from: D */
        public void mo432D(C0124e eVar, Handler handler) {
            this.f356b = new WeakReference<>(eVar);
            C0120a aVar = this.f357c;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages((Object) null);
            }
            this.f357c = new C0120a(handler.getLooper());
        }

        /* renamed from: a */
        public void mo433a(C19616i.C19618b bVar) {
            long j;
            boolean z;
            boolean z2;
            if (this.f358d) {
                boolean z3 = false;
                this.f358d = false;
                this.f357c.removeMessages(1);
                C0124e eVar = this.f356b.get();
                if (eVar != null) {
                    PlaybackStateCompat Q = eVar.mo483Q();
                    if (Q == null) {
                        j = 0;
                    } else {
                        j = Q.mo594b();
                    }
                    if (Q == null || Q.mo607n() != 3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if ((516 & j) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((j & 514) != 0) {
                        z3 = true;
                    }
                    eVar.mo503t(bVar);
                    if (z && z3) {
                        mo440h();
                    } else if (!z && z2) {
                        mo441i();
                    }
                    eVar.mo503t((C19616i.C19618b) null);
                }
            }
        }

        /* renamed from: b */
        public void mo434b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: c */
        public void mo435c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        /* renamed from: d */
        public void mo436d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        /* renamed from: e */
        public void mo437e(String str, Bundle bundle) {
        }

        /* renamed from: f */
        public void mo438f() {
        }

        /* renamed from: g */
        public boolean mo439g(Intent intent) {
            C0124e eVar;
            KeyEvent keyEvent;
            long j;
            if (Build.VERSION.SDK_INT >= 27 || (eVar = this.f356b.get()) == null || this.f357c == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C19616i.C19618b w = eVar.mo506w();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() > 0) {
                    mo433a(w);
                } else if (this.f358d) {
                    this.f357c.removeMessages(1);
                    this.f358d = false;
                    PlaybackStateCompat Q = eVar.mo483Q();
                    if (Q == null) {
                        j = 0;
                    } else {
                        j = Q.mo594b();
                    }
                    if ((j & 32) != 0) {
                        mo458z();
                    }
                } else {
                    this.f358d = true;
                    C0120a aVar = this.f357c;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, w), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            mo433a(w);
            return false;
        }

        /* renamed from: h */
        public void mo440h() {
        }

        /* renamed from: i */
        public void mo441i() {
        }

        /* renamed from: j */
        public void mo442j(String str, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo443k(String str, Bundle bundle) {
        }

        /* renamed from: l */
        public void mo444l(Uri uri, Bundle bundle) {
        }

        /* renamed from: m */
        public void mo445m() {
        }

        /* renamed from: n */
        public void mo446n(String str, Bundle bundle) {
        }

        /* renamed from: o */
        public void mo447o(String str, Bundle bundle) {
        }

        /* renamed from: p */
        public void mo448p(Uri uri, Bundle bundle) {
        }

        /* renamed from: q */
        public void mo449q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        /* renamed from: r */
        public void mo450r(int i) {
        }

        /* renamed from: s */
        public void mo451s() {
        }

        /* renamed from: t */
        public void mo452t(long j) {
        }

        /* renamed from: u */
        public void mo453u(boolean z) {
        }

        /* renamed from: v */
        public void mo454v(RatingCompat ratingCompat) {
        }

        /* renamed from: w */
        public void mo455w(RatingCompat ratingCompat, Bundle bundle) {
        }

        /* renamed from: x */
        public void mo456x(int i) {
        }

        /* renamed from: y */
        public void mo457y(int i) {
        }

        /* renamed from: z */
        public void mo458z() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    public interface C0124e {
        /* renamed from: E0 */
        void mo481E0(boolean z);

        /* renamed from: M0 */
        void mo482M0(int i);

        /* renamed from: Q */
        PlaybackStateCompat mo483Q();

        /* renamed from: d */
        boolean mo484d();

        /* renamed from: e */
        Token mo485e();

        /* renamed from: f */
        void mo486f(int i);

        /* renamed from: g */
        void mo487g(String str, Bundle bundle);

        /* renamed from: h */
        void mo488h(C0119d dVar, Handler handler);

        /* renamed from: i */
        void mo489i(CharSequence charSequence);

        /* renamed from: j */
        void mo490j(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: k */
        void mo491k(int i);

        /* renamed from: l */
        void mo492l(List<QueueItem> list);

        /* renamed from: l0 */
        void mo493l0(int i);

        /* renamed from: m */
        void mo494m(PlaybackStateCompat playbackStateCompat);

        /* renamed from: n */
        String mo495n();

        /* renamed from: o */
        void mo496o(PendingIntent pendingIntent);

        /* renamed from: p */
        void mo497p(int i);

        /* renamed from: q */
        void mo498q(PendingIntent pendingIntent);

        /* renamed from: r */
        Object mo499r();

        void release();

        /* renamed from: s */
        void mo501s(boolean z);

        void setExtras(Bundle bundle);

        /* renamed from: t */
        void mo503t(C19616i.C19618b bVar);

        /* renamed from: u */
        Object mo504u();

        /* renamed from: v */
        void mo505v(C19645u uVar);

        /* renamed from: w */
        C19616i.C19618b mo506w();
    }

    @C0376v0(18)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    public static class C0125f extends C0132j {

        /* renamed from: I */
        public static boolean f364I = true;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$f$a */
        public class C0126a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            public C0126a() {
            }

            public void onPlaybackPositionUpdate(long j) {
                C0125f.this.mo578y(18, -1, -1, Long.valueOf(j), (Bundle) null);
            }
        }

        public C0125f(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        /* renamed from: L */
        public void mo507L(PlaybackStateCompat playbackStateCompat) {
            long m = playbackStateCompat.mo606m();
            float k = playbackStateCompat.mo604k();
            long j = playbackStateCompat.mo603j();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.mo607n() == 3) {
                long j2 = 0;
                if (m > 0) {
                    if (j > 0) {
                        j2 = elapsedRealtime - j;
                        if (k > 0.0f && k != 1.0f) {
                            j2 = (long) (((float) j2) * k);
                        }
                    }
                    m += j2;
                }
            }
            this.f395i.setPlaybackState(mo577c(playbackStateCompat.mo607n()), m, k);
        }

        /* renamed from: N */
        public void mo508N(PendingIntent pendingIntent, ComponentName componentName) {
            if (f364I) {
                this.f394h.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.mo508N(pendingIntent, componentName);
            }
        }

        /* renamed from: h */
        public void mo488h(C0119d dVar, Handler handler) {
            super.mo488h(dVar, handler);
            if (dVar == null) {
                this.f395i.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);
                return;
            }
            this.f395i.setPlaybackPositionUpdateListener(new C0126a());
        }

        /* renamed from: x */
        public int mo509x(long j) {
            int x = super.mo509x(j);
            return (j & 256) != 0 ? x | 256 : x;
        }

        /* renamed from: z */
        public void mo510z(PendingIntent pendingIntent, ComponentName componentName) {
            if (f364I) {
                try {
                    this.f394h.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    f364I = false;
                }
            }
            if (!f364I) {
                super.mo510z(pendingIntent, componentName);
            }
        }
    }

    @C0376v0(19)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    public static class C0127g extends C0125f {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$a */
        public class C0128a implements RemoteControlClient.OnMetadataUpdateListener {
            public C0128a() {
            }

            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    C0127g.this.mo578y(19, -1, -1, RatingCompat.m289a(obj), (Bundle) null);
                }
            }
        }

        public C0127g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        /* renamed from: b */
        public RemoteControlClient.MetadataEditor mo512b(Bundle bundle) {
            long j;
            RemoteControlClient.MetadataEditor b = super.mo512b(bundle);
            PlaybackStateCompat playbackStateCompat = this.f407u;
            if (playbackStateCompat == null) {
                j = 0;
            } else {
                j = playbackStateCompat.mo594b();
            }
            if ((j & 128) != 0) {
                b.addEditableKey(268435457);
            }
            if (bundle == null) {
                return b;
            }
            if (bundle.containsKey(MediaMetadataCompat.f213Y)) {
                b.putLong(8, bundle.getLong(MediaMetadataCompat.f213Y));
            }
            if (bundle.containsKey(MediaMetadataCompat.f201N0)) {
                b.putObject(101, bundle.getParcelable(MediaMetadataCompat.f201N0));
            }
            if (bundle.containsKey(MediaMetadataCompat.f200M0)) {
                b.putObject(268435457, bundle.getParcelable(MediaMetadataCompat.f200M0));
            }
            return b;
        }

        /* renamed from: h */
        public void mo488h(C0119d dVar, Handler handler) {
            super.mo488h(dVar, handler);
            if (dVar == null) {
                this.f395i.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);
                return;
            }
            this.f395i.setMetadataUpdateListener(new C0128a());
        }

        /* renamed from: x */
        public int mo509x(long j) {
            int x = super.mo509x(j);
            return (j & 128) != 0 ? x | 512 : x;
        }
    }

    @C0376v0(28)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$i */
    public static class C0131i extends C0129h {
        public C0131i(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        /* renamed from: t */
        public void mo503t(C19616i.C19618b bVar) {
        }

        @C0359n0
        /* renamed from: w */
        public final C19616i.C19618b mo506w() {
            return new C19616i.C19618b(((MediaSession) this.f367a).getCurrentControllerInfo());
        }

        public C0131i(Object obj) {
            super(obj);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$j */
    public static class C0132j implements C0124e {

        /* renamed from: H */
        public static final int f379H = 0;

        /* renamed from: A */
        public int f380A;

        /* renamed from: B */
        public int f381B;

        /* renamed from: C */
        public Bundle f382C;

        /* renamed from: D */
        public int f383D;

        /* renamed from: E */
        public int f384E;

        /* renamed from: F */
        public C19645u f385F;

        /* renamed from: G */
        public C19645u.C19647b f386G = new C0133a();

        /* renamed from: a */
        public final Context f387a;

        /* renamed from: b */
        public final ComponentName f388b;

        /* renamed from: c */
        public final PendingIntent f389c;

        /* renamed from: d */
        public final C0135c f390d;

        /* renamed from: e */
        public final Token f391e;

        /* renamed from: f */
        public final String f392f;

        /* renamed from: g */
        public final String f393g;

        /* renamed from: h */
        public final AudioManager f394h;

        /* renamed from: i */
        public final RemoteControlClient f395i;

        /* renamed from: j */
        public final Object f396j = new Object();

        /* renamed from: k */
        public final RemoteCallbackList<C0150a> f397k = new RemoteCallbackList<>();

        /* renamed from: l */
        public C0136d f398l;

        /* renamed from: m */
        public boolean f399m = false;

        /* renamed from: n */
        public boolean f400n = false;

        /* renamed from: o */
        public boolean f401o = false;

        /* renamed from: p */
        public boolean f402p = false;

        /* renamed from: q */
        public volatile C0119d f403q;

        /* renamed from: r */
        public C19616i.C19618b f404r;

        /* renamed from: s */
        public int f405s;

        /* renamed from: t */
        public MediaMetadataCompat f406t;

        /* renamed from: u */
        public PlaybackStateCompat f407u;

        /* renamed from: v */
        public PendingIntent f408v;

        /* renamed from: w */
        public List<QueueItem> f409w;

        /* renamed from: x */
        public CharSequence f410x;

        /* renamed from: y */
        public int f411y;

        /* renamed from: z */
        public boolean f412z;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$a */
        public class C0133a extends C19645u.C19647b {
            public C0133a() {
            }

            /* renamed from: a */
            public void mo579a(C19645u uVar) {
                if (C0132j.this.f385F == uVar) {
                    C0132j jVar = C0132j.this;
                    C0132j.this.mo573K(new ParcelableVolumeInfo(jVar.f383D, jVar.f384E, uVar.mo58013c(), uVar.mo58012b(), uVar.mo58011a()));
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$b */
        public static final class C0134b {

            /* renamed from: a */
            public final String f414a;

            /* renamed from: b */
            public final Bundle f415b;

            /* renamed from: c */
            public final ResultReceiver f416c;

            public C0134b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f414a = str;
                this.f415b = bundle;
                this.f416c = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$c */
        public class C0135c extends C0153b.C0154a {
            public C0135c() {
            }

            /* renamed from: B */
            public String mo514B() {
                return C0132j.this.f393g;
            }

            /* renamed from: B1 */
            public PendingIntent mo515B1() {
                PendingIntent pendingIntent;
                synchronized (C0132j.this.f396j) {
                    pendingIntent = C0132j.this.f408v;
                }
                return pendingIntent;
            }

            /* renamed from: B2 */
            public void mo516B2(Uri uri, Bundle bundle) throws RemoteException {
                mo581F8(10, uri, bundle);
            }

            /* renamed from: B6 */
            public void mo517B6() throws RemoteException {
                mo582H0(16);
            }

            /* renamed from: C */
            public long mo518C() {
                long j;
                synchronized (C0132j.this.f396j) {
                    j = (long) C0132j.this.f405s;
                }
                return j;
            }

            /* renamed from: D5 */
            public boolean mo519D5() {
                return (C0132j.this.f405s & 2) != 0;
            }

            /* renamed from: E0 */
            public void mo520E0(boolean z) throws RemoteException {
                mo584T6(29, Boolean.valueOf(z));
            }

            /* renamed from: E8 */
            public void mo580E8(int i, Object obj, int i2) {
                C0132j.this.mo578y(i, i2, 0, obj, (Bundle) null);
            }

            /* renamed from: F8 */
            public void mo581F8(int i, Object obj, Bundle bundle) {
                C0132j.this.mo578y(i, 0, 0, obj, bundle);
            }

            /* renamed from: H0 */
            public void mo582H0(int i) {
                C0132j.this.mo578y(i, 0, 0, (Object) null, (Bundle) null);
            }

            /* renamed from: I6 */
            public void mo521I6(long j) throws RemoteException {
                mo584T6(18, Long.valueOf(j));
            }

            /* renamed from: J5 */
            public void mo522J5(String str, Bundle bundle) throws RemoteException {
                mo581F8(5, str, bundle);
            }

            /* renamed from: L0 */
            public List<QueueItem> mo523L0() {
                List<QueueItem> list;
                synchronized (C0132j.this.f396j) {
                    list = C0132j.this.f409w;
                }
                return list;
            }

            /* renamed from: L3 */
            public void mo524L3(int i) {
                mo583O0(28, i);
            }

            /* renamed from: M0 */
            public void mo525M0(int i) throws RemoteException {
                mo583O0(23, i);
            }

            /* renamed from: O0 */
            public void mo583O0(int i, int i2) {
                C0132j.this.mo578y(i, i2, 0, (Object) null, (Bundle) null);
            }

            /* renamed from: O5 */
            public void mo526O5() throws RemoteException {
                mo582H0(3);
            }

            /* renamed from: O7 */
            public void mo527O7() throws RemoteException {
                mo582H0(7);
            }

            /* renamed from: P0 */
            public int mo528P0() {
                return C0132j.this.f380A;
            }

            /* renamed from: Q */
            public PlaybackStateCompat mo529Q() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C0132j.this.f396j) {
                    C0132j jVar = C0132j.this;
                    playbackStateCompat = jVar.f407u;
                    mediaMetadataCompat = jVar.f406t;
                }
                return MediaSessionCompat.m593j(playbackStateCompat, mediaMetadataCompat);
            }

            /* renamed from: T6 */
            public void mo584T6(int i, Object obj) {
                C0132j.this.mo578y(i, 0, 0, obj, (Bundle) null);
            }

            /* renamed from: W */
            public int mo530W() {
                return C0132j.this.f411y;
            }

            /* renamed from: X2 */
            public boolean mo531X2(KeyEvent keyEvent) {
                boolean z = true;
                if ((C0132j.this.f405s & 1) == 0) {
                    z = false;
                }
                if (z) {
                    mo584T6(21, keyEvent);
                }
                return z;
            }

            /* renamed from: Z */
            public void mo532Z() throws RemoteException {
                mo582H0(12);
            }

            /* renamed from: Z0 */
            public void mo533Z0(String str, Bundle bundle) throws RemoteException {
                mo581F8(20, str, bundle);
            }

            /* renamed from: b5 */
            public void mo534b5(C0150a aVar) {
                if (C0132j.this.f399m) {
                    try {
                        aVar.mo307d0();
                    } catch (Exception unused) {
                    }
                } else {
                    C0132j.this.f397k.register(aVar, new C19616i.C19618b(C19616i.C19618b.f50245b, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            /* renamed from: e4 */
            public void mo535e4(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                mo584T6(1, new C0134b(str, bundle, resultReceiverWrapper.f348a));
            }

            /* renamed from: e8 */
            public ParcelableVolumeInfo mo536e8() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (C0132j.this.f396j) {
                    C0132j jVar = C0132j.this;
                    i = jVar.f383D;
                    i2 = jVar.f384E;
                    C19645u uVar = jVar.f385F;
                    i3 = 2;
                    if (i == 2) {
                        int c = uVar.mo58013c();
                        int b = uVar.mo58012b();
                        i4 = uVar.mo58011a();
                        i5 = b;
                        i3 = c;
                    } else {
                        i5 = jVar.f394h.getStreamMaxVolume(i2);
                        i4 = C0132j.this.f394h.getStreamVolume(i2);
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i3, i5, i4);
            }

            /* renamed from: g1 */
            public boolean mo537g1() {
                return false;
            }

            /* renamed from: g3 */
            public void mo538g3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                mo581F8(31, ratingCompat, bundle);
            }

            public Bundle getExtras() {
                Bundle bundle;
                synchronized (C0132j.this.f396j) {
                    bundle = C0132j.this.f382C;
                }
                return bundle;
            }

            public MediaMetadataCompat getMetadata() {
                return C0132j.this.f406t;
            }

            public String getPackageName() {
                return C0132j.this.f392f;
            }

            /* renamed from: h0 */
            public int mo542h0() {
                return C0132j.this.f381B;
            }

            /* renamed from: i0 */
            public boolean mo543i0() {
                return C0132j.this.f412z;
            }

            /* renamed from: i1 */
            public void mo544i1(Uri uri, Bundle bundle) throws RemoteException {
                mo581F8(6, uri, bundle);
            }

            /* renamed from: i2 */
            public void mo545i2(String str, Bundle bundle) throws RemoteException {
                mo581F8(4, str, bundle);
            }

            /* renamed from: i4 */
            public void mo546i4() throws RemoteException {
                mo582H0(17);
            }

            /* renamed from: j7 */
            public void mo547j7(int i, int i2, String str) {
                C0132j.this.mo576a(i, i2);
            }

            /* renamed from: k5 */
            public void mo548k5(RatingCompat ratingCompat) throws RemoteException {
                mo584T6(19, ratingCompat);
            }

            /* renamed from: l0 */
            public void mo549l0(int i) throws RemoteException {
                mo583O0(30, i);
            }

            /* renamed from: l3 */
            public void mo550l3(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                mo580E8(26, mediaDescriptionCompat, i);
            }

            /* renamed from: m2 */
            public void mo551m2(String str, Bundle bundle) throws RemoteException {
                mo581F8(8, str, bundle);
            }

            /* renamed from: n5 */
            public void mo552n5(int i, int i2, String str) {
                C0132j.this.mo574M(i, i2);
            }

            public void next() throws RemoteException {
                mo582H0(14);
            }

            /* renamed from: o0 */
            public void mo554o0(MediaDescriptionCompat mediaDescriptionCompat) {
                mo584T6(27, mediaDescriptionCompat);
            }

            /* renamed from: p0 */
            public void mo555p0(MediaDescriptionCompat mediaDescriptionCompat) {
                mo584T6(25, mediaDescriptionCompat);
            }

            public void previous() throws RemoteException {
                mo582H0(15);
            }

            /* renamed from: r2 */
            public void mo557r2(String str, Bundle bundle) throws RemoteException {
                mo581F8(9, str, bundle);
            }

            /* renamed from: r6 */
            public void mo558r6(C0150a aVar) {
                C0132j.this.f397k.unregister(aVar);
            }

            public void stop() throws RemoteException {
                mo582H0(13);
            }

            /* renamed from: w0 */
            public CharSequence mo560w0() {
                return C0132j.this.f410x;
            }

            /* renamed from: w4 */
            public void mo561w4(long j) {
                mo584T6(11, Long.valueOf(j));
            }

            /* renamed from: x4 */
            public void mo562x4(boolean z) throws RemoteException {
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$d */
        public class C0136d extends Handler {

            /* renamed from: A */
            public static final int f418A = 26;

            /* renamed from: B */
            public static final int f419B = 27;

            /* renamed from: C */
            public static final int f420C = 28;

            /* renamed from: D */
            public static final int f421D = 29;

            /* renamed from: E */
            public static final int f422E = 30;

            /* renamed from: F */
            public static final int f423F = 127;

            /* renamed from: G */
            public static final int f424G = 126;

            /* renamed from: b */
            public static final int f425b = 1;

            /* renamed from: c */
            public static final int f426c = 2;

            /* renamed from: d */
            public static final int f427d = 3;

            /* renamed from: e */
            public static final int f428e = 4;

            /* renamed from: f */
            public static final int f429f = 5;

            /* renamed from: g */
            public static final int f430g = 6;

            /* renamed from: h */
            public static final int f431h = 7;

            /* renamed from: i */
            public static final int f432i = 8;

            /* renamed from: j */
            public static final int f433j = 9;

            /* renamed from: k */
            public static final int f434k = 10;

            /* renamed from: l */
            public static final int f435l = 11;

            /* renamed from: m */
            public static final int f436m = 12;

            /* renamed from: n */
            public static final int f437n = 13;

            /* renamed from: o */
            public static final int f438o = 14;

            /* renamed from: p */
            public static final int f439p = 15;

            /* renamed from: q */
            public static final int f440q = 16;

            /* renamed from: r */
            public static final int f441r = 17;

            /* renamed from: s */
            public static final int f442s = 18;

            /* renamed from: t */
            public static final int f443t = 19;

            /* renamed from: u */
            public static final int f444u = 31;

            /* renamed from: v */
            public static final int f445v = 20;

            /* renamed from: w */
            public static final int f446w = 21;

            /* renamed from: x */
            public static final int f447x = 22;

            /* renamed from: y */
            public static final int f448y = 23;

            /* renamed from: z */
            public static final int f449z = 25;

            public C0136d(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            public final void mo585a(KeyEvent keyEvent, C0119d dVar) {
                long j;
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = C0132j.this.f407u;
                    if (playbackStateCompat == null) {
                        j = 0;
                    } else {
                        j = playbackStateCompat.mo594b();
                    }
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 126) {
                        if (keyCode != 127) {
                            switch (keyCode) {
                                case 86:
                                    if ((j & 1) != 0) {
                                        dVar.mo431C();
                                        return;
                                    }
                                    return;
                                case 87:
                                    if ((j & 32) != 0) {
                                        dVar.mo458z();
                                        return;
                                    }
                                    return;
                                case 88:
                                    if ((j & 16) != 0) {
                                        dVar.mo429A();
                                        return;
                                    }
                                    return;
                                case 89:
                                    if ((j & 8) != 0) {
                                        dVar.mo451s();
                                        return;
                                    }
                                    return;
                                case 90:
                                    if ((j & 64) != 0) {
                                        dVar.mo438f();
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if ((j & 2) != 0) {
                            dVar.mo440h();
                        }
                    } else if ((j & 4) != 0) {
                        dVar.mo441i();
                    }
                }
            }

            public void handleMessage(Message message) {
                QueueItem queueItem;
                C0119d dVar = C0132j.this.f403q;
                if (dVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.m591b(data);
                    C0132j.this.mo503t(new C19616i.C19618b(data.getString(MediaSessionCompat.f313L), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle(MediaSessionCompat.f316O);
                    MediaSessionCompat.m591b(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                C0134b bVar = (C0134b) message.obj;
                                dVar.mo436d(bVar.f414a, bVar.f415b, bVar.f416c);
                                break;
                            case 2:
                                C0132j.this.mo576a(message.arg1, 0);
                                break;
                            case 3:
                                dVar.mo445m();
                                break;
                            case 4:
                                dVar.mo446n((String) message.obj, bundle);
                                break;
                            case 5:
                                dVar.mo447o((String) message.obj, bundle);
                                break;
                            case 6:
                                dVar.mo448p((Uri) message.obj, bundle);
                                break;
                            case 7:
                                dVar.mo441i();
                                break;
                            case 8:
                                dVar.mo442j((String) message.obj, bundle);
                                break;
                            case 9:
                                dVar.mo443k((String) message.obj, bundle);
                                break;
                            case 10:
                                dVar.mo444l((Uri) message.obj, bundle);
                                break;
                            case 11:
                                dVar.mo430B(((Long) message.obj).longValue());
                                break;
                            case 12:
                                dVar.mo440h();
                                break;
                            case 13:
                                dVar.mo431C();
                                break;
                            case 14:
                                dVar.mo458z();
                                break;
                            case 15:
                                dVar.mo429A();
                                break;
                            case 16:
                                dVar.mo438f();
                                break;
                            case 17:
                                dVar.mo451s();
                                break;
                            case 18:
                                dVar.mo452t(((Long) message.obj).longValue());
                                break;
                            case 19:
                                dVar.mo454v((RatingCompat) message.obj);
                                break;
                            case 20:
                                dVar.mo437e((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!dVar.mo439g(intent)) {
                                    mo585a(keyEvent, dVar);
                                    break;
                                }
                                break;
                            case 22:
                                C0132j.this.mo574M(message.arg1, 0);
                                break;
                            case 23:
                                dVar.mo456x(message.arg1);
                                break;
                            case 25:
                                dVar.mo434b((MediaDescriptionCompat) message.obj);
                                break;
                            case 26:
                                dVar.mo435c((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case 27:
                                dVar.mo449q((MediaDescriptionCompat) message.obj);
                                break;
                            case 28:
                                List<QueueItem> list = C0132j.this.f409w;
                                if (list != null) {
                                    int i = message.arg1;
                                    if (i < 0 || i >= list.size()) {
                                        queueItem = null;
                                    } else {
                                        queueItem = C0132j.this.f409w.get(message.arg1);
                                    }
                                    if (queueItem != null) {
                                        dVar.mo449q(queueItem.mo399c());
                                        break;
                                    }
                                }
                                break;
                            case 29:
                                dVar.mo453u(((Boolean) message.obj).booleanValue());
                                break;
                            case 30:
                                dVar.mo457y(message.arg1);
                                break;
                            case 31:
                                dVar.mo455w((RatingCompat) message.obj, bundle);
                                break;
                        }
                    } finally {
                        C0132j.this.mo503t((C19616i.C19618b) null);
                    }
                }
            }
        }

        public C0132j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.f387a = context;
                this.f392f = context.getPackageName();
                this.f394h = (AudioManager) context.getSystemService("audio");
                this.f393g = str;
                this.f388b = componentName;
                this.f389c = pendingIntent;
                C0135c cVar = new C0135c();
                this.f390d = cVar;
                this.f391e = new Token(cVar);
                this.f411y = 0;
                this.f383D = 1;
                this.f384E = 3;
                this.f395i = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        /* renamed from: A */
        public final void mo563A(boolean z) {
            for (int beginBroadcast = this.f397k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f397k.getBroadcastItem(beginBroadcast).mo337J6(z);
                } catch (RemoteException unused) {
                }
            }
            this.f397k.finishBroadcast();
        }

        /* renamed from: B */
        public final void mo564B(String str, Bundle bundle) {
            for (int beginBroadcast = this.f397k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f397k.getBroadcastItem(beginBroadcast).mo339U0(str, bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f397k.finishBroadcast();
        }

        /* renamed from: C */
        public final void mo565C(Bundle bundle) {
            for (int beginBroadcast = this.f397k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f397k.getBroadcastItem(beginBroadcast).mo309s0(bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f397k.finishBroadcast();
        }

        /* renamed from: D */
        public final void mo566D(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f397k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f397k.getBroadcastItem(beginBroadcast).mo308m3(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f397k.finishBroadcast();
        }

        /* renamed from: E */
        public final void mo567E(List<QueueItem> list) {
            for (int beginBroadcast = this.f397k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f397k.getBroadcastItem(beginBroadcast).mo305Y(list);
                } catch (RemoteException unused) {
                }
            }
            this.f397k.finishBroadcast();
        }

        /* renamed from: E0 */
        public void mo481E0(boolean z) {
            if (this.f412z != z) {
                this.f412z = z;
                mo563A(z);
            }
        }

        /* renamed from: F */
        public final void mo568F(CharSequence charSequence) {
            for (int beginBroadcast = this.f397k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f397k.getBroadcastItem(beginBroadcast).mo304C0(charSequence);
                } catch (RemoteException unused) {
                }
            }
            this.f397k.finishBroadcast();
        }

        /* renamed from: G */
        public final void mo569G(int i) {
            for (int beginBroadcast = this.f397k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f397k.getBroadcastItem(beginBroadcast).mo336D7(i);
                } catch (RemoteException unused) {
                }
            }
            this.f397k.finishBroadcast();
        }

        /* renamed from: H */
        public final void mo570H() {
            for (int beginBroadcast = this.f397k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f397k.getBroadcastItem(beginBroadcast).mo307d0();
                } catch (RemoteException unused) {
                }
            }
            this.f397k.finishBroadcast();
            this.f397k.kill();
        }

        /* renamed from: I */
        public final void mo571I(int i) {
            for (int beginBroadcast = this.f397k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f397k.getBroadcastItem(beginBroadcast).mo340U3(i);
                } catch (RemoteException unused) {
                }
            }
            this.f397k.finishBroadcast();
        }

        /* renamed from: J */
        public final void mo572J(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f397k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f397k.getBroadcastItem(beginBroadcast).mo335A8(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f397k.finishBroadcast();
        }

        /* renamed from: K */
        public void mo573K(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.f397k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f397k.getBroadcastItem(beginBroadcast).mo306Y4(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.f397k.finishBroadcast();
        }

        /* renamed from: L */
        public void mo507L(PlaybackStateCompat playbackStateCompat) {
            this.f395i.setPlaybackState(mo577c(playbackStateCompat.mo607n()));
        }

        /* renamed from: M */
        public void mo574M(int i, int i2) {
            if (this.f383D == 2) {
                C19645u uVar = this.f385F;
                if (uVar != null) {
                    uVar.mo58016f(i);
                    return;
                }
                return;
            }
            this.f394h.setStreamVolume(this.f384E, i, i2);
        }

        /* renamed from: M0 */
        public void mo482M0(int i) {
            if (this.f380A != i) {
                this.f380A = i;
                mo569G(i);
            }
        }

        /* renamed from: N */
        public void mo508N(PendingIntent pendingIntent, ComponentName componentName) {
            this.f394h.unregisterMediaButtonEventReceiver(componentName);
        }

        /* renamed from: O */
        public boolean mo575O() {
            if (this.f400n) {
                boolean z = this.f401o;
                if (!z && (this.f405s & 1) != 0) {
                    mo510z(this.f389c, this.f388b);
                    this.f401o = true;
                } else if (z && (this.f405s & 1) == 0) {
                    mo508N(this.f389c, this.f388b);
                    this.f401o = false;
                }
                boolean z2 = this.f402p;
                if (!z2 && (this.f405s & 2) != 0) {
                    this.f394h.registerRemoteControlClient(this.f395i);
                    this.f402p = true;
                    return true;
                } else if (!z2 || (this.f405s & 2) != 0) {
                    return false;
                } else {
                    this.f395i.setPlaybackState(0);
                    this.f394h.unregisterRemoteControlClient(this.f395i);
                    this.f402p = false;
                    return false;
                }
            } else {
                if (this.f401o) {
                    mo508N(this.f389c, this.f388b);
                    this.f401o = false;
                }
                if (!this.f402p) {
                    return false;
                }
                this.f395i.setPlaybackState(0);
                this.f394h.unregisterRemoteControlClient(this.f395i);
                this.f402p = false;
                return false;
            }
        }

        /* renamed from: Q */
        public PlaybackStateCompat mo483Q() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f396j) {
                playbackStateCompat = this.f407u;
            }
            return playbackStateCompat;
        }

        /* renamed from: a */
        public void mo576a(int i, int i2) {
            if (this.f383D == 2) {
                C19645u uVar = this.f385F;
                if (uVar != null) {
                    uVar.mo58015e(i);
                    return;
                }
                return;
            }
            this.f394h.adjustStreamVolume(this.f384E, i, i2);
        }

        /* renamed from: b */
        public RemoteControlClient.MetadataEditor mo512b(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f395i.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey(MediaMetadataCompat.f196I0)) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable(MediaMetadataCompat.f196I0);
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey(MediaMetadataCompat.f198K0)) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(MediaMetadataCompat.f198K0);
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey(MediaMetadataCompat.f227v)) {
                editMetadata.putString(1, bundle.getString(MediaMetadataCompat.f227v));
            }
            if (bundle.containsKey(MediaMetadataCompat.f195H0)) {
                editMetadata.putString(13, bundle.getString(MediaMetadataCompat.f195H0));
            }
            if (bundle.containsKey(MediaMetadataCompat.f224f)) {
                editMetadata.putString(2, bundle.getString(MediaMetadataCompat.f224f));
            }
            if (bundle.containsKey(MediaMetadataCompat.f228w)) {
                editMetadata.putString(3, bundle.getString(MediaMetadataCompat.f228w));
            }
            if (bundle.containsKey(MediaMetadataCompat.f231z)) {
                editMetadata.putString(15, bundle.getString(MediaMetadataCompat.f231z));
            }
            if (bundle.containsKey(MediaMetadataCompat.f230y)) {
                editMetadata.putString(4, bundle.getString(MediaMetadataCompat.f230y));
            }
            if (bundle.containsKey(MediaMetadataCompat.f211X)) {
                editMetadata.putString(5, bundle.getString(MediaMetadataCompat.f211X));
            }
            if (bundle.containsKey(MediaMetadataCompat.f194G0)) {
                editMetadata.putLong(14, bundle.getLong(MediaMetadataCompat.f194G0));
            }
            if (bundle.containsKey(MediaMetadataCompat.f226g)) {
                editMetadata.putLong(9, bundle.getLong(MediaMetadataCompat.f226g));
            }
            if (bundle.containsKey(MediaMetadataCompat.f215Z)) {
                editMetadata.putString(6, bundle.getString(MediaMetadataCompat.f215Z));
            }
            if (bundle.containsKey(MediaMetadataCompat.f222e)) {
                editMetadata.putString(7, bundle.getString(MediaMetadataCompat.f222e));
            }
            if (bundle.containsKey(MediaMetadataCompat.f192E0)) {
                editMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.f192E0));
            }
            if (bundle.containsKey(MediaMetadataCompat.f229x)) {
                editMetadata.putString(11, bundle.getString(MediaMetadataCompat.f229x));
            }
            return editMetadata;
        }

        /* renamed from: c */
        public int mo577c(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* renamed from: d */
        public boolean mo484d() {
            return this.f400n;
        }

        /* renamed from: e */
        public Token mo485e() {
            return this.f391e;
        }

        /* renamed from: f */
        public void mo486f(int i) {
            synchronized (this.f396j) {
                this.f405s = i;
            }
            mo575O();
        }

        /* renamed from: g */
        public void mo487g(String str, Bundle bundle) {
            mo564B(str, bundle);
        }

        /* renamed from: h */
        public void mo488h(C0119d dVar, Handler handler) {
            this.f403q = dVar;
            if (dVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f396j) {
                    C0136d dVar2 = this.f398l;
                    if (dVar2 != null) {
                        dVar2.removeCallbacksAndMessages((Object) null);
                    }
                    this.f398l = new C0136d(handler.getLooper());
                    this.f403q.mo432D(this, handler);
                }
            }
        }

        /* renamed from: i */
        public void mo489i(CharSequence charSequence) {
            this.f410x = charSequence;
            mo568F(charSequence);
        }

        /* renamed from: j */
        public void mo490j(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.C0071c(mediaMetadataCompat, MediaSessionCompat.f317P).mo217a();
            }
            synchronized (this.f396j) {
                this.f406t = mediaMetadataCompat;
            }
            mo566D(mediaMetadataCompat);
            if (this.f400n) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = mediaMetadataCompat.mo202d();
                }
                mo512b(bundle).apply();
            }
        }

        /* renamed from: k */
        public void mo491k(int i) {
            this.f411y = i;
        }

        /* renamed from: l */
        public void mo492l(List<QueueItem> list) {
            this.f409w = list;
            mo567E(list);
        }

        /* renamed from: l0 */
        public void mo493l0(int i) {
            if (this.f381B != i) {
                this.f381B = i;
                mo571I(i);
            }
        }

        /* renamed from: m */
        public void mo494m(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f396j) {
                this.f407u = playbackStateCompat;
            }
            mo572J(playbackStateCompat);
            if (this.f400n) {
                if (playbackStateCompat == null) {
                    this.f395i.setPlaybackState(0);
                    this.f395i.setTransportControlFlags(0);
                    return;
                }
                mo507L(playbackStateCompat);
                this.f395i.setTransportControlFlags(mo509x(playbackStateCompat.mo594b()));
            }
        }

        /* renamed from: n */
        public String mo495n() {
            return null;
        }

        /* renamed from: o */
        public void mo496o(PendingIntent pendingIntent) {
            synchronized (this.f396j) {
                this.f408v = pendingIntent;
            }
        }

        /* renamed from: p */
        public void mo497p(int i) {
            C19645u uVar = this.f385F;
            if (uVar != null) {
                uVar.mo58017g((C19645u.C19647b) null);
            }
            this.f384E = i;
            this.f383D = 1;
            int i2 = this.f383D;
            int i3 = this.f384E;
            mo573K(new ParcelableVolumeInfo(i2, i3, 2, this.f394h.getStreamMaxVolume(i3), this.f394h.getStreamVolume(this.f384E)));
        }

        /* renamed from: q */
        public void mo498q(PendingIntent pendingIntent) {
        }

        /* renamed from: r */
        public Object mo499r() {
            return null;
        }

        public void release() {
            this.f400n = false;
            this.f399m = true;
            mo575O();
            mo570H();
        }

        /* renamed from: s */
        public void mo501s(boolean z) {
            if (z != this.f400n) {
                this.f400n = z;
                if (mo575O()) {
                    mo490j(this.f406t);
                    mo494m(this.f407u);
                }
            }
        }

        public void setExtras(Bundle bundle) {
            this.f382C = bundle;
            mo565C(bundle);
        }

        /* renamed from: t */
        public void mo503t(C19616i.C19618b bVar) {
            synchronized (this.f396j) {
                this.f404r = bVar;
            }
        }

        /* renamed from: u */
        public Object mo504u() {
            return null;
        }

        /* renamed from: v */
        public void mo505v(C19645u uVar) {
            if (uVar != null) {
                C19645u uVar2 = this.f385F;
                if (uVar2 != null) {
                    uVar2.mo58017g((C19645u.C19647b) null);
                }
                this.f383D = 2;
                this.f385F = uVar;
                mo573K(new ParcelableVolumeInfo(this.f383D, this.f384E, this.f385F.mo58013c(), this.f385F.mo58012b(), this.f385F.mo58011a()));
                uVar.mo58017g(this.f386G);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        /* renamed from: w */
        public C19616i.C19618b mo506w() {
            C19616i.C19618b bVar;
            synchronized (this.f396j) {
                bVar = this.f404r;
            }
            return bVar;
        }

        /* renamed from: x */
        public int mo509x(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        /* renamed from: y */
        public void mo578y(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f396j) {
                C0136d dVar = this.f398l;
                if (dVar != null) {
                    Message obtainMessage = dVar.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(MediaSessionCompat.f313L, C19616i.C19618b.f50245b);
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle(MediaSessionCompat.f316O, bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* renamed from: z */
        public void mo510z(PendingIntent pendingIntent, ComponentName componentName) {
            this.f394h.registerMediaButtonEventReceiver(componentName);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$k */
    public interface C0137k {
        /* renamed from: a */
        void mo587a();
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$l */
    public @interface C0138l {
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, (ComponentName) null, (PendingIntent) null);
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    /* renamed from: b */
    public static void m591b(@C0363p0 Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: c */
    public static MediaSessionCompat m592c(Context context, Object obj) {
        if (context == null || obj == null) {
            return null;
        }
        return new MediaSessionCompat(context, (C0124e) new C0129h(obj));
    }

    /* renamed from: j */
    public static PlaybackStateCompat m593j(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j2 = -1;
        if (playbackStateCompat.mo606m() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.mo607n() != 3 && playbackStateCompat.mo607n() != 4 && playbackStateCompat.mo607n() != 5) {
            return playbackStateCompat;
        }
        long j3 = playbackStateCompat.mo603j();
        if (j3 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long k = ((long) (playbackStateCompat.mo604k() * ((float) (elapsedRealtime - j3)))) + playbackStateCompat.mo606m();
        if (mediaMetadataCompat != null && mediaMetadataCompat.mo200a(MediaMetadataCompat.f226g)) {
            j2 = mediaMetadataCompat.mo205f(MediaMetadataCompat.f226g);
        }
        if (j2 >= 0 && k > j2) {
            j = j2;
        } else if (k < 0) {
            j = 0;
        } else {
            j = k;
        }
        return new PlaybackStateCompat.C0144c(playbackStateCompat).mo638k(playbackStateCompat.mo607n(), j, playbackStateCompat.mo604k(), elapsedRealtime).mo630c();
    }

    /* renamed from: A */
    public void mo371A(CharSequence charSequence) {
        this.f341a.mo489i(charSequence);
    }

    /* renamed from: B */
    public void mo372B(int i) {
        this.f341a.mo491k(i);
    }

    /* renamed from: C */
    public void mo373C(int i) {
        this.f341a.mo482M0(i);
    }

    /* renamed from: D */
    public void mo374D(PendingIntent pendingIntent) {
        this.f341a.mo496o(pendingIntent);
    }

    /* renamed from: E */
    public void mo375E(int i) {
        this.f341a.mo493l0(i);
    }

    /* renamed from: a */
    public void mo376a(C0137k kVar) {
        if (kVar != null) {
            this.f343c.add(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    /* renamed from: d */
    public String mo377d() {
        return this.f341a.mo495n();
    }

    /* renamed from: e */
    public MediaControllerCompat mo378e() {
        return this.f342b;
    }

    @C0359n0
    /* renamed from: f */
    public final C19616i.C19618b mo379f() {
        return this.f341a.mo506w();
    }

    /* renamed from: g */
    public Object mo380g() {
        return this.f341a.mo504u();
    }

    /* renamed from: h */
    public Object mo381h() {
        return this.f341a.mo499r();
    }

    /* renamed from: i */
    public Token mo382i() {
        return this.f341a.mo485e();
    }

    /* renamed from: k */
    public boolean mo383k() {
        return this.f341a.mo484d();
    }

    /* renamed from: l */
    public void mo384l() {
        this.f341a.release();
    }

    /* renamed from: m */
    public void mo385m(C0137k kVar) {
        if (kVar != null) {
            this.f343c.remove(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    /* renamed from: n */
    public void mo386n(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f341a.mo487g(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    /* renamed from: o */
    public void mo387o(boolean z) {
        this.f341a.mo501s(z);
        Iterator<C0137k> it = this.f343c.iterator();
        while (it.hasNext()) {
            it.next().mo587a();
        }
    }

    /* renamed from: p */
    public void mo388p(C0119d dVar) {
        mo389q(dVar, (Handler) null);
    }

    /* renamed from: q */
    public void mo389q(C0119d dVar, Handler handler) {
        if (dVar == null) {
            this.f341a.mo488h((C0119d) null, (Handler) null);
            return;
        }
        C0124e eVar = this.f341a;
        if (handler == null) {
            handler = new Handler();
        }
        eVar.mo488h(dVar, handler);
    }

    /* renamed from: r */
    public void mo390r(boolean z) {
        this.f341a.mo481E0(z);
    }

    /* renamed from: s */
    public void mo391s(Bundle bundle) {
        this.f341a.setExtras(bundle);
    }

    /* renamed from: t */
    public void mo392t(int i) {
        this.f341a.mo486f(i);
    }

    /* renamed from: u */
    public void mo393u(PendingIntent pendingIntent) {
        this.f341a.mo498q(pendingIntent);
    }

    /* renamed from: v */
    public void mo394v(MediaMetadataCompat mediaMetadataCompat) {
        this.f341a.mo490j(mediaMetadataCompat);
    }

    /* renamed from: w */
    public void mo395w(PlaybackStateCompat playbackStateCompat) {
        this.f341a.mo494m(playbackStateCompat);
    }

    /* renamed from: x */
    public void mo396x(int i) {
        this.f341a.mo497p(i);
    }

    /* renamed from: y */
    public void mo397y(C19645u uVar) {
        if (uVar != null) {
            this.f341a.mo505v(uVar);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    /* renamed from: z */
    public void mo398z(List<QueueItem> list) {
        this.f341a.mo492l(list);
    }

    @RestrictTo({RestrictTo.Scope.f842a})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0114a();

        /* renamed from: a */
        public ResultReceiver f348a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public static class C0114a implements Parcelable.Creator<ResultReceiverWrapper> {
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.f348a = resultReceiver;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f348a.writeToParcel(parcel, i);
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f348a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    public MediaSessionCompat(Context context, String str, Bundle bundle) {
        this(context, str, (ComponentName) null, (PendingIntent) null, bundle);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f343c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            componentName = componentName == null ? C19632a.m91257c(context) : componentName;
            if (componentName != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                C0131i iVar = new C0131i(context, str, bundle);
                this.f341a = iVar;
                mo388p(new C0116a());
                iVar.mo498q(pendingIntent);
            } else {
                C0129h hVar = new C0129h(context, str, bundle);
                this.f341a = hVar;
                mo388p(new C0117b());
                hVar.mo498q(pendingIntent);
            }
            this.f342b = new MediaControllerCompat(context, this);
            if (f317P == 0) {
                f317P = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    @C0376v0(21)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$h */
    public static class C0129h implements C0124e {

        /* renamed from: a */
        public final Object f367a;

        /* renamed from: b */
        public final Token f368b;

        /* renamed from: c */
        public boolean f369c = false;

        /* renamed from: d */
        public final RemoteCallbackList<C0150a> f370d = new RemoteCallbackList<>();

        /* renamed from: e */
        public PlaybackStateCompat f371e;

        /* renamed from: f */
        public List<QueueItem> f372f;

        /* renamed from: g */
        public MediaMetadataCompat f373g;

        /* renamed from: h */
        public int f374h;

        /* renamed from: i */
        public boolean f375i;

        /* renamed from: j */
        public int f376j;

        /* renamed from: k */
        public int f377k;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$h$a */
        public class C0130a extends C0153b.C0154a {
            public C0130a() {
            }

            /* renamed from: B */
            public String mo514B() {
                throw new AssertionError();
            }

            /* renamed from: B1 */
            public PendingIntent mo515B1() {
                throw new AssertionError();
            }

            /* renamed from: B2 */
            public void mo516B2(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: B6 */
            public void mo517B6() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: C */
            public long mo518C() {
                throw new AssertionError();
            }

            /* renamed from: D5 */
            public boolean mo519D5() {
                throw new AssertionError();
            }

            /* renamed from: E0 */
            public void mo520E0(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: I6 */
            public void mo521I6(long j) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: J5 */
            public void mo522J5(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: L0 */
            public List<QueueItem> mo523L0() {
                return null;
            }

            /* renamed from: L3 */
            public void mo524L3(int i) {
                throw new AssertionError();
            }

            /* renamed from: M0 */
            public void mo525M0(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: O5 */
            public void mo526O5() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: O7 */
            public void mo527O7() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: P0 */
            public int mo528P0() {
                return C0129h.this.f376j;
            }

            /* renamed from: Q */
            public PlaybackStateCompat mo529Q() {
                C0129h hVar = C0129h.this;
                return MediaSessionCompat.m593j(hVar.f371e, hVar.f373g);
            }

            /* renamed from: W */
            public int mo530W() {
                return C0129h.this.f374h;
            }

            /* renamed from: X2 */
            public boolean mo531X2(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: Z */
            public void mo532Z() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: Z0 */
            public void mo533Z0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b5 */
            public void mo534b5(C0150a aVar) {
                C0129h hVar = C0129h.this;
                if (!hVar.f369c) {
                    String n = hVar.mo495n();
                    if (n == null) {
                        n = C19616i.C19618b.f50245b;
                    }
                    C0129h.this.f370d.register(aVar, new C19616i.C19618b(n, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            /* renamed from: e4 */
            public void mo535e4(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            /* renamed from: e8 */
            public ParcelableVolumeInfo mo536e8() {
                throw new AssertionError();
            }

            /* renamed from: g1 */
            public boolean mo537g1() {
                return false;
            }

            /* renamed from: g3 */
            public void mo538g3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            public String getPackageName() {
                throw new AssertionError();
            }

            /* renamed from: h0 */
            public int mo542h0() {
                return C0129h.this.f377k;
            }

            /* renamed from: i0 */
            public boolean mo543i0() {
                return C0129h.this.f375i;
            }

            /* renamed from: i1 */
            public void mo544i1(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: i2 */
            public void mo545i2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: i4 */
            public void mo546i4() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: j7 */
            public void mo547j7(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: k5 */
            public void mo548k5(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: l0 */
            public void mo549l0(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: l3 */
            public void mo550l3(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            /* renamed from: m2 */
            public void mo551m2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: n5 */
            public void mo552n5(int i, int i2, String str) {
                throw new AssertionError();
            }

            public void next() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: o0 */
            public void mo554o0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: p0 */
            public void mo555p0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: r2 */
            public void mo557r2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: r6 */
            public void mo558r6(C0150a aVar) {
                C0129h.this.f370d.unregister(aVar);
            }

            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: w0 */
            public CharSequence mo560w0() {
                throw new AssertionError();
            }

            /* renamed from: w4 */
            public void mo561w4(long j) {
                throw new AssertionError();
            }

            /* renamed from: x4 */
            public void mo562x4(boolean z) throws RemoteException {
            }
        }

        public C0129h(Context context, String str, Bundle bundle) {
            Object b = C0166g.m1103b(context, str);
            this.f367a = b;
            this.f368b = new Token(C0166g.m1104c(b), new C0130a(), bundle);
        }

        /* renamed from: E0 */
        public void mo481E0(boolean z) {
            if (this.f375i != z) {
                this.f375i = z;
                for (int beginBroadcast = this.f370d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f370d.getBroadcastItem(beginBroadcast).mo337J6(z);
                    } catch (RemoteException unused) {
                    }
                }
                this.f370d.finishBroadcast();
            }
        }

        /* renamed from: M0 */
        public void mo482M0(int i) {
            if (this.f376j != i) {
                this.f376j = i;
                for (int beginBroadcast = this.f370d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f370d.getBroadcastItem(beginBroadcast).mo336D7(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f370d.finishBroadcast();
            }
        }

        /* renamed from: Q */
        public PlaybackStateCompat mo483Q() {
            return this.f371e;
        }

        /* renamed from: d */
        public boolean mo484d() {
            return C0166g.m1106e(this.f367a);
        }

        /* renamed from: e */
        public Token mo485e() {
            return this.f368b;
        }

        /* renamed from: f */
        public void mo486f(int i) {
            C0166g.m1112k(this.f367a, i);
        }

        /* renamed from: g */
        public void mo487g(String str, Bundle bundle) {
            C0166g.m1108g(this.f367a, str, bundle);
        }

        /* renamed from: h */
        public void mo488h(C0119d dVar, Handler handler) {
            Object obj;
            Object obj2 = this.f367a;
            if (dVar == null) {
                obj = null;
            } else {
                obj = dVar.f355a;
            }
            C0166g.m1110i(obj2, obj, handler);
            if (dVar != null) {
                dVar.mo432D(this, handler);
            }
        }

        /* renamed from: i */
        public void mo489i(CharSequence charSequence) {
            C0166g.m1119r(this.f367a, charSequence);
        }

        /* renamed from: j */
        public void mo490j(MediaMetadataCompat mediaMetadataCompat) {
            Object obj;
            this.f373g = mediaMetadataCompat;
            Object obj2 = this.f367a;
            if (mediaMetadataCompat == null) {
                obj = null;
            } else {
                obj = mediaMetadataCompat.mo206g();
            }
            C0166g.m1114m(obj2, obj);
        }

        /* renamed from: k */
        public void mo491k(int i) {
            C0170h.m1142a(this.f367a, i);
        }

        /* renamed from: l */
        public void mo492l(List<QueueItem> list) {
            ArrayList arrayList;
            this.f372f = list;
            if (list != null) {
                arrayList = new ArrayList();
                for (QueueItem e : list) {
                    arrayList.add(e.mo402e());
                }
            } else {
                arrayList = null;
            }
            C0166g.m1118q(this.f367a, arrayList);
        }

        /* renamed from: l0 */
        public void mo493l0(int i) {
            if (this.f377k != i) {
                this.f377k = i;
                for (int beginBroadcast = this.f370d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f370d.getBroadcastItem(beginBroadcast).mo340U3(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f370d.finishBroadcast();
            }
        }

        /* renamed from: m */
        public void mo494m(PlaybackStateCompat playbackStateCompat) {
            Object obj;
            this.f371e = playbackStateCompat;
            for (int beginBroadcast = this.f370d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f370d.getBroadcastItem(beginBroadcast).mo335A8(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f370d.finishBroadcast();
            Object obj2 = this.f367a;
            if (playbackStateCompat == null) {
                obj = null;
            } else {
                obj = playbackStateCompat.mo605l();
            }
            C0166g.m1115n(obj2, obj);
        }

        /* renamed from: n */
        public String mo495n() {
            return C0174j.m1146b(this.f367a);
        }

        /* renamed from: o */
        public void mo496o(PendingIntent pendingIntent) {
            C0166g.m1120s(this.f367a, pendingIntent);
        }

        /* renamed from: p */
        public void mo497p(int i) {
            C0166g.m1116o(this.f367a, i);
        }

        /* renamed from: q */
        public void mo498q(PendingIntent pendingIntent) {
            C0166g.m1113l(this.f367a, pendingIntent);
        }

        /* renamed from: r */
        public Object mo499r() {
            return null;
        }

        public void release() {
            this.f369c = true;
            C0166g.m1107f(this.f367a);
        }

        /* renamed from: s */
        public void mo501s(boolean z) {
            C0166g.m1109h(this.f367a, z);
        }

        public void setExtras(Bundle bundle) {
            C0166g.m1111j(this.f367a, bundle);
        }

        /* renamed from: t */
        public void mo503t(C19616i.C19618b bVar) {
        }

        /* renamed from: u */
        public Object mo504u() {
            return this.f367a;
        }

        /* renamed from: v */
        public void mo505v(C19645u uVar) {
            C0166g.m1117p(this.f367a, uVar.mo58014d());
        }

        /* renamed from: w */
        public C19616i.C19618b mo506w() {
            return null;
        }

        public C0129h(Object obj) {
            Object t = C0166g.m1121t(obj);
            this.f367a = t;
            this.f368b = new Token(C0166g.m1104c(t), new C0130a());
        }
    }

    public MediaSessionCompat(Context context, C0124e eVar) {
        this.f343c = new ArrayList<>();
        this.f341a = eVar;
        if (!C0166g.m1105d(eVar.mo504u())) {
            mo388p(new C0118c());
        }
        this.f342b = new MediaControllerCompat(context, this);
    }
}
