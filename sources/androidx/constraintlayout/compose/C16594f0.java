package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.parser.C16737e;
import androidx.constraintlayout.core.parser.C16740g;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.constraintlayout.compose.f0 */
public final class C16594f0 {
    @C12579k

    /* renamed from: a */
    public final HashMap<String, Integer> f41235a = new HashMap<>();
    @C12579k

    /* renamed from: b */
    public final HashMap<String, C16633x> f41236b = new HashMap<>();
    @C12579k

    /* renamed from: c */
    public final HashMap<String, ArrayList<String>> f41237c = new HashMap<>();

    /* renamed from: a */
    public final float mo48488a(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "elementName");
        if (obj instanceof C16740g) {
            String h = ((C16740g) obj).mo49178h();
            if (this.f41236b.containsKey(h)) {
                C16633x xVar = this.f41236b.get(h);
                Intrinsics.checkNotNull(xVar);
                return xVar.value();
            } else if (!this.f41235a.containsKey(h)) {
                return 0.0f;
            } else {
                Integer num = this.f41235a.get(h);
                Intrinsics.checkNotNull(num);
                return (float) num.intValue();
            }
        } else if (obj instanceof C16737e) {
            return ((C16737e) obj).mo49182r();
        } else {
            return 0.0f;
        }
    }

    @C12580l
    /* renamed from: b */
    public final ArrayList<String> mo48489b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "elementName");
        if (this.f41237c.containsKey(str)) {
            return this.f41237c.get(str);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo48490c(@C12579k String str, float f, float f2) {
        Intrinsics.checkNotNullParameter(str, "elementName");
        if (!this.f41236b.containsKey(str) || !(this.f41236b.get(str) instanceof C16604j0)) {
            this.f41236b.put(str, new C16634y(f, f2));
        }
    }

    /* renamed from: d */
    public final void mo48491d(@C12579k String str, float f, float f2, float f3, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "elementName");
        Intrinsics.checkNotNullParameter(str2, "prefix");
        Intrinsics.checkNotNullParameter(str3, "postfix");
        if (!this.f41236b.containsKey(str) || !(this.f41236b.get(str) instanceof C16604j0)) {
            C16632w wVar = new C16632w(f, f2, f3, str2, str3);
            this.f41236b.put(str, wVar);
            this.f41237c.put(str, wVar.mo48609a());
        }
    }

    /* renamed from: e */
    public final void mo48492e(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "elementName");
        this.f41235a.put(str, Integer.valueOf(i));
    }

    /* renamed from: f */
    public final void mo48493f(@C12579k String str, @C12579k ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "elementName");
        Intrinsics.checkNotNullParameter(arrayList, "elements");
        this.f41237c.put(str, arrayList);
    }

    /* renamed from: g */
    public final void mo48494g(@C12579k String str, float f) {
        Intrinsics.checkNotNullParameter(str, "elementName");
        this.f41236b.put(str, new C16604j0(f));
    }
}
