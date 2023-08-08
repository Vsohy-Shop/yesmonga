package com.google.mlkit.vision.text;

import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import androidx.lifecycle.C19428i0;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.tasks.C31047k;
import com.google.android.odml.image.C31850h;
import com.google.mlkit.vision.common.C34025b;
import com.google.mlkit.vision.common.internal.C34034d;

/* renamed from: com.google.mlkit.vision.text.d */
public interface C34078d extends C34034d<C34049b> {
    @C0359n0
    /* renamed from: A */
    C31047k<C34049b> mo98914A(@RecentlyNonNull C34025b bVar);

    @C0359n0
    /* renamed from: Y */
    C31047k<C34049b> mo99043Y(@RecentlyNonNull C31850h hVar);

    @C19428i0(Lifecycle.C19372Event.ON_DESTROY)
    void close();
}
