package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.core.state.C16745a;
import androidx.constraintlayout.core.state.C16747c;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.C16804h;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.constraintlayout.compose.l0 */
public final class C16611l0 extends State {

    /* renamed from: q */
    public static final int f41278q = 8;
    @C12579k

    /* renamed from: k */
    public final C16479d f41279k;

    /* renamed from: l */
    public long f41280l = C16478c.m74377b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: m */
    public LayoutDirection f41281m;
    @C12579k

    /* renamed from: n */
    public final List<Object> f41282n = new ArrayList();

    /* renamed from: o */
    public boolean f41283o = true;
    @C12579k

    /* renamed from: p */
    public final Set<ConstraintWidget> f41284p = new LinkedHashSet();

    public C16611l0(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f41279k = dVar;
    }

    /* renamed from: C */
    public final void mo48537C(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "id");
        this.f41282n.add(obj);
        this.f41283o = true;
    }

    @C12579k
    /* renamed from: D */
    public final List<Object> mo48538D() {
        return this.f41282n;
    }

    @C12579k
    /* renamed from: E */
    public final C16479d mo48539E() {
        return this.f41279k;
    }

    @C12580l
    /* renamed from: F */
    public final Object mo48540F(@C12579k C16804h hVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(hVar, "helperWidget");
        Set<Map.Entry<Object, C16745a>> entrySet = this.f42497b.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "mHelperReferences.entries");
        Iterator it = entrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((C16745a) ((Map.Entry) obj).getValue()).mo49329N0(), (Object) hVar)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    @C12579k
    /* renamed from: G */
    public final LayoutDirection mo48541G() {
        LayoutDirection layoutDirection = this.f41281m;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        throw null;
    }

    /* renamed from: H */
    public final long mo48542H() {
        return this.f41280l;
    }

    /* renamed from: I */
    public final boolean mo48543I(@C12579k ConstraintWidget constraintWidget) {
        ConstraintWidget constraintWidget2;
        Intrinsics.checkNotNullParameter(constraintWidget, "constraintWidget");
        if (this.f41283o) {
            this.f41284p.clear();
            for (Object obj : this.f41282n) {
                C16747c cVar = this.f42496a.get(obj);
                if (cVar == null) {
                    constraintWidget2 = null;
                } else {
                    constraintWidget2 = cVar.mo49234b();
                }
                if (constraintWidget2 != null) {
                    this.f41284p.add(constraintWidget2);
                }
            }
            this.f41283o = false;
        }
        return this.f41284p.contains(constraintWidget);
    }

    /* renamed from: J */
    public final void mo48544J(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.f41281m = layoutDirection;
    }

    /* renamed from: K */
    public final void mo48545K(long j) {
        this.f41280l = j;
    }

    /* renamed from: f */
    public int mo48546f(@C12580l Object obj) {
        if (obj instanceof C16483g) {
            return this.f41279k.mo7429n2(((C16483g) obj).mo47823t0());
        }
        return super.mo48546f(obj);
    }

    /* renamed from: s */
    public void mo48547s() {
        ConstraintWidget b;
        HashMap<Object, C16747c> hashMap = this.f42496a;
        Intrinsics.checkNotNullExpressionValue(hashMap, "mReferences");
        for (Map.Entry<Object, C16747c> value : hashMap.entrySet()) {
            C16747c cVar = (C16747c) value.getValue();
            if (!(cVar == null || (b = cVar.mo49234b()) == null)) {
                b.mo49499R0();
            }
        }
        this.f42496a.clear();
        HashMap<Object, C16747c> hashMap2 = this.f42496a;
        Intrinsics.checkNotNullExpressionValue(hashMap2, "mReferences");
        hashMap2.put(State.f42495j, this.f42499d);
        this.f41282n.clear();
        this.f41283o = true;
        super.mo48547s();
    }
}
