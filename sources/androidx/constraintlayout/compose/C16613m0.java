package androidx.constraintlayout.compose;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertyKey;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.C16804h;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.banner.C9156c;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11532s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.C11510n;
import kotlin.text.C11621s;
import org.jetbrains.annotations.C12579k;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: androidx.constraintlayout.compose.m0 */
public final class C16613m0 {

    /* renamed from: a */
    public static final /* synthetic */ C11510n<Object>[] f41286a = {C11342l0.m43554k(new MutablePropertyReference1Impl(C11342l0.m43551h(C16613m0.class, "compose_release"), "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"))};
    @C12579k

    /* renamed from: b */
    public static final SemanticsPropertyKey<C16624r> f41287b;
    @C12579k

    /* renamed from: c */
    public static final SemanticsPropertyKey f41288c;

    /* renamed from: d */
    public static final int f41289d = 1;

    /* renamed from: e */
    public static final int f41290e = 0;

    /* renamed from: f */
    public static final int f41291f = 1;

    static {
        SemanticsPropertyKey<C16624r> semanticsPropertyKey = new SemanticsPropertyKey<>("DesignInfoProvider", (C11304p) null, 2, (DefaultConstructorMarker) null);
        f41287b = semanticsPropertyKey;
        f41288c = semanticsPropertyKey;
    }

