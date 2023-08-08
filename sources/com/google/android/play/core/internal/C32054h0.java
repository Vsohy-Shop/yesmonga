package com.google.android.play.core.internal;

import java.io.File;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.h0 */
public final class C32054h0 implements C32051g0 {

    /* renamed from: a */
    public final /* synthetic */ int f78260a = 0;

    public C32054h0() {
    }

    /* renamed from: a */
    public final Object[] mo92739a(Object obj, List list, List list2) {
        Object a;
        if (this.f78260a != 0) {
            a = C32063k0.m129849b(obj, "makePathElements", Object[].class, List.class, list, File.class, null, List.class, list2);
        } else {
            a = C32063k0.m129848a(obj, "makePathElements", Object[].class, List.class, list);
        }
        return (Object[]) a;
    }

    public C32054h0(byte[] bArr) {
    }
}
