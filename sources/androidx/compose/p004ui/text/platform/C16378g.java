package androidx.compose.p004ui.text.platform;

import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.C16401q;
import androidx.compose.p004ui.text.C16454v;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16436k;
import androidx.compose.p004ui.unit.C16479d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.platform.g */
public final class C16378g {
    @C12579k
    /* renamed from: a */
    public static final C16401q m73928a(@C12579k String str, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k List<C16156d.C16159b<C16454v>> list2, @C12579k C16479d dVar, @C12579k C16242u.C16244b bVar) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(list, "spanStyles");
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(bVar, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(str, p0Var, list, list2, bVar, dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.mo46275a();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m73930c(androidx.compose.p004ui.text.C16361p0 r1) {
        /*
            androidx.compose.ui.text.a0 r1 = r1.mo47480H()
            if (r1 == 0) goto L_0x0015
            androidx.compose.ui.text.x r1 = r1.mo46275a()
            if (r1 == 0) goto L_0x0015
            int r1 = r1.mo47773b()
            androidx.compose.ui.text.g r1 = androidx.compose.p004ui.text.C16256g.m73209c(r1)
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            androidx.compose.ui.text.g$a r0 = androidx.compose.p004ui.text.C16256g.f40358b
            int r0 = r0.mo47026b()
            if (r1 != 0) goto L_0x0020
            r1 = 0
            goto L_0x0028
        L_0x0020:
            int r1 = r1.mo47023i()
            boolean r1 = androidx.compose.p004ui.text.C16256g.m73212f(r1, r0)
        L_0x0028:
            r1 = r1 ^ 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.platform.C16378g.m73930c(androidx.compose.ui.text.p0):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r6 == null) goto L_0x0063;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m73931d(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.style.C16436k r6, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.intl.C16342f r7) {
        /*
            if (r6 == 0) goto L_0x0007
            int r6 = r6.mo47686l()
            goto L_0x000d
        L_0x0007:
            androidx.compose.ui.text.style.k$a r6 = androidx.compose.p004ui.text.style.C16436k.f40732b
            int r6 = r6.mo47688a()
        L_0x000d:
            androidx.compose.ui.text.style.k$a r0 = androidx.compose.p004ui.text.style.C16436k.f40732b
            int r1 = r0.mo47689b()
            boolean r1 = androidx.compose.p004ui.text.style.C16436k.m74207i(r6, r1)
            r2 = 2
            if (r1 == 0) goto L_0x001b
            goto L_0x006f
        L_0x001b:
            int r1 = r0.mo47690c()
            boolean r1 = androidx.compose.p004ui.text.style.C16436k.m74207i(r6, r1)
            r3 = 3
            if (r1 == 0) goto L_0x0028
        L_0x0026:
            r2 = r3
            goto L_0x006f
        L_0x0028:
            int r1 = r0.mo47691d()
            boolean r1 = androidx.compose.p004ui.text.style.C16436k.m74207i(r6, r1)
            r4 = 0
            if (r1 == 0) goto L_0x0035
            r2 = r4
            goto L_0x006f
        L_0x0035:
            int r1 = r0.mo47692e()
            boolean r1 = androidx.compose.p004ui.text.style.C16436k.m74207i(r6, r1)
            r5 = 1
            if (r1 == 0) goto L_0x0042
            r2 = r5
            goto L_0x006f
        L_0x0042:
            int r0 = r0.mo47688a()
            boolean r6 = androidx.compose.p004ui.text.style.C16436k.m74207i(r6, r0)
            if (r6 == 0) goto L_0x0070
            if (r7 == 0) goto L_0x0063
            androidx.compose.ui.text.intl.e r6 = r7.mo47372i(r4)
            androidx.compose.ui.text.intl.g r6 = r6.mo47355b()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r7)
            androidx.compose.ui.text.intl.a r6 = (androidx.compose.p004ui.text.intl.C16336a) r6
            java.util.Locale r6 = r6.mo47351e()
            if (r6 != 0) goto L_0x0067
        L_0x0063:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L_0x0067:
            int r6 = androidx.core.text.C17927h0.m81524b(r6)
            if (r6 == 0) goto L_0x006f
            if (r6 == r5) goto L_0x0026
        L_0x006f:
            return r2
        L_0x0070:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.platform.C16378g.m73931d(androidx.compose.ui.text.style.k, androidx.compose.ui.text.intl.f):int");
    }

    /* renamed from: e */
    public static /* synthetic */ int m73932e(C16436k kVar, C16342f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = null;
        }
        if ((i & 2) != 0) {
            fVar = null;
        }
        return m73931d(kVar, fVar);
    }
}
