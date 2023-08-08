package com.usabilla.sdk.ubform.p008di;

import androidx.exifinterface.media.C19135a;
import com.urbanairship.remoteconfig.C9598a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.di.a */
public final class C9818a {
    @C12580l

    /* renamed from: a */
    public final C9818a f26872a;
    @C12579k

    /* renamed from: b */
    public final Map<Class<?>, C9824g<?>> f26873b;

    public C9818a(@C12579k List<C9821d> list, @C12580l C9818a aVar) {
        Intrinsics.checkNotNullParameter(list, C9598a.f26248e);
        this.f26872a = aVar;
        HashMap hashMap = new HashMap();
        for (C9821d putAll : list) {
            hashMap.putAll(putAll);
        }
        C11079d2 d2Var = C11079d2.f28267a;
        this.f26873b = hashMap;
    }

    /* renamed from: b */
    public final /* synthetic */ <T> T mo20108b() {
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        return mo20109c(Object.class);
    }

    /* renamed from: c */
    public final <T> T mo20109c(Class<T> cls) {
        return mo20111e(cls).mo20156d(this);
    }

    @C12580l
    /* renamed from: d */
    public final <T> T mo20110d(@C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        C9824g<T> f = mo20112f(cls);
        if (f == null) {
            return null;
        }
        return f.mo20156d(this);
    }

    /* renamed from: e */
    public final <T> C9824g<T> mo20111e(Class<T> cls) {
        C9824g<T> f = mo20112f(cls);
        if (f != null) {
            return f;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("No definition found for ", cls.getSimpleName()));
    }

    /* renamed from: f */
    public final <T> C9824g<T> mo20112f(Class<T> cls) {
        C9818a aVar = this.f26872a;
        C9824g<T> f = aVar == null ? null : aVar.mo20112f(cls);
        if (f != null) {
            return f;
        }
        C9824g<?> gVar = this.f26873b.get(cls);
        if (gVar instanceof C9824g) {
            return gVar;
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9818a(List list, C9818a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : aVar);
    }
}
