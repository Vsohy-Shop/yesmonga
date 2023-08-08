package com.carrefour.sslpinning;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.sslpinning.a */
public final class C22847a {
    @C12579k
    /* renamed from: a */
    public final byte[] mo67311a(@C12579k String str) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        sb.append("publicKey : ");
        sb.append(str);
        byte[] decode = Base64.decode(str, 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("publicKey decoded: ");
        sb2.append(decode);
        Intrinsics.checkExpressionValueIsNotNull(decode, "Base64.decode(value, Bas…oded: \" + this)\n        }");
        return decode;
    }
}
