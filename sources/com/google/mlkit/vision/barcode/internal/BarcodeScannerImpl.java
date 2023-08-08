package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.mlkit_vision_barcode.C38557ba;
import com.google.android.gms.internal.mlkit_vision_barcode.C38581d8;
import com.google.android.gms.internal.mlkit_vision_barcode.C38596ea;
import com.google.android.gms.internal.mlkit_vision_barcode.C38607f8;
import com.google.android.gms.internal.mlkit_vision_barcode.C38786t7;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjf;
import com.google.android.gms.tasks.C31047k;
import com.google.android.odml.image.C31850h;
import com.google.mlkit.vision.barcode.C33982a;
import com.google.mlkit.vision.barcode.C34001b;
import com.google.mlkit.vision.barcode.C34004c;
import com.google.mlkit.vision.common.C34025b;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;

public class BarcodeScannerImpl extends MobileVisionBase<List<C33982a>> implements C34001b {

    /* renamed from: g */
    public static final C34004c f82604g = new C34004c.C34005a().mo98926a();

    @C0344h1
    public BarcodeScannerImpl(@C0359n0 C34004c cVar, @C0359n0 C34017i iVar, @C0359n0 Executor executor, @C0359n0 C38557ba baVar) {
        super(iVar, executor);
        zzjd zzjd;
        C38581d8 d8Var = new C38581d8();
        d8Var.mo122284i(C34010b.m136824c(cVar));
        C38607f8 j = d8Var.mo122285j();
        C38786t7 t7Var = new C38786t7();
        if (C34010b.m136827f()) {
            zzjd = zzjd.TYPE_THICK;
        } else {
            zzjd = zzjd.TYPE_THIN;
        }
        t7Var.mo122515e(zzjd);
        t7Var.mo122517g(j);
        baVar.mo122239d(C38596ea.m159935e(t7Var, 1), zzjf.ON_DEVICE_BARCODE_CREATE);
    }

    @C0359n0
    /* renamed from: A */
    public final C31047k<List<C33982a>> mo98914A(@RecentlyNonNull C34025b bVar) {
        return super.mo98973b(bVar);
    }

    @C0359n0
    /* renamed from: Y */
    public final C31047k<List<C33982a>> mo98915Y(@RecentlyNonNull C31850h hVar) {
        return super.mo98972a(hVar);
    }
}
