package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.C20749g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AudioAttributesCompat implements C20749g {

    /* renamed from: A */
    public static final SparseIntArray f50002A;

    /* renamed from: B */
    public static boolean f50003B = false;

    /* renamed from: C */
    public static final int[] f50004C = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: D */
    public static final int f50005D = 1;

    /* renamed from: E */
    public static final int f50006E = 2;

    /* renamed from: F */
    public static final int f50007F = 4;

    /* renamed from: G */
    public static final int f50008G = 8;

    /* renamed from: H */
    public static final int f50009H = 16;

    /* renamed from: I */
    public static final int f50010I = 32;

    /* renamed from: J */
    public static final int f50011J = 64;

    /* renamed from: K */
    public static final int f50012K = 128;

    /* renamed from: L */
    public static final int f50013L = 256;

    /* renamed from: M */
    public static final int f50014M = 512;

    /* renamed from: N */
    public static final int f50015N = 1023;

    /* renamed from: O */
    public static final int f50016O = 273;

    /* renamed from: P */
    public static final int f50017P = -1;

    /* renamed from: Q */
    public static final String f50018Q = "androidx.media.audio_attrs.FRAMEWORKS";

    /* renamed from: R */
    public static final String f50019R = "androidx.media.audio_attrs.USAGE";

    /* renamed from: S */
    public static final String f50020S = "androidx.media.audio_attrs.CONTENT_TYPE";

    /* renamed from: T */
    public static final String f50021T = "androidx.media.audio_attrs.FLAGS";

    /* renamed from: U */
    public static final String f50022U = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";

    /* renamed from: b */
    public static final String f50023b = "AudioAttributesCompat";

    /* renamed from: c */
    public static final int f50024c = 0;

    /* renamed from: d */
    public static final int f50025d = 1;

    /* renamed from: e */
    public static final int f50026e = 2;

    /* renamed from: f */
    public static final int f50027f = 3;

    /* renamed from: g */
    public static final int f50028g = 4;

    /* renamed from: h */
    public static final int f50029h = 0;

    /* renamed from: i */
    public static final int f50030i = 1;

    /* renamed from: j */
    public static final int f50031j = 2;

    /* renamed from: k */
    public static final int f50032k = 3;

    /* renamed from: l */
    public static final int f50033l = 4;

    /* renamed from: m */
    public static final int f50034m = 5;

    /* renamed from: n */
    public static final int f50035n = 6;

    /* renamed from: o */
    public static final int f50036o = 7;

    /* renamed from: p */
    public static final int f50037p = 8;

    /* renamed from: q */
    public static final int f50038q = 9;

    /* renamed from: r */
    public static final int f50039r = 10;

    /* renamed from: s */
    public static final int f50040s = 11;

    /* renamed from: t */
    public static final int f50041t = 12;

    /* renamed from: u */
    public static final int f50042u = 13;

    /* renamed from: v */
    public static final int f50043v = 14;

    /* renamed from: w */
    public static final int f50044w = 15;

    /* renamed from: x */
    public static final int f50045x = 16;

    /* renamed from: y */
    public static final int f50046y = 1;

    /* renamed from: z */
    public static final int f50047z = 2;

    /* renamed from: a */
    public AudioAttributesImpl f50048a;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media.AudioAttributesCompat$a */
    public @interface C19556a {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media.AudioAttributesCompat$b */
    public @interface C19557b {
    }

    /* renamed from: androidx.media.AudioAttributesCompat$c */
    public static abstract class C19558c {

        /* renamed from: a */
        public static final int f50049a = 6;

        /* renamed from: b */
        public static final int f50050b = 7;

        /* renamed from: c */
        public static final int f50051c = 9;

        /* renamed from: d */
        public static final int f50052d = 10;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f50002A = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public static AudioAttributesCompat m91042f(Bundle bundle) {
        AudioAttributesImpl f = AudioAttributesImplApi21.m91067f(bundle);
        if (f == null) {
            return null;
        }
        return new AudioAttributesCompat(f);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public static void m91043g(boolean z) {
        f50003B = z;
    }

    /* renamed from: h */
    public static int m91044h(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
                return z ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
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
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
        }
    }

    /* renamed from: i */
    public static int m91045i(boolean z, AudioAttributesCompat audioAttributesCompat) {
        return m91044h(z, audioAttributesCompat.mo57840C(), audioAttributesCompat.getUsage());
    }

    /* renamed from: k */
    public static int m91046k(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    /* renamed from: l */
    public static String m91047l(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                return "unknown usage " + i;
        }
    }

    @C0363p0
    /* renamed from: m */
    public static AudioAttributesCompat m91048m(@C0359n0 Object obj) {
        if (f50003B) {
            return null;
        }
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21((AudioAttributes) obj);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f50048a = audioAttributesImplApi21;
        return audioAttributesCompat;
    }

    /* renamed from: C */
    public int mo57840C() {
        return this.f50048a.mo57857C();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public Bundle mo57841a() {
        return this.f50048a.mo57858a();
    }

    /* renamed from: b */
    public int mo57842b() {
        return this.f50048a.mo57859b();
    }

    /* renamed from: c */
    public int mo57843c() {
        return this.f50048a.mo57860c();
    }

    /* renamed from: d */
    public int mo57844d() {
        return this.f50048a.mo57861d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f50048a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f50048a);
        }
        if (audioAttributesCompat.f50048a == null) {
            return true;
        }
        return false;
    }

    public int getContentType() {
        return this.f50048a.getContentType();
    }

    public int getUsage() {
        return this.f50048a.getUsage();
    }

    public int hashCode() {
        return this.f50048a.hashCode();
    }

    @C0363p0
    /* renamed from: j */
    public Object mo57849j() {
        return this.f50048a.mo57862e();
    }

    public String toString() {
        return this.f50048a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f50048a = audioAttributesImpl;
    }

    /* renamed from: androidx.media.AudioAttributesCompat$d */
    public static class C19559d {

        /* renamed from: a */
        public int f50053a = 0;

        /* renamed from: b */
        public int f50054b = 0;

        /* renamed from: c */
        public int f50055c = 0;

        /* renamed from: d */
        public int f50056d = -1;

        public C19559d() {
        }

        /* renamed from: a */
        public AudioAttributesCompat mo57851a() {
            AudioAttributesImpl audioAttributesImpl;
            if (!AudioAttributesCompat.f50003B) {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f50054b).setFlags(this.f50055c).setUsage(this.f50053a);
                int i = this.f50056d;
                if (i != -1) {
                    usage.setLegacyStreamType(i);
                }
                audioAttributesImpl = new AudioAttributesImplApi21(usage.build(), this.f50056d);
            } else {
                audioAttributesImpl = new AudioAttributesImplBase(this.f50054b, this.f50055c, this.f50053a, this.f50056d);
            }
            return new AudioAttributesCompat(audioAttributesImpl);
        }

        /* renamed from: b */
        public C19559d mo57852b(int i) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                this.f50054b = i;
            } else {
                this.f50053a = 0;
            }
            return this;
        }

        /* renamed from: c */
        public C19559d mo57853c(int i) {
            this.f50055c = (i & 1023) | this.f50055c;
            return this;
        }

        /* renamed from: d */
        public C19559d mo57854d(int i) {
            switch (i) {
                case 0:
                    this.f50054b = 1;
                    break;
                case 1:
                    break;
                case 2:
                    this.f50054b = 4;
                    break;
                case 3:
                    this.f50054b = 2;
                    break;
                case 4:
                    this.f50054b = 4;
                    break;
                case 5:
                    this.f50054b = 4;
                    break;
                case 6:
                    this.f50054b = 1;
                    this.f50055c |= 4;
                    break;
                case 7:
                    this.f50055c = 1 | this.f50055c;
                    break;
                case 8:
                    this.f50054b = 4;
                    break;
                case 9:
                    this.f50054b = 4;
                    break;
                case 10:
                    this.f50054b = 1;
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid stream type ");
                    sb.append(i);
                    sb.append(" for AudioAttributesCompat");
                    break;
            }
            this.f50054b = 4;
            this.f50053a = AudioAttributesCompat.m91046k(i);
            return this;
        }

        /* renamed from: e */
        public C19559d mo57855e(int i) {
            if (i != 10) {
                this.f50056d = i;
                return mo57854d(i);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        /* renamed from: f */
        public C19559d mo57856f(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f50053a = i;
                    break;
                case 16:
                    if (!AudioAttributesCompat.f50003B && Build.VERSION.SDK_INT > 25) {
                        this.f50053a = i;
                        break;
                    } else {
                        this.f50053a = 12;
                        break;
                    }
                default:
                    this.f50053a = 0;
                    break;
            }
            return this;
        }

        public C19559d(AudioAttributesCompat audioAttributesCompat) {
            this.f50053a = audioAttributesCompat.getUsage();
            this.f50054b = audioAttributesCompat.getContentType();
            this.f50055c = audioAttributesCompat.mo57840C();
            this.f50056d = audioAttributesCompat.mo57842b();
        }
    }
}
