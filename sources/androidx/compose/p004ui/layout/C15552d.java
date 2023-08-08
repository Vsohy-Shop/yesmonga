package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.geometry.C15104m;

/* renamed from: androidx.compose.ui.layout.d */
public final class C15552d {
    /* renamed from: e */
    public static final float m69113e(long j, long j2) {
        return C15104m.m65016m(j2) / C15104m.m65016m(j);
    }

    /* renamed from: f */
    public static final float m69114f(long j, long j2) {
        return Math.max(m69116h(j, j2), m69113e(j, j2));
    }

    /* renamed from: g */
    public static final float m69115g(long j, long j2) {
        return Math.min(m69116h(j, j2), m69113e(j, j2));
    }

    /* renamed from: h */
    public static final float m69116h(long j, long j2) {
        return C15104m.m65023t(j2) / C15104m.m65023t(j);
    }
}
