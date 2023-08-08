package com.google.android.gms.internal.mlkit_vision_text_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.l9 */
public final class C30127l9 extends C30151n9 {

    /* renamed from: a */
    public final String f72005a;

    /* renamed from: b */
    public final boolean f72006b;

    /* renamed from: c */
    public final int f72007c;

    public /* synthetic */ C30127l9(String str, boolean z, int i, C30115k9 k9Var) {
        this.f72005a = str;
        this.f72006b = z;
        this.f72007c = i;
    }

    /* renamed from: a */
    public final int mo85215a() {
        return this.f72007c;
    }

    /* renamed from: b */
    public final String mo85216b() {
        return this.f72005a;
    }

    /* renamed from: c */
    public final boolean mo85217c() {
        return this.f72006b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30151n9) {
            C30151n9 n9Var = (C30151n9) obj;
            if (this.f72005a.equals(n9Var.mo85216b()) && this.f72006b == n9Var.mo85217c() && this.f72007c == n9Var.mo85215a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f72005a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f72006b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f72007c;
    }

    public final String toString() {
        String str = this.f72005a;
        boolean z = this.f72006b;
        int i = this.f72007c;
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
