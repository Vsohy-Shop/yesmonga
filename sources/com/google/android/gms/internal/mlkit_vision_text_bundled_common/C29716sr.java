package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.sr */
public final class C29716sr extends C29790ur {

    /* renamed from: g */
    public final /* synthetic */ C29753tr f71457g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29716sr(C29753tr trVar, C29827vr vrVar, CharSequence charSequence) {
        super(vrVar, charSequence);
        this.f71457g = trVar;
    }

    /* renamed from: d */
    public final int mo84830d(int i) {
        return i + this.f71457g.f71478a.length();
    }

    /* renamed from: e */
    public final int mo84831e(int i) {
        int length = this.f71457g.f71478a.length();
        int length2 = this.f71492c.length() - length;
        while (i <= length2) {
            int i2 = 0;
            while (i2 < length) {
                if (this.f71492c.charAt(i2 + i) != this.f71457g.f71478a.charAt(i2)) {
                    i++;
                } else {
                    i2++;
                }
            }
            return i;
        }
        return -1;
    }
}
