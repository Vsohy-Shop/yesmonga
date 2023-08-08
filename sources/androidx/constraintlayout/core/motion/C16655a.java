package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.C16717v;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.constraintlayout.core.motion.a */
public class C16655a {

    /* renamed from: g */
    public static final String f41533g = "TransitionLayout";

    /* renamed from: a */
    public String f41534a;

    /* renamed from: b */
    public int f41535b;

    /* renamed from: c */
    public int f41536c;

    /* renamed from: d */
    public float f41537d;

    /* renamed from: e */
    public String f41538e;

    /* renamed from: f */
    public boolean f41539f;

    public C16655a(C16655a aVar) {
        this.f41536c = Integer.MIN_VALUE;
        this.f41537d = Float.NaN;
        this.f41538e = null;
        this.f41534a = aVar.f41534a;
        this.f41535b = aVar.f41535b;
        this.f41536c = aVar.f41536c;
        this.f41537d = aVar.f41537d;
        this.f41538e = aVar.f41538e;
        this.f41539f = aVar.f41539f;
    }

    /* renamed from: b */
    public static int m75875b(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* renamed from: c */
    public static String m75876c(int i) {
        String str = "00000000" + Integer.toHexString(i);
        return "#" + str.substring(str.length() - 8);
    }

    /* renamed from: p */
    public static int m75877p(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - ((float) i);
        float f6 = f3 * 255.0f;
        int i2 = (int) (((1.0f - f2) * f6) + 0.5f);
        int i3 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i4 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i5 = (int) (f6 + 0.5f);
        if (i == 0) {
            return ((i5 << 16) + (i4 << 8) + i2) | -16777216;
        }
        if (i == 1) {
            return ((i3 << 16) + (i5 << 8) + i2) | -16777216;
        }
        if (i == 2) {
            return ((i2 << 16) + (i5 << 8) + i4) | -16777216;
        }
        if (i == 3) {
            return ((i2 << 16) + (i3 << 8) + i5) | -16777216;
        }
        if (i == 4) {
            return ((i4 << 16) + (i2 << 8) + i5) | -16777216;
        }
        if (i != 5) {
            return 0;
        }
        return ((i5 << 16) + (i2 << 8) + i3) | -16777216;
    }

    /* renamed from: s */
    public static int m75878s(float f, float f2, float f3, float f4) {
        int b = m75875b((int) (f * 255.0f));
        int b2 = m75875b((int) (f2 * 255.0f));
        return (b << 16) | (m75875b((int) (f4 * 255.0f)) << 24) | (b2 << 8) | m75875b((int) (f3 * 255.0f));
    }

    /* renamed from: a */
    public void mo48770a(C16660e eVar) {
        int i = this.f41535b;
        switch (i) {
            case 900:
            case 902:
            case C16717v.C16719b.f42193p /*906*/:
                eVar.mo48898J(this.f41534a, i, this.f41536c);
                return;
            case 901:
            case C16717v.C16719b.f42192o /*905*/:
                eVar.mo48897I(this.f41534a, i, this.f41537d);
                return;
            case C16717v.C16719b.f42190m /*903*/:
                eVar.mo48899K(this.f41534a, i, this.f41538e);
                return;
            case C16717v.C16719b.f42191n /*904*/:
                eVar.mo48900L(this.f41534a, i, this.f41539f);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public C16655a mo48771d() {
        return new C16655a(this);
    }

    /* renamed from: e */
    public boolean mo48772e(C16655a aVar) {
        int i;
        if (aVar == null || (i = this.f41535b) != aVar.f41535b) {
            return false;
        }
        switch (i) {
            case 900:
            case C16717v.C16719b.f42193p /*906*/:
                if (this.f41536c == aVar.f41536c) {
                    return true;
                }
                return false;
            case 901:
                if (this.f41537d == aVar.f41537d) {
                    return true;
                }
                return false;
            case 902:
                if (this.f41536c == aVar.f41536c) {
                    return true;
                }
                return false;
            case C16717v.C16719b.f42190m /*903*/:
                if (this.f41536c == aVar.f41536c) {
                    return true;
                }
                return false;
            case C16717v.C16719b.f42191n /*904*/:
                if (this.f41539f == aVar.f41539f) {
                    return true;
                }
                return false;
            case C16717v.C16719b.f42192o /*905*/:
                if (this.f41537d == aVar.f41537d) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: f */
    public boolean mo48773f() {
        return this.f41539f;
    }

    /* renamed from: g */
    public int mo48774g() {
        return this.f41536c;
    }

    /* renamed from: h */
    public float mo48775h() {
        return this.f41537d;
    }

    /* renamed from: i */
    public int mo48776i() {
        return this.f41536c;
    }

    /* renamed from: j */
    public int mo48777j(float[] fArr) {
        int b = m75875b((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
        int b2 = m75875b((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
        return (m75875b((int) (fArr[3] * 255.0f)) << 24) | (b << 16) | (b2 << 8) | m75875b((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    /* renamed from: k */
    public String mo48778k() {
        return this.f41534a;
    }

    /* renamed from: l */
    public String mo48779l() {
        return this.f41538e;
    }

    /* renamed from: m */
    public int mo48780m() {
        return this.f41535b;
    }

    /* renamed from: n */
    public float mo48781n() {
        switch (this.f41535b) {
            case 900:
                return (float) this.f41536c;
            case 901:
                return this.f41537d;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case C16717v.C16719b.f42190m /*903*/:
                throw new RuntimeException("Cannot interpolate String");
            case C16717v.C16719b.f42191n /*904*/:
                if (this.f41539f) {
                    return 1.0f;
                }
                return 0.0f;
            case C16717v.C16719b.f42192o /*905*/:
                return this.f41537d;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: o */
    public void mo48782o(float[] fArr) {
        float f;
        switch (this.f41535b) {
            case 900:
                fArr[0] = (float) this.f41536c;
                return;
            case 901:
                fArr[0] = this.f41537d;
                return;
            case 902:
                int i = this.f41536c;
                float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i >> 24) & 255)) / 255.0f;
                return;
            case C16717v.C16719b.f42190m /*903*/:
                throw new RuntimeException("Cannot interpolate String");
            case C16717v.C16719b.f42191n /*904*/:
                if (this.f41539f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case C16717v.C16719b.f42192o /*905*/:
                fArr[0] = this.f41537d;
                return;
            default:
                return;
        }
    }

    /* renamed from: q */
    public boolean mo48783q() {
        int i = this.f41535b;
        return (i == 903 || i == 904 || i == 906) ? false : true;
    }

    /* renamed from: r */
    public int mo48784r() {
        return this.f41535b != 902 ? 1 : 4;
    }

    /* renamed from: t */
    public void mo48785t(boolean z) {
        this.f41539f = z;
    }

    public String toString() {
        String str = this.f41534a + C12361b.f30257h;
        switch (this.f41535b) {
            case 900:
                return str + this.f41536c;
            case 901:
                return str + this.f41537d;
            case 902:
                return str + m75876c(this.f41536c);
            case C16717v.C16719b.f42190m /*903*/:
                return str + this.f41538e;
            case C16717v.C16719b.f42191n /*904*/:
                return str + Boolean.valueOf(this.f41539f);
            case C16717v.C16719b.f42192o /*905*/:
                return str + this.f41537d;
            default:
                return str + "????";
        }
    }

    /* renamed from: u */
    public void mo48787u(float f) {
        this.f41537d = f;
    }

    /* renamed from: v */
    public void mo48788v(int i) {
        this.f41536c = i;
    }

    /* renamed from: w */
    public void mo48789w(C16660e eVar, float[] fArr) {
        int i = this.f41535b;
        boolean z = true;
        switch (i) {
            case 900:
                eVar.mo48898J(this.f41534a, i, (int) fArr[0]);
                return;
            case 901:
            case C16717v.C16719b.f42192o /*905*/:
                eVar.mo48897I(this.f41534a, i, fArr[0]);
                return;
            case 902:
                int b = m75875b((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                int b2 = m75875b((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                eVar.mo48898J(this.f41534a, this.f41535b, (m75875b((int) (fArr[3] * 255.0f)) << 24) | (b << 16) | (b2 << 8) | m75875b((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case C16717v.C16719b.f42190m /*903*/:
            case C16717v.C16719b.f42193p /*906*/:
                throw new RuntimeException("unable to interpolate " + this.f41534a);
            case C16717v.C16719b.f42191n /*904*/:
                String str = this.f41534a;
                if (fArr[0] <= 0.5f) {
                    z = false;
                }
                eVar.mo48900L(str, i, z);
                return;
            default:
                return;
        }
    }

    /* renamed from: x */
    public void mo48790x(String str) {
        this.f41538e = str;
    }

    /* renamed from: y */
    public void mo48791y(Object obj) {
        switch (this.f41535b) {
            case 900:
            case C16717v.C16719b.f42193p /*906*/:
                this.f41536c = ((Integer) obj).intValue();
                return;
            case 901:
                this.f41537d = ((Float) obj).floatValue();
                return;
            case 902:
                this.f41536c = ((Integer) obj).intValue();
                return;
            case C16717v.C16719b.f42190m /*903*/:
                this.f41538e = (String) obj;
                return;
            case C16717v.C16719b.f42191n /*904*/:
                this.f41539f = ((Boolean) obj).booleanValue();
                return;
            case C16717v.C16719b.f42192o /*905*/:
                this.f41537d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    /* renamed from: z */
    public void mo48792z(float[] fArr) {
        boolean z = true;
        switch (this.f41535b) {
            case 900:
            case C16717v.C16719b.f42193p /*906*/:
                this.f41536c = (int) fArr[0];
                return;
            case 901:
            case C16717v.C16719b.f42192o /*905*/:
                this.f41537d = fArr[0];
                return;
            case 902:
                this.f41536c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow((double) fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow((double) fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow((double) fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case C16717v.C16719b.f42190m /*903*/:
                throw new RuntimeException("Cannot interpolate String");
            case C16717v.C16719b.f42191n /*904*/:
                if (((double) fArr[0]) <= 0.5d) {
                    z = false;
                }
                this.f41539f = z;
                return;
            default:
                return;
        }
    }

    public C16655a(String str, int i, String str2) {
        this.f41536c = Integer.MIN_VALUE;
        this.f41537d = Float.NaN;
        this.f41534a = str;
        this.f41535b = i;
        this.f41538e = str2;
    }

    public C16655a(String str, int i, int i2) {
        this.f41536c = Integer.MIN_VALUE;
        this.f41537d = Float.NaN;
        this.f41538e = null;
        this.f41534a = str;
        this.f41535b = i;
        if (i == 901) {
            this.f41537d = (float) i2;
        } else {
            this.f41536c = i2;
        }
    }

    public C16655a(String str, int i, float f) {
        this.f41536c = Integer.MIN_VALUE;
        this.f41538e = null;
        this.f41534a = str;
        this.f41535b = i;
        this.f41537d = f;
    }

    public C16655a(String str, int i, boolean z) {
        this.f41536c = Integer.MIN_VALUE;
        this.f41537d = Float.NaN;
        this.f41538e = null;
        this.f41534a = str;
        this.f41535b = i;
        this.f41539f = z;
    }

    public C16655a(String str, int i) {
        this.f41536c = Integer.MIN_VALUE;
        this.f41537d = Float.NaN;
        this.f41538e = null;
        this.f41534a = str;
        this.f41535b = i;
    }

    public C16655a(String str, int i, Object obj) {
        this.f41536c = Integer.MIN_VALUE;
        this.f41537d = Float.NaN;
        this.f41538e = null;
        this.f41534a = str;
        this.f41535b = i;
        mo48791y(obj);
    }

    public C16655a(C16655a aVar, Object obj) {
        this.f41536c = Integer.MIN_VALUE;
        this.f41537d = Float.NaN;
        this.f41538e = null;
        this.f41534a = aVar.f41534a;
        this.f41535b = aVar.f41535b;
        mo48791y(obj);
    }
}
