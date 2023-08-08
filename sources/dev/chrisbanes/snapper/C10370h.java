package dev.chrisbanes.snapper;

import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: dev.chrisbanes.snapper.h */
public final class C10370h {
    @C12579k

    /* renamed from: a */
    public static final C10370h f28018a = new C10370h();

    /* renamed from: b */
    public static /* synthetic */ void m38639b(C10370h hVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "SnapperFlingBehavior";
        }
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(aVar, "message");
    }

    /* renamed from: a */
    public final void mo21796a(@C12579k String str, @C12579k C11289a<String> aVar) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(aVar, "message");
    }
}
