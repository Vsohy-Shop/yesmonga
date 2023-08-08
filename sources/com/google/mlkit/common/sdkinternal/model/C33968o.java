package com.google.mlkit.common.sdkinternal.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0348i1;
import com.google.android.gms.internal.mlkit_common.C42378g8;
import com.google.android.gms.internal.mlkit_common.C42477p8;
import com.google.android.gms.internal.mlkit_common.C42488q8;
import com.google.android.gms.internal.mlkit_common.C42499r8;
import com.google.android.gms.internal.mlkit_common.C42510s8;
import com.google.android.gms.internal.mlkit_common.zzgy;
import com.google.android.gms.internal.mlkit_common.zzhe;
import com.google.android.gms.tasks.C31049l;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.C33920d;

@C0348i1
/* renamed from: com.google.mlkit.common.sdkinternal.model.o */
public final class C33968o extends BroadcastReceiver {

    /* renamed from: a */
    public final long f82453a;

    /* renamed from: b */
    public final C31049l<Void> f82454b;

    /* renamed from: c */
    public final /* synthetic */ C33959f f82455c;

    public /* synthetic */ C33968o(C33959f fVar, long j, C31049l lVar, C33967n nVar) {
        this.f82455c = fVar;
        this.f82453a = j;
        this.f82454b = lVar;
    }

    public final void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1);
        if (longExtra == this.f82453a) {
            Integer e = this.f82455c.mo98780e();
            synchronized (this.f82455c) {
                try {
                    this.f82455c.f82424c.mo98718b().unregisterReceiver(this);
                } catch (IllegalArgumentException e2) {
                    C33959f.f82420m.mo134442o("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e2);
                }
                this.f82455c.f82422a.remove(this.f82453a);
                this.f82455c.f82423b.remove(this.f82453a);
            }
            if (e != null) {
                if (e.intValue() == 16) {
                    C42477p8 t = this.f82455c.f82428g;
                    C42378g8 g = C42510s8.m171652g();
                    C33920d q = this.f82455c.f82426e;
                    C33959f fVar = this.f82455c;
                    Long valueOf = Long.valueOf(longExtra);
                    t.mo137762d(g, q, false, fVar.mo98781f(valueOf));
                    this.f82454b.mo87742b(this.f82455c.mo98791x(valueOf));
                    return;
                } else if (e.intValue() == 8) {
                    C42477p8 t2 = this.f82455c.f82428g;
                    C42378g8 g2 = C42510s8.m171652g();
                    C33920d q2 = this.f82455c.f82426e;
                    C42488q8 h = C42499r8.m171636h();
                    h.mo137652b(zzgy.NO_ERROR);
                    h.mo137655e(true);
                    h.mo137654d(this.f82455c.f82426e.mo98681e());
                    h.mo137651a(zzhe.SUCCEEDED);
                    t2.mo137764f(g2, q2, h.mo137657g());
                    this.f82454b.mo87743c(null);
                    return;
                }
            }
            this.f82455c.f82428g.mo137762d(C42510s8.m171652g(), this.f82455c.f82426e, false, 0);
            this.f82454b.mo87742b(new MlKitException("Model downloading failed", 13));
        }
    }
}
