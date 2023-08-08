package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39082x0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39091y0;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.x0 */
public abstract class C39082x0<MessageType extends C39091y0<MessageType, BuilderType>, BuilderType extends C39082x0<MessageType, BuilderType>> implements C39067v3 {
    /* renamed from: h */
    public abstract BuilderType clone();

    /* renamed from: i */
    public abstract BuilderType mo122912i(MessageType messagetype);

    /* renamed from: n0 */
    public final /* bridge */ /* synthetic */ C39067v3 mo123101n0(C39076w3 w3Var) {
        if (mo122909c().getClass().isInstance(w3Var)) {
            return mo122912i((C39091y0) w3Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
