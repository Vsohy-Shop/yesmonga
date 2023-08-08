package com.google.android.gms.internal.mlkit_vision_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.t6 */
public final class C39290t6 extends C39308v6 {

    /* renamed from: a */
    public String f100342a;

    /* renamed from: b */
    public Boolean f100343b;

    /* renamed from: c */
    public Integer f100344c;

    /* renamed from: a */
    public final C39308v6 mo123331a(boolean z) {
        this.f100343b = Boolean.TRUE;
        return this;
    }

    /* renamed from: b */
    public final C39308v6 mo123332b(int i) {
        this.f100344c = 1;
        return this;
    }

    /* renamed from: c */
    public final C39317w6 mo123333c() {
        Boolean bool;
        String str = this.f100342a;
        if (str != null && (bool = this.f100343b) != null && this.f100344c != null) {
            return new C39299u6(str, bool.booleanValue(), this.f100344c.intValue(), (C39281s6) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f100342a == null) {
            sb.append(" libraryName");
        }
        if (this.f100343b == null) {
            sb.append(" enableFirelog");
        }
        if (this.f100344c == null) {
            sb.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: d */
    public final C39308v6 mo123334d(String str) {
        this.f100342a = "vision-common";
        return this;
    }
}
