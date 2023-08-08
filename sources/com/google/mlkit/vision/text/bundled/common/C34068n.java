package com.google.mlkit.vision.text.bundled.common;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29237fs;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29457lr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29794uv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbry;
import java.util.List;

/* renamed from: com.google.mlkit.vision.text.bundled.common.n */
public final /* synthetic */ class C34068n implements C29457lr {

    /* renamed from: a */
    public final /* synthetic */ Matrix f82716a;

    public /* synthetic */ C34068n(Matrix matrix) {
        this.f82716a = matrix;
    }

    /* renamed from: a */
    public final Object mo84712a(Object obj) {
        String str;
        String str2;
        Matrix matrix = this.f82716a;
        C29794uv uvVar = (C29794uv) obj;
        List<Point> b = C34064j.m136992b(uvVar.mo84896y());
        if (uvVar.mo84893F()) {
            str = uvVar.mo84890C();
        } else {
            str = "";
        }
        String str3 = str;
        Rect a = C34064j.m136991a(b, matrix);
        if (uvVar.mo84892E()) {
            str2 = uvVar.mo84889B();
        } else {
            str2 = "und";
        }
        return new zbry(str3, a, b, str2, C29237fs.m120389a(uvVar.mo84891D(), new C34069o(matrix)));
    }
}
