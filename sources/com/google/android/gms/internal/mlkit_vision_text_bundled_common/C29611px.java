package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29611px;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29648qx;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.px */
public abstract class C29611px<MessageType extends C29648qx<MessageType, BuilderType>, BuilderType extends C29611px<MessageType, BuilderType>> implements w00 {
    /* renamed from: j */
    public abstract BuilderType clone();

    /* renamed from: k */
    public abstract BuilderType mo84651k(MessageType messagetype);

    /* renamed from: r3 */
    public final /* bridge */ /* synthetic */ w00 mo84764r3(x00 x00) {
        if (mo84649i().getClass().isInstance(x00)) {
            return mo84651k((C29648qx) x00);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
