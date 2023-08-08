package com.carrefour.fid.android.shared.network.certificate;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.C28444b;
import com.carrefour.sslpinning.decrypt.C22851a;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.network.certificate.a */
public final class C28804a implements C22851a {

    /* renamed from: a */
    public static final int f70600a = 0;

    /* renamed from: a */
    public int mo67319a() {
        return C28444b.C28461q.tink;
    }

    @C12579k
    public String getKey() {
        return "com.carrefour.fid.android";
    }
}
