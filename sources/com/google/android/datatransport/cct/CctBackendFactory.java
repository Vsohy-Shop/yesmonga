package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.C40105d;
import com.google.android.datatransport.runtime.backends.C40110h;
import com.google.android.datatransport.runtime.backends.C40116m;

@Keep
public class CctBackendFactory implements C40105d {
    public C40116m create(C40110h hVar) {
        return new C40045d(hVar.mo132708c(), hVar.mo132712f(), hVar.mo132710e());
    }
}
