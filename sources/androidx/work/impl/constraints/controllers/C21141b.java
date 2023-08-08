package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.trackers.C21158c;
import androidx.work.impl.model.C21249u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.constraints.controllers.b */
public final class C21141b extends C21142c<Boolean> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21141b(@C12579k C21158c cVar) {
        super(cVar);
        Intrinsics.checkNotNullParameter(cVar, "tracker");
    }

    /* renamed from: c */
    public boolean mo63288c(@C12579k C21249u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "workSpec");
        return uVar.f54813j.mo63131f();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo63289d(Object obj) {
        return mo63291j(((Boolean) obj).booleanValue());
    }

    /* renamed from: j */
    public boolean mo63291j(boolean z) {
        return !z;
    }
}
