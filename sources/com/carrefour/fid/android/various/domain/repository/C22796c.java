package com.carrefour.fid.android.various.domain.repository;

import java.util.Map;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.various.domain.repository.c */
public interface C22796c {

    /* renamed from: com.carrefour.fid.android.various.domain.repository.c$a */
    public static final class C22797a {
        /* renamed from: a */
        public static /* synthetic */ Object m103043a(C22796c cVar, boolean z, C11045c cVar2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return cVar.mo67175a(z, cVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
        }
    }

    @C12580l
    /* renamed from: a */
    Object mo67175a(boolean z, @C12579k C11045c<? super Boolean> cVar);

    @C12579k
    /* renamed from: b */
    Map<String, String> mo67176b();
}
