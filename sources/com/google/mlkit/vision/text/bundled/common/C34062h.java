package com.google.mlkit.vision.text.bundled.common;

/* renamed from: com.google.mlkit.vision.text.bundled.common.h */
public final class C34062h extends C34056c {

    /* renamed from: a */
    public final String f82704a;

    /* renamed from: b */
    public final String f82705b;

    /* renamed from: c */
    public final boolean f82706c;

    public /* synthetic */ C34062h(String str, String str2, boolean z, C34061g gVar) {
        this.f82704a = str;
        this.f82705b = str2;
        this.f82706c = z;
    }

    /* renamed from: b */
    public final String mo99015b() {
        return this.f82704a;
    }

    /* renamed from: c */
    public final String mo99016c() {
        return this.f82705b;
    }

    /* renamed from: d */
    public final boolean mo99017d() {
        return this.f82706c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34056c) {
            C34056c cVar = (C34056c) obj;
            if (!this.f82704a.equals(cVar.mo99015b()) || !this.f82705b.equals(cVar.mo99016c()) || this.f82706c != cVar.mo99017d()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f82704a.hashCode() ^ 1000003) * 1000003) ^ this.f82705b.hashCode()) * 1000003;
        if (true != this.f82706c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f82704a;
        String str2 = this.f82705b;
        boolean z = this.f82706c;
        StringBuilder sb = new StringBuilder(str.length() + 80 + str2.length());
        sb.append("VkpTextRecognizerOptions{configLabel=");
        sb.append(str);
        sb.append(", modelDir=");
        sb.append(str2);
        sb.append(", disableCoarseClassifier=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
