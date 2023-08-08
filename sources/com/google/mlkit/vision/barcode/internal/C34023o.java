package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.C38557ba;
import com.google.android.gms.internal.mlkit_vision_barcode.C38598f;
import com.google.android.gms.internal.mlkit_vision_barcode.C38624h;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzje;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C33969n;
import com.google.mlkit.vision.barcode.C33982a;
import com.google.mlkit.vision.barcode.C34004c;
import com.google.mlkit.vision.common.C34025b;
import com.google.mlkit.vision.common.internal.C34033c;
import com.google.mlkit.vision.common.internal.C34035e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.mlkit.vision.barcode.internal.o */
public final class C34023o implements C34018j {

    /* renamed from: a */
    public boolean f82639a;

    /* renamed from: b */
    public final Context f82640b;

    /* renamed from: c */
    public final zzad f82641c;

    /* renamed from: d */
    public final C38557ba f82642d;
    @C0363p0

    /* renamed from: e */
    public C38598f f82643e;

    public C34023o(Context context, C34004c cVar, C38557ba baVar) {
        zzad zzad = new zzad();
        this.f82641c = zzad;
        this.f82640b = context;
        zzad.f98375a = cVar.mo98922a();
        this.f82642d = baVar;
    }

    @C0348i1
    /* renamed from: a */
    public final List<C33982a> mo98936a(C34025b bVar) throws MlKitException {
        zzq[] zzqArr;
        if (this.f82643e == null) {
            mo98937d();
        }
        C38598f fVar = this.f82643e;
        if (fVar != null) {
            C38598f fVar2 = (C38598f) C40843u.m166202l(fVar);
            zzaj zzaj = new zzaj(bVar.mo98963m(), bVar.mo98959i(), 0, 0, C34033c.m136926b(bVar.mo98962l()));
            try {
                int h = bVar.mo98958h();
                if (h == -1) {
                    zzqArr = fVar2.mo122319E8(C41019f.m166811T6(bVar.mo98956f()), zzaj);
                } else if (h == 17) {
                    zzqArr = fVar2.mo122320T6(C41019f.m166811T6(bVar.mo98957g()), zzaj);
                } else if (h == 35) {
                    Image.Plane[] planeArr = (Image.Plane[]) C40843u.m166202l(bVar.mo98961k());
                    zzaj.f98377a = planeArr[0].getRowStride();
                    zzqArr = fVar2.mo122320T6(C41019f.m166811T6(planeArr[0].getBuffer()), zzaj);
                } else if (h == 842094169) {
                    zzqArr = fVar2.mo122320T6(C41019f.m166811T6(C34035e.m136930g().mo98983e(bVar, false)), zzaj);
                } else {
                    int h2 = bVar.mo98958h();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unsupported image format: ");
                    sb.append(h2);
                    throw new MlKitException(sb.toString(), 3);
                }
                ArrayList arrayList = new ArrayList();
                for (zzq nVar : zzqArr) {
                    arrayList.add(new C33982a(new C34022n(nVar)));
                }
                return arrayList;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to detect with legacy barcode detector", 13, e);
            }
        } else {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
    }

    @C0348i1
    /* renamed from: d */
    public final boolean mo98937d() throws MlKitException {
        if (this.f82643e != null) {
            return false;
        }
        try {
            C38598f X1 = C38624h.m159974m0(DynamiteModule.m166879e(this.f82640b, DynamiteModule.f104319f, C33969n.f82456a).mo134842d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).mo122337X1(C41019f.m166811T6(this.f82640b), this.f82641c);
            this.f82643e = X1;
            if (X1 == null) {
                if (!this.f82639a) {
                    C33969n.m136700b(this.f82640b, C33969n.f82459d);
                    this.f82639a = true;
                    C34010b.m136826e(this.f82642d, zzje.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
            }
            C34010b.m136826e(this.f82642d, zzje.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }

    @C0348i1
    public final void zzb() {
        C38598f fVar = this.f82643e;
        if (fVar != null) {
            try {
                fVar.mo122321e();
            } catch (RemoteException unused) {
            }
            this.f82643e = null;
        }
    }
}
