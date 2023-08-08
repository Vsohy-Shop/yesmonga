package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.C21377l;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.C21138b;
import androidx.work.impl.constraints.trackers.C21164h;
import androidx.work.impl.model.C21249u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.constraints.controllers.e */
public final class C21145e extends C21142c<C21138b> {
    @C12579k

    /* renamed from: f */
    public static final C21146a f54595f = new C21146a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: g */
    public static final String f54596g;

    /* renamed from: androidx.work.impl.constraints.controllers.e$a */
    public static final class C21146a {
        public /* synthetic */ C21146a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C21146a() {
        }
    }

    static {
        String i = C21377l.m98584i("NetworkMeteredCtrlr");
        Intrinsics.checkNotNullExpressionValue(i, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f54596g = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21145e(@C12579k C21164h<C21138b> hVar) {
        super(hVar);
        Intrinsics.checkNotNullParameter(hVar, "tracker");
    }

    /* renamed from: c */
    public boolean mo63288c(@C12579k C21249u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "workSpec");
        if (uVar.f54813j.mo63128d() == NetworkType.METERED) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo63289d(@C12579k C21138b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "value");
        if (Build.VERSION.SDK_INT < 26) {
            C21377l.m98582e().mo63774a(f54596g, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (bVar.mo63282g()) {
                return false;
            }
        } else if (bVar.mo63282g() && bVar.mo63283h()) {
            return false;
        }
        return true;
    }
}
