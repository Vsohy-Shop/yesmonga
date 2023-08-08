package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.C38545ab;
import com.google.android.gms.internal.mlkit_vision_barcode.C38557ba;
import com.google.android.gms.internal.mlkit_vision_barcode.C38849ya;
import com.google.android.gms.internal.mlkit_vision_barcode.zzje;
import com.google.android.gms.internal.mlkit_vision_barcode.zzms;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmu;
import com.google.android.gms.internal.mlkit_vision_barcode.zznl;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C33969n;
import com.google.mlkit.vision.barcode.C33982a;
import com.google.mlkit.vision.barcode.C34004c;
import com.google.mlkit.vision.common.C34025b;
import com.google.mlkit.vision.common.internal.C34033c;
import com.google.mlkit.vision.common.internal.C34036f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.mlkit.vision.barcode.internal.m */
public final class C34021m implements C34018j {

    /* renamed from: a */
    public boolean f82631a;

    /* renamed from: b */
    public boolean f82632b;

    /* renamed from: c */
    public boolean f82633c;

    /* renamed from: d */
    public final Context f82634d;

    /* renamed from: e */
    public final C34004c f82635e;

    /* renamed from: f */
    public final C38557ba f82636f;
    @C0363p0

    /* renamed from: g */
    public C38849ya f82637g;

    public C34021m(Context context, C34004c cVar, C38557ba baVar) {
        this.f82634d = context;
        this.f82635e = cVar;
        this.f82636f = baVar;
    }

    /* renamed from: b */
    public static boolean m136871b(Context context) {
        if (DynamiteModule.m166877a(context, ModuleDescriptor.MODULE_ID) > 0) {
            return true;
        }
        return false;
    }

    @C0348i1
    /* renamed from: a */
    public final List<C33982a> mo98936a(C34025b bVar) throws MlKitException {
        if (this.f82637g == null) {
            mo98937d();
        }
        C38849ya yaVar = (C38849ya) C40843u.m166202l(this.f82637g);
        if (!this.f82631a) {
            try {
                yaVar.mo122586f();
                this.f82631a = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e);
            }
        }
        int m = bVar.mo98963m();
        if (bVar.mo98958h() == 35) {
            m = ((Image.Plane[]) C40843u.m166202l(bVar.mo98961k()))[0].getRowStride();
        }
        try {
            List<zzms> T6 = yaVar.mo122585T6(C34036f.m136944b().mo98988a(bVar), new zznl(bVar.mo98958h(), m, bVar.mo98959i(), C34033c.m136926b(bVar.mo98962l()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (zzms lVar : T6) {
                arrayList.add(new C33982a(new C34020l(lVar)));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e2);
        }
    }

    @C0344h1
    /* renamed from: c */
    public final C38849ya mo98955c(DynamiteModule.C41032a aVar, String str, String str2) throws DynamiteModule.LoadingException, RemoteException {
        return C38545ab.m159856m0(DynamiteModule.m166879e(this.f82634d, aVar, str).mo134842d(str2)).mo122244p3(C41019f.m166811T6(this.f82634d), new zzmu(this.f82635e.mo98922a()));
    }

    @C0348i1
    /* renamed from: d */
    public final boolean mo98937d() throws MlKitException {
        if (this.f82637g != null) {
            return this.f82632b;
        }
        if (m136871b(this.f82634d)) {
            this.f82632b = true;
            try {
                this.f82637g = mo98955c(DynamiteModule.f104320g, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (DynamiteModule.LoadingException e) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e);
            } catch (RemoteException e2) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e2);
            }
        } else {
            this.f82632b = false;
            try {
                this.f82637g = mo98955c(DynamiteModule.f104319f, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (DynamiteModule.LoadingException unused) {
                if (!this.f82633c) {
                    C33969n.m136700b(this.f82634d, C33969n.f82459d);
                    this.f82633c = true;
                }
                C34010b.m136826e(this.f82636f, zzje.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            } catch (RemoteException e3) {
                C34010b.m136826e(this.f82636f, zzje.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e3);
            }
        }
        C34010b.m136826e(this.f82636f, zzje.NO_ERROR);
        return this.f82632b;
    }

    @C0348i1
    public final void zzb() {
        C38849ya yaVar = this.f82637g;
        if (yaVar != null) {
            try {
                yaVar.mo122584E8();
            } catch (RemoteException unused) {
            }
            this.f82637g = null;
            this.f82631a = false;
        }
    }
}
