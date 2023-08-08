package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.EncodingException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.b */
public final /* synthetic */ class C39118b implements C33005d {

    /* renamed from: a */
    public static final /* synthetic */ C39118b f99858a = new C39118b();

    /* renamed from: a */
    public final void mo85035a(Object obj, Object obj2) {
        String str;
        C33006e eVar = (C33006e) obj2;
        int i = C39128c.f99873e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str = "Couldn't find encoder for type ".concat(valueOf);
        } else {
            str = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(str);
    }
}
