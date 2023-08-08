package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.browser.trusted.C0957i;
import androidx.browser.trusted.C0958j;
import androidx.core.util.C18001r;

/* renamed from: androidx.core.app.g1 */
public class C17112g1 {

    /* renamed from: s */
    public static final String f45352s = "miscellaneous";

    /* renamed from: t */
    public static final boolean f45353t = true;

    /* renamed from: u */
    public static final int f45354u = 0;
    @C0359n0

    /* renamed from: a */
    public final String f45355a;

    /* renamed from: b */
    public CharSequence f45356b;

    /* renamed from: c */
    public int f45357c;

    /* renamed from: d */
    public String f45358d;

    /* renamed from: e */
    public String f45359e;

    /* renamed from: f */
    public boolean f45360f;

    /* renamed from: g */
    public Uri f45361g;

    /* renamed from: h */
    public AudioAttributes f45362h;

    /* renamed from: i */
    public boolean f45363i;

    /* renamed from: j */
    public int f45364j;

    /* renamed from: k */
    public boolean f45365k;

    /* renamed from: l */
    public long[] f45366l;

    /* renamed from: m */
    public String f45367m;

    /* renamed from: n */
    public String f45368n;

    /* renamed from: o */
    public boolean f45369o;

    /* renamed from: p */
    public int f45370p;

    /* renamed from: q */
    public boolean f45371q;

    /* renamed from: r */
    public boolean f45372r;

    /* renamed from: androidx.core.app.g1$a */
    public static class C17113a {

        /* renamed from: a */
        public final C17112g1 f45373a;

        public C17113a(@C0359n0 String str, int i) {
            this.f45373a = new C17112g1(str, i);
        }

        @C0359n0
        /* renamed from: a */
        public C17112g1 mo51557a() {
            return this.f45373a;
        }

