package com.carrefour.fid.android.shared.util.cache;

import java.util.function.Predicate;
import kotlin.jvm.functions.C11300l;

/* renamed from: com.carrefour.fid.android.shared.util.cache.b */
public final /* synthetic */ class C28908b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C11300l f70819a;

    public /* synthetic */ C28908b(C11300l lVar) {
        this.f70819a = lVar;
    }

    public final boolean test(Object obj) {
        return MemCache.m119549n(this.f70819a, obj);
    }
}
