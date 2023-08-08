package com.google.mlkit.vision.text.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.mlkit_vision_text_common.C30137m7;
import com.google.android.gms.internal.mlkit_vision_text_common.C30223t9;
import com.google.android.gms.internal.mlkit_vision_text_common.C30234u8;
import com.google.android.gms.internal.mlkit_vision_text_common.C30259w9;
import com.google.android.gms.internal.mlkit_vision_text_common.C30270x8;
import com.google.android.gms.internal.mlkit_vision_text_common.zzit;
import com.google.android.gms.internal.mlkit_vision_text_common.zziv;
import com.google.android.gms.tasks.C31047k;
import com.google.android.odml.image.C31850h;
import com.google.mlkit.vision.common.C34025b;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.text.C34049b;
import com.google.mlkit.vision.text.C34078d;
import com.google.mlkit.vision.text.C34079e;
import java.util.concurrent.Executor;

public class TextRecognizerImpl extends MobileVisionBase<C34049b> implements C34078d {
    public TextRecognizerImpl(@C0359n0 C34085b bVar, @C0359n0 Executor executor, @C0359n0 C30223t9 t9Var, @C0359n0 C34079e eVar) {
        super(bVar, executor);
        zzit zzit;
        C30137m7 m7Var = new C30137m7();
        if (eVar.mo99047c()) {
            zzit = zzit.TYPE_THICK;
        } else {
            zzit = zzit.TYPE_THIN;
        }
        m7Var.mo85229e(zzit);
        C30234u8 u8Var = new C30234u8();
        C30270x8 x8Var = new C30270x8();
        x8Var.mo85395a(C34084a.m137031a(eVar.mo99050f()));
        u8Var.mo85350e(x8Var.mo85396c());
        m7Var.mo85231g(u8Var.mo85351f());
        t9Var.mo85339c(C30259w9.m121911e(m7Var, 1), zziv.ON_DEVICE_TEXT_CREATE);
    }

    @C0359n0
    /* renamed from: A */
    public final C31047k<C34049b> mo98914A(@RecentlyNonNull C34025b bVar) {
        return super.mo98973b(bVar);
    }

    @C0359n0
    /* renamed from: Y */
    public final C31047k<C34049b> mo99043Y(@RecentlyNonNull C31850h hVar) {
        return super.mo98972a(hVar);
    }
}
