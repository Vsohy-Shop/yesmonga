package com.google.android.gms.internal.mlkit_vision_barcode;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.q9 */
public final class C38751q9 extends C38788t9 {

    /* renamed from: a */
    public String f98125a;

    /* renamed from: b */
    public Boolean f98126b;

    /* renamed from: c */
    public Integer f98127c;

    /* renamed from: a */
    public final C38788t9 mo122475a(boolean z) {
        this.f98126b = Boolean.TRUE;
        return this;
    }

    /* renamed from: b */
    public final C38788t9 mo122476b(int i) {
        this.f98127c = 1;
        return this;
    }

    /* renamed from: c */
    public final C38800u9 mo122477c() {
        Boolean bool;
        String str = this.f98125a;
        if (str != null && (bool = this.f98126b) != null && this.f98127c != null) {
            return new C38776s9(str, bool.booleanValue(), this.f98127c.intValue(), (C38764r9) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f98125a == null) {
            sb.append(" libraryName");
        }
        if (this.f98126b == null) {
            sb.append(" enableFirelog");
        }
        if (this.f98127c == null) {
            sb.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: d */
    public final C38788t9 mo122478d(String str) {
        this.f98125a = str;
        return this;
    }
}
