package com.google.android.gms.internal.measurement;

import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.b7 */
public final class C41875b7 extends C41983h7 {
    public C41875b7(C41911d7 d7Var, String str, Double d, boolean z) {
        super(d7Var, "measurement.test.double_flag", d, true, (C41965g7) null);
    }

    @Nullable
    /* renamed from: a */
    public final /* synthetic */ Object mo136524a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String str = this.f106185b;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid double value for ");
            sb.append(str);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}
