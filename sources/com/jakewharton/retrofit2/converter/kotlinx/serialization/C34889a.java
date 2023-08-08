package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12199c;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13015f;

/* renamed from: com.jakewharton.retrofit2.converter.kotlinx.serialization.a */
public final class C34889a<T> implements C13015f<ResponseBody, T> {

    /* renamed from: a */
    public final C12199c<T> f84803a;

    /* renamed from: b */
    public final C34893e f84804b;

    public C34889a(@C12579k C12199c<T> cVar, @C12579k C34893e eVar) {
        Intrinsics.checkNotNullParameter(cVar, "loader");
        Intrinsics.checkNotNullParameter(eVar, "serializer");
        this.f84803a = cVar;
        this.f84804b = eVar;
    }

    /* renamed from: a */
    public T convert(@C12579k ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "value");
        return this.f84804b.mo103256a(this.f84803a, responseBody);
    }
}
