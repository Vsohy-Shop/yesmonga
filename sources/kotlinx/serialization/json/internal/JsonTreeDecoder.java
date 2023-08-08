package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10930d1;
import kotlin.collections.C10933e1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12204d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.internal.C12282j0;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12403k;
import kotlinx.serialization.json.C12406m;
import kotlinx.serialization.json.C12421x;
import kotlinx.serialization.json.C12424z;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public class JsonTreeDecoder extends C12363c {
    @C12579k

    /* renamed from: i */
    public final JsonObject f30226i;
    @C12580l

    /* renamed from: j */
    public final String f30227j;
    @C12580l

    /* renamed from: k */
    public final C12217f f30228k;

    /* renamed from: l */
    public int f30229l;

    /* renamed from: m */
    public boolean f30230m;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsonTreeDecoder(C12341a aVar, JsonObject jsonObject, String str, C12217f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : fVar);
    }

    /* renamed from: D */
    public boolean mo24867D() {
        return !this.f30230m && super.mo24867D();
    }

    /* renamed from: D0 */
    public final boolean mo25400D0(C12217f fVar, int i) {
        boolean z;
        if (mo25372d().mo25282h().mo25362f() || fVar.mo24832i(i) || !fVar.mo24827g(i).mo24821b()) {
            z = false;
        } else {
            z = true;
        }
        this.f30230m = z;
        return z;
    }

    /* renamed from: E0 */
    public final boolean mo25401E0(C12217f fVar, int i, String str) {
        C12421x xVar;
        C12341a d = mo25372d();
        C12217f g = fVar.mo24827g(i);
        if (!g.mo24821b() && (mo25403k0(str) instanceof JsonNull)) {
            return true;
        }
        if (Intrinsics.areEqual((Object) g.getKind(), (Object) C12224h.C12226b.f30010a)) {
            C12403k k0 = mo25403k0(str);
            String str2 = null;
            if (k0 instanceof C12421x) {
                xVar = (C12421x) k0;
            } else {
                xVar = null;
            }
            if (xVar != null) {
                str2 = C12406m.m50172g(xVar);
            }
            if (str2 != null && JsonNamesMapKt.m49830e(g, d, str2) == -3) {
                return true;
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: F0 */
    public JsonObject mo25399A0() {
        return this.f30226i;
    }

    @C12579k
    /* renamed from: b */
    public C12236c mo24875b(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (fVar == this.f30228k) {
            return this;
        }
        return super.mo24875b(fVar);
    }

    /* renamed from: c */
    public void mo24876c(@C12579k C12217f fVar) {
        Set<String> set;
        Set set2;
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (!this.f30278h.mo25363h() && !(fVar.getKind() instanceof C12204d)) {
            if (!this.f30278h.mo25366l()) {
                set = C12282j0.m49344a(fVar);
            } else {
                Set a = C12282j0.m49344a(fVar);
                Map map = (Map) C12424z.m50238a(mo25372d()).mo25525a(fVar, JsonNamesMapKt.m49828c());
                if (map == null) {
                    set2 = null;
                } else {
                    set2 = map.keySet();
                }
                if (set2 == null) {
                    set2 = C10930d1.m40892k();
                }
                set = C10933e1.m40911C(a, set2);
            }
            for (String next : mo25399A0().keySet()) {
                if (!set.contains(next) && !Intrinsics.areEqual((Object) next, (Object) this.f30227j)) {
                    throw C12388n.m50108g(next, mo25399A0().toString());
                }
            }
        }
    }

    @C12579k
    /* renamed from: g0 */
    public String mo25204g0(@C12579k C12217f fVar, int i) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(fVar, "desc");
        String e = fVar.mo24824e(i);
        if (!this.f30278h.mo25366l() || mo25399A0().keySet().contains(e)) {
            return e;
        }
        Map map = (Map) C12424z.m50238a(mo25372d()).mo25526b(fVar, JsonNamesMapKt.m49828c(), new JsonTreeDecoder$elementName$alternativeNamesMap$1(fVar));
        Iterator it = mo25399A0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = (Integer) map.get((String) obj);
            if (num != null && num.intValue() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        String str = (String) obj;
        if (str == null) {
            return e;
        }
        return str;
    }

    @C12579k
    /* renamed from: k0 */
    public C12403k mo25403k0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        return (C12403k) C10977s0.m41443K(mo25399A0(), str);
    }

    /* renamed from: o */
    public int mo24931o(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        while (this.f30229l < fVar.mo24823d()) {
            int i = this.f30229l;
            this.f30229l = i + 1;
            String h0 = mo24994b0(fVar, i);
            int i2 = this.f30229l - 1;
            this.f30230m = false;
            if ((mo25399A0().containsKey(h0) || mo25400D0(fVar, i2)) && (!this.f30278h.mo25360d() || !mo25401E0(fVar, i2, h0))) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(@C12579k C12341a aVar, @C12579k JsonObject jsonObject, @C12580l String str, @C12580l C12217f fVar) {
        super(aVar, jsonObject, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(jsonObject, "value");
        this.f30226i = jsonObject;
        this.f30227j = str;
        this.f30228k = fVar;
    }
}
