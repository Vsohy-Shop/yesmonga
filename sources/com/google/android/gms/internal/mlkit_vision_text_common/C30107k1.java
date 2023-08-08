package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.EncodingException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.k1 */
public final /* synthetic */ class C30107k1 implements C33005d {

    /* renamed from: a */
    public static final /* synthetic */ C30107k1 f71962a = new C30107k1();

    /* renamed from: a */
    public final void mo85035a(Object obj, Object obj2) {
        String str;
        C33006e eVar = (C33006e) obj2;
        int i = C30119l1.f71988e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str = "Couldn't find encoder for type ".concat(valueOf);
        } else {
            str = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(str);
    }
}
