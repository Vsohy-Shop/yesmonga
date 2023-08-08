package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.C41289gj;
import com.google.android.gms.internal.gtm.C41313hj;

/* renamed from: com.google.android.gms.internal.gtm.hj */
public abstract class C41313hj<MessageType extends C41313hj<MessageType, BuilderType>, BuilderType extends C41289gj<MessageType, BuilderType>> extends C41410lj<MessageType, BuilderType> implements C41651vk {
    protected C41169bj<C41337ij> zza = C41169bj.m167201d();

    /* renamed from: C */
    public final C41169bj<C41337ij> mo135451C() {
        if (this.zza.mo135117j()) {
            this.zza = this.zza.clone();
        }
        return this.zza;
    }

    /* renamed from: D */
    public final <Type> Type mo135452D(C41625ui<MessageType, Type> uiVar) {
        C41361jj jjVar = (C41361jj) uiVar;
        mo135454F(jjVar);
        Type e = this.zza.mo135110e(jjVar.f104718d);
        if (e == null) {
            return jjVar.f104716b;
        }
        if (jjVar.f104718d.f104681c.mo136175g() != zzyf.ENUM) {
            return e;
        }
        C41506pj<?> pjVar = jjVar.f104718d.f104679a;
        return zzyl.m169016q(((Integer) e).intValue());
    }

    /* renamed from: E */
    public final <Type> boolean mo135453E(C41625ui<MessageType, Type> uiVar) {
        C41361jj jjVar = (C41361jj) uiVar;
        mo135454F(jjVar);
        C41169bj<C41337ij> bjVar = this.zza;
        if (bjVar.f104470a.get(jjVar.f104718d) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final void mo135454F(C41361jj<MessageType, ?> jjVar) {
        if (jjVar.f104715a != ((C41410lj) mo134974A(6, (Object) null, (Object) null))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
