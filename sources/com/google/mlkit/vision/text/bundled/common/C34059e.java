package com.google.mlkit.vision.text.bundled.common;

import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpl;

/* renamed from: com.google.mlkit.vision.text.bundled.common.e */
public final class C34059e extends C34075u {

    /* renamed from: a */
    public final zbpl<RemoteException> f82700a;

    public C34059e(zbpl<RemoteException> zbpl) {
        this.f82700a = zbpl;
    }

    /* renamed from: a */
    public final zbpl<RemoteException> mo99028a() {
        return this.f82700a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34075u) {
            return this.f82700a.equals(((C34075u) obj).mo99028a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f82700a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f82700a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("VkpStatus{remoteException=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
