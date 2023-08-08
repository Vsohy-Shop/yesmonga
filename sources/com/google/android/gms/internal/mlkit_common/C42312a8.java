package com.google.android.gms.internal.mlkit_common;

/* renamed from: com.google.android.gms.internal.mlkit_common.a8 */
public final class C42312a8 extends C42389h8 {

    /* renamed from: a */
    public String f106836a;

    /* renamed from: b */
    public Boolean f106837b;

    /* renamed from: c */
    public Integer f106838c;

    /* renamed from: a */
    public final C42389h8 mo137621a(boolean z) {
        this.f106837b = Boolean.TRUE;
        return this;
    }

    /* renamed from: b */
    public final C42389h8 mo137622b(int i) {
        this.f106838c = 1;
        return this;
    }

    /* renamed from: c */
    public final C42400i8 mo137623c() {
        Boolean bool;
        String str = this.f106836a;
        if (str != null && (bool = this.f106837b) != null && this.f106838c != null) {
            return new C42334c8(str, bool.booleanValue(), this.f106838c.intValue(), (C42323b8) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f106836a == null) {
            sb.append(" libraryName");
        }
        if (this.f106837b == null) {
            sb.append(" enableFirelog");
        }
        if (this.f106838c == null) {
            sb.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: d */
    public final C42389h8 mo137624d(String str) {
        this.f106836a = "common";
        return this;
    }
}
