package com.google.mlkit.vision.text.bundled.common;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29533nt;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29628qd;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbro;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsa;
import com.google.mlkit.vision.text.bundled.common.C34056c;
import java.io.IOException;

/* renamed from: com.google.mlkit.vision.text.bundled.common.i */
public final class C34063i extends C29533nt {

    /* renamed from: n */
    public final Context f82707n;

    /* renamed from: o */
    public final String f82708o;
    @C0363p0

    /* renamed from: p */
    public C34066l f82709p;

    public C34063i(Context context, String str) {
        this.f82707n = context;
        this.f82708o = str;
    }

    /* renamed from: k0 */
    public final void mo84759k0() {
        C34066l lVar = this.f82709p;
        if (lVar != null) {
            lVar.mo99038d();
            this.f82709p = null;
        }
    }

    /* renamed from: x5 */
    public final zbsa mo84760x5(C41016d dVar, zbro zbro) throws RemoteException {
        C34066l lVar = this.f82709p;
        if (lVar != null) {
            C34074t b = ((C34066l) C40843u.m166202l(lVar)).mo99036b(dVar, zbro);
            C34075u b2 = b.mo99023b();
            if (b2.mo99042d()) {
                return b.mo99022a();
            }
            throw b2.mo99028a().mo84926a();
        }
        throw new RemoteException("Process is started without initiation.");
    }

    /* renamed from: z */
    public final void mo84761z() throws RemoteException {
        String str;
        if (this.f82709p == null) {
            try {
                C34056c.C34057a a = C34056c.m136969a(this.f82708o, C29628qd.m120930a(this.f82707n, "mlkit-ocr-models", 1));
                a.mo99020c(true);
                C34066l a2 = C34066l.m136994a(this.f82707n, a.mo99018a());
                this.f82709p = a2;
                C34075u c = a2.mo99037c();
                if (!c.mo99042d()) {
                    throw c.mo99028a().mo84926a();
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str = "Failed to access model directory. ".concat(valueOf);
                } else {
                    str = new String("Failed to access model directory. ");
                }
                throw new RemoteException(str);
            }
        }
    }
}
