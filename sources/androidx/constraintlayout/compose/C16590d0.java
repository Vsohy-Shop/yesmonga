package androidx.constraintlayout.compose;

import java.util.Collection;
import java.util.HashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.lang.annotations.C12553d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.constraintlayout.compose.d0 */
public final class C16590d0 extends C16629u implements C16601i0 {
    @C12579k

    /* renamed from: x */
    public final HashMap<String, String> f41223x = new HashMap<>();
    @C12579k

    /* renamed from: y */
    public final HashMap<String, String> f41224y = new HashMap<>();

    /* renamed from: z */
    public float f41225z = Float.NaN;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16590d0(@C12579k @C12553d("json5") String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "content");
        mo48589A();
    }

    /* renamed from: D */
    public void mo48461D(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "content");
        super.mo48461D(str);
        try {
            C16610l.m75552v(this, str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: F */
    public void mo48467F(float f) {
        this.f41225z = f;
        mo48594H();
    }

    /* renamed from: e */
    public float mo48468e() {
        return this.f41225z;
    }

    @C12580l
    /* renamed from: l */
    public String mo48469l(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return this.f41224y.get(str);
    }

    @C12580l
    /* renamed from: m */
    public String mo48470m(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return this.f41223x.get(str);
    }

    /* renamed from: n */
    public void mo48471n() {
        this.f41225z = Float.NaN;
    }

    /* renamed from: o */
    public void mo48472o(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "content");
        this.f41224y.put(str, str2);
    }

    /* renamed from: q */
    public void mo48473q(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "content");
        this.f41223x.put(str, str2);
    }

    @C12580l
    /* renamed from: r */
    public String mo48474r(int i) {
        Collection<String> values = this.f41223x.values();
        Intrinsics.checkNotNullExpressionValue(values, "constraintSetsContent.values");
        return (String) CollectionsKt___CollectionsKt.m40628f2(values, i);
    }
}
