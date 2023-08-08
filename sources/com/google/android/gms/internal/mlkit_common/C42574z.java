package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.EncodingException;

/* renamed from: com.google.android.gms.internal.mlkit_common.z */
public final /* synthetic */ class C42574z implements C33005d {

    /* renamed from: a */
    public static final /* synthetic */ C42574z f107476a = new C42574z();

    /* renamed from: a */
    public final void mo85035a(Object obj, Object obj2) {
        String str;
        C33006e eVar = (C33006e) obj2;
        int i = C42304a0.f106806e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str = "Couldn't find encoder for type ".concat(valueOf);
        } else {
            str = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(str);
    }
}
