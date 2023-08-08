package com.google.mlkit.vision.text.bundled.common;

import androidx.annotation.C0359n0;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29117cj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29154dj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29702sd;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbro;
import java.nio.ByteBuffer;

/* renamed from: com.google.mlkit.vision.text.bundled.common.m */
public final class C34067m {
    /* renamed from: a */
    public static C29154dj m137000a(@C0359n0 ByteBuffer byteBuffer, @C0359n0 zbro zbro) {
        C29117cj cjVar = new C29117cj();
        cjVar.mo84554a(byteBuffer.array());
        cjVar.mo84559f(m137001b(zbro.mo84977W()));
        cjVar.mo84555b(new C29702sd(zbro.mo84978X(), zbro.mo84975M()));
        cjVar.mo84556c(zbro.mo84979e0() * 1000);
        cjVar.mo84558e(2);
        return cjVar.mo84557d();
    }

    /* renamed from: b */
    public static int m137001b(int i) {
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            return i != 3 ? 1 : 2;
        }
        return 3;
    }
}
