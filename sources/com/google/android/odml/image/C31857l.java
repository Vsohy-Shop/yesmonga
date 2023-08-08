package com.google.android.odml.image;

/* renamed from: com.google.android.odml.image.l */
public final class C31857l extends C31847e {

    /* renamed from: a */
    public final int f77703a;

    /* renamed from: b */
    public final int f77704b;

    public /* synthetic */ C31857l(int i, int i2, C31855j jVar) {
        this.f77703a = i;
        this.f77704b = i2;
    }

    /* renamed from: a */
    public final int mo92356a() {
        return this.f77703a;
    }

    /* renamed from: b */
    public final int mo92357b() {
        return this.f77704b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31847e) {
            C31847e eVar = (C31847e) obj;
            if (this.f77703a == eVar.mo92356a() && this.f77704b == eVar.mo92357b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f77703a ^ 1000003) * 1000003) ^ this.f77704b;
    }

    public final String toString() {
        int i = this.f77703a;
        int i2 = this.f77704b;
        StringBuilder sb = new StringBuilder(65);
        sb.append("ImageProperties{imageFormat=");
        sb.append(i);
        sb.append(", storageType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
