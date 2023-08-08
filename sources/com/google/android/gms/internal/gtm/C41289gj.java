package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.C41289gj;
import com.google.android.gms.internal.gtm.C41313hj;

/* renamed from: com.google.android.gms.internal.gtm.gj */
public class C41289gj<MessageType extends C41313hj<MessageType, BuilderType>, BuilderType extends C41289gj<MessageType, BuilderType>> extends C41265fj<MessageType, BuilderType> implements C41651vk {
    public C41289gj(MessageType messagetype) {
        super(messagetype);
    }

    /* renamed from: o */
    public final void mo135371o() {
        super.mo135371o();
        C41313hj hjVar = (C41313hj) this.f104600b;
        hjVar.zza = hjVar.zza.clone();
    }

    /* renamed from: v */
    public final MessageType mo135374w() {
        if (this.f104601c) {
            return (C41313hj) this.f104600b;
        }
        ((C41313hj) this.f104600b).zza.mo135113g();
        return (C41313hj) super.mo135374w();
    }
}
