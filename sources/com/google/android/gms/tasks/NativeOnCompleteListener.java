package com.google.android.gms.tasks;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
public class NativeOnCompleteListener implements C31035e<Object> {

    /* renamed from: a */
    public final long f74282a;

    @C40473a
    public NativeOnCompleteListener(long j) {
        this.f74282a = j;
    }

    @C40473a
    /* renamed from: a */
    public static void m124457a(@C0359n0 C31047k<Object> kVar, long j) {
        kVar.mo87721e(new NativeOnCompleteListener(j));
    }

    @C40473a
    public native void nativeOnComplete(long j, @C0363p0 Object obj, boolean z, boolean z2, @C0363p0 String str);

    @C40473a
    public void onComplete(@C0359n0 C31047k<Object> kVar) {
        String str;
        Object obj;
        Exception q;
        if (kVar.mo87738v()) {
            obj = kVar.mo87734r();
            str = null;
        } else if (kVar.mo87736t() || (q = kVar.mo87733q()) == null) {
            obj = null;
            str = null;
        } else {
            str = q.getMessage();
            obj = null;
        }
        nativeOnComplete(this.f74282a, obj, kVar.mo87738v(), kVar.mo87736t(), str);
    }
}
