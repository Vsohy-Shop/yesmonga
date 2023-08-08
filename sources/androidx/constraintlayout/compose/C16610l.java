package androidx.constraintlayout.compose;

import androidx.appcompat.graphics.drawable.C0508a;
import androidx.compose.p004ui.unit.C16483g;
import androidx.constraintlayout.core.motion.utils.C16680d;
import androidx.constraintlayout.core.motion.utils.C16716u;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.constraintlayout.core.parser.C16733a;
import androidx.constraintlayout.core.parser.C16735c;
import androidx.constraintlayout.core.parser.C16736d;
import androidx.constraintlayout.core.parser.C16737e;
import androidx.constraintlayout.core.parser.C16738f;
import androidx.constraintlayout.core.parser.C16740g;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.C16769n;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.Dimension;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.C16755c;
import androidx.constraintlayout.core.state.helpers.C16758e;
import androidx.constraintlayout.core.state.helpers.C16759f;
import androidx.constraintlayout.motion.widget.C16886i;
import androidx.constraintlayout.widget.C16934c;
import com.urbanairship.automation.actions.CancelSchedulesAction;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.banner.C9156c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.C10953k0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlin.text.C11626x;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.constraintlayout.compose.l */
public final class C16610l {

    /* renamed from: a */
    public static final boolean f41277a = false;

    @C12580l
    /* renamed from: a */
    public static final String m75531a(@C12579k C16738f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "element");
        ArrayList<String> I0 = fVar.mo49146I0();
        if (I0 == null) {
            return null;
        }
        Iterator it = C11479u.m44378W1(0, I0.size()).iterator();
        while (it.hasNext()) {
            if (I0.get(((C10953k0) it).mo6374c()).equals("type")) {
                return fVar.mo49142C0("type");
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final void m75532b(@C12579k C16738f fVar, @C12579k String str, @C12579k C16738f fVar2) {
        Intrinsics.checkNotNullParameter(fVar, "baseJson");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(fVar2, "overrideValue");
        if (!fVar.mo49145H0(str)) {
            fVar.mo49147J0(str, fVar2);
            return;
        }
        C16738f w0 = fVar.mo49165w0(str);
        Iterator<String> it = fVar2.mo49146I0().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals("clear")) {
                C16733a o0 = fVar2.mo49156o0("clear");
                Iterator it2 = C11479u.m44378W1(0, o0.size()).iterator();
                while (it2.hasNext()) {
                    String F0 = o0.mo49143F0(((C10953k0) it2).mo6374c());
                    if (F0 != null) {
                        int hashCode = F0.hashCode();
                        if (hashCode != -1727069561) {
                            if (hashCode != -1606703562) {
                                if (hashCode == 414334925 && F0.equals("dimensions")) {
                                    w0.mo49149L0("width");
                                    w0.mo49149L0("height");
                                }
                            } else if (F0.equals("constraints")) {
                                w0.mo49149L0("start");
                                w0.mo49149L0("end");
                                w0.mo49149L0(C9156c.f24820X);
                                w0.mo49149L0(C9156c.f24821Y);
                                w0.mo49149L0("baseline");
                                w0.mo49149L0(C9168d0.f24881F0);
                                w0.mo49149L0("centerHorizontally");
                                w0.mo49149L0("centerVertically");
                            }
                        } else if (F0.equals("transforms")) {
                            w0.mo49149L0("visibility");
                            w0.mo49149L0("alpha");
                            w0.mo49149L0("pivotX");
                            w0.mo49149L0("pivotY");
                            w0.mo49149L0("rotationX");
                            w0.mo49149L0("rotationY");
                            w0.mo49149L0("rotationZ");
                            w0.mo49149L0("scaleX");
                            w0.mo49149L0("scaleY");
                            w0.mo49149L0("translationX");
                            w0.mo49149L0("translationY");
                        }
                        w0.mo49149L0(F0);
                    }
                }
            } else {
                w0.mo49147J0(next, fVar2.mo49154m0(next));
            }
        }
    }

