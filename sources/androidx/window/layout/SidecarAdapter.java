package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.annotation.C0344h1;
import androidx.window.core.C20992b;
import androidx.window.core.C20997f;
import androidx.window.core.SpecificationComputer;
import androidx.window.layout.C21052l;
import androidx.window.layout.C21059m;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.urbanairship.analytics.C35567m;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SidecarAdapter {
    @C12579k

    /* renamed from: b */
    public static final C21033a f54235b = new C21033a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final String f54236c = SidecarAdapter.class.getSimpleName();
    @C12579k

    /* renamed from: a */
    public final SpecificationComputer.VerificationMode f54237a;

    /* renamed from: androidx.window.layout.SidecarAdapter$a */
    public static final class C21033a {
        public /* synthetic */ C21033a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C0344h1
        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: a */
        public final int mo62922a(@C12579k SidecarDeviceState sidecarDeviceState) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                if (invoke != null) {
                    return ((Integer) invoke).intValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        /* renamed from: b */
        public final int mo62923b(@C12579k SidecarDeviceState sidecarDeviceState) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            int a = mo62922a(sidecarDeviceState);
            if (a < 0 || a > 4) {
                return 0;
            }
            return a;
        }

        @C0344h1
        @SuppressLint({"BanUncheckedReflection"})
        @C12579k
        /* renamed from: c */
        public final List<SidecarDisplayFeature> mo62924c(@C12579k SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            Intrinsics.checkNotNullParameter(sidecarWindowLayoutInfo, C28531e0.f69094x);
            try {
                List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                if (list == null) {
                    return CollectionsKt__CollectionsKt.m40441E();
                }
                return list;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return CollectionsKt__CollectionsKt.m40441E();
            }
        }

        @C0344h1
        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: d */
        public final void mo62925d(@C12579k SidecarDeviceState sidecarDeviceState, int i) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            try {
                sidecarDeviceState.posture = i;
            } catch (NoSuchFieldError unused) {
                Class<SidecarDeviceState> cls = SidecarDeviceState.class;
                try {
                    cls.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i)});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
            }
        }

        @C0344h1
        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: e */
        public final void mo62926e(@C12579k SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @C12579k List<SidecarDisplayFeature> list) {
            Intrinsics.checkNotNullParameter(sidecarWindowLayoutInfo, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(list, "displayFeatures");
            try {
                sidecarWindowLayoutInfo.displayFeatures = list;
            } catch (NoSuchFieldError unused) {
                try {
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", new Class[]{List.class}).invoke(sidecarWindowLayoutInfo, new Object[]{list});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
            }
        }

        public C21033a() {
        }
    }

    public SidecarAdapter() {
        this((SpecificationComputer.VerificationMode) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final boolean mo62915a(@C12580l SidecarDeviceState sidecarDeviceState, @C12580l SidecarDeviceState sidecarDeviceState2) {
        if (Intrinsics.areEqual((Object) sidecarDeviceState, (Object) sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C21033a aVar = f54235b;
        if (aVar.mo62923b(sidecarDeviceState) == aVar.mo62923b(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo62916b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.areEqual((Object) sidecarDisplayFeature, (Object) sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.areEqual((Object) sidecarDisplayFeature.getRect(), (Object) sidecarDisplayFeature2.getRect());
    }

    /* renamed from: c */
    public final boolean mo62917c(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!mo62916b(list.get(i), list2.get(i))) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo62918d(@C12580l SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @C12580l SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (Intrinsics.areEqual((Object) sidecarWindowLayoutInfo, (Object) sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C21033a aVar = f54235b;
        return mo62917c(aVar.mo62924c(sidecarWindowLayoutInfo), aVar.mo62924c(sidecarWindowLayoutInfo2));
    }

    @C12579k
    /* renamed from: e */
    public final C21073t mo62919e(@C12580l SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @C12579k SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new C21073t(CollectionsKt__CollectionsKt.m40441E());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C21033a aVar = f54235b;
        aVar.mo62925d(sidecarDeviceState2, aVar.mo62923b(sidecarDeviceState));
        return new C21073t(mo62920f(aVar.mo62924c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    @C12579k
    /* renamed from: f */
    public final List<C21045g> mo62920f(@C12579k List<SidecarDisplayFeature> list, @C12579k SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter(list, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature g : list) {
            C21045g g2 = mo62921g(g, sidecarDeviceState);
            if (g2 != null) {
                arrayList.add(g2);
            }
        }
        return arrayList;
    }

    @C12580l
    /* renamed from: g */
    public final C21045g mo62921g(@C12579k SidecarDisplayFeature sidecarDisplayFeature, @C12579k SidecarDeviceState sidecarDeviceState) {
        C21059m.C21061b bVar;
        C21052l.C21057c cVar;
        Intrinsics.checkNotNullParameter(sidecarDisplayFeature, C35567m.f87870w);
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "deviceState");
        SpecificationComputer.C20989a aVar = SpecificationComputer.f54137a;
        String str = f54236c;
        Intrinsics.checkNotNullExpressionValue(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) SpecificationComputer.C20989a.m97129b(aVar, sidecarDisplayFeature, str, this.f54237a, (C20997f) null, 4, (Object) null).mo62745c("Type must be either TYPE_FOLD or TYPE_HINGE", SidecarAdapter$translate$checkedFeature$1.f54238f).mo62745c("Feature bounds must not be 0", SidecarAdapter$translate$checkedFeature$2.f54239f).mo62745c("TYPE_FOLD must have 0 area", SidecarAdapter$translate$checkedFeature$3.f54240f).mo62745c("Feature be pinned to either left or top", SidecarAdapter$translate$checkedFeature$4.f54241f).mo62743a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVar = C21059m.C21061b.f54301b.mo62995a();
        } else if (type != 2) {
            return null;
        } else {
            bVar = C21059m.C21061b.f54301b.mo62996b();
        }
        int b = f54235b.mo62923b(sidecarDeviceState);
        if (b == 0 || b == 1) {
            return null;
        }
        if (b == 2) {
            cVar = C21052l.C21057c.f54295d;
        } else if (b == 3) {
            cVar = C21052l.C21057c.f54294c;
        } else if (b == 4) {
            return null;
        } else {
            cVar = C21052l.C21057c.f54294c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        Intrinsics.checkNotNullExpressionValue(rect, "feature.rect");
        return new C21059m(new C20992b(rect), bVar, cVar);
    }

    public SidecarAdapter(@C12579k SpecificationComputer.VerificationMode verificationMode) {
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f54237a = verificationMode;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SidecarAdapter(SpecificationComputer.VerificationMode verificationMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SpecificationComputer.VerificationMode.QUIET : verificationMode);
    }
}
