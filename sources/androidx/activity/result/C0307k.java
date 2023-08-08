package androidx.activity.result;

import androidx.activity.result.C0305j;
import androidx.activity.result.contract.C0268b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.activity.result.k */
public final class C0307k {
    @C12579k
    /* renamed from: a */
    public static final C0305j m1546a(@C12579k C0268b.C0280j.C0286f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "mediaType");
        return new C0305j.C0306a().mo964b(fVar).mo963a();
    }

    /* renamed from: b */
    public static /* synthetic */ C0305j m1547b(C0268b.C0280j.C0286f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C0268b.C0280j.C0282b.f809a;
        }
        return m1546a(fVar);
    }
}
