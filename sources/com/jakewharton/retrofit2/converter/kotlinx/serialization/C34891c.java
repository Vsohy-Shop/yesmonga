package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import com.jakewharton.retrofit2.converter.kotlinx.serialization.C34893e;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12195a;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12445u;
import okhttp3.MediaType;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13015f;

@C11314h(name = "KotlinSerializationConverterFactory")
/* renamed from: com.jakewharton.retrofit2.converter.kotlinx.serialization.c */
public final class C34891c {
    @C11314h(name = "create")
    @C12200d
    @C12579k
    /* renamed from: a */
    public static final C13015f.C13016a m142608a(@C12579k C12195a aVar, @C12579k MediaType mediaType) {
        Intrinsics.checkNotNullParameter(aVar, "$this$asConverterFactory");
        Intrinsics.checkNotNullParameter(mediaType, "contentType");
        return new C34890b(mediaType, new C34893e.C34894a(aVar));
    }

    @C11314h(name = "create")
    @C12200d
    @C12579k
    /* renamed from: b */
    public static final C13015f.C13016a m142609b(@C12579k C12445u uVar, @C12579k MediaType mediaType) {
        Intrinsics.checkNotNullParameter(uVar, "$this$asConverterFactory");
        Intrinsics.checkNotNullParameter(mediaType, "contentType");
        return new C34890b(mediaType, new C34893e.C34895b(uVar));
    }
}
