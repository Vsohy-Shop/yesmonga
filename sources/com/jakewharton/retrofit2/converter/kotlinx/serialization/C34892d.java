package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12440p;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13015f;

/* renamed from: com.jakewharton.retrofit2.converter.kotlinx.serialization.d */
public final class C34892d<T> implements C13015f<T, RequestBody> {

    /* renamed from: a */
    public final MediaType f84807a;

    /* renamed from: b */
    public final C12440p<T> f84808b;

    /* renamed from: c */
    public final C34893e f84809c;

    public C34892d(@C12579k MediaType mediaType, @C12579k C12440p<? super T> pVar, @C12579k C34893e eVar) {
        Intrinsics.checkNotNullParameter(mediaType, "contentType");
        Intrinsics.checkNotNullParameter(pVar, "saver");
        Intrinsics.checkNotNullParameter(eVar, "serializer");
        this.f84807a = mediaType;
        this.f84808b = pVar;
        this.f84809c = eVar;
    }

    @C12579k
    /* renamed from: a */
    public RequestBody convert(T t) {
        return this.f84809c.mo103259e(this.f84807a, this.f84808b, t);
    }
}
