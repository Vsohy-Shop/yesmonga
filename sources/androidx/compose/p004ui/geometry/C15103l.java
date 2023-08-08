package androidx.compose.p004ui.geometry;

import androidx.compose.p004ui.util.C16515d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.geometry.l */
public final class C15103l {
    @C12579k
    /* renamed from: a */
    public static final C15101k m64985a(float f, float f2, float f3, float f4, float f5, float f6) {
        long a = C15090b.m64845a(f5, f6);
        return new C15101k(f, f2, f3, f4, a, a, a, a, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: b */
    public static final C15101k m64986b(@C12579k C15098i iVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        return m64985a(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j(), f, f2);
    }

    @C12579k
    /* renamed from: c */
    public static final C15101k m64987c(@C12579k C15098i iVar, long j, long j2, long j3, long j4) {
        C15098i iVar2 = iVar;
        Intrinsics.checkNotNullParameter(iVar, "rect");
        return new C15101k(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j(), j, j2, j3, j4, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C15101k m64988d(C15098i iVar, long j, long j2, long j3, long j4, int i, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        if ((i & 2) != 0) {
            j5 = C15088a.f37248b.mo42225a();
        } else {
            j5 = j;
        }
        if ((i & 4) != 0) {
            j6 = C15088a.f37248b.mo42225a();
        } else {
            j6 = j2;
        }
        if ((i & 8) != 0) {
            j7 = C15088a.f37248b.mo42225a();
        } else {
            j7 = j3;
        }
        if ((i & 16) != 0) {
            j8 = C15088a.f37248b.mo42225a();
        } else {
            j8 = j4;
        }
        return m64987c(iVar, j5, j6, j7, j8);
    }

    @C12579k
    /* renamed from: e */
    public static final C15101k m64989e(float f, float f2, float f3, float f4, long j) {
        return m64985a(f, f2, f3, f4, C15088a.m64833m(j), C15088a.m64835o(j));
    }

    @C12579k
    /* renamed from: f */
    public static final C15101k m64990f(@C12579k C15098i iVar, long j) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        return m64986b(iVar, C15088a.m64833m(j), C15088a.m64835o(j));
    }

    @C12579k
    /* renamed from: g */
    public static final C15098i m64991g(@C12579k C15101k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new C15098i(kVar.mo42302q(), kVar.mo42304s(), kVar.mo42303r(), kVar.mo42298m());
    }

    /* renamed from: h */
    public static final long m64992h(@C12579k C15101k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return C15096g.m64898a(kVar.mo42302q() + (kVar.mo42308v() / 2.0f), kVar.mo42304s() + (kVar.mo42301p() / 2.0f));
    }

    /* renamed from: i */
    public static final float m64993i(@C12579k C15101k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return Math.max(Math.abs(kVar.mo42308v()), Math.abs(kVar.mo42301p()));
    }

    /* renamed from: j */
    public static final float m64994j(@C12579k C15101k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return Math.min(Math.abs(kVar.mo42308v()), Math.abs(kVar.mo42301p()));
    }

    @C12579k
    /* renamed from: k */
    public static final C15098i m64995k(@C12579k C15101k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new C15098i(kVar.mo42302q() + (Math.max(C15088a.m64833m(kVar.mo42299n()), C15088a.m64833m(kVar.mo42305t())) * 0.29289323f), kVar.mo42304s() + (Math.max(C15088a.m64835o(kVar.mo42305t()), C15088a.m64835o(kVar.mo42307u())) * 0.29289323f), kVar.mo42303r() - (Math.max(C15088a.m64833m(kVar.mo42307u()), C15088a.m64833m(kVar.mo42300o())) * 0.29289323f), kVar.mo42298m() - (Math.max(C15088a.m64835o(kVar.mo42300o()), C15088a.m64835o(kVar.mo42299n())) * 0.29289323f));
    }

    /* renamed from: l */
    public static final boolean m64996l(@C12579k C15101k kVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar.mo42308v() == kVar.mo42301p()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !m64997m(kVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static final boolean m64997m(@C12579k C15101k kVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (C15088a.m64833m(kVar.mo42305t()) == C15088a.m64833m(kVar.mo42307u())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C15088a.m64835o(kVar.mo42305t()) == C15088a.m64835o(kVar.mo42307u())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (C15088a.m64833m(kVar.mo42307u()) == C15088a.m64833m(kVar.mo42300o())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (C15088a.m64835o(kVar.mo42307u()) == C15088a.m64835o(kVar.mo42300o())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (C15088a.m64833m(kVar.mo42300o()) == C15088a.m64833m(kVar.mo42299n())) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (C15088a.m64835o(kVar.mo42300o()) == C15088a.m64835o(kVar.mo42299n())) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6 && ((double) kVar.mo42308v()) <= ((double) C15088a.m64833m(kVar.mo42305t())) * 2.0d && ((double) kVar.mo42301p()) <= ((double) C15088a.m64835o(kVar.mo42305t())) * 2.0d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public static final boolean m64998n(@C12579k C15101k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar.mo42302q() >= kVar.mo42303r() || kVar.mo42304s() >= kVar.mo42298m()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final boolean m64999o(@C12579k C15101k kVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        float q = kVar.mo42302q();
        if (Float.isInfinite(q) || Float.isNaN(q)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float s = kVar.mo42304s();
            if (Float.isInfinite(s) || Float.isNaN(s)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                float r = kVar.mo42303r();
                if (Float.isInfinite(r) || Float.isNaN(r)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    float m = kVar.mo42298m();
                    if (Float.isInfinite(m) || Float.isNaN(m)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r0 != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r0 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r0 != false) goto L_0x002a;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m65000p(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.geometry.C15101k r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            long r0 = r6.mo42305t()
            float r0 = androidx.compose.p004ui.geometry.C15088a.m64833m(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0016
            r0 = r2
            goto L_0x0017
        L_0x0016:
            r0 = r3
        L_0x0017:
            if (r0 != 0) goto L_0x002a
            long r4 = r6.mo42305t()
            float r0 = androidx.compose.p004ui.geometry.C15088a.m64835o(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            r0 = r2
            goto L_0x0028
        L_0x0027:
            r0 = r3
        L_0x0028:
            if (r0 == 0) goto L_0x0091
        L_0x002a:
            long r4 = r6.mo42307u()
            float r0 = androidx.compose.p004ui.geometry.C15088a.m64833m(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            r0 = r2
            goto L_0x0039
        L_0x0038:
            r0 = r3
        L_0x0039:
            if (r0 != 0) goto L_0x004c
            long r4 = r6.mo42307u()
            float r0 = androidx.compose.p004ui.geometry.C15088a.m64835o(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            r0 = r2
            goto L_0x004a
        L_0x0049:
            r0 = r3
        L_0x004a:
            if (r0 == 0) goto L_0x0091
        L_0x004c:
            long r4 = r6.mo42299n()
            float r0 = androidx.compose.p004ui.geometry.C15088a.m64833m(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            r0 = r2
            goto L_0x005b
        L_0x005a:
            r0 = r3
        L_0x005b:
            if (r0 != 0) goto L_0x006e
            long r4 = r6.mo42299n()
            float r0 = androidx.compose.p004ui.geometry.C15088a.m64835o(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006b
            r0 = r2
            goto L_0x006c
        L_0x006b:
            r0 = r3
        L_0x006c:
            if (r0 == 0) goto L_0x0091
        L_0x006e:
            long r4 = r6.mo42300o()
            float r0 = androidx.compose.p004ui.geometry.C15088a.m64833m(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007c
            r0 = r2
            goto L_0x007d
        L_0x007c:
            r0 = r3
        L_0x007d:
            if (r0 != 0) goto L_0x0092
            long r4 = r6.mo42300o()
            float r6 = androidx.compose.p004ui.geometry.C15088a.m64835o(r4)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x008d
            r6 = r2
            goto L_0x008e
        L_0x008d:
            r6 = r3
        L_0x008e:
            if (r6 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r2 = r3
        L_0x0092:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.geometry.C15103l.m65000p(androidx.compose.ui.geometry.k):boolean");
    }

    /* renamed from: q */
    public static final boolean m65001q(@C12579k C15101k kVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (C15088a.m64833m(kVar.mo42305t()) == C15088a.m64835o(kVar.mo42305t())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C15088a.m64833m(kVar.mo42305t()) == C15088a.m64833m(kVar.mo42307u())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (C15088a.m64833m(kVar.mo42305t()) == C15088a.m64835o(kVar.mo42307u())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (C15088a.m64833m(kVar.mo42305t()) == C15088a.m64833m(kVar.mo42300o())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (C15088a.m64833m(kVar.mo42305t()) == C15088a.m64835o(kVar.mo42300o())) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (C15088a.m64833m(kVar.mo42305t()) == C15088a.m64833m(kVar.mo42299n())) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (C15088a.m64833m(kVar.mo42305t()) == C15088a.m64835o(kVar.mo42299n())) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: r */
    public static final C15101k m65002r(@C12579k C15101k kVar, @C12579k C15101k kVar2, float f) {
        float f2 = f;
        Intrinsics.checkNotNullParameter(kVar, "start");
        Intrinsics.checkNotNullParameter(kVar2, "stop");
        return new C15101k(C16515d.m74781a(kVar.mo42302q(), kVar2.mo42302q(), f2), C16515d.m74781a(kVar.mo42304s(), kVar2.mo42304s(), f2), C16515d.m74781a(kVar.mo42303r(), kVar2.mo42303r(), f2), C16515d.m74781a(kVar.mo42298m(), kVar2.mo42298m(), f2), C15090b.m64847c(kVar.mo42305t(), kVar2.mo42305t(), f2), C15090b.m64847c(kVar.mo42307u(), kVar2.mo42307u(), f2), C15090b.m64847c(kVar.mo42300o(), kVar2.mo42300o(), f2), C15090b.m64847c(kVar.mo42299n(), kVar2.mo42299n(), f2), (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: s */
    public static final C15101k m65003s(@C12579k C15101k kVar, long j) {
        C15101k kVar2 = kVar;
        Intrinsics.checkNotNullParameter(kVar, "$this$translate");
        return new C15101k(kVar.mo42302q() + C15094f.m64880p(j), kVar.mo42304s() + C15094f.m64882r(j), kVar.mo42303r() + C15094f.m64880p(j), kVar.mo42298m() + C15094f.m64882r(j), kVar.mo42305t(), kVar.mo42307u(), kVar.mo42300o(), kVar.mo42299n(), (DefaultConstructorMarker) null);
    }
}
