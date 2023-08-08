package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12219g;
import kotlinx.serialization.descriptors.C12224h;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.internal.d1 */
public final class C12264d1 {
    /* renamed from: a */
    public static final /* synthetic */ <SD extends C12217f> boolean m49258a(SD sd, Object obj, C11300l<? super SD, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sd, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "typeParamsAreEqual");
        if (sd == obj) {
            return true;
        }
        Intrinsics.reifiedOperationMarker(3, "SD");
        if (!(obj instanceof C12217f)) {
            return false;
        }
        C12217f fVar = (C12217f) obj;
        if (!Intrinsics.areEqual((Object) sd.mo24830h(), (Object) fVar.mo24830h()) || !lVar.invoke(obj).booleanValue() || sd.mo24823d() != fVar.mo24823d()) {
            return false;
        }
        int d = sd.mo24823d();
        int i = 0;
        while (i < d) {
            int i2 = i + 1;
            if (!Intrinsics.areEqual((Object) sd.mo24827g(i).mo24830h(), (Object) fVar.mo24827g(i).mo24830h()) || !Intrinsics.areEqual((Object) sd.mo24827g(i).getKind(), (Object) fVar.mo24827g(i).getKind())) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* renamed from: b */
    public static final int m49259b(@C12579k C12217f fVar, @C12579k C12217f[] fVarArr) {
        int i;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(fVarArr, "typeParams");
        int hashCode = (fVar.mo24830h().hashCode() * 31) + Arrays.hashCode(fVarArr);
        Iterable<C12217f> a = C12219g.m48904a(fVar);
        Iterator<C12217f> it = a.iterator();
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i5 = i3 * 31;
            String h = it.next().mo24830h();
            if (h != null) {
                i4 = h.hashCode();
            }
            i3 = i5 + i4;
        }
        for (C12217f kind : a) {
            int i6 = i2 * 31;
            C12224h kind2 = kind.getKind();
            if (kind2 == null) {
                i = 0;
            } else {
                i = kind2.hashCode();
            }
            i2 = i6 + i;
        }
        return (((hashCode * 31) + i3) * 31) + i2;
    }
}
