package androidx.compose.p004ui;

import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8592o;
import java.util.Arrays;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.ui.l */
public final class C8766l extends C8760f {
    @C12579k

    /* renamed from: e */
    public final String f23476e;
    @C12579k

    /* renamed from: f */
    public final Object[] f23477f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8766l(@C12579k String str, @C12579k Object[] objArr, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11305q<? super C8767m, ? super C8592o, ? super Integer, ? extends C8767m> qVar) {
        super(lVar, qVar);
        Intrinsics.checkNotNullParameter(str, "fqName");
        Intrinsics.checkNotNullParameter(objArr, "keys");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(qVar, "factory");
        this.f23476e = str;
        this.f23477f = objArr;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C8766l) {
            C8766l lVar = (C8766l) obj;
            if (!Intrinsics.areEqual((Object) this.f23476e, (Object) lVar.f23476e) || !Arrays.equals(this.f23477f, lVar.f23477f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f23476e.hashCode() * 31) + Arrays.hashCode(this.f23477f);
    }

    @C12579k
    /* renamed from: s */
    public final String mo17222s() {
        return this.f23476e;
    }

    @C12579k
    /* renamed from: t */
    public final Object[] mo17223t() {
        return this.f23477f;
    }
}
