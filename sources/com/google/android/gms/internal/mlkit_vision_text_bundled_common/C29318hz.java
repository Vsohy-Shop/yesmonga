package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29318hz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29354iz;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.hz */
public class C29318hz<MessageType extends C29354iz<MessageType, BuilderType>, BuilderType extends C29318hz<MessageType, BuilderType>> extends C29281gz<MessageType, BuilderType> implements y00 {
    public C29318hz(MessageType messagetype) {
        super(messagetype);
    }

    /* renamed from: t */
    public final void mo84656t() {
        super.mo84656t();
        C29354iz izVar = (C29354iz) this.f71268b;
        izVar.zbb = izVar.zbb.clone();
    }

    /* renamed from: u */
    public final MessageType mo84655s() {
        if (this.f71269c) {
            return (C29354iz) this.f71268b;
        }
        ((C29354iz) this.f71268b).zbb.mo84568i();
        return (C29354iz) super.mo84647e0();
    }
}
