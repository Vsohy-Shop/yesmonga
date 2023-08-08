package com.google.android.odml.image;

/* renamed from: com.google.android.odml.image.k */
public final class C31856k extends C31862q {

    /* renamed from: a */
    public Integer f77701a;

    /* renamed from: b */
    public Integer f77702b;

    /* renamed from: a */
    public final C31862q mo92369a(int i) {
        this.f77701a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public final C31862q mo92370b(int i) {
        this.f77702b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final C31847e mo92371c() {
        Integer num = this.f77701a;
        if (num != null && this.f77702b != null) {
            return new C31857l(num.intValue(), this.f77702b.intValue(), (C31855j) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f77701a == null) {
            sb.append(" imageFormat");
        }
        if (this.f77702b == null) {
            sb.append(" storageType");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }
}
