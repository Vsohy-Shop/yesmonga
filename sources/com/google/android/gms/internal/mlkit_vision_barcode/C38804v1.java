package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.EncodingException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.v1 */
public final /* synthetic */ class C38804v1 implements C33005d {

    /* renamed from: a */
    public static final /* synthetic */ C38804v1 f98221a = new C38804v1();

    /* renamed from: a */
    public final void mo85035a(Object obj, Object obj2) {
        String str;
        C33006e eVar = (C33006e) obj2;
        int i = C38816w1.f98242e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str = "Couldn't find encoder for type ".concat(valueOf);
        } else {
            str = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(str);
    }
}