        @C0359n0
        /* renamed from: b */
        public C17113a mo51558b(@C0359n0 String str, @C0359n0 String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                C17112g1 g1Var = this.f45373a;
                g1Var.f45367m = str;
                g1Var.f45368n = str2;
            }
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C17113a mo51559c(@C0363p0 String str) {
            this.f45373a.f45358d = str;
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C17113a mo51560d(@C0363p0 String str) {
            this.f45373a.f45359e = str;
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C17113a mo51561e(int i) {
            this.f45373a.f45357c = i;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C17113a mo51562f(int i) {
            this.f45373a.f45364j = i;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C17113a mo51563g(boolean z) {
            this.f45373a.f45363i = z;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C17113a mo51564h(@C0363p0 CharSequence charSequence) {
            this.f45373a.f45356b = charSequence;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C17113a mo51565i(boolean z) {
            this.f45373a.f45360f = z;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C17113a mo51566j(@C0363p0 Uri uri, @C0363p0 AudioAttributes audioAttributes) {
            C17112g1 g1Var = this.f45373a;
            g1Var.f45361g = uri;
            g1Var.f45362h = audioAttributes;
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C17113a mo51567k(boolean z) {
            this.f45373a.f45365k = z;
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C17113a mo51568l(@C0363p0 long[] jArr) {
            boolean z;
            C17112g1 g1Var = this.f45373a;
            if (jArr == null || jArr.length <= 0) {
                z = false;
            } else {
                z = true;
            }
            g1Var.f45365k = z;
            g1Var.f45366l = jArr;
            return this;
        }
    }

    public C17112g1(@C0359n0 String str, int i) {
        this.f45360f = true;
        this.f45361g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f45364j = 0;
        this.f45355a = (String) C18001r.m81775l(str);
        this.f45357c = i;
        this.f45362h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    /* renamed from: a */
    public boolean mo51537a() {
        return this.f45371q;
    }

    /* renamed from: b */
    public boolean mo51538b() {
        return this.f45369o;
    }

    /* renamed from: c */
    public boolean mo51539c() {
        return this.f45360f;
    }

    @C0363p0
    /* renamed from: d */
    public AudioAttributes mo51540d() {
        return this.f45362h;
    }

    @C0363p0
    /* renamed from: e */
    public String mo51541e() {
        return this.f45368n;
    }

    @C0363p0
    /* renamed from: f */
    public String mo51542f() {
        return this.f45358d;
    }

    @C0363p0
    /* renamed from: g */
    public String mo51543g() {
        return this.f45359e;
    }

    @C0359n0
    /* renamed from: h */
    public String mo51544h() {
        return this.f45355a;
    }

    /* renamed from: i */
    public int mo51545i() {
        return this.f45357c;
    }

    /* renamed from: j */
    public int mo51546j() {
        return this.f45364j;
    }

    /* renamed from: k */
    public int mo51547k() {
        return this.f45370p;
    }

    @C0363p0
    /* renamed from: l */
    public CharSequence mo51548l() {
        return this.f45356b;
    }

    /* renamed from: m */
    public NotificationChannel mo51549m() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        C0958j.m4306a();
        NotificationChannel a = C0957i.m4305a(this.f45355a, this.f45356b, this.f45357c);
        a.setDescription(this.f45358d);
        a.setGroup(this.f45359e);
        a.setShowBadge(this.f45360f);
        a.setSound(this.f45361g, this.f45362h);
        a.enableLights(this.f45363i);
        a.setLightColor(this.f45364j);
        a.setVibrationPattern(this.f45366l);
        a.enableVibration(this.f45365k);
        if (!(i < 30 || (str = this.f45367m) == null || (str2 = this.f45368n) == null)) {
            a.setConversationId(str, str2);
        }
        return a;
    }

    @C0363p0
    /* renamed from: n */
    public String mo51550n() {
        return this.f45367m;
    }

    @C0363p0
    /* renamed from: o */
    public Uri mo51551o() {
        return this.f45361g;
    }

    @C0363p0
    /* renamed from: p */
    public long[] mo51552p() {
        return this.f45366l;
    }

    /* renamed from: q */
    public boolean mo51553q() {
        return this.f45372r;
    }

    /* renamed from: r */
    public boolean mo51554r() {
        return this.f45363i;
    }

    /* renamed from: s */
    public boolean mo51555s() {
        return this.f45365k;
    }

    @C0359n0
    /* renamed from: t */
    public C17113a mo51556t() {
        return new C17113a(this.f45355a, this.f45357c).mo51564h(this.f45356b).mo51559c(this.f45358d).mo51560d(this.f45359e).mo51565i(this.f45360f).mo51566j(this.f45361g, this.f45362h).mo51563g(this.f45363i).mo51562f(this.f45364j).mo51567k(this.f45365k).mo51568l(this.f45366l).mo51558b(this.f45367m, this.f45368n);
    }

    @C0376v0(26)
    public C17112g1(@C0359n0 NotificationChannel notificationChannel) {
        this(notificationChannel.getId(), notificationChannel.getImportance());
        this.f45356b = notificationChannel.getName();
        this.f45358d = notificationChannel.getDescription();
        this.f45359e = notificationChannel.getGroup();
        this.f45360f = notificationChannel.canShowBadge();
        this.f45361g = notificationChannel.getSound();
        this.f45362h = notificationChannel.getAudioAttributes();
        this.f45363i = notificationChannel.shouldShowLights();
        this.f45364j = notificationChannel.getLightColor();
        this.f45365k = notificationChannel.shouldVibrate();
        this.f45366l = notificationChannel.getVibrationPattern();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f45367m = notificationChannel.getParentChannelId();
            this.f45368n = notificationChannel.getConversationId();
        }
        this.f45369o = notificationChannel.canBypassDnd();
        this.f45370p = notificationChannel.getLockscreenVisibility();
        if (i >= 29) {
            this.f45371q = notificationChannel.canBubble();
        }
        if (i >= 30) {
            this.f45372r = notificationChannel.isImportantConversation();
        }
    }
}
