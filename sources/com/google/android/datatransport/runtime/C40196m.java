package com.google.android.datatransport.runtime;

import androidx.annotation.C0348i1;
import com.google.android.datatransport.C40086g;
import com.google.android.datatransport.Priority;

/* renamed from: com.google.android.datatransport.runtime.m */
public final class C40196m {
    /* renamed from: a */
    public static C40203r m163499a(C40086g<?> gVar) {
        if (gVar instanceof C40320u) {
            return ((C40320u) gVar).mo132981d();
        }
        throw new IllegalArgumentException("Expected instance of TransportImpl.");
    }

    @C0348i1
    /* renamed from: b */
    public static void m163500b(C40086g<?> gVar, Priority priority) {
        C40323w.m163829c().mo132984e().mo132896u(m163499a(gVar).mo132851f(priority), 1);
    }
}
