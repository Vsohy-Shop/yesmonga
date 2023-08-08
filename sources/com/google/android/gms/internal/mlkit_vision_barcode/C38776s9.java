package com.google.android.gms.internal.mlkit_vision_barcode;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.s9 */
public final class C38776s9 extends C38800u9 {

    /* renamed from: a */
    public final String f98152a;

    /* renamed from: b */
    public final boolean f98153b;

    /* renamed from: c */
    public final int f98154c;

    public /* synthetic */ C38776s9(String str, boolean z, int i, C38764r9 r9Var) {
        this.f98152a = str;
        this.f98153b = z;
        this.f98154c = i;
    }

    /* renamed from: a */
    public final int mo122503a() {
        return this.f98154c;
    }

    /* renamed from: b */
    public final String mo122504b() {
        return this.f98152a;
    }

    /* renamed from: c */
    public final boolean mo122505c() {
        return this.f98153b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C38800u9) {
            C38800u9 u9Var = (C38800u9) obj;
            if (this.f98152a.equals(u9Var.mo122504b()) && this.f98153b == u9Var.mo122505c() && this.f98154c == u9Var.mo122503a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f98152a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f98153b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f98154c;
    }

    public final String toString() {
        String str = this.f98152a;
        boolean z = this.f98153b;
        int i = this.f98154c;
        StringBuilder sb = new StringBuilder(str.length() + 84);
        sb.append("MLKitLoggingOptions{libraryName=");
        sb.append(str);
        sb.append(", enableFirelog=");
        sb.append(z);
        sb.append(", firelogEventType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
