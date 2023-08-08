package dev.chrisbanes.snapper;

import androidx.compose.foundation.lazy.C2517l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: dev.chrisbanes.snapper.c */
public final class C10361c extends C10369g {
    @C12579k

    /* renamed from: b */
    public final C2517l f28014b;

    public C10361c(@C12579k C2517l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "lazyListItem");
        this.f28014b = lVar;
    }

    /* renamed from: a */
    public int mo21792a() {
        return this.f28014b.getIndex();
    }

    /* renamed from: b */
    public int mo21793b() {
        return this.f28014b.getOffset();
    }

    /* renamed from: c */
    public int mo21794c() {
        return this.f28014b.getSize();
    }
}
