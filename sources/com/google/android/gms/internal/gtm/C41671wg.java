package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.C41671wg;
import com.google.android.gms.internal.gtm.C41695xg;

/* renamed from: com.google.android.gms.internal.gtm.wg */
public abstract class C41671wg<MessageType extends C41695xg<MessageType, BuilderType>, BuilderType extends C41671wg<MessageType, BuilderType>> implements C41603tk {
    /* renamed from: k */
    public abstract BuilderType clone();

    /* renamed from: l */
    public abstract BuilderType mo135368l(MessageType messagetype);

    /* renamed from: w3 */
    public final /* bridge */ /* synthetic */ C41603tk mo135874w3(C41627uk ukVar) {
        if (mo135365h().getClass().isInstance(ukVar)) {
            return mo135368l((C41695xg) ukVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
