package androidx.compose.p004ui.text.android;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.android.j */
public final class C16083j {
    @C12579k

    /* renamed from: a */
    public final TextLayout f39973a;

    /* renamed from: b */
    public int f39974b = -1;

    /* renamed from: c */
    public float f39975c;

    public C16083j(@C12579k TextLayout textLayout) {
        Intrinsics.checkNotNullParameter(textLayout, "layout");
        this.f39973a = textLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo46468a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x0020
            androidx.compose.ui.text.android.TextLayout r2 = r5.f39973a
            android.text.Layout r2 = r2.mo46305j()
            int r2 = androidx.compose.p004ui.text.android.C16097m.m72497a(r2, r6, r7)
            androidx.compose.ui.text.android.TextLayout r3 = r5.f39973a
            int r3 = r3.mo46280A(r2)
            androidx.compose.ui.text.android.TextLayout r4 = r5.f39973a
            int r2 = r4.mo46315u(r2)
            if (r6 == r3) goto L_0x001e
            if (r6 != r2) goto L_0x0020
        L_0x001e:
            r2 = r0
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            int r3 = r6 * 4
            if (r9 == 0) goto L_0x0029
            if (r2 == 0) goto L_0x002e
            r0 = r1
            goto L_0x002e
        L_0x0029:
            if (r2 == 0) goto L_0x002d
            r0 = 2
            goto L_0x002e
        L_0x002d:
            r0 = 3
        L_0x002e:
            int r3 = r3 + r0
            int r0 = r5.f39974b
            if (r0 != r3) goto L_0x0036
            float r6 = r5.f39975c
            return r6
        L_0x0036:
            if (r9 == 0) goto L_0x003f
            androidx.compose.ui.text.android.TextLayout r9 = r5.f39973a
            float r6 = r9.mo46288I(r6, r7)
            goto L_0x0045
        L_0x003f:
            androidx.compose.ui.text.android.TextLayout r9 = r5.f39973a
            float r6 = r9.mo46289K(r6, r7)
        L_0x0045:
            if (r8 == 0) goto L_0x004b
            r5.f39974b = r3
            r5.f39975c = r6
        L_0x004b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.android.C16083j.mo46468a(int, boolean, boolean, boolean):float");
    }

    @C12579k
    /* renamed from: b */
    public final TextLayout mo46469b() {
        return this.f39973a;
    }

    /* renamed from: c */
    public final float mo46470c(int i) {
        return mo46468a(i, false, false, true);
    }

    /* renamed from: d */
    public final float mo46471d(int i) {
        return mo46468a(i, true, true, true);
    }

    /* renamed from: e */
    public final float mo46472e(int i) {
        return mo46468a(i, false, false, false);
    }

    /* renamed from: f */
    public final float mo46473f(int i) {
        return mo46468a(i, true, true, false);
    }
}
