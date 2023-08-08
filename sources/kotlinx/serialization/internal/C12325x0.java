package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12247f;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C12247f
/* renamed from: kotlinx.serialization.internal.x0 */
public abstract class C12325x0 extends C12313t1<String> {
    @C12579k
    /* renamed from: c0 */
    public String mo25211c0(@C12579k String str, @C12579k String str2) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "parentName");
        Intrinsics.checkNotNullParameter(str2, "childName");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str2;
        }
        return str + '.' + str2;
    }

    @C12579k
    /* renamed from: d0 */
    public String mo25212d0(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return fVar.mo24824e(i);
    }

    @C12579k
    /* renamed from: e0 */
    public final String mo25177Z(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return mo25214f0(mo25212d0(fVar, i));
    }

    @C12579k
    /* renamed from: f0 */
    public final String mo25214f0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "nestedName");
        String str2 = (String) mo25176Y();
        if (str2 == null) {
            str2 = "";
        }
        return mo25211c0(str2, str);
    }
}
