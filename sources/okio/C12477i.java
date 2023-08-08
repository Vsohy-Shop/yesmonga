package okio;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "-Platform")
/* renamed from: okio.i */
public final class C12477i {
    @C12579k
    /* renamed from: a */
    public static final byte[] m50546a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(C11602d.f28868b);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final <R> R m50547b(@C12579k Object obj, @C12579k C11289a<? extends R> aVar) {
        R invoke;
        Intrinsics.checkNotNullParameter(obj, "lock");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        synchronized (obj) {
            try {
                invoke = aVar.invoke();
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        return invoke;
    }

    @C12579k
    /* renamed from: c */
    public static final String m50548c(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$toUtf8String");
        return new String(bArr, C11602d.f28868b);
    }
}
