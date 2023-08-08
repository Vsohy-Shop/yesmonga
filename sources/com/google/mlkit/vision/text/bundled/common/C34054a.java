package com.google.mlkit.vision.text.bundled.common;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29570ot;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29607pt;

@C40473a
/* renamed from: com.google.mlkit.vision.text.bundled.common.a */
public abstract class C34054a extends C29607pt {
    @RecentlyNonNull
    @C40473a
    /* renamed from: H0 */
    public abstract String mo99014H0();

    public final /* bridge */ /* synthetic */ C29570ot zbb(C41016d dVar) throws RemoteException {
        return new C34063i((Context) C40843u.m166202l((Context) C41019f.m166810O0(dVar)), mo99014H0());
    }
}
