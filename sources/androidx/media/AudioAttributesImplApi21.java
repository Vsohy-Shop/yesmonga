package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: c */
    public static final String f50057c = "AudioAttributesCompat21";

    /* renamed from: d */
    public static Method f50058d;

    /* renamed from: a */
    public AudioAttributes f50059a;

    /* renamed from: b */
    public int f50060b;

    public AudioAttributesImplApi21() {
        this.f50060b = -1;
    }

    /* renamed from: f */
    public static AudioAttributesImpl m91067f(Bundle bundle) {
        AudioAttributes audioAttributes;
        if (bundle == null || (audioAttributes = (AudioAttributes) bundle.getParcelable(AudioAttributesCompat.f50018Q)) == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributes, bundle.getInt(AudioAttributesCompat.f50022U, -1));
    }

    /* renamed from: g */
    public static Method m91068g() {
        Class<AudioAttributes> cls = AudioAttributes.class;
        try {
            if (f50058d == null) {
                f50058d = cls.getMethod("toLegacyStreamType", new Class[]{cls});
            }
            return f50058d;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: C */
    public int mo57857C() {
        return this.f50059a.getFlags();
    }

    @C0359n0
    /* renamed from: a */
    public Bundle mo57858a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AudioAttributesCompat.f50018Q, this.f50059a);
        int i = this.f50060b;
        if (i != -1) {
            bundle.putInt(AudioAttributesCompat.f50022U, i);
        }
        return bundle;
    }

    /* renamed from: b */
    public int mo57859b() {
        return this.f50060b;
    }

    /* renamed from: c */
    public int mo57860c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f50059a.getVolumeControlStream();
        }
        return AudioAttributesCompat.m91044h(true, mo57857C(), getUsage());
    }

    /* renamed from: d */
    public int mo57861d() {
        int i = this.f50060b;
        if (i != -1) {
            return i;
        }
        Method g = m91068g();
        if (g == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No AudioAttributes#toLegacyStreamType() on API: ");
            sb.append(Build.VERSION.SDK_INT);
            return -1;
        }
        try {
            return ((Integer) g.invoke((Object) null, new Object[]{this.f50059a})).intValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getLegacyStreamType() failed on API: ");
            sb2.append(Build.VERSION.SDK_INT);
            return -1;
        }
    }

    /* renamed from: e */
    public Object mo57862e() {
        return this.f50059a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f50059a.equals(((AudioAttributesImplApi21) obj).f50059a);
    }

    public int getContentType() {
        return this.f50059a.getContentType();
    }

    public int getUsage() {
        return this.f50059a.getUsage();
    }

    public int hashCode() {
        return this.f50059a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f50059a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f50059a = audioAttributes;
        this.f50060b = i;
    }
}
