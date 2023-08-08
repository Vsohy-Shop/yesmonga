package androidx.lifecycle.viewmodel;

import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.lifecycle.viewmodel.d */
public final class C19491d {
    /* renamed from: a */
    public static final /* synthetic */ <VM extends C19476v0> void m90840a(C19481c cVar, C11300l<? super C19477a, ? extends VM> lVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "initializer");
        Intrinsics.reifiedOperationMarker(4, "VM");
        cVar.mo57679a(C11342l0.m43547d(C19476v0.class), lVar);
    }

    @C12579k
    /* renamed from: b */
    public static final C19502x0.C19506b m90841b(@C12579k C11300l<? super C19481c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19481c cVar = new C19481c();
        lVar.invoke(cVar);
        return cVar.mo57680b();
    }
}