    /* renamed from: c */
    public static final void m75533c(@C12579k C16611l0 l0Var, @C12579k String str, @C12579k C16738f fVar) {
        String C0;
        C16733a p0;
        int size;
        Intrinsics.checkNotNullParameter(l0Var, "state");
        Intrinsics.checkNotNullParameter(str, "elementName");
        Intrinsics.checkNotNullParameter(fVar, "element");
        C16755c b = l0Var.mo49305b(str, State.Direction.END);
        ArrayList<String> I0 = fVar.mo49146I0();
        if (I0 != null) {
            Iterator it = C11479u.m44378W1(0, I0.size()).iterator();
            while (it.hasNext()) {
                String str2 = I0.get(((C10953k0) it).mo6374c());
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -1081309778) {
                        if (hashCode == -962590849) {
                            if (str2.equals("direction") && (C0 = fVar.mo49142C0(str2)) != null) {
                                switch (C0.hashCode()) {
                                    case -1383228885:
                                        if (C0.equals(C9156c.f24821Y)) {
                                            b.mo49344Q0(State.Direction.BOTTOM);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 100571:
                                        if (C0.equals("end")) {
                                            b.mo49344Q0(State.Direction.END);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 115029:
                                        if (C0.equals(C9156c.f24820X)) {
                                            b.mo49344Q0(State.Direction.f42528e);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3317767:
                                        if (C0.equals(C9168d0.f24880E0)) {
                                            b.mo49344Q0(State.Direction.LEFT);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 108511772:
                                        if (C0.equals(C9168d0.f24887Z)) {
                                            b.mo49344Q0(State.Direction.RIGHT);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 109757538:
                                        if (C0.equals("start")) {
                                            b.mo49344Q0(State.Direction.START);
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        } else if (hashCode == -567445985 && str2.equals("contains") && (p0 = fVar.mo49157p0(str2)) != null && (size = p0.size()) > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                b.mo49328M0(l0Var.mo49308e(p0.mo49153l0(i).mo49178h()));
                                if (i2 < size) {
                                    i = i2;
                                }
                            }
                        }
                    } else if (str2.equals("margin")) {
                        float t0 = fVar.mo49161t0(str2);
                        if (!Float.isNaN(t0)) {
                            b.mo49237c0((int) t0);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r10 = (androidx.constraintlayout.core.parser.C16738f) r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75534d(int r7, @org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16611l0 r8, @org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16594f0 r9, @org.jetbrains.annotations.C12579k androidx.constraintlayout.core.parser.C16733a r10) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "margins"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "helper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            if (r7 != 0) goto L_0x0016
            androidx.constraintlayout.core.state.helpers.g r7 = r8.mo49316n()
            goto L_0x001a
        L_0x0016:
            androidx.constraintlayout.core.state.helpers.h r7 = r8.mo49326y()
        L_0x001a:
            r0 = 1
            androidx.constraintlayout.core.parser.c r1 = r10.mo49153l0(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.C16733a
            if (r2 == 0) goto L_0x00f3
            androidx.constraintlayout.core.parser.a r1 = (androidx.constraintlayout.core.parser.C16733a) r1
            int r2 = r1.size()
            if (r2 >= r0) goto L_0x002d
            goto L_0x00f3
        L_0x002d:
            int r2 = r1.size()
            r3 = 0
            kotlin.ranges.l r2 = kotlin.ranges.C11479u.m44378W1(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x003a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0053
            r4 = r2
            kotlin.collections.k0 r4 = (kotlin.collections.C10953k0) r4
            int r4 = r4.mo6374c()
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r4 = r1.mo49140B0(r4)
            r5[r3] = r4
            r7.mo49328M0(r5)
            goto L_0x003a
        L_0x0053:
            int r1 = r10.size()
            r2 = 2
            if (r1 <= r2) goto L_0x00f3
            androidx.constraintlayout.core.parser.c r10 = r10.mo49153l0(r2)
            boolean r1 = r10 instanceof androidx.constraintlayout.core.parser.C16738f
            if (r1 != 0) goto L_0x0063
            return
        L_0x0063:
            androidx.constraintlayout.core.parser.f r10 = (androidx.constraintlayout.core.parser.C16738f) r10
            java.util.ArrayList r1 = r10.mo49146I0()
            if (r1 != 0) goto L_0x006c
            return
        L_0x006c:
            int r2 = r1.size()
            kotlin.ranges.l r2 = kotlin.ranges.C11479u.m44378W1(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0078:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00f3
            r4 = r2
            kotlin.collections.k0 r4 = (kotlin.collections.C10953k0) r4
            int r4 = r4.mo6374c()
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "style"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00e0
            androidx.constraintlayout.core.parser.c r4 = r10.mo49154m0(r4)
            boolean r5 = r4 instanceof androidx.constraintlayout.core.parser.C16733a
            if (r5 == 0) goto L_0x00b5
            r5 = r4
            androidx.constraintlayout.core.parser.a r5 = (androidx.constraintlayout.core.parser.C16733a) r5
            int r6 = r5.size()
            if (r6 <= r0) goto L_0x00b5
            java.lang.String r4 = r5.mo49140B0(r3)
            java.lang.String r6 = "styleObject.getString(0)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            float r5 = r5.getFloat(r0)
            r7.mo49259n(r5)
            goto L_0x00be
        L_0x00b5:
            java.lang.String r4 = r4.mo49178h()
            java.lang.String r5 = "styleObject.content()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
        L_0x00be:
            java.lang.String r5 = "packed"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00cc
            androidx.constraintlayout.core.state.State$Chain r4 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r7.mo49348T0(r4)
            goto L_0x0078
        L_0x00cc:
            java.lang.String r5 = "spread_inside"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x00da
            androidx.constraintlayout.core.state.State$Chain r4 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r7.mo49348T0(r4)
            goto L_0x0078
        L_0x00da:
            androidx.constraintlayout.core.state.State$Chain r4 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r7.mo49348T0(r4)
            goto L_0x0078
        L_0x00e0:
            if (r7 == 0) goto L_0x00eb
            java.lang.String r5 = "constraintName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            m75536f(r8, r9, r10, r7, r4)
            goto L_0x0078
        L_0x00eb:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type androidx.constraintlayout.core.state.ConstraintReference"
            r7.<init>(r8)
            throw r7
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.C16610l.m75534d(int, androidx.constraintlayout.compose.l0, androidx.constraintlayout.compose.f0, androidx.constraintlayout.core.parser.a):void");
    }

    /* renamed from: e */
    public static final Integer m75535e(String str) {
        if (!StringsKt__StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) {
            return null;
        }
        if (str != null) {
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            if (substring.length() == 6) {
                substring = Intrinsics.stringPlus("FF", substring);
            }
            return Integer.valueOf((int) Long.parseLong(substring, 16));
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: f */
    public static final void m75536f(C16611l0 l0Var, C16594f0 f0Var, C16738f fVar, ConstraintReference constraintReference, String str) {
        ConstraintReference constraintReference2;
        float f;
        float f2;
        ConstraintReference constraintReference3;
        C16611l0 l0Var2 = l0Var;
        C16594f0 f0Var2 = f0Var;
        C16738f fVar2 = fVar;
        ConstraintReference constraintReference4 = constraintReference;
        String str2 = str;
        C16733a p0 = fVar2.mo49157p0(str2);
        if (p0 == null || p0.size() <= 1) {
            String str3 = "reference.key";
            String str4 = "targetReference.key";
            String G0 = fVar2.mo49144G0(str2);
            if (G0 != null) {
                if (G0.equals(C16934c.f44493V1)) {
                    constraintReference2 = l0Var2.mo49308e(State.f42495j);
                } else {
                    constraintReference2 = l0Var2.mo49308e(G0);
                }
                switch (str.hashCode()) {
                    case -1720785339:
                        if (str2.equals("baseline")) {
                            Object key = constraintReference.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, str3);
                            l0Var2.mo48537C(key);
                            Object key2 = constraintReference2.getKey();
                            Intrinsics.checkNotNullExpressionValue(key2, str4);
                            l0Var2.mo48537C(key2);
                            constraintReference4.mo49253k(constraintReference2);
                            return;
                        }
                        return;
                    case -1383228885:
                        if (str2.equals(C9156c.f24821Y)) {
                            constraintReference4.mo49263p(constraintReference2);
                            return;
                        }
                        return;
                    case 100571:
                        if (str2.equals("end")) {
                            constraintReference4.mo49194A(constraintReference2);
                            return;
                        }
                        return;
                    case 115029:
                        if (str2.equals(C9156c.f24820X)) {
                            constraintReference4.mo49203E0(constraintReference2);
                            return;
                        }
                        return;
                    case 109757538:
                        if (str2.equals("start")) {
                            constraintReference4.mo49197B0(constraintReference2);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } else {
            String B0 = p0.mo49140B0(0);
            String F0 = p0.mo49143F0(1);
            String str5 = "targetReference.key";
            String str6 = "reference.key";
            if (p0.size() > 2) {
                C16735c z0 = p0.mo49167z0(2);
                Intrinsics.checkNotNull(z0);
                f = (float) l0Var2.mo48546f(C16483g.m74451w(C16483g.m74435M(f0Var2.mo48488a(z0))));
            } else {
                f = 0.0f;
            }
            if (p0.size() > 3) {
                C16735c z02 = p0.mo49167z0(3);
                Intrinsics.checkNotNull(z02);
                f2 = (float) l0Var2.mo48546f(C16483g.m74451w(C16483g.m74435M(f0Var2.mo48488a(z02))));
            } else {
                f2 = 0.0f;
            }
            if (B0.equals(C16934c.f44493V1)) {
                constraintReference3 = l0Var2.mo49308e(State.f42495j);
            } else {
                constraintReference3 = l0Var2.mo49308e(B0);
            }
            float f3 = f2;
            switch (str.hashCode()) {
                case -1720785339:
                    if (str2.equals("baseline") && F0 != null) {
                        int hashCode = F0.hashCode();
                        if (hashCode != -1720785339) {
                            if (hashCode != -1383228885) {
                                if (hashCode == 115029 && F0.equals(C9156c.f24820X)) {
                                    Object key3 = constraintReference.getKey();
                                    Intrinsics.checkNotNullExpressionValue(key3, str6);
                                    l0Var2.mo48537C(key3);
                                    Object key4 = constraintReference3.getKey();
                                    Intrinsics.checkNotNullExpressionValue(key4, str5);
                                    l0Var2.mo48537C(key4);
                                    constraintReference4.mo49257m(constraintReference3);
                                    break;
                                }
                            } else {
                                String str7 = str5;
                                String str8 = str6;
                                if (F0.equals(C9156c.f24821Y)) {
                                    Object key5 = constraintReference.getKey();
                                    Intrinsics.checkNotNullExpressionValue(key5, str8);
                                    l0Var2.mo48537C(key5);
                                    Object key6 = constraintReference3.getKey();
                                    Intrinsics.checkNotNullExpressionValue(key6, str7);
                                    l0Var2.mo48537C(key6);
                                    constraintReference4.mo49255l(constraintReference3);
                                    break;
                                }
                            }
                        } else {
                            String str9 = str5;
                            String str10 = str6;
                            if (F0.equals("baseline")) {
                                Object key7 = constraintReference.getKey();
                                Intrinsics.checkNotNullExpressionValue(key7, str10);
                                l0Var2.mo48537C(key7);
                                Object key8 = constraintReference3.getKey();
                                Intrinsics.checkNotNullExpressionValue(key8, str9);
                                l0Var2.mo48537C(key8);
                                constraintReference4.mo49253k(constraintReference3);
                                break;
                            }
                        }
                    }
                    break;
                case -1498085729:
                    if (str2.equals("circular")) {
                        C16735c l0 = p0.mo49153l0(1);
                        Intrinsics.checkNotNullExpressionValue(l0, "constraint.get(1)");
                        constraintReference4.mo49271t(constraintReference3, f0Var2.mo48488a(l0), 0.0f);
                        break;
                    }
                    break;
                case -1383228885:
                    if (str2.equals(C9156c.f24821Y)) {
                        if (!Intrinsics.areEqual((Object) F0, (Object) C9156c.f24820X)) {
                            if (Intrinsics.areEqual((Object) F0, (Object) C9156c.f24821Y)) {
                                constraintReference4.mo49263p(constraintReference3);
                                break;
                            }
                        } else {
                            constraintReference4.mo49265q(constraintReference3);
                            break;
                        }
                    }
                    break;
                case 100571:
                    if (str2.equals("end")) {
                        if (!Intrinsics.areEqual((Object) F0, (Object) "start")) {
                            if (Intrinsics.areEqual((Object) F0, (Object) "end")) {
                                constraintReference4.mo49194A(constraintReference3);
                                break;
                            }
                        } else {
                            constraintReference4.mo49196B(constraintReference3);
                            break;
                        }
                    }
                    break;
                case 115029:
                    if (str2.equals(C9156c.f24820X)) {
                        if (!Intrinsics.areEqual((Object) F0, (Object) C9156c.f24820X)) {
                            if (Intrinsics.areEqual((Object) F0, (Object) C9156c.f24821Y)) {
                                constraintReference4.mo49201D0(constraintReference3);
                                break;
                            }
                        } else {
                            constraintReference4.mo49203E0(constraintReference3);
                            break;
                        }
                    }
                    break;
                case 3317767:
                    if (str2.equals(C9168d0.f24880E0)) {
                        if (!Intrinsics.areEqual((Object) F0, (Object) C9168d0.f24880E0)) {
                            if (Intrinsics.areEqual((Object) F0, (Object) C9168d0.f24887Z)) {
                                constraintReference4.mo49235b0(constraintReference3);
                                break;
                            }
                        } else {
                            constraintReference4.mo49233a0(constraintReference3);
                            break;
                        }
                    }
                    break;
                case 108511772:
                    if (str2.equals(C9168d0.f24887Z)) {
                        if (!Intrinsics.areEqual((Object) F0, (Object) C9168d0.f24880E0)) {
                            if (Intrinsics.areEqual((Object) F0, (Object) C9168d0.f24887Z)) {
                                constraintReference4.mo49254k0(constraintReference3);
                                break;
                            }
                        } else {
                            constraintReference4.mo49252j0(constraintReference3);
                            break;
                        }
                    }
                    break;
                case 109757538:
                    if (str2.equals("start")) {
                        if (!Intrinsics.areEqual((Object) F0, (Object) "start")) {
                            if (Intrinsics.areEqual((Object) F0, (Object) "end")) {
                                constraintReference4.mo49195A0(constraintReference3);
                                break;
                            }
                        } else {
                            constraintReference4.mo49197B0(constraintReference3);
                            break;
                        }
                    }
                    break;
            }
            constraintReference4.mo49239d0(Float.valueOf(f)).mo49241e0((int) f3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0025 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75537g(@org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16601i0 r13, @org.jetbrains.annotations.C12579k java.lang.Object r14) {
        /*
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r0 = r14 instanceof androidx.constraintlayout.core.parser.C16738f
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            androidx.constraintlayout.core.parser.f r14 = (androidx.constraintlayout.core.parser.C16738f) r14
            java.util.ArrayList r0 = r14.mo49146I0()
            if (r0 != 0) goto L_0x0018
            return
        L_0x0018:
            int r1 = r0.size()
            r2 = 0
            kotlin.ranges.l r1 = kotlin.ranges.C11479u.m44378W1(r2, r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00bd
            r3 = r1
            kotlin.collections.k0 r3 = (kotlin.collections.C10953k0) r3
            int r3 = r3.mo6374c()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.core.parser.f r4 = r14.mo49165w0(r3)
            java.lang.String r5 = "Extends"
            java.lang.String r5 = r4.mo49144G0(r5)
            java.lang.String r6 = "csName"
            if (r5 == 0) goto L_0x00a9
            int r7 = r5.length()
            r8 = 1
            if (r7 <= 0) goto L_0x004f
            r7 = r8
            goto L_0x0050
        L_0x004f:
            r7 = r2
        L_0x0050:
            if (r7 == 0) goto L_0x00a9
            java.lang.String r5 = r13.mo48470m(r5)
            if (r5 == 0) goto L_0x00a9
            androidx.constraintlayout.core.parser.f r5 = androidx.constraintlayout.core.parser.CLParser.m76375d(r5)
            java.util.ArrayList r7 = r4.mo49146I0()
            if (r7 == 0) goto L_0x00a9
            int r9 = r7.size()
            kotlin.ranges.l r9 = kotlin.ranges.C11479u.m44378W1(r2, r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x006e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0099
            r10 = r9
            kotlin.collections.k0 r10 = (kotlin.collections.C10953k0) r10
            int r10 = r10.mo6374c()
            java.lang.Object r10 = r7.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            androidx.constraintlayout.core.parser.c r11 = r4.mo49154m0(r10)
            boolean r12 = r11 instanceof androidx.constraintlayout.core.parser.C16738f
            if (r12 == 0) goto L_0x006e
            java.lang.String r12 = "baseJson"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r12)
            java.lang.String r12 = "widgetOverrideName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r12)
            androidx.constraintlayout.core.parser.f r11 = (androidx.constraintlayout.core.parser.C16738f) r11
            m75532b(r5, r10, r11)
            goto L_0x006e
        L_0x0099:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
            java.lang.String r5 = r5.mo49134i0()
            java.lang.String r7 = "baseJson.toJSON()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            r13.mo48473q(r3, r5)
            goto L_0x00aa
        L_0x00a9:
            r8 = r2
        L_0x00aa:
            if (r8 != 0) goto L_0x0025
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
            java.lang.String r4 = r4.mo49134i0()
            java.lang.String r5 = "constraintSet.toJSON()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r13.mo48473q(r3, r4)
            goto L_0x0025
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.C16610l.m75537g(androidx.constraintlayout.compose.i0, java.lang.Object):void");
    }

    /* renamed from: h */
    public static final void m75538h(C16738f fVar, ConstraintReference constraintReference, String str) {
        ArrayList<String> I0;
        C16738f y0 = fVar.mo49166y0(str);
        if (y0 != null && (I0 = y0.mo49146I0()) != null) {
            Iterator it = C11479u.m44378W1(0, I0.size()).iterator();
            while (it.hasNext()) {
                String str2 = I0.get(((C10953k0) it).mo6374c());
                C16735c m0 = y0.mo49154m0(str2);
                if (m0 instanceof C16737e) {
                    constraintReference.mo49244g(str2, m0.mo49182r());
                } else if (m0 instanceof C16740g) {
                    String h = m0.mo49178h();
                    Intrinsics.checkNotNullExpressionValue(h, "value.content()");
                    Integer e = m75535e(h);
                    if (e != null) {
                        constraintReference.mo49242f(str2, e.intValue());
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public static final void m75539i(@C12579k String str, @C12579k ArrayList<C16620p> arrayList) {
        C16738f fVar;
        ArrayList<String> arrayList2;
        String str2;
        ArrayList<C16620p> arrayList3 = arrayList;
        Intrinsics.checkNotNullParameter(str, "content");
        Intrinsics.checkNotNullParameter(arrayList3, "list");
        C16738f d = CLParser.m76375d(str);
        ArrayList<String> I0 = d.mo49146I0();
        if (I0 != null) {
            int i = 0;
            Iterator it = C11479u.m44378W1(0, I0.size()).iterator();
            while (it.hasNext()) {
                String str3 = I0.get(((C10953k0) it).mo6374c());
                C16735c m0 = d.mo49154m0(str3);
                if (Intrinsics.areEqual((Object) str3, (Object) "Design")) {
                    if (m0 != null) {
                        C16738f fVar2 = (C16738f) m0;
                        ArrayList<String> I02 = fVar2.mo49146I0();
                        if (I02 != null) {
                            Iterator it2 = C11479u.m44378W1(i, I02.size()).iterator();
                            while (it2.hasNext()) {
                                String str4 = I02.get(((C10953k0) it2).mo6374c());
                                C16735c m02 = fVar2.mo49154m0(str4);
                                if (m02 != null) {
                                    C16738f fVar3 = (C16738f) m02;
                                    System.out.printf("element found <" + str4 + C11626x.f28915f, new Object[i]);
                                    String G0 = fVar3.mo49144G0("type");
                                    if (G0 != null) {
                                        HashMap hashMap = new HashMap();
                                        int size = fVar3.size() - 1;
                                        if (size >= 0) {
                                            int i2 = i;
                                            while (true) {
                                                int i3 = i2 + 1;
                                                C16735c l0 = fVar3.mo49153l0(i2);
                                                if (l0 != null) {
                                                    C16736d dVar = (C16736d) l0;
                                                    String h = dVar.mo49178h();
                                                    C16735c O0 = dVar.mo49186O0();
                                                    if (O0 == null) {
                                                        str2 = null;
                                                    } else {
                                                        str2 = O0.mo49178h();
                                                    }
                                                    fVar = d;
                                                    String str5 = str2;
                                                    arrayList2 = I0;
                                                    if (str5 != null) {
                                                        Intrinsics.checkNotNullExpressionValue(h, "paramName");
                                                        hashMap.put(h, str5);
                                                    }
                                                    if (i2 == size) {
                                                        break;
                                                    }
                                                    i2 = i3;
                                                    I0 = arrayList2;
                                                    d = fVar;
                                                } else {
                                                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                                                }
                                            }
                                        } else {
                                            fVar = d;
                                            arrayList2 = I0;
                                        }
                                        Intrinsics.checkNotNullExpressionValue(str4, "elementName");
                                        arrayList3.add(new C16620p(str4, G0, hashMap));
                                    } else {
                                        fVar = d;
                                        arrayList2 = I0;
                                    }
                                    I0 = arrayList2;
                                    d = fVar;
                                    i = 0;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                                }
                            }
                            continue;
                        } else {
                            return;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                    }
                }
                I0 = I0;
                d = d;
                i = 0;
            }
        }
    }

    /* renamed from: j */
    public static final Dimension m75540j(C16738f fVar, String str, C16611l0 l0Var) {
        C16735c m0 = fVar.mo49154m0(str);
        Dimension a = Dimension.m76548a(0);
        Intrinsics.checkNotNullExpressionValue(a, "Fixed(0)");
        if (m0 instanceof C16740g) {
            String h = m0.mo49178h();
            Intrinsics.checkNotNullExpressionValue(h, "dimensionElement.content()");
            return m75541k(h);
        } else if (m0 instanceof C16737e) {
            Dimension a2 = Dimension.m76548a(l0Var.mo48546f(C16483g.m74451w(C16483g.m74435M(fVar.mo49159s0(str)))));
            Intrinsics.checkNotNullExpressionValue(a2, "Fixed(\n            state.convertDimension(\n                Dp(\n                    element.getFloat(constraintName)\n                )\n            )\n        )");
            return a2;
        } else if (!(m0 instanceof C16738f)) {
            return a;
        } else {
            C16738f fVar2 = (C16738f) m0;
            String G0 = fVar2.mo49144G0("value");
            if (G0 != null) {
                a = m75541k(G0);
            }
            C16735c A0 = fVar2.mo49139A0("min");
            if (A0 != null) {
                if (A0 instanceof C16737e) {
                    a.mo49295q(l0Var.mo48546f(C16483g.m74451w(C16483g.m74435M(A0.mo49182r()))));
                } else if (A0 instanceof C16740g) {
                    a.mo49296r(Dimension.f42473j);
                }
            }
            C16735c A02 = fVar2.mo49139A0("max");
            if (A02 == null) {
                return a;
            }
            if (A02 instanceof C16737e) {
                a.mo49293o(l0Var.mo48546f(C16483g.m74451w(C16483g.m74435M(A02.mo49182r()))));
                return a;
            } else if (!(A02 instanceof C16740g)) {
                return a;
            } else {
                a.mo49294p(Dimension.f42473j);
                return a;
            }
        }
    }

    /* renamed from: k */
    public static final Dimension m75541k(String str) {
        Dimension a = Dimension.m76548a(0);
        Intrinsics.checkNotNullExpressionValue(a, "Fixed(0)");
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    Dimension h = Dimension.m76555h(Dimension.f42473j);
                    Intrinsics.checkNotNullExpressionValue(h, "Suggested(WRAP_DIMENSION)");
                    return h;
                }
                break;
            case -995424086:
                if (str.equals(C16934c.f44493V1)) {
                    Dimension c = Dimension.m76550c();
                    Intrinsics.checkNotNullExpressionValue(c, "Parent()");
                    return c;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    Dimension h2 = Dimension.m76555h(Dimension.f42474k);
                    Intrinsics.checkNotNullExpressionValue(h2, "Suggested(SPREAD_DIMENSION)");
                    return h2;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    Dimension i = Dimension.m76556i();
                    Intrinsics.checkNotNullExpressionValue(i, "Wrap()");
                    return i;
                }
                break;
        }
        if (StringsKt__StringsKt.endsWith$default((CharSequence) str, '%', false, 2, (Object) null)) {
            Dimension v = Dimension.m76551d(0, Float.parseFloat(StringsKt__StringsKt.substringBefore$default(str, '%', (String) null, 2, (Object) null)) / 100.0f).mo49300v(0);
            Intrinsics.checkNotNullExpressionValue(v, "Percent(0, percentValue).suggested(0)");
            return v;
        } else if (!StringsKt__StringsKt.contains$default((CharSequence) str, (char) C12361b.f30257h, false, 2, (Object) null)) {
            return a;
        } else {
            Dimension w = Dimension.m76552e(str).mo49301w(Dimension.f42474k);
            Intrinsics.checkNotNullExpressionValue(w, "Ratio(dimensionString).suggested(SPREAD_DIMENSION)");
            return w;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r8 = (androidx.constraintlayout.core.parser.C16738f) r8;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75542l(@org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16611l0 r6, @org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16594f0 r7, @org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "layoutVariables"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8 instanceof androidx.constraintlayout.core.parser.C16738f
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            androidx.constraintlayout.core.parser.f r8 = (androidx.constraintlayout.core.parser.C16738f) r8
            java.util.ArrayList r0 = r8.mo49146I0()
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            r1 = 0
            int r2 = r0.size()
            kotlin.ranges.l r1 = kotlin.ranges.C11479u.m44378W1(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x002a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006c
            r2 = r1
            kotlin.collections.k0 r2 = (kotlin.collections.C10953k0) r2
            int r2 = r2.mo6374c()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            androidx.constraintlayout.core.parser.c r3 = r8.mo49154m0(r2)
            java.lang.String r4 = "elementName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.util.ArrayList r2 = r7.mo48489b(r2)
            if (r2 == 0) goto L_0x002a
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.C16738f
            if (r4 == 0) goto L_0x002a
            java.util.Iterator r2 = r2.iterator()
        L_0x0054:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x002a
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r5 = r3
            androidx.constraintlayout.core.parser.f r5 = (androidx.constraintlayout.core.parser.C16738f) r5
            m75556z(r6, r7, r4, r5)
            goto L_0x0054
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.C16610l.m75542l(androidx.constraintlayout.compose.l0, androidx.constraintlayout.compose.f0, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r3 = (androidx.constraintlayout.core.parser.C16738f) r3;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75543m(int r1, @org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16611l0 r2, @org.jetbrains.annotations.C12579k androidx.constraintlayout.core.parser.C16733a r3) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "helper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            androidx.constraintlayout.core.parser.c r3 = r3.mo49153l0(r0)
            boolean r0 = r3 instanceof androidx.constraintlayout.core.parser.C16738f
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            androidx.constraintlayout.core.parser.f r3 = (androidx.constraintlayout.core.parser.C16738f) r3
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.mo49144G0(r0)
            if (r0 != 0) goto L_0x001f
            return
        L_0x001f:
            m75544n(r1, r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.C16610l.m75543m(int, androidx.constraintlayout.compose.l0, androidx.constraintlayout.core.parser.a):void");
    }

    /* renamed from: n */
    public static final void m75544n(int i, C16611l0 l0Var, String str, C16738f fVar) {
        ArrayList<String> I0 = fVar.mo49146I0();
        if (I0 != null) {
            ConstraintReference e = l0Var.mo49308e(str);
            if (i == 0) {
                l0Var.mo49318p(str);
            } else {
                l0Var.mo49302A(str);
            }
            C16758e e2 = e.mo49240e();
            if (e2 != null) {
                C16759f fVar2 = (C16759f) e2;
                Iterator it = C11479u.m44378W1(0, I0.size()).iterator();
                while (it.hasNext()) {
                    String str2 = I0.get(((C10953k0) it).mo6374c());
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != -678927291) {
                            if (hashCode != 100571) {
                                if (hashCode == 109757538 && str2.equals("start")) {
                                    fVar2.mo49353j(Integer.valueOf(l0Var.mo48546f(C16483g.m74451w(C16483g.m74435M(fVar.mo49159s0(str2))))));
                                }
                            } else if (str2.equals("end")) {
                                fVar2.mo49349f(Integer.valueOf(l0Var.mo48546f(C16483g.m74451w(C16483g.m74435M(fVar.mo49159s0(str2))))));
                            }
                        } else if (str2.equals("percent")) {
                            fVar2.mo49351h(fVar.mo49159s0(str2));
                        }
                    }
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.GuidelineReference");
        }
    }

    /* renamed from: o */
    public static final void m75545o(@C12579k C16601i0 i0Var, @C12579k Object obj) {
        String G0;
        Intrinsics.checkNotNullParameter(i0Var, "scene");
        Intrinsics.checkNotNullParameter(obj, "json");
        if ((obj instanceof C16738f) && (G0 = ((C16738f) obj).mo49144G0("export")) != null) {
            i0Var.mo48533s(G0);
        }
    }

    /* renamed from: p */
    public static final void m75546p(@C12579k C16611l0 l0Var, @C12579k C16594f0 f0Var, @C12579k Object obj) {
        String B0;
        Intrinsics.checkNotNullParameter(l0Var, "state");
        Intrinsics.checkNotNullParameter(f0Var, "layoutVariables");
        Intrinsics.checkNotNullParameter(obj, "element");
        if (obj instanceof C16733a) {
            C16733a aVar = (C16733a) obj;
            Iterator it = C11479u.m44378W1(0, aVar.size()).iterator();
            while (it.hasNext()) {
                C16735c l0 = aVar.mo49153l0(((C10953k0) it).mo6374c());
                if (l0 instanceof C16733a) {
                    C16733a aVar2 = (C16733a) l0;
                    if (aVar2.size() > 1 && (B0 = aVar2.mo49140B0(0)) != null) {
                        switch (B0.hashCode()) {
                            case -1785507558:
                                if (B0.equals("vGuideline")) {
                                    m75543m(1, l0Var, aVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case -1252464839:
                                if (B0.equals("hChain")) {
                                    m75534d(0, l0Var, f0Var, aVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case -851656725:
                                if (B0.equals("vChain")) {
                                    m75534d(1, l0Var, f0Var, aVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case 965681512:
                                if (B0.equals("hGuideline")) {
                                    m75543m(0, l0Var, aVar2);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public static final void m75547q(@C12579k String str, @C12579k C16611l0 l0Var, @C12579k C16594f0 f0Var) {
        Intrinsics.checkNotNullParameter(str, "content");
        Intrinsics.checkNotNullParameter(l0Var, "state");
        Intrinsics.checkNotNullParameter(f0Var, "layoutVariables");
        try {
            C16738f d = CLParser.m76375d(str);
            ArrayList<String> I0 = d.mo49146I0();
            if (I0 != null) {
                Iterator it = C11479u.m44378W1(0, I0.size()).iterator();
                while (it.hasNext()) {
                    String str2 = I0.get(((C10953k0) it).mo6374c());
                    C16735c m0 = d.mo49154m0(str2);
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != -1824489883) {
                            if (hashCode != 1875016085) {
                                if (hashCode == 1921490263) {
                                    if (str2.equals("Variables")) {
                                        Intrinsics.checkNotNullExpressionValue(m0, "element");
                                        m75555y(l0Var, f0Var, m0);
                                    }
                                }
                            } else if (str2.equals("Generate")) {
                                Intrinsics.checkNotNullExpressionValue(m0, "element");
                                m75542l(l0Var, f0Var, m0);
                            }
                        } else if (str2.equals("Helpers")) {
                            Intrinsics.checkNotNullExpressionValue(m0, "element");
                            m75546p(l0Var, f0Var, m0);
                        }
                    }
                    if (m0 instanceof C16738f) {
                        String a = m75531a((C16738f) m0);
                        if (a != null) {
                            int hashCode2 = a.hashCode();
                            if (hashCode2 != -1785507558) {
                                if (hashCode2 != -333143113) {
                                    if (hashCode2 == 965681512) {
                                        if (a.equals("hGuideline")) {
                                            Intrinsics.checkNotNullExpressionValue(str2, "elementName");
                                            m75544n(0, l0Var, str2, (C16738f) m0);
                                        }
                                    }
                                } else if (a.equals("barrier")) {
                                    Intrinsics.checkNotNullExpressionValue(str2, "elementName");
                                    m75533c(l0Var, str2, (C16738f) m0);
                                }
                            } else if (a.equals("vGuideline")) {
                                Intrinsics.checkNotNullExpressionValue(str2, "elementName");
                                m75544n(1, l0Var, str2, (C16738f) m0);
                            }
                        } else {
                            Intrinsics.checkNotNullExpressionValue(str2, "elementName");
                            m75556z(l0Var, f0Var, str2, (C16738f) m0);
                        }
                    } else if (m0 instanceof C16737e) {
                        Intrinsics.checkNotNullExpressionValue(str2, "elementName");
                        f0Var.mo48492e(str2, ((C16737e) m0).mo49183w());
                    }
                }
            }
        } catch (CLParsingException e) {
            System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
        }
    }

    /* renamed from: r */
    public static final void m75548r(@C12579k String str, @C12579k C16769n nVar, int i) {
        C16738f y0;
        Intrinsics.checkNotNullParameter(str, "content");
        Intrinsics.checkNotNullParameter(nVar, C0508a.f1295O0);
        try {
            C16738f d = CLParser.m76375d(str);
            ArrayList<String> I0 = d.mo49146I0();
            if (I0 != null) {
                Iterator it = C11479u.m44378W1(0, I0.size()).iterator();
                while (it.hasNext()) {
                    String str2 = I0.get(((C10953k0) it).mo6374c());
                    C16735c m0 = d.mo49154m0(str2);
                    if ((m0 instanceof C16738f) && (y0 = ((C16738f) m0).mo49166y0("custom")) != null) {
                        ArrayList<String> I02 = y0.mo49146I0();
                        if (I02 != null) {
                            Iterator it2 = C11479u.m44378W1(0, I02.size()).iterator();
                            while (it2.hasNext()) {
                                String str3 = I02.get(((C10953k0) it2).mo6374c());
                                C16735c m02 = y0.mo49154m0(str3);
                                if (m02 instanceof C16737e) {
                                    nVar.mo49372o(i, str2, str3, m02.mo49182r());
                                } else if (m02 instanceof C16740g) {
                                    String h = m02.mo49178h();
                                    Intrinsics.checkNotNullExpressionValue(h, "value.content()");
                                    Integer e = m75535e(h);
                                    if (e != null) {
                                        nVar.mo49371n(i, str2, str3, e.intValue());
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (CLParsingException e2) {
            System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e2));
        }
    }

    /* renamed from: s */
    public static final void m75549s(@C12579k C16738f fVar, @C12579k C16769n nVar) {
        C16733a p0;
        C16738f fVar2 = fVar;
        C16769n nVar2 = nVar;
        Intrinsics.checkNotNullParameter(fVar2, "keyAttribute");
        Intrinsics.checkNotNullParameter(nVar2, C0508a.f1295O0);
        C16733a p02 = fVar2.mo49157p0("target");
        if (p02 != null && (p0 = fVar2.mo49157p0("frames")) != null) {
            String G0 = fVar2.mo49144G0("transitionEasing");
            ArrayList r = CollectionsKt__CollectionsKt.m40463r("scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha");
            ArrayList r2 = CollectionsKt__CollectionsKt.m40463r(311, 312, 304, 305, 306, 308, 309, 310, 303);
            ArrayList arrayList = new ArrayList();
            Iterator it = C11479u.m44378W1(0, p0.size()).iterator();
            while (it.hasNext()) {
                ((C10953k0) it).mo6374c();
                arrayList.add(new C16716u());
            }
            int size = r.size();
            if (size > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object obj = r.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj, "attrNames[k]");
                    String str = (String) obj;
                    Object obj2 = r2.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj2, "attrIds[k]");
                    int intValue = ((Number) obj2).intValue();
                    C16733a p03 = fVar2.mo49157p0(str);
                    if (p03 == null || p03.size() == arrayList.size()) {
                        if (p03 != null) {
                            Iterator it2 = C11479u.m44378W1(0, arrayList.size()).iterator();
                            while (it2.hasNext()) {
                                int c = ((C10953k0) it2).mo6374c();
                                ((C16716u) arrayList.get(c)).mo49106a(intValue, p03.getFloat(c));
                            }
                        } else {
                            float t0 = fVar2.mo49161t0(str);
                            if (!Float.isNaN(t0)) {
                                Iterator it3 = C11479u.m44378W1(0, arrayList.size()).iterator();
                                while (it3.hasNext()) {
                                    ((C16716u) arrayList.get(((C10953k0) it3).mo6374c())).mo49106a(intValue, t0);
                                }
                            }
                        }
                        if (i2 >= size) {
                            break;
                        }
                        i = i2;
                    } else {
                        throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", fVar2);
                    }
                }
            }
            String G02 = fVar2.mo49144G0("curveFit");
            Iterator it4 = C11479u.m44378W1(0, p02.size()).iterator();
            while (it4.hasNext()) {
                int c2 = ((C10953k0) it4).mo6374c();
                Iterator it5 = C11479u.m44378W1(0, arrayList.size()).iterator();
                while (it5.hasNext()) {
                    int c3 = ((C10953k0) it5).mo6374c();
                    String B0 = p02.mo49140B0(c2);
                    Object obj3 = arrayList.get(c3);
                    Intrinsics.checkNotNullExpressionValue(obj3, "bundles[j]");
                    C16716u uVar = (C16716u) obj3;
                    if (G02 != null) {
                        if (Intrinsics.areEqual((Object) G02, (Object) "spline")) {
                            uVar.mo49107b(C16717v.C16724g.f42312p, 0);
                        } else if (Intrinsics.areEqual((Object) G02, (Object) C16680d.f41934l)) {
                            uVar.mo49107b(C16717v.C16724g.f42312p, 1);
                            uVar.mo49110e(C16717v.C16724g.f42305i, G0);
                            uVar.mo49107b(100, p0.getInt(c3));
                            nVar2.mo49373p(B0, uVar);
                        }
                    }
                    uVar.mo49110e(C16717v.C16724g.f42305i, G0);
                    uVar.mo49107b(100, p0.getInt(c3));
                    nVar2.mo49373p(B0, uVar);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0226 A[SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75550t(@org.jetbrains.annotations.C12579k androidx.constraintlayout.core.parser.C16738f r18, @org.jetbrains.annotations.C12579k androidx.constraintlayout.core.state.C16769n r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "keyCycleData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "transition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "target"
            androidx.constraintlayout.core.parser.a r2 = r0.mo49156o0(r2)
            java.lang.String r3 = "frames"
            androidx.constraintlayout.core.parser.a r3 = r0.mo49156o0(r3)
            java.lang.String r4 = "transitionEasing"
            java.lang.String r4 = r0.mo49144G0(r4)
            java.lang.String r5 = "scaleX"
            java.lang.String r6 = "scaleY"
            java.lang.String r7 = "translationX"
            java.lang.String r8 = "translationY"
            java.lang.String r9 = "translationZ"
            java.lang.String r10 = "rotationX"
            java.lang.String r11 = "rotationY"
            java.lang.String r12 = "rotationZ"
            java.lang.String r13 = "alpha"
            java.lang.String r14 = "period"
            java.lang.String r15 = "offset"
            java.lang.String r16 = "phase"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.ArrayList r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40463r(r5)
            r6 = 12
            java.lang.Integer[] r6 = new java.lang.Integer[r6]
            r7 = 311(0x137, float:4.36E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 0
            r6[r8] = r7
            r7 = 312(0x138, float:4.37E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 1
            r6[r9] = r7
            r7 = 304(0x130, float:4.26E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 2
            r6[r10] = r7
            r7 = 305(0x131, float:4.27E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 3
            r6[r10] = r7
            r7 = 306(0x132, float:4.29E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 4
            r6[r10] = r7
            r7 = 308(0x134, float:4.32E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 5
            r6[r10] = r7
            r7 = 309(0x135, float:4.33E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 6
            r6[r10] = r7
            r7 = 310(0x136, float:4.34E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 7
            r6[r10] = r7
            r7 = 403(0x193, float:5.65E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 8
            r6[r10] = r7
            r7 = 423(0x1a7, float:5.93E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 9
            r6[r10] = r7
            r7 = 424(0x1a8, float:5.94E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 10
            r6[r10] = r7
            r7 = 425(0x1a9, float:5.96E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 11
            r6[r10] = r7
            java.util.ArrayList r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40463r(r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r10 = r3.size()
            kotlin.ranges.l r10 = kotlin.ranges.C11479u.m44378W1(r8, r10)
            java.util.Iterator r10 = r10.iterator()
        L_0x00c9:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00de
            r11 = r10
            kotlin.collections.k0 r11 = (kotlin.collections.C10953k0) r11
            r11.mo6374c()
            androidx.constraintlayout.core.motion.utils.u r11 = new androidx.constraintlayout.core.motion.utils.u
            r11.<init>()
            r7.add(r11)
            goto L_0x00c9
        L_0x00de:
            int r10 = r5.size()
            int r10 = r10 - r9
            if (r10 < 0) goto L_0x018f
            r11 = r8
        L_0x00e6:
            int r12 = r11 + 1
            java.lang.Object r13 = r5.get(r11)
            java.lang.String r14 = "attrNames[k]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r6.get(r11)
            java.lang.String r15 = "attrIds[k]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            androidx.constraintlayout.core.parser.a r15 = r0.mo49157p0(r13)
            if (r15 == 0) goto L_0x012f
            int r9 = r15.size()
            int r8 = r7.size()
            if (r9 != r8) goto L_0x0113
            goto L_0x012f
        L_0x0113:
            androidx.constraintlayout.core.parser.CLParsingException r1 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "incorrect size for "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = " array, not matching targets array!"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x012f:
            if (r15 == 0) goto L_0x0159
            int r8 = r7.size()
            r9 = 0
            kotlin.ranges.l r8 = kotlin.ranges.C11479u.m44378W1(r9, r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x013e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0187
            r9 = r8
            kotlin.collections.k0 r9 = (kotlin.collections.C10953k0) r9
            int r9 = r9.mo6374c()
            java.lang.Object r13 = r7.get(r9)
            androidx.constraintlayout.core.motion.utils.u r13 = (androidx.constraintlayout.core.motion.utils.C16716u) r13
            float r9 = r15.getFloat(r9)
            r13.mo49106a(r14, r9)
            goto L_0x013e
        L_0x0159:
            float r8 = r0.mo49161t0(r13)
            boolean r9 = java.lang.Float.isNaN(r8)
            if (r9 != 0) goto L_0x0187
            int r9 = r7.size()
            r13 = 0
            kotlin.ranges.l r9 = kotlin.ranges.C11479u.m44378W1(r13, r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x0170:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x0187
            r13 = r9
            kotlin.collections.k0 r13 = (kotlin.collections.C10953k0) r13
            int r13 = r13.mo6374c()
            java.lang.Object r13 = r7.get(r13)
            androidx.constraintlayout.core.motion.utils.u r13 = (androidx.constraintlayout.core.motion.utils.C16716u) r13
            r13.mo49106a(r14, r8)
            goto L_0x0170
        L_0x0187:
            if (r11 != r10) goto L_0x018a
            goto L_0x018f
        L_0x018a:
            r11 = r12
            r8 = 0
            r9 = 1
            goto L_0x00e6
        L_0x018f:
            java.lang.String r5 = "curveFit"
            java.lang.String r5 = r0.mo49144G0(r5)
            java.lang.String r6 = "easing"
            java.lang.String r6 = r0.mo49144G0(r6)
            java.lang.String r8 = "waveShape"
            java.lang.String r8 = r0.mo49144G0(r8)
            java.lang.String r9 = "customWave"
            java.lang.String r0 = r0.mo49144G0(r9)
            int r9 = r2.size()
            r10 = 0
            kotlin.ranges.l r9 = kotlin.ranges.C11479u.m44378W1(r10, r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x01b4:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0238
            r11 = r9
            kotlin.collections.k0 r11 = (kotlin.collections.C10953k0) r11
            int r11 = r11.mo6374c()
            int r12 = r7.size()
            kotlin.ranges.l r12 = kotlin.ranges.C11479u.m44378W1(r10, r12)
            java.util.Iterator r10 = r12.iterator()
        L_0x01cd:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0235
            r12 = r10
            kotlin.collections.k0 r12 = (kotlin.collections.C10953k0) r12
            int r12 = r12.mo6374c()
            java.lang.String r13 = r2.mo49140B0(r11)
            java.lang.Object r14 = r7.get(r12)
            java.lang.String r15 = "bundles.get(j)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
            androidx.constraintlayout.core.motion.utils.u r14 = (androidx.constraintlayout.core.motion.utils.C16716u) r14
            if (r5 == 0) goto L_0x0209
            java.lang.String r15 = "spline"
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r15)
            r17 = r2
            r2 = 401(0x191, float:5.62E-43)
            if (r15 == 0) goto L_0x01fc
            r15 = 0
            r14.mo49107b(r2, r15)
            goto L_0x020b
        L_0x01fc:
            java.lang.String r15 = "linear"
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r15)
            if (r15 == 0) goto L_0x020b
            r15 = 1
            r14.mo49107b(r2, r15)
            goto L_0x020c
        L_0x0209:
            r17 = r2
        L_0x020b:
            r15 = 1
        L_0x020c:
            r2 = 501(0x1f5, float:7.02E-43)
            r14.mo49110e(r2, r4)
            if (r6 == 0) goto L_0x0218
            r2 = 420(0x1a4, float:5.89E-43)
            r14.mo49108c(r2, r6)
        L_0x0218:
            if (r8 == 0) goto L_0x021f
            r2 = 421(0x1a5, float:5.9E-43)
            r14.mo49108c(r2, r8)
        L_0x021f:
            if (r0 == 0) goto L_0x0226
            r2 = 422(0x1a6, float:5.91E-43)
            r14.mo49108c(r2, r0)
        L_0x0226:
            int r2 = r3.getInt(r12)
            r12 = 100
            r14.mo49107b(r12, r2)
            r1.mo49374q(r13, r14)
            r2 = r17
            goto L_0x01cd
        L_0x0235:
            r10 = 0
            goto L_0x01b4
        L_0x0238:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.C16610l.m75550t(androidx.constraintlayout.core.parser.f, androidx.constraintlayout.core.state.n):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013e  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75551u(@org.jetbrains.annotations.C12579k androidx.constraintlayout.core.parser.C16738f r19, @org.jetbrains.annotations.C12579k androidx.constraintlayout.core.state.C16769n r20) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = "keyPosition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "transition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            androidx.constraintlayout.core.motion.utils.u r2 = new androidx.constraintlayout.core.motion.utils.u
            r2.<init>()
            java.lang.String r3 = "target"
            androidx.constraintlayout.core.parser.a r3 = r0.mo49156o0(r3)
            java.lang.String r4 = "frames"
            androidx.constraintlayout.core.parser.a r4 = r0.mo49156o0(r4)
            java.lang.String r5 = "percentX"
            androidx.constraintlayout.core.parser.a r5 = r0.mo49157p0(r5)
            java.lang.String r6 = "percentY"
            androidx.constraintlayout.core.parser.a r6 = r0.mo49157p0(r6)
            java.lang.String r7 = "percentWidth"
            androidx.constraintlayout.core.parser.a r7 = r0.mo49157p0(r7)
            java.lang.String r8 = "percentHeight"
            androidx.constraintlayout.core.parser.a r8 = r0.mo49157p0(r8)
            java.lang.String r9 = "pathMotionArc"
            java.lang.String r9 = r0.mo49144G0(r9)
            java.lang.String r10 = "transitionEasing"
            java.lang.String r10 = r0.mo49144G0(r10)
            java.lang.String r11 = "curveFit"
            java.lang.String r11 = r0.mo49144G0(r11)
            java.lang.String r12 = "type"
            java.lang.String r0 = r0.mo49144G0(r12)
            java.lang.String r12 = "parentRelative"
            if (r0 != 0) goto L_0x0054
            r0 = r12
        L_0x0054:
            if (r5 == 0) goto L_0x0061
            int r13 = r4.size()
            int r14 = r5.size()
            if (r13 == r14) goto L_0x0061
            return
        L_0x0061:
            if (r6 == 0) goto L_0x006e
            int r13 = r4.size()
            int r14 = r6.size()
            if (r13 == r14) goto L_0x006e
            return
        L_0x006e:
            int r13 = r3.size()
            r14 = 0
            kotlin.ranges.l r13 = kotlin.ranges.C11479u.m44378W1(r14, r13)
            java.util.Iterator r13 = r13.iterator()
        L_0x007b:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x018a
            r15 = r13
            kotlin.collections.k0 r15 = (kotlin.collections.C10953k0) r15
            int r15 = r15.mo6374c()
            java.lang.String r15 = r3.mo49140B0(r15)
            r2.mo49113h()
            int r14 = r0.hashCode()
            r16 = r3
            r3 = -1740452335(0xffffffff9842ce11, float:-2.517795E-24)
            r17 = r13
            r13 = 1
            if (r14 == r3) goto L_0x00b8
            r3 = -960240988(0xffffffffc6c3e2a4, float:-25073.32)
            if (r14 == r3) goto L_0x00b1
            r3 = 1700994454(0x65631d96, float:6.7032685E22)
            if (r14 == r3) goto L_0x00a8
            goto L_0x00c0
        L_0x00a8:
            boolean r3 = r0.equals(r12)
            if (r3 != 0) goto L_0x00af
            goto L_0x00c0
        L_0x00af:
            r3 = 2
            goto L_0x00c3
        L_0x00b1:
            java.lang.String r3 = "deltaRelative"
            boolean r3 = r0.equals(r3)
            goto L_0x00c0
        L_0x00b8:
            java.lang.String r3 = "pathRelative"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x00c2
        L_0x00c0:
            r3 = 0
            goto L_0x00c3
        L_0x00c2:
            r3 = r13
        L_0x00c3:
            r14 = 510(0x1fe, float:7.15E-43)
            r2.mo49107b(r14, r3)
            if (r11 == 0) goto L_0x00e4
            java.lang.String r3 = "spline"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r3)
            r14 = 508(0x1fc, float:7.12E-43)
            if (r3 == 0) goto L_0x00d9
            r3 = 0
            r2.mo49107b(r14, r3)
            goto L_0x00e4
        L_0x00d9:
            java.lang.String r3 = "linear"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x00e4
            r2.mo49107b(r14, r13)
        L_0x00e4:
            r3 = 501(0x1f5, float:7.02E-43)
            r2.mo49110e(r3, r10)
            if (r9 == 0) goto L_0x012b
            int r3 = r9.hashCode()
            r14 = 509(0x1fd, float:7.13E-43)
            switch(r3) {
                case -1857024520: goto L_0x011f;
                case -1007052250: goto L_0x0111;
                case 3145837: goto L_0x0103;
                case 3387192: goto L_0x00f5;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            goto L_0x012b
        L_0x00f5:
            java.lang.String r3 = "none"
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x00fe
            goto L_0x012b
        L_0x00fe:
            r3 = 0
            r2.mo49107b(r14, r3)
            goto L_0x012b
        L_0x0103:
            java.lang.String r3 = "flip"
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x010c
            goto L_0x012b
        L_0x010c:
            r3 = 3
            r2.mo49107b(r14, r3)
            goto L_0x012b
        L_0x0111:
            java.lang.String r3 = "startHorizontal"
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x011a
            goto L_0x012b
        L_0x011a:
            r3 = 2
            r2.mo49107b(r14, r3)
            goto L_0x012b
        L_0x011f:
            java.lang.String r3 = "startVertical"
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r2.mo49107b(r14, r13)
        L_0x012b:
            int r3 = r4.size()
            r13 = 0
            kotlin.ranges.l r3 = kotlin.ranges.C11479u.m44378W1(r13, r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0138:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L_0x0183
            r14 = r3
            kotlin.collections.k0 r14 = (kotlin.collections.C10953k0) r14
            int r14 = r14.mo6374c()
            int r13 = r4.getInt(r14)
            r18 = r0
            r0 = 100
            r2.mo49107b(r0, r13)
            if (r5 == 0) goto L_0x015b
            r0 = 506(0x1fa, float:7.09E-43)
            float r13 = r5.getFloat(r14)
            r2.mo49106a(r0, r13)
        L_0x015b:
            if (r6 == 0) goto L_0x0166
            r0 = 507(0x1fb, float:7.1E-43)
            float r13 = r6.getFloat(r14)
            r2.mo49106a(r0, r13)
        L_0x0166:
            if (r7 == 0) goto L_0x0171
            r0 = 503(0x1f7, float:7.05E-43)
            float r13 = r7.getFloat(r14)
            r2.mo49106a(r0, r13)
        L_0x0171:
            if (r8 == 0) goto L_0x017c
            r0 = 504(0x1f8, float:7.06E-43)
            float r13 = r8.getFloat(r14)
            r2.mo49106a(r0, r13)
        L_0x017c:
            r1.mo49376s(r15, r2)
            r0 = r18
            r13 = 0
            goto L_0x0138
        L_0x0183:
            r14 = r13
            r3 = r16
            r13 = r17
            goto L_0x007b
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.C16610l.m75551u(androidx.constraintlayout.core.parser.f, androidx.constraintlayout.core.state.n):void");
    }

    /* renamed from: v */
    public static final void m75552v(@C12579k C16601i0 i0Var, @C12579k String str) {
        Intrinsics.checkNotNullParameter(i0Var, "scene");
        Intrinsics.checkNotNullParameter(str, "content");
        try {
            C16738f d = CLParser.m76375d(str);
            ArrayList<String> I0 = d.mo49146I0();
            if (I0 != null) {
                Iterator it = C11479u.m44378W1(0, I0.size()).iterator();
                while (it.hasNext()) {
                    String str2 = I0.get(((C10953k0) it).mo6374c());
                    C16735c m0 = d.mo49154m0(str2);
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != -2137403731) {
                            if (hashCode != -241441378) {
                                if (hashCode == 1101852654) {
                                    if (str2.equals("ConstraintSets")) {
                                        Intrinsics.checkNotNullExpressionValue(m0, "element");
                                        m75537g(i0Var, m0);
                                    }
                                }
                            } else if (str2.equals(C16717v.C16725h.f42316a)) {
                                Intrinsics.checkNotNullExpressionValue(m0, "element");
                                m75554x(i0Var, m0);
                            }
                        } else if (str2.equals("Header")) {
                            Intrinsics.checkNotNullExpressionValue(m0, "element");
                            m75545o(i0Var, m0);
                        }
                    }
                }
            }
        } catch (CLParsingException e) {
            System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
        }
    }

    /* renamed from: w */
    public static final void m75553w(@C12579k C16738f fVar, @C12579k C16769n nVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(fVar, "json");
        Intrinsics.checkNotNullParameter(nVar, C0508a.f1295O0);
        String G0 = fVar.mo49144G0(C16717v.C16725h.f42320e);
        C16716u uVar = new C16716u();
        boolean z2 = true;
        if (G0 != null) {
            switch (G0.hashCode()) {
                case -1857024520:
                    if (G0.equals("startVertical")) {
                        uVar.mo49107b(509, 1);
                        break;
                    }
                    break;
                case -1007052250:
                    if (G0.equals("startHorizontal")) {
                        uVar.mo49107b(509, 2);
                        break;
                    }
                    break;
                case 3145837:
                    if (G0.equals("flip")) {
                        uVar.mo49107b(509, 3);
                        break;
                    }
                    break;
                case 3387192:
                    if (G0.equals("none")) {
                        uVar.mo49107b(509, 0);
                        break;
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        String G02 = fVar.mo49144G0("interpolator");
        if (G02 != null) {
            uVar.mo49108c(C16717v.C16725h.f42330o, G02);
            z = true;
        }
        float t0 = fVar.mo49161t0(C16717v.C16725h.f42323h);
        if (!Float.isNaN(t0)) {
            uVar.mo49106a(706, t0);
        } else {
            z2 = z;
        }
        if (z2) {
            nVar.mo49369Y(uVar);
        }
        C16738f y0 = fVar.mo49166y0(C16886i.f43498f);
        if (y0 != null) {
            C16733a p0 = y0.mo49157p0("KeyPositions");
            if (p0 != null) {
                Iterator it = C11479u.m44378W1(0, p0.size()).iterator();
                while (it.hasNext()) {
                    C16735c l0 = p0.mo49153l0(((C10953k0) it).mo6374c());
                    if (l0 instanceof C16738f) {
                        m75551u((C16738f) l0, nVar);
                    }
                }
            }
            C16733a p02 = y0.mo49157p0("KeyAttributes");
            if (p02 != null) {
                Iterator it2 = C11479u.m44378W1(0, p02.size()).iterator();
                while (it2.hasNext()) {
                    C16735c l02 = p02.mo49153l0(((C10953k0) it2).mo6374c());
                    if (l02 instanceof C16738f) {
                        m75549s((C16738f) l02, nVar);
                    }
                }
            }
            C16733a p03 = y0.mo49157p0("KeyCycles");
            if (p03 != null) {
                Iterator it3 = C11479u.m44378W1(0, p03.size()).iterator();
                while (it3.hasNext()) {
                    C16735c l03 = p03.mo49153l0(((C10953k0) it3).mo6374c());
                    if (l03 instanceof C16738f) {
                        m75550t((C16738f) l03, nVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r6 = (androidx.constraintlayout.core.parser.C16738f) r6;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75554x(@org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16601i0 r5, @org.jetbrains.annotations.C12579k java.lang.Object r6) {
        /*
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r6 instanceof androidx.constraintlayout.core.parser.C16738f
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            androidx.constraintlayout.core.parser.f r6 = (androidx.constraintlayout.core.parser.C16738f) r6
            java.util.ArrayList r0 = r6.mo49146I0()
            if (r0 != 0) goto L_0x0018
            return
        L_0x0018:
            r1 = 0
            int r2 = r0.size()
            kotlin.ranges.l r1 = kotlin.ranges.C11479u.m44378W1(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004e
            r2 = r1
            kotlin.collections.k0 r2 = (kotlin.collections.C10953k0) r2
            int r2 = r2.mo6374c()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            androidx.constraintlayout.core.parser.f r3 = r6.mo49165w0(r2)
            java.lang.String r4 = "elementName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.String r3 = r3.mo49134i0()
            java.lang.String r4 = "element.toJSON()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r5.mo48472o(r2, r3)
            goto L_0x0025
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.C16610l.m75554x(androidx.constraintlayout.compose.i0, java.lang.Object):void");
    }

    /* renamed from: y */
    public static final void m75555y(@C12579k C16611l0 l0Var, @C12579k C16594f0 f0Var, @C12579k Object obj) {
        C16738f fVar;
        ArrayList<String> I0;
        String str;
        Intrinsics.checkNotNullParameter(l0Var, "state");
        Intrinsics.checkNotNullParameter(f0Var, "layoutVariables");
        Intrinsics.checkNotNullParameter(obj, "json");
        if ((obj instanceof C16738f) && (I0 = fVar.mo49146I0()) != null) {
            Iterator it = C11479u.m44378W1(0, I0.size()).iterator();
            while (it.hasNext()) {
                String str2 = I0.get(((C10953k0) it).mo6374c());
                C16735c m0 = (fVar = (C16738f) obj).mo49154m0(str2);
                if (m0 instanceof C16737e) {
                    Intrinsics.checkNotNullExpressionValue(str2, "elementName");
                    f0Var.mo48492e(str2, ((C16737e) m0).mo49183w());
                } else if (m0 instanceof C16738f) {
                    C16738f fVar2 = (C16738f) m0;
                    if (fVar2.mo49145H0("from") && fVar2.mo49145H0("to")) {
                        C16735c m02 = fVar2.mo49154m0("from");
                        Intrinsics.checkNotNullExpressionValue(m02, "element[\"from\"]");
                        float a = f0Var.mo48488a(m02);
                        C16735c m03 = fVar2.mo49154m0("to");
                        Intrinsics.checkNotNullExpressionValue(m03, "element[\"to\"]");
                        float a2 = f0Var.mo48488a(m03);
                        String G0 = fVar2.mo49144G0("prefix");
                        if (G0 == null) {
                            str = "";
                        } else {
                            str = G0;
                        }
                        String G02 = fVar2.mo49144G0("postfix");
                        if (G02 == null) {
                            G02 = "";
                        }
                        Intrinsics.checkNotNullExpressionValue(str2, "elementName");
                        f0Var.mo48491d(str2, a, a2, 1.0f, str, G02);
                    } else if (fVar2.mo49145H0("from") && fVar2.mo49145H0("step")) {
                        C16735c m04 = fVar2.mo49154m0("from");
                        Intrinsics.checkNotNullExpressionValue(m04, "element[\"from\"]");
                        float a3 = f0Var.mo48488a(m04);
                        C16735c m05 = fVar2.mo49154m0("step");
                        Intrinsics.checkNotNullExpressionValue(m05, "element[\"step\"]");
                        float a4 = f0Var.mo48488a(m05);
                        Intrinsics.checkNotNullExpressionValue(str2, "elementName");
                        f0Var.mo48490c(str2, a3, a4);
                    } else if (fVar2.mo49145H0(CancelSchedulesAction.f23548l)) {
                        C16733a o0 = fVar2.mo49156o0(CancelSchedulesAction.f23548l);
                        ArrayList arrayList = new ArrayList();
                        int size = o0.size();
                        if (size > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                arrayList.add(o0.mo49140B0(i));
                                if (i2 >= size) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        Intrinsics.checkNotNullExpressionValue(str2, "elementName");
                        f0Var.mo48493f(str2, arrayList);
                    } else if (fVar2.mo49145H0("tag")) {
                        ArrayList<String> j = l0Var.mo49312j(fVar2.mo49142C0("tag"));
                        Intrinsics.checkNotNullExpressionValue(str2, "elementName");
                        Intrinsics.checkNotNullExpressionValue(j, "arrayIds");
                        f0Var.mo48493f(str2, j);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75556z(@org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16611l0 r8, @org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16594f0 r9, @org.jetbrains.annotations.C12579k java.lang.String r10, @org.jetbrains.annotations.C12579k androidx.constraintlayout.core.parser.C16738f r11) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "layoutVariables"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "elementName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            androidx.constraintlayout.core.state.ConstraintReference r10 = r8.mo49308e(r10)
            androidx.constraintlayout.core.state.Dimension r0 = r10.mo49228W()
            if (r0 != 0) goto L_0x0025
            androidx.constraintlayout.core.state.Dimension r0 = androidx.constraintlayout.core.state.Dimension.m76556i()
            r10.mo49282y0(r0)
        L_0x0025:
            androidx.constraintlayout.core.state.Dimension r0 = r10.mo49202E()
            if (r0 != 0) goto L_0x0032
            androidx.constraintlayout.core.state.Dimension r0 = androidx.constraintlayout.core.state.Dimension.m76556i()
            r10.mo49268r0(r0)
        L_0x0032:
            java.util.ArrayList r0 = r11.mo49146I0()
            if (r0 != 0) goto L_0x0039
            return
        L_0x0039:
            int r1 = r0.size()
            r2 = 0
            kotlin.ranges.l r1 = kotlin.ranges.C11479u.m44378W1(r2, r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0046:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02fb
            r3 = r1
            kotlin.collections.k0 r3 = (kotlin.collections.C10953k0) r3
            int r3 = r3.mo6374c()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "reference"
            if (r3 == 0) goto L_0x02ee
            int r5 = r3.hashCode()
            java.lang.String r6 = "parent"
            java.lang.String r7 = "element[constraintName]"
            switch(r5) {
                case -1448775240: goto L_0x02c8;
                case -1364013995: goto L_0x029c;
                case -1349088399: goto L_0x028b;
                case -1249320806: goto L_0x0271;
                case -1249320805: goto L_0x0257;
                case -1249320804: goto L_0x023d;
                case -1225497657: goto L_0x0223;
                case -1225497656: goto L_0x0209;
                case -1225497655: goto L_0x01ef;
                case -1221029593: goto L_0x01dc;
                case -987906986: goto L_0x01c2;
                case -987906985: goto L_0x01a8;
                case -908189618: goto L_0x018e;
                case -908189617: goto L_0x0174;
                case -61505906: goto L_0x015a;
                case 92909918: goto L_0x0140;
                case 98116417: goto L_0x0126;
                case 111045711: goto L_0x010c;
                case 113126854: goto L_0x00f9;
                case 398344448: goto L_0x00df;
                case 1404070310: goto L_0x00b8;
                case 1941332754: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x02ee
        L_0x006a:
            java.lang.String r5 = "visibility"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0074
            goto L_0x02ee
        L_0x0074:
            java.lang.String r3 = r11.mo49142C0(r3)
            if (r3 == 0) goto L_0x0046
            int r4 = r3.hashCode()
            r5 = -1901805651(0xffffffff8ea4bfad, float:-4.06137E-30)
            if (r4 == r5) goto L_0x00aa
            r5 = 3178655(0x30809f, float:4.454244E-39)
            if (r4 == r5) goto L_0x009b
            r5 = 466743410(0x1bd1f072, float:3.4731534E-22)
            if (r4 == r5) goto L_0x008e
            goto L_0x0046
        L_0x008e:
            java.lang.String r4 = "visible"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0097
            goto L_0x0046
        L_0x0097:
            r10.mo49215K0(r2)
            goto L_0x0046
        L_0x009b:
            java.lang.String r4 = "gone"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00a4
            goto L_0x0046
        L_0x00a4:
            r3 = 8
            r10.mo49215K0(r3)
            goto L_0x0046
        L_0x00aa:
            java.lang.String r4 = "invisible"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00b3
            goto L_0x0046
        L_0x00b3:
            r3 = 4
            r10.mo49215K0(r3)
            goto L_0x0046
        L_0x00b8:
            java.lang.String r5 = "centerHorizontally"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00c2
            goto L_0x02ee
        L_0x00c2:
            java.lang.String r3 = r11.mo49142C0(r3)
            boolean r4 = r3.equals(r6)
            if (r4 == 0) goto L_0x00d3
            java.lang.Integer r3 = androidx.constraintlayout.core.state.State.f42495j
            androidx.constraintlayout.core.state.ConstraintReference r3 = r8.mo49308e(r3)
            goto L_0x00d7
        L_0x00d3:
            androidx.constraintlayout.core.state.ConstraintReference r3 = r8.mo49308e(r3)
        L_0x00d7:
            r10.mo49197B0(r3)
            r10.mo49194A(r3)
            goto L_0x0046
        L_0x00df:
            java.lang.String r5 = "hWeight"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00e9
            goto L_0x02ee
        L_0x00e9:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49272t0(r3)
            goto L_0x0046
        L_0x00f9:
            java.lang.String r5 = "width"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0103
            goto L_0x02ee
        L_0x0103:
            androidx.constraintlayout.core.state.Dimension r3 = m75540j(r11, r3, r8)
            r10.mo49282y0(r3)
            goto L_0x0046
        L_0x010c:
            java.lang.String r5 = "vBias"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0116
            goto L_0x02ee
        L_0x0116:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49213J0(r3)
            goto L_0x0046
        L_0x0126:
            java.lang.String r5 = "hBias"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0130
            goto L_0x02ee
        L_0x0130:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49230Y(r3)
            goto L_0x0046
        L_0x0140:
            java.lang.String r5 = "alpha"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x014a
            goto L_0x02ee
        L_0x014a:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49247h(r3)
            goto L_0x0046
        L_0x015a:
            java.lang.String r5 = "vWeight"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0164
            goto L_0x02ee
        L_0x0164:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49278w0(r3)
            goto L_0x0046
        L_0x0174:
            java.lang.String r5 = "scaleY"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x017e
            goto L_0x02ee
        L_0x017e:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49264p0(r3)
            goto L_0x0046
        L_0x018e:
            java.lang.String r5 = "scaleX"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0198
            goto L_0x02ee
        L_0x0198:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49262o0(r3)
            goto L_0x0046
        L_0x01a8:
            java.lang.String r5 = "pivotY"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01b2
            goto L_0x02ee
        L_0x01b2:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49248h0(r3)
            goto L_0x0046
        L_0x01c2:
            java.lang.String r5 = "pivotX"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01cc
            goto L_0x02ee
        L_0x01cc:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49245g0(r3)
            goto L_0x0046
        L_0x01dc:
            java.lang.String r5 = "height"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01e6
            goto L_0x02ee
        L_0x01e6:
            androidx.constraintlayout.core.state.Dimension r3 = m75540j(r11, r3, r8)
            r10.mo49268r0(r3)
            goto L_0x0046
        L_0x01ef:
            java.lang.String r5 = "translationZ"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01f9
            goto L_0x02ee
        L_0x01f9:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49209H0(r3)
            goto L_0x0046
        L_0x0209:
            java.lang.String r5 = "translationY"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0213
            goto L_0x02ee
        L_0x0213:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49207G0(r3)
            goto L_0x0046
        L_0x0223:
            java.lang.String r5 = "translationX"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x022d
            goto L_0x02ee
        L_0x022d:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49205F0(r3)
            goto L_0x0046
        L_0x023d:
            java.lang.String r5 = "rotationZ"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0247
            goto L_0x02ee
        L_0x0247:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49260n0(r3)
            goto L_0x0046
        L_0x0257:
            java.lang.String r5 = "rotationY"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0261
            goto L_0x02ee
        L_0x0261:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49258m0(r3)
            goto L_0x0046
        L_0x0271:
            java.lang.String r5 = "rotationX"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x027b
            goto L_0x02ee
        L_0x027b:
            androidx.constraintlayout.core.parser.c r3 = r11.mo49154m0(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            float r3 = r9.mo48488a(r3)
            r10.mo49256l0(r3)
            goto L_0x0046
        L_0x028b:
            java.lang.String r5 = "custom"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0294
            goto L_0x02ee
        L_0x0294:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)
            m75538h(r11, r10, r3)
            goto L_0x0046
        L_0x029c:
            java.lang.String r5 = "center"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x02a5
            goto L_0x02ee
        L_0x02a5:
            java.lang.String r3 = r11.mo49142C0(r3)
            boolean r4 = r3.equals(r6)
            if (r4 == 0) goto L_0x02b6
            java.lang.Integer r3 = androidx.constraintlayout.core.state.State.f42495j
            androidx.constraintlayout.core.state.ConstraintReference r3 = r8.mo49308e(r3)
            goto L_0x02ba
        L_0x02b6:
            androidx.constraintlayout.core.state.ConstraintReference r3 = r8.mo49308e(r3)
        L_0x02ba:
            r10.mo49197B0(r3)
            r10.mo49194A(r3)
            r10.mo49203E0(r3)
            r10.mo49263p(r3)
            goto L_0x0046
        L_0x02c8:
            java.lang.String r5 = "centerVertically"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x02d1
            goto L_0x02ee
        L_0x02d1:
            java.lang.String r3 = r11.mo49142C0(r3)
            boolean r4 = r3.equals(r6)
            if (r4 == 0) goto L_0x02e2
            java.lang.Integer r3 = androidx.constraintlayout.core.state.State.f42495j
            androidx.constraintlayout.core.state.ConstraintReference r3 = r8.mo49308e(r3)
            goto L_0x02e6
        L_0x02e2:
            androidx.constraintlayout.core.state.ConstraintReference r3 = r8.mo49308e(r3)
        L_0x02e6:
            r10.mo49203E0(r3)
            r10.mo49263p(r3)
            goto L_0x0046
        L_0x02ee:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)
            java.lang.String r4 = "constraintName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            m75536f(r8, r9, r11, r10, r3)
            goto L_0x0046
        L_0x02fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.C16610l.m75556z(androidx.constraintlayout.compose.l0, androidx.constraintlayout.compose.f0, java.lang.String, androidx.constraintlayout.core.parser.f):void");
    }
}
