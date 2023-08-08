package com.google.mlkit.vision.text.bundled.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29045ak;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29088bq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29147dc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29267gl;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29292h9;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29377jl;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29531nr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29746tk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29896xm;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29933ym;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29936yp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29967zj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpl;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbro;
import com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.internal.C34035e;
import com.google.mlkit.vision.common.internal.C34036f;
import java.nio.ByteBuffer;

@C0348i1
/* renamed from: com.google.mlkit.vision.text.bundled.common.l */
public final class C34066l {
    @C0363p0

    /* renamed from: e */
    public static C34065k f82711e;

    /* renamed from: a */
    public final Context f82712a;

    /* renamed from: b */
    public final C34056c f82713b;

    /* renamed from: c */
    public boolean f82714c;

    /* renamed from: d */
    public boolean f82715d = true;

    public C34066l(Context context, C34056c cVar) {
        this.f82712a = context;
        this.f82713b = cVar;
    }

    /* renamed from: a */
    public static C34066l m136994a(Context context, C34056c cVar) {
        return new C34066l(context, cVar);
    }

    /* renamed from: b */
    public final C34074t mo99036b(C41016d dVar, zbro zbro) {
        String str;
        zbpl<C29746tk> zbpl;
        zbro zbro2 = zbro;
        C34075u c = mo99037c();
        if (!c.mo99042d()) {
            return C34074t.m137007d(c);
        }
        try {
            if (zbro.mo84976Q() == -1) {
                Bitmap bitmap = (Bitmap) C40843u.m166202l((Bitmap) C41019f.m166810O0(dVar));
                if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                    String valueOf = String.valueOf(bitmap.getConfig());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 70);
                    sb.append("Input bitmap is not ARGB_8888 config. Converting it to ARGB_8888 from ");
                    sb.append(valueOf);
                    bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
                }
                zbpl = ((C34065k) C40843u.m166202l(f82711e)).mo87836g(SystemClock.elapsedRealtime() * 1000, bitmap, C34067m.m137001b(zbro.mo84977W()));
            } else if (zbro.mo84976Q() == 35) {
                Image.Plane[] planes = ((Image) C40843u.m166202l(C41019f.m166810O0(dVar))).getPlanes();
                zbpl = ((C34065k) C40843u.m166202l(f82711e)).mo87837h(SystemClock.elapsedRealtime() * 1000, ((Image.Plane) C40843u.m166202l(planes[0])).getBuffer(), ((Image.Plane) C40843u.m166202l(planes[1])).getBuffer(), ((Image.Plane) C40843u.m166202l(planes[2])).getBuffer(), zbro.mo84978X(), zbro.mo84975M(), ((Image.Plane) C40843u.m166202l(planes[0])).getRowStride(), ((Image.Plane) C40843u.m166202l(planes[1])).getRowStride(), ((Image.Plane) C40843u.m166202l(planes[1])).getPixelStride(), C34067m.m137001b(zbro.mo84977W()));
            } else if (zbro.mo84976Q() == 17) {
                zbpl = ((C34065k) C40843u.m166202l(f82711e)).mo87832c(C34067m.m137000a(C34035e.m136929a((ByteBuffer) C40843u.m166202l((ByteBuffer) C41019f.m166810O0(dVar))), zbro2));
            } else if (zbro.mo84976Q() == 842094169) {
                zbpl = ((C34065k) C40843u.m166202l(f82711e)).mo87832c(C34067m.m137000a(C34035e.m136932l((ByteBuffer) C40843u.m166202l(C41019f.m166810O0(dVar)), true), zbro2));
            } else {
                int Q = zbro.mo84976Q();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unsupported image format: ");
                sb2.append(Q);
                throw new MlKitException(sb2.toString(), 3);
            }
            if (!zbpl.mo84928c()) {
                return C34074t.m137007d(C34075u.m137011b(new RemoteException("VisionKit pipeline returns empty result.")));
            }
            Matrix e = C34036f.m136944b().mo98991e(zbro.mo84978X(), zbro.mo84975M(), zbro.mo84977W());
            C34058d dVar2 = new C34058d(C34075u.m137012c(), C34073s.m137006a(zbpl.mo84926a().mo84878A(), e), this.f82715d);
            this.f82715d = false;
            return dVar2;
        } catch (MlKitException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            if (valueOf2.length() != 0) {
                str = "Failed to process input image.".concat(valueOf2);
            } else {
                str = new String("Failed to process input image.");
            }
            return C34074t.m137007d(C34075u.m137011b(new RemoteException(str)));
        }
    }

    /* renamed from: c */
    public final C34075u mo99037c() {
        String str;
        if (!mo99040f()) {
            mo99039e();
        }
        if (this.f82714c) {
            return C34075u.m137012c();
        }
        if (f82711e == null) {
            String b = this.f82713b.mo99015b();
            String c = this.f82713b.mo99016c();
            boolean d = this.f82713b.mo99017d();
            C29967zj w = C29045ak.m120147w();
            C29267gl v = C29377jl.m120570v();
            C29292h9 v2 = C29147dc.m120293v();
            v2.mo84665v(c);
            v2.mo84664u(b);
            v.mo84638v((C29147dc) v2.mo84645D2());
            v.mo84639x(3);
            if (d) {
                C29936yp v3 = C29088bq.m120204v();
                v3.mo84914u("PassThroughCoarseClassifier");
                v.mo84637u(v3);
            }
            w.mo85018u(v);
            C29896xm v4 = C29933ym.m121368v();
            v4.mo84906u(2);
            w.mo85019v(v4);
            f82711e = new C34065k((C29045ak) w.mo84645D2(), this.f82713b.mo99015b());
        }
        try {
            f82711e.mo87834e();
            this.f82714c = true;
            return C34075u.m137012c();
        } catch (PipelineException e) {
            String b2 = e.getRootCauseMessage().mo84927b("");
            if (b2.length() != 0) {
                str = "Failed to initialize detector. ".concat(b2);
            } else {
                str = new String("Failed to initialize detector. ");
            }
            return C34075u.m137011b(new RemoteException(str));
        }
    }

    /* renamed from: d */
    public final void mo99038d() {
        if (mo99040f()) {
            mo99039e();
        }
    }

    /* renamed from: e */
    public final void mo99039e() {
        C34065k kVar = f82711e;
        if (kVar != null) {
            if (this.f82714c) {
                kVar.mo87835f();
            }
            f82711e.mo87833d();
            f82711e = null;
        }
        this.f82714c = false;
        this.f82715d = true;
    }

    /* renamed from: f */
    public final boolean mo99040f() {
        C34065k kVar = f82711e;
        if (kVar == null || C29531nr.m120807a(kVar.mo99035i(), this.f82713b.mo99015b())) {
            return true;
        }
        return false;
    }
}
