package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13015f;
import retrofit2.C13092x;

@C12200d
/* renamed from: com.jakewharton.retrofit2.converter.kotlinx.serialization.b */
public final class C34890b extends C13015f.C13016a {

    /* renamed from: a */
    public final MediaType f84805a;

    /* renamed from: b */
    public final C34893e f84806b;

    public C34890b(@C12579k MediaType mediaType, @C12579k C34893e eVar) {
        Intrinsics.checkNotNullParameter(mediaType, "contentType");
        Intrinsics.checkNotNullParameter(eVar, "serializer");
        this.f84805a = mediaType;
        this.f84806b = eVar;
    }

    @C12580l
    /* renamed from: c */
    public C13015f<?, RequestBody> mo30440c(@C12579k Type type, @C12579k Annotation[] annotationArr, @C12579k Annotation[] annotationArr2, @C12579k C13092x xVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotationArr, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(annotationArr2, "methodAnnotations");
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        return new C34892d(this.f84805a, this.f84806b.mo103258d(type), this.f84806b);
    }

    @C12580l
    /* renamed from: d */
    public C13015f<ResponseBody, ?> mo30441d(@C12579k Type type, @C12579k Annotation[] annotationArr, @C12579k C13092x xVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotationArr, "annotations");
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        return new C34889a(this.f84806b.mo103258d(type), this.f84806b);
    }
}
