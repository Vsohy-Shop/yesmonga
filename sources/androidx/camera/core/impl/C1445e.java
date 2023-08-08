package androidx.camera.core.impl;

import android.util.Size;

/* renamed from: androidx.camera.core.impl.e */
public final class C1445e extends C1467j1 {

    /* renamed from: a */
    public final Size f4197a;

    /* renamed from: b */
    public final Size f4198b;

    /* renamed from: c */
    public final Size f4199c;

    public C1445e(Size size, Size size2, Size size3) {
        if (size != null) {
            this.f4197a = size;
            if (size2 != null) {
                this.f4198b = size2;
                if (size3 != null) {
                    this.f4199c = size3;
                    return;
                }
                throw new NullPointerException("Null recordSize");
            }
            throw new NullPointerException("Null previewSize");
        }
        throw new NullPointerException("Null analysisSize");
    }

    /* renamed from: b */
    public Size mo5211b() {
        return this.f4197a;
    }

    /* renamed from: c */
    public Size mo5212c() {
        return this.f4198b;
    }

    /* renamed from: d */
    public Size mo5213d() {
        return this.f4199c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1467j1)) {
            return false;
        }
        C1467j1 j1Var = (C1467j1) obj;
        if (!this.f4197a.equals(j1Var.mo5211b()) || !this.f4198b.equals(j1Var.mo5212c()) || !this.f4199c.equals(j1Var.mo5213d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f4197a.hashCode() ^ 1000003) * 1000003) ^ this.f4198b.hashCode()) * 1000003) ^ this.f4199c.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f4197a + ", previewSize=" + this.f4198b + ", recordSize=" + this.f4199c + "}";
    }
}
