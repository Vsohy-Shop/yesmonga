package com.carrefour.fid.android.core.extension;

import androidx.lifecycle.C19406e0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"A", "B", "kotlin.jvm.PlatformType", "it", "Lkotlin/d2;", "a", "(Ljava/lang/Object;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LiveDataKt$combineLatest$1$1 extends Lambda implements C11300l<A, C11079d2> {
    final /* synthetic */ Ref.ObjectRef<A> $lastA;
    final /* synthetic */ Ref.ObjectRef<B> $lastB;
    final /* synthetic */ C19406e0<Pair<A, B>> $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveDataKt$combineLatest$1$1(C19406e0<Pair<A, B>> e0Var, Ref.ObjectRef<A> objectRef, Ref.ObjectRef<B> objectRef2) {
        super(1);
        this.$this_apply = e0Var;
        this.$lastA = objectRef;
        this.$lastB = objectRef2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [A, T, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo108303a(A r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0010
            androidx.lifecycle.e0<kotlin.Pair<A, B>> r0 = r2.$this_apply
            java.lang.Object r0 = r0.mo4610f()
            if (r0 == 0) goto L_0x0010
            androidx.lifecycle.e0<kotlin.Pair<A, B>> r0 = r2.$this_apply
            r1 = 0
            r0.mo57496r(r1)
        L_0x0010:
            kotlin.jvm.internal.Ref$ObjectRef<A> r0 = r2.$lastA
            r0.element = r3
            if (r3 == 0) goto L_0x002f
            kotlin.jvm.internal.Ref$ObjectRef<B> r0 = r2.$lastB
            T r0 = r0.element
            if (r0 == 0) goto L_0x002f
            androidx.lifecycle.e0<kotlin.Pair<A, B>> r0 = r2.$this_apply
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            kotlin.jvm.internal.Ref$ObjectRef<B> r1 = r2.$lastB
            T r1 = r1.element
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            kotlin.Pair r3 = kotlin.C11078d1.m42659a(r3, r1)
            r0.mo57496r(r3)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.core.extension.LiveDataKt$combineLatest$1$1.mo108303a(java.lang.Object):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo108303a(obj);
        return C11079d2.f28267a;
    }
}
