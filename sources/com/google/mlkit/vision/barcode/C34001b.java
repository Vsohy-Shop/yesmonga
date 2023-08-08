package com.google.mlkit.vision.barcode;

import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import androidx.lifecycle.C19428i0;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.tasks.C31047k;
import com.google.android.odml.image.C31850h;
import com.google.mlkit.vision.common.C34025b;
import com.google.mlkit.vision.common.internal.C34034d;
import java.util.List;

/* renamed from: com.google.mlkit.vision.barcode.b */
public interface C34001b extends C34034d<List<C33982a>> {
    @C0359n0
    /* renamed from: A */
    C31047k<List<C33982a>> mo98914A(@RecentlyNonNull C34025b bVar);

    @C0359n0
    /* renamed from: Y */
    C31047k<List<C33982a>> mo98915Y(@RecentlyNonNull C31850h hVar);

    @C19428i0(Lifecycle.C19372Event.ON_DESTROY)
    void close();
}
