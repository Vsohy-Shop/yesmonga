package com.google.android.play.core.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.f0 */
public final class C32048f0 implements C32039c0 {

    /* renamed from: a */
    public final /* synthetic */ int f78257a = 0;

    public C32048f0() {
    }

    /* renamed from: a */
    public final Object[] mo92733a(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        Object b;
        if (this.f78257a != 0) {
            b = C32063k0.m129849b(obj, "makeDexElements", Object[].class, ArrayList.class, arrayList, File.class, file, ArrayList.class, arrayList2);
        } else {
            b = C32063k0.m129849b(obj, "makePathElements", Object[].class, List.class, arrayList, File.class, file, List.class, arrayList2);
        }
        return (Object[]) b;
    }

    public C32048f0(byte[] bArr) {
    }
}
