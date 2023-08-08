package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.C30185q7;
import com.google.android.gms.internal.mlkit_vision_text_common.C30207s5;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C33969n;
import com.google.mlkit.vision.common.C34025b;
import com.google.mlkit.vision.common.internal.C34033c;
import com.google.mlkit.vision.common.internal.C34035e;
import com.google.mlkit.vision.text.C34049b;

/* renamed from: com.google.mlkit.vision.text.internal.e */
public final class C34088e implements C34095l {

    /* renamed from: a */
    public final Context f82744a;

    /* renamed from: b */
    public final zzp f82745b = new zzp((String) null);

    /* renamed from: c */
    public boolean f82746c;
    @C0363p0

    /* renamed from: d */
    public C30207s5 f82747d;

    public C34088e(Context context) {
        this.f82744a = context;
    }

    /* renamed from: a */
    public final C34049b mo99056a(C34025b bVar) throws MlKitException {
        int i;
        Bitmap bitmap;
        if (this.f82747d == null) {
            zzb();
        }
        if (this.f82747d != null) {
            if (bVar.mo98958h() == -1) {
                bitmap = bVar.mo98956f();
                i = C34033c.m136926b(bVar.mo98962l());
            } else {
                bitmap = C34035e.m136930g().mo98984f(bVar);
                i = 0;
            }
            try {
                return C34094k.m137049a(((C30207s5) C40843u.m166202l(this.f82747d)).mo85323T6(C41019f.m166811T6(bitmap), new zzd(bVar.mo98963m(), bVar.mo98959i(), 0, 0, i)));
            } catch (RemoteException e) {
                throw new MlKitException("Failed to run legacy text recognizer.", 13, e);
            }
        } else {
            throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
    }

    /* renamed from: d */
    public final void mo99057d() {
        C30207s5 s5Var = this.f82747d;
        if (s5Var != null) {
            try {
                s5Var.mo85324e();
            } catch (RemoteException unused) {
            }
            this.f82747d = null;
        }
    }

    public final void zzb() throws MlKitException {
        if (this.f82747d == null) {
            try {
                C30207s5 j6 = C30185q7.m121832m0(DynamiteModule.m166879e(this.f82744a, DynamiteModule.f104319f, C33969n.f82456a).mo134842d("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).mo85319j6(C41019f.m166811T6(this.f82744a), this.f82745b);
                this.f82747d = j6;
                if (j6 == null && !this.f82746c) {
                    C33969n.m136700b(this.f82744a, C33969n.f82463h);
                    this.f82746c = true;
                }
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create legacy text recognizer.", 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
            }
        }
    }
}
