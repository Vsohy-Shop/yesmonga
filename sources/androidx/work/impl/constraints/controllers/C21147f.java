package androidx.work.impl.constraints.controllers;

import androidx.work.C21377l;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.C21138b;
import androidx.work.impl.constraints.trackers.C21164h;
import androidx.work.impl.model.C21249u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.constraints.controllers.f */
public final class C21147f extends C21142c<C21138b> {
    @C12579k

    /* renamed from: f */
    public static final C21148a f54597f = new C21148a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: g */
    public static final String f54598g;

    /* renamed from: androidx.work.impl.constraints.controllers.f$a */
    public static final class C21148a {
        public /* synthetic */ C21148a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C21148a() {
        }
    }

    static {
        String i = C21377l.m98584i("NetworkNotRoamingCtrlr");
        Intrinsics.checkNotNullExpressionValue(i, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f54598g = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21147f(@C12579k C21164h<C21138b> hVar) {
        super(hVar);
        Intrinsics.checkNotNullParameter(hVar, "tracker");
    }

    /* renamed from: c */
    public boolean mo63288c(@C12579k C21249u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "workSpec");
        if (uVar.f54813j.mo63128d() == NetworkType.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo63289d(@C12579k C21138b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "value");
        if (!bVar.mo63282g() || !bVar.mo63285i()) {
            return true;
        }
        return false;
    }
}
