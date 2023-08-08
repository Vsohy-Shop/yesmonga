package com.carrefour.fid.android.scan.extension;

import android.content.Context;
import androidx.camera.lifecycle.C1750f;
import androidx.core.content.C17318d;
import com.google.common.util.concurrent.C32487a;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCameraExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraExtension.kt\ncom/carrefour/fid/android/scan/extension/CameraExtensionKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,22:1\n314#2,11:23\n*S KotlinDebug\n*F\n+ 1 CameraExtension.kt\ncom/carrefour/fid/android/scan/extension/CameraExtensionKt\n*L\n12#1:23,11\n*E\n"})
public final class CameraExtensionKt {

    /* renamed from: com.carrefour.fid.android.scan.extension.CameraExtensionKt$a */
    public static final class C28280a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C12072o<C1750f> f68445a;

        /* renamed from: b */
        public final /* synthetic */ C32487a<C1750f> f68446b;

        public C28280a(C12072o<? super C1750f> oVar, C32487a<C1750f> aVar) {
            this.f68445a = oVar;
            this.f68446b = aVar;
        }

        public final void run() {
            C12072o<C1750f> oVar = this.f68445a;
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(this.f68446b.get()));
        }
    }

    @C12580l
    /* renamed from: a */
    public static final Object m118235a(@C12579k Context context, @C12579k C11045c<? super C1750f> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        pVar.mo24529C(new CameraExtensionKt$getCameraProvider$2$1(pVar));
        C32487a<C1750f> j = C1750f.m7017j(context);
        j.mo5489q(new C28280a(pVar, j), C17318d.m79729l(context));
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }
}
