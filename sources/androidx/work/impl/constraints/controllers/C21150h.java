package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.trackers.C21164h;
import androidx.work.impl.model.C21249u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.constraints.controllers.h */
public final class C21150h extends C21142c<Boolean> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21150h(@C12579k C21164h<Boolean> hVar) {
        super(hVar);
        Intrinsics.checkNotNullParameter(hVar, "tracker");
    }

    /* renamed from: c */
    public boolean mo63288c(@C12579k C21249u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "workSpec");
        return uVar.f54813j.mo63135i();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo63289d(Object obj) {
        return mo63304j(((Boolean) obj).booleanValue());
    }

    /* renamed from: j */
    public boolean mo63304j(boolean z) {
        return !z;
    }
}
