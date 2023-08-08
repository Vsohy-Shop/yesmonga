package com.google.android.gms.internal.measurement;

import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.z6 */
public final class C42293z6 extends C41983h7 {
    public C42293z6(C41911d7 d7Var, String str, Long l, boolean z) {
        super(d7Var, str, l, true, (C41965g7) null);
    }

    @Nullable
    /* renamed from: a */
    public final /* synthetic */ Object mo136524a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String str = this.f106185b;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid long value for ");
            sb.append(str);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}