    /* renamed from: a */
    public static final void m75570a(C16804h hVar, List<String> list, C16798d dVar, String str) {
        String str2;
        int i = hVar.f43035B1;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                ConstraintWidget constraintWidget = hVar.f43034A1[i2];
                if (Intrinsics.areEqual((Object) constraintWidget, (Object) dVar)) {
                    str2 = str;
                } else {
                    str2 = m75577h(constraintWidget);
                }
                list.add(str2);
                if (i3 < i) {
                    i2 = i3;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public static final JSONObject m75571b(ConstraintWidget constraintWidget, int i, int i2) {
        return new JSONObject().put(C9168d0.f24880E0, constraintWidget.mo49480L() + i).put(C9156c.f24820X, constraintWidget.mo49539e0() + i2).put(C9168d0.f24887Z, constraintWidget.mo49516X() + i).put(C9156c.f24821Y, constraintWidget.mo49596v() + i2);
    }

    /* renamed from: c */
    public static final String m75572c(JSONObject jSONObject) {
        String jSONObject2 = new JSONObject().put("type", "CONSTRAINTS").put("version", 1).put("content", jSONObject).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "JSONObject()\n    .put(\"type\", \"CONSTRAINTS\")\n    .put(\"version\", CONSTRAINTS_JSON_VERSION)\n    .put(\"content\", content).toString()");
        return jSONObject2;
    }

    @C12579k
    /* renamed from: d */
    public static final SemanticsPropertyKey<C16624r> m75573d() {
        return f41287b;
    }

    @C12579k
    /* renamed from: e */
    public static final C16624r m75574e(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return (C16624r) f41288c.mo46084c(qVar, f41286a[0]);
    }

    @C11532s0
    /* renamed from: f */
    public static /* synthetic */ void m75575f(C16044q qVar) {
    }

    /* renamed from: g */
    public static final String m75576g(ConstraintWidget constraintWidget, C16611l0 l0Var) {
        return String.valueOf(l0Var.mo48540F((C16804h) constraintWidget));
    }

    /* renamed from: h */
    public static final String m75577h(ConstraintWidget constraintWidget) {
        Object a;
        String str = null;
        Object w = constraintWidget == null ? null : constraintWidget.mo49599w();
        C15557e0 e0Var = w instanceof C15557e0 ? (C15557e0) w : null;
        String obj = (e0Var == null || (a = C15594q.m69317a(e0Var)) == null) ? null : a.toString();
        if (obj != null) {
            return obj;
        }
        if (constraintWidget != null) {
            str = constraintWidget.f42750o;
        }
        return String.valueOf(str);
    }

    @C12579k
    /* renamed from: i */
    public static final String m75578i(@C12579k C16798d dVar, @C12579k C16611l0 l0Var, int i, int i2, @C12579k String str) {
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        C16798d dVar2 = dVar;
        C16611l0 l0Var2 = l0Var;
        int i3 = i;
        int i4 = i2;
        Intrinsics.checkNotNullParameter(dVar2, C10108c.f27819v);
        Intrinsics.checkNotNullParameter(l0Var2, "state");
        Intrinsics.checkNotNullParameter(str, "args");
        String valueOf = String.valueOf(State.f42495j);
        JSONObject jSONObject = new JSONObject();
        Integer intOrNull = C11621s.toIntOrNull(str);
        boolean z4 = true;
        if (intOrNull == null) {
            z2 = true;
            z = true;
        } else {
            int intValue = intOrNull.intValue();
            if ((intValue >> 1) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((intValue >> 0) != 1) {
                z4 = false;
            }
            z2 = z4;
            z = z3;
        }
        ArrayList<ConstraintWidget> l2 = dVar.mo49843l2();
        Intrinsics.checkNotNullExpressionValue(l2, "root.children");
        for (ConstraintWidget constraintWidget : l2) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList();
            boolean z5 = constraintWidget instanceof C16804h;
            String str3 = constraintWidget.f42750o;
            if (z5) {
                m75570a((C16804h) constraintWidget, arrayList, dVar2, valueOf);
            }
            ArrayList<ConstraintAnchor> s = constraintWidget.mo49586s();
            Intrinsics.checkNotNullExpressionValue(s, "constraintWidget.anchors");
            for (ConstraintAnchor constraintAnchor : s) {
                if (constraintAnchor.mo49435p()) {
                    ConstraintWidget i5 = constraintAnchor.mo49430k().mo49428i();
                    boolean z6 = i5 instanceof C16804h;
                    if (Intrinsics.areEqual((Object) dVar2, (Object) i5)) {
                        str2 = valueOf;
                    } else if (z6) {
                        Intrinsics.checkNotNullExpressionValue(i5, "targetWidget");
                        str2 = m75576g(i5, l0Var2);
                    } else {
                        str2 = m75577h(i5);
                    }
                    JSONObject put = new JSONObject().put("originAnchor", constraintAnchor.mo49431l());
                    ConstraintAnchor k = constraintAnchor.mo49430k();
                    Intrinsics.checkNotNull(k);
                    jSONArray.put(put.put("targetAnchor", k.mo49431l()).put("target", str2).put("margin", constraintAnchor.mo49426g()));
                }
                l0Var2 = l0Var;
            }
            Intrinsics.checkNotNullExpressionValue(str3, "widgetId");
            Intrinsics.checkNotNullExpressionValue(constraintWidget, "constraintWidget");
            JSONObject b = m75571b(constraintWidget, i3, i4);
            Intrinsics.checkNotNullExpressionValue(b, "constraintWidget.boundsToJson(startX, startY)");
            m75579j(jSONObject, str3, b, constraintWidget instanceof C16804h, false, arrayList, jSONArray, z2, z);
            l0Var2 = l0Var;
        }
        JSONObject b2 = m75571b(dVar2, i3, i4);
        Intrinsics.checkNotNullExpressionValue(b2, "root.boundsToJson(startX, startY)");
        m75579j(jSONObject, valueOf, b2, false, true, CollectionsKt__CollectionsKt.m40441E(), new JSONArray(), z2, z);
        return m75572c(jSONObject);
    }

    /* renamed from: j */
    public static final void m75579j(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z, boolean z2, List<String> list, JSONArray jSONArray, boolean z3, boolean z4) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("viewId", str);
        if (z4) {
            jSONObject3.put("box", jSONObject2);
        }
        jSONObject3.put("isHelper", z);
        jSONObject3.put("isRoot", z2);
        JSONArray jSONArray2 = new JSONArray();
        for (Object put : list) {
            jSONArray2.put(put);
        }
        jSONObject3.put("helperReferences", jSONArray2);
        if (z3) {
            jSONObject3.put("constraints", jSONArray);
        }
        jSONObject.put(str, jSONObject3);
    }

    /* renamed from: k */
    public static /* synthetic */ void m75580k(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z, boolean z2, List list, JSONArray jSONArray, boolean z3, boolean z4, int i, Object obj) {
        int i2 = i;
        m75579j(jSONObject, str, jSONObject2, z, z2, list, jSONArray, (i2 & 64) != 0 ? true : z3, (i2 & 128) != 0 ? true : z4);
    }

    /* renamed from: l */
    public static final void m75581l(@C12579k C16044q qVar, @C12579k C16624r rVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        f41288c.mo46086e(qVar, f41286a[0], rVar);
    }
}
