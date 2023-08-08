package com.carrefour.fid.android.shared.network;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.network.a */
public interface C28799a {

    /* renamed from: com.carrefour.fid.android.shared.network.a$a */
    public static final class C28800a {
        /* renamed from: a */
        public static /* synthetic */ Map m119220a(C28799a aVar, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = false;
                }
                return aVar.mo31314b(z, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAuthenticatedHeaders");
        }

        /* renamed from: b */
        public static /* synthetic */ HashMap m119221b(C28799a aVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return aVar.mo31313a(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDefaultHeaders");
        }
    }

    @C12579k
    /* renamed from: a */
    HashMap<String, String> mo31313a(boolean z);

    @C12579k
    /* renamed from: b */
    Map<String, String> mo31314b(boolean z, boolean z2);
}
