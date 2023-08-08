package kotlin.p010io.encoding;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.C11665v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.io.encoding.h */
public class C11145h {
    @C11143f
    @C11665v0(version = "1.8")
    @C12579k
    /* renamed from: a */
    public static final InputStream m43037a(@C12579k InputStream inputStream, @C12579k C11137a aVar) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "base64");
        return new C11141d(inputStream, aVar);
    }

    @C11143f
    @C11665v0(version = "1.8")
    @C12579k
    /* renamed from: b */
    public static final OutputStream m43038b(@C12579k OutputStream outputStream, @C12579k C11137a aVar) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "base64");
        return new C11142e(outputStream, aVar);
    }
}
