package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.C30092ia;
import com.google.android.gms.internal.mlkit_vision_text_common.C30116ka;
import com.google.android.gms.internal.mlkit_vision_text_common.zzlq;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C33969n;
import com.google.mlkit.vision.common.C34025b;
import com.google.mlkit.vision.common.internal.C34033c;
import com.google.mlkit.vision.common.internal.C34036f;
import com.google.mlkit.vision.text.C34049b;
import com.google.mlkit.vision.text.C34079e;

/* renamed from: com.google.mlkit.vision.text.internal.d */
public final class C34087d implements C34095l {

    /* renamed from: a */
    public final Context f82739a;

    /* renamed from: b */
    public final C34079e f82740b;

    /* renamed from: c */
    public boolean f82741c;

    /* renamed from: d */
    public boolean f82742d;
    @C0363p0

    /* renamed from: e */
    public C30092ia f82743e;

    public C34087d(Context context, C34079e eVar) {
        this.f82739a = context;
        this.f82740b = eVar;
    }

    @C0348i1
    /* renamed from: a */
    public final C34049b mo99056a(C34025b bVar) throws MlKitException {
        String str;
        String str2;
        if (this.f82743e == null) {
            zzb();
        }
        C30092ia iaVar = (C30092ia) C40843u.m166202l(this.f82743e);
        if (!this.f82741c) {
            try {
                iaVar.mo85156f();
                this.f82741c = true;
            } catch (RemoteException e) {
                String valueOf = String.valueOf(this.f82740b.mo99046b());
                if (valueOf.length() != 0) {
                    str2 = "Failed to init text recognizer ".concat(valueOf);
                } else {
                    str2 = new String("Failed to init text recognizer ");
                }
                throw new MlKitException(str2, 13, e);
            }
        }
        try {
            return new C34049b(iaVar.mo85155T6(C34036f.m136944b().mo98988a(bVar), new zzlq(bVar.mo98958h(), bVar.mo98963m(), bVar.mo98959i(), C34033c.m136926b(bVar.mo98962l()), SystemClock.elapsedRealtime())));
        } catch (RemoteException e2) {
            String valueOf2 = String.valueOf(this.f82740b.mo99046b());
            if (valueOf2.length() != 0) {
                str = "Failed to run text recognizer ".concat(valueOf2);
            } else {
                str = new String("Failed to run text recognizer ");
            }
            throw new MlKitException(str, 13, e2);
        }
    }

    @C0348i1
    /* renamed from: d */
    public final void mo99057d() {
        C30092ia iaVar = this.f82743e;
        if (iaVar != null) {
            try {
                iaVar.mo85154E8();
            } catch (RemoteException unused) {
                String valueOf = String.valueOf(this.f82740b.mo99046b());
                if (valueOf.length() != 0) {
                    "Failed to release text recognizer ".concat(valueOf);
                }
            }
            this.f82743e = null;
        }
        this.f82741c = false;
    }

    @C0348i1
    public final void zzb() throws MlKitException {
        String str;
        DynamiteModule.C41032a aVar;
        if (this.f82743e == null) {
            try {
                Context context = this.f82739a;
                if (this.f82740b.mo99047c()) {
                    aVar = DynamiteModule.f104320g;
                } else {
                    aVar = DynamiteModule.f104319f;
                }
                this.f82743e = C30116ka.m121759m0(DynamiteModule.m166879e(context, aVar, this.f82740b.mo99049e()).mo134842d(this.f82740b.mo99051g())).mo85186g4(C41019f.m166811T6(this.f82739a));
            } catch (DynamiteModule.LoadingException e) {
                if (!this.f82740b.mo99047c()) {
                    if (!this.f82742d) {
                        C33969n.m136700b(this.f82739a, C33969n.f82463h);
                        this.f82742d = true;
                    }
                    throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
                }
                throw new MlKitException(String.format("Failed to load text module %s. %s", new Object[]{this.f82740b.mo99046b(), e.getMessage()}), 13, e);
            } catch (RemoteException e2) {
                String valueOf = String.valueOf(this.f82740b.mo99046b());
                if (valueOf.length() != 0) {
                    str = "Failed to create text recognizer ".concat(valueOf);
                } else {
                    str = new String("Failed to create text recognizer ");
                }
                throw new MlKitException(str, 13, e2);
            }
        }
    }
}
