package com.carrefour.fid.android.scan.core.p041di;

import com.carrefour.fid.android.scan.data.repositories.C28267a;
import com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl;
import com.google.mlkit.vision.barcode.C34001b;
import com.google.mlkit.vision.barcode.C34004c;
import com.google.mlkit.vision.barcode.C34006d;
import dagger.C10147a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.scan.core.di.b */
public interface C28263b {
    @C12579k

    /* renamed from: a */
    public static final C28264a f68416a = C28264a.f68417a;

    /* renamed from: com.carrefour.fid.android.scan.core.di.b$a */
    public static final class C28264a {

        /* renamed from: a */
        public static final /* synthetic */ C28264a f68417a = new C28264a();

        @C10315i
        @C12579k
        /* renamed from: a */
        public final C34001b mo82206a() {
            C34001b b = C34006d.m136818b(new C34004c.C34005a().mo98927b(32, new int[0]).mo98927b(256, new int[0]).mo98927b(5, new int[0]).mo98927b(4096, new int[0]).mo98927b(0, new int[0]).mo98926a());
            Intrinsics.checkNotNullExpressionValue(b, "Builder()\n            .s…tClient(it)\n            }");
            return b;
        }
    }

    @C10147a
    @C12579k
    /* renamed from: a */
    C28267a mo82205a(@C12579k ScanPreferencesRepositoryImpl scanPreferencesRepositoryImpl);
}
