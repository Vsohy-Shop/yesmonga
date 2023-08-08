package com.google.firebase.perf;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.Map;

/* renamed from: com.google.firebase.perf.f */
public interface C33316f {

    /* renamed from: W */
    public static final int f81002W = 5;

    /* renamed from: a0 */
    public static final int f81003a0 = 40;

    /* renamed from: b0 */
    public static final int f81004b0 = 100;

    /* renamed from: c0 */
    public static final int f81005c0 = 100;

    @C0363p0
    String getAttribute(@C0359n0 String str);

    @C0359n0
    Map<String, String> getAttributes();

    void putAttribute(@C0359n0 String str, @C0359n0 String str2);

    void removeAttribute(@C0359n0 String str);
}
