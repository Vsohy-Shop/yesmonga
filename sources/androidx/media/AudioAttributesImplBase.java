package androidx.media;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f50061a;

    /* renamed from: b */
    public int f50062b;

    /* renamed from: c */
    public int f50063c;

    /* renamed from: d */
    public int f50064d;

    public AudioAttributesImplBase() {
        this.f50061a = 0;
        this.f50062b = 0;
        this.f50063c = 0;
        this.f50064d = -1;
    }

    /* renamed from: f */
    public static AudioAttributesImpl m91075f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new AudioAttributesImplBase(bundle.getInt(AudioAttributesCompat.f50020S, 0), bundle.getInt(AudioAttributesCompat.f50021T, 0), bundle.getInt(AudioAttributesCompat.f50019R, 0), bundle.getInt(AudioAttributesCompat.f50022U, -1));
    }

    /* renamed from: C */
    public int mo57857C() {
        int i = this.f50063c;
        int d = mo57861d();
        if (d == 6) {
            i |= 4;
        } else if (d == 7) {
            i |= 1;
        }
        return i & AudioAttributesCompat.f50016O;
    }

    @C0359n0
    /* renamed from: a */
    public Bundle mo57858a() {
        Bundle bundle = new Bundle();
        bundle.putInt(AudioAttributesCompat.f50019R, this.f50061a);
        bundle.putInt(AudioAttributesCompat.f50020S, this.f50062b);
        bundle.putInt(AudioAttributesCompat.f50021T, this.f50063c);
        int i = this.f50064d;
        if (i != -1) {
            bundle.putInt(AudioAttributesCompat.f50022U, i);
        }
        return bundle;
    }

    /* renamed from: b */
    public int mo57859b() {
        return this.f50064d;
    }

    /* renamed from: c */
    public int mo57860c() {
        return AudioAttributesCompat.m91044h(true, this.f50063c, this.f50061a);
    }

    /* renamed from: d */
    public int mo57861d() {
        int i = this.f50064d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m91044h(false, this.f50063c, this.f50061a);
    }

    /* renamed from: e */
    public Object mo57862e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f50062b == audioAttributesImplBase.getContentType() && this.f50063c == audioAttributesImplBase.mo57857C() && this.f50061a == audioAttributesImplBase.getUsage() && this.f50064d == audioAttributesImplBase.f50064d) {
            return true;
        }
        return false;
    }

    public int getContentType() {
        return this.f50062b;
    }

    public int getUsage() {
        return this.f50061a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f50062b), Integer.valueOf(this.f50063c), Integer.valueOf(this.f50061a), Integer.valueOf(this.f50064d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f50064d != -1) {
            sb.append(" stream=");
            sb.append(this.f50064d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m91047l(this.f50061a));
        sb.append(" content=");
        sb.append(this.f50062b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f50063c).toUpperCase());
        return sb.toString();
    }

    public AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f50062b = i;
        this.f50063c = i2;
        this.f50061a = i3;
        this.f50064d = i4;
    }
}
