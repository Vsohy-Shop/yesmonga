package com.google.android.gms.common;

import android.os.RemoteException;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40789m2;
import com.google.android.gms.common.internal.C40794n2;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.j0 */
public abstract class C40865j0 extends C40789m2 {

    /* renamed from: n */
    public final int f103995n;

    public C40865j0(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        this.f103995n = Arrays.hashCode(bArr);
    }

    /* renamed from: O0 */
    public static byte[] m166248O0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: T6 */
    public abstract byte[] mo134530T6();

    /* renamed from: d */
    public final int mo134449d() {
        return this.f103995n;
    }

    /* renamed from: e */
    public final C41016d mo134450e() {
        return C41019f.m166811T6(mo134530T6());
    }

    public final boolean equals(@C0363p0 Object obj) {
        C41016d e;
        if (obj != null && (obj instanceof C40794n2)) {
            try {
                C40794n2 n2Var = (C40794n2) obj;
                if (n2Var.mo134449d() != this.f103995n || (e = n2Var.mo134450e()) == null) {
                    return false;
                }
                return Arrays.equals(mo134530T6(), (byte[]) C41019f.m166810O0(e));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f103995n;
    }
}
