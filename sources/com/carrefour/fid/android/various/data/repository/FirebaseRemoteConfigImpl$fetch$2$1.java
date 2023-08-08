package com.carrefour.fid.android.various.data.repository;

import com.google.firebase.remoteconfig.C33565n;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Lcom/google/firebase/remoteconfig/n$b;", "Lkotlin/d2;", "a", "(Lcom/google/firebase/remoteconfig/n$b;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FirebaseRemoteConfigImpl$fetch$2$1 extends Lambda implements C11300l<C33565n.C33567b, C11079d2> {
    final /* synthetic */ long $delayInSeconds;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseRemoteConfigImpl$fetch$2$1(long j) {
        super(1);
        this.$delayInSeconds = j;
    }

    /* renamed from: a */
    public final void mo67177a(@C12579k C33565n.C33567b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "$this$remoteConfigSettings");
        bVar.mo97413g(this.$delayInSeconds);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67177a((C33565n.C33567b) obj);
        return C11079d2.f28267a;
    }
}
