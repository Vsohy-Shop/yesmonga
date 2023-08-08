package com.google.android.gms.internal.mlkit_vision_text_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.j9 */
public final class C30103j9 extends C30139m9 {

    /* renamed from: a */
    public String f71956a;

    /* renamed from: b */
    public Boolean f71957b;

    /* renamed from: c */
    public Integer f71958c;

    /* renamed from: a */
    public final C30139m9 mo85182a(boolean z) {
        this.f71957b = Boolean.TRUE;
        return this;
    }

    /* renamed from: b */
    public final C30139m9 mo85183b(int i) {
        this.f71958c = 1;
        return this;
    }

    /* renamed from: c */
    public final C30151n9 mo85184c() {
        Boolean bool;
        String str = this.f71956a;
        if (str != null && (bool = this.f71957b) != null && this.f71958c != null) {
            return new C30127l9(str, bool.booleanValue(), this.f71958c.intValue(), (C30115k9) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f71956a == null) {
            sb.append(" libraryName");
        }
        if (this.f71957b == null) {
            sb.append(" enableFirelog");
        }
        if (this.f71958c == null) {
            sb.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: d */
    public final C30139m9 mo85185d(String str) {
        if (str != null) {
            this.f71956a = str;
            return this;
        }
        throw new NullPointerException("Null libraryName");
    }
}
