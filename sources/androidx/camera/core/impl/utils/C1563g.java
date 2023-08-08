package androidx.camera.core.impl.utils;

/* renamed from: androidx.camera.core.impl.utils.g */
public class C1563g {

    /* renamed from: a */
    public final int f4462a;

    /* renamed from: b */
    public final String f4463b;

    /* renamed from: c */
    public final int f4464c;

    /* renamed from: d */
    public final int f4465d;

    public C1563g(String str, int i, int i2) {
        this.f4463b = str;
        this.f4462a = i;
        this.f4464c = i2;
        this.f4465d = -1;
    }

    /* renamed from: a */
    public boolean mo5515a(int i) {
        int i2;
        int i3 = this.f4464c;
        if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f4465d) == i) {
            return true;
        }
        if ((i3 == 4 || i2 == 4) && i == 3) {
            return true;
        }
        if ((i3 == 9 || i2 == 9) && i == 8) {
            return true;
        }
        if ((i3 == 12 || i2 == 12) && i == 11) {
            return true;
        }
        return false;
    }

    public C1563g(String str, int i, int i2, int i3) {
        this.f4463b = str;
        this.f4462a = i;
        this.f4464c = i2;
        this.f4465d = i3;
    }
}
