package com.google.android.gms.internal.mlkit_common;

/* renamed from: com.google.android.gms.internal.mlkit_common.c8 */
public final class C42334c8 extends C42400i8 {

    /* renamed from: a */
    public final String f106945a;

    /* renamed from: b */
    public final boolean f106946b;

    /* renamed from: c */
    public final int f106947c;

    public /* synthetic */ C42334c8(String str, boolean z, int i, C42323b8 b8Var) {
        this.f106945a = str;
        this.f106946b = z;
        this.f106947c = i;
    }

    /* renamed from: a */
    public final int mo137641a() {
        return this.f106947c;
    }

    /* renamed from: b */
    public final String mo137642b() {
        return this.f106945a;
    }

    /* renamed from: c */
    public final boolean mo137643c() {
        return this.f106946b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42400i8) {
            C42400i8 i8Var = (C42400i8) obj;
            if (this.f106945a.equals(i8Var.mo137642b()) && this.f106946b == i8Var.mo137643c() && this.f106947c == i8Var.mo137641a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f106945a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f106946b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f106947c;
    }

    public final String toString() {
        String str = this.f106945a;
        boolean z = this.f106946b;
        int i = this.f106947c;
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
