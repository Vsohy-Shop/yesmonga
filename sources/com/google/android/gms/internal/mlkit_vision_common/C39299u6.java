package com.google.android.gms.internal.mlkit_vision_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.u6 */
public final class C39299u6 extends C39317w6 {

    /* renamed from: a */
    public final String f100362a;

    /* renamed from: b */
    public final boolean f100363b;

    /* renamed from: c */
    public final int f100364c;

    public /* synthetic */ C39299u6(String str, boolean z, int i, C39281s6 s6Var) {
        this.f100362a = str;
        this.f100363b = z;
        this.f100364c = i;
    }

    /* renamed from: a */
    public final int mo123341a() {
        return this.f100364c;
    }

    /* renamed from: b */
    public final String mo123342b() {
        return this.f100362a;
    }

    /* renamed from: c */
    public final boolean mo123343c() {
        return this.f100363b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39317w6) {
            C39317w6 w6Var = (C39317w6) obj;
            if (this.f100362a.equals(w6Var.mo123342b()) && this.f100363b == w6Var.mo123343c() && this.f100364c == w6Var.mo123341a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f100362a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f100363b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f100364c;
    }

    public final String toString() {
        String str = this.f100362a;
        boolean z = this.f100363b;
        int i = this.f100364c;
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
