package com.google.android.gms.internal.common;

import kotlinx.serialization.internal.C12279i0;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.google.android.gms.internal.common.s */
public final class C41117s extends C41116r {

    /* renamed from: a */
    public final char f104406a;

    public C41117s(char c) {
        this.f104406a = c;
    }

    /* renamed from: a */
    public final boolean mo134937a(char c) {
        return c == this.f104406a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        int i = this.f104406a;
        char[] cArr = {'\\', C12361b.f30265p, 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = C12279i0.f30073b.charAt(i & 15);
            i >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
