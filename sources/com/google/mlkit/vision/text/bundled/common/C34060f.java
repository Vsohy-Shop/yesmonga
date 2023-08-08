package com.google.mlkit.vision.text.bundled.common;

import com.google.mlkit.vision.text.bundled.common.C34056c;

/* renamed from: com.google.mlkit.vision.text.bundled.common.f */
public final class C34060f extends C34056c.C34057a {

    /* renamed from: a */
    public String f82701a;

    /* renamed from: b */
    public String f82702b;

    /* renamed from: c */
    public Boolean f82703c;

    /* renamed from: a */
    public final C34056c mo99018a() {
        String str;
        Boolean bool;
        String str2 = this.f82701a;
        if (str2 != null && (str = this.f82702b) != null && (bool = this.f82703c) != null) {
            return new C34062h(str2, str, bool.booleanValue(), (C34061g) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f82701a == null) {
            sb.append(" configLabel");
        }
        if (this.f82702b == null) {
            sb.append(" modelDir");
        }
        if (this.f82703c == null) {
            sb.append(" disableCoarseClassifier");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: b */
    public final C34056c.C34057a mo99019b(String str) {
        if (str != null) {
            this.f82701a = str;
            return this;
        }
        throw new NullPointerException("Null configLabel");
    }

    /* renamed from: c */
    public final C34056c.C34057a mo99020c(boolean z) {
        this.f82703c = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: d */
    public final C34056c.C34057a mo99021d(String str) {
        if (str != null) {
            this.f82702b = str;
            return this;
        }
        throw new NullPointerException("Null modelDir");
    }
}
