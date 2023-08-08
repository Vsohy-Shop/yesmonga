package com.carrefour.fid.android.various.data.repository;

import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.various.domain.repository.C22795b;
import com.carrefour.fid.android.various.domain.repository.C22796c;
import com.google.android.gms.tasks.C31035e;
import com.google.android.gms.tasks.C31047k;
import com.google.firebase.remoteconfig.C33563l;
import com.google.firebase.remoteconfig.ktx.C33562c;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C11636e;
import kotlin.time.C11639g;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFirebaseRemoteConfigImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseRemoteConfigImpl.kt\ncom/carrefour/fid/android/various/data/repository/FirebaseRemoteConfigImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,41:1\n314#2,11:42\n*S KotlinDebug\n*F\n+ 1 FirebaseRemoteConfigImpl.kt\ncom/carrefour/fid/android/various/data/repository/FirebaseRemoteConfigImpl\n*L\n16#1:42,11\n*E\n"})
public final class FirebaseRemoteConfigImpl implements C22796c {
    @C12579k

    /* renamed from: a */
    public final C33563l f58314a;

    /* renamed from: com.carrefour.fid.android.various.data.repository.FirebaseRemoteConfigImpl$a */
    public static final class C22770a<TResult> implements C31035e {

        /* renamed from: a */
        public final /* synthetic */ C12072o<Boolean> f58315a;

        public C22770a(C12072o<? super Boolean> oVar) {
            this.f58315a = oVar;
        }

        public final void onComplete(@C12579k C31047k<Boolean> kVar) {
            Intrinsics.checkNotNullParameter(kVar, "task");
            if (kVar.mo87738v()) {
                Boolean r = kVar.mo87734r();
                C28935i iVar = C28935i.f70940a;
                C28935i.m119704b(iVar, "Firebase Remote Config updated: " + r + ".", (Throwable) null, 0, 6, (Object) null);
                C12072o<Boolean> oVar = this.f58315a;
                Intrinsics.checkNotNullExpressionValue(r, "updated");
                oVar.mo24532O(r, (C11300l<? super Throwable, C11079d2>) null);
                return;
            }
            C28935i.m119704b(C28935i.f70940a, "Firebase Remote Config fetch failed.", (Throwable) null, 0, 6, (Object) null);
            this.f58315a.mo24532O(Boolean.FALSE, (C11300l<? super Throwable, C11079d2>) null);
        }
    }

    @Inject
    public FirebaseRemoteConfigImpl(@C12579k C33563l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "firebaseRemoteConfig");
        this.f58314a = lVar;
    }

    @C12580l
    /* renamed from: a */
    public Object mo67175a(boolean z, @C12579k C11045c<? super Boolean> cVar) {
        int i;
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        C11636e.C11637a aVar = C11636e.f28954b;
        if (z) {
            i = 0;
        } else {
            i = 12;
        }
        this.f58314a.mo97387J(C33562c.m135251d(new FirebaseRemoteConfigImpl$fetch$2$1(C11636e.m45494q1(C11639g.m45638m0(i, DurationUnit.HOURS)))));
        this.f58314a.mo97397n().mo87721e(new C22770a(pVar));
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    @C12579k
    /* renamed from: b */
    public Map<String, String> mo67176b() {
        return C22795b.m103040a(this.f58314a);
    }
}
